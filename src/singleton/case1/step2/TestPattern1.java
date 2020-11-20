package singleton.case1.step2;

public class TestPattern1 {
    public static void main(String[] args) {
        Database database;
        database = Database.getInstance("first Database");
        System.out.println("This is the " + database.getName());

        database = Database.getInstance("second Database");
        System.out.println("This is the " + database.getName());

    }
}
