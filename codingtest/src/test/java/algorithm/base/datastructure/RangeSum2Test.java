package algorithm.base.datastructure;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;
public class RangeSum2Test {


    @Test
    public void testCalculate() {

        String sInput ="4 3";
        sInput +="\n1 2 3 4";
        sInput +="\n2 3 4 5";
        sInput +="\n3 4 5 6";
        sInput +="\n4 5 6 7";
        
        sInput +="\n2 2 3 4";
        sInput +="\n3 4 3 4";
        sInput +="\n1 1 4 4";

        RangeSum2 rangeSum2 = new RangeSum2();
        List<Long> ret=  rangeSum2.calculate(sInput);
        List<Long> expected =new ArrayList<>();
        expected.add(27l);
        expected.add(6l);
        expected.add(64l);

        Assert.assertEquals(expected.get(0), ret.get(0));
        Assert.assertEquals(expected.get(1), ret.get(1));
        Assert.assertEquals(expected.get(2), ret.get(2));
    }
}
