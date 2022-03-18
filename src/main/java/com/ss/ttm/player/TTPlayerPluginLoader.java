package com.ss.ttm.player;

public class TTPlayerPluginLoader {
    private static IPluginLoader mPluginLoader;

    public static void setPluginLoader(IPluginLoader iPluginLoader) {
        mPluginLoader = iPluginLoader;
    }

    public static ClassLoader loadPlugin(int i) {
        IPluginLoader iPluginLoader = mPluginLoader;
        if (iPluginLoader != null) {
            return iPluginLoader.loadPlugin(i);
        }
        return null;
    }
}
