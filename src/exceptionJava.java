public class exceptionJava {

    public static void main(String[] args) {

        System.out.println("Program starts");

        int[] intArray = {3, 9, 45, 22, 16};

        try {
            int result = intArray[1]/0;
            System.out.println(intArray[19]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException exception){
            System.out.println(exception);

        } finally {
            System.out.println("will execute regardless of exception");
        }

        try {
            String name = null;
            System.out.println(name.length());
        } catch (Exception exception){
            System.out.println(exception);
        }
        System.out.println("Program ends");

    }
}
