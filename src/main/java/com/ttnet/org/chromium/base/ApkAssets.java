package com.ttnet.org.chromium.base;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.io.IOException;

@JNINamespace("base::android")
public class ApkAssets {
    public static long[] open(String str) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = ContextUtils.getApplicationContext().getAssets().openNonAssetFd(str);
            long[] jArr = {(long) assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e);
                }
            }
            return jArr;
        } catch (IOException e2) {
            if (!e2.getMessage().equals("") && !e2.getMessage().equals(str)) {
                Log.e("ApkAssets", "Error while loading asset " + str + ": " + e2);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e3) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e3);
                }
            }
            return jArr2;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e4);
                }
            }
            throw th;
        }
    }
}
