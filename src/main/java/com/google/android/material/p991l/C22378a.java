package com.google.android.material.p991l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.C0768a;
import com.google.android.material.internal.C22353j;
import com.google.android.material.internal.C22358l;
import com.google.android.material.p982c.C22197a;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.p988i.C22314d;
import com.google.android.material.shape.C22392f;
import com.google.android.material.shape.C22393g;
import com.google.android.material.shape.C22395i;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.l.a */
public class C22378a extends MaterialShapeDrawable implements C22353j.AbstractC22355a {

    /* renamed from: e */
    private static final int f54829e = 2131887415;

    /* renamed from: f */
    private static final int f54830f = 2130970529;

    /* renamed from: g */
    private CharSequence f54831g;

    /* renamed from: h */
    private final Context f54832h;

    /* renamed from: i */
    private final Paint.FontMetrics f54833i = new Paint.FontMetrics();

    /* renamed from: j */
    private final C22353j f54834j;

    /* renamed from: k */
    private final View.OnLayoutChangeListener f54835k;

    /* renamed from: l */
    private final Rect f54836l;

    /* renamed from: m */
    private int f54837m;

    /* renamed from: n */
    private int f54838n;

    /* renamed from: o */
    private int f54839o;

    /* renamed from: p */
    private int f54840p;

    /* renamed from: q */
    private int f54841q;

    /* renamed from: r */
    private int f54842r;

    @Override // com.google.android.material.internal.C22353j.AbstractC22355a
    /* renamed from: e */
    public void mo76496e() {
        invalidateSelf();
    }

    /* renamed from: c */
    private float m81054c() {
        CharSequence charSequence = this.f54831g;
        if (charSequence == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.f54834j.mo77855a(charSequence.toString());
    }

    /* renamed from: d */
    private float m81055d() {
        this.f54834j.mo77856a().getFontMetrics(this.f54833i);
        return (this.f54833i.descent + this.f54833i.ascent) / 2.0f;
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.f54834j.mo77856a().getTextSize(), (float) this.f54839o);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.f54837m * 2)) + m81054c(), (float) this.f54838n);
    }

    /* renamed from: b */
    private C22392f m81053b() {
        float width = ((float) (((double) getBounds().width()) - (((double) this.f54841q) * Math.sqrt(2.0d)))) / 2.0f;
        return new C22395i(new C22393g((float) this.f54841q), Math.min(Math.max(-m81048a(), -width), width));
    }

    /* renamed from: a */
    private float m81048a() {
        int i;
        if (((this.f54836l.right - getBounds().right) - this.f54842r) - this.f54840p < 0) {
            i = ((this.f54836l.right - getBounds().right) - this.f54842r) - this.f54840p;
        } else if (((this.f54836l.left - getBounds().left) - this.f54842r) + this.f54840p <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        } else {
            i = ((this.f54836l.left - getBounds().left) - this.f54842r) + this.f54840p;
        }
        return (float) i;
    }

    /* renamed from: a */
    public void mo77896a(C22314d dVar) {
        this.f54834j.mo77858a(dVar, this.f54832h);
    }

    @Override // com.google.android.material.internal.C22353j.AbstractC22355a, com.google.android.material.shape.MaterialShapeDrawable
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: a */
    private float m81049a(Rect rect) {
        return ((float) rect.centerY()) - m81055d();
    }

    /* renamed from: b */
    public void mo77898b(View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f54835k);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().mo78017n().mo78029b(m81053b()).mo78024a());
    }

    /* renamed from: a */
    public void mo77895a(View view) {
        if (view != null) {
            mo77899c(view);
            view.addOnLayoutChangeListener(this.f54835k);
        }
    }

    /* renamed from: c */
    public void mo77899c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f54842r = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f54836l);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(m81048a(), (float) (-((((double) this.f54841q) * Math.sqrt(2.0d)) - ((double) this.f54841q))));
        super.draw(canvas);
        m81051a(canvas);
        canvas.restore();
    }

    /* renamed from: a */
    private void m81051a(Canvas canvas) {
        if (this.f54831g != null) {
            Rect bounds = getBounds();
            int a = (int) m81049a(bounds);
            if (this.f54834j.mo77861b() != null) {
                this.f54834j.mo77856a().drawableState = getState();
                this.f54834j.mo77857a(this.f54832h);
            }
            CharSequence charSequence = this.f54831g;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) a, this.f54834j.mo77856a());
        }
    }

    /* renamed from: a */
    public void mo77897a(CharSequence charSequence) {
        if (!TextUtils.equals(this.f54831g, charSequence)) {
            this.f54831g = charSequence;
            this.f54834j.mo77860a(true);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m81052a(AttributeSet attributeSet, int i, int i2) {
        TypedArray a = C22358l.m80999a(this.f54832h, attributeSet, new int[]{16842804, 16842965, 16842998, 16843071, 16843072, 16843087, R.attr.backgroundTint}, i, i2, new int[0]);
        this.f54841q = this.f54832h.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().mo78017n().mo78029b(m81053b()).mo78024a());
        mo77897a(a.getText(5));
        mo77896a(C22313c.m80798c(this.f54832h, a, 0));
        mo77973g(ColorStateList.valueOf(a.getColor(6, C22197a.m80098a(C0768a.m3716c(C22197a.m80101a(this.f54832h, 16842801, C22378a.class.getCanonicalName()), 229), C0768a.m3716c(C22197a.m80101a(this.f54832h, (int) R.attr.colorOnBackground, C22378a.class.getCanonicalName()), 153)))));
        mo77978h(ColorStateList.valueOf(C22197a.m80101a(this.f54832h, (int) R.attr.colorSurface, C22378a.class.getCanonicalName())));
        this.f54837m = a.getDimensionPixelSize(1, 0);
        this.f54838n = a.getDimensionPixelSize(3, 0);
        this.f54839o = a.getDimensionPixelSize(4, 0);
        this.f54840p = a.getDimensionPixelSize(2, 0);
        a.recycle();
    }

    /* renamed from: a */
    public static C22378a m81050a(Context context, AttributeSet attributeSet, int i, int i2) {
        C22378a aVar = new C22378a(context, attributeSet, i, i2);
        aVar.m81052a(attributeSet, i, i2);
        return aVar;
    }

    private C22378a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C22353j jVar = new C22353j(this);
        this.f54834j = jVar;
        this.f54835k = new View.OnLayoutChangeListener() {
            /* class com.google.android.material.p991l.C22378a.View$OnLayoutChangeListenerC223791 */

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C22378a.this.mo77899c(view);
            }
        };
        this.f54836l = new Rect();
        this.f54832h = context;
        jVar.mo77856a().density = context.getResources().getDisplayMetrics().density;
        jVar.mo77856a().setTextAlign(Paint.Align.CENTER);
    }
}
