package com.airbnb.lottie.p067a.p068a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C0516c;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.C1783c;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.C1838c;
import com.airbnb.lottie.model.content.C1839d;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.C1734a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1779p;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.h */
public class C1744h implements AbstractC1741e, AbstractC1747k, AbstractC1758a.AbstractC1760a {

    /* renamed from: a */
    private final String f5956a;

    /* renamed from: b */
    private final boolean f5957b;

    /* renamed from: c */
    private final AbstractC1852a f5958c;

    /* renamed from: d */
    private final C0516c<LinearGradient> f5959d = new C0516c<>();

    /* renamed from: e */
    private final C0516c<RadialGradient> f5960e = new C0516c<>();

    /* renamed from: f */
    private final Path f5961f;

    /* renamed from: g */
    private final Paint f5962g;

    /* renamed from: h */
    private final RectF f5963h;

    /* renamed from: i */
    private final List<AbstractC1750m> f5964i;

    /* renamed from: j */
    private final GradientType f5965j;

    /* renamed from: k */
    private final AbstractC1758a<C1838c, C1838c> f5966k;

    /* renamed from: l */
    private final AbstractC1758a<Integer, Integer> f5967l;

    /* renamed from: m */
    private final AbstractC1758a<PointF, PointF> f5968m;

    /* renamed from: n */
    private final AbstractC1758a<PointF, PointF> f5969n;

    /* renamed from: o */
    private AbstractC1758a<ColorFilter, ColorFilter> f5970o;

    /* renamed from: p */
    private C1779p f5971p;

    /* renamed from: q */
    private final LottieDrawable f5972q;

    /* renamed from: r */
    private final int f5973r;

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f5956a;
    }

    @Override // com.airbnb.lottie.p067a.p069b.AbstractC1758a.AbstractC1760a
    /* renamed from: a */
    public void mo8931a() {
        this.f5972q.invalidateSelf();
    }

    /* renamed from: c */
    private LinearGradient m7791c() {
        long e = (long) m7793e();
        LinearGradient a = this.f5959d.mo2959a(e);
        if (a != null) {
            return a;
        }
        PointF g = this.f5968m.mo8960g();
        PointF g2 = this.f5969n.mo8960g();
        C1838c g3 = this.f5966k.mo8960g();
        LinearGradient linearGradient = new LinearGradient(g.x, g.y, g2.x, g2.y, m7790a(g3.mo9201b()), g3.mo9200a(), Shader.TileMode.CLAMP);
        this.f5959d.mo2965b(e, linearGradient);
        return linearGradient;
    }

    /* renamed from: d */
    private RadialGradient m7792d() {
        float f;
        long e = (long) m7793e();
        RadialGradient a = this.f5960e.mo2959a(e);
        if (a != null) {
            return a;
        }
        PointF g = this.f5968m.mo8960g();
        PointF g2 = this.f5969n.mo8960g();
        C1838c g3 = this.f5966k.mo8960g();
        int[] a2 = m7790a(g3.mo9201b());
        float[] a3 = g3.mo9200a();
        float f2 = g.x;
        float f3 = g.y;
        float hypot = (float) Math.hypot((double) (g2.x - f2), (double) (g2.y - f3));
        if (hypot <= BitmapDescriptorFactory.HUE_RED) {
            f = 0.001f;
        } else {
            f = hypot;
        }
        RadialGradient radialGradient = new RadialGradient(f2, f3, f, a2, a3, Shader.TileMode.CLAMP);
        this.f5960e.mo2965b(e, radialGradient);
        return radialGradient;
    }

    /* renamed from: e */
    private int m7793e() {
        int i;
        int round = Math.round(this.f5968m.mo8961h() * ((float) this.f5973r));
        int round2 = Math.round(this.f5969n.mo8961h() * ((float) this.f5973r));
        int round3 = Math.round(this.f5966k.mo8961h() * ((float) this.f5973r));
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    /* renamed from: a */
    private int[] m7790a(int[] iArr) {
        C1779p pVar = this.f5971p;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.mo8960g();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            AbstractC1739c cVar = list2.get(i);
            if (cVar instanceof AbstractC1750m) {
                this.f5964i.add((AbstractC1750m) cVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        if (t == AbstractC1810j.f6201d) {
            this.f5967l.mo8954a(cVar);
        } else if (t == AbstractC1810j.f6196C) {
            AbstractC1758a<ColorFilter, ColorFilter> aVar = this.f5970o;
            if (aVar != null) {
                this.f5958c.mo9298b(aVar);
            }
            if (cVar == null) {
                this.f5970o = null;
                return;
            }
            C1779p pVar = new C1779p(cVar);
            this.f5970o = pVar;
            pVar.mo8953a(this);
            this.f5958c.mo9294a(this.f5970o);
        } else if (t == AbstractC1810j.f6197D) {
            C1779p pVar2 = this.f5971p;
            if (pVar2 != null) {
                this.f5958c.mo9298b(pVar2);
            }
            if (cVar == null) {
                this.f5971p = null;
                return;
            }
            C1779p pVar3 = new C1779p(cVar);
            this.f5971p = pVar3;
            pVar3.mo8953a(this);
            this.f5958c.mo9294a(this.f5971p);
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        this.f5961f.reset();
        for (int i = 0; i < this.f5964i.size(); i++) {
            this.f5961f.addPath(this.f5964i.get(i).mo8942e(), matrix);
        }
        this.f5961f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public C1744h(LottieDrawable lottieDrawable, AbstractC1852a aVar, C1839d dVar) {
        Path path = new Path();
        this.f5961f = path;
        this.f5962g = new C1734a(1);
        this.f5963h = new RectF();
        this.f5964i = new ArrayList();
        this.f5958c = aVar;
        this.f5956a = dVar.mo9203a();
        this.f5957b = dVar.mo9210h();
        this.f5972q = lottieDrawable;
        this.f5965j = dVar.mo9204b();
        path.setFillType(dVar.mo9205c());
        this.f5973r = (int) (lottieDrawable.mo8845A().mo9063e() / 32.0f);
        AbstractC1758a<C1838c, C1838c> a = dVar.mo9206d().mo9135a();
        this.f5966k = a;
        a.mo8953a(this);
        aVar.mo9294a(a);
        AbstractC1758a<Integer, Integer> a2 = dVar.mo9207e().mo9135a();
        this.f5967l = a2;
        a2.mo8953a(this);
        aVar.mo9294a(a2);
        AbstractC1758a<PointF, PointF> a3 = dVar.mo9208f().mo9135a();
        this.f5968m = a3;
        a3.mo8953a(this);
        aVar.mo9294a(a3);
        AbstractC1758a<PointF, PointF> a4 = dVar.mo9209g().mo9135a();
        this.f5969n = a4;
        a4.mo8953a(this);
        aVar.mo9294a(a4);
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8932a(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f5957b) {
            C1783c.m7956a("GradientFillContent#draw");
            this.f5961f.reset();
            for (int i2 = 0; i2 < this.f5964i.size(); i2++) {
                this.f5961f.addPath(this.f5964i.get(i2).mo8942e(), matrix);
            }
            this.f5961f.computeBounds(this.f5963h, false);
            if (this.f5965j == GradientType.LINEAR) {
                shader = m7791c();
            } else {
                shader = m7792d();
            }
            shader.setLocalMatrix(matrix);
            this.f5962g.setShader(shader);
            AbstractC1758a<ColorFilter, ColorFilter> aVar = this.f5970o;
            if (aVar != null) {
                this.f5962g.setColorFilter(aVar.mo8960g());
            }
            this.f5962g.setAlpha(C1790g.m8004a((int) ((((((float) i) / 255.0f) * ((float) this.f5967l.mo8960g().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f5961f, this.f5962g);
            C1783c.m7957b("GradientFillContent#draw");
        }
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e
    /* renamed from: a */
    public void mo8934a(C1847d dVar, int i, List<C1847d> list, C1847d dVar2) {
        C1790g.m8007a(dVar, i, list, dVar2, this);
    }
}
