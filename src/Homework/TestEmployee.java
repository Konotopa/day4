package Homework;

public class TestEmployee {
    public static void main(String[] args) {
        Employee Employee1 = new Employee(1231, "Anna", "Berzinja", 1000);
        System.out.println(Employee1.toString());


        System.out.println(Employee1.getAnnualSalary());
        System.out.println(Employee1.raiseSalary(30));
        Employee1.setSalary(2000);
        System.out.println(Employee1.getSalary());
        System.out.println(Employee1.raiseSalary(30));
        System.out.println(Employee1.getName());



    }
}
