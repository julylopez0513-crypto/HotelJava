package application.util;

import application.domain.Person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("jd@gmail.com");

        person.setId(1);
        person.setName("Jhon");
        person.setLastName("Doe");
        //person.setEmail("jd@gmail.com");
        person.setPassword("12233456");
        person.setState(true);


        System.out.println(person.getId());
        System.out.println(person.getName());


    }
}
