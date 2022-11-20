package design_pattern.factory_design_pattern;

import java.util.HashMap;
import java.util.Map;

public class OsFactory {

    Map<OSType,Class<? extends Os>> iosMap = new HashMap<OSType,Class<? extends Os>>(){{
        put(OSType.IOS,IOS.class);
        put(OSType.ANDROID,AndroidOs.class);
    }};

    Os getOS(OSType type) throws InstantiationException, IllegalAccessException {

        return iosMap.get(type).newInstance();
    }
}
