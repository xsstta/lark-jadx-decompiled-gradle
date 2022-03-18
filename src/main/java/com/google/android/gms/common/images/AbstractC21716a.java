package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.C21739b;
import com.google.android.gms.internal.base.C21904c;

/* renamed from: com.google.android.gms.common.images.a */
public abstract class AbstractC21716a {

    /* renamed from: a */
    final C21717b f52974a;

    /* renamed from: b */
    protected int f52975b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73565a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73563a(Context context, Bitmap bitmap, boolean z) {
        C21739b.m78944a(bitmap);
        mo73565a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73564a(Context context, C21904c cVar, boolean z) {
        int i = this.f52975b;
        mo73565a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }
}
