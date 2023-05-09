import org.junit.Assert;
import org.junit.Test;

public class MainClassTest  extends MainClass{

    @Test
    public void testGetClassNumber(){

        int classNumber = getClassNumber();
        Assert.assertTrue("Метод getClassNumber должен возвращать число больше 45", classNumber > 45);
        System.out.println("Тест пройден - Метод getClassNumber возвращает число больше 45");


    }

}
