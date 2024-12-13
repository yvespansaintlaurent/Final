import java.util.ArrayList;

public class Administrator extends Person {
    private ArrayList<String> responsibilities; // List of administrator responsibilities

    public Administrator(String name, String id, String email) {
        super(name, id, email);
        this.responsibilities = new ArrayList<>();
    }

    // Add a responsibility to the administrator's list
    public void addResponsibility(String responsibility) {
        responsibilities.add(responsibility);
    }

    // Manage a student
    public void manageStudent(Student student) {
        System.out.println(getName() + " is managing the student: " + student.getName());
    }

    // Manage a professor
    public void manageProfessor(Professor professor) {
        System.out.println(getName() + " is managing the professor: " + professor.getName());
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Responsibilities: " + responsibilities;
    }

    // Display all responsibilities
    public void listResponsibilities() {
        System.out.println("Responsibilities of " + getName() + ":");
        for (String responsibility : responsibilities) {
            System.out.println("- " + responsibility);
        }
    }
}
