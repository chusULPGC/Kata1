package kata1;

import java.util.Date;

public class Kata1 {


    public static void main(String[] args) {
        Person person = new Person ("Jesús ", new Date(87,5,14));
        System.out.println(person.getName() + "tiene " + person.getAge()+" años");
    }
}
