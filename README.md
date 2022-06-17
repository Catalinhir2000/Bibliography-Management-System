Bibliography Management System
Write an application that can manage a catalog of resources (bibliographic references), such as books, articles, etc.
These resources might be represented by files in the local file system or a Web address. Apart from a unique identifier, a title and its location, a resource may have additional properties such as author(s), what year it was publihsed, description, etc.
You may read more about reference management software, see a comparison of notable implementations, such as JabRef.

Example of entries in the catalog might be:

{"id":"knuth67", "title":"The Art of Computer Programming", "location":"d:/books/programming/tacp.ps", "year":"1967", "author":"Donald E. Knuth", "type": "book"};  
{"id":"java17", "title":"The Java Language Specification", "location":"https://docs.oracle.com/javase/specs/jls/se17/html/index.html", "year":"2021", "author":"James Gosling & others"};  
The main specifications of the application are:

Compulsory (1p)

Create an object-oriented model of the problem. You should have at least the following classes: Catalog and Item. The items should have at least a unique identifier, a title and its location. Consider using an interface or an abstract class in order to describe the items in a catalog.
Implement the following methods representing commands that will manage the content of the catalog:
add: adds a new entry into the catalog;
toString: a textual representation of the catalog;
save: saves the catalog to an external file using JSON format; you may use Jackson or other library;
load: loads the catalog from an external file.
Homework (2p)
Represent the commands using classes instead of methods. Use an interface or an abstract class in order to desribe a generic command.
Implement the commands load, list, view, report (create the classes AddCommand, ListCommand, etc.).
list: prints the list of items on the screen;
view: opens an item using the native operating system application (see the Desktop class);
report: creates (and opens) an HTML report representing the content of the catalog.
Use a template engine such as FreeMarker or Velocity, in order to create the HTML report.
(+1p) Use Apache Tika in order to extract metadata from your catalog items and implement the command info in order to display them.
The application will signal invalid date or the commands that are not valid using custom exceptions.
The final form of the application will be an executable JAR archive. Identify the generated archive and launch the application from the console, using the JAR.
