package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.AbstractC0780f;
import androidx.core.util.C0843d;
import com.google.android.material.p982c.C22197a;
import com.google.android.material.p985f.C22270a;
import com.google.android.material.p990k.C22376a;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.C22402m;
import com.google.android.material.shape.C22405n;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

public class MaterialShapeDrawable extends Drawable implements AbstractC0780f, AbstractC22413o {

    /* renamed from: e */
    private static final String f54861e = "MaterialShapeDrawable";

    /* renamed from: f */
    private static final Paint f54862f = new Paint(1);

    /* renamed from: a */
    public final C22405n.AbstractC22412f[] f54863a;

    /* renamed from: b */
    public final C22405n.AbstractC22412f[] f54864b;

    /* renamed from: c */
    public final BitSet f54865c;

    /* renamed from: d */
    public boolean f54866d;

    /* renamed from: g */
    private C22386a f54867g;

    /* renamed from: h */
    private final Matrix f54868h;

    /* renamed from: i */
    private final Path f54869i;

    /* renamed from: j */
    private final Path f54870j;

    /* renamed from: k */
    private final RectF f54871k;

    /* renamed from: l */
    private final RectF f54872l;

    /* renamed from: m */
    private final Region f54873m;

    /* renamed from: n */
    private final Region f54874n;

    /* renamed from: o */
    private C22398l f54875o;

    /* renamed from: p */
    private final Paint f54876p;

    /* renamed from: q */
    private final Paint f54877q;

    /* renamed from: r */
    private final C22376a f54878r;

    /* renamed from: s */
    private final C22402m.AbstractC22403a f54879s;

    /* renamed from: t */
    private final C22402m f54880t;

    /* renamed from: u */
    private PorterDuffColorFilter f54881u;

    /* renamed from: v */
    private PorterDuffColorFilter f54882v;

    /* renamed from: w */
    private final RectF f54883w;

    /* renamed from: x */
    private boolean f54884x;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    /* renamed from: a */
    private static int m81076a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: b */
    private void mo77143b() {
        super.invalidateSelf();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f54867g;
    }

    /* renamed from: a */
    public void mo77962a(float f, int i) {
        mo77981n(f);
        mo77978h(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public void mo77963a(float f, ColorStateList colorStateList) {
        mo77981n(f);
        mo77978h(colorStateList);
    }

    /* renamed from: a */
    public void mo77964a(int i, int i2, int i3, int i4) {
        if (this.f54867g.f54896i == null) {
            this.f54867g.f54896i = new Rect();
        }
        this.f54867g.f54896i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo77965a(Context context) {
        this.f54867g.f54889b = new C22270a(context);
        mo77141a();
    }

    /* renamed from: a */
    public void mo77967a(Paint.Style style) {
        this.f54867g.f54909v = style;
        mo77143b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo77966a(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m81083a(canvas, paint, path, this.f54867g.f54888a, rectF);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77968a(RectF rectF, Path path) {
        this.f54880t.mo78041a(this.f54867g.f54888a, this.f54867g.f54898k, rectF, this.f54879s, path);
    }

    /* renamed from: a */
    private boolean mo77142a(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f54867g.f54891d == null || color2 == (colorForState2 = this.f54867g.f54891d.getColorForState(iArr, (color2 = this.f54876p.getColor())))) {
            z = false;
        } else {
            this.f54876p.setColor(colorForState2);
            z = true;
        }
        if (this.f54867g.f54892e == null || color == (colorForState = this.f54867g.f54892e.getColorForState(iArr, (color = this.f54877q.getColor())))) {
            return z;
        }
        this.f54877q.setColor(colorForState);
        return true;
    }

    /* renamed from: M */
    public ColorStateList mo77948M() {
        return this.f54867g.f54891d;
    }

    /* renamed from: N */
    public ColorStateList mo77949N() {
        return this.f54867g.f54894g;
    }

    /* renamed from: Q */
    public float mo77952Q() {
        return this.f54867g.f54898k;
    }

    /* renamed from: R */
    public float mo77953R() {
        return this.f54867g.f54901n;
    }

    /* renamed from: S */
    public float mo77954S() {
        return this.f54867g.f54902o;
    }

    /* renamed from: T */
    public float mo77955T() {
        return this.f54867g.f54903p;
    }

    /* renamed from: V */
    public int mo77957V() {
        return this.f54867g.f54905r;
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public C22398l getShapeAppearanceModel() {
        return this.f54867g.f54888a;
    }

    public void invalidateSelf() {
        this.f54866d = true;
        super.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$a */
    public static final class C22386a extends Drawable.ConstantState {

        /* renamed from: a */
        public C22398l f54888a;

        /* renamed from: b */
        public C22270a f54889b;

        /* renamed from: c */
        public ColorFilter f54890c;

        /* renamed from: d */
        public ColorStateList f54891d;

        /* renamed from: e */
        public ColorStateList f54892e;

        /* renamed from: f */
        public ColorStateList f54893f;

        /* renamed from: g */
        public ColorStateList f54894g;

        /* renamed from: h */
        public PorterDuff.Mode f54895h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f54896i;

        /* renamed from: j */
        public float f54897j = 1.0f;

        /* renamed from: k */
        public float f54898k = 1.0f;

        /* renamed from: l */
        public float f54899l;

        /* renamed from: m */
        public int f54900m = 255;

        /* renamed from: n */
        public float f54901n;

        /* renamed from: o */
        public float f54902o;

        /* renamed from: p */
        public float f54903p;

        /* renamed from: q */
        public int f54904q;

        /* renamed from: r */
        public int f54905r;

        /* renamed from: s */
        public int f54906s;

        /* renamed from: t */
        public int f54907t;

        /* renamed from: u */
        public boolean f54908u;

        /* renamed from: v */
        public Paint.Style f54909v = Paint.Style.FILL_AND_STROKE;

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f54866d = true;
            return materialShapeDrawable;
        }

        public C22386a(C22386a aVar) {
            this.f54888a = aVar.f54888a;
            this.f54889b = aVar.f54889b;
            this.f54899l = aVar.f54899l;
            this.f54890c = aVar.f54890c;
            this.f54891d = aVar.f54891d;
            this.f54892e = aVar.f54892e;
            this.f54895h = aVar.f54895h;
            this.f54894g = aVar.f54894g;
            this.f54900m = aVar.f54900m;
            this.f54897j = aVar.f54897j;
            this.f54906s = aVar.f54906s;
            this.f54904q = aVar.f54904q;
            this.f54908u = aVar.f54908u;
            this.f54898k = aVar.f54898k;
            this.f54901n = aVar.f54901n;
            this.f54902o = aVar.f54902o;
            this.f54903p = aVar.f54903p;
            this.f54905r = aVar.f54905r;
            this.f54907t = aVar.f54907t;
            this.f54893f = aVar.f54893f;
            this.f54909v = aVar.f54909v;
            if (aVar.f54896i != null) {
                this.f54896i = new Rect(aVar.f54896i);
            }
        }

        public C22386a(C22398l lVar, C22270a aVar) {
            this.f54888a = lVar;
            this.f54889b = aVar;
        }
    }

    public MaterialShapeDrawable() {
        this(new C22398l());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public RectF mo77950O() {
        this.f54871k.set(getBounds());
        return this.f54871k;
    }

    /* renamed from: U */
    public float mo77956U() {
        return mo77954S() + mo77955T();
    }

    public boolean ad() {
        return this.f54867g.f54888a.mo78004a(mo77950O());
    }

    public Drawable mutate() {
        this.f54867g = new C22386a(this.f54867g);
        return this;
    }

    /* renamed from: c */
    private boolean mo77151c() {
        if (this.f54867g.f54904q == 1 || this.f54867g.f54905r <= 0 || (this.f54867g.f54904q != 2 && !mo77958W())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean mo77157d() {
        if (this.f54867g.f54909v == Paint.Style.FILL_AND_STROKE || this.f54867g.f54909v == Paint.Style.FILL) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean mo76496e() {
        if ((this.f54867g.f54909v == Paint.Style.FILL_AND_STROKE || this.f54867g.f54909v == Paint.Style.STROKE) && this.f54877q.getStrokeWidth() > BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private float mo77181h() {
        if (mo76496e()) {
            return this.f54877q.getStrokeWidth() / 2.0f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: i */
    private RectF mo77184i() {
        this.f54872l.set(mo77950O());
        float h = mo77181h();
        this.f54872l.inset(h, h);
        return this.f54872l;
    }

    /* renamed from: P */
    public boolean mo77951P() {
        if (this.f54867g.f54889b == null || !this.f54867g.f54889b.mo77447a()) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public boolean mo77958W() {
        if (Build.VERSION.SDK_INT < 21 || (!ad() && !this.f54869i.isConvex() && Build.VERSION.SDK_INT < 29)) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public int mo77959X() {
        return (int) (((double) this.f54867g.f54906s) * Math.sin(Math.toRadians((double) this.f54867g.f54907t)));
    }

    /* renamed from: Y */
    public int mo77960Y() {
        return (int) (((double) this.f54867g.f54906s) * Math.cos(Math.toRadians((double) this.f54867g.f54907t)));
    }

    /* renamed from: Z */
    public float mo77961Z() {
        return this.f54867g.f54888a.mo78009f().mo77991a(mo77950O());
    }

    public float aa() {
        return this.f54867g.f54888a.mo78010g().mo77991a(mo77950O());
    }

    public float ab() {
        return this.f54867g.f54888a.mo78012i().mo77991a(mo77950O());
    }

    public float ac() {
        return this.f54867g.f54888a.mo78011h().mo77991a(mo77950O());
    }

    /* renamed from: f */
    private void mo77171f() {
        final float f = -mo77181h();
        C22398l a = getShapeAppearanceModel().mo78003a(new C22398l.AbstractC22401b() {
            /* class com.google.android.material.shape.MaterialShapeDrawable.C223852 */

            @Override // com.google.android.material.shape.C22398l.AbstractC22401b
            /* renamed from: a */
            public AbstractC22389c mo77988a(AbstractC22389c cVar) {
                if (cVar instanceof C22396j) {
                    return cVar;
                }
                return new C22388b(f, cVar);
            }
        });
        this.f54875o = a;
        this.f54880t.mo78040a(a, this.f54867g.f54898k, mo77184i(), this.f54870j);
    }

    public Region getTransparentRegion() {
        this.f54873m.set(getBounds());
        m81087b(mo77950O(), this.f54869i);
        this.f54874n.setPath(this.f54869i, this.f54873m);
        this.f54873m.op(this.f54874n, Region.Op.DIFFERENCE);
        return this.f54873m;
    }

    /* renamed from: g */
    private boolean mo77174g() {
        PorterDuffColorFilter porterDuffColorFilter = this.f54881u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f54882v;
        this.f54881u = m81077a(this.f54867g.f54894g, this.f54867g.f54895h, this.f54876p, true);
        this.f54882v = m81077a(this.f54867g.f54893f, this.f54867g.f54895h, this.f54877q, false);
        if (this.f54867g.f54908u) {
            this.f54878r.mo77892a(this.f54867g.f54894g.getColorForState(getState(), 0));
        }
        if (!C0843d.m3987a(porterDuffColorFilter, this.f54881u) || !C0843d.m3987a(porterDuffColorFilter2, this.f54882v)) {
            return true;
        }
        return false;
    }

    public boolean isStateful() {
        if (super.isStateful() || ((this.f54867g.f54894g != null && this.f54867g.f54894g.isStateful()) || ((this.f54867g.f54893f != null && this.f54867g.f54893f.isStateful()) || ((this.f54867g.f54892e != null && this.f54867g.f54892e.isStateful()) || (this.f54867g.f54891d != null && this.f54867g.f54891d.isStateful()))))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void mo77141a() {
        float U = mo77956U();
        this.f54867g.f54905r = (int) Math.ceil((double) (0.75f * U));
        this.f54867g.f54906s = (int) Math.ceil((double) (U * 0.25f));
        mo77174g();
        mo77143b();
    }

    /* renamed from: g */
    public void mo77974g(boolean z) {
        this.f54884x = z;
    }

    /* renamed from: n */
    public void mo77981n(float f) {
        this.f54867g.f54899l = f;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f54866d = true;
        super.onBoundsChange(rect);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f54867g.f54890c = colorFilter;
        mo77143b();
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public void setShapeAppearanceModel(C22398l lVar) {
        this.f54867g.f54888a = lVar;
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* renamed from: c */
    private void m81088c(Canvas canvas) {
        m81083a(canvas, this.f54877q, this.f54870j, this.f54875o, mo77184i());
    }

    /* renamed from: D */
    public void mo77944D(int i) {
        if (this.f54867g.f54904q != i) {
            this.f54867g.f54904q = i;
            mo77143b();
        }
    }

    /* renamed from: E */
    public void mo77945E(int i) {
        if (this.f54867g.f54906s != i) {
            this.f54867g.f54906s = i;
            mo77143b();
        }
    }

    /* renamed from: F */
    public void mo77946F(int i) {
        if (this.f54867g.f54907t != i) {
            this.f54867g.f54907t = i;
            mo77143b();
        }
    }

    /* renamed from: G */
    public void mo77947G(int i) {
        this.f54878r.mo77892a(i);
        this.f54867g.f54908u = false;
        mo77143b();
    }

    /* renamed from: o */
    public void mo77982o(float f) {
        setShapeAppearanceModel(this.f54867g.f54888a.mo78002a(f));
    }

    /* renamed from: q */
    public void mo77984q(float f) {
        if (this.f54867g.f54901n != f) {
            this.f54867g.f54901n = f;
            mo77141a();
        }
    }

    /* renamed from: r */
    public void mo77985r(float f) {
        if (this.f54867g.f54902o != f) {
            this.f54867g.f54902o = f;
            mo77141a();
        }
    }

    public void setAlpha(int i) {
        if (this.f54867g.f54900m != i) {
            this.f54867g.f54900m = i;
            mo77143b();
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTintList(ColorStateList colorStateList) {
        this.f54867g.f54894g = colorStateList;
        mo77174g();
        mo77143b();
    }

    /* renamed from: a */
    private int mo77131a(int i) {
        float U = mo77956U() + mo77953R();
        if (this.f54867g.f54889b != null) {
            return this.f54867g.f54889b.mo77446a(i, U);
        }
        return i;
    }

    /* renamed from: b */
    private void m81086b(Canvas canvas) {
        m81083a(canvas, this.f54876p, this.f54869i, this.f54867g.f54888a, mo77950O());
    }

    /* renamed from: g */
    public void mo77973g(ColorStateList colorStateList) {
        if (this.f54867g.f54891d != colorStateList) {
            this.f54867g.f54891d = colorStateList;
            onStateChange(getState());
        }
    }

    public boolean getPadding(Rect rect) {
        if (this.f54867g.f54896i == null) {
            return super.getPadding(rect);
        }
        rect.set(this.f54867g.f54896i);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean a = mo77142a(iArr);
        boolean g = mo77174g();
        if (a || g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public void mo77983p(float f) {
        if (this.f54867g.f54898k != f) {
            this.f54867g.f54898k = f;
            this.f54866d = true;
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f54867g.f54895h != mode) {
            this.f54867g.f54895h = mode;
            mo77174g();
            mo77143b();
        }
    }

    public MaterialShapeDrawable(C22398l lVar) {
        this(new C22386a(lVar, null));
    }

    /* renamed from: d */
    private void m81090d(Canvas canvas) {
        int X = mo77959X();
        int Y = mo77960Y();
        if (Build.VERSION.SDK_INT < 21 && this.f54884x) {
            Rect clipBounds = canvas.getClipBounds();
            clipBounds.inset(-this.f54867g.f54905r, -this.f54867g.f54905r);
            clipBounds.offset(X, Y);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) X, (float) Y);
    }

    public void getOutline(Outline outline) {
        if (this.f54867g.f54904q != 2) {
            if (ad()) {
                outline.setRoundRect(getBounds(), mo77961Z() * this.f54867g.f54898k);
                return;
            }
            m81087b(mo77950O(), this.f54869i);
            if (this.f54869i.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f54869i);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    /* renamed from: h */
    public void mo77978h(ColorStateList colorStateList) {
        if (this.f54867g.f54892e != colorStateList) {
            this.f54867g.f54892e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: e */
    private void m81092e(Canvas canvas) {
        if (this.f54865c.cardinality() > 0) {
            Log.w(f54861e, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f54867g.f54906s != 0) {
            canvas.drawPath(this.f54869i, this.f54878r.mo77891a());
        }
        for (int i = 0; i < 4; i++) {
            this.f54863a[i].mo78064a(this.f54878r, this.f54867g.f54905r, canvas);
            this.f54864b[i].mo78064a(this.f54878r, this.f54867g.f54905r, canvas);
        }
        if (this.f54884x) {
            int X = mo77959X();
            int Y = mo77960Y();
            canvas.translate((float) (-X), (float) (-Y));
            canvas.drawPath(this.f54869i, f54862f);
            canvas.translate((float) X, (float) Y);
        }
    }

    public void draw(Canvas canvas) {
        this.f54876p.setColorFilter(this.f54881u);
        int alpha = this.f54876p.getAlpha();
        this.f54876p.setAlpha(m81076a(alpha, this.f54867g.f54900m));
        this.f54877q.setColorFilter(this.f54882v);
        this.f54877q.setStrokeWidth(this.f54867g.f54899l);
        int alpha2 = this.f54877q.getAlpha();
        this.f54877q.setAlpha(m81076a(alpha2, this.f54867g.f54900m));
        if (this.f54866d) {
            mo77171f();
            m81087b(mo77950O(), this.f54869i);
            this.f54866d = false;
        }
        m81082a(canvas);
        if (mo77157d()) {
            m81086b(canvas);
        }
        if (mo76496e()) {
            m81088c(canvas);
        }
        this.f54876p.setAlpha(alpha);
        this.f54877q.setAlpha(alpha2);
    }

    private MaterialShapeDrawable(C22386a aVar) {
        this.f54863a = new C22405n.AbstractC22412f[4];
        this.f54864b = new C22405n.AbstractC22412f[4];
        this.f54865c = new BitSet(8);
        this.f54868h = new Matrix();
        this.f54869i = new Path();
        this.f54870j = new Path();
        this.f54871k = new RectF();
        this.f54872l = new RectF();
        this.f54873m = new Region();
        this.f54874n = new Region();
        Paint paint = new Paint(1);
        this.f54876p = paint;
        Paint paint2 = new Paint(1);
        this.f54877q = paint2;
        this.f54878r = new C22376a();
        this.f54880t = new C22402m();
        this.f54883w = new RectF();
        this.f54884x = true;
        this.f54867g = aVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f54862f;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        mo77174g();
        mo77142a(getState());
        this.f54879s = new C22402m.AbstractC22403a() {
            /* class com.google.android.material.shape.MaterialShapeDrawable.C223841 */

            @Override // com.google.android.material.shape.C22402m.AbstractC22403a
            /* renamed from: a */
            public void mo77986a(C22405n nVar, Matrix matrix, int i) {
                MaterialShapeDrawable.this.f54865c.set(i, nVar.mo78047a());
                MaterialShapeDrawable.this.f54863a[i] = nVar.mo78042a(matrix);
            }

            @Override // com.google.android.material.shape.C22402m.AbstractC22403a
            /* renamed from: b */
            public void mo77987b(C22405n nVar, Matrix matrix, int i) {
                MaterialShapeDrawable.this.f54865c.set(i + 4, nVar.mo78047a());
                MaterialShapeDrawable.this.f54864b[i] = nVar.mo78042a(matrix);
            }
        };
    }

    /* renamed from: a */
    private void m81082a(Canvas canvas) {
        if (mo77151c()) {
            canvas.save();
            m81090d(canvas);
            if (!this.f54884x) {
                m81092e(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f54883w.width() - ((float) getBounds().width()));
            int height = (int) (this.f54883w.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f54883w.width()) + (this.f54867g.f54905r * 2) + width, ((int) this.f54883w.height()) + (this.f54867g.f54905r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f54867g.f54905r) - width);
            float f2 = (float) ((getBounds().top - this.f54867g.f54905r) - height);
            canvas2.translate(-f, -f2);
            m81092e(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: b */
    private void m81087b(RectF rectF, Path path) {
        mo77968a(rectF, path);
        if (this.f54867g.f54897j != 1.0f) {
            this.f54868h.reset();
            this.f54868h.setScale(this.f54867g.f54897j, this.f54867g.f54897j, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f54868h);
        }
        path.computeBounds(this.f54883w, true);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m81079a(Paint paint, boolean z) {
        int color;
        int a;
        if (!z || (a = mo77131a((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(a, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: a */
    public static MaterialShapeDrawable m81080a(Context context, float f) {
        int a = C22197a.m80101a(context, (int) R.attr.colorSurface, MaterialShapeDrawable.class.getSimpleName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.mo77965a(context);
        materialShapeDrawable.mo77973g(ColorStateList.valueOf(a));
        materialShapeDrawable.mo77985r(f);
        return materialShapeDrawable;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m81078a(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo77131a(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m81077a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m81079a(paint, z);
        }
        return m81078a(colorStateList, mode, z);
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C22398l.m81160a(context, attributeSet, i, i2).mo78024a());
    }

    /* renamed from: a */
    private void m81083a(Canvas canvas, Paint paint, Path path, C22398l lVar, RectF rectF) {
        if (lVar.mo78004a(rectF)) {
            float a = lVar.mo78010g().mo77991a(rectF) * this.f54867g.f54898k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }
}
