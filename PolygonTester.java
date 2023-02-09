/**
 * The PolygonTester class tests the Polygon class.
 * It creates three Polygon objects using the Polygon constructor,
 * and displays their string representation using the toString() method.
 */
public class PolygonTester {
    /**
   * The main method that creates Polygon objects and displays their string representation.
   * @param args command line arguments (not used)
   */
    public static void main(String[] args) {
      Polygon polygon1 = new Polygon();
      System.out.println(polygon1);
      System.out.println();

      Polygon polygon2 = new Polygon(5, 6.341235, "pentagon");
      System.out.println(polygon2);
      System.out.println();
      

      Polygon polygon3 = new Polygon(1, 5, "line");
      System.out.println(polygon3);
      System.out.println(polygon2.calculatePerimeter());
      System.out.println(polygon2.calculateArea());
    }
}