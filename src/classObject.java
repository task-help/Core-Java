public class classObject {

    public static void main(String[] args) {

        rectangle r1 = new rectangle();
        r1.setBreadth(10);
        r1.setLength(20);

        rectangle r2 = r1;
        r2.setLength(50);
        r2.setBreadth(100);


        System.out.println(r1.getBreadth());
        System.out.println(r1.getLength());
    }

}

class rectangle{
    private float length;
    private float breadth;

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

    public float getAea(){
      float area = length * breadth;
      return area;
    }

    public float getPerimeter(){
        float p = 2 * (length + breadth);
        return p;
    }

}
