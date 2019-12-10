import java.util.HashMap;
import java.util.Map;

public class map_hasMap {

    public static void main(String[] args) {

        /*   KEY VALUE
        *   "red"       :   "apple"
        *   "yellow"    :   "banana"
        *   "white"     :   "radish"
        *   "green"     :   "apple"
        *  */

        Map<String, String> fruits = new HashMap<>();
        fruits.put("red","apple");
        fruits.put("yellow", "banana");
        fruits.put("white", "radish");
        fruits.put("green", "apple");

     //   fruits.containsKey("red");
     //   fruits.containsValue("apple");
     //   fruits.size();
     //   fruits.remove("red");
     //   fruits.clear();

        System.out.println(fruits.get("red"));

        for (Map.Entry pairEntry : fruits.entrySet()) {
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }
    }
}
