import FirstPackage.SomeTestClass;
import junit.framework.TestCase;

public class TestTest {
@org.junit.Test
    public void testgetTrue(){
    SomeTestClass test =  new SomeTestClass();
    TestCase.assertEquals(true, test.getTrue(3));

}

}