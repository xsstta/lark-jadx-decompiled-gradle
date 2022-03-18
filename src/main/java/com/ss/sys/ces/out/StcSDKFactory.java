package com.ss.sys.ces.out;

import android.content.Context;
import com.ss.sys.ces.C65386a;
import com.ss.sys.ces.C65388c;

public class StcSDKFactory {

    /* renamed from: a */
    private static ISdk f164675a;

    public static ISdk getInstance() {
        return f164675a;
    }

    public static ISdk getSDK(Context context, long j) {
        if (f164675a == null) {
            synchronized (StcSDKFactory.class) {
                if (f164675a == null) {
                    f164675a = C65388c.m256416a(context, j, 255);
                }
            }
        }
        return f164675a;
    }

    public static ISdk getSDK(Context context, long j, int i) {
        if (f164675a == null) {
            synchronized (StcSDKFactory.class) {
                if (f164675a == null) {
                    f164675a = C65388c.m256416a(context, j, i);
                }
            }
        }
        return f164675a;
    }

    /* renamed from: z */
    public static String m256491z(Context context) {
        String str;
        try {
            synchronized (StcSDKFactory.class) {
                str = (String) C65386a.metas(140, context, null);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }
}
