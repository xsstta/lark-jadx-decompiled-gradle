package com.bytedance.lynx.webview.glue;

import android.content.res.AssetManager;
import com.bytedance.lynx.webview.util.C20048g;

public class Brotli {
    public static native boolean decompressAssetsFile(AssetManager assetManager, String str, String str2);

    private static native boolean decompressFile(String str, String str2);

    public static boolean decompress(String str, String str2) {
        try {
            return decompressFile(str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
            C20048g.m73164d("decompress error:" + th.toString());
            return false;
        }
    }
}
