import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PenColorTest {

    @Parameters({"color", "inkContainer", "sizeLetter"})
    @Test
    public void checkColorTest(String color, int inkContainer, double sizeLetter) {
        System.out.println("color " + color);
        System.out.println("ink " + inkContainer);
        System.out.println("size " + sizeLetter);
        Pen pen = new Pen(inkContainer, sizeLetter, color);
        Assert.assertEquals(pen.getColor(), color);
    }

}
