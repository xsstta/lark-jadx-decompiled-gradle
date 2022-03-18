package com.tt.miniapp.util;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* renamed from: com.tt.miniapp.util.b */
public class C67028b {
    /* renamed from: a */
    public static String m261243a(Context context, String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(str)));
            String str2 = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return str2;
                }
                str2 = str2 + readLine;
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "AssetsIoUtil", e.getStackTrace());
            return "";
        }
    }
}
