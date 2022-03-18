package com.ss.android.lark.mediapicker.utils;

import android.content.Context;
import com.samskivert.mustache.C27035d;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.mediapicker.utils.m */
public class C44757m {
    /* renamed from: a */
    public static String m177506a(Context context, int i, String str, String str2) {
        String string = context.getString(i);
        if (str == null || str2 == null) {
            return string;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(str, str2);
        return C27035d.m98270a().mo96186a(string).mo96212a(hashMap);
    }
}
