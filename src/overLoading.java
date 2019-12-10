public class overLoading {

    public static void main(String[] args) {

        isEven(2);
        isEven(3);
    }

    private static void isEven(int num){
        if(num % 2 == 0){
            System.out.println(num +" is even");
        }else
        {
            System.out.println(num+" is odd");
        }

    }
}
