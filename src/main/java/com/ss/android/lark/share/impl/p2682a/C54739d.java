package com.ss.android.lark.share.impl.p2682a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.C26320t;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;

/* renamed from: com.ss.android.lark.share.impl.a.d */
public class C54739d {
    /* renamed from: a */
    public static Bitmap m212386a(byte[] bArr) {
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable th) {
            Log.m165383e("ImageUtils", "byteToBitmap decode bitmap failed：" + th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static String m212387a(Context context, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        String u = C57881t.m224649u(context);
        Bitmap a = m212386a(bArr);
        String a2 = C26320t.m95319a(bArr);
        String a3 = C26311p.m95265a(a, u + "/" + a2);
        if (TextUtils.isEmpty(a3)) {
            Log.m165383e("ImageUtils", "save byte bitmap failed");
        }
        return a3;
    }
}
