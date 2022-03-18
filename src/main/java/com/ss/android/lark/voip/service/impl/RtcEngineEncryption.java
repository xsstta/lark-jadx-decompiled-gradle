package com.ss.android.lark.voip.service.impl;

import android.content.Context;
import com.ss.android.vc.irtc.impl.RtcServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class RtcEngineEncryption {
    public static native int disableEncryption();

    public static native void enableAgoraEncryption(long j);

    public static native int enableEncryption(long j);

    public static native void setAgoraEncryptKey(byte[] bArr, byte[] bArr2);

    public static native void setEncryptKey(byte[] bArr, byte[] bArr2);

    public static String[] getExtraPath() {
        ArrayList arrayList = new ArrayList();
        Context context = RtcServiceImpl.getInstance().getContext();
        if (context != null) {
            arrayList.add(context.getFilesDir().getAbsolutePath() + "/so_decompressed/armeabi-v7a/");
            List<String> nativePathList = SoPathHelper.getNativePathList(context);
            if (nativePathList != null) {
                arrayList.addAll(nativePathList);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void reportEncryptDecryptException(boolean z, int i, byte[] bArr) {
        RtcServiceImpl.getInstance().getVoipCallback().mo197054a(z, i, bArr);
    }
}
