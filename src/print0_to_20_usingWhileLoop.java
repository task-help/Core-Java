public class print0_to_20_usingWhileLoop {
    public static void main(String[] args) {
        int i = 20;
        while(i>=1){
            if(i%2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
