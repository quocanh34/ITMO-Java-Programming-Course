#Implement a console application that implements interactive management of a collection of objects. The collection must store objects of the class Flatdescribed below.

The developed program must meet the following requirements:

The class whose collection of instances the program manages must implement sorting by default.
All class field requirements (specified as comments) must be met.
For storage, you need to use a collection of typejava.util.TreeSet
When the application starts, the collection should be automatically populated with the values ​​from the file.
The filename must be passed to the program with: command line argument .
The data must be stored in a file in the formatxml
Reading data from a file must be implemented using the classjava.util.Scanner
Writing data to a file must be implemented using the classjava.io.PrintWriter
All classes in a program must be documented in javadoc format.
The program should work correctly with incorrect data (user input errors, lack of file access rights, etc.).
In interactive mode, the program must support the execution of the following commands:

help: display help on available commands
info: print information about the collection to standard output (type, initialization date, number of elements, etc.)
show: print to standard output all elements of the collection in string representation
add {element}: add a new element to the collection
update id {element}: update the value of the collection element whose id is equal to the given one
remove_by_id id: remove an element from the collection by its id
clear: clear collection
save: save collection to file
execute_script file_name: read and execute a script from the specified file. The script contains commands in the same form in which they are entered by the user in interactive mode.
exit: end program (without saving to file)
add_if_max {element}: add a new element to the collection if its value is greater than the value of the largest element in this collection
add_if_min {element}: add a new element to the collection if its value is less than the smallest element of this collection
remove_greater {element}: remove from the collection all elements greater than the given
remove_any_by_number_of_rooms numberOfRooms: remove one element from the collection whose numberOfRooms field value is equivalent to the given one
max_by_furnish: output any object from the collection whose furnish field value is the maximum
group_counting_by_id: group the elements of the collection by the value of the id field, display the number of elements in each group
Command entry format:

All command arguments that are standard data types (primitive types, wrapper classes, String, date storage classes) must be entered on the same line as the command name.
All composite data types (objects of classes stored in a collection) must be entered one field per line.
When entering composite data types, the user should be shown a prompt containing the name of the field (for example, "Enter date of birth:")
If the field is an enum, then the name of one of its constants is entered (in this case, the list of constants must be previously displayed).
In case of incorrect user input (a string is entered that is not the name of a constant in the enum; a string is entered instead of a number; the entered number is not within the specified limits, etc.) an error message should be displayed and the field should be re-entered.
To enter null values, use an empty string.
Fields with the comment "The value of this field should be generated automatically" should not be entered manually by the user when adding.
Description of the classes stored in the collection:
