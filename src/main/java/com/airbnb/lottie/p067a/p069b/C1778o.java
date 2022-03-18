package com.airbnb.lottie.p067a.p069b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.C1830l;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p072d.C1793a;
import com.airbnb.lottie.p072d.C1795c;
import com.airbnb.lottie.p072d.C1796d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.a.b.o */
public class C1778o {

    /* renamed from: a */
    private final Matrix f6077a = new Matrix();

    /* renamed from: b */
    private final Matrix f6078b;

    /* renamed from: c */
    private final Matrix f6079c;

    /* renamed from: d */
    private final Matrix f6080d;

    /* renamed from: e */
    private final float[] f6081e;

    /* renamed from: f */
    private AbstractC1758a<PointF, PointF> f6082f;

    /* renamed from: g */
    private AbstractC1758a<?, PointF> f6083g;

    /* renamed from: h */
    private AbstractC1758a<C1796d, C1796d> f6084h;

    /* renamed from: i */
    private AbstractC1758a<Float, Float> f6085i;

    /* renamed from: j */
    private AbstractC1758a<Integer, Integer> f6086j;

    /* renamed from: k */
    private C1766c f6087k;

    /* renamed from: l */
    private C1766c f6088l;

    /* renamed from: m */
    private AbstractC1758a<?, Float> f6089m;

    /* renamed from: n */
    private AbstractC1758a<?, Float> f6090n;

    /* renamed from: a */
    public AbstractC1758a<?, Integer> mo8987a() {
        return this.f6086j;
    }

    /* renamed from: b */
    public AbstractC1758a<?, Float> mo8993b() {
        return this.f6089m;
    }

    /* renamed from: c */
    public AbstractC1758a<?, Float> mo8994c() {
        return this.f6090n;
    }

    /* renamed from: e */
    private void m7932e() {
        for (int i = 0; i < 9; i++) {
            this.f6081e[i] = 0.0f;
        }
    }

    /* renamed from: d */
    public Matrix mo8995d() {
        float f;
        float f2;
        float f3;
        this.f6077a.reset();
        AbstractC1758a<?, PointF> aVar = this.f6083g;
        if (aVar != null) {
            PointF g = aVar.mo8960g();
            if (!(g.x == BitmapDescriptorFactory.HUE_RED && g.y == BitmapDescriptorFactory.HUE_RED)) {
                this.f6077a.preTranslate(g.x, g.y);
            }
        }
        AbstractC1758a<Float, Float> aVar2 = this.f6085i;
        if (aVar2 != null) {
            if (aVar2 instanceof C1779p) {
                f3 = aVar2.mo8960g().floatValue();
            } else {
                f3 = ((C1766c) aVar2).mo8970i();
            }
            if (f3 != BitmapDescriptorFactory.HUE_RED) {
                this.f6077a.preRotate(f3);
            }
        }
        if (this.f6087k != null) {
            C1766c cVar = this.f6088l;
            if (cVar == null) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = (float) Math.cos(Math.toRadians((double) ((-cVar.mo8970i()) + 90.0f)));
            }
            C1766c cVar2 = this.f6088l;
            if (cVar2 == null) {
                f2 = 1.0f;
            } else {
                f2 = (float) Math.sin(Math.toRadians((double) ((-cVar2.mo8970i()) + 90.0f)));
            }
            m7932e();
            float[] fArr = this.f6081e;
            fArr[0] = f;
            fArr[1] = f2;
            float f4 = -f2;
            fArr[3] = f4;
            fArr[4] = f;
            fArr[8] = 1.0f;
            this.f6078b.setValues(fArr);
            m7932e();
            float[] fArr2 = this.f6081e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.f6087k.mo8970i()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f6079c.setValues(fArr2);
            m7932e();
            float[] fArr3 = this.f6081e;
            fArr3[0] = f;
            fArr3[1] = f4;
            fArr3[3] = f2;
            fArr3[4] = f;
            fArr3[8] = 1.0f;
            this.f6080d.setValues(fArr3);
            this.f6079c.preConcat(this.f6078b);
            this.f6080d.preConcat(this.f6079c);
            this.f6077a.preConcat(this.f6080d);
        }
        AbstractC1758a<C1796d, C1796d> aVar3 = this.f6084h;
        if (aVar3 != null) {
            C1796d g2 = aVar3.mo8960g();
            if (!(g2.mo9085a() == 1.0f && g2.mo9087b() == 1.0f)) {
                this.f6077a.preScale(g2.mo9085a(), g2.mo9087b());
            }
        }
        AbstractC1758a<PointF, PointF> aVar4 = this.f6082f;
        if (aVar4 != null) {
            PointF g3 = aVar4.mo8960g();
            if (!(g3.x == BitmapDescriptorFactory.HUE_RED && g3.y == BitmapDescriptorFactory.HUE_RED)) {
                this.f6077a.preTranslate(-g3.x, -g3.y);
            }
        }
        return this.f6077a;
    }

    /* renamed from: a */
    public void mo8988a(float f) {
        AbstractC1758a<Integer, Integer> aVar = this.f6086j;
        if (aVar != null) {
            aVar.mo8952a(f);
        }
        AbstractC1758a<?, Float> aVar2 = this.f6089m;
        if (aVar2 != null) {
            aVar2.mo8952a(f);
        }
        AbstractC1758a<?, Float> aVar3 = this.f6090n;
        if (aVar3 != null) {
            aVar3.mo8952a(f);
        }
        AbstractC1758a<PointF, PointF> aVar4 = this.f6082f;
        if (aVar4 != null) {
            aVar4.mo8952a(f);
        }
        AbstractC1758a<?, PointF> aVar5 = this.f6083g;
        if (aVar5 != null) {
            aVar5.mo8952a(f);
        }
        AbstractC1758a<C1796d, C1796d> aVar6 = this.f6084h;
        if (aVar6 != null) {
            aVar6.mo8952a(f);
        }
        AbstractC1758a<Float, Float> aVar7 = this.f6085i;
        if (aVar7 != null) {
            aVar7.mo8952a(f);
        }
        C1766c cVar = this.f6087k;
        if (cVar != null) {
            cVar.mo8952a(f);
        }
        C1766c cVar2 = this.f6088l;
        if (cVar2 != null) {
            cVar2.mo8952a(f);
        }
    }

    /* renamed from: a */
    public void mo8989a(AbstractC1758a.AbstractC1760a aVar) {
        AbstractC1758a<Integer, Integer> aVar2 = this.f6086j;
        if (aVar2 != null) {
            aVar2.mo8953a(aVar);
        }
        AbstractC1758a<?, Float> aVar3 = this.f6089m;
        if (aVar3 != null) {
            aVar3.mo8953a(aVar);
        }
        AbstractC1758a<?, Float> aVar4 = this.f6090n;
        if (aVar4 != null) {
            aVar4.mo8953a(aVar);
        }
        AbstractC1758a<PointF, PointF> aVar5 = this.f6082f;
        if (aVar5 != null) {
            aVar5.mo8953a(aVar);
        }
        AbstractC1758a<?, PointF> aVar6 = this.f6083g;
        if (aVar6 != null) {
            aVar6.mo8953a(aVar);
        }
        AbstractC1758a<C1796d, C1796d> aVar7 = this.f6084h;
        if (aVar7 != null) {
            aVar7.mo8953a(aVar);
        }
        AbstractC1758a<Float, Float> aVar8 = this.f6085i;
        if (aVar8 != null) {
            aVar8.mo8953a(aVar);
        }
        C1766c cVar = this.f6087k;
        if (cVar != null) {
            cVar.mo8953a(aVar);
        }
        C1766c cVar2 = this.f6088l;
        if (cVar2 != null) {
            cVar2.mo8953a(aVar);
        }
    }

    /* renamed from: b */
    public Matrix mo8992b(float f) {
        PointF pointF;
        C1796d dVar;
        float f2;
        AbstractC1758a<?, PointF> aVar = this.f6083g;
        PointF pointF2 = null;
        if (aVar == null) {
            pointF = null;
        } else {
            pointF = aVar.mo8960g();
        }
        AbstractC1758a<C1796d, C1796d> aVar2 = this.f6084h;
        if (aVar2 == null) {
            dVar = null;
        } else {
            dVar = aVar2.mo8960g();
        }
        this.f6077a.reset();
        if (pointF != null) {
            this.f6077a.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (dVar != null) {
            double d = (double) f;
            this.f6077a.preScale((float) Math.pow((double) dVar.mo9085a(), d), (float) Math.pow((double) dVar.mo9087b(), d));
        }
        AbstractC1758a<Float, Float> aVar3 = this.f6085i;
        if (aVar3 != null) {
            float floatValue = aVar3.mo8960g().floatValue();
            AbstractC1758a<PointF, PointF> aVar4 = this.f6082f;
            if (aVar4 != null) {
                pointF2 = aVar4.mo8960g();
            }
            Matrix matrix = this.f6077a;
            float f3 = floatValue * f;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            if (pointF2 == null) {
                f2 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f2 = pointF2.x;
            }
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.f6077a;
    }

    public C1778o(C1830l lVar) {
        AbstractC1758a<PointF, PointF> aVar;
        AbstractC1758a<PointF, PointF> aVar2;
        AbstractC1758a<C1796d, C1796d> aVar3;
        AbstractC1758a<Float, Float> aVar4;
        C1766c cVar;
        C1766c cVar2;
        if (lVar.mo9141a() == null) {
            aVar = null;
        } else {
            aVar = lVar.mo9141a().mo9135a();
        }
        this.f6082f = aVar;
        if (lVar.mo9142b() == null) {
            aVar2 = null;
        } else {
            aVar2 = lVar.mo9142b().mo9135a();
        }
        this.f6083g = aVar2;
        if (lVar.mo9143c() == null) {
            aVar3 = null;
        } else {
            aVar3 = lVar.mo9143c().mo9135a();
        }
        this.f6084h = aVar3;
        if (lVar.mo9144d() == null) {
            aVar4 = null;
        } else {
            aVar4 = lVar.mo9144d().mo9135a();
        }
        this.f6085i = aVar4;
        if (lVar.mo9148h() == null) {
            cVar = null;
        } else {
            cVar = (C1766c) lVar.mo9148h().mo9135a();
        }
        this.f6087k = cVar;
        if (cVar != null) {
            this.f6078b = new Matrix();
            this.f6079c = new Matrix();
            this.f6080d = new Matrix();
            this.f6081e = new float[9];
        } else {
            this.f6078b = null;
            this.f6079c = null;
            this.f6080d = null;
            this.f6081e = null;
        }
        if (lVar.mo9149i() == null) {
            cVar2 = null;
        } else {
            cVar2 = (C1766c) lVar.mo9149i().mo9135a();
        }
        this.f6088l = cVar2;
        if (lVar.mo9145e() != null) {
            this.f6086j = lVar.mo9145e().mo9135a();
        }
        if (lVar.mo9146f() != null) {
            this.f6089m = lVar.mo9146f().mo9135a();
        } else {
            this.f6089m = null;
        }
        if (lVar.mo9147g() != null) {
            this.f6090n = lVar.mo9147g().mo9135a();
        } else {
            this.f6090n = null;
        }
    }

    /* renamed from: a */
    public void mo8990a(AbstractC1852a aVar) {
        aVar.mo9294a(this.f6086j);
        aVar.mo9294a(this.f6089m);
        aVar.mo9294a(this.f6090n);
        aVar.mo9294a(this.f6082f);
        aVar.mo9294a(this.f6083g);
        aVar.mo9294a(this.f6084h);
        aVar.mo9294a(this.f6085i);
        aVar.mo9294a(this.f6087k);
        aVar.mo9294a(this.f6088l);
    }

    /* renamed from: a */
    public <T> boolean mo8991a(T t, C1795c<T> cVar) {
        C1766c cVar2;
        C1766c cVar3;
        AbstractC1758a<?, Float> aVar;
        AbstractC1758a<?, Float> aVar2;
        if (t == AbstractC1810j.f6202e) {
            AbstractC1758a<PointF, PointF> aVar3 = this.f6082f;
            if (aVar3 == null) {
                this.f6082f = new C1779p(cVar, new PointF());
                return true;
            }
            aVar3.mo8954a(cVar);
            return true;
        } else if (t == AbstractC1810j.f6203f) {
            AbstractC1758a<?, PointF> aVar4 = this.f6083g;
            if (aVar4 == null) {
                this.f6083g = new C1779p(cVar, new PointF());
                return true;
            }
            aVar4.mo8954a(cVar);
            return true;
        } else if (t == AbstractC1810j.f6208k) {
            AbstractC1758a<C1796d, C1796d> aVar5 = this.f6084h;
            if (aVar5 == null) {
                this.f6084h = new C1779p(cVar, new C1796d());
                return true;
            }
            aVar5.mo8954a(cVar);
            return true;
        } else if (t == AbstractC1810j.f6209l) {
            AbstractC1758a<Float, Float> aVar6 = this.f6085i;
            if (aVar6 == null) {
                this.f6085i = new C1779p(cVar, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
                return true;
            }
            aVar6.mo8954a(cVar);
            return true;
        } else if (t == AbstractC1810j.f6200c) {
            AbstractC1758a<Integer, Integer> aVar7 = this.f6086j;
            if (aVar7 == null) {
                this.f6086j = new C1779p(cVar, 100);
                return true;
            }
            aVar7.mo8954a(cVar);
            return true;
        } else if (t != AbstractC1810j.f6222y || (aVar2 = this.f6089m) == null) {
            if (t != AbstractC1810j.f6223z || (aVar = this.f6090n) == null) {
                if (t == AbstractC1810j.f6210m && (cVar3 = this.f6087k) != null) {
                    if (cVar3 == null) {
                        this.f6087k = new C1766c(Collections.singletonList(new C1793a(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED))));
                    }
                    this.f6087k.mo8954a(cVar);
                    return true;
                } else if (t != AbstractC1810j.f6211n || (cVar2 = this.f6088l) == null) {
                    return false;
                } else {
                    if (cVar2 == null) {
                        this.f6088l = new C1766c(Collections.singletonList(new C1793a(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED))));
                    }
                    this.f6088l.mo8954a(cVar);
                    return true;
                }
            } else if (aVar == null) {
                this.f6090n = new C1779p(cVar, 100);
                return true;
            } else {
                aVar.mo8954a(cVar);
                return true;
            }
        } else if (aVar2 == null) {
            this.f6089m = new C1779p(cVar, 100);
            return true;
        } else {
            aVar2.mo8954a(cVar);
            return true;
        }
    }
}
