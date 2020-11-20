package singleton.case1.step3;

public class Database {
    private static Database singleton = new Database("products");
    private String name;

    public String getName() {
        return name;
    }

    private Database(String name) {
//        this.name = name;
        try {
            Thread.sleep(100);
            this.name = name;
        } catch (Exception e) {

        }
    }

    public static Database getInstance(String name) {
        return singleton;
    }
}
