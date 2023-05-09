import org.junit.Assert;
import org.junit.Test;

public class MainClassTest  extends MainClass{

    @Test
    public void testGetClassNumber(){

        int classNumber = getClassNumber();
        Assert.assertTrue("Метод getClassNumber возвращает число больше 45", classNumber > 45);

    }

}
