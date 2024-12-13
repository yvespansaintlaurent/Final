import java.util.ArrayList;

public class Researcher extends Person{
    //attributes
    private String researchArea;
    private ArrayList<String> publications;
    private ArrayList<String> collaborators;

    //constructor
    public Researcher(String name, String id, String email, String researchArea){
        super(name, id, email);
        this.researchArea = researchArea;
        this.publications = new ArrayList<>();
        this.collaborators = new ArrayList<>();
    }
    //getters and setters
    public String getResearchArea(){
        return researchArea;
    }
    public void setResearchArea(String researchArea){
        this.researchArea = researchArea;
    }
    
    //methods
    //publication method
    public void addPublication(String publication){
        publications.add(publication);
        System.out.println(getName() + " added a Publication: " + publication);
    }

    //list all publications
    public void listPublications(){
        System.out.println("Publications by: " + getName() + ":");
        if(publications.isEmpty()){
            System.out.println("No publications available.");
        }else{
            for(String publication : publications){
                System.out.println("-" + publication);
            }
        } 
    }
    //add collaborator method
    public void addCollaborator(String collaboratorName){
        collaborators.add(collaboratorName);
        System.out.println("Collarborator added: " + collaboratorName);
    }
    //List all collaborators
    public void listCollaborators(){
        System.out.println("Collaborators of: " + getName() + ":");
        if(collaborators.isEmpty()){
            System.out.println("No collaborators yet.");
        }else{
            for(String collaborator : collaborators){
                System.out.println("-" + collaborator);
            }
        }
    }
    //Override getDetails() from person
    public String getDetails(){
        return super.getDetails() + ", Research Area: " + researchArea;
    }
}
