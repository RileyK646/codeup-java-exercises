package inheritencePoly;

public class Employee extends Person{

            public String jobTitle;
        public Employee(String employeeName, String title) {
            //regerenceing "Person" class in directory
            super(employeeName);

            this.jobTitle = title;
        }

        public static void main(String[] args) {
                                                //add two parameters for both attributes
            Employee y = new Employee("Riley", "janitor");
            System.out.println("employee file name is  " + y.name + " and their job is " + y.jobTitle);

        }

}
