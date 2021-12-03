public class Vector3D {

    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public Vector3D add(Vector3D v2) {
        double newX = x + v2.getX();
        double newY = y + v2.getY();
        double newZ = z + v2.getZ();

        Vector3D sumVector = new Vector3D(newX, newY, newZ);
        return sumVector;
    }

    /**
     * Inverts the vector and returs the inverted vector.
     *
     * @param v1  The vector that will be inverted
     * @return    The inverted vector.
     */

    public Vector3D invert() {
        Vector3D invertedVector = new Vector3D(-x, -y, -z);
        return invertedVector;
    }

    /**
     * Subtracts the given vector
     *
     * @param subtrahendVector
     * @return the vector containing the differences.
     */

    public Vector3D subtract(Vector3D subtrahendVector) {
        double newX = x - subtrahendVector.getX();
        double newY = y - subtrahendVector.getY();
        double newZ = z - subtrahendVector.getZ();

        Vector3D differenceVector = new Vector3D(newX, newY, newZ);
        return differenceVector;
    }

    /**
     * Multiplicates the vector with the given scalar
     *
     * @param scalar
     * @return the multiplicated vector
     */

    public Vector3D scalarMultiplication(double scalar) {
        Vector3D scalarMultiplicatedVector = new Vector3D(x * scalar, y * scalar, z * scalar);
        return scalarMultiplicatedVector;
    }

    @Override
    public String toString (){
        String vector = "(" + x + ", " + y + ", " + z + ")";
        return vector;
    }

}
