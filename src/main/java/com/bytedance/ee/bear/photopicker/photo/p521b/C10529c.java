package com.bytedance.ee.bear.photopicker.photo.p521b;

import android.content.Context;
import com.samskivert.mustache.C27035d;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.b.c */
public class C10529c {
    /* renamed from: a */
    public static String m43610a(Context context, int i, String str, String str2) {
        String string = context.getString(i);
        if (str == null || str2 == null) {
            return string;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(str, str2);
        return C27035d.m98270a().mo96186a(string).mo96212a(hashMap);
    }
}
