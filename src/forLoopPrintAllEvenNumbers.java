public class forLoopPrintAllEvenNumbers {

    public static void main(String[] args) {

        for(int i = 1; i<= 20; i++){
            int remainder = i % 2;
            if(remainder == 0){
                System.out.println(i);
            }
        }

    }
}
