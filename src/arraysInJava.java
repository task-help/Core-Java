import java.util.ArrayList;

public class arraysInJava {

    public static void main(String[] args) {


        String[] strArray = {"India", "usa", "china"};
        strArray[1] = "North Korea";

        for(String s : strArray){
            System.out.println(s);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("India");
        list.add("usa");
        list.add("china");
        list.add(1,"North Korea");

        System.out.println( list.get(0));
        System.out.println( list.remove(1));
        System.out.println( list.contains("India"));
        list.clear();
        System.out.println(list);

        for(String s: list){
            System.out.println(s);
        }
    }
}
