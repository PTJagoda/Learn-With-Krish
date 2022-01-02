# Learn-With-Krish
Learn with Krishantha

Empty block - Empty block is consisting of empty pair of curly braces. The purpose of empty block is to group together several statements into a unit.

Static block – In here we use a static keyword and associate it to a block. This block we known as a static block. The code inside the static block is executed only once (In Main class we use 2 objects to call Test class but static block executes only once). There is no any specified way to call static block, it executes automatically when the class is loaded in memory.

Constructor – Constructor is a special method that is used to initialize objects. By default every class have Constructor when we doesn’t create constructor java automatically created one for us.

When we run the code. No matter what order we implement empty block, static block and constructor;
1)	Empty block, Static block, Constructor
2)	Static block, Empty block, Constructor
3)	Constructor, Empty block, Static block
4)	Empty block, Constructor, Static block
5)	Static block, Constructor, Empty block
6)	Constructor, Static block, Empty block

It gives output as 

	Static block, Empty block, then Constructor

Why Static block runs over other blocks?
It runs before the object is created. That’s why static block prints over other blocks. Static block runs without calling in main method.

Why empty block runs over the constructor?
Empty block run each time when object of the class is created. The Constructor called when instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory. That’s why empty block runs over the constructor.
