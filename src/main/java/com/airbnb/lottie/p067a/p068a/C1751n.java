package com.airbnb.lottie.p067a.p068a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.n */
public class C1751n implements AbstractC1747k, AbstractC1750m, AbstractC1758a.AbstractC1760a {

    /* renamed from: a */
    private final Path f5992a = new Path();

    /* renamed from: b */
    private final String f5993b;

    /* renamed from: c */
    private final LottieDrawable f5994c;

    /* renamed from: d */
    private final PolystarShape.Type f5995d;

    /* renamed from: e */
    private final boolean f5996e;

    /* renamed from: f */
    private final AbstractC1758a<?, Float> f5997f;

    /* renamed from: g */
    private final AbstractC1758a<?, PointF> f5998g;

    /* renamed from: h */
    private final AbstractC1758a<?, Float> f5999h;

    /* renamed from: i */
    private final AbstractC1758a<?, Float> f6000i;

    /* renamed from: j */
    private final AbstractC1758a<?, Float> f6001j;

    /* renamed from: k */
    private final AbstractC1758a<?, Float> f6002k;

    /* renamed from: l */
    private final AbstractC1758a<?, Float> f6003l;

    /* renamed from: m */
    private C1738b f6004m = new C1738b();

    /* renamed from: n */
    private boolean f6005n;

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        m7816c();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f5993b;
    }

    /* renamed from: c */
    private void m7816c() {
        this.f6005n = false;
        this.f5994c.invalidateSelf();
    }

    /* renamed from: com.airbnb.lottie.a.a.n$1 */
    static /* synthetic */ class C17521 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6006a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.content.PolystarShape$Type[] r0 = com.airbnb.lottie.model.content.PolystarShape.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.airbnb.lottie.p067a.p068a.C1751n.C17521.f6006a = r0
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.airbnb.lottie.p067a.p068a.C1751n.C17521.f6006a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p067a.p068a.C1751n.C17521.<clinit>():void");
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1750m
    /* renamed from: e */
    public Path mo8942e() {
        if (this.f6005n) {
            return this.f5992a;
        }
        this.f5992a.reset();
        if (this.f5996e) {
            this.f6005n = true;
            return this.f5992a;
        }
        int i = C17521.f6006a[this.f5995d.ordinal()];
        if (i == 1) {
            m7817d();
        } else if (i == 2) {
            m7818f();
        }
        this.f5992a.close();
        this.f6004m.mo8937a(this.f5992a);
        this.f6005n = true;
        return this.f5992a;
    }

    /* renamed from: d */
    private void m7817d() {
        double d;
        float f;
        float f2;
        double d2;
        int i;
        float f3;
        float f4;
        float f5;
        double d3;
        float f6;
        float f7;
        float f8;
        double d4;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float floatValue = this.f5997f.mo8960g().floatValue();
        AbstractC1758a<?, Float> aVar = this.f5999h;
        if (aVar == null) {
            d = 0.0d;
        } else {
            d = (double) aVar.mo8960g().floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d5 = (double) floatValue;
        float f17 = (float) (6.283185307179586d / d5);
        float f18 = f17 / 2.0f;
        float f19 = floatValue - ((float) ((int) floatValue));
        int i2 = (f19 > BitmapDescriptorFactory.HUE_RED ? 1 : (f19 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f19) * f18);
        }
        float floatValue2 = this.f6001j.mo8960g().floatValue();
        float floatValue3 = this.f6000i.mo8960g().floatValue();
        AbstractC1758a<?, Float> aVar2 = this.f6002k;
        if (aVar2 != null) {
            f = aVar2.mo8960g().floatValue() / 100.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        AbstractC1758a<?, Float> aVar3 = this.f6003l;
        if (aVar3 != null) {
            f2 = aVar3.mo8960g().floatValue() / 100.0f;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (i2 != 0) {
            f3 = ((floatValue2 - floatValue3) * f19) + floatValue3;
            i = i2;
            double d6 = (double) f3;
            d2 = d5;
            f5 = (float) (d6 * Math.cos(radians));
            f4 = (float) (d6 * Math.sin(radians));
            this.f5992a.moveTo(f5, f4);
            d3 = radians + ((double) ((f17 * f19) / 2.0f));
        } else {
            d2 = d5;
            i = i2;
            double d7 = (double) floatValue2;
            float cos = (float) (Math.cos(radians) * d7);
            float sin = (float) (d7 * Math.sin(radians));
            this.f5992a.moveTo(cos, sin);
            d3 = radians + ((double) f18);
            f5 = cos;
            f4 = sin;
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        double ceil = Math.ceil(d2) * 2.0d;
        int i3 = 0;
        boolean z = false;
        while (true) {
            double d8 = (double) i3;
            if (d8 < ceil) {
                if (z) {
                    f6 = floatValue2;
                } else {
                    f6 = floatValue3;
                }
                int i4 = (f3 > BitmapDescriptorFactory.HUE_RED ? 1 : (f3 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i4 == 0 || d8 != ceil - 2.0d) {
                    f7 = f17;
                    f8 = f18;
                } else {
                    f7 = f17;
                    f8 = (f17 * f19) / 2.0f;
                }
                if (i4 == 0 || d8 != ceil - 1.0d) {
                    f9 = f18;
                    d4 = d8;
                    f10 = f6;
                } else {
                    f9 = f18;
                    d4 = d8;
                    f10 = f3;
                }
                double d9 = (double) f10;
                float cos2 = (float) (d9 * Math.cos(d3));
                float sin2 = (float) (d9 * Math.sin(d3));
                if (f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) {
                    this.f5992a.lineTo(cos2, sin2);
                    f12 = f;
                    f11 = f3;
                } else {
                    f12 = f;
                    f11 = f3;
                    double atan2 = (double) ((float) (Math.atan2((double) f4, (double) f5) - 1.5707963267948966d));
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z) {
                        f13 = f12;
                    } else {
                        f13 = f2;
                    }
                    if (z) {
                        f14 = f2;
                    } else {
                        f14 = f12;
                    }
                    if (z) {
                        f15 = floatValue3;
                    } else {
                        f15 = floatValue2;
                    }
                    if (z) {
                        f16 = floatValue2;
                    } else {
                        f16 = floatValue3;
                    }
                    float f20 = f15 * f13 * 0.47829f;
                    float f21 = cos3 * f20;
                    float f22 = f20 * sin3;
                    float f23 = f16 * f14 * 0.47829f;
                    float f24 = cos4 * f23;
                    float f25 = f23 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f21 *= f19;
                            f22 *= f19;
                        } else if (d4 == ceil - 1.0d) {
                            f24 *= f19;
                            f25 *= f19;
                        }
                    }
                    this.f5992a.cubicTo(f5 - f21, f4 - f22, cos2 + f24, sin2 + f25, cos2, sin2);
                }
                d3 += (double) f8;
                z = !z;
                i3++;
                f5 = cos2;
                f4 = sin2;
                f = f12;
                f3 = f11;
                f18 = f9;
                f17 = f7;
                ceil = ceil;
            } else {
                PointF g = this.f5998g.mo8960g();
                this.f5992a.offset(g.x, g.y);
                this.f5992a.close();
                return;
            }
        }
    }

    /* renamed from: f */
    private void m7818f() {
        double d;
        double d2;
        double d3;
        double d4;
        int i;
        int floor = (int) Math.floor((double) this.f5997f.mo8960g().floatValue());
        AbstractC1758a<?, Float> aVar = this.f5999h;
        if (aVar == null) {
            d = 0.0d;
        } else {
            d = (double) aVar.mo8960g().floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d5 = (double) floor;
        float floatValue = this.f6003l.mo8960g().floatValue() / 100.0f;
        float floatValue2 = this.f6001j.mo8960g().floatValue();
        double d6 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d6);
        float sin = (float) (Math.sin(radians) * d6);
        this.f5992a.moveTo(cos, sin);
        double d7 = (double) ((float) (6.283185307179586d / d5));
        double d8 = radians + d7;
        double ceil = Math.ceil(d5);
        int i2 = 0;
        while (((double) i2) < ceil) {
            float cos2 = (float) (Math.cos(d8) * d6);
            float sin2 = (float) (d6 * Math.sin(d8));
            if (floatValue != BitmapDescriptorFactory.HUE_RED) {
                d4 = d6;
                i = i2;
                d3 = d8;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d2 = d7;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f = floatValue2 * floatValue * 0.25f;
                this.f5992a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d3 = d8;
                d4 = d6;
                d2 = d7;
                i = i2;
                this.f5992a.lineTo(cos2, sin2);
            }
            d8 = d3 + d2;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = ceil;
            d6 = d4;
            d7 = d2;
        }
        PointF g = this.f5998g.mo8960g();
        this.f5992a.offset(g.x, g.y);
        this.f5992a.close();
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC1739c cVar = list.get(i);
            if (cVar instanceof C1757s) {
                C1757s sVar = (C1757s) cVar;
                if (sVar.mo8945c() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f6004m.mo8938a(sVar);
                    sVar.mo8944a(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        AbstractC1758a<?, Float> aVar;
        AbstractC1758a<?, Float> aVar2;
        if (t == AbstractC1810j.f6216s) {
            this.f5997f.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6217t) {
            this.f5999h.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6207j) {
            this.f5998g.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6218u && (aVar2 = this.f6000i) != null) {
            aVar2.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6219v) {
            this.f6001j.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6220w && (aVar = this.f6002k) != null) {
            aVar.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6221x) {
            this.f6003l.mo8954a(cVar);
        }
    }

    public C1751n(LottieDrawable lottieDrawable, AbstractC1852a aVar, PolystarShape polystarShape) {
        this.f5994c = lottieDrawable;
        this.f5993b = polystarShape.mo9165a();
        PolystarShape.Type b = polystarShape.mo9166b();
        this.f5995d = b;
        this.f5996e = polystarShape.mo9174j();
        AbstractC1758a<Float, Float> a = polystarShape.mo9167c().mo9135a();
        this.f5997f = a;
        AbstractC1758a<PointF, PointF> a2 = polystarShape.mo9168d().mo9135a();
        this.f5998g = a2;
        AbstractC1758a<Float, Float> a3 = polystarShape.mo9169e().mo9135a();
        this.f5999h = a3;
        AbstractC1758a<Float, Float> a4 = polystarShape.mo9171g().mo9135a();
        this.f6001j = a4;
        AbstractC1758a<Float, Float> a5 = polystarShape.mo9173i().mo9135a();
        this.f6003l = a5;
        if (b == PolystarShape.Type.STAR) {
            this.f6000i = polystarShape.mo9170f().mo9135a();
            this.f6002k = polystarShape.mo9172h().mo9135a();
        } else {
            this.f6000i = null;
            this.f6002k = null;
        }
        aVar.mo9294a(a);
        aVar.mo9294a(a2);
        aVar.mo9294a(a3);
        aVar.mo9294a(a4);
        aVar.mo9294a(a5);
        if (b == PolystarShape.Type.STAR) {
            aVar.mo9294a(this.f6000i);
            aVar.mo9294a(this.f6002k);
        }
        a.mo8953a(this);
        a2.mo8953a(this);
        a3.mo8953a(this);
        a4.mo8953a(this);
        a5.mo8953a(this);
        if (b == PolystarShape.Type.STAR) {
            this.f6000i.mo8953a(this);
            this.f6002k.mo8953a(this);
        }
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public void mo8934a(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
        C1790g.m8007a(dVar, i, list, dVar2, this);
    }
}
