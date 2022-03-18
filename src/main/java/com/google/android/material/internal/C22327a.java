package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.p028b.C0745a;
import androidx.core.text.AbstractC0827d;
import androidx.core.text.C0828e;
import androidx.core.util.C0845f;
import androidx.core.view.C0904f;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.C22351i;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.p988i.C22310a;
import com.google.android.material.p988i.C22314d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

/* renamed from: com.google.android.material.internal.a */
public final class C22327a {

    /* renamed from: a */
    private static final boolean f54664a;

    /* renamed from: b */
    private static final Paint f54665b = null;

    /* renamed from: A */
    private CharSequence f54666A;

    /* renamed from: B */
    private boolean f54667B;

    /* renamed from: C */
    private boolean f54668C;

    /* renamed from: D */
    private Bitmap f54669D;

    /* renamed from: E */
    private Paint f54670E;

    /* renamed from: F */
    private float f54671F;

    /* renamed from: G */
    private float f54672G;

    /* renamed from: H */
    private int[] f54673H;

    /* renamed from: I */
    private boolean f54674I;

    /* renamed from: J */
    private final TextPaint f54675J;

    /* renamed from: K */
    private final TextPaint f54676K;

    /* renamed from: L */
    private TimeInterpolator f54677L;

    /* renamed from: M */
    private TimeInterpolator f54678M;

    /* renamed from: N */
    private float f54679N;

    /* renamed from: O */
    private float f54680O;

    /* renamed from: P */
    private float f54681P;

    /* renamed from: Q */
    private ColorStateList f54682Q;

    /* renamed from: R */
    private float f54683R;

    /* renamed from: S */
    private float f54684S;

    /* renamed from: T */
    private float f54685T;

    /* renamed from: U */
    private ColorStateList f54686U;

    /* renamed from: V */
    private StaticLayout f54687V;

    /* renamed from: W */
    private float f54688W;

    /* renamed from: X */
    private float f54689X;

    /* renamed from: Y */
    private float f54690Y;

    /* renamed from: Z */
    private CharSequence f54691Z;
    private int aa = 1;

    /* renamed from: c */
    private final View f54692c;

    /* renamed from: d */
    private boolean f54693d;

    /* renamed from: e */
    private float f54694e;

    /* renamed from: f */
    private final Rect f54695f;

    /* renamed from: g */
    private final Rect f54696g;

    /* renamed from: h */
    private final RectF f54697h;

    /* renamed from: i */
    private int f54698i = 16;

    /* renamed from: j */
    private int f54699j = 16;

    /* renamed from: k */
    private float f54700k = 15.0f;

    /* renamed from: l */
    private float f54701l = 15.0f;

    /* renamed from: m */
    private ColorStateList f54702m;

    /* renamed from: n */
    private ColorStateList f54703n;

    /* renamed from: o */
    private float f54704o;

    /* renamed from: p */
    private float f54705p;

    /* renamed from: q */
    private float f54706q;

    /* renamed from: r */
    private float f54707r;

    /* renamed from: s */
    private float f54708s;

    /* renamed from: t */
    private float f54709t;

    /* renamed from: u */
    private Typeface f54710u;

    /* renamed from: v */
    private Typeface f54711v;

    /* renamed from: w */
    private Typeface f54712w;

    /* renamed from: x */
    private C22310a f54713x;

    /* renamed from: y */
    private C22310a f54714y;

    /* renamed from: z */
    private CharSequence f54715z;

    /* renamed from: e */
    public int mo77794e() {
        return this.f54698i;
    }

    /* renamed from: f */
    public int mo77796f() {
        return this.f54699j;
    }

    /* renamed from: j */
    public float mo77800j() {
        return this.f54694e;
    }

    /* renamed from: m */
    public CharSequence mo77803m() {
        return this.f54715z;
    }

    /* renamed from: n */
    public int mo77804n() {
        return this.aa;
    }

    /* renamed from: o */
    public ColorStateList mo77805o() {
        return this.f54703n;
    }

    /* renamed from: a */
    public void mo77770a(float f) {
        if (this.f54700k != f) {
            this.f54700k = f;
            mo77802l();
        }
    }

    /* renamed from: a */
    public void mo77774a(ColorStateList colorStateList) {
        if (this.f54703n != colorStateList) {
            this.f54703n = colorStateList;
            mo77802l();
        }
    }

    /* renamed from: a */
    public void mo77772a(int i, int i2, int i3, int i4) {
        if (!m80851a(this.f54695f, i, i2, i3, i4)) {
            this.f54695f.set(i, i2, i3, i4);
            this.f54674I = true;
            mo77792d();
        }
    }

    /* renamed from: a */
    public void mo77776a(Rect rect) {
        mo77772a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    public void mo77777a(RectF rectF, int i, int i2) {
        this.f54667B = m80854b(this.f54715z);
        rectF.left = m80845a(i, i2);
        rectF.top = (float) this.f54696g.top;
        rectF.right = m80852b(rectF, i, i2);
        rectF.bottom = ((float) this.f54696g.top) + mo77789c();
    }

    /* renamed from: a */
    public void mo77771a(int i) {
        if (this.f54698i != i) {
            this.f54698i = i;
            mo77802l();
        }
    }

    /* renamed from: a */
    public void mo77778a(Typeface typeface) {
        if (m80858d(typeface)) {
            mo77802l();
        }
    }

    /* renamed from: b */
    public void mo77788b(Typeface typeface) {
        if (m80860e(typeface)) {
            mo77802l();
        }
    }

    /* renamed from: a */
    public final boolean mo77780a(int[] iArr) {
        this.f54673H = iArr;
        if (!mo77799i()) {
            return false;
        }
        mo77802l();
        return true;
    }

    /* renamed from: a */
    public void mo77775a(Canvas canvas) {
        int save = canvas.save();
        if (this.f54666A != null && this.f54693d) {
            boolean z = false;
            float lineLeft = (this.f54708s + this.f54687V.getLineLeft(0)) - (this.f54690Y * 2.0f);
            this.f54675J.setTextSize(this.f54672G);
            float f = this.f54708s;
            float f2 = this.f54709t;
            if (this.f54668C && this.f54669D != null) {
                z = true;
            }
            float f3 = this.f54671F;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f54669D, f, f2, this.f54670E);
                canvas.restoreToCount(save);
                return;
            }
            if (m80867s()) {
                m80848a(canvas, lineLeft, f2);
            } else {
                canvas.translate(f, f2);
                this.f54687V.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: a */
    public void mo77779a(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f54715z, charSequence)) {
            this.f54715z = charSequence;
            this.f54666A = null;
            m80870v();
            mo77802l();
        }
    }

    /* renamed from: p */
    private void m80864p() {
        m80856c(this.f54694e);
    }

    /* renamed from: q */
    private int m80865q() {
        return m80855c(this.f54702m);
    }

    /* renamed from: g */
    public Typeface mo77797g() {
        Typeface typeface = this.f54710u;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    /* renamed from: h */
    public Typeface mo77798h() {
        Typeface typeface = this.f54711v;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    /* renamed from: k */
    public int mo77801k() {
        return m80855c(this.f54703n);
    }

    /* renamed from: s */
    private boolean m80867s() {
        if (this.aa <= 1 || this.f54667B || this.f54668C) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private boolean m80868t() {
        if (ViewCompat.m4082h(this.f54692c) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private void m80870v() {
        Bitmap bitmap = this.f54669D;
        if (bitmap != null) {
            bitmap.recycle();
            this.f54669D = null;
        }
    }

    /* renamed from: c */
    public float mo77789c() {
        m80853b(this.f54676K);
        return -this.f54676K.ascent();
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 18) {
            z = true;
        } else {
            z = false;
        }
        f54664a = z;
        Paint paint = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    /* renamed from: i */
    public final boolean mo77799i() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f54703n;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f54702m) == null || !colorStateList.isStateful())) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public void mo77802l() {
        if (this.f54692c.getHeight() > 0 && this.f54692c.getWidth() > 0) {
            m80866r();
            m80864p();
        }
    }

    /* renamed from: b */
    public float mo77781b() {
        m80849a(this.f54676K);
        return -this.f54676K.ascent();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo77792d() {
        boolean z;
        if (this.f54696g.width() <= 0 || this.f54696g.height() <= 0 || this.f54695f.width() <= 0 || this.f54695f.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f54693d = z;
    }

    /* renamed from: u */
    private void m80869u() {
        if (this.f54669D == null && !this.f54695f.isEmpty() && !TextUtils.isEmpty(this.f54666A)) {
            m80856c(BitmapDescriptorFactory.HUE_RED);
            int width = this.f54687V.getWidth();
            int height = this.f54687V.getHeight();
            if (width > 0 && height > 0) {
                this.f54669D = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f54687V.draw(new Canvas(this.f54669D));
                if (this.f54670E == null) {
                    this.f54670E = new Paint(3);
                }
            }
        }
    }

    /* renamed from: r */
    private void m80866r() {
        float f;
        float f2;
        float f3;
        StaticLayout staticLayout;
        float f4 = this.f54672G;
        m80863h(this.f54701l);
        CharSequence charSequence = this.f54666A;
        if (!(charSequence == null || (staticLayout = this.f54687V) == null)) {
            this.f54691Z = TextUtils.ellipsize(charSequence, this.f54675J, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f54691Z;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        if (charSequence2 != null) {
            f = this.f54675J.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        int a = C0904f.m4351a(this.f54699j, this.f54667B ? 1 : 0);
        int i = a & SmEvents.EVENT_NE_RR;
        if (i == 48) {
            this.f54705p = (float) this.f54696g.top;
        } else if (i != 80) {
            this.f54705p = ((float) this.f54696g.centerY()) - ((this.f54675J.descent() - this.f54675J.ascent()) / 2.0f);
        } else {
            this.f54705p = ((float) this.f54696g.bottom) + this.f54675J.ascent();
        }
        int i2 = a & 8388615;
        if (i2 == 1) {
            this.f54707r = ((float) this.f54696g.centerX()) - (f / 2.0f);
        } else if (i2 != 5) {
            this.f54707r = (float) this.f54696g.left;
        } else {
            this.f54707r = ((float) this.f54696g.right) - f;
        }
        m80863h(this.f54700k);
        StaticLayout staticLayout2 = this.f54687V;
        if (staticLayout2 != null) {
            f2 = (float) staticLayout2.getHeight();
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        CharSequence charSequence3 = this.f54666A;
        if (charSequence3 != null) {
            f3 = this.f54675J.measureText(charSequence3, 0, charSequence3.length());
        } else {
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        StaticLayout staticLayout3 = this.f54687V;
        if (staticLayout3 != null && this.aa > 1 && !this.f54667B) {
            f3 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f54687V;
        if (staticLayout4 != null) {
            f5 = staticLayout4.getLineLeft(0);
        }
        this.f54690Y = f5;
        int a2 = C0904f.m4351a(this.f54698i, this.f54667B ? 1 : 0);
        int i3 = a2 & SmEvents.EVENT_NE_RR;
        if (i3 == 48) {
            this.f54704o = (float) this.f54695f.top;
        } else if (i3 != 80) {
            this.f54704o = ((float) this.f54695f.centerY()) - (f2 / 2.0f);
        } else {
            this.f54704o = (((float) this.f54695f.bottom) - f2) + this.f54675J.descent();
        }
        int i4 = a2 & 8388615;
        if (i4 == 1) {
            this.f54706q = ((float) this.f54695f.centerX()) - (f3 / 2.0f);
        } else if (i4 != 5) {
            this.f54706q = (float) this.f54695f.left;
        } else {
            this.f54706q = ((float) this.f54695f.right) - f3;
        }
        m80870v();
        m80862g(f4);
    }

    /* renamed from: a */
    public float mo77769a() {
        if (this.f54715z == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        m80853b(this.f54676K);
        TextPaint textPaint = this.f54676K;
        CharSequence charSequence = this.f54715z;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: e */
    private void m80859e(float f) {
        this.f54688W = f;
        ViewCompat.m4073e(this.f54692c);
    }

    /* renamed from: f */
    private void m80861f(float f) {
        this.f54689X = f;
        ViewCompat.m4073e(this.f54692c);
    }

    /* renamed from: a */
    public void mo77773a(TimeInterpolator timeInterpolator) {
        this.f54678M = timeInterpolator;
        mo77802l();
    }

    /* renamed from: b */
    public void mo77785b(TimeInterpolator timeInterpolator) {
        this.f54677L = timeInterpolator;
        mo77802l();
    }

    /* renamed from: b */
    private void m80853b(TextPaint textPaint) {
        textPaint.setTextSize(this.f54701l);
        textPaint.setTypeface(this.f54710u);
    }

    /* renamed from: e */
    public void mo77795e(int i) {
        if (i != this.aa) {
            this.aa = i;
            m80870v();
            mo77802l();
        }
    }

    /* renamed from: a */
    private void m80849a(TextPaint textPaint) {
        textPaint.setTextSize(this.f54700k);
        textPaint.setTypeface(this.f54711v);
    }

    /* renamed from: b */
    private boolean m80854b(CharSequence charSequence) {
        AbstractC0827d dVar;
        if (m80868t()) {
            dVar = C0828e.f3301d;
        } else {
            dVar = C0828e.f3300c;
        }
        return dVar.mo4467a(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    private int m80855c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f54673H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: d */
    private boolean m80858d(Typeface typeface) {
        C22310a aVar = this.f54714y;
        if (aVar != null) {
            aVar.mo77667a();
        }
        if (this.f54710u == typeface) {
            return false;
        }
        this.f54710u = typeface;
        return true;
    }

    /* renamed from: e */
    private boolean m80860e(Typeface typeface) {
        C22310a aVar = this.f54713x;
        if (aVar != null) {
            aVar.mo77667a();
        }
        if (this.f54711v == typeface) {
            return false;
        }
        this.f54711v = typeface;
        return true;
    }

    /* renamed from: g */
    private void m80862g(float f) {
        boolean z;
        m80863h(f);
        if (!f54664a || this.f54671F == 1.0f) {
            z = false;
        } else {
            z = true;
        }
        this.f54668C = z;
        if (z) {
            m80869u();
        }
        ViewCompat.m4073e(this.f54692c);
    }

    public C22327a(View view) {
        this.f54692c = view;
        TextPaint textPaint = new TextPaint(129);
        this.f54675J = textPaint;
        this.f54676K = new TextPaint(textPaint);
        this.f54696g = new Rect();
        this.f54695f = new Rect();
        this.f54697h = new RectF();
    }

    /* renamed from: c */
    public void mo77791c(Typeface typeface) {
        boolean d = m80858d(typeface);
        boolean e = m80860e(typeface);
        if (d || e) {
            mo77802l();
        }
    }

    /* renamed from: d */
    private void m80857d(float f) {
        this.f54697h.left = m80844a((float) this.f54695f.left, (float) this.f54696g.left, f, this.f54677L);
        this.f54697h.top = m80844a(this.f54704o, this.f54705p, f, this.f54677L);
        this.f54697h.right = m80844a((float) this.f54695f.right, (float) this.f54696g.right, f, this.f54677L);
        this.f54697h.bottom = m80844a((float) this.f54695f.bottom, (float) this.f54696g.bottom, f, this.f54677L);
    }

    /* renamed from: c */
    public void mo77790c(int i) {
        C22314d dVar = new C22314d(this.f54692c.getContext(), i);
        if (dVar.f54594b != null) {
            this.f54703n = dVar.f54594b;
        }
        if (dVar.f54593a != BitmapDescriptorFactory.HUE_RED) {
            this.f54701l = dVar.f54593a;
        }
        if (dVar.f54601i != null) {
            this.f54682Q = dVar.f54601i;
        }
        this.f54680O = dVar.f54602j;
        this.f54681P = dVar.f54603k;
        this.f54679N = dVar.f54604l;
        C22310a aVar = this.f54714y;
        if (aVar != null) {
            aVar.mo77667a();
        }
        this.f54714y = new C22310a(new C22310a.AbstractC22311a() {
            /* class com.google.android.material.internal.C22327a.C223281 */

            @Override // com.google.android.material.p988i.C22310a.AbstractC22311a
            /* renamed from: a */
            public void mo77668a(Typeface typeface) {
                C22327a.this.mo77778a(typeface);
            }
        }, dVar.mo77669a());
        dVar.mo77672a(this.f54692c.getContext(), this.f54714y);
        mo77802l();
    }

    /* renamed from: c */
    private void m80856c(float f) {
        m80857d(f);
        this.f54708s = m80844a(this.f54706q, this.f54707r, f, this.f54677L);
        this.f54709t = m80844a(this.f54704o, this.f54705p, f, this.f54677L);
        m80862g(m80844a(this.f54700k, this.f54701l, f, this.f54678M));
        m80859e(1.0f - m80844a((float) BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f - f, C22116a.f53780b));
        m80861f(m80844a(1.0f, (float) BitmapDescriptorFactory.HUE_RED, f, C22116a.f53780b));
        if (this.f54703n != this.f54702m) {
            this.f54675J.setColor(m80846a(m80865q(), mo77801k(), f));
        } else {
            this.f54675J.setColor(mo77801k());
        }
        this.f54675J.setShadowLayer(m80844a(this.f54683R, this.f54679N, f, (TimeInterpolator) null), m80844a(this.f54684S, this.f54680O, f, (TimeInterpolator) null), m80844a(this.f54685T, this.f54681P, f, (TimeInterpolator) null), m80846a(m80855c(this.f54686U), m80855c(this.f54682Q), f));
        ViewCompat.m4073e(this.f54692c);
    }

    /* renamed from: h */
    private void m80863h(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.f54715z != null) {
            float width = (float) this.f54696g.width();
            float width2 = (float) this.f54695f.width();
            boolean z3 = false;
            int i = 1;
            if (m80850a(f, this.f54701l)) {
                f2 = this.f54701l;
                this.f54671F = 1.0f;
                Typeface typeface = this.f54712w;
                Typeface typeface2 = this.f54710u;
                if (typeface != typeface2) {
                    this.f54712w = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f54700k;
                Typeface typeface3 = this.f54712w;
                Typeface typeface4 = this.f54711v;
                if (typeface3 != typeface4) {
                    this.f54712w = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m80850a(f, f3)) {
                    this.f54671F = 1.0f;
                } else {
                    this.f54671F = f / this.f54700k;
                }
                float f4 = this.f54701l / this.f54700k;
                if (width2 * f4 > width) {
                    width = Math.min(width / f4, width2);
                } else {
                    width = width2;
                }
                f2 = f3;
                z = z2;
            }
            if (width > BitmapDescriptorFactory.HUE_RED) {
                if (this.f54672G != f2 || this.f54674I || z) {
                    z = true;
                } else {
                    z = false;
                }
                this.f54672G = f2;
                this.f54674I = false;
            }
            if (this.f54666A == null || z) {
                this.f54675J.setTextSize(this.f54672G);
                this.f54675J.setTypeface(this.f54712w);
                TextPaint textPaint = this.f54675J;
                if (this.f54671F != 1.0f) {
                    z3 = true;
                }
                textPaint.setLinearText(z3);
                this.f54667B = m80854b(this.f54715z);
                if (m80867s()) {
                    i = this.aa;
                }
                StaticLayout a = m80847a(i, width, this.f54667B);
                this.f54687V = a;
                this.f54666A = a.getText();
            }
        }
    }

    /* renamed from: b */
    public void mo77782b(float f) {
        float a = C0745a.m3626a(f, (float) BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (a != this.f54694e) {
            this.f54694e = a;
            m80864p();
        }
    }

    /* renamed from: d */
    public void mo77793d(int i) {
        C22314d dVar = new C22314d(this.f54692c.getContext(), i);
        if (dVar.f54594b != null) {
            this.f54702m = dVar.f54594b;
        }
        if (dVar.f54593a != BitmapDescriptorFactory.HUE_RED) {
            this.f54700k = dVar.f54593a;
        }
        if (dVar.f54601i != null) {
            this.f54686U = dVar.f54601i;
        }
        this.f54684S = dVar.f54602j;
        this.f54685T = dVar.f54603k;
        this.f54683R = dVar.f54604l;
        C22310a aVar = this.f54713x;
        if (aVar != null) {
            aVar.mo77667a();
        }
        this.f54713x = new C22310a(new C22310a.AbstractC22311a() {
            /* class com.google.android.material.internal.C22327a.C223292 */

            @Override // com.google.android.material.p988i.C22310a.AbstractC22311a
            /* renamed from: a */
            public void mo77668a(Typeface typeface) {
                C22327a.this.mo77788b(typeface);
            }
        }, dVar.mo77669a());
        dVar.mo77672a(this.f54692c.getContext(), this.f54713x);
        mo77802l();
    }

    /* renamed from: b */
    public void mo77783b(int i) {
        if (this.f54699j != i) {
            this.f54699j = i;
            mo77802l();
        }
    }

    /* renamed from: b */
    public void mo77786b(ColorStateList colorStateList) {
        if (this.f54702m != colorStateList) {
            this.f54702m = colorStateList;
            mo77802l();
        }
    }

    /* renamed from: b */
    public void mo77787b(Rect rect) {
        mo77784b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    private float m80845a(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (mo77769a() / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (this.f54667B) {
                return (float) this.f54696g.left;
            }
            return ((float) this.f54696g.right) - mo77769a();
        } else if (this.f54667B) {
            return ((float) this.f54696g.right) - mo77769a();
        } else {
            return (float) this.f54696g.left;
        }
    }

    /* renamed from: a */
    private static boolean m80850a(float f, float f2) {
        if (Math.abs(f - f2) < 0.001f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private StaticLayout m80847a(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = C22351i.m80976a(this.f54715z, this.f54675J, (int) f).mo77852a(TextUtils.TruncateAt.END).mo77854b(z).mo77851a(Layout.Alignment.ALIGN_NORMAL).mo77853a(false).mo77850a(i).mo77849a();
        } catch (C22351i.C22352a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) C0845f.m3991a(staticLayout);
    }

    /* renamed from: b */
    private float m80852b(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (mo77769a() / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            if (this.f54667B) {
                return rectF.left + mo77769a();
            }
            return (float) this.f54696g.right;
        } else if (this.f54667B) {
            return (float) this.f54696g.right;
        } else {
            return rectF.left + mo77769a();
        }
    }

    /* renamed from: a */
    private static int m80846a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private void m80848a(Canvas canvas, float f, float f2) {
        int alpha = this.f54675J.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f54675J.setAlpha((int) (this.f54689X * f3));
        this.f54687V.draw(canvas);
        this.f54675J.setAlpha((int) (this.f54688W * f3));
        int lineBaseline = this.f54687V.getLineBaseline(0);
        CharSequence charSequence = this.f54691Z;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), BitmapDescriptorFactory.HUE_RED, f4, this.f54675J);
        String trim = this.f54691Z.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        this.f54675J.setAlpha(alpha);
        canvas.drawText(trim, 0, Math.min(this.f54687V.getLineEnd(0), trim.length()), BitmapDescriptorFactory.HUE_RED, f4, (Paint) this.f54675J);
    }

    /* renamed from: a */
    private static float m80844a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C22116a.m79705a(f, f2, f3);
    }

    /* renamed from: b */
    public void mo77784b(int i, int i2, int i3, int i4) {
        if (!m80851a(this.f54696g, i, i2, i3, i4)) {
            this.f54696g.set(i, i2, i3, i4);
            this.f54674I = true;
            mo77792d();
        }
    }

    /* renamed from: a */
    private static boolean m80851a(Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }
}
