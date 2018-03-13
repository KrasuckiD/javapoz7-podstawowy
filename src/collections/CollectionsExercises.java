package collections;

import oop.User;
import oop.bookstore.Author;
import oop.bookstore.Book;

import java.util.*;

public class CollectionsExercises {
    public static void main(String[] args) {
      //  uniqueNumberFromUser();
        usersDatabas();




//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(5);
//        list.add(8);
//        list.add(10);
//        randomUnique(list);
//        Iterator <Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }




    // metoda zwracajaca randomowo kolejnosc elementow listy

    public static void randomUnique(List<Integer> numbers) {
        List<Integer> tmpList = new ArrayList<>(numbers);
        Random random = new Random();
        for (int i = 0; i < numbers.size(); i++) {
            int index = random.nextInt(tmpList.size());
            System.out.println(tmpList.remove(index));
        }

    }

    //pobieramy od usera n liczb i wyswietlamy tylko unikalne
    public static void uniqueNumberFromUser (){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Insert number of elements");
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int nextValue = scanner.nextInt();
            set.add(nextValue);
        }
        Iterator<Integer> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    //utworzyc mape pesel dla usera

    public static void usersDatabas(){
    Map<String, User> userDatabase = new HashMap<>();
    userDatabase.put("12345", new User("D", "K"));
        userDatabase.put("12346", new User("A", "K"));
        userDatabase.put("12347", new User("S", "K"));
        userDatabase.put("12348", new User("F", "K"));
        Set<Map.Entry<String, User>> entries = userDatabase.entrySet();
        Iterator<Map.Entry<String, User>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, User> next = iterator.next();
            System.out.println(next.getKey() + " : " + next.getValue());
        }



    }
    //mapa autor z lista ksiazek
    public static void boockStore(){
        Map<Author, List<Book>> bookstore = new HashMap<>();
        bookstore.put(new Author("Miskiewicz"),
                Arrays.asList
                        (new Book("Dziady", 1802),
                        new Book("Dziady 2", 1804))
                );
        bookstore.put(new Author("Slowacki"), Arrays.asList(new Book("Chlopi", 1900)));

        Set<Map.Entry<Author, List<Book>>> bookstorSet = bookstore.entrySet();
        for (Map.Entry<Author, List<Book>> authorListEntry : bookstorSet) {
            List<Book> books = authorListEntry.getValue();
            for (Book book : books) {
                if (book.getReleaseYear() > 1801);
            }
        }
    }

}
