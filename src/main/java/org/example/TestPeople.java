package org.example;

public class TestPeople {
    public static void main(String args[]) {
        Person aPerson;
        Bay jimmy;
        Gyal betty;
        aPerson = new Person("Fred");
        jimmy = new Bay();
        betty = new Gyal("Betty");

        // Boy b = new Person();  // Throw Error
        // Girl g = new Person()  // Throw Error
        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        System.out.println((Person)jimmy);
        System.out.println(((Person)jimmy).talk());
        System.out.println(((Person)jimmy).walk());
        System.out.println();

        System.out.println((Person)betty);
        System.out.println(((Person)betty).talk());
        System.out.println(((Person)betty).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Bay.lifeSpan());
        System.out.println(Gyal.lifeSpan());

        System.out.println(((Bay)aPerson).talk());
    }
}


