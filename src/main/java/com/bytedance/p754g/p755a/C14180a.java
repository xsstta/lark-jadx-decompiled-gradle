package com.bytedance.p754g.p755a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.bytedance.p754g.p755a.p756a.AbstractC14183b;
import com.bytedance.p754g.p755a.p756a.C14182a;
import com.bytedance.p754g.p755a.p756a.C14184c;

/* renamed from: com.bytedance.g.a.a */
public class C14180a {

    /* renamed from: a */
    private static C14185b f37289a = new C14185b();

    /* renamed from: com.bytedance.g.a.a$a */
    public static class C14181a {

        /* renamed from: a */
        public int f37290a = 3;

        /* renamed from: b */
        public int f37291b;

        /* renamed from: c */
        public long f37292c;

        /* renamed from: d */
        public int f37293d = -1;

        /* renamed from: e */
        public String f37294e;

        /* renamed from: f */
        public int f37295f;

        /* renamed from: g */
        public Bitmap.Config f37296g;
    }

    /* renamed from: a */
    public static C14181a m57270a(View view) {
        return m57271a(view, new C14182a());
    }

    /* renamed from: a */
    private static void m57272a(Bitmap bitmap, C14181a aVar) {
        int i;
        if (bitmap != null) {
            aVar.f37296g = bitmap.getConfig();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0 && height > 0) {
                int pixel = bitmap.getPixel(0, 0);
                aVar.f37291b = pixel;
                f37289a.mo52031a(pixel);
                if (f37289a.mo52032a(bitmap)) {
                    i = 1;
                } else {
                    i = 2;
                }
                aVar.f37290a = i;
                return;
            }
            return;
        }
        aVar.f37293d = 3;
        aVar.f37294e = "bitmap is null.";
        aVar.f37290a = 3;
    }

    /* renamed from: a */
    public static C14181a m57271a(View view, AbstractC14183b bVar) {
        C14181a aVar = new C14181a();
        if (!m57275a(view, aVar)) {
            return aVar;
        }
        Context context = view.getContext();
        if (context == null || context.getResources() == null) {
            aVar.f37293d = 4;
            aVar.f37294e = "context or context.getResources is null";
            aVar.f37290a = 3;
            return aVar;
        } else if (!m57274a(view.getWidth(), view.getHeight(), aVar)) {
            return aVar;
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                aVar.f37293d = 2;
                aVar.f37294e = "current thread is not main thread.";
                aVar.f37290a = 3;
                return aVar;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                m57273a(view, bVar, aVar);
                return aVar;
            } catch (Throwable th) {
                Log.e("BlankDetectWebViewUtils", "isViewPureColor", th);
                aVar.f37293d = 4;
                aVar.f37294e = th.getMessage();
                aVar.f37290a = 3;
                aVar.f37292c = System.currentTimeMillis() - currentTimeMillis;
                return aVar;
            }
        }
    }

    /* renamed from: a */
    private static boolean m57275a(View view, C14181a aVar) {
        if (view != null) {
            return true;
        }
        aVar.f37293d = 1;
        aVar.f37294e = "view is null.";
        aVar.f37290a = 3;
        return false;
    }

    /* renamed from: a */
    private static void m57273a(View view, AbstractC14183b bVar, C14181a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        C14184c a = bVar.mo52028a(view);
        m57272a(a.f37300a, aVar);
        bVar.mo52030b(view);
        aVar.f37295f = a.f37301b;
        aVar.f37292c = System.currentTimeMillis() - currentTimeMillis;
    }

    /* renamed from: a */
    private static boolean m57274a(int i, int i2, C14181a aVar) {
        if (i > 0 && i2 > 0) {
            return true;
        }
        Log.w("BlankDetectWebViewUtils", "width and height must be > 0");
        aVar.f37293d = 4;
        aVar.f37294e = "width and height must be > 0";
        aVar.f37290a = 3;
        return false;
    }
}
