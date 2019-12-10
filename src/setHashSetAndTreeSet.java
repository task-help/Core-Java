import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setHashSetAndTreeSet {

    public static void main(String[] args) {


        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(23);
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(10);

        for(int element :hashSet){
            System.out.println(element);
        }

    //    hashSet.isEmpty();
    //    hashSet.contains(10);
    //    hashSet.remove(23);
    //    hashSet.clear();

        System.out.println();

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(23);
        treeSet.add(4);
        treeSet.add(4);
        treeSet.add(4);
        treeSet.add(10);
        treeSet.add(1);

        for(int element : treeSet){
            System.out.println(element);
        }


    }
}
