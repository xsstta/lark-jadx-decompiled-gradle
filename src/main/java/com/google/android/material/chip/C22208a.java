package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.graphics.C0768a;
import androidx.core.graphics.drawable.AbstractC0780f;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.text.C0820a;
import com.google.android.material.internal.C22353j;
import com.google.android.material.internal.C22358l;
import com.google.android.material.p980a.C22123h;
import com.google.android.material.p981b.C22141a;
import com.google.android.material.p984e.C22269a;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.p988i.C22314d;
import com.google.android.material.p989j.C22375b;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.google.android.material.chip.a */
public class C22208a extends MaterialShapeDrawable implements Drawable.Callback, AbstractC0780f, C22353j.AbstractC22355a {

    /* renamed from: e */
    private static final int[] f54226e = {16842910};

    /* renamed from: f */
    private static final ShapeDrawable f54227f = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    private boolean f54228A;

    /* renamed from: B */
    private Drawable f54229B;

    /* renamed from: C */
    private ColorStateList f54230C;

    /* renamed from: D */
    private C22123h f54231D;

    /* renamed from: E */
    private C22123h f54232E;

    /* renamed from: F */
    private float f54233F;

    /* renamed from: G */
    private float f54234G;

    /* renamed from: H */
    private float f54235H;

    /* renamed from: I */
    private float f54236I;

    /* renamed from: J */
    private float f54237J;

    /* renamed from: K */
    private float f54238K;

    /* renamed from: L */
    private float f54239L;

    /* renamed from: M */
    private float f54240M;

    /* renamed from: N */
    private final Context f54241N;

    /* renamed from: O */
    private final Paint f54242O = new Paint(1);

    /* renamed from: P */
    private final Paint f54243P;

    /* renamed from: Q */
    private final Paint.FontMetrics f54244Q = new Paint.FontMetrics();

    /* renamed from: R */
    private final RectF f54245R = new RectF();

    /* renamed from: S */
    private final PointF f54246S = new PointF();

    /* renamed from: T */
    private final Path f54247T = new Path();

    /* renamed from: U */
    private final C22353j f54248U;

    /* renamed from: V */
    private int f54249V;

    /* renamed from: W */
    private int f54250W;

    /* renamed from: X */
    private int f54251X;

    /* renamed from: Y */
    private int f54252Y;

    /* renamed from: Z */
    private int f54253Z;
    private int aa;
    private boolean ab;
    private int ac;
    private int ad = 255;
    private ColorFilter ae;
    private PorterDuffColorFilter af;
    private ColorStateList ag;
    private PorterDuff.Mode ah = PorterDuff.Mode.SRC_IN;

    /* renamed from: ai  reason: collision with root package name */
    private int[] f175435ai;
    private boolean aj;
    private ColorStateList ak;
    private WeakReference<AbstractC22209a> al = new WeakReference<>(null);
    private TextUtils.TruncateAt am;
    private boolean an;
    private int ao;
    private boolean ap;

    /* renamed from: g */
    private ColorStateList f54254g;

    /* renamed from: h */
    private ColorStateList f54255h;

    /* renamed from: i */
    private float f54256i;

    /* renamed from: j */
    private float f54257j = -1.0f;

    /* renamed from: k */
    private ColorStateList f54258k;

    /* renamed from: l */
    private float f54259l;

    /* renamed from: m */
    private ColorStateList f54260m;

    /* renamed from: n */
    private CharSequence f54261n;

    /* renamed from: o */
    private boolean f54262o;

    /* renamed from: p */
    private Drawable f54263p;

    /* renamed from: q */
    private ColorStateList f54264q;

    /* renamed from: r */
    private float f54265r;

    /* renamed from: s */
    private boolean f54266s;

    /* renamed from: t */
    private boolean f54267t;

    /* renamed from: u */
    private Drawable f54268u;

    /* renamed from: v */
    private Drawable f54269v;

    /* renamed from: w */
    private ColorStateList f54270w;

    /* renamed from: x */
    private float f54271x;

    /* renamed from: y */
    private CharSequence f54272y;

    /* renamed from: z */
    private boolean f54273z;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface AbstractC22209a {
        /* renamed from: a */
        void mo76928a();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public int getOpacity() {
        return -3;
    }

    public int getIntrinsicHeight() {
        return (int) this.f54256i;
    }

    /* renamed from: A */
    public ColorStateList mo77114A() {
        return this.f54230C;
    }

    /* renamed from: B */
    public C22123h mo77116B() {
        return this.f54231D;
    }

    /* renamed from: C */
    public C22123h mo77118C() {
        return this.f54232E;
    }

    /* renamed from: D */
    public float mo77120D() {
        return this.f54233F;
    }

    /* renamed from: E */
    public float mo77121E() {
        return this.f54234G;
    }

    /* renamed from: F */
    public float mo77122F() {
        return this.f54235H;
    }

    /* renamed from: G */
    public float mo77123G() {
        return this.f54236I;
    }

    /* renamed from: H */
    public float mo77124H() {
        return this.f54237J;
    }

    /* renamed from: I */
    public float mo77125I() {
        return this.f54238K;
    }

    /* renamed from: J */
    public float mo77126J() {
        return this.f54239L;
    }

    /* renamed from: K */
    public float mo77127K() {
        return this.f54240M;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo77128L() {
        return this.an;
    }

    /* renamed from: g */
    public int[] mo77174g() {
        return this.f175435ai;
    }

    public int getAlpha() {
        return this.ad;
    }

    public ColorFilter getColorFilter() {
        return this.ae;
    }

    /* renamed from: h */
    public ColorStateList mo77181h() {
        return this.f54255h;
    }

    /* renamed from: i */
    public float mo77184i() {
        return this.f54256i;
    }

    /* renamed from: k */
    public ColorStateList mo77192k() {
        return this.f54258k;
    }

    /* renamed from: l */
    public float mo77195l() {
        return this.f54259l;
    }

    /* renamed from: m */
    public ColorStateList mo77198m() {
        return this.f54260m;
    }

    /* renamed from: n */
    public CharSequence mo77201n() {
        return this.f54261n;
    }

    /* renamed from: p */
    public TextUtils.TruncateAt mo77207p() {
        return this.am;
    }

    /* renamed from: r */
    public ColorStateList mo77211r() {
        return this.f54264q;
    }

    /* renamed from: s */
    public float mo77213s() {
        return this.f54265r;
    }

    /* renamed from: t */
    public boolean mo77220t() {
        return this.f54267t;
    }

    /* renamed from: v */
    public ColorStateList mo77224v() {
        return this.f54270w;
    }

    /* renamed from: w */
    public float mo77226w() {
        return this.f54271x;
    }

    /* renamed from: x */
    public CharSequence mo77228x() {
        return this.f54272y;
    }

    /* renamed from: y */
    public boolean mo77231y() {
        return this.f54273z;
    }

    /* renamed from: z */
    public Drawable mo77232z() {
        return this.f54229B;
    }

    /* renamed from: a */
    public void mo77140a(boolean z) {
        if (this.aj != z) {
            this.aj = z;
            ak();
            onStateChange(getState());
        }
    }

    /* renamed from: a */
    public boolean mo77141a() {
        return this.aj;
    }

    /* renamed from: a */
    public void mo77137a(AbstractC22209a aVar) {
        this.al = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public boolean mo77142a(int[] iArr) {
        if (Arrays.equals(this.f175435ai, iArr)) {
            return false;
        }
        this.f175435ai = iArr;
        if (ag()) {
            return m80204a(getState(), iArr);
        }
        return false;
    }

    /* renamed from: a */
    public void mo77131a(int i) {
        mo77132a(C0215a.m652a(this.f54241N, i));
    }

    /* renamed from: a */
    public void mo77132a(ColorStateList colorStateList) {
        if (this.f54255h != colorStateList) {
            this.f54255h = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: a */
    public void mo77139a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f54261n, charSequence)) {
            this.f54261n = charSequence;
            this.f54248U.mo77860a(true);
            invalidateSelf();
            mo77143b();
        }
    }

    /* renamed from: a */
    public void mo77138a(C22314d dVar) {
        this.f54248U.mo77858a(dVar, this.f54241N);
    }

    /* renamed from: b */
    public void mo77150b(boolean z) {
        if (this.f54262o != z) {
            boolean ae2 = ae();
            this.f54262o = z;
            boolean ae3 = ae();
            if (ae2 != ae3) {
                if (ae3) {
                    m80217f(this.f54263p);
                } else {
                    m80215e(this.f54263p);
                }
                invalidateSelf();
                mo77143b();
            }
        }
    }

    /* renamed from: a */
    public void mo77134a(Drawable drawable) {
        Drawable q = mo77209q();
        if (q != drawable) {
            float c = mo77151c();
            this.f54263p = drawable != null ? C0774a.m3779g(drawable).mutate() : null;
            float c2 = mo77151c();
            m80215e(q);
            if (ae()) {
                m80217f(this.f54263p);
            }
            invalidateSelf();
            if (c != c2) {
                mo77143b();
            }
        }
    }

    /* renamed from: b */
    public void mo77149b(CharSequence charSequence) {
        if (this.f54272y != charSequence) {
            this.f54272y = C0820a.m3933a().mo4432a(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo77136a(C22123h hVar) {
        this.f54231D = hVar;
    }

    private ColorFilter aj() {
        ColorFilter colorFilter = this.ae;
        if (colorFilter != null) {
            return colorFilter;
        }
        return this.af;
    }

    /* renamed from: f */
    public boolean mo77171f() {
        return m80212d(this.f54268u);
    }

    /* renamed from: o */
    public C22314d mo77203o() {
        return this.f54248U.mo77861b();
    }

    private boolean ae() {
        if (!this.f54262o || this.f54263p == null) {
            return false;
        }
        return true;
    }

    private boolean af() {
        if (!this.f54228A || this.f54229B == null || !this.ab) {
            return false;
        }
        return true;
    }

    private boolean ag() {
        if (!this.f54267t || this.f54268u == null) {
            return false;
        }
        return true;
    }

    private boolean ah() {
        if (!this.f54228A || this.f54229B == null || !this.f54273z) {
            return false;
        }
        return true;
    }

    private void ak() {
        ColorStateList colorStateList;
        if (this.aj) {
            colorStateList = C22375b.m81040b(this.f54260m);
        } else {
            colorStateList = null;
        }
        this.ak = colorStateList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo77143b() {
        AbstractC22209a aVar = this.al.get();
        if (aVar != null) {
            aVar.mo76928a();
        }
    }

    @Override // com.google.android.material.internal.C22353j.AbstractC22355a
    /* renamed from: e */
    public void mo76496e() {
        mo77143b();
        invalidateSelf();
    }

    /* renamed from: q */
    public Drawable mo77209q() {
        Drawable drawable = this.f54263p;
        if (drawable != null) {
            return C0774a.m3780h(drawable);
        }
        return null;
    }

    /* renamed from: u */
    public Drawable mo77221u() {
        Drawable drawable = this.f54268u;
        if (drawable != null) {
            return C0774a.m3780h(drawable);
        }
        return null;
    }

    private float ai() {
        this.f54248U.mo77856a().getFontMetrics(this.f54244Q);
        return (this.f54244Q.descent + this.f54244Q.ascent) / 2.0f;
    }

    private void al() {
        this.f54269v = new RippleDrawable(C22375b.m81040b(mo77198m()), this.f54268u, f54227f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo77151c() {
        if (ae() || af()) {
            return this.f54234G + this.f54265r + this.f54235H;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo77157d() {
        if (ag()) {
            return this.f54238K + this.f54271x + this.f54239L;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: j */
    public float mo77189j() {
        if (this.ap) {
            return mo77961Z();
        }
        return this.f54257j;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f54233F + mo77151c() + this.f54236I + this.f54248U.mo77855a(mo77201n().toString()) + this.f54237J + mo77157d() + this.f54240M), this.ao);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public boolean isStateful() {
        if (m80221i(this.f54254g) || m80221i(this.f54255h) || m80221i(this.f54258k) || ((this.aj && m80221i(this.ak)) || m80207b(this.f54248U.mo77861b()) || ah() || m80212d(this.f54263p) || m80212d(this.f54229B) || m80221i(this.ag))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo77135a(TextUtils.TruncateAt truncateAt) {
        this.am = truncateAt;
    }

    /* renamed from: b */
    public void mo77148b(C22123h hVar) {
        this.f54232E = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo77170f(boolean z) {
        this.an = z;
    }

    /* renamed from: e */
    private void m80215e(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: C */
    public void mo77119C(int i) {
        this.ao = i;
    }

    /* renamed from: a */
    public void mo77133a(RectF rectF) {
        m80214e(getBounds(), rectF);
    }

    /* renamed from: d */
    private static boolean m80212d(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m80221i(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m80222j(ColorStateList colorStateList) {
        if (this.f54254g != colorStateList) {
            this.f54254g = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: A */
    public void mo77115A(int i) {
        mo77196l(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: B */
    public void mo77117B(int i) {
        mo77199m(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: c */
    public void mo77153c(int i) {
        mo77144b(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: f */
    public void mo77167f(float f) {
        if (this.f54233F != f) {
            this.f54233F = f;
            invalidateSelf();
            mo77143b();
        }
    }

    /* renamed from: g */
    public void mo77173g(int i) {
        mo77138a(new C22314d(this.f54241N, i));
    }

    /* renamed from: h */
    public void mo77183h(int i) {
        mo77150b(this.f54241N.getResources().getBoolean(i));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* renamed from: k */
    public void mo77194k(int i) {
        mo77158d(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: l */
    public void mo77197l(int i) {
        mo77147b(C0215a.m655b(this.f54241N, i));
    }

    /* renamed from: m */
    public void mo77199m(float f) {
        if (this.f54240M != f) {
            this.f54240M = f;
            invalidateSelf();
            mo77143b();
        }
    }

    /* renamed from: n */
    public void mo77202n(int i) {
        mo77163e(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: o */
    public void mo77204o(int i) {
        mo77161d(this.f54241N.getResources().getBoolean(i));
    }

    @Override // com.google.android.material.internal.C22353j.AbstractC22355a, com.google.android.material.shape.MaterialShapeDrawable
    public boolean onStateChange(int[] iArr) {
        if (this.ap) {
            super.onStateChange(iArr);
        }
        return m80204a(iArr, mo77174g());
    }

    /* renamed from: p */
    public void mo77208p(int i) {
        mo77166e(this.f54241N.getResources().getBoolean(i));
    }

    /* renamed from: r */
    public void mo77212r(int i) {
        mo77169f(C0215a.m652a(this.f54241N, i));
    }

    /* renamed from: s */
    public void mo77214s(int i) {
        mo77136a(C22123h.m79717a(this.f54241N, i));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public void setAlpha(int i) {
        if (this.ad != i) {
            this.ad = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.ae != colorFilter) {
            this.ae = colorFilter;
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f, com.google.android.material.shape.MaterialShapeDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.ag != colorStateList) {
            this.ag = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: t */
    public void mo77219t(int i) {
        mo77148b(C22123h.m79717a(this.f54241N, i));
    }

    /* renamed from: v */
    public void mo77225v(int i) {
        mo77172g(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: w */
    public void mo77227w(int i) {
        mo77182h(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: x */
    public void mo77229x(int i) {
        mo77185i(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: y */
    public void mo77230y(int i) {
        mo77190j(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: z */
    public void mo77233z(int i) {
        mo77193k(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: b */
    private static boolean m80207b(C22314d dVar) {
        if (dVar == null || dVar.f54594b == null || !dVar.f54594b.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo77163e(float f) {
        if (this.f54271x != f) {
            this.f54271x = f;
            invalidateSelf();
            if (ag()) {
                mo77143b();
            }
        }
    }

    /* renamed from: f */
    public void mo77168f(int i) {
        mo77154c(C0215a.m652a(this.f54241N, i));
    }

    /* renamed from: g */
    public void mo77172g(float f) {
        if (this.f54234G != f) {
            float c = mo77151c();
            this.f54234G = f;
            float c2 = mo77151c();
            invalidateSelf();
            if (c != c2) {
                mo77143b();
            }
        }
    }

    /* renamed from: h */
    public void mo77182h(float f) {
        if (this.f54235H != f) {
            float c = mo77151c();
            this.f54235H = f;
            float c2 = mo77151c();
            invalidateSelf();
            if (c != c2) {
                mo77143b();
            }
        }
    }

    /* renamed from: i */
    public void mo77185i(float f) {
        if (this.f54236I != f) {
            this.f54236I = f;
            invalidateSelf();
            mo77143b();
        }
    }

    /* renamed from: k */
    public void mo77193k(float f) {
        if (this.f54238K != f) {
            this.f54238K = f;
            invalidateSelf();
            if (ag()) {
                mo77143b();
            }
        }
    }

    /* renamed from: l */
    public void mo77196l(float f) {
        if (this.f54239L != f) {
            this.f54239L = f;
            invalidateSelf();
            if (ag()) {
                mo77143b();
            }
        }
    }

    /* renamed from: m */
    public void mo77200m(int i) {
        mo77165e(C0215a.m652a(this.f54241N, i));
    }

    /* renamed from: q */
    public void mo77210q(int i) {
        mo77155c(C0215a.m655b(this.f54241N, i));
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f, com.google.android.material.shape.MaterialShapeDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.ah != mode) {
            this.ah = mode;
            this.af = C22269a.m80565a(this, this.ag, mode);
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public void mo77222u(int i) {
        mo77167f(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: c */
    public void mo77152c(float f) {
        if (this.f54259l != f) {
            this.f54259l = f;
            this.f54242O.setStrokeWidth(f);
            if (this.ap) {
                super.mo77981n(f);
            }
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public void getOutline(Outline outline) {
        if (this.ap) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f54257j);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f54257j);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: i */
    public void mo77186i(int i) {
        mo77134a(C0215a.m655b(this.f54241N, i));
    }

    /* renamed from: j */
    public void mo77190j(float f) {
        if (this.f54237J != f) {
            this.f54237J = f;
            invalidateSelf();
            mo77143b();
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (ae()) {
            onLayoutDirectionChanged |= C0774a.m3774b(this.f54263p, i);
        }
        if (af()) {
            onLayoutDirectionChanged |= C0774a.m3774b(this.f54229B, i);
        }
        if (ag()) {
            onLayoutDirectionChanged |= C0774a.m3774b(this.f54268u, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (ae()) {
            onLevelChange |= this.f54263p.setLevel(i);
        }
        if (af()) {
            onLevelChange |= this.f54229B.setLevel(i);
        }
        if (ag()) {
            onLevelChange |= this.f54268u.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    /* renamed from: f */
    private void m80217f(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0774a.m3774b(drawable, C0774a.m3781i(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f54268u) {
                if (drawable.isStateful()) {
                    drawable.setState(mo77174g());
                }
                C0774a.m3768a(drawable, this.f54270w);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f54263p;
            if (drawable == drawable2 && this.f54266s) {
                C0774a.m3768a(drawable2, this.f54264q);
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            if (this.ad < 255) {
                i = C22141a.m79796a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.ad);
            }
            m80200a(canvas, bounds);
            m80205b(canvas, bounds);
            if (this.ap) {
                super.draw(canvas);
            }
            m80208c(canvas, bounds);
            m80210d(canvas, bounds);
            m80213e(canvas, bounds);
            m80216f(canvas, bounds);
            if (this.an) {
                m80218g(canvas, bounds);
            }
            m80219h(canvas, bounds);
            m80220i(canvas, bounds);
            if (this.ad < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: j */
    public void mo77191j(int i) {
        mo77160d(C0215a.m652a(this.f54241N, i));
    }

    /* renamed from: b */
    public void mo77144b(float f) {
        if (this.f54257j != f) {
            this.f54257j = f;
            setShapeAppearanceModel(getShapeAppearanceModel().mo78002a(f));
        }
    }

    /* renamed from: d */
    public void mo77158d(float f) {
        if (this.f54265r != f) {
            float c = mo77151c();
            this.f54265r = f;
            float c2 = mo77151c();
            invalidateSelf();
            if (c != c2) {
                mo77143b();
            }
        }
    }

    /* renamed from: e */
    public void mo77164e(int i) {
        mo77152c(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: f */
    public void mo77169f(ColorStateList colorStateList) {
        if (this.f54230C != colorStateList) {
            this.f54230C = colorStateList;
            if (ah()) {
                C0774a.m3768a(this.f54229B, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: b */
    public void mo77145b(int i) {
        mo77130a(this.f54241N.getResources().getDimension(i));
    }

    /* renamed from: c */
    public void mo77154c(ColorStateList colorStateList) {
        if (this.f54260m != colorStateList) {
            this.f54260m = colorStateList;
            ak();
            onStateChange(getState());
        }
    }

    /* renamed from: d */
    public void mo77159d(int i) {
        mo77146b(C0215a.m652a(this.f54241N, i));
    }

    /* renamed from: e */
    public void mo77165e(ColorStateList colorStateList) {
        if (this.f54270w != colorStateList) {
            this.f54270w = colorStateList;
            if (ag()) {
                C0774a.m3768a(this.f54268u, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: b */
    public void mo77146b(ColorStateList colorStateList) {
        if (this.f54258k != colorStateList) {
            this.f54258k = colorStateList;
            if (this.ap) {
                mo77978h(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: c */
    public void mo77155c(Drawable drawable) {
        if (this.f54229B != drawable) {
            float c = mo77151c();
            this.f54229B = drawable;
            float c2 = mo77151c();
            m80215e(this.f54229B);
            m80217f(this.f54229B);
            invalidateSelf();
            if (c != c2) {
                mo77143b();
            }
        }
    }

    /* renamed from: d */
    public void mo77160d(ColorStateList colorStateList) {
        this.f54266s = true;
        if (this.f54264q != colorStateList) {
            this.f54264q = colorStateList;
            if (ae()) {
                C0774a.m3768a(this.f54263p, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: e */
    public void mo77166e(boolean z) {
        boolean z2;
        if (this.f54228A != z) {
            boolean af2 = af();
            this.f54228A = z;
            boolean af3 = af();
            if (af2 != af3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (af3) {
                    m80217f(this.f54229B);
                } else {
                    m80215e(this.f54229B);
                }
                invalidateSelf();
                mo77143b();
            }
        }
    }

    /* renamed from: a */
    public void mo77130a(float f) {
        if (this.f54256i != f) {
            this.f54256i = f;
            invalidateSelf();
            mo77143b();
        }
    }

    /* renamed from: b */
    public void mo77147b(Drawable drawable) {
        Drawable drawable2;
        Drawable u = mo77221u();
        if (u != drawable) {
            float d = mo77157d();
            if (drawable != null) {
                drawable2 = C0774a.m3779g(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f54268u = drawable2;
            if (C22375b.f54805a) {
                al();
            }
            float d2 = mo77157d();
            m80215e(u);
            if (ag()) {
                m80217f(this.f54268u);
            }
            invalidateSelf();
            if (d != d2) {
                mo77143b();
            }
        }
    }

    /* renamed from: c */
    public void mo77156c(boolean z) {
        boolean z2;
        if (this.f54267t != z) {
            boolean ag2 = ag();
            this.f54267t = z;
            boolean ag3 = ag();
            if (ag2 != ag3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (ag3) {
                    m80217f(this.f54268u);
                } else {
                    m80215e(this.f54268u);
                }
                invalidateSelf();
                mo77143b();
            }
        }
    }

    /* renamed from: d */
    public void mo77161d(boolean z) {
        if (this.f54273z != z) {
            this.f54273z = z;
            float c = mo77151c();
            if (!z && this.ab) {
                this.ab = false;
            }
            float c2 = mo77151c();
            invalidateSelf();
            if (c != c2) {
                mo77143b();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    private static boolean m80203a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m80200a(Canvas canvas, Rect rect) {
        if (!this.ap) {
            this.f54242O.setColor(this.f54249V);
            this.f54242O.setStyle(Paint.Style.FILL);
            this.f54245R.set(rect);
            canvas.drawRoundRect(this.f54245R, mo77189j(), mo77189j(), this.f54242O);
        }
    }

    /* renamed from: b */
    private void m80205b(Canvas canvas, Rect rect) {
        if (!this.ap) {
            this.f54242O.setColor(this.f54250W);
            this.f54242O.setStyle(Paint.Style.FILL);
            this.f54242O.setColorFilter(aj());
            this.f54245R.set(rect);
            canvas.drawRoundRect(this.f54245R, mo77189j(), mo77189j(), this.f54242O);
        }
    }

    /* renamed from: d */
    private void m80210d(Canvas canvas, Rect rect) {
        this.f54242O.setColor(this.f54253Z);
        this.f54242O.setStyle(Paint.Style.FILL);
        this.f54245R.set(rect);
        if (!this.ap) {
            canvas.drawRoundRect(this.f54245R, mo77189j(), mo77189j(), this.f54242O);
            return;
        }
        mo77968a(new RectF(rect), this.f54247T);
        super.mo77966a(canvas, this.f54242O, this.f54247T, mo77950O());
    }

    /* renamed from: e */
    private void m80213e(Canvas canvas, Rect rect) {
        if (ae()) {
            m80201a(rect, this.f54245R);
            float f = this.f54245R.left;
            float f2 = this.f54245R.top;
            canvas.translate(f, f2);
            this.f54263p.setBounds(0, 0, (int) this.f54245R.width(), (int) this.f54245R.height());
            this.f54263p.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: f */
    private void m80216f(Canvas canvas, Rect rect) {
        if (af()) {
            m80201a(rect, this.f54245R);
            float f = this.f54245R.left;
            float f2 = this.f54245R.top;
            canvas.translate(f, f2);
            this.f54229B.setBounds(0, 0, (int) this.f54245R.width(), (int) this.f54245R.height());
            this.f54229B.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (ae()) {
            visible |= this.f54263p.setVisible(z, z2);
        }
        if (af()) {
            visible |= this.f54229B.setVisible(z, z2);
        }
        if (ag()) {
            visible |= this.f54268u.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: a */
    private void m80201a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (ae() || af()) {
            float f = this.f54233F + this.f54234G;
            if (C0774a.m3781i(this) == 0) {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f54265r;
            } else {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f54265r;
            }
            rectF.top = rect.exactCenterY() - (this.f54265r / 2.0f);
            rectF.bottom = rectF.top + this.f54265r;
        }
    }

    /* renamed from: b */
    private void m80206b(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f54261n != null) {
            float c = this.f54233F + mo77151c() + this.f54236I;
            float d = this.f54240M + mo77157d() + this.f54237J;
            if (C0774a.m3781i(this) == 0) {
                rectF.left = ((float) rect.left) + c;
                rectF.right = ((float) rect.right) - d;
            } else {
                rectF.left = ((float) rect.left) + d;
                rectF.right = ((float) rect.right) - c;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: c */
    private void m80208c(Canvas canvas, Rect rect) {
        if (this.f54259l > BitmapDescriptorFactory.HUE_RED && !this.ap) {
            this.f54242O.setColor(this.f54252Y);
            this.f54242O.setStyle(Paint.Style.STROKE);
            if (!this.ap) {
                this.f54242O.setColorFilter(aj());
            }
            this.f54245R.set(((float) rect.left) + (this.f54259l / 2.0f), ((float) rect.top) + (this.f54259l / 2.0f), ((float) rect.right) - (this.f54259l / 2.0f), ((float) rect.bottom) - (this.f54259l / 2.0f));
            float f = this.f54257j - (this.f54259l / 2.0f);
            canvas.drawRoundRect(this.f54245R, f, f, this.f54242O);
        }
    }

    /* renamed from: d */
    private void m80211d(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (ag()) {
            float f = this.f54240M + this.f54239L + this.f54271x + this.f54238K + this.f54237J;
            if (C0774a.m3781i(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: e */
    private void m80214e(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (ag()) {
            float f = this.f54240M + this.f54239L + this.f54271x + this.f54238K + this.f54237J;
            if (C0774a.m3781i(this) == 0) {
                rectF.right = (float) rect.right;
                rectF.left = rectF.right - f;
            } else {
                rectF.left = (float) rect.left;
                rectF.right = ((float) rect.left) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: h */
    private void m80219h(Canvas canvas, Rect rect) {
        if (ag()) {
            m80209c(rect, this.f54245R);
            float f = this.f54245R.left;
            float f2 = this.f54245R.top;
            canvas.translate(f, f2);
            this.f54268u.setBounds(0, 0, (int) this.f54245R.width(), (int) this.f54245R.height());
            if (C22375b.f54805a) {
                this.f54269v.setBounds(this.f54268u.getBounds());
                this.f54269v.jumpToCurrentState();
                this.f54269v.draw(canvas);
            } else {
                this.f54268u.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: c */
    private void m80209c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (ag()) {
            float f = this.f54240M + this.f54239L;
            if (C0774a.m3781i(this) == 0) {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f54271x;
            } else {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f54271x;
            }
            rectF.top = rect.exactCenterY() - (this.f54271x / 2.0f);
            rectF.bottom = rectF.top + this.f54271x;
        }
    }

    /* renamed from: g */
    private void m80218g(Canvas canvas, Rect rect) {
        boolean z;
        if (this.f54261n != null) {
            Paint.Align a = mo77129a(rect, this.f54246S);
            m80206b(rect, this.f54245R);
            if (this.f54248U.mo77861b() != null) {
                this.f54248U.mo77856a().drawableState = getState();
                this.f54248U.mo77857a(this.f54241N);
            }
            this.f54248U.mo77856a().setTextAlign(a);
            int i = 0;
            if (Math.round(this.f54248U.mo77855a(mo77201n().toString())) > Math.round(this.f54245R.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f54245R);
            }
            CharSequence charSequence = this.f54261n;
            if (z && this.am != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f54248U.mo77856a(), this.f54245R.width(), this.am);
            }
            canvas.drawText(charSequence, 0, charSequence.length(), this.f54246S.x, this.f54246S.y, this.f54248U.mo77856a());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: i */
    private void m80220i(Canvas canvas, Rect rect) {
        Paint paint = this.f54243P;
        if (paint != null) {
            paint.setColor(C0768a.m3716c(-16777216, SmActions.ACTION_ONTHECALL_ENTRY));
            canvas.drawRect(rect, this.f54243P);
            if (ae() || af()) {
                m80201a(rect, this.f54245R);
                canvas.drawRect(this.f54245R, this.f54243P);
            }
            if (this.f54261n != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f54243P);
            }
            if (ag()) {
                m80209c(rect, this.f54245R);
                canvas.drawRect(this.f54245R, this.f54243P);
            }
            this.f54243P.setColor(C0768a.m3716c(-65536, SmActions.ACTION_ONTHECALL_ENTRY));
            m80211d(rect, this.f54245R);
            canvas.drawRect(this.f54245R, this.f54243P);
            this.f54243P.setColor(C0768a.m3716c(-16711936, SmActions.ACTION_ONTHECALL_ENTRY));
            m80214e(rect, this.f54245R);
            canvas.drawRect(this.f54245R, this.f54243P);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Paint.Align mo77129a(Rect rect, PointF pointF) {
        pointF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f54261n != null) {
            float c = this.f54233F + mo77151c() + this.f54236I;
            if (C0774a.m3781i(this) == 0) {
                pointF.x = ((float) rect.left) + c;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - c;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - ai();
        }
        return align;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m80204a(int[] r7, int[] r8) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C22208a.m80204a(int[], int[]):boolean");
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    /* renamed from: a */
    private void m80202a(AttributeSet attributeSet, int i, int i2) {
        TypedArray a = C22358l.m80999a(this.f54241N, attributeSet, new int[]{16842804, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding}, i, i2, new int[0]);
        this.ap = a.hasValue(36);
        m80222j(C22313c.m80795a(this.f54241N, a, 23));
        mo77132a(C22313c.m80795a(this.f54241N, a, 10));
        mo77130a(a.getDimension(18, BitmapDescriptorFactory.HUE_RED));
        if (a.hasValue(11)) {
            mo77144b(a.getDimension(11, BitmapDescriptorFactory.HUE_RED));
        }
        mo77146b(C22313c.m80795a(this.f54241N, a, 21));
        mo77152c(a.getDimension(22, BitmapDescriptorFactory.HUE_RED));
        mo77154c(C22313c.m80795a(this.f54241N, a, 35));
        mo77139a(a.getText(4));
        mo77138a(C22313c.m80798c(this.f54241N, a, 0));
        int i3 = a.getInt(2, 0);
        if (i3 == 1) {
            mo77135a(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            mo77135a(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            mo77135a(TextUtils.TruncateAt.END);
        }
        mo77150b(a.getBoolean(17, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            mo77150b(a.getBoolean(14, false));
        }
        mo77134a(C22313c.m80797b(this.f54241N, a, 13));
        if (a.hasValue(16)) {
            mo77160d(C22313c.m80795a(this.f54241N, a, 16));
        }
        mo77158d(a.getDimension(15, BitmapDescriptorFactory.HUE_RED));
        mo77156c(a.getBoolean(30, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            mo77156c(a.getBoolean(25, false));
        }
        mo77147b(C22313c.m80797b(this.f54241N, a, 24));
        mo77165e(C22313c.m80795a(this.f54241N, a, 29));
        mo77163e(a.getDimension(27, BitmapDescriptorFactory.HUE_RED));
        mo77161d(a.getBoolean(5, false));
        mo77166e(a.getBoolean(9, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            mo77166e(a.getBoolean(7, false));
        }
        mo77155c(C22313c.m80797b(this.f54241N, a, 6));
        if (a.hasValue(8)) {
            mo77169f(C22313c.m80795a(this.f54241N, a, 8));
        }
        mo77136a(C22123h.m79718a(this.f54241N, a, 38));
        mo77148b(C22123h.m79718a(this.f54241N, a, 32));
        mo77167f(a.getDimension(20, BitmapDescriptorFactory.HUE_RED));
        mo77172g(a.getDimension(34, BitmapDescriptorFactory.HUE_RED));
        mo77182h(a.getDimension(33, BitmapDescriptorFactory.HUE_RED));
        mo77185i(a.getDimension(40, BitmapDescriptorFactory.HUE_RED));
        mo77190j(a.getDimension(39, BitmapDescriptorFactory.HUE_RED));
        mo77193k(a.getDimension(28, BitmapDescriptorFactory.HUE_RED));
        mo77196l(a.getDimension(26, BitmapDescriptorFactory.HUE_RED));
        mo77199m(a.getDimension(12, BitmapDescriptorFactory.HUE_RED));
        mo77119C(a.getDimensionPixelSize(3, Integer.MAX_VALUE));
        a.recycle();
    }

    /* renamed from: a */
    public static C22208a m80199a(Context context, AttributeSet attributeSet, int i, int i2) {
        C22208a aVar = new C22208a(context, attributeSet, i, i2);
        aVar.m80202a(attributeSet, i, i2);
        return aVar;
    }

    private C22208a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo77965a(context);
        this.f54241N = context;
        C22353j jVar = new C22353j(this);
        this.f54248U = jVar;
        this.f54261n = "";
        jVar.mo77856a().density = context.getResources().getDisplayMetrics().density;
        this.f54243P = null;
        int[] iArr = f54226e;
        setState(iArr);
        mo77142a(iArr);
        this.an = true;
        if (C22375b.f54805a) {
            f54227f.setTint(-1);
        }
    }
}
