package com.kg.ConstructorInjection;


public class GeometryExample2 {
   private Shape shape;

   /**
    * Inject Rectangle object via Setter method
    */
   public void setlmo(Shape shape) {
      this.shape = shape;
   }

   public void drawShape() {
      shape.draw();
   }
}