public class Main {
    static String classLevelVariable = "This is a class level variable";
    //Methods
    public static void main(String[] args){ //The entry point of the Java APP (Add static & main to run)
        BuildSimpleCalculator calculator = new BuildSimpleCalculator();
        int sum = calculator.add(10, 5);
        System.out.println(sum);
        int difference = calculator.subtract(10, 5);
        System.out.println(difference);


        /*
        System.out.println("Hello World!"); //like console.log
        Greeting greeting = new Greeting(); //Create instance (object) of the Greeting class (class name & the object creation must match)
        greeting.hello(); // combines the two class using their methods


        Messenger messenger = new Messenger();
        messenger.sendMessage();

         */

        //Variables
        String greeting = "Hello World!";
        int number = 5;
        boolean isJavaFun = true;

        System.out.println(greeting);

        displayMessage();
        System.out.println(classLevelVariable);

    }
    //Method (class level can be access from anywhere within the class under local)
    public static void displayMessage() {
        String localMessage = "This is a local variable";
        System.out.println(localMessage);
        System.out.println(classLevelVariable);

    }
}
