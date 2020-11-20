package singleton.case1.step3;

public class TestPattern1 {
    public static void main(String[] args) {
        Database database;
        database = Database.getInstance("first Database");
        System.out.println("This is the " + database.getName());

        database = Database.getInstance("second Database");
        System.out.println("This is the " + database.getName());

        Database database1 = database;

        String name1 = "test1";
        String name2 = "test2";
        String name3 = name1;

        System.out.println(database.getName());
        System.out.println(database1.getName());

    }
}
