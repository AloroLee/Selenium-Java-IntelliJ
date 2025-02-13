public class MethodsReturn {

    public static void main(String[] args){
//        String greeting = getGreeting();
//        System.out.println(greeting);
        System.out.println(getGreeting());

//        int result = addNumber(2,3);
//        System.out.println(result);
        System.out.println(addNumber(2, 3));
    }

    public static String getGreeting(){
        return "Hello";
    }

    public static int addNumber(int number1, int number2){
        return number1 + number2;
    }
}

