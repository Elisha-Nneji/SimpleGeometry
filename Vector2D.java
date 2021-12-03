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

    public Vector2D add(Vector2D v2) {
        Vector2D sumVector = new Vector2D(this.x + v2.getX(), this.y + v2.getY());
        return sumVector;
    }

    public Vector2D invert(Vector2D v1) {
        Vector2D invertedVector = new Vector2D(-x, -y);
        return invertedVector;
    }

    public Vector2D subtract(Vector2D subtrahendVector) {
        int newX = x - subtrahendVector.getX();
        int newY = y - subtrahendVector.getY();

        Vector2D differenceVector = new Vector2D(newX, newY);
        return differenceVector;
    }

    public Vector2D scalarMultiplication(int scalar) {
        Vector2D scalarMultiplicatedVector = new Vector2D(x * scalar, y * scalar);
        return scalarMultiplicatedVector;
    }

}
