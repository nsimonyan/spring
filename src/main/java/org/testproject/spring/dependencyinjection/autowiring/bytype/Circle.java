package org.testproject.spring.dependencyinjection.autowiring.bytype;

public class Circle
{
 private Point center;
  
 /**
  * @param center the center to set
  */
 public void setCenter(Point center) {
  this.center = center;
 }

 public void draw()
 {
  System.out.println("Center of circle is ("+center.getX()+", "+center.getY()+")");
 }
}