package com.airbnb.lottie.p067a.p068a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.C1841f;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1766c;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.o */
public class C1753o implements AbstractC1747k, AbstractC1750m, AbstractC1758a.AbstractC1760a {

    /* renamed from: a */
    private final Path f6007a = new Path();

    /* renamed from: b */
    private final RectF f6008b = new RectF();

    /* renamed from: c */
    private final String f6009c;

    /* renamed from: d */
    private final boolean f6010d;

    /* renamed from: e */
    private final LottieDrawable f6011e;

    /* renamed from: f */
    private final AbstractC1758a<?, PointF> f6012f;

    /* renamed from: g */
    private final AbstractC1758a<?, PointF> f6013g;

    /* renamed from: h */
    private final AbstractC1758a<?, Float> f6014h;

    /* renamed from: i */
    private C1738b f6015i = new C1738b();

    /* renamed from: j */
    private boolean f6016j;

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        m7825c();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f6009c;
    }

    /* renamed from: c */
    private void m7825c() {
        this.f6016j = false;
        this.f6011e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1750m
    /* renamed from: e */
    public Path mo8942e() {
        float f;
        if (this.f6016j) {
            return this.f6007a;
        }
        this.f6007a.reset();
        if (this.f6010d) {
            this.f6016j = true;
            return this.f6007a;
        }
        PointF g = this.f6013g.mo8960g();
        float f2 = g.x / 2.0f;
        float f3 = g.y / 2.0f;
        AbstractC1758a<?, Float> aVar = this.f6014h;
        if (aVar == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = ((C1766c) aVar).mo8970i();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF g2 = this.f6012f.mo8960g();
        this.f6007a.moveTo(g2.x + f2, (g2.y - f3) + f);
        this.f6007a.lineTo(g2.x + f2, (g2.y + f3) - f);
        int i = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i > 0) {
            float f4 = f * 2.0f;
            this.f6008b.set((g2.x + f2) - f4, (g2.y + f3) - f4, g2.x + f2, g2.y + f3);
            this.f6007a.arcTo(this.f6008b, BitmapDescriptorFactory.HUE_RED, 90.0f, false);
        }
        this.f6007a.lineTo((g2.x - f2) + f, g2.y + f3);
        if (i > 0) {
            float f5 = f * 2.0f;
            this.f6008b.set(g2.x - f2, (g2.y + f3) - f5, (g2.x - f2) + f5, g2.y + f3);
            this.f6007a.arcTo(this.f6008b, 90.0f, 90.0f, false);
        }
        this.f6007a.lineTo(g2.x - f2, (g2.y - f3) + f);
        if (i > 0) {
            float f6 = f * 2.0f;
            this.f6008b.set(g2.x - f2, g2.y - f3, (g2.x - f2) + f6, (g2.y - f3) + f6);
            this.f6007a.arcTo(this.f6008b, 180.0f, 90.0f, false);
        }
        this.f6007a.lineTo((g2.x + f2) - f, g2.y - f3);
        if (i > 0) {
            float f7 = f * 2.0f;
            this.f6008b.set((g2.x + f2) - f7, g2.y - f3, g2.x + f2, (g2.y - f3) + f7);
            this.f6007a.arcTo(this.f6008b, 270.0f, 90.0f, false);
        }
        this.f6007a.close();
        this.f6015i.mo8937a(this.f6007a);
        this.f6016j = true;
        return this.f6007a;
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        if (t == AbstractC1810j.f6205h) {
            this.f6013g.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6207j) {
            this.f6012f.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6206i) {
            this.f6014h.mo8954a(cVar);
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC1739c cVar = list.get(i);
            if (cVar instanceof C1757s) {
                C1757s sVar = (C1757s) cVar;
                if (sVar.mo8945c() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f6015i.mo8938a(sVar);
                    sVar.mo8944a(this);
                }
            }
        }
    }

    public C1753o(LottieDrawable lottieDrawable, AbstractC1852a aVar, C1841f fVar) {
        this.f6009c = fVar.mo9224a();
        this.f6010d = fVar.mo9228e();
        this.f6011e = lottieDrawable;
        AbstractC1758a<PointF, PointF> a = fVar.mo9227d().mo9135a();
        this.f6012f = a;
        AbstractC1758a<PointF, PointF> a2 = fVar.mo9226c().mo9135a();
        this.f6013g = a2;
        AbstractC1758a<Float, Float> a3 = fVar.mo9225b().mo9135a();
        this.f6014h = a3;
        aVar.mo9294a(a);
        aVar.mo9294a(a2);
        aVar.mo9294a(a3);
        a.mo8953a(this);
        a2.mo8953a(this);
        a3.mo8953a(this);
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public void mo8934a(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
        C1790g.m8007a(dVar, i, list, dVar2, this);
    }
}
