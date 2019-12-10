import java.util.Arrays;

public class arraysOperationsJava {

    public static void main(String[] args) {

       int[] firstSet = {1, 4, 12, 47, 10};
       int[] secondSet = new int[5];
        secondSet[0] = 1;
        secondSet[1] = 4;
        secondSet[2] = 7;
        secondSet[3] = 5;
        secondSet[4] = 10;

        for(int i = 0; i< firstSet.length; i++){
            System.out.println(firstSet[i]);
        }

        System.out.println();

        int[] testArray = secondSet;
        testArray[2] = 83;

        int[] testArray1 = Arrays.copyOf(secondSet, secondSet.length);


        for(int num : secondSet){
            System.out.println(num);
        }

        for(int num : testArray1){
            System.out.println(num);
        }


;    }
}
