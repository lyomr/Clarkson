//import java.util.Random;


/**
 * @author Oumar Ly
 * 
 * This class implements a class simulating a six sides die
 */
/**
 * @author csguest
 *
 */
/**
 * @author csguest
 *
 */
public class Die {
	private int numSides = 6;
	private int topFace;
//	private static Random rng = new Random();
	
//	final int MAX_ON_DIE = 6;
	
//	public Die ( int sides, int top){
//		this.numSides = sides;
//		this.topFace = top;
//	}
	
	
	/*constructor 1*/
	/**
	 * @param sides
	 * 
	 * The constructor that allows sides initialization
	 */
	public Die(int sides){
		this.numSides = sides;
	}
	
	
	/**
	 * 
	 * Default constructor which initializes all global variables
	 */
	public Die(){
//		this(6);
		topFace = (int)(Math.random()*numSides + 1);
	}
	
	/**
	 * roll() Method rolls die objects and returns value at top
	 * 
	 * @return
	 */
	
	public int roll(){
//		topFace = rng.nextInt(numSides) + 1;
		this.topFace = (int)(Math.random()*numSides + 1);
		return this.topFace;
	}
	
	/*
	 * getTop() method returns value at top without rolling the die
	 * 
	 */
	public int getTop(){
		return this.topFace;
	}
	
	
}
