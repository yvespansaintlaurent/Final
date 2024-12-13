public class Person{
    //attribute
    private String name;
    private String id;
    private String email;
    
    //constructor
    public Person(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    //getter and setter methods
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    //methods
    public String getDetails(){
        return "Name: " + name + ", ID: " + id + ", Email : " + email;
    }
    public void updateDetails(String name, String email){
        this.name = name;
        this.email = email;
    }
}
