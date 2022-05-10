import java.util.concurrent.locks.Condition;

import Action.action_self;
import Action.action_status;
import Person.Person;




public class lab3{
    public static void main(String[] args){
        Person person_1 = new Person("Dunno");
        Person person_2 = new Person("Znayka");
        Person person_unknown1 = new Person("Anyone");
        Person person_unknown2 = new Person("People");

        Condition linking = new linking();
        Condition modal = new modal();

        action_self self = new action_self();
        action_status status = new action_status();

        person_1.perform_action(self.lied(person_1.get_name()));
    }
}
//interface AnimalEat{
//	void eat()
//}
//interface AnimalGo{
//	void go()
//}
//class Animal implements AnimalFat, AnimalGo{
//	
//}
