package org.example;

import com.sun.source.tree.TryTree;

public class Triangle {

    public TriangleType getTriangleType(int a, int b, int c){
        if(a<=0 || b<=0||c<=0){
            return TriangleType.INVALID;
        }
        if(a+b+c !=180){
            return TriangleType.INVALID;
        }
        if(a==b && b==c ){
            return TriangleType.EQUILATERAL;
        }
        if (a==b || a==c || b==c){
            return TriangleType.ISOSCELES;
        }
        else {return TriangleType.SCALENE;}

    }
}
