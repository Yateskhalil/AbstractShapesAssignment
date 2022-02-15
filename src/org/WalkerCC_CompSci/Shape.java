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

    private double CalculateSideLength(Point point0, Point point1){
        return CalculateSideLength(point0,point1);
    }

    public double GetPerimeter(){
       return 3;
    }



}
