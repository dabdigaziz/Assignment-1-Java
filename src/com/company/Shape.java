package com.company;

import java.util.ArrayList;

public class Shape {
    ArrayList<Point> pointArrayList;
    ArrayList<Double> pointDist;
    public Shape(){
        pointArrayList = new ArrayList<>();
        pointDist = new ArrayList<>();
    }
    public void addPoint (Point point ){
        pointArrayList.add(point);
    }
    public ArrayList<Point> getPoint (){
        return pointArrayList;
    }
    public void AddDistance(){
        int size = pointArrayList.size();;
        for (int i = 0; i < size - 1; i++) {
            if(i == size - 2) {
                pointDist.add(pointArrayList.get(i).dist(pointArrayList.get(i+1)));
                pointDist.add(pointArrayList.get(0).dist(pointArrayList.get(size-1)));
            }
            else{
                pointDist.add(pointArrayList.get(i).dist(pointArrayList.get(i+1)));
            }
        }
    }
    public double CalculatePerimeter() {
        int size = pointDist.size();
        if(size==0)
            return 0;
        double per = 0;
        for (int i=0;i < size;i++)
            per += pointDist.get(i);
        return per;
    }
    public double longestSide() {
        double max = pointDist.get(0);
        for(int i = 0; i < pointDist.size(); i++) {
            if(max < pointDist.get(i)){
                max = pointDist.get(i);
            }
        }
        return max;
    }
    public double AvrgLength() {
        double avg= 0;
        for (int i = 0; i < pointDist.size(); i++) {
            avg += pointDist.get(i);
        }
        avg/= (pointDist.size());
        return avg;
    }
}