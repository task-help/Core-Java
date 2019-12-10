public class callByValue_callByReference {

    public static void main(String[] args) {

        shape r1 =  new shape();
        r1.length = 10.0f;
        modify(r1);
        System.out.println(r1.length);


    }

    public static void modify(shape r2){
        r2.length = 40;
        System.out.println(r2.length);
    }
}


class shape{
     float length;
     float breadth;


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

