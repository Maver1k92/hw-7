public class Shape{
    public void shapeName(){
        System.out.println("Shape");
    }
}

class ShapeTest{
    public static void main(String[] args) {
        Shape quad = new Quad();
        quad.shapeName();
        Shape rectangle = new Rectangle();
        rectangle.shapeName();
        Shape rhombus = new Rhombus();
        rhombus.shapeName();
        Shape circle = new Cirlce();
        circle.shapeName();
        Shape triangle = new Triangle();
        triangle.shapeName();
    }
}
