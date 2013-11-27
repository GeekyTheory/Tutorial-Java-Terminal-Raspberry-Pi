package geometry;
/**
 * @author Mario Pérez Esteso <mario@geekytheory.com>
 * @web geekytheory.com
 */
public class Triangle {
    int base, height;
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    public float area() {
        return (float) (this.base*this.height)/2;
    }
}
