package com.ss.android.lark.statistics.p2704r;

import android.text.TextUtils;
import com.ss.android.lark.chatwindow.p1723b.C35234b;
import java.util.List;

/* renamed from: com.ss.android.lark.statistics.r.a */
public class C54984a {

    /* renamed from: a */
    private static long f135900a;

    /* renamed from: a */
    public static void m213522a() {
        f135900a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static int m213523b() {
        long currentTimeMillis = System.currentTimeMillis() - f135900a;
        if (currentTimeMillis > 60000) {
            return 0;
        }
        return (int) currentTimeMillis;
    }

    /* renamed from: a */
    public static int m213521a(String str) {
        List<String> c = C35234b.m137579e().mo121403c();
        for (int i = 0; i < c.size(); i++) {
            if (TextUtils.equals(c.get(i), str)) {
                return (i / 34) + 1;
            }
        }
        return 0;
    }
}
