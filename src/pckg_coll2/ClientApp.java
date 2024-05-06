package pckg_coll2;

import com.sun.source.tree.Tree;
import pckg_robot.Robot;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ClientApp {
    public static void main(String[] args) {
//        User user1 = new User("user-name-1", "passwordStrong", 15);
//        User user2 = new User("user-name-2", "anotherStrong", 100);
//        User user3 = new User("user-name-3", "strongPassword", 345);
//        HashMap<Integer, String> users = new HashMap<>();
//        AUX_CLS.addNewUser(user1, users);
//        AUX_CLS.addNewUser(user1, users);
//        AUX_CLS.addNewUser(user2, users);
//        AUX_CLS.addNewUser(user3, users);
//        AUX_CLS.listAllMapElements(users);
//        AUX_CLS.listAllMapElementsNew(users);
//
//        HashSet<String> hSet = new HashSet<>();
//        LinkedHashSet<String> lSet = new LinkedHashSet<>();
//        TreeSet<String> tSet = new TreeSet<>();
//
//        AUX_CLS.addElementToSet("Otvoreni", hSet);
//        AUX_CLS.addElementToSet("Kod", hSet);
//        AUX_CLS.addElementToSet("Linux", hSet);
//        AUX_CLS.addElementToSet("Kripto", hSet);
//
//        AUX_CLS.addElementToSet("Otvoreni", lSet);
//        AUX_CLS.addElementToSet("Kod", lSet);
//        AUX_CLS.addElementToSet("Kod", lSet);
//        AUX_CLS.addElementToSet("Linux", lSet);
//        AUX_CLS.addElementToSet("Kripto", lSet);
//
//        AUX_CLS.addElementToSet("Otvoreni", tSet);
//        AUX_CLS.addElementToSet("Kod", tSet);
//        AUX_CLS.addElementToSet("Linux", tSet);
//        AUX_CLS.addElementToSet("Kripto", tSet);
//
//        AUX_CLS.listSetElements(hSet);
//        AUX_CLS.listSetElements(lSet);
//        AUX_CLS.listSetElements(tSet);
//
//        AUX_CLS.removeElementFromSet(tSet, "Linux");
//        AUX_CLS.removeElementFromSet(tSet, "Linuxx");
//        AUX_CLS.listSetElements(hSet);
//        AUX_CLS.listSetElements(lSet);
//        AUX_CLS.listSetElements(tSet);
        HashSet<Robot> robots = new HashSet<>();
        AUX_CLS.addElementToSet(new Robot("flying robot"), robots);
        AUX_CLS.addElementToSet(new Robot("weird robot"), robots);
        AUX_CLS.addElementToSet(new Robot("cleaning robot"), robots);
        AUX_CLS.addElementToSet(new Robot("thinking robot"), robots);
        AUX_CLS.listSetElements(robots);

        HashMap<Robot, Integer> robotsMap = new HashMap<>();
        AUX_CLS.addRobotToMap(robotsMap, new Robot("flying robot"),1 );
        AUX_CLS.addRobotToMap(robotsMap, new Robot("weird robot"), 2);
        AUX_CLS.addRobotToMap(robotsMap, new Robot("cleaning robot"), 3);
        AUX_CLS.addRobotToMap(robotsMap, new Robot("thinking robot"),4);

        AUX_CLS.listAllMapElements(robotsMap);
    }
}
