package design_pattern.factory_design_pattern;

import junit.framework.TestCase;

public class OsFactoryTest extends TestCase {

    public void testGetOS() throws InstantiationException, IllegalAccessException {
        OsFactory osFactory = new OsFactory();
        Os os = osFactory.getOS(OSType.IOS);
        os.operate();
    }
}