package com.airbnb.lottie.p067a.p068a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.C1836a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.f */
public class C1742f implements AbstractC1747k, AbstractC1750m, AbstractC1758a.AbstractC1760a {

    /* renamed from: a */
    private final Path f5938a = new Path();

    /* renamed from: b */
    private final String f5939b;

    /* renamed from: c */
    private final LottieDrawable f5940c;

    /* renamed from: d */
    private final AbstractC1758a<?, PointF> f5941d;

    /* renamed from: e */
    private final AbstractC1758a<?, PointF> f5942e;

    /* renamed from: f */
    private final C1836a f5943f;

    /* renamed from: g */
    private C1738b f5944g = new C1738b();

    /* renamed from: h */
    private boolean f5945h;

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        m7776c();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f5939b;
    }

    /* renamed from: c */
    private void m7776c() {
        this.f5945h = false;
        this.f5940c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1750m
    /* renamed from: e */
    public Path mo8942e() {
        if (this.f5945h) {
            return this.f5938a;
        }
        this.f5938a.reset();
        if (this.f5943f.mo9198e()) {
            this.f5945h = true;
            return this.f5938a;
        }
        PointF g = this.f5941d.mo8960g();
        float f = g.x / 2.0f;
        float f2 = g.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f5938a.reset();
        if (this.f5943f.mo9197d()) {
            float f5 = -f2;
            this.f5938a.moveTo(BitmapDescriptorFactory.HUE_RED, f5);
            Path path = this.f5938a;
            float f6 = BitmapDescriptorFactory.HUE_RED - f3;
            float f7 = -f;
            float f8 = BitmapDescriptorFactory.HUE_RED - f4;
            path.cubicTo(f6, f5, f7, f8, f7, BitmapDescriptorFactory.HUE_RED);
            Path path2 = this.f5938a;
            float f9 = f4 + BitmapDescriptorFactory.HUE_RED;
            path2.cubicTo(f7, f9, f6, f2, BitmapDescriptorFactory.HUE_RED, f2);
            Path path3 = this.f5938a;
            float f10 = f3 + BitmapDescriptorFactory.HUE_RED;
            path3.cubicTo(f10, f2, f, f9, f, BitmapDescriptorFactory.HUE_RED);
            this.f5938a.cubicTo(f, f8, f10, f5, BitmapDescriptorFactory.HUE_RED, f5);
        } else {
            float f11 = -f2;
            this.f5938a.moveTo(BitmapDescriptorFactory.HUE_RED, f11);
            Path path4 = this.f5938a;
            float f12 = f3 + BitmapDescriptorFactory.HUE_RED;
            float f13 = BitmapDescriptorFactory.HUE_RED - f4;
            path4.cubicTo(f12, f11, f, f13, f, BitmapDescriptorFactory.HUE_RED);
            Path path5 = this.f5938a;
            float f14 = f4 + BitmapDescriptorFactory.HUE_RED;
            path5.cubicTo(f, f14, f12, f2, BitmapDescriptorFactory.HUE_RED, f2);
            Path path6 = this.f5938a;
            float f15 = BitmapDescriptorFactory.HUE_RED - f3;
            float f16 = -f;
            path6.cubicTo(f15, f2, f16, f14, f16, BitmapDescriptorFactory.HUE_RED);
            this.f5938a.cubicTo(f16, f13, f15, f11, BitmapDescriptorFactory.HUE_RED, f11);
        }
        PointF g2 = this.f5942e.mo8960g();
        this.f5938a.offset(g2.x, g2.y);
        this.f5938a.close();
        this.f5944g.mo8937a(this.f5938a);
        this.f5945h = true;
        return this.f5938a;
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        if (t == AbstractC1810j.f6204g) {
            this.f5941d.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6207j) {
            this.f5942e.mo8954a(cVar);
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
                    this.f5944g.mo8938a(sVar);
                    sVar.mo8944a(this);
                }
            }
        }
    }

    public C1742f(LottieDrawable lottieDrawable, AbstractC1852a aVar, C1836a aVar2) {
        this.f5939b = aVar2.mo9194a();
        this.f5940c = lottieDrawable;
        AbstractC1758a<PointF, PointF> a = aVar2.mo9196c().mo9135a();
        this.f5941d = a;
        AbstractC1758a<PointF, PointF> a2 = aVar2.mo9195b().mo9135a();
        this.f5942e = a2;
        this.f5943f = aVar2;
        aVar.mo9294a(a);
        aVar.mo9294a(a2);
        a.mo8953a(this);
        a2.mo8953a(this);
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public void mo8934a(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
        C1790g.m8007a(dVar, i, list, dVar2, this);
    }
}
