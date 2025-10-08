import org.example.Pad;
import org.testng.annotations.*;

public class TestBase {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Run before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Run after suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("  Run before TestRun");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("  Run after TestRun");
    }

    @BeforeGroups(groups = "smoke")
    public void beforeGroup() {
        System.out.println("    Run before Group");
    }

    @AfterGroups(groups = "smoke")
    public void afterGroup() {
        System.out.println("    Run after Group");
    }

    @BeforeClass
    public void beforeClass() {
//        Pad notebook = new Pad();
//        notebook.padName = "copybook";
//        notebook.setCover("flexible");
//        notebook.setBinding("glued");
//        int width = 100;
//        int height = 100;
//        int density = 10;
//        int sheetsQuantity = 10;

        System.out.println("      Run before Class. The object is: \n");
        //System.out.println(notebook.getInfo());
        System.out.println();

    }

    @AfterClass
    public void afterClass() {
        System.out.println("      Run after Class");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("        Run before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("        Run after Method");
    }


}
