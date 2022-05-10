## Laboratory work #2. ##

Based on the base ```Pokemon``` class, write your own classes for the specified types of Pokemon. Each type of Pokémon must have one or two types and standard basic characteristics:

1. health points (HP)
1. attack
1. defense
1. special attack
1. special defense
1. speed

Pokémon classes must be inherited according to the Pokémon evolutionary chain. Based on the base classes  ```PhysicalMove```, ```SpecialMove``` and ```StatusMove```, implement your own classes for the specified types of attacks.

The attack must be of standard type, power and accuracy. Standard attack effects must be implemented. Assign attacks to each type of Pokémon according to the option. The Pokémon level is chosen as the minimum required for all implemented attacks.

Using the ```Battle``` simulation class, create 2 Pokémon teams (each Pokémon must have a name) and start the battle.

The base classes and the battle simulator are in the jar-archive (updated on 10/9/2018, a bug with the addition of attacks and encoding was fixed). Documentation in Javadoc format is [here](https://se.ifmo.ru/~tony/doc/).

Information about Pokémon, evolution chains and attacks can be found at http://poke-universe.ru, http://pokemondb.net, http://veekun.com/dex/pokemon

### Comments. ###

Purpose of work: using a simple example to understand the basic concepts of OOP and learn how to use them in programs.

### What to do (short description): ###

1. Check out the documentation with a special focus on the Pokemon and Move classes. As you continue to complete the lab, read the documentation a few more times.
1. Download the Pokemon.jar file. It will need to be used both for compilation and for running the program. You don't need to unpack it! You need to learn how to connect external jar files to your program.
1. Write a minimal program and see how it works.
```
Battle b = new Battle();
Pokemon p1 = new Pokemon("Stranger", 1);
Pokemon p2 = new Pokemon("Predator", 1);
b.addAlly(p1);
b.addFoe(p2);
b.go();
```
1. Create one of the ```Pokemon``` classes for your variant. The class must inherit from the base Pokemon class. In the constructor, you will need to set the types of the Pokemon and its basic characteristics. After that, try adding Pokemon to the battle.
1. Create one of the attack classes for your variant (it is best to start with a physical or special attack). The class must inherit from the ```PhysicalMove``` or ```SpecialMove``` class. In the constructor, you will need to set the type of attack, its strength and accuracy. After that, add an attack to the Pokémon and test its action in battle. Don't forget to override the describe method to display the desired message.
1. If the attack action differs from the standard one, for example, the Pokemon does not miss, or the attacking Pokemon also receives damage, then the corresponding methods must be additionally redefined in the attack class (see the documentation). When implementing attacks that change the status of a Pokemon (inherited from StatusMove), you will most likely have to deal with the Effect class. It allows you to change the state of the Pokemon or the modifier of its basic characteristics for one or several turns.
1. Finish all the necessary attacks and all the Pokémon, distribute the Pokémon into teams, start the battle.

### Individual specification: ###
![task2](https://user-images.githubusercontent.com/71551187/140787268-643a8a3a-1779-4704-852f-34af41c75d7d.png)

### The work report should contain: ###

1. The text of the task.
1. Class diagram of the implemented object model.
1. The source code of the program.
1. The result of the program.
1. Conclusions on the work.

### Questions to defend laboratory work: ###

1. Object Oriented Programming. Basic concepts: objects, inheritance, polymorphism, encapsulation.
1. Class concept. Classes and objects in Java.
1. Class members. Access modifiers.
1. Creation and initialization of objects. Calling methods.
1. Variable scopes.
1. ```Final``` and ```static``` modifiers.
1. Packages, ```import``` statement.
