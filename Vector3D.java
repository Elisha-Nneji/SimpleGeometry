public class Vector3D {

    private int x;
    private int y;
    private int z;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Vector3D add(Vector3D v2) {
        int newX = x + v2.getX();
        int newY = y + v2.getY();
        int newZ = z + v2.getZ();

        Vector3D sumVector = new Vector3D(newX, newY, newZ);
        return sumVector;
    }

    public Vector3D invert(Vector3D v1) {
        Vector3D invertedVector = new Vector3D(-x, -y, -z);
        return invertedVector;
    }

    public Vector3D subtract(Vector3D subtrahendVector) {
        int newX = x - subtrahendVector.getX();
        int newY = y - subtrahendVector.getY();
        int newZ = y - subtrahendVector.getZ();

        Vector3D differenceVector = new Vector3D(newX, newY, newZ);
        return differenceVector;
    }

    public Vector3D scalarMultiplication(int scalar) {
        Vector3D scalarMultiplicatedVector = new Vector3D(x * scalar, y * scalar, z * scalar);
        return scalarMultiplicatedVector;
    }

}
