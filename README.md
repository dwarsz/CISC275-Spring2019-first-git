# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.
   --I created an Animal class with 'legs' as the only instance variable.
   Then I created a Dog class which extends Animal with 'name' and 'legs' as instance variables
   
2. What five objects are created in the main?
--An ArrayList Object, 3 Dog objects and a Comparator Object

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
--Collections.sort requires arguments of the form (List<T> list, Comparator<? super T> c)
In the following code the Comparator constructor is called in the line labeled "Line 1"
	Collections.sort(dogs, new Comparator<Animal>(){      //line1 Comparator constructor is called here
			@Override                                 //line 2
			public int compare(Animal a, Animal b){  //line 3
			    return a.getLegs() - b.getLegs();}}); //line 4

--the code "new Comparator<Animals>" is an anonymos class, in other words it is decalred and instantiated at the same time, and
the result of its creation is passeed in Collections.sort as the second argument.  It implements the interface Comparator and 
lines 2,3,4 (everything between the {}), is the anonymos class's body.
