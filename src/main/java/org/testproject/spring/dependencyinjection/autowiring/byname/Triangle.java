package org.testproject.spring.dependencyinjection.autowiring.byname;

public class Triangle 
{
 private Point pointA;
 private Point pointB;
 private Point pointC;
 
 /**
  * @param pointA the pointA to set
  */
 public void setPointA(Point pointA) {
  this.pointA = pointA;
 }

 /**
  * @param pointB the pointB to set
  */
 public void setPointB(Point pointB) {
  this.pointB = pointB;
 }

 /**
  * @param pointC the pointC to set
  */
 public void setPointC(Point pointC) {
  this.pointC = pointC;
 }

 public void draw()
 {
  System.out.println("PointA is ("+pointA.getX()+", "+pointA.getY()+")");
  System.out.println("PointB is ("+pointB.getX()+", "+pointB.getY()+")");
  System.out.println("PointC is ("+pointC.getX()+", "+pointC.getY()+")");
 }
}