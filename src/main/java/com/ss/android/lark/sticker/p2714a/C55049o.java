package com.ss.android.lark.sticker.p2714a;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.utils.C57881t;

/* renamed from: com.ss.android.lark.sticker.a.o */
public class C55049o {
    /* renamed from: a */
    public static String m213735a(Context context) {
        String t = C57881t.m224648t(context);
        C26311p.m95289i(t);
        return t;
    }

    /* renamed from: b */
    public static String m213737b(Context context) {
        String str = C26308n.m95256b(context) + "/stickerSet/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: a */
    public static String m213736a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return m213735a(context);
        }
        String str2 = m213737b(context) + str;
        C26311p.m95289i(str2);
        return str2;
    }
}
