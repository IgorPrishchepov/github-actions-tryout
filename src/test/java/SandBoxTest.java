import org.testng.Assert;
import org.testng.annotations.Test;

public class SandBoxTest {

    @Test
    public void test_1(){
         Assert.assertEquals(System.getenv("OUTPUT_SUFFIX"), "MySuffix");
    }
}
