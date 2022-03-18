package com.ss.android.vesdk;

import android.content.Context;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.medialib.VideoSdkCore;

/* renamed from: com.ss.android.vesdk.c */
public class C63959c {
    /* renamed from: a */
    public static void m251061a(Context context) {
        VideoSdkCore.init(context);
    }

    /* renamed from: b */
    public static void m251064b(boolean z) {
        VideoSdkCore.enableGLES3(z);
    }

    /* renamed from: a */
    public static void m251062a(ResourceFinder resourceFinder) {
        VideoSdkCore.setResourceFinder(resourceFinder);
    }

    /* renamed from: a */
    public static void m251063a(boolean z) {
        VideoSdkCore.setEnableAssetManager(z);
    }
}
