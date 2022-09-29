import java.util.*;

public class TestArrayList {

    public static void main(String[] args){

        ArrayList <String> fruits = new ArrayList();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pinapple");
        fruits.add("grapes");

        System.out.println(fruits);

        Iterator itr=fruits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(String fruit:fruits)
            System.out.println(fruit);


    }


}
