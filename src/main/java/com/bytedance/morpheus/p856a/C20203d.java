package com.bytedance.morpheus.p856a;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.morpheus.a.d */
public class C20203d {
    /* renamed from: a */
    public static String m73733a(Context context, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(str)));
        String str2 = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return str2;
            }
            str2 = str2 + readLine;
        }
    }
}
