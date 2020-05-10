# Java Programs :  Access Specifiers and Access Modifiers

## Access Specifier:- 
#### ```  This can be understood as the access you provide to your code in Java whether other classes can access your code or not.```

### E.g. public, private, protected and default.

* ##### public 
	<code>In a Java project, by creating a object, the public variables/methods  we can access <b>in any package and in any class</b> </code>
* ##### protected 
	<code>In a Java project, by creating a object, the protected variables/methods we can be accessed <b>in same package</b> and the protected variables/methods can be accessed in any other package  <b>through inheritance by subclass object only</b> </code>
* ##### default 
	<code> In a Java project, by creating a object, the default  variables/methods we can be accessed <b>in same package only </b> </code>
* ##### private 
	<code>In a Java project, by creating a object, the private variables/methods we can be accessed <b> in same class only </b> </code>

## Access Modifier:- 
#### ````  Java provides both Access Specifier and Access Modifiers for creating access to your Java code for other classes. Here modifier is also used to do the same task but there are limitations. ````

* ### Class Modifier:
	*  **abstract:** This defines the restriction such that objects cannot be created.
	*  **final:** This restricts a class from being inherited.
	*  **strictfp:** it is related to the checking of floating point values irrespective of OS.
		
* ### Variable Modifier:
	* **static:** no object creation required
	* **final:** cannot be reassigned
	* **transient:** it is not serialized
	* **volatile:** the values are liable for change