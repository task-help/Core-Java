
 public class constructor_Overloading {

    public static void main(String[] args) {

        rectangle1 r1 = new rectangle1();
        r1.setBreadth(10);
        r1.setLength(20);

        System.out.println(r1.getArea());

        rectangle1 r2 = new rectangle1(20.0f, 10.0f);
        r2.setLength(30.0f);
        System.out.println(r2.getArea());

    }

}

class rectangle1{
    private float length;
    private float breadth;

    public rectangle1(){

    }

    public rectangle1(float a, float b){
        this.length = a ;
        this.breadth = b;
    }

    public float getLength() {

        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {

        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getArea(){
        float area = length * breadth;
        return area;
    }

    public float getPerimeter(){
        float p = 2 * (length + breadth);
        return p;
    }

}



