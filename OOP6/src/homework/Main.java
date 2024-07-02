package homework;

import homework.Service.UserService;

public class Main{
    public static void main(String[] args){
        
        User user = new User("Bob");
        UserService.report();
        Persister.save();
        
    }
}