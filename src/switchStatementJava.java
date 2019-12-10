public class switchStatementJava {

    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {

            case 'A':
                System.out.println("Excelent. Grade A");
                break;
            case 'B':
                System.out.println("Good. Grade B");
                  break;
            case 'C':
                System.out.println("Average. Grade C");
                break;
            case 'D':
                System.out.println("Fair. Grade D");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
