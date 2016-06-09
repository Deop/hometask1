import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PenIsWorkTest {

    @Parameters("inkContainer")
    @Test
    public void checkIsWorkTest(int inkContainer){
        System.out.println("ink " + inkContainer);
        Pen pen = new Pen(inkContainer);
        Assert.assertFalse(pen.isWork(), "Ink value - " + inkContainer + ". Pen should not work");
    }

}
