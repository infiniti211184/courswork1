import java.lang.reflect.Array;
import java.util.Arrays;

public class Easy {
    import java.lang.reflect.Array;
import java.util.Arrays;

    public class Easy {
        private static Employee[] employees = new Employee[10];

        public static void main(String[] args) {
            String name;
            String lastName;
            String middleMame;
            Employee emp1 = Employee( name: "Василий", lastName: "Иванович", middleMame: "Иванов", departament: 1, salary: 112000);
            Employee emp2 = Employee( name: "Василий", lastName: "Иванович", middleMame: "Иванов", departament: 1, salary: 112000);

            employees[0] = emp1;
            employees[1] = emp2;
            Employee[] emp = Array.copyOf(employees, newLength 11);

            Arrays.stream(emp).forEach(System.out: :println);
            System.out.println(emp.length) {
                employees[i] = null;
            }
            //
            employees = Arrays.copyOf(employees, employees.length + 1);
        }

        public static boolean addEmployee(Employee employee){
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employee);
            }
        }
        public static int calculateTotalSalary[]

        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSelary();
        }
        return sum;

    }
}
}
