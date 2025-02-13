public class VariableAssignment {

    public static void main (String[] args){
        String name = "Lee";
        int age = 30;

        printName(name);
        printAge(age);
    }

    public static void printName(String name) {
        System.out.print("Hello, " + name);
    }

    public static void printAge(int age) {
        System.out.print(" You are " + age + "years old");
    }
}
