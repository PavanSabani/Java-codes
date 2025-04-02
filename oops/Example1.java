package oops;

class Person{

    private int age;
    private String name;
    private String contactNumber;

    public Person(int age, String name, String contactNumber) {
        this.age = age;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + ", contactNumber=" + contactNumber + "]";
    } 
}

class Employee extends Person{

    private double salary;
    private String emplyeeID;
    private String department;

    public Employee(int age, String name, String contactNumber, double salary, String emplyeeID, String department) {
        super(age, name, contactNumber);
        this.salary = salary;
        this.emplyeeID = emplyeeID;
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getEmplyeeID() {
        return emplyeeID;
    }
    public void setEmplyeeID(String emplyeeID) {
        this.emplyeeID = emplyeeID;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nEmployee [salary=" + salary + ", emplyeeID=" + emplyeeID + ", department=" + department + "]";
    }
    public final double getAnnualSalary(){
        return salary*12;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        if (emplyeeID == null) {
            if (other.emplyeeID != null)
                return false;
        } else if (!emplyeeID.equals(other.emplyeeID))
            return false;
        if (department == null) {
            if (other.department != null)
                return false;
        } else if (!department.equals(other.department))
            return false;
        return true;
    }
    
}

class Manager extends Employee{

    private int teamsize;

    public Manager(int age, String name, String contactNumber, double salary, String emplyeeID, String department,
            int teamsize) {
        super(age, name, contactNumber, salary, emplyeeID, department);
        this.teamsize = teamsize;
    }

    public int getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(int teamsize) {
        this.teamsize = teamsize;
    }

    @Override
    public String toString() {
        return super.toString()+"\nManager [teamsize=" + teamsize + "]";
    }
    
}

public class Example1 {
    public static void main(String[] args) {

        Employee employees[]=new Employee[3];

        employees[0]=new Employee(21, "Pavan", "8208193860", 60000, "2BL22CS149", "CSE");
        employees[1]=new Employee(20, "Siddu", "9988776655", 40000, "2BL22CS171", "CSE");
        employees[2]=new Employee(22, "Raghu", "1122334455", 80000, "2BL22CS134", "CSE");

        Manager manager = new Manager(35, "Praveen", "7766554433", 100000, "2BL22IS027", "XYZ", 3);

        System.out.println("Manager Details:");
        System.out.println(manager.getAnnualSalary());

        // Print employess with salary greater than 50000
        for(Employee e:employees){
            if(e.getSalary()>50000){
                System.out.println(e.getName()+":"+e.getSalary());
            }
        }

        System.out.println("Annaul salaries of Employees:");
        for(Employee e:employees){
            System.out.println("Annual salary of "+e.getName()+":"+e.getAnnualSalary());
        }

        Employee emp1 = employees[0];
        Employee emp2 = employees[1];

        // compare two employees
        if(emp1.equals(emp2)){
            System.out.println("They are same employees:");
        }else{
            System.out.println("They are differnet");
        }

    }
}