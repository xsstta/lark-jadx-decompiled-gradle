package com.ss.android.ttvecamera.hardware;

import android.content.Context;
import com.ss.android.ttvecamera.p3035d.C60354c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.hardware.g */
public class C60392g extends C60390e {

    /* renamed from: d */
    private static String f150950d = ((String) C60354c.m234451a("android.os.SystemProperties", "get", new String[]{"ro.mediatek.platform"}));

    /* renamed from: e */
    private static List<String> f150951e = new ArrayList();

    static {
        Collections.addAll(f150951e, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }

    public C60392g(Context context) {
        super(context);
    }
}
