import org.example.Pad;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestObjectConstructor extends TestBase {

    @Test
    public void TestPadNameIsNotEmpty() {
        Pad copybook = new Pad();
        copybook.padName = "copybook";
        copybook.setCover("hard");
        copybook.setBinding("staples");
        int width = 100;
        int height = 100;
        int density = 10;
        int sheetsQuantity = 10;

        assert(!copybook.padName.isEmpty());
        System.out.println("\nTestObjectConstructor. The padName is not empty: '" + copybook.padName + "'\n");

    }
}
