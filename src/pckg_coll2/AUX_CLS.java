package pckg_coll2;

import pckg_robot.Robot;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {
    private static final int MAXI = 100;
    public static void addNewUser(User user, HashMap<Integer, String> users){
        if(users.containsKey(user.getUserID())){
            System.out.println("User already in this map!");
        } else{
            users.put(user.getUserID(), user.getUserName());
            System.out.println("New user added to map!");
        }
    }
    public static <K, V>  void listAllMapElements(HashMap<K, V> map){
        System.out.println("------------------------------------------------------------------");
        for(K key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
    public static <K, V> void listAllMapElementsNew(HashMap<K, V> map){
        System.out.println("------------------------------------------------------------------");
        for(Map.Entry<K, V> entryset : map.entrySet()){
            System.out.println("Key: " + entryset.getKey() + " Value: " + entryset.getValue());
        }
    }
    public static <E> void addElementToSet(E element, Set<E> elements){
        if(elements.add(element)){
            System.out.println("New element added to a set...");
        } else{
            System.out.println("Element already in set...");
        }
    }
    public static <E> void listSetElements(Set<E> elements){
        System.out.println("------------------------------------------------------------------");
        for(E element : elements){
            System.out.println(element);
        }
    }
    public static <E> void removeElementFromSet(Set<E> elements, E elementToRemove){
        if(elements.remove(elementToRemove)){
            System.out.println("Removed element: " + elementToRemove);
        } else{
            System.out.println("There is no such element in set...");
        }
    }
    public static <K, V> void addRobotToMap(Map<K, V> map, K key, V value){
        if(map.containsKey(key)){
            System.out.println("This one is already in map...");
        } else{
            map.put(key, value);
            System.out.println("New robot added to a map...");
        }
    }
    private static int getRandomGrade(){
        return ThreadLocalRandom.current().nextInt(0, MAXI);
    }
}
