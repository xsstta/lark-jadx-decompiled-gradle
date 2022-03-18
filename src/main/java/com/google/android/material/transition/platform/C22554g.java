package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.C22402m;
import com.google.android.material.transition.platform.MaterialContainerTransform;

/* renamed from: com.google.android.material.transition.platform.g */
class C22554g {

    /* renamed from: a */
    private final Path f55595a = new Path();

    /* renamed from: b */
    private final Path f55596b = new Path();

    /* renamed from: c */
    private final Path f55597c = new Path();

    /* renamed from: d */
    private final C22402m f55598d = new C22402m();

    /* renamed from: e */
    private C22398l f55599e;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Path mo78645a() {
        return this.f55595a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C22398l mo78648b() {
        return this.f55599e;
    }

    C22554g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78647a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f55595a);
            return;
        }
        canvas.clipPath(this.f55596b);
        canvas.clipPath(this.f55597c, Region.Op.UNION);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78646a(float f, C22398l lVar, C22398l lVar2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.C22537a aVar) {
        C22398l a = C22558k.m81862a(lVar, lVar2, rectF, rectF3, aVar.mo78629a(), aVar.mo78630b(), f);
        this.f55599e = a;
        this.f55598d.mo78040a(a, 1.0f, rectF2, this.f55596b);
        this.f55598d.mo78040a(this.f55599e, 1.0f, rectF3, this.f55597c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f55595a.op(this.f55596b, this.f55597c, Path.Op.UNION);
        }
    }
}
