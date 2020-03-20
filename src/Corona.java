import java.util.LinkedList;

public class Corona {
    CoronaAPI coronaAPI = new CoronaAPI();

    void run() {
        coronaAPI.getStats("CZ", 10650000);
        coronaAPI.getStats("CN", 1386000000);
        coronaAPI.getStats("IT", 60480000);
        coronaAPI.getStats("KR" ,51470000);
        coronaAPI.getStats("IR", 81160000);
    }

    public static void main(String[] args) {
        Corona cr = new Corona();

        cr.run();
    }
}
