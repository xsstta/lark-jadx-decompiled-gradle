package com.ss.android.photoeditor.crop_rotate;

import android.graphics.PointF;
import android.graphics.RectF;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.p3010b.C59610b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.photoeditor.crop_rotate.d */
public class C59703d {

    /* renamed from: a */
    private RectF f148207a;

    /* renamed from: b */
    private int f148208b;

    /* renamed from: c */
    private PointF f148209c;

    /* renamed from: d */
    private RectF f148210d;

    /* renamed from: e */
    private AbstractC59704a f148211e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.crop_rotate.d$a */
    public interface AbstractC59704a {
        /* renamed from: a */
        void mo203255a(RectF rectF);
    }

    /* renamed from: o */
    private PointF m231538o() {
        return this.f148209c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public RectF mo203301k() {
        return this.f148207a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo203302l() {
        return this.f148208b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo203282a() {
        return this.f148209c.x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo203291b() {
        return this.f148209c.y;
    }

    /* renamed from: n */
    private void m231537n() {
        AbstractC59704a aVar = this.f148211e;
        if (aVar != null) {
            aVar.mo203255a(this.f148207a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo203299i() {
        if ((this.f148208b / 90) % 2 != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private RectF m231536m() {
        RectF rectF = this.f148210d;
        if (rectF == null) {
            this.f148210d = new RectF();
        } else {
            rectF.setEmpty();
        }
        return this.f148210d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo203293c() {
        if (mo203299i()) {
            return this.f148207a.height();
        }
        return this.f148207a.width();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo203294d() {
        if (mo203299i()) {
            return this.f148207a.width();
        }
        return this.f148207a.height();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo203295e() {
        float f;
        float height;
        if (mo203299i()) {
            f = this.f148209c.y;
            height = this.f148207a.width();
        } else {
            f = this.f148209c.y;
            height = this.f148207a.height();
        }
        return f + (height / 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo203296f() {
        float f;
        float height;
        if (mo203299i()) {
            f = this.f148209c.y;
            height = this.f148207a.width();
        } else {
            f = this.f148209c.y;
            height = this.f148207a.height();
        }
        return f - (height / 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo203297g() {
        float f;
        float width;
        if (mo203299i()) {
            f = this.f148209c.x;
            width = this.f148207a.height();
        } else {
            f = this.f148209c.x;
            width = this.f148207a.width();
        }
        return f - (width / 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo203298h() {
        float f;
        float width;
        if (mo203299i()) {
            f = this.f148209c.x;
            width = this.f148207a.height();
        } else {
            f = this.f148209c.x;
            width = this.f148207a.width();
        }
        return f + (width / 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public RectF mo203300j() {
        RectF rectF = new RectF(this.f148207a);
        rectF.offset(mo203282a() - rectF.centerX(), mo203291b() - rectF.centerY());
        C59610b.m231213a(rectF, this.f148208b, mo203282a(), mo203291b());
        return rectF;
    }

    /* renamed from: a */
    public C59703d mo203285a(int i) {
        this.f148208b = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C59703d mo203292b(RectF rectF) {
        this.f148207a.set(rectF);
        return this;
    }

    C59703d(C59703d dVar) {
        this.f148207a = new RectF(dVar.mo203301k());
        this.f148209c = new PointF(dVar.m231538o().x, dVar.m231538o().y);
        this.f148208b = dVar.mo203302l();
    }

    /* renamed from: a */
    public C59703d mo203287a(PointF pointF) {
        this.f148209c.set(pointF);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C59703d mo203288a(RectF rectF) {
        if (mo203299i()) {
            RectF m = m231536m();
            m.set(rectF);
            C59610b.m231213a(m, 90, this.f148210d.centerX(), this.f148210d.centerY());
            this.f148207a.set(m);
        } else {
            this.f148207a.set(rectF);
        }
        this.f148209c.x = rectF.centerX();
        this.f148209c.y = rectF.centerY();
        m231537n();
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo203289a(AbstractC59704a aVar) {
        this.f148211e = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo203290a(C59703d dVar) {
        mo203292b(dVar.mo203301k());
        mo203287a(dVar.m231538o());
        mo203285a(dVar.mo203302l());
        m231537n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C59703d mo203283a(float f, float f2) {
        this.f148209c.offset(f, f2);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C59703d mo203286a(int i, PointF pointF) {
        this.f148208b += i;
        C59610b.m231210a(this.f148209c, pointF.x, pointF.y, i);
        return this;
    }

    C59703d(RectF rectF, int i, PointF pointF) {
        this.f148207a = new RectF(rectF);
        this.f148208b = i;
        this.f148209c = pointF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C59703d mo203284a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        if ((this.f148208b / 90) % 2 == 1) {
            f6 = f;
            f5 = f2;
        } else {
            f5 = f;
            f6 = f2;
        }
        Log.m165379d("PhotoEditScale", "Center before = " + this.f148209c.x + ", scaleCenterX =" + f3 + ", scaleWidth = " + f);
        PointF pointF = this.f148209c;
        pointF.x = ((pointF.x - f3) * f) + f3;
        PointF pointF2 = this.f148209c;
        pointF2.y = ((pointF2.y - f4) * f2) + f4;
        Log.m165379d("PhotoEditScale", "Center after = " + this.f148209c.x);
        RectF rectF = this.f148207a;
        rectF.bottom = rectF.bottom * f6;
        this.f148207a.top *= f6;
        this.f148207a.left *= f5;
        this.f148207a.right *= f5;
        m231537n();
        return this;
    }
}
