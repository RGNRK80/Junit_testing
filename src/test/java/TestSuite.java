import by.overone.lesson25.hometask.ColorTest;
import by.overone.lesson25.hometask.EngineTest;
import by.overone.lesson25.hometask.TextJUTest;
import by.overone.lesson25.hometask.TypesTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
//@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Test ---------Suite")
//@IncludeTags("production")
//@SelectPackages("by.overone.lesson25.hometask")

@SelectClasses({ColorTest.class, EngineTest.class, TextJUTest.class, TypesTest.class})



public class TestSuite {

}
