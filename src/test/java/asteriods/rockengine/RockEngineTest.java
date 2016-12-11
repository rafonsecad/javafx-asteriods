/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteriods.rockengine;

import asteriods.elements.Asteriod;
import asteriods.elements.Element;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javafx.scene.layout.VBox;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rafael
 */
public class RockEngineTest {
    
    public RockEngineTest() {
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
    public void removeAsteriods_AsteriodList_removeAsteriods() {
        List<Integer> indexes = new ArrayList<>();
        indexes.add(2);
        indexes.add(4);
        RockEngine engine = new RockEngine(new VBox());
        engine.initializeAsteriods(10);
        engine.removeAsteriods(indexes);
        assertEquals(engine.getElements().size(), 8);
    }
    
//    @Test
//    public void removeAsteriods_OneFrame_removeAsteriods() throws Exception{
//        VBox root = new VBox();
//        RockEngine rockEngine = new RockEngine(root);
//        List<Element> a = new ArrayList<>();
//        for (int i=0; i<10; i++){
//            Asteriod as = new Asteriod();
//            as.getPoints().removeAll(as.getPoints());
//            root.getChildren().add(as);
//            as.setManaged(false);
//            a.add(as);
//        }
//        a.get(0).getPoints().addAll(new Double []{176.18894398321626, 196.51269203314166, 180.18894398321626, 200.51269203314163, 184.18894398321623, 204.5126920331416, 188.18894398321623, 200.51269203314163, 192.1889439832162, 196.51269203314166, 188.18894398321623, 192.5126920331417, 184.18894398321623, 188.51269203314175, 180.18894398321626, 192.5126920331417});
//        a.get(1).getPoints().addAll(new Double []{345.9615113486218, 332.4853322371158, 349.9615113486218, 336.48533223711576, 353.9615113486218, 340.4853322371157, 357.9615113486218, 336.48533223711576, 361.9615113486218, 332.4853322371158, 357.9615113486218, 328.48533223711587, 353.9615113486218, 324.4853322371159, 349.9615113486218, 328.48533223711587});
//        a.get(2).getPoints().addAll(new Double []{483.20999970833066, 125.99982500036477, 487.20999970833066, 129.99982500036478, 491.20999970833066, 133.99982500036472, 495.20999970833066, 129.99982500036478, 499.20999970833066, 125.99982500036477, 495.20999970833066, 121.99982500036475, 491.20999970833066, 117.99982500036474, 487.20999970833066, 121.99982500036475});
//        a.get(3).getPoints().addAll(new Double []{337.50061222657166, 84.12504055056102, 341.50061222657166, 88.12504055056102, 345.50061222657166, 92.12504055056101, 349.50061222657166, 88.12504055056102, 353.50061222657166, 84.12504055056102, 349.50061222657166, 80.12504055056104, 345.50061222657166, 76.12504055056104, 341.50061222657166, 80.12504055056104});
//        a.get(4).getPoints().addAll(new Double []{29.98668530775823, 539.3332667580014, 33.98668530775818, 543.3332667580014, 37.98668530775807, 547.3332667580014, 41.986685307757966, 543.3332667580014, 45.98668530775786, 539.3332667580014, 41.986685307757966, 535.3332667580014, 37.98668530775807, 531.3332667580014, 33.98668530775818, 535.3332667580014});
//        a.get(5).getPoints().addAll(new Double []{479.17056477604456, 179.47120890674813, 483.17056477604456, 183.47120890674813, 487.17056477604456, 187.47120890674807, 491.17056477604456, 183.47120890674813, 495.17056477604456, 179.47120890674813, 491.17056477604456, 175.4712089067482, 487.17056477604456, 171.47120890674822, 483.17056477604456, 175.4712089067482});
//        a.get(6).getPoints().addAll(new Double []{220.24913278350664, 325.55230950492506, 224.24913278350664, 329.5523095049251, 228.24913278350664, 333.5523095049252, 232.24913278350664, 329.5523095049251, 236.24913278350664, 325.55230950492506, 232.24913278350664, 321.55230950492506, 228.24913278350664, 317.552309504925, 224.24913278350664, 321.55230950492506});
//        a.get(7).getPoints().addAll(new Double []{208.11997355226413, 325.8668429849058, 212.11997355226413, 329.8668429849058, 216.11997355226413, 333.8668429849058, 220.11997355226413, 329.8668429849058, 224.11997355226413, 325.8668429849058, 220.11997355226413, 321.8668429849058, 216.11997355226413, 317.8668429849058, 212.11997355226413, 321.8668429849058});
//        a.get(8).getPoints().addAll(new Double []{337.2263191382861, 301.9420586965512, 341.2263191382862, 305.94205869655116, 345.2263191382863, 309.94205869655104, 349.22631913828644, 305.94205869655116, 353.22631913828656, 301.9420586965512, 349.22631913828644, 297.94205869655127, 345.2263191382863, 293.9420586965513, 341.2263191382862, 297.94205869655127});
//        a.get(9).getPoints().addAll(new Double []{423.07219373438227, 184.25778277830432, 427.07219373438227, 188.25778277830426, 431.07219373438227, 192.25778277830426, 435.07219373438227, 188.25778277830426, 439.07219373438227, 184.25778277830432, 435.07219373438227, 180.25778277830435, 431.07219373438227, 176.25778277830435, 427.07219373438227, 180.25778277830435});
//
//        rockEngine.setElements(a);
//        
//        rockEngine.processCollisionDetector();
//        Set<Integer> index = rockEngine.getCollisionDetector().getCrashedElements();
//        List<Integer> indexOfCrashedElements = new ArrayList<>(index);
//        rockEngine.removeAsteriods(indexOfCrashedElements);
//        
//        Point [] unexpectedPoints = Point.build(new Double []{220.24913278350664, 325.55230950492506, 224.24913278350664, 329.5523095049251, 228.24913278350664, 333.5523095049252, 232.24913278350664, 329.5523095049251, 236.24913278350664, 325.55230950492506, 232.24913278350664, 321.55230950492506, 228.24913278350664, 317.552309504925, 224.24913278350664, 321.55230950492506});
//        Point [] unexpectedPoints2 = Point.build(new Double []{208.11997355226413, 325.8668429849058, 212.11997355226413, 329.8668429849058, 216.11997355226413, 333.8668429849058, 220.11997355226413, 329.8668429849058, 224.11997355226413, 325.8668429849058, 220.11997355226413, 321.8668429849058, 216.11997355226413, 317.8668429849058, 212.11997355226413, 321.8668429849058});
//        for (int i=0; i< rockEngine.getElements().size(); i++){
//            Element expectedA = rockEngine.getElements().get(i);
//            List<Point> asteriodPoints = Point.buildList(expectedA.getPoints());
//            for (int j=0; j<asteriodPoints.size(); j++){
//                if(asteriodPoints.get(j).equals(unexpectedPoints[j])){
//                    throw new Exception();
//                }
//                if(asteriodPoints.get(j).equals(unexpectedPoints2[j])){
//                    throw new Exception();
//                }
//            }
//        }
//        
//        assertTrue(true);
//    }
}
