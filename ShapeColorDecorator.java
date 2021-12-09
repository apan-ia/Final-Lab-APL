//class ini memberikan warna untuk decorator pattern dan mengextends abstract class shapeDecorator
public class ShapeColorDecorator extends ShapeDecorator{
    protected Color color;//memanggil object color

    public ShapeColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;		
    }

    //implemen method dari interface
    @Override
    public void draw() {
        decoratedShape.draw();	 
        System.out.println("Border Color: " + color);;
    }
}
  
    
