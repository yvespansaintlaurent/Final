
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //create your administrators
        Administrator p = new Administrator("David", "E432", "michaellee@gmail.com");
        p.addResponsibility("Change Course");
        p.addResponsibility("Oversee Students");

        //create your students
        Student student1 = new Student("Michael Jordan", "D241", "michaeljordan@gmail.com", "Math", 3.8);
        Student student2 = new Student("Ryan Jang", "D232", "ryanjohnson@gmail.com", "History", 3.8);

        //create professor object
        Professor professor1 = new Professor("Dr. David Johnston", "R301", "david.johnston@university.edu", "Math");
        Professor professor2 = new Professor("Dr. Emily Johnston", "R321", "david.johnston@university.edu", "History");
        
        

        //Assign courses to professors
        professor1.teachCourse("Calc 2");
        professor2.teachCourse("History 101");

        //create Researchers
        Researcher researcher = new Researcher("Bobby Davis", "R432", "Bobbydavisresearch@gmail.com", "Quantum Physics");
        researcher.addPublication("A Dive Into Quantum Physics");
        researcher.addPublication("Quantum Physics: A Quick Guide");

        //interactions
        //Administration manages students and professors
        p.manageStudent(student1);
        p.manageStudent(student2);
        p.manageProfessor(professor1);
        p.manageProfessor(professor2);
        


        //User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time of day (morning/afternoon) or 'exit' to quit: ");
        String timeOfDay = scanner.nextLine();
        while (!timeOfDay.equals("exit")) {
            System.out.print("Enter the time of day (morning/afternoon) or 'exit' to quit: ");
            timeOfDay = scanner.nextLine().toLowerCase();

            if (timeOfDay.equals("morning")) {
                System.out.println(student1.getName() + " enrolled in Calc 2, Chemistry, Physics, History, English.");
            } else if (timeOfDay.equals("afternoon")) {
                System.out.println(student1.getName() + " enrolled in History, Chemistry, Physics, English, Calc 2.");
            } else if (timeOfDay.equals("exit")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid time of day entered.");
            }
        }

    }
}