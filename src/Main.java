public class Employee {
    private static int counter = 0;
    private Integer id;
    private String name;
    private String lastName;
    private String middleName;
    private int department;
    private int selary;

    public Employee(String name, String lastName, String middleName, int department, int selary) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.selary = selary;
        this.id = counter++;
    }
    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public int getDepartment() { return department; }
    public Integer getId() { return this id; }

    public int getSelary() { return  selary; }

    public void setDepartment(byte department) {this.department = department; }

    public void setSelary(int selary) { this.selary = selary; }

}
