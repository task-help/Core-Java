public class print0_to_20_usingDoWhileLoop {

    public static void main(String[] args) {

        int i = 20;
        do{
            if(i % 2 == 0){
                System.out.println(i);
            }
            i--;
        }while (i>=1);
    }
}
