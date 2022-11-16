public class Person {
    private String name;
    public String getName(){
//TODO: return the person's name
        return String.format(name);
    }
    public void sayHello(String name){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello %s",name);
    }
    public void setName(String name){
//TODO: change the name field to the passed value
        Person riley = new Person();
        riley.name = "Riley King";
        // prints "Hello from Rick Sanchez!"
        sayHello(name);
    }

}