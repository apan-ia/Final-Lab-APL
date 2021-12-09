//class abstract untuk menjalankan decorator pattern dengan mengimplementasi interface Shape
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
    }

    //memanggil method draw dari interface Shape
    @Override
    public void draw(){
        decoratedShape.draw();
    }

}
