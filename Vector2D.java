/**
 * Represents a 2-Dimentional Vector.
 *
 * @author Elisha Nneji
 * @version 1.0
 */

public class Vector2D {

    private int x;
    private int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Adds the instance the method is called upon onto the given Vector.
     *
     * @param v2    Vector that is added
     * @return      the new vector
     */

    public Vector2D add(Vector2D v2) {
        Vector2D sumVector = new Vector2D(this.x + v2.getX(), this.y + v2.getY());
        return sumVector;
    }

    /**
     * Inverts the given vector and returs the inverted vector.
     *
     * @param v1  The vector that will be inverted
     * @return    The inverted vector.
     */

    public Vector2D invert(Vector2D v1) {
        Vector2D invertedVector = new Vector2D(-x, -y);
        return invertedVector;
    }

    /**
     * Subtracts the given vector
     *
     * @param subtrahendVector
     * @return the vector containing the differences.
     */

    public Vector2D subtract(Vector2D subtrahendVector) {
        int newX = x - subtrahendVector.getX();
        int newY = y - subtrahendVector.getY();

        Vector2D differenceVector = new Vector2D(newX, newY);
        return differenceVector;
    }

    /**
     * Multiplicates the vector with the given scalar
     *
     * @param scalar
     * @return the multiplicated vector
     */

    public Vector2D scalarMultiplication(int scalar) {
        Vector2D scalarMultiplicatedVector = new Vector2D(x * scalar, y * scalar);
        return scalarMultiplicatedVector;
    }

    @Override
    public String toString (){
        String vector = "(" + x + "," + y + ")";
        return vector;
    }

}
