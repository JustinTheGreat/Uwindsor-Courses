import java.util.Random;
public class randomshapes{
    public static Random rand = new Random();
    /*
     * COval() method used to return 2 integers for random oval dimensions (horizontal + vertical radius)
     */
    public static String COval(){
        int rand_int1 = rand.nextInt(101);
        int rand_int2 = rand.nextInt(101);
        return ("Oval: " + rand_int1 + " x " + rand_int2);
    }
    /*
     * CCircle() method used to return 1 integer for random circle radius
     */
    public static String CCircle(){
        int rand_int1 = rand.nextInt(101);
        return ("Circle: " + rand_int1);
    }
    /*
     * CSquare() method used to return 1 random integer for random square side dimension
     */
    public static String CSquare(){
        int rand_int1 = rand.nextInt(101);
        return ("Square: " + rand_int1 + " x " + rand_int1);
    }
    /*
     * CRectangle() method used to return 2 random integers for random length and height dimension
     */
    public static String CRectangle(){
        int rand_int1 = rand.nextInt(101);
        int rand_int2 = rand.nextInt(101);
        return ("Rectangle: " + rand_int1 + " x " + rand_int2);
    }
    /*
     * CShapes() method used to return a singular random shape, returns null if invalid
     */
    public static String CShapes(){
        int roller = rand.nextInt(4);
        switch (roller) {
            case 0:
                return COval();
            case 1:
                return CCircle();
            case 2:
                return CSquare();
            case 3:
                return CRectangle();
        }
        return null;
    }
    /*
     * CCanvas function used to canvas 10 shapes.
     */
    public static void CCanvas(){
        for (int i = 0; i < 10; i++){
            String shape = CShapes();
            System.out.println(shape);
        }
    }
    /*
     * Main method used to run CCanvas for demonstration
     */
    public static void main(String[] args) {
        CCanvas();
    }
}