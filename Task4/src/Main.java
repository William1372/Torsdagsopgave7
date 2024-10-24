public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Square square = new Square(4);

        ShapeBuilder shapeBuilder = new ShapeBuilder();

        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        System.out.println("Cirklens areal: " + circle.getArea());
        System.out.println("Kvadratens areal: " + square.getArea());

        System.out.println("Samlet areal af alle formerne/figurene: " + shapeBuilder.getTotalArea());

    }
}
