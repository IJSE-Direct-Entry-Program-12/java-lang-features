package lk.ijse.dep12.iterable;

import java.util.Iterator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        // For Each, Enhanced For Loop
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("========================");
        List<String> nameList = List.of("Kasun", "Nuwan", "Supun",
                "Ruwan", "Upul");
        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println("========================");
        var customer = new Customer("C001", "Kasun Sampath",
                new String[]{"011-1234567", "077-1234567", "022-1234567"});
//        for(String contact: customer){
//            System.out.println(contact);
//        }
        Iterator<String> iterator = customer.iterator();
        while (true) {
            if (!iterator.hasNext()) break;
            var value = iterator.next();
            System.out.println(value);
        }
    }
}

class Customer implements Iterable<String> {
    String id;
    String name;
    String[] contactList;

    public Customer(String id, String name, String[] contactList) {
        this.id = id;
        this.name = name;
        this.contactList = contactList;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return contactList.length != i;
            }

            @Override
            public String next() {
                return contactList[i++];
            }
        };
    }
}
