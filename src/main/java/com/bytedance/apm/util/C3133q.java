package com.bytedance.apm.util;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.monitor.util.C20172c;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.apm.util.q */
public class C3133q {

    /* renamed from: a */
    private static String f10054a;

    /* renamed from: a */
    private static String m13028a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder(32);
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        C20172c.m73614a(bufferedReader);
                        return sb2;
                    }
                }
            } catch (Throwable unused) {
                C20172c.m73614a(bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C20172c.m73614a(bufferedReader);
            return null;
        }
    }

    /* renamed from: a */
    public static String m13029a(Context context) {
        String str = f10054a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String a = m13028a();
        f10054a = a;
        if (a == null) {
            return "";
        }
        return a;
    }
}
