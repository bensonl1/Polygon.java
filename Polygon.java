/**
 * The Polygon class represents a polygon shape.
 * It contains information fabout the number of sides, side length, shape type, perimeter, and area.
 */
public class Polygon 
{
  private int sides;
  private double sideLength;
  private String shapeType;
  private double perimeter;
  private double tempPerimeter;
  private double area;
  private double tempArea;
  private boolean sideValid;
  private boolean sideLengthValid;
  /**
   * If the amount of sides is greater than 3 and has sides longer than 0,Constructs a Polygon object with the number of sides, side length, and shape type.
   *If the amount of sides is less than 3 or has a side length of less than 0, assigns a default amount of 3 sides, a length of 1.0 and is named "Triangle"
   * @param getNumSides the number of sides
   * @param getSideLength the length of each side
   * @param getShapeType the type of the shape
   */
  
  public Polygon(int PolySides, double PolyLength, String PolyShape)
  {
    sides = PolySides;
    sideLength = PolyLength;
    shapeType = PolyShape;
    sideValid = true;
    sideLengthValid = true;
    if(sides < 3 || sideLength <= 0) 
    {
      sides = 3;
      sideLength = 1.0;
      shapeType = "Triangle";
      sideLengthValid = false;
      sideValid = false;
    }
  }
  /**
   * Constructs a Polygon object as a triangle with 3 sides and side length of 1.0.
   */
  
  public Polygon()
  {
    sides = 3;
    sideLength = 1.0;
    shapeType = "Triangle";
    perimeter = sides * sideLength;
  }
  
/**
  *Returns the number of sides of the polygon.
  *@return the number of sides of the polygon
  */
  public int getNumSides()
  {
    return sides;
  }
  
 /**
  *Returns the length of each side of the polygon.
  *@return the length of each side of the polygon
  */
  public double getSideLength()
  {
    return sideLength;
  }
  
 /**
  *Returns the type of the polygon.
  *Returns the type of the polygon
  */
  public String getShapeType()
  {
    return shapeType;
  }
  
 /**
  *If the new side length is greater than 0, it sets the length of each side of the polygon.
  *@param newSideLength the new length of each side of the polygon
  */
  public void setSideLength(double newSideLength)
  {
    sideLengthValid = false;
    if(newSideLength > 0)
    {
      sideLength = newSideLength;
      sideLengthValid = true;
    }
  }
    
 /**
  *If the new number of sides is greater than 3, it sets the amount of 
sides of the polygon
  *@param newNumSides the new number of sides of the polygon
  */
  public void setNumSides(int newNumSides)
  {
    sideValid = false;
    if(newNumSides > 2)
    {
      sides = newNumSides;
      sideValid = true;
    }
  }
    
 /**
  *Sets the shape of the polygon.
  *@param newShapeType the new type of the polygon.
  */
  public void setShapeName(String newShapeType)
  {
    shapeType = newShapeType;
  }
    
 /**
  *Calculates and returns the perimter of the polygon.
  *@return the perimeter of the polygon
  */
  public double calculatePerimeter()
  {
    tempPerimeter = sides * sideLength;
    perimeter = Math.round(tempPerimeter * 1000)/1000.0;
    return perimeter;
  }
    
 /**
  *Calculates and returns the new area of the polygon.
  *@return the area of the polygon
  */
  public double getArea()
  {
    double tempArea = (sides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI/sides));
    area = Math.round(tempArea * 1000)/1000.0;
    return area;
  }
  public double calculateArea()
  {
    double tempArea = (sides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI/sides));
    area = Math.round(tempArea * 1000)/1000.0;
    return area;
  }
  
  /**
   * Returns a string representation of the Polygon object.
   * Checks to see if the side length and number of sides is valid
   * If the number of sides is bigger than 2 and the length is greater than 0, the method returns its type, number of sides, side length, and perimeter rounded to 3 digits.
   * Otherwise, it returns "Not a valid polygon".
   * @return a string representation of the Polygon object
   */
  public String toString()
  {
    tempPerimeter = sides * sideLength;
    perimeter = Math.round(tempPerimeter * 1000)/1000.0;
    if (sideValid && sideLengthValid)
    {
      return "Your shape is a " + shapeType + " and it has " + sides + " sides.\n" + "It has a side length of " + sideLength + ".\n" + "It has a perimeter of " + perimeter + " units.";
    }
    else
    {
      return "Not a valid polygon. Your polygon was given a default of 3 sides, was named 'triangle', and each side has a length of 1.0 units. It has a perimeter of 3.0";
    }
  }
}