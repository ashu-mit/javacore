**NOTE ->In Java, every class implicitly extends the Object class. The Object class is the base class for all classes in Java, and it provides a set of default methods that are inherited by all other classes. Some of the methods provided by the Object class include toString(), equals(), and hashCode().**


>>Method overriding

Method overriding is a feature in object-oriented programming where a subclass provides its own implementation of a method that is already defined in its parent class. This allows the subclass to modify or extend the behavior of the method inherited from the parent class. When a method is called on an object of the subclass, the overridden method in the subclass is executed instead of the method in the parent class.

>>Super Keyword


In Java, the super keyword is used to refer to the parent class of a subclass. It can be used to call the parent class's constructor, methods, or variables.

For example, if you have a subclass Child that extends a parent class Parent, you can use super() to call the constructor of Parent from Child. You can also use super.methodName() to call a method defined in Parent from Child.

```NOTE ->The super keyword is useful when you want to access or override the behavior of a method or variable defined in the parent class.```


``` NOTE -> When you create a parameterized constructor in a parent class, it is not necessary to declare it again in the child class. The child class can simply inherit the constructor from the parent class. However, if the child class needs to perform additional operations or initialize additional instance variables, it may be necessary to override the constructor and provide additional parameters or functionality. In such cases, the child class would need to declare its own constructor.```


>>final

When a method is declared as final, it means that it cannot be overridden by any subclass. This is often used to prevent unintended changes to a method's behavior or to ensure that a specific implementation is always used.