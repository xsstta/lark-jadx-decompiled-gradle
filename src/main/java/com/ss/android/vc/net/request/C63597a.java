package com.ss.android.vc.net.request;

import android.util.SparseArray;
import com.ss.android.vc.C60657a;

/* renamed from: com.ss.android.vc.net.request.a */
public final class C63597a {

    /* renamed from: a */
    private static SparseArray<Integer> f160596a = C60657a.m235732a().mo208745e();

    /* renamed from: a */
    public static int m249414a(int i) {
        return f160596a.get(i).intValue();
    }

    /* renamed from: b */
    public static boolean m249415b(int i) {
        if (f160596a.get(i) != null) {
            return true;
        }
        return false;
    }
}
