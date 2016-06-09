import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PenWriteTest {

    @Parameters({"inkContainer", "sizeLetter", "word"})
    @Test
    public void checkWriteTest(int inkContainer, double sizeLetter, String word){
        System.out.println("word - " + word);
        Pen pen = new Pen(inkContainer, sizeLetter);
        Assert.assertEquals(pen.write(word), word);
    }

}
