package inheritencePoly; //Package its in

public class Person {

        protected String name;

        //constructor
        public Person(String name) {
            this.name = name;
        }
            //Says hello with constructor
        public void sayHello( ) {
            System.out.println("[Person Class] Hello from " + name + "!");
        }

        public static void  main(String[] args) {
                    //Creates new person with name of Mario
                Person a = new Person("Mario");
                a.sayHello();
        }
}
