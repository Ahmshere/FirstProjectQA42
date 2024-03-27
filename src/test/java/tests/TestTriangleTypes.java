package tests;

import org.example.Triangle;
import org.example.TriangleType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTriangleTypes {

    @Test
    public void triangleTest001(){
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(90,45,45);
        System.out.println("TYPE: "+triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.ISOSCELES);
    }

    @Test
    public void triangleTest002(){
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(-60,60,60);
        System.out.println("TYPE: "+triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.EQUILATERAL);
    }
    @Test
    public void triangleTest003(){
        Triangle triangle = new Triangle();
        TriangleType triangleType = triangle.getTriangleType(30,170,40);
        System.out.println("TYPE: "+triangleType.toString());
        Assert.assertEquals(triangleType, TriangleType.INVALID);
    }

}
