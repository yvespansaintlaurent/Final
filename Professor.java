import java.util.ArrayList;

public class Professor extends Person {
    //attribute
    private String department;
    private ArrayList<String> coursesTaught;

    //constructor
    public Professor(String name, String id, String email, String department){
        super(name, id, email);
        this.department = department;
        this.coursesTaught = new ArrayList<>();
    }

    //getters and setters
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    
    //methods
    //Adds course to list of courses taught
    public void teachCourse(String course){
        coursesTaught.add(course);
        System.out.println(getName() + " has started teaching the course " + course);
    }

    //list all the courses taught by the professor
    public void listCoursesTaught(){
        System.out.println("Courses taught by Professor : " + getName() + ":");
        if(coursesTaught.isEmpty()){
            System.out.println("No courses currently being taught.");
        }else{
            for (String course : coursesTaught){
                System.out.println("-" + course);
            }
        }
    }
    //simulates professor advising a student
    public void teachStudent(Student student){
        System.out.println(getName() + " is teaching student " + student.getName());
    }
    
    public String getDetails(){
        return super.getDetails() + ", Department: " + department;
    }
}
