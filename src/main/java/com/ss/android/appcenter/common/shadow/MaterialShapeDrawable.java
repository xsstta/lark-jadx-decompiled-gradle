package com.ss.android.appcenter.common.shadow;

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
import android.util.Log;
import androidx.core.util.C0843d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.appcenter.common.shadow.C28160n;
import com.ss.android.appcenter.common.shadow.C28164o;
import com.ss.android.appcenter.common.shadow.C28167p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

public class MaterialShapeDrawable extends Drawable {

    /* renamed from: e */
    private static final String f70534e = "MaterialShapeDrawable";

    /* renamed from: f */
    private static final Paint f70535f = new Paint(1);

    /* renamed from: a */
    public final C28167p.AbstractC28174f[] f70536a;

    /* renamed from: b */
    public final C28167p.AbstractC28174f[] f70537b;

    /* renamed from: c */
    public final BitSet f70538c;

    /* renamed from: d */
    public boolean f70539d;

    /* renamed from: g */
    private C28146a f70540g;

    /* renamed from: h */
    private final Matrix f70541h;

    /* renamed from: i */
    private final Path f70542i;

    /* renamed from: j */
    private final Path f70543j;

    /* renamed from: k */
    private final RectF f70544k;

    /* renamed from: l */
    private final RectF f70545l;

    /* renamed from: m */
    private final Region f70546m;

    /* renamed from: n */
    private final Region f70547n;

    /* renamed from: o */
    private C28160n f70548o;

    /* renamed from: p */
    private final Paint f70549p;

    /* renamed from: q */
    private final Paint f70550q;

    /* renamed from: r */
    private final C28159m f70551r;

    /* renamed from: s */
    private final C28164o.AbstractC28165a f70552s;

    /* renamed from: t */
    private final C28164o f70553t;

    /* renamed from: u */
    private PorterDuffColorFilter f70554u;

    /* renamed from: v */
    private PorterDuffColorFilter f70555v;

    /* renamed from: w */
    private final RectF f70556w;

    /* renamed from: x */
    private boolean f70557x;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    /* renamed from: a */
    private static int m103056a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: m */
    private void m103070m() {
        super.invalidateSelf();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f70540g;
    }

    /* renamed from: a */
    public void mo100279a(Paint.Style style) {
        this.f70540g.f70582v = style;
        m103070m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100280a(RectF rectF, Path path) {
        this.f70553t.mo100365a(this.f70540g.f70561a, this.f70540g.f70571k, rectF, this.f70552s, path);
    }

    /* renamed from: c */
    public float mo100283c() {
        return this.f70540g.f70574n;
    }

    /* renamed from: d */
    public float mo100285d() {
        return this.f70540g.f70575o;
    }

    /* renamed from: e */
    public float mo100288e() {
        return this.f70540g.f70576p;
    }

    public void invalidateSelf() {
        this.f70539d = true;
        super.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.common.shadow.MaterialShapeDrawable$a */
    public static final class C28146a extends Drawable.ConstantState {

        /* renamed from: a */
        public C28160n f70561a;

        /* renamed from: b */
        public C28153g f70562b;

        /* renamed from: c */
        public ColorFilter f70563c;

        /* renamed from: d */
        public ColorStateList f70564d;

        /* renamed from: e */
        public ColorStateList f70565e;

        /* renamed from: f */
        public ColorStateList f70566f;

        /* renamed from: g */
        public ColorStateList f70567g;

        /* renamed from: h */
        public PorterDuff.Mode f70568h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f70569i;

        /* renamed from: j */
        public float f70570j = 1.0f;

        /* renamed from: k */
        public float f70571k = 1.0f;

        /* renamed from: l */
        public float f70572l;

        /* renamed from: m */
        public int f70573m = 255;

        /* renamed from: n */
        public float f70574n;

        /* renamed from: o */
        public float f70575o;

        /* renamed from: p */
        public float f70576p;

        /* renamed from: q */
        public int f70577q;

        /* renamed from: r */
        public int f70578r;

        /* renamed from: s */
        public int f70579s;

        /* renamed from: t */
        public int f70580t;

        /* renamed from: u */
        public boolean f70581u;

        /* renamed from: v */
        public Paint.Style f70582v = Paint.Style.FILL_AND_STROKE;

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f70539d = true;
            return materialShapeDrawable;
        }

        public C28146a(C28146a aVar) {
            this.f70561a = aVar.f70561a;
            this.f70562b = aVar.f70562b;
            this.f70572l = aVar.f70572l;
            this.f70563c = aVar.f70563c;
            this.f70564d = aVar.f70564d;
            this.f70565e = aVar.f70565e;
            this.f70568h = aVar.f70568h;
            this.f70567g = aVar.f70567g;
            this.f70573m = aVar.f70573m;
            this.f70570j = aVar.f70570j;
            this.f70579s = aVar.f70579s;
            this.f70577q = aVar.f70577q;
            this.f70581u = aVar.f70581u;
            this.f70571k = aVar.f70571k;
            this.f70574n = aVar.f70574n;
            this.f70575o = aVar.f70575o;
            this.f70576p = aVar.f70576p;
            this.f70578r = aVar.f70578r;
            this.f70580t = aVar.f70580t;
            this.f70566f = aVar.f70566f;
            this.f70582v = aVar.f70582v;
            if (aVar.f70569i != null) {
                this.f70569i = new Rect(aVar.f70569i);
            }
        }

        public C28146a(C28160n nVar, C28153g gVar) {
            this.f70561a = nVar;
            this.f70562b = gVar;
            C28175q qVar = nVar.f70617m;
            if (qVar != null) {
                this.f70565e = qVar.f70674b;
                this.f70572l = (float) qVar.f70673a;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RectF mo100281b() {
        this.f70544k.set(getBounds());
        return this.f70544k;
    }

    /* renamed from: f */
    public float mo100289f() {
        return mo100285d() + mo100288e();
    }

    /* renamed from: k */
    public boolean mo100301k() {
        return this.f70540g.f70561a.mo100335a(mo100281b());
    }

    public Drawable mutate() {
        this.f70540g = new C28146a(this.f70540g);
        return this;
    }

    /* renamed from: n */
    private boolean m103071n() {
        if (this.f70540g.f70577q == 1 || this.f70540g.f70578r <= 0 || (this.f70540g.f70577q != 2 && !mo100290g())) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m103072o() {
        if (this.f70540g.f70582v == Paint.Style.FILL_AND_STROKE || this.f70540g.f70582v == Paint.Style.FILL) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m103073p() {
        if ((this.f70540g.f70582v == Paint.Style.FILL_AND_STROKE || this.f70540g.f70582v == Paint.Style.STROKE) && this.f70550q.getStrokeWidth() > BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private float m103076s() {
        if (m103073p()) {
            return this.f70550q.getStrokeWidth() / 2.0f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: t */
    private RectF m103077t() {
        this.f70545l.set(mo100281b());
        float s = m103076s();
        this.f70545l.inset(s, s);
        return this.f70545l;
    }

    /* renamed from: g */
    public boolean mo100290g() {
        if (Build.VERSION.SDK_INT < 21 || (!mo100301k() && !this.f70542i.isConvex() && Build.VERSION.SDK_INT < 29)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public int mo100296h() {
        return (int) (((double) this.f70540g.f70579s) * Math.sin(Math.toRadians((double) this.f70540g.f70580t)));
    }

    /* renamed from: i */
    public int mo100297i() {
        return (int) (((double) this.f70540g.f70579s) * Math.cos(Math.toRadians((double) this.f70540g.f70580t)));
    }

    /* renamed from: j */
    public float mo100300j() {
        return this.f70540g.f70561a.mo100339e().mo100314a(mo100281b());
    }

    /* renamed from: l */
    private void m103069l() {
        float f = mo100289f();
        this.f70540g.f70578r = (int) Math.ceil((double) (0.75f * f));
        this.f70540g.f70579s = (int) Math.ceil((double) (f * 0.25f));
        m103075r();
        m103070m();
    }

    /* renamed from: q */
    private void m103074q() {
        final float f = -m103076s();
        C28160n a = mo100276a().mo100334a(new C28160n.AbstractC28163b() {
            /* class com.ss.android.appcenter.common.shadow.MaterialShapeDrawable.C281452 */

            @Override // com.ss.android.appcenter.common.shadow.C28160n.AbstractC28163b
            /* renamed from: a */
            public AbstractC28149c mo100311a(AbstractC28149c cVar) {
                if (cVar instanceof C28157k) {
                    return cVar;
                }
                return new C28148b(f, cVar);
            }
        });
        this.f70548o = a;
        this.f70553t.mo100364a(a, this.f70540g.f70571k, m103077t(), this.f70543j);
    }

    public Region getTransparentRegion() {
        this.f70546m.set(getBounds());
        m103064b(mo100281b(), this.f70542i);
        this.f70547n.setPath(this.f70542i, this.f70546m);
        this.f70546m.op(this.f70547n, Region.Op.DIFFERENCE);
        return this.f70546m;
    }

    /* renamed from: r */
    private boolean m103075r() {
        PorterDuffColorFilter porterDuffColorFilter = this.f70554u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f70555v;
        this.f70554u = m103057a(this.f70540g.f70567g, this.f70540g.f70568h, this.f70549p, true);
        this.f70555v = m103057a(this.f70540g.f70566f, this.f70540g.f70568h, this.f70550q, false);
        if (this.f70540g.f70581u) {
            this.f70551r.mo100330a(this.f70540g.f70567g.getColorForState(getState(), 0));
        }
        if (!C0843d.m3987a(porterDuffColorFilter, this.f70554u) || !C0843d.m3987a(porterDuffColorFilter2, this.f70555v)) {
            return true;
        }
        return false;
    }

    public boolean isStateful() {
        if (super.isStateful() || ((this.f70540g.f70567g != null && this.f70540g.f70567g.isStateful()) || ((this.f70540g.f70566f != null && this.f70540g.f70566f.isStateful()) || ((this.f70540g.f70565e != null && this.f70540g.f70565e.isStateful()) || (this.f70540g.f70564d != null && this.f70540g.f70564d.isStateful()))))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C28160n mo100276a() {
        return this.f70540g.f70561a;
    }

    /* renamed from: b */
    public void mo100282b(int i) {
        this.f70540g.f70578r = i;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f70539d = true;
        super.onBoundsChange(rect);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f70540g.f70563c = colorFilter;
        m103070m();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public MaterialShapeDrawable(C28160n nVar) {
        this(new C28146a(nVar, null));
    }

    /* renamed from: c */
    private void m103065c(Canvas canvas) {
        m103061a(canvas, this.f70550q, this.f70543j, this.f70548o, m103077t());
    }

    /* renamed from: d */
    public void mo100286d(int i) {
        if (this.f70540g.f70579s != i) {
            this.f70540g.f70579s = i;
            m103070m();
        }
    }

    public void setAlpha(int i) {
        if (this.f70540g.f70573m != i) {
            this.f70540g.f70573m = i;
            m103070m();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f70540g.f70567g = colorStateList;
        m103075r();
        m103070m();
    }

    /* renamed from: b */
    private void m103063b(Canvas canvas) {
        m103061a(canvas, this.f70549p, this.f70542i, this.f70540g.f70561a, mo100281b());
    }

    /* renamed from: e */
    private int m103067e(int i) {
        float f = mo100289f() + mo100283c();
        if (this.f70540g.f70562b != null) {
            return this.f70540g.f70562b.mo100325a(i, f);
        }
        return i;
    }

    /* renamed from: c */
    public void mo100284c(int i) {
        this.f70551r.mo100330a(i);
        this.f70540g.f70581u = false;
        m103070m();
    }

    public boolean getPadding(Rect rect) {
        if (this.f70540g.f70569i == null) {
            return super.getPadding(rect);
        }
        rect.set(this.f70540g.f70569i);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean a = m103062a(iArr);
        boolean r = m103075r();
        if (a || r) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: d */
    private void m103066d(Canvas canvas) {
        int h = mo100296h();
        int i = mo100297i();
        if (Build.VERSION.SDK_INT < 21 && this.f70557x) {
            Rect clipBounds = canvas.getClipBounds();
            clipBounds.inset(-this.f70540g.f70578r, -this.f70540g.f70578r);
            clipBounds.offset(h, i);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) h, (float) i);
    }

    /* renamed from: e */
    private void m103068e(Canvas canvas) {
        if (this.f70538c.cardinality() > 0) {
            Log.w(f70534e, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f70540g.f70579s != 0) {
            canvas.drawPath(this.f70542i, this.f70551r.mo100329a());
        }
        for (int i = 0; i < 4; i++) {
            this.f70536a[i].mo100388a(this.f70551r, this.f70540g.f70578r, canvas);
            this.f70537b[i].mo100388a(this.f70551r, this.f70540g.f70578r, canvas);
        }
        if (this.f70557x) {
            int h = mo100296h();
            int i2 = mo100297i();
            canvas.translate((float) (-h), (float) (-i2));
            canvas.drawPath(this.f70542i, f70535f);
            canvas.translate((float) h, (float) i2);
        }
    }

    public void draw(Canvas canvas) {
        this.f70549p.setColorFilter(this.f70554u);
        int alpha = this.f70549p.getAlpha();
        this.f70549p.setAlpha(m103056a(alpha, this.f70540g.f70573m));
        this.f70550q.setColorFilter(this.f70555v);
        this.f70550q.setStrokeWidth(this.f70540g.f70572l);
        int alpha2 = this.f70550q.getAlpha();
        this.f70550q.setAlpha(m103056a(alpha2, this.f70540g.f70573m));
        if (this.f70539d) {
            m103074q();
            m103064b(mo100281b(), this.f70542i);
            this.f70539d = false;
        }
        m103060a(canvas);
        if (m103072o()) {
            m103063b(canvas);
        }
        if (m103073p()) {
            m103065c(canvas);
        }
        this.f70549p.setAlpha(alpha);
        this.f70550q.setAlpha(alpha2);
    }

    public void getOutline(Outline outline) {
        if (this.f70540g.f70577q != 2) {
            if (mo100301k()) {
                outline.setRoundRect(getBounds(), mo100300j() * this.f70540g.f70571k);
                return;
            }
            m103064b(mo100281b(), this.f70542i);
            if (this.f70542i.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f70542i);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private MaterialShapeDrawable(C28146a aVar) {
        this.f70536a = new C28167p.AbstractC28174f[4];
        this.f70537b = new C28167p.AbstractC28174f[4];
        this.f70538c = new BitSet(8);
        this.f70541h = new Matrix();
        this.f70542i = new Path();
        this.f70543j = new Path();
        this.f70544k = new RectF();
        this.f70545l = new RectF();
        this.f70546m = new Region();
        this.f70547n = new Region();
        Paint paint = new Paint(1);
        this.f70549p = paint;
        Paint paint2 = new Paint(1);
        this.f70550q = paint2;
        this.f70551r = new C28159m();
        this.f70553t = new C28164o();
        this.f70556w = new RectF();
        this.f70557x = true;
        this.f70540g = aVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f70535f;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m103075r();
        m103062a(getState());
        this.f70552s = new C28164o.AbstractC28165a() {
            /* class com.ss.android.appcenter.common.shadow.MaterialShapeDrawable.C281441 */

            @Override // com.ss.android.appcenter.common.shadow.C28164o.AbstractC28165a
            /* renamed from: a */
            public void mo100309a(C28167p pVar, Matrix matrix, int i) {
                MaterialShapeDrawable.this.f70538c.set(i, pVar.mo100371a());
                MaterialShapeDrawable.this.f70536a[i] = pVar.mo100366a(matrix);
            }

            @Override // com.ss.android.appcenter.common.shadow.C28164o.AbstractC28165a
            /* renamed from: b */
            public void mo100310b(C28167p pVar, Matrix matrix, int i) {
                MaterialShapeDrawable.this.f70538c.set(i + 4, pVar.mo100371a());
                MaterialShapeDrawable.this.f70537b[i] = pVar.mo100366a(matrix);
            }
        };
    }

    /* renamed from: a */
    private void m103060a(Canvas canvas) {
        if (m103071n()) {
            canvas.save();
            m103066d(canvas);
            if (!this.f70557x) {
                m103068e(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f70556w.width() - ((float) getBounds().width()));
            int height = (int) (this.f70556w.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f70556w.width()) + (this.f70540g.f70578r * 2) + width, ((int) this.f70556w.height()) + (this.f70540g.f70578r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f70540g.f70578r) - width);
            float f2 = (float) ((getBounds().top - this.f70540g.f70578r) - height);
            canvas2.translate(-f, -f2);
            m103068e(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: a */
    private boolean m103062a(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f70540g.f70564d == null || color2 == (colorForState2 = this.f70540g.f70564d.getColorForState(iArr, (color2 = this.f70549p.getColor())))) {
            z = false;
        } else {
            this.f70549p.setColor(colorForState2);
            z = true;
        }
        if (this.f70540g.f70565e == null || color == (colorForState = this.f70540g.f70565e.getColorForState(iArr, (color = this.f70550q.getColor())))) {
            return z;
        }
        this.f70550q.setColor(colorForState);
        return true;
    }

    /* renamed from: a */
    public void mo100277a(int i) {
        if (this.f70540g.f70577q != i) {
            this.f70540g.f70577q = i;
            m103070m();
        }
    }

    /* renamed from: a */
    public void mo100278a(Context context) {
        this.f70540g.f70562b = new C28153g(context);
        m103069l();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m103059a(Paint paint, boolean z) {
        int color;
        int e;
        if (!z || (e = m103067e((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(e, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: b */
    private void m103064b(RectF rectF, Path path) {
        mo100280a(rectF, path);
        if (this.f70540g.f70570j != 1.0f) {
            this.f70541h.reset();
            this.f70541h.setScale(this.f70540g.f70570j, this.f70540g.f70570j, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f70541h);
        }
        path.computeBounds(this.f70556w, true);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m103058a(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m103067e(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m103057a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m103059a(paint, z);
        }
        return m103058a(colorStateList, mode, z);
    }

    /* renamed from: a */
    private void m103061a(Canvas canvas, Paint paint, Path path, C28160n nVar, RectF rectF) {
        if (nVar.mo100335a(rectF)) {
            float a = nVar.mo100340f().mo100314a(rectF) * this.f70540g.f70571k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }
}
