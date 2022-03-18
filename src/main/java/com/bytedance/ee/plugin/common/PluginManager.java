package com.bytedance.ee.plugin.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PluginManager {
    private static final Map<Class<? extends IPluginApi>, IPluginApi> APIS = new HashMap();
    private static final List<String> WHITE_LIST_SIGN;
    private static int sPluginApiVersion;

    public static int getPluginApiVersion() {
        return sPluginApiVersion;
    }

    public static List<String> getWhiteListSign() {
        return WHITE_LIST_SIGN;
    }

    static {
        ArrayList arrayList = new ArrayList();
        WHITE_LIST_SIGN = arrayList;
        arrayList.add("C6973F5D324E58FDD7B2CDBACE515A7C");
    }

    public static void setPluginApiVersion(int i) {
        sPluginApiVersion = i;
    }

    public static <T extends IPluginApi> T getPluginApi(Class<T> cls) {
        return (T) APIS.get(cls);
    }

    public static void installPluginApi(Class<? extends IPluginApi> cls, IPluginApi iPluginApi) {
        APIS.put(cls, iPluginApi);
    }
}
