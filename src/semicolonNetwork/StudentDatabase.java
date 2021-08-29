package semicolonNetwork;


import java.util.*;

public class StudentDatabase {

    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        Student student;
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to Queen College!!!!! Press 1 to Begin");
            int userInput = scanner.nextInt();
            while (userInput != -1) {


                System.out.print("Please Enter your FirstName: ");
                String firstName = scanner.next();
                System.out.print("Please Enter your LastName: ");
                String lastName = scanner.next();
                    age = scanner.nextInt();
                System.out.print("Please Enter your Sex: ");
                String sex = scanner.next();
                System.out.print("Please Enter your Email: ");
                String email = scanner.next();
                System.out.print("Please Enter your PhoneNumber: ");
                String phoneNumber = scanner.next();
                System.out.print("Please Enter your Id: ");
                int id = scanner.nextInt();

                student = new Student(firstName, lastName, age, sex, email, phoneNumber, id);
                students.put(id, student);

                System.out.println("Press 1 to enter Student Details OR -1 to exit to exit");
                userInput = scanner.nextInt();
            }
            System.out.println(students);
        }
        catch (InputMismatchException exception) {
            System.out.println("Wrong input, Please try again");
        }
        
    }
}