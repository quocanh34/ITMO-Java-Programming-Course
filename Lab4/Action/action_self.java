package Action;

public class action_self extends Action  {
    public String feeling(String feeling){
        return "";
    }
    public String lied(String name){
        return name + " lied";
    }
    public String wanted(String name, String decision, String place){
        return name + "really" + decision + " to go to the " + place;
    }

    
}
