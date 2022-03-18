package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.C0510g;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* access modifiers changed from: package-private */
/* renamed from: androidx.cardview.widget.c */
public class C0505c implements AbstractC0508e {

    /* renamed from: a */
    final RectF f1826a = new RectF();

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: g */
    public void mo2853g(AbstractC0507d dVar) {
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public void mo2840a() {
        C0510g.f1839a = new C0510g.AbstractC0511a() {
            /* class androidx.cardview.widget.C0505c.C05061 */

            @Override // androidx.cardview.widget.C0510g.AbstractC0511a
            /* renamed from: a */
            public void mo2841a(Canvas canvas, RectF rectF, float f, Paint paint) {
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    C0505c.this.f1826a.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas.translate(rectF.left + f3, rectF.top + f3);
                    canvas.drawArc(C0505c.this.f1826a, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                    canvas.rotate(90.0f);
                    canvas.drawArc(C0505c.this.f1826a, 180.0f, 90.0f, true, paint);
                    canvas.translate(height, BitmapDescriptorFactory.HUE_RED);
                    canvas.rotate(90.0f);
                    canvas.drawArc(C0505c.this.f1826a, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                    canvas.rotate(90.0f);
                    canvas.drawArc(C0505c.this.f1826a, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, (rectF.right - f3) + 1.0f, rectF.top + f3, paint);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, (rectF.right - f3) + 1.0f, rectF.bottom, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
            }
        };
    }

    C0505c() {
    }

    /* renamed from: j */
    private C0510g m2230j(AbstractC0507d dVar) {
        return (C0510g) dVar.mo2838c();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: b */
    public float mo2846b(AbstractC0507d dVar) {
        return m2230j(dVar).mo2881d();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: c */
    public float mo2848c(AbstractC0507d dVar) {
        return m2230j(dVar).mo2883e();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: d */
    public float mo2850d(AbstractC0507d dVar) {
        return m2230j(dVar).mo2872a();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: e */
    public float mo2851e(AbstractC0507d dVar) {
        return m2230j(dVar).mo2877b();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: h */
    public void mo2854h(AbstractC0507d dVar) {
        m2230j(dVar).mo2876a(dVar.mo2837b());
        mo2852f(dVar);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: i */
    public ColorStateList mo2855i(AbstractC0507d dVar) {
        return m2230j(dVar).mo2884f();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public float mo2842a(AbstractC0507d dVar) {
        return m2230j(dVar).mo2879c();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: f */
    public void mo2852f(AbstractC0507d dVar) {
        Rect rect = new Rect();
        m2230j(dVar).mo2875a(rect);
        dVar.mo2833a((int) Math.ceil((double) mo2846b(dVar)), (int) Math.ceil((double) mo2848c(dVar)));
        dVar.mo2834a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: c */
    public void mo2849c(AbstractC0507d dVar, float f) {
        m2230j(dVar).mo2878b(f);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: b */
    public void mo2847b(AbstractC0507d dVar, float f) {
        m2230j(dVar).mo2880c(f);
        mo2852f(dVar);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public void mo2843a(AbstractC0507d dVar, float f) {
        m2230j(dVar).mo2873a(f);
        mo2852f(dVar);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public void mo2845a(AbstractC0507d dVar, ColorStateList colorStateList) {
        m2230j(dVar).mo2874a(colorStateList);
    }

    /* renamed from: a */
    private C0510g m2229a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C0510g(context.getResources(), colorStateList, f, f2, f3);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public void mo2844a(AbstractC0507d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0510g a = m2229a(context, colorStateList, f, f2, f3);
        a.mo2876a(dVar.mo2837b());
        dVar.mo2835a(a);
        mo2852f(dVar);
    }
}
