package Inheritance_1;
//Extending base class room to make bedroom

 class Bedroom extends Room{      //what if you dont write anything in this extended class
 int height;   //added for human being
 
 Bedroom()
 {
 super();
 height=10;
 }
 
 Bedroom(int L,int W,int height)    //Take care, You know what you mean
 {
	super(L,W);  //it will call constructor of base class (or super class)
    this.height = height;   //height of bedroom
 }
 
 //new added method
 int volume()
 {
	return(length*width*height);   //can we use area here?
 }
 
 void Display()
 {
	super.Display();
	System.out.println("Hello from extended class");
	
 }
 
 
	 
}
