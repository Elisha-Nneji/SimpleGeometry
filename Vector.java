public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    /**
     * Adds the instance the method is called upon onto the given Vector.
     *
     * @param v2    Vector that is added
     * @return      the new vector
     */

    public Vector add(Vector v2) {
        double newX = x + v2.getX();
        double newY = y + v2.getY();
        double newZ = z + v2.getZ();

        Vector sumVector = new Vector(newX, newY, newZ);
        return sumVector;
    }

    /**
     * Inverts the vector and returs the inverted vector.
     *
     * @return    The inverted vector.
     */

    public Vector invert() {
        Vector invertedVector = new Vector(-x, -y, -z);
        return invertedVector;
    }

    /**
     * Subtracts the given vector
     *
     * @param subtrahendVector
     * @return the vector containing the differences.
     */

    public Vector subtract(Vector subtrahendVector) {
        double newX = x - subtrahendVector.getX();
        double newY = y - subtrahendVector.getY();
        double newZ = z - subtrahendVector.getZ();

        Vector differenceVector = new Vector(newX, newY, newZ);
        return differenceVector;
    }

    /**
     * Multiplicates the vector with the given scalar
     *
     * @param scalar
     * @return the multiplicated vector
     */

    public Vector scalarMultiplication(double scalar) {
        Vector scalarMultiplicatedVector = new Vector(x * scalar, y * scalar, z * scalar);
        return scalarMultiplicatedVector;
    }

    @Override
    public String toString (){
        String vector = "(" + x + ", " + y + ", " + z + ")";
        return vector;
    }

}
