import java.util.ArrayList;


public class Student extends Person {
    //attribute
    private String major;
    private double GPA;
    private ArrayList<String> courses;
    

    //constructors
    public Student(String name, String id, String email, String major, Double GPA){
        super(name, id, email);
        this.major = major;
        this.GPA = GPA;
        this.courses = new ArrayList<>();
        
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public Double GPA(){
        return GPA;
    }
    public void setGPA(Double GPA){
        this.GPA = GPA;
    }
    
    //methods
    
    //Enrolled in a course
    public void enrollCourse(String course){
        courses.add(course);
        System.out.println(super.getName() + " Enrolled in " + course);
    }
    //Dropped a course
    public void dropCourse(String course){
        if(courses.remove(course)){
            System.out.println("Dropped a" + course);
        }else{
            System.out.println("Course not found" + course);
        }
    }
    //List all courses
    public void listCourses(){
        System.out.println("Courses enrolled by " + getName() + ":");
        for (String course : courses){
            System.out.println("- " + course);
        }
    }

    //Override getDetails() from Person
    public String getDetails(){
        return super.getDetails() + ", Major: " + major + ", GPA: " + GPA;
    }

    public void AssignProfessor(Professor professor){
        //print what has happened
        System.out.println(super.getName() + " has been assigned to " + professor.getName());
    }
    
}

