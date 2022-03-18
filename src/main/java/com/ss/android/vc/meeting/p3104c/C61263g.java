package com.ss.android.vc.meeting.p3104c;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.vc.meeting.c.g */
public class C61263g extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private float f153481a;

    /* renamed from: b */
    private float f153482b = 1.0f;

    /* renamed from: c */
    private float f153483c;

    /* renamed from: d */
    private float f153484d;

    /* renamed from: e */
    private float f153485e;

    /* renamed from: f */
    private float f153486f;

    /* renamed from: g */
    private C61245a f153487g;

    /* renamed from: h */
    private AbstractC61264a f153488h;

    /* renamed from: com.ss.android.vc.meeting.c.g$a */
    public interface AbstractC61264a {
        void onUpdate(float f, float f2, float f3, C61245a aVar, boolean z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationUpdate(android.animation.ValueAnimator r9) {
        /*
            r8 = this;
            java.lang.Object r9 = r9.getAnimatedValue()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            float r0 = r8.f153481a
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = com.ss.android.vc.meeting.p3104c.C61260d.m238319b(r0, r1)
            if (r0 == 0) goto L_0x001e
            float r0 = r8.f153481a
            float r0 = r0 - r1
            float r0 = r0 * r9
            float r0 = r0 + r1
            float r2 = r8.f153482b
        L_0x001c:
            float r0 = r0 / r2
            goto L_0x0033
        L_0x001e:
            float r0 = r8.f153481a
            boolean r0 = com.ss.android.vc.meeting.p3104c.C61260d.m238320c(r0, r1)
            if (r0 == 0) goto L_0x0031
            float r0 = r8.f153481a
            float r0 = r1 - r0
            float r0 = r0 * r9
            float r0 = r1 - r0
            float r2 = r8.f153482b
            goto L_0x001c
        L_0x0031:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0033:
            com.ss.android.vc.meeting.c.g$a r2 = r8.f153488h
            if (r2 == 0) goto L_0x0051
            float r3 = r8.f153483c
            float r3 = r3 * r9
            float r4 = r8.f153484d
            float r4 = r3 - r4
            float r3 = r8.f153485e
            float r3 = r3 * r9
            float r5 = r8.f153486f
            float r5 = r3 - r5
            com.ss.android.vc.meeting.c.a r6 = r8.f153487g
            boolean r7 = com.ss.android.vc.meeting.p3104c.C61260d.m238318a(r9, r1)
            r3 = r0
            r2.onUpdate(r3, r4, r5, r6, r7)
        L_0x0051:
            float r1 = r8.f153482b
            float r1 = r1 * r0
            r8.f153482b = r1
            float r0 = r8.f153483c
            float r0 = r0 * r9
            r8.f153484d = r0
            float r0 = r8.f153485e
            float r0 = r0 * r9
            r8.f153486f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.p3104c.C61263g.onAnimationUpdate(android.animation.ValueAnimator):void");
    }

    public C61263g(float f, float f2, float f3, C61245a aVar, AbstractC61264a aVar2) {
        this.f153481a = f;
        this.f153483c = f2;
        this.f153485e = f3;
        this.f153488h = aVar2;
        this.f153487g = aVar;
        setInterpolator(new DecelerateInterpolator());
        addUpdateListener(this);
        setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        setDuration(200L);
    }
}
