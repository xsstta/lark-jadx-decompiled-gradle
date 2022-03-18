package com.ss.texturerender;

public class TextureRenderConfig {
    private static ITextureRenderPluginLoader gPluginLoader;

    public static String getValue(int i) {
        return i != 24 ? "" : BuildConfig.VERSION_NAME;
    }

    public static ClassLoader getClassLoader(int i) {
        ITextureRenderPluginLoader iTextureRenderPluginLoader = gPluginLoader;
        if (iTextureRenderPluginLoader != null) {
            return iTextureRenderPluginLoader.loadPlugin(i);
        }
        return null;
    }

    public static void setClassLoaderCallback(ITextureRenderPluginLoader iTextureRenderPluginLoader) {
        TextureRenderLog.m256492d("TR_TextureRenderConfig", "setClassLoaderCallback");
        gPluginLoader = iTextureRenderPluginLoader;
    }
}
