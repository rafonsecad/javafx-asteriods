/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteriods.elements;

import asteriods.rockengine.LineEq;
import asteriods.rockengine.Point;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafael
 */
public class AsteriodTest extends Asteriod{
    
    public AsteriodTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void calculateSpeedVector_setOriginEndPointSpeed_getSpeedVector(){
        System.out.println("calculateSpeedVector_setOriginEndPointSpeed_getSpeedVector");

        setOrigin(new Point(0.0, 0.0));
        setEndPoint(new Point (600.0, 600.0));
        setSpeed(5.0);
        calculateSpeedVector();
        Point speedVector = getSpeedVector();
        assertTrue(speedVector.equals(new Point(3.535, 3.535)));
    }

    @Test
    public void calculateSpeedVector_setOriginEndPointSpeed_getSpeedVector2(){
        System.out.println("calculateSpeedVector_setOriginEndPointSpeed_getSpeedVector2");

        setOrigin(new Point(100.0, 200.0));
        setEndPoint(new Point (600.0, 600.0));
        setSpeed(4.0);
        calculateSpeedVector();
        Point speedVector = getSpeedVector();
        System.out.println(speedVector.getX() + " " + speedVector.getY());
        assertTrue(speedVector.equals(new Point(3.1234, 2.498)));
    }
    
    @Test
    public void getNextPoint_setOriginEndPointSpeedCurrentPoint_getPoint() {
        System.out.println("getNextPoint_LineFixed_getPoint");
        setOrigin(new Point(100.0, 200.0));
        setEndPoint(new Point (600.0, 600.0));
        setSpeed(4.0);
        setCurrentPoint(new Point(6.2, 10.2));
        calculateSpeedVector();
        Point nextPoint = getNextPoint();
        System.out.println(nextPoint.getX() + " " + nextPoint.getY());
        assertTrue(nextPoint.equals(new Point(6.51234, 10.449)));
    }
    
}
