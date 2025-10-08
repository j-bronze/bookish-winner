import org.example.Pad;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCalculation extends TestBase{

    @Test
    public void TestCalcPadWeight(){ //padWeight = width * height * density * sheetsQuantity / 1000000;
        Pad copybook = new Pad();
        copybook.padName = "copybook";
        copybook.setCover("flexible");
        copybook.setBinding("glued");
        int width = 100;
        int height = 100;
        int density = 10;
        int sheetsQuantity = 10;
        double padWeight = 1.0;

        Assert.assertEquals(padWeight, copybook.setPadWeight(width, height, density, sheetsQuantity));

        System.out.println(copybook.getPadWeight());

    }

}
