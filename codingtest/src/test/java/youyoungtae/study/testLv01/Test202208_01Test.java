package youyoungtae.study.testLv01;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test202208_01Test {

    Test202208_01 testTarget =null;
    
    @Before
    public void beforeWorks( ){
        testTarget = new Test202208_01();
    }

    @Test
    public void testWorks() {
        testTarget.works();
        Assert.assertTrue("실패", true);
        
    }
}
