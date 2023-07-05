## Non static members

all theses non static mebers like
non static variable
constrctor,non static methods,non static block
are specific to an object

>>non static block


non static block run before the constructor is called
 
**NOTE->non static block called every time when object is crteated and non static called only once**

**NOTE->if we didnt create a defualt counstructor then jvm will create the default cons. by itself**

>>This keyword


The 'this' keyword refers to the current instance of the class in which it is used.

![img.png](img.png)



![img_1.png](img_1.png)


**NOTE->In Java, non-static global variables are stored in the heap area of memory. The heap is a region of memory used to store objects and their instance variables. When an object is created, memory is allocated for it on the heap, and any non-static variables associated with the object are also stored on the heap.The heap area is managed by the Java Virtual Machine (JVM) and is automatically cleaned up by a process known as garbage collection. Garbage collection frees up memory that is no longer being used by an object, making it available for use by other objects.**

>>Local variable



**NOTE->Since local variables are stored on the stack, they have a limited lifetime and are automatically cleaned up when the method returns. This makes them more efficient than non-local variables, which are stored on the heap and require garbage collection.**