import java.util.ArrayList;

public class arrayList {


        public static void main(String[] args) {



            ArrayList<rectangleArea> list = new ArrayList<>();
            rectangleArea r1 = new rectangleArea();
            rectangleArea r2 = new rectangleArea();

            list.add(r1);
            list.add(r2);
        }
}

class rectangleArea{
    float l;
    float b;
}