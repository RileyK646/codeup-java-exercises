public class Person {
     private String name;
    public String getName(){
//TODO: return the person's name
        return this.name;
    }
    public String sayHello(String name){
//TODO: print a message to the console using the person's name
       return String.format("Hello there %s", this.name);
    }
    public void setName(String name){
//TODO: change the name field to the passed value
        Person riley = new Person("riley");
        riley.name = "Riley King";
        // prints "Hello from Rick Sanchez!"
        sayHello(this.name);
    }
    //constructor
    public Person(String newname) {
        this.name = newname;
    }

    public static void  main(String[] args) {
        /*Person person1 = new Person("Test");
        Person person2 = new Person("Test 2");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);*/
/*
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);*/

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}