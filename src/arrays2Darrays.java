public class arrays2Darrays {

    public static void main(String[] args) {

        int[][] arrays2D = {
                {2, 45, 6, 32 },
                {4, 65, 34, 9},
                {7, 8, 12, 5}
             };
        System.out.println(arrays2D.length);

        int sum = 0;
        for(int r = 0; r <arrays2D.length; r++){

            for(int c = 0; c < arrays2D[r].length; c++){
                System.out.print(arrays2D[r][c] + " ");

                sum = sum + arrays2D[r][c];
            }
            System.out.println();

        }
        System.out.println(sum);
    }
}
