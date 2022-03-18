package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.C22402m;
import com.google.android.material.transition.MaterialContainerTransform;

/* renamed from: com.google.android.material.transition.g */
class C22525g {

    /* renamed from: a */
    private final Path f55482a = new Path();

    /* renamed from: b */
    private final Path f55483b = new Path();

    /* renamed from: c */
    private final Path f55484c = new Path();

    /* renamed from: d */
    private final C22402m f55485d = new C22402m();

    /* renamed from: e */
    private C22398l f55486e;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Path mo78617a() {
        return this.f55482a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C22398l mo78620b() {
        return this.f55486e;
    }

    C22525g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78619a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f55482a);
            return;
        }
        canvas.clipPath(this.f55483b);
        canvas.clipPath(this.f55484c, Region.Op.UNION);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78618a(float f, C22398l lVar, C22398l lVar2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.C22508a aVar) {
        C22398l a = C22529k.m81781a(lVar, lVar2, rectF, rectF3, aVar.mo78603a(), aVar.mo78604b(), f);
        this.f55486e = a;
        this.f55485d.mo78040a(a, 1.0f, rectF2, this.f55483b);
        this.f55485d.mo78040a(this.f55486e, 1.0f, rectF3, this.f55484c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f55482a.op(this.f55483b, this.f55484c, Path.Op.UNION);
        }
    }
}
