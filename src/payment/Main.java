package payment;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Admin admin1 = new Admin("Admin1",20,"m3@gmail.com","1111");
        admin1.setPassword("AAA333#2");
        Admin.addAdmin(admin1);
        boolean finished = false;
        System.out.println("Welcome To FCAI - USC");
        while (!finished){
//            System.out.println("Are you an admin or a student?");
//            String answer = sc.next();
//            if(answer.toLowerCase().startsWith("ad")){
//                if(!answer.equalsIgnoreCase("admin")) {
//                    System.out.println("Did you mean admin ?");
//                    answer = sc.next();
//                    if (answer.toLowerCase().startsWith("y")) {
//                        admin1.operations();
//                    } else continue;
//                }else{
//                    admin1.operations();
//                }
//            }else if(answer.toLowerCase().startsWith("st")){
//                if(!answer.equalsIgnoreCase("student")) {
//                    System.out.println("Did you mean student ?");
//                    answer = sc.next();
//                    if (answer.toLowerCase().startsWith("y")) {
//                        Student student1 = new Student();
//                        student1.studentRegistration();
//                        Admin.addStudent(student1);
//                        student1.operations();
//                    } else continue;
//                }else{
//                    Student student1 = new Student();
//                    student1.studentRegistration();
//                    Admin.addStudent(student1);
//                    student1.operations();
//                }
//            }else{
//                System.out.println("Please choose a proper answer");
//            }
        }
    }

}
