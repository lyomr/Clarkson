//import java.util.Random;


/**
 * @author Oumar Ly
 * Die class
 */
public class Die {
	private int numSides;
	private int topFace;
//	private static Random rng = new Random();
	
//	final int MAX_ON_DIE = 6;
	
//	public Die ( int sides, int top){
//		this.numSides = sides;
//		this.topFace = top;
//	}
	
	
	/*constructor 1*/
	public Die(int sides){
		this.numSides = sides;
	}
	
	
	/*default constructor*/
	public Die(){
		
		this(6);
//		topFace = (int)(Math.random()*numSides + 1);
	}
	
	public void roll(){
//		topFace = rng.nextInt(MAX_ON_DIE) + 1;
//		topFace = rng.nextInt(numSides) + 1;
		this.topFace = (int)(Math.random()*numSides + 1);
	}
	
	public int getTop(){
		return this.topFace;
	}
	
	
}
