package collections;

import oop.User;

import java.util.*;

public class CollectionsTest
{

    public static void main(String[] args) {
//        linkedListExample(Arrays.asList("Jan", "Ola", "Ala"));
//
//        Set<String> test = new HashSet<>();
//        Random random = new Random();
//        Set<Integer> uniqueNumbers = new HashSet<>();
//        while (uniqueNumbers.size() < 10){
//            uniqueNumbers.add(random.nextInt(10));
//        }
//        System.out.println(uniqueNumbers.size());
//        uniqueNumbers.add(50);
//        System.out.println(uniqueNumbers.size());
//        for (Integer uniqueNumber : uniqueNumbers) {
//            System.out.println(uniqueNumber);
//        }

        Set<User> users = new HashSet<>();
        users.add(new User("Jan", "Polak"));
        users.add(new User("Ola", "Pol"));
        Map<String, User> map = new HashMap<>();
        map.put("6566521384", new User("D", "K"));
        map.put("1234", new User("D", "Cz"));
        User user = map.get("1234");
    }

    public static void linkedListExample( List <String> list) {
        for (String value : list) {
            if (value.length() > 5){
                System.out.println(value);
            }
        }

    }


}


