public class parameter {
    public static void main(String[] args) {
        String personalized = mygreet();
        System.out.println(personalized);
        String personalized1 = mygreet1("calling second funtion");

        System.out.println(personalized1);
    }

    static String mygreet() {

        return "Hello MY Greeting people";

    }

    static String mygreet1(String a ) {
        String mg = " new msg";
        System.out.println(mg + "  "+ a);
        return mg;
    }
}