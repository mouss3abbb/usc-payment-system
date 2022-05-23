package payment;


public class Student extends User{
    private int level;
    private boolean haveSiblings;
    private String department;

    @Override
    public void printUser(){
        System.out.printf("%s%n%f %s %d\n",this.getName(),this.getAge(),this.getDepartment(),this.getLevel());
        System.out.printf("%s %s ",this.getPhoneNumber(),this.getEmail());
        if(this.isHaveSiblings()) System.out.println("yes");
        else System.out.println("no");
    }
    public Student(String name, double age, String email, String phoneNumber, int level, boolean haveSiblings, String department) {
        super(name, age, email, phoneNumber);
        this.level = level;
        this.haveSiblings = haveSiblings;
        this.department = department;
    }

    public Student(Student student){
        this(student.getName(),student.getAge(),student.getEmail(),student.getPhoneNumber(),student.getLevel(),student.isHaveSiblings(),student.getDepartment());
    }
    public Student(){}

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isHaveSiblings() {
        return haveSiblings;
    }

    public void setHaveSiblings(boolean haveSiblings) {
        this.haveSiblings = haveSiblings;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void studentRegistration(){
        System.out.println("Welcome to student registration form");
        System.out.println("Please fill out all these fields");
        System.out.println("Name: ");
        String name = sc.nextLine();
        this.setName(name);
        System.out.println("Age: ");
        double age = sc.nextDouble();
        this.setAge(age);
        System.out.println("Email: ");
        String email = sc.next();
        this.setEmail(email);
        System.out.println("Phone Number: ");
        String phoneNumber = sc.next();
        this.setPhoneNumber(phoneNumber);
        System.out.println("Level: ");
        int level = sc.nextInt();
        this.setLevel(level);
        System.out.println("Department: ");
        String department = sc.next();
        this.setDepartment(department);
        System.out.println("Do you have siblings in the college ?");
        String answer = sc.next();
        this.setHaveSiblings(answer.toLowerCase().startsWith("y"));
    }
    @Override
    public void userOperations(){

    }
}
