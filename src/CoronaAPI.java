import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CoronaAPI {
    public void getStats(String countryCode, int population) {
        String name;
        int infected;
        int dead;
        int cured;

        try {
            String url = "https://thevirustracker.com/free-api?countryTotal=" + countryCode;

            HttpURLConnection httpClient =
                    (HttpURLConnection) new URL(url).openConnection();

            httpClient.setRequestProperty("User-Agent", "Mozilla/5.0");

            System.out.println(httpClient.getResponseCode());
            System.out.println(httpClient.getContentType());
            if (httpClient.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream input = httpClient.getInputStream();

                ObjectMapper objectMapper = new ObjectMapper();

                JsonNode jsonNode = objectMapper.readTree(input);

                name = jsonNode.get("title").asText();
                infected = jsonNode.get("total_cases").asInt();
                dead = jsonNode.get("total_recovered").asInt();
                cured = jsonNode.get("total_deaths").asInt();

                Country result = new Country(name, population, infected, dead, cured);

                System.out.println(result.getName() + ":\n\tpopulation: " + result.getPopulation() + "\n\tinfected: " + result.getInfected() + "\n\tdeaf: " + result.getDead() + "\n\tcured: " + result.getCured() + "\n\tpercent infected: " + result.getPercentInfected() + "%\n\tpercent dead: " + result.getPercentDead() + "%");

            } else {
                System.out.println("GET request not worked");
            }

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

//    public static void main(String[] args) throws Exception {
//
//        CoronaAPI obj = new CoronaAPI();
//
//        System.out.println("Testing 1 - Send Http GET request");
//
//
//    }

}
