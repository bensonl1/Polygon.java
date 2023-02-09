import java.text.DecimalFormat;
/**
 * The Polygon class represents a polygon shape.
 * It contains information fabout the number of sides, side length, shape type, and perimeter.
 */
public class Polygon 
{
  private int sides;
  private double sideLength;
  private String shapeType;
  private double perimeter;
  private double area;
  private boolean sideValidity;
  private boolean sideLengthValidty;

  /**
   * Constructs a Polygon object with the number of sides, side length, and shape type.
   * @param getNumSides the number of sides
   * @param getSideLength the length of each side
   * @param getShapeType the type of the shape
   */
  
  public Polygon(int PolySides, double PolyLength, String PolyShape)
  {
    sides = PolySides;
    sideLength = PolyLength;
    shapeType = PolyShape;
  }
  /**
   * Constructs a Polygon object as a triangle with 3 sides and side length of 1.0.
   */
  
  public Polygon()
  {
    sides = 3;
    sideLength = 1.0;
    shapeType = "triangle";
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
  *Sets the length of each side of the polygon.
  *@param newSideLength the new length of each side of the polygon
  */
  public void setSideLength(double newSideLength)
  {
    sideLength = newSideLength;
  }
    
 /**
  *Sets the type of the polygon
  *@param newNumSides the new number of sides of the polygon
  */
  public void setNumSides(int newNumSides)
  {
    sides = newNumSides;
  }
    
 /**
  *Sets the shape of the polygon.
  *@param newShapeType the new type of the polygon.\
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
    perimeter = sides * sideLength;
    DecimalFormat df = new DecimalFormat("#.###");
    return Double.parseDouble(df.format(perimeter));
  }
    
 /**
  *Calculates and returns the new area of the polygon.
  *@return the area of the polygon
  */
  public double calculateArea()
  {
    double area = (sides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI/sides));
    DecimalFormat df = new DecimalFormat("#.###");
    return Double.parseDouble(df.format(area));
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
    sideValidity = true;
    if(sides < 3)
    {
      sideValidity = false;
      sides = 3;
    }
    sideLengthValidty = true;
    if(sideLength < 0)
    {
      sideLengthValidty = false;
      sideLength = 1.0;
    }
    perimeter = sides * sideLength;
    DecimalFormat df = new DecimalFormat("#.###");
    
    if (sideValidity && sideLengthValidty)
    {
      return "Your shape is a " + shapeType + " and it has " + sides + " sides.\n" + "It has a side length of " + sideLength + ".\n" + "It has a perimeter of " + df.format(perimeter) + " units.";
    }
    else
    {
      return "Not a valid polygon. Your polygon was given a default of 3 sides, was named 'triangle', and each side has a length of 1.0 units.";
      //ask if you keep these values or just resort to his example output
    }
  }
}
