/*
How to find the distance between two points?
        To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

        d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

        Where √ represents square root.
*/

public class Point {
    private int x;
    private int y;

    //default constructor 1
    public Point(){
    }
    //constructor 2
    public Point(int x, int y){
        setX(x);
        setY(y);
    }
/*    Method named getX without any parameters, it needs to return the value of x field.

    Method named getY without any parameters, it needs to return the value of y field.

    Method named setX with one parameter of type int, it needs to set the value of the x field.

    Method named setY with one parameter of type int, it needs to set the value of the y field.*/
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

/*    Method named distance without any parameters,
     it needs to return the distance between this Point and Point 0,0 as double.*/
    public double distance(){
        return distanceFormula(getX(),getY(),0,0);
    }
/*
    Method named distance with two parameters x, y both of type int,
     it needs to return the distance between this Point and Point x,y as double.
*/
    public double distance(int x,int y){
        return distanceFormula(getX(),getY(),x, y);
    }

/*    Method named distance with parameter another of type Point,
     it needs to return the distance between this Point and another Point as double.*/
    public double distance(Point another){
        return distanceFormula(getX(),getY(),another.getX(), another.getY());

    }
    private double distanceFormula(int x, int y,int x2, int y2){
        return Math.sqrt(Math.pow((x - x2),2) + Math.pow((y - y2),2));
    }
}
