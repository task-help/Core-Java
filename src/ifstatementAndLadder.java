public class ifstatementAndLadder {

    public static void main(String[] args) {

        int marks = 60;
        if(marks <50){
            System.out.println("fail");
        }else if (marks >= 30 && marks < 60){
            System.out.println("D grade");
        }else if(marks >= 60 && marks < 70){
            System.out.println("C grade");
        }
        else {
            System.out.println("invalid marks");
        }
    }
}
