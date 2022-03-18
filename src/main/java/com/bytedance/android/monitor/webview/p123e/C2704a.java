package com.bytedance.android.monitor.webview.p123e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.monitor.p112i.C2655c;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.bytedance.android.monitor.webview.e.a */
public class C2704a {

    /* renamed from: a */
    private static String f8581a = "webview_monitor_js_file/slardar_sdk.js";

    /* renamed from: b */
    private static String f8582b = "webview_monitor_js_file/slardar_bridge.js";

    /* renamed from: c */
    private static String f8583c = "";

    /* renamed from: d */
    private static String f8584d = "";

    /* renamed from: e */
    private static String f8585e = "";

    /* renamed from: f */
    private static String f8586f = " javascript:( ";

    /* renamed from: g */
    private static String f8587g = " )() ";

    /* renamed from: h */
    private static String f8588h = " function(){ ";

    /* renamed from: i */
    private static String f8589i = " } ";

    /* renamed from: a */
    private static String m11431a(Context context, String str, boolean z) {
        InputStream inputStream;
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream2 = null;
        if (z) {
            try {
                inputStream = context.getAssets().open(str);
            } catch (Exception e) {
                C2655c.m11159a(e);
                if (0 != 0) {
                    inputStream2.close();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream2.close();
                    } catch (Exception e2) {
                        C2655c.m11159a(e2);
                    }
                }
                throw th;
            }
        } else {
            inputStream = new FileInputStream(str);
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception e3) {
                C2655c.m11159a(e3);
            }
        }
        return byteArrayOutputStream.toString();
    }

    /* renamed from: a */
    public static String m11430a(Context context, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(f8583c)) {
            if (TextUtils.isEmpty(str)) {
                f8583c = m11431a(context, f8581a, true);
            } else {
                f8583c = m11431a(context, str, false);
            }
        }
        if (TextUtils.isEmpty(f8584d)) {
            f8584d = m11431a(context, f8582b, true);
        }
        f8585e = str2;
        if (str2 == null) {
            str2 = "";
        }
        f8585e = str2;
        if (!z) {
            f8583c = "";
            f8585e = "";
            f8584d = "";
        }
        return f8586f + f8588h + f8583c + f8584d + f8585e + f8589i + f8587g;
    }
}
