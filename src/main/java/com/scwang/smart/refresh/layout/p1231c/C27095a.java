package com.scwang.smart.refresh.layout.p1231c;

import android.graphics.PointF;
import android.view.View;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27094j;
import com.scwang.smart.refresh.layout.p1232d.animationInterpolatorC27102b;

/* renamed from: com.scwang.smart.refresh.layout.c.a */
public class C27095a implements AbstractC27094j {

    /* renamed from: a */
    public PointF f67316a;

    /* renamed from: b */
    public AbstractC27094j f67317b;

    /* renamed from: c */
    public boolean f67318c = true;

    @Override // com.scwang.smart.refresh.layout.p1230b.AbstractC27094j
    /* renamed from: a */
    public boolean mo96325a(View view) {
        AbstractC27094j jVar = this.f67317b;
        if (jVar != null) {
            return jVar.mo96325a(view);
        }
        return animationInterpolatorC27102b.m98454a(view, this.f67316a);
    }

    @Override // com.scwang.smart.refresh.layout.p1230b.AbstractC27094j
    /* renamed from: b */
    public boolean mo96326b(View view) {
        AbstractC27094j jVar = this.f67317b;
        if (jVar != null) {
            return jVar.mo96326b(view);
        }
        return animationInterpolatorC27102b.m98455a(view, this.f67316a, this.f67318c);
    }
}
