
## Laboratory work #5. ##

Implement a console application that implements interactive management of a collection of objects. The collection must store objects of the ```Flat``` class, which is described below.

### The developed program must meet the following requirements: ###

1. A class whose collection of instances is managed by a program must implement default sorting.
1. All requirements for class fields (specified in the form of comments) must be met.
1. For storage, you must use a collection of type ```java.util.TreeSet```
1. When the application starts, the collection should be automatically filled with values from the file.
1. The filename must be passed to the program using: command line argument.
1. The data must be stored in a file in ```xml``` format
1. Reading data from a file must be implemented using the ```java.io.BufferedReader``` class
1. Writing data to a file must be implemented using the ```java.io.PrintWriter``` class
1. All classes in the program must be documented in javadoc format.
1. The program must work correctly with incorrect data (user input errors, lack of access rights to the file, etc.).

### In interactive mode, the program must support the execution of the following commands: ###

1. ```help```: display help for available commands
1. ```info```: print information about the collection (type, date of initialization, number of elements, etc.) to standard output
1. ```show```: display all elements of the collection in string representation to standard output
1. ```add {element}```: add a new element to the collection
1. ```update id {element}```: update the value of the collection element whose id is equal to the given
1. ```remove_by_id id```: remove an item from the collection by its id
1. ```clear```: clear the collection
1. ```save```: save the collection to a file
1. ```execute_script file_name```: read and execute the script from the specified file. The script contains commands in the same form in which the user enters them interactively.
1. ```exit```: exit the program (without saving to file)
1. ```add_if_max {element}```: add a new element to the collection if its value is greater than the value of the largest element in this collection
3. ```add_if_min {element}```: add a new element to the collection if its value is less than the smallest element in this collection
5. ```remove_greater {element}```: remove all elements greater than the specified one from the collection
6. ```remove_any_by_number_of_rooms numberOfRooms```: remove one element from the collection whose numberOfRooms field value is equivalent to the given one
7. ```max_by_furnish```: output any object from the collection whose furnish field value is the maximum
8. ```group_counting_by_id```: group the elements of the collection by the value of the id field, display the number of elements in each group

### Command input format: ###

1. All command arguments that are standard data types (primitive types, wrapper classes, String, date storage classes) must be entered on the same line as the command name.
1. All composite data types (class objects stored in a collection) must be entered one field per line.
1. When entering composite data types, the user should be shown an input prompt containing the field name (for example, "Enter date of birth:")
1. If the field is an enum, then the name of one of its constants is entered (in this case, the list of constants must be previously displayed).
1. In case of incorrect user input (a string is entered that is not the name of a constant in the enum; a string is entered instead of a number; the entered number is not included in the specified limits, etc.) an error message should be displayed and the field should be prompted to re-enter the field.
1. Use an empty string to enter null values.
1. Fields with the comment "The value of this field should be generated automatically" should not be entered manually by the user when adding.

### Description of the classes stored in the collection: ###

```
public class Flat {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer area; //Значение поля должно быть больше 0
    private Long numberOfRooms; //Значение поля должно быть больше 0
    private Boolean new; //Поле не может быть null
    private Furnish furnish; //Поле не может быть null
    private View view; //Поле не может быть null
    private House house; //Поле может быть null
}
public class Coordinates {
    private Double x; //Максимальное значение поля: 623, Поле не может быть null
    private int y; //Максимальное значение поля: 301
}
public class House {
    private String name; //Поле может быть null
    private int year; //Значение поля должно быть больше 0
    private Integer numberOfFloors; //Максимальное значение поля: 75, Значение поля должно быть больше 0
    private Long numberOfFlatsOnFloor; //Значение поля должно быть больше 0
    private Long numberOfLifts; //Значение поля должно быть больше 0
}
public enum Furnish {
    DESIGNER,
    NONE,
    LITTLE;
}
public enum View {
    STREET,
    YARD,
    PARK,
    GOOD,
    TERRIBLE;
}
```
