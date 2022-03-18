package com.ss.android.bytedcert.totorender;

import android.app.Activity;
import android.content.res.AssetManager;
import com.C1711a;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.utils.C28432b;

public class RenderJni {

    /* renamed from: a */
    private static Boolean f71510a = false;

    public static native void init(Activity activity);

    public static native void initClearEvent();

    public static native void initClearRender();

    public static native void initRenderScene();

    public static native void nativeInitBitmapDC(int i, int i2, byte[] bArr);

    public static native void renderOnChanged(int i, int i2);

    public static native void renderOndraw(float[] fArr);

    public static native void renderPreview(byte[] bArr, int i, int i2);

    public static native void setAssetManager(AssetManager assetManager);

    static {
        m104196a();
    }

    /* renamed from: a */
    private static void m104196a() {
        if (!f71510a.booleanValue() && !BytedCertManager.getInstance().isLoadRender()) {
            try {
                C1711a.m7628a("totorenderer");
                f71510a = true;
            } catch (Exception e) {
                C28432b.m104210a(e, C28317a.C28318a.f71136K);
            }
        }
    }
}
