package suiteDemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({junitTest1.class,junitTest2.class,junitTest3.class})
public class TestSuiteDemo {


}
