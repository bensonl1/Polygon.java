/**
 * The Polygon class represents a polygon shape.
 * It contains information about the number of sides, side length, shape type, and perimeter.
 */
public class Polygon 
{
  private int sides;
  private double sideLength;
  private String shapeType;
  private double perimeter;

  /**
   * Constructs a Polygon object with the number of sides, side length, and shape type.
   * @param getNumSides the number of sides
   * @param getSideLength the length of each side
   * @param getShapeType the type of the shape
   */
  public Polygon(int getNumSides, double getSideLength, String getShapeType)
  {
    sides = getNumSides;
    sideLength = getSideLength;
    shapeType = getShapeType;
    perimeter = sides * sideLength;
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
   * Returns a string representation of the Polygon object.
   * If the number of sides is bigger than 2, the method returns its type, number of sides, side length, and perimeter.
   * Otherwise, it returns "Not a valid polygon".
   * @return a string representation of the Polygon object
   */
  public String toString()
  {
    if (sides > 2){
      return "Your shape is a " + shapeType + " and it has " + sides + " sides.\n" + "It has a side length of " + sideLength + ".\n" + "It has a perimeter of " + perimeter + " units.";
    }
    else return "Not a valid polygon";
  }
}
