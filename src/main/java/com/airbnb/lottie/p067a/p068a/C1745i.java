package com.airbnb.lottie.p067a.p068a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C0516c;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.C1838c;
import com.airbnb.lottie.model.content.C1840e;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1779p;
import com.airbnb.lottie.p072d.C1795c;

/* renamed from: com.airbnb.lottie.a.a.i */
public class C1745i extends AbstractC1735a {

    /* renamed from: c */
    private final String f5974c;

    /* renamed from: d */
    private final boolean f5975d;

    /* renamed from: e */
    private final C0516c<LinearGradient> f5976e = new C0516c<>();

    /* renamed from: f */
    private final C0516c<RadialGradient> f5977f = new C0516c<>();

    /* renamed from: g */
    private final RectF f5978g = new RectF();

    /* renamed from: h */
    private final GradientType f5979h;

    /* renamed from: i */
    private final int f5980i;

    /* renamed from: j */
    private final AbstractC1758a<C1838c, C1838c> f5981j;

    /* renamed from: k */
    private final AbstractC1758a<PointF, PointF> f5982k;

    /* renamed from: l */
    private final AbstractC1758a<PointF, PointF> f5983l;

    /* renamed from: m */
    private C1779p f5984m;

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f5974c;
    }

    /* renamed from: c */
    private LinearGradient m7802c() {
        long e = (long) m7804e();
        LinearGradient a = this.f5976e.mo2959a(e);
        if (a != null) {
            return a;
        }
        PointF g = this.f5982k.mo8960g();
        PointF g2 = this.f5983l.mo8960g();
        C1838c g3 = this.f5981j.mo8960g();
        LinearGradient linearGradient = new LinearGradient(g.x, g.y, g2.x, g2.y, m7801a(g3.mo9201b()), g3.mo9200a(), Shader.TileMode.CLAMP);
        this.f5976e.mo2965b(e, linearGradient);
        return linearGradient;
    }

    /* renamed from: d */
    private RadialGradient m7803d() {
        long e = (long) m7804e();
        RadialGradient a = this.f5977f.mo2959a(e);
        if (a != null) {
            return a;
        }
        PointF g = this.f5982k.mo8960g();
        PointF g2 = this.f5983l.mo8960g();
        C1838c g3 = this.f5981j.mo8960g();
        int[] a2 = m7801a(g3.mo9201b());
        float[] a3 = g3.mo9200a();
        float f = g.x;
        float f2 = g.y;
        RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot((double) (g2.x - f), (double) (g2.y - f2)), a2, a3, Shader.TileMode.CLAMP);
        this.f5977f.mo2965b(e, radialGradient);
        return radialGradient;
    }

    /* renamed from: e */
    private int m7804e() {
        int i;
        int round = Math.round(this.f5982k.mo8961h() * ((float) this.f5980i));
        int round2 = Math.round(this.f5983l.mo8961h() * ((float) this.f5980i));
        int round3 = Math.round(this.f5981j.mo8961h() * ((float) this.f5980i));
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
    private int[] m7801a(int[] iArr) {
        C1779p pVar = this.f5984m;
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.AbstractC1848e, com.airbnb.lottie.p067a.p068a.AbstractC1735a
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        super.mo8935a(t, cVar);
        if (t == AbstractC1810j.f6197D) {
            if (this.f5984m != null) {
                this.f5910a.mo9298b(this.f5984m);
            }
            if (cVar == null) {
                this.f5984m = null;
                return;
            }
            C1779p pVar = new C1779p(cVar);
            this.f5984m = pVar;
            pVar.mo8953a(this);
            this.f5910a.mo9294a(this.f5984m);
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1735a, com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8932a(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f5975d) {
            mo8933a(this.f5978g, matrix, false);
            if (this.f5979h == GradientType.LINEAR) {
                shader = m7802c();
            } else {
                shader = m7803d();
            }
            shader.setLocalMatrix(matrix);
            this.f5911b.setShader(shader);
            super.mo8932a(canvas, matrix, i);
        }
    }

    public C1745i(LottieDrawable lottieDrawable, AbstractC1852a aVar, C1840e eVar) {
        super(lottieDrawable, aVar, eVar.mo9218h().toPaintCap(), eVar.mo9219i().toPaintJoin(), eVar.mo9222l(), eVar.mo9214d(), eVar.mo9217g(), eVar.mo9220j(), eVar.mo9221k());
        this.f5974c = eVar.mo9211a();
        this.f5979h = eVar.mo9212b();
        this.f5975d = eVar.mo9223m();
        this.f5980i = (int) (lottieDrawable.mo8845A().mo9063e() / 32.0f);
        AbstractC1758a<C1838c, C1838c> a = eVar.mo9213c().mo9135a();
        this.f5981j = a;
        a.mo8953a(this);
        aVar.mo9294a(a);
        AbstractC1758a<PointF, PointF> a2 = eVar.mo9215e().mo9135a();
        this.f5982k = a2;
        a2.mo8953a(this);
        aVar.mo9294a(a2);
        AbstractC1758a<PointF, PointF> a3 = eVar.mo9216f().mo9135a();
        this.f5983l = a3;
        a3.mo8953a(this);
        aVar.mo9294a(a3);
    }
}
