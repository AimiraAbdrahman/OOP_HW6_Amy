package homework;

public class User{
    public static String name;

    public User(String name){
        this.name = name;
    }

    public static String getName(){
        return name;
    }

    // public void save(){
    //     Persister persister = new Persister(this);
    //     persister.save();
    // }

    // public void report(){
    //     System.out.println("Report for user: " + name);
    // }
}
