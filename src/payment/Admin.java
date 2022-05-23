package payment;

import java.sql.Struct;
import java.util.ArrayList;

public class Admin extends User{
    private double salary;
    private String password = "12345";
    private static ArrayList<Student> studentsDB = new ArrayList<>();
    private static ArrayList<Admin> adminsDB = new ArrayList<>();

    public static void addAdmin(Admin admin){
        adminsDB.add(admin);
    }
    public static void deleteAdmin(int id){
        while (!searchAdmin(id)){
            System.out.println("Not found");
            System.out.println("Want to try again ?");
            String answer = sc.next();
            if(answer.toLowerCase().startsWith("y")){
                System.out.println("Enter ID: ");
                id = sc.nextInt();
            }
            else return;
        }
        for(Admin admin : adminsDB){
            if(admin.getID() == id){
                adminsDB.remove(admin);
                return;
            }
        }
    }
    public Admin(String name,double age, String email, String phoneNumber) {
        super(name, age, email, phoneNumber);
        this.salary = 1500;
    }

//    Overloaded methods
    public static boolean searchAdmin(int id) {
        for(Admin admin : adminsDB){
            if(admin.getID() == id)return true;
        }
        return  false;
    }
    public static boolean searchStudent(int id) {
        for(Student student: studentsDB){
            if(student.getID() == id)return true;
        }
        return false;
    }
    public Admin(String name,double age, String email, String phoneNumber,double salary) {
        super(name, age, email, phoneNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void addStudent(Student student){
        studentsDB.add(student);
    }
    public static void deleteStudent(int id){
        while (!searchStudent(id)){
            System.out.println("Not found");
            System.out.println("Want to try again ?");
            String answer = sc.next();
            if(answer.toLowerCase().startsWith("y")){
                System.out.println("Enter ID: ");
                id = sc.nextInt();
            }
            else return;
        }
            for (Student student : studentsDB) {
                if (student.getID() == id) {
                    studentsDB.remove(student);
                    return;
                }
            }

    }
    public void editStudent(int id,Student student){
        while (!searchStudent(id)){
            System.out.println("Not found");
            System.out.println("Want to try again ?");
            String answer = sc.next();
            if(answer.toLowerCase().startsWith("y")){
                System.out.println("Enter ID: ");
                id = sc.nextInt();
            }
            else return;
        }
            for (Student student1 : studentsDB) {
                if (student1.getID() == id) {
                    student1 = new Student(student);
                    return;
                }
            }


    }
    public static void showStudentsList(){
        for(Student student: studentsDB){
            System.out.println();
            student.printUser();
        }
    }
    @Override
    public void userOperations(){
        System.out.printf("Welcome, %s%n",this.getName());
        boolean finished = false;
        while (!finished) {
            System.out.println("Here are some operations you can do");
            System.out.println("""
                    1. Add student
                    2. Delete student
                    3. Edit student data
                    4. Show all students
                    Note: answer by numbers
                    """);
            int answer = sc.nextInt();
            switch (answer) {
                case 1:
                    Student student = new Student();
                    student.studentRegistration();
                    addStudent(student);
                    finished = true;
                    break;
                case 2:
                    System.out.println("Enter student ID: ");
                    int id = sc.nextInt();
                    deleteStudent(id);
                    finished = true;
                    break;
                case 3:
                    System.out.println("Enter student ID: ");
                    id = sc.nextInt();
                    student = new Student();
                    System.out.println("Fill in this form with the new data: ");
                    student.studentRegistration();
                    editStudent(id,student);
                    finished = true;
                    break;
                case 4:
                    showStudentsList();
                    finished = true;
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
            if(finished){
                System.out.println("Want another operation?");
                String choice = sc.next();
                if(choice.toLowerCase().startsWith("y"))finished = false;
            }
        }
    }

    @Override
    public void printUser() {

    }
}
