package TAU;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class zajecia1Test{
    MathTau math;

@Before
public void init (){
        math = new MathTau();
    }

@Test 
public void mathClassExistsCheck(){
        assertNotNull(math);
    }

@Test
public void mathAdd(){
    double sum = math.add(2.0,2.0);
    assertEquals(4.0,sum, 0.001);
    }
@Test 
public void loopCheck(){
        double sum = 0.0;
        
        for(int i = 0; i < 10; i++ ){
            sum = math.add(sum, 0.1);
        }
        assertEquals(1.0, sum , 0.0001);
    }
}