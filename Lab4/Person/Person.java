package Person;

public class Person implements Creature {
    private String name;
    public Person(String name){
        this.name = name;
    }
    public void perform_action(String action){
        System.out.println(action);
    }
    public String get_name(){
        return this.name;
    }
    
}
