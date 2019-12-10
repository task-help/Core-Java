public class thisKeyword_more {

    public static void main(String[] args) {
        rectShape2 r1 = new rectShape2();

        rectShape2 r2 = new rectShape2();

    }
}




class rectShape2{

    int length;
    int breadth;

    public rectShape2(){
        this(10, 20);
    }

    public rectShape2(int breadth, int length){
        this.length = length;
        this.breadth = breadth;

    }
}
