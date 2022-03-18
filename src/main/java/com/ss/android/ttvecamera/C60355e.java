package com.ss.android.ttvecamera;

import android.text.TextUtils;
import com.ss.android.ttvecamera.p3035d.C60354c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.e */
public class C60355e {

    /* renamed from: a */
    private static String f150859a = ((String) C60354c.m234451a("android.os.SystemProperties", "get", new String[]{"ro.mediatek.platform"}));

    /* renamed from: b */
    private static List<String> f150860b = new ArrayList();

    /* renamed from: c */
    private static boolean f150861c;

    /* renamed from: a */
    public static boolean m234454a() {
        return !TextUtils.isEmpty(f150859a);
    }

    /* renamed from: b */
    public static boolean m234455b() {
        boolean z;
        if (!f150861c) {
            if (Collections.unmodifiableList(f150860b).indexOf(f150859a) < 0) {
                z = true;
            } else {
                z = false;
            }
            f150861c = z;
        }
        return f150861c;
    }

    static {
        Collections.addAll(f150860b, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }
}
