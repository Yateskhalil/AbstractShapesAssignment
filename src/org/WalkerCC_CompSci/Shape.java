package org.WalkerCC_CompSci;

public abstract class Shape {

    protected Point[] listOfPoints;

    public double GetSideLength(int sideLengthNumber){
        if(sideLengthNumber >= listOfPoints.length - 1){
            return CalculateSideLength(listOfPoints[listOfPoints.length - 1], listOfPoints[0]);
        }
        else if(sideLengthNumber < 0){
            return CalculateSideLength(listOfPoints[0], listOfPoints[1]);
        }
        else{
            return CalculateSideLength(listOfPoints[sideLengthNumber], listOfPoints[sideLengthNumber + 1]);
        }
    }

    public double CalculateSideLength(Point point0, Point point1){
        double x0=point0.getX();
        double y0=point0.getY();
        double x1=point1.getX();
        double y1=point1.getY();

        return Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0));


    }

    public double GetPerimeter(){

        return CalculateSideLength(listOfPoints[0],listOfPoints[1]);

    }

}
