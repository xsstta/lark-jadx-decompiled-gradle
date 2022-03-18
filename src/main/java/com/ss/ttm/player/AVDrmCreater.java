package com.ss.ttm.player;

public class AVDrmCreater {
    public static synchronized long createDrm(int i) {
        synchronized (AVDrmCreater.class) {
            if (i != 1) {
                return 0;
            }
            return createDrm(100, "com.ss.ttm.drm.intertrust.IntertrustDrm");
        }
    }

    private static long createDrm(int i, String str) {
        Class<?> cls;
        try {
            ClassLoader loadPlugin = TTPlayerPluginLoader.loadPlugin(i);
            if (loadPlugin != null) {
                cls = Class.forName(str, true, loadPlugin);
            } else {
                cls = Class.forName(str);
            }
            return Long.parseLong(String.valueOf(cls.getMethod("createDrm", new Class[0]).invoke(null, new Object[0])));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
