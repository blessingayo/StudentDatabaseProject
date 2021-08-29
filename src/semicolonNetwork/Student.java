package semicolonNetwork;


import java.util.ArrayList;
import java.util.List;

public class Student {
    List<Student> students = new ArrayList<>();


    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String email;
    private String phoneNumber;
    private int id;

    public Student(String firstName, String lastName, int age, String sex, String email, String phoneNumber, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age)throws ArithmeticException {
        if (age > 18){
            throw new ArithmeticException("You are Older Than 18years");
        }else{
            System.out.println("Access granted: ");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                "}\n";
    }

    public void studentDatabase(Student student) {
        students.add(student);
        System.out.println(student);
    }
}