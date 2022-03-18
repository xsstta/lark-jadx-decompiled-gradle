package com.ss.android.lark.image.p1958a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.AbstractC2392h;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.p093d.C2468c;
import java.io.File;

/* renamed from: com.ss.android.lark.image.a.d */
public class C38807d {

    /* renamed from: a */
    private static boolean f99759a;

    /* renamed from: b */
    private static boolean f99760b;

    /* renamed from: b */
    public static void m153156b(Context context) {
        if (!f99760b) {
            ComponentCallbacks2C2115c b = ComponentCallbacks2C2115c.m9149b(context);
            b.mo10361h().mo10309b(C2468c.class, new AbstractC2392h() {
                /* class com.ss.android.lark.image.p1958a.C38807d.C388081 */

                @Override // com.bumptech.glide.load.AbstractC2136a
                /* renamed from: a */
                public boolean mo10479a(Object obj, File file, C2390f fVar) {
                    return false;
                }

                @Override // com.bumptech.glide.load.AbstractC2392h
                /* renamed from: a */
                public EncodeStrategy mo10905a(C2390f fVar) {
                    return EncodeStrategy.SOURCE;
                }
            });
            f99760b = true;
        }
    }

    /* renamed from: a */
    public static void m153155a(Context context) {
        try {
            if (f99759a) {
                f99759a = true;
                return;
            }
            Registry h = ComponentCallbacks2C2115c.m9149b(context).mo10361h();
            if (h != null) {
                h.mo10312b(Bitmap.class, BitmapDrawable.class, new C38805b(context));
            }
            f99759a = true;
        } catch (Throwable th) {
            f99759a = true;
            throw th;
        }
    }
}
