package com.ss.ttvideoengine;

import com.ss.ttm.player.IPluginLoader;
import com.ss.ttm.player.TTPlayerPluginLoader;
import com.ss.ttvideoengine.net.TTVNetClient;
import java.util.HashMap;

public class TTVideoEngineConfig {
    private static HashMap<Integer, ClassLoader> gClassLoaderMap;
    public static TTVNetClient gNetClient;
    private static IEnginePluginLoader gPluginLoader;
    public static boolean openPerformanceUtils;

    public static void setClassLoderCallback(IEnginePluginLoader iEnginePluginLoader) {
        if (iEnginePluginLoader != null) {
            TTPlayerPluginLoader.setPluginLoader(new IPluginLoader() {
                /* class com.ss.ttvideoengine.TTVideoEngineConfig.C654341 */

                @Override // com.ss.ttm.player.IPluginLoader
                public ClassLoader loadPlugin(int i) {
                    return TTVideoEngineConfig.getClassLoader(i);
                }
            });
            gPluginLoader = iEnginePluginLoader;
        }
    }

    public static ClassLoader getClassLoader(int i) {
        ClassLoader classLoader;
        HashMap<Integer, ClassLoader> hashMap = gClassLoaderMap;
        if (hashMap != null && (classLoader = hashMap.get(Integer.valueOf(i))) != null) {
            return classLoader;
        }
        IEnginePluginLoader iEnginePluginLoader = gPluginLoader;
        if (iEnginePluginLoader != null) {
            return iEnginePluginLoader.loadPlugin(i);
        }
        return null;
    }

    public static void setClassLoader(int i, ClassLoader classLoader) {
        if (gClassLoaderMap == null) {
            gClassLoaderMap = new HashMap<>();
            TTPlayerPluginLoader.setPluginLoader(new IPluginLoader() {
                /* class com.ss.ttvideoengine.TTVideoEngineConfig.C654352 */

                @Override // com.ss.ttm.player.IPluginLoader
                public ClassLoader loadPlugin(int i) {
                    return TTVideoEngineConfig.getClassLoader(i);
                }
            });
        }
        gClassLoaderMap.put(Integer.valueOf(i), classLoader);
    }
}
