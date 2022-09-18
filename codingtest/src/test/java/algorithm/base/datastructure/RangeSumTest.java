package algorithm.base.datastructure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class RangeSumTest {

    String sInput ="";
    @Before
    public void setUp( ){

        sInput ="5 3";
        sInput +="\n5 4 3 2 1";
        sInput +="\n1 3";
        sInput +="\n2 4";
        sInput +="\n5 5";
    
    }

    @Test
    public void calculateTest(){
        RangeSum rangeSum = new RangeSum();
        String[] inputParams = new String[]{ 
            "5 3"
            ,"5 4 3 2 1"
            ,"1 3"
            ,"2 4"
            ,"5 5"
        };
        ArrayList<String> result=  (ArrayList<String>) rangeSum.calculate( inputParams);
        assertEquals("12", result.get(0));
        assertEquals("9", result.get(1));
        assertEquals("1", result.get(2));
    }

}
