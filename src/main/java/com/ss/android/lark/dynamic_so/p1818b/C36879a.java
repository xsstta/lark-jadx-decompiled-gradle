package com.ss.android.lark.dynamic_so.p1818b;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.dynamic_so.C36875a;
import com.ss.android.lark.log.Log;
import java.io.File;

/* renamed from: com.ss.android.lark.dynamic_so.b.a */
public class C36879a {
    /* renamed from: a */
    private static String m145546a(String str) {
        if (!str.startsWith("lib")) {
            str = "lib" + str;
        }
        if (!str.endsWith(".so")) {
            return str.concat(".so");
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m145547a(Context context, String str) {
        if (TextUtils.isEmpty(str) || C36875a.m145538a() == null) {
            return false;
        }
        String a = C36875a.m145538a().mo133154a("com.ss.android.lark.dynamic.so");
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        String str2 = a + File.separator + m145546a(str);
        boolean exists = new File(str2).exists();
        Log.m165389i("DynamicSoUtils", "checkSoExist soPath = " + str2 + ", soName = " + str + ", exists = " + exists);
        return exists;
    }

    /* renamed from: b */
    public static boolean m145548b(Context context, String str) {
        Log.m165389i("DynamicSoUtils", "checkSoNeedUpdate libraryName =  " + str);
        if (C36875a.m145538a() == null || TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : C36875a.m145538a().mo133158c().get(str)) {
            boolean a = m145547a(context, str2);
            Log.m165389i("DynamicSoUtils", "checkSoNeedUpdate soName = " + str2 + ", exists = " + a);
            if (!a) {
                return true;
            }
        }
        Log.m165389i("DynamicSoUtils", "checkSoNeedUpdate libraryName = " + str + ", exists = " + true);
        return false;
    }
}
