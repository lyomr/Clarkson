import java.awt.Point; /* import the Point class */



/**
 * @author oumar
 * Circle class
 */
public class Circle {
	private float radius; /*Radius of circle*/
	private Point center; /*Point object representing circle center*/
	
	/*constructor 1*/
	public Circle( float radius, int centerX, int centerY){
		this.radius = radius;
		this.center = new Point(centerX, centerY);
	}
	 
	/*constructor 2*/
	public Circle( float radius ){
		this(radius, 0, 0);
	}
	
	/*constructor 3: Default constructor*/
	public Circle(){
		this(1.0f);
	}
	
	/*Mutator from radius*/
	public void setRadius(float radius){
		this.radius = radius;
	}
	
	/*Accessor for radius*/
	public float getRadius(){
		return this.radius;
	}
	
	/*Mutator for center*/
	public void setCenter( int centerX, int centerY){
		this.center.x = centerX;
		this.center.y = centerY;
	}
	
	/*Accessor for x coordinate of center*/
	public int getCenterX(){
		return this.center.x;
	}
	
	/*Accessor for y coordinate of center*/
	public int getCenterY(){
		return this.center.y;
	}
	
	/*Method to compute and return Area*/
	public float computeArea(){
		float area = 
		  ((float)(Math.PI * (double)this.radius * (double)this.radius));
		return area;
	}
}
