 public class test {
     class Person {
         public String firstName;
         public String lastName;


         public String sayHello() {
             return String.format("Hello from %s %s!", firstName, lastName);
         }

         public void main(String[] args) {
             Person rick = new Person();
             rick.firstName = "Rick";
             rick.lastName = "Sanchez";
             System.out.println(rick.sayHello());
             // prints "Hello from Rick Sanchez!"
         }
     }
}