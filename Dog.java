public class Dog extends Animal{
    /*
    public static void main[String args]{
    } */

    private String name;
    private int legs;

    public Dog (String name, int legs) {
	super(legs);
	this.name = name;
    }

    public void setName(String name){
	this.name = name; }
    
    public void setLegs(int numLegs){
	this.legs = legs;}

    public String getName(){
	return name;}
    
    public int getLegs(){
	return legs;}
}
