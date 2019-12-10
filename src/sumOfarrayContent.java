public class sumOfarrayContent {

    public static void main(String[] args) {

        int[] secondSet = new int[5];
        secondSet[0] = 1;
        secondSet[1] = 4;
        secondSet[2] = 7;
        secondSet[3] = 5;
        secondSet[4] = 10;

      int sum1 = 0;
        for(int i = 0; i< secondSet.length; i++){
           sum1 = sum1  + secondSet[i];

        }
        System.out.println(sum1);

    }
}
