package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.ViewCompat;
import com.google.android.material.p982c.C22197a;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.p989j.C22375b;
import com.google.android.material.shape.C22390d;
import com.google.android.material.shape.C22391e;
import com.google.android.material.shape.C22397k;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.card.a */
class C22199a {

    /* renamed from: a */
    private static final int[] f54164a = {16842912};

    /* renamed from: b */
    private static final double f54165b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    private final MaterialCardView f54166c;

    /* renamed from: d */
    private final Rect f54167d = new Rect();

    /* renamed from: e */
    private final MaterialShapeDrawable f54168e;

    /* renamed from: f */
    private final MaterialShapeDrawable f54169f;

    /* renamed from: g */
    private final int f54170g;

    /* renamed from: h */
    private final int f54171h;

    /* renamed from: i */
    private int f54172i;

    /* renamed from: j */
    private Drawable f54173j;

    /* renamed from: k */
    private Drawable f54174k;

    /* renamed from: l */
    private ColorStateList f54175l;

    /* renamed from: m */
    private ColorStateList f54176m;

    /* renamed from: n */
    private C22398l f54177n;

    /* renamed from: o */
    private ColorStateList f54178o;

    /* renamed from: p */
    private Drawable f54179p;

    /* renamed from: q */
    private LayerDrawable f54180q;

    /* renamed from: r */
    private MaterialShapeDrawable f54181r;

    /* renamed from: s */
    private MaterialShapeDrawable f54182s;

    /* renamed from: t */
    private boolean f54183t = false;

    /* renamed from: u */
    private boolean f54184u;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo76901c() {
        return this.f54178o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo76903d() {
        return this.f54172i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public MaterialShapeDrawable mo76905e() {
        return this.f54168e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Rect mo76909h() {
        return this.f54167d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo76917p() {
        return this.f54184u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList mo76918q() {
        return this.f54176m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public ColorStateList mo76919r() {
        return this.f54175l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Drawable mo76920s() {
        return this.f54174k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C22398l mo76922u() {
        return this.f54177n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76894a(C22398l lVar) {
        this.f54177n = lVar;
        this.f54168e.setShapeAppearanceModel(lVar);
        MaterialShapeDrawable materialShapeDrawable = this.f54168e;
        materialShapeDrawable.mo77974g(!materialShapeDrawable.ad());
        MaterialShapeDrawable materialShapeDrawable2 = this.f54169f;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(lVar);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.f54182s;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(lVar);
        }
        MaterialShapeDrawable materialShapeDrawable4 = this.f54181r;
        if (materialShapeDrawable4 != null) {
            materialShapeDrawable4.setShapeAppearanceModel(lVar);
        }
    }

    /* renamed from: H */
    private MaterialShapeDrawable m80117H() {
        return new MaterialShapeDrawable(this.f54177n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo76896a() {
        return this.f54183t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo76907f() {
        return this.f54168e.mo77948M();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ColorStateList mo76908g() {
        return this.f54169f.mo77948M();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo76911j() {
        return this.f54168e.mo77961Z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo76912k() {
        return this.f54168e.mo77952Q();
    }

    /* renamed from: G */
    private Drawable m80116G() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f54174k;
        if (drawable != null) {
            stateListDrawable.addState(f54164a, drawable);
        }
        return stateListDrawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo76897b() {
        ColorStateList colorStateList = this.f54178o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo76913l() {
        this.f54168e.mo77985r(this.f54166c.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo76915n() {
        this.f54169f.mo77963a((float) this.f54172i, this.f54178o);
    }

    /* renamed from: A */
    private boolean m80110A() {
        if (!this.f54166c.getPreventCornerOverlap() || !m80123x() || !this.f54166c.getUseCompatPadding()) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private Drawable m80113D() {
        if (!C22375b.f54805a) {
            return m80114E();
        }
        this.f54182s = m80117H();
        return new RippleDrawable(this.f54175l, null, this.f54182s);
    }

    /* renamed from: E */
    private Drawable m80114E() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        MaterialShapeDrawable H = m80117H();
        this.f54181r = H;
        H.mo77973g(this.f54175l);
        stateListDrawable.addState(new int[]{16842919}, this.f54181r);
        return stateListDrawable;
    }

    /* renamed from: F */
    private void m80115F() {
        Drawable drawable;
        if (!C22375b.f54805a || (drawable = this.f54179p) == null) {
            MaterialShapeDrawable materialShapeDrawable = this.f54181r;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.mo77973g(this.f54175l);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f54175l);
    }

    /* renamed from: v */
    private float m80121v() {
        float f;
        float maxCardElevation = this.f54166c.getMaxCardElevation() * 1.5f;
        if (m80110A()) {
            f = m80111B();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return maxCardElevation + f;
    }

    /* renamed from: w */
    private float m80122w() {
        float f;
        float maxCardElevation = this.f54166c.getMaxCardElevation();
        if (m80110A()) {
            f = m80111B();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return maxCardElevation + f;
    }

    /* renamed from: x */
    private boolean m80123x() {
        if (Build.VERSION.SDK_INT < 21 || !this.f54168e.ad()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private boolean m80125z() {
        if (!this.f54166c.getPreventCornerOverlap() || m80123x()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo76910i() {
        Drawable drawable;
        Drawable drawable2 = this.f54173j;
        if (this.f54166c.isClickable()) {
            drawable = m80112C();
        } else {
            drawable = this.f54169f;
        }
        this.f54173j = drawable;
        if (drawable2 != drawable) {
            m80119b(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo76914m() {
        if (!mo76896a()) {
            this.f54166c.setBackgroundInternal(m80120c(this.f54168e));
        }
        this.f54166c.setForeground(m80120c(this.f54173j));
    }

    /* renamed from: C */
    private Drawable m80112C() {
        if (this.f54179p == null) {
            this.f54179p = m80113D();
        }
        if (this.f54180q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f54179p, this.f54169f, m80116G()});
            this.f54180q = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f54180q;
    }

    /* renamed from: y */
    private float m80124y() {
        if (!this.f54166c.getPreventCornerOverlap()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (Build.VERSION.SDK_INT < 21 || this.f54166c.getUseCompatPadding()) {
            return (float) ((1.0d - f54165b) * ((double) this.f54166c.getCardViewRadius()));
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo76916o() {
        boolean z;
        float f;
        if (m80125z() || m80110A()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = m80111B();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        int y = (int) (f - m80124y());
        this.f54166c.mo76852b(this.f54167d.left + y, this.f54167d.top + y, this.f54167d.right + y, this.f54167d.bottom + y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo76921t() {
        Drawable drawable = this.f54179p;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f54179p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f54179p.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* renamed from: B */
    private float m80111B() {
        return Math.max(Math.max(m80118a(this.f54177n.mo78005b(), this.f54168e.mo77961Z()), m80118a(this.f54177n.mo78006c(), this.f54168e.aa())), Math.max(m80118a(this.f54177n.mo78007d(), this.f54168e.ac()), m80118a(this.f54177n.mo78008e(), this.f54168e.ab())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76895a(boolean z) {
        this.f54183t = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76900b(boolean z) {
        this.f54184u = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76899b(ColorStateList colorStateList) {
        this.f54168e.mo77973g(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo76904d(ColorStateList colorStateList) {
        this.f54175l = colorStateList;
        m80115F();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76888a(int i) {
        if (i != this.f54172i) {
            this.f54172i = i;
            mo76915n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo76902c(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f54169f;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.mo77973g(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo76906e(ColorStateList colorStateList) {
        this.f54176m = colorStateList;
        Drawable drawable = this.f54174k;
        if (drawable != null) {
            C0774a.m3768a(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76898b(float f) {
        this.f54168e.mo77983p(f);
        MaterialShapeDrawable materialShapeDrawable = this.f54169f;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.mo77983p(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f54182s;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.mo77983p(f);
        }
    }

    /* renamed from: b */
    private void m80119b(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.f54166c.getForeground() instanceof InsetDrawable)) {
            this.f54166c.setForeground(m80120c(drawable));
        } else {
            ((InsetDrawable) this.f54166c.getForeground()).setDrawable(drawable);
        }
    }

    /* renamed from: c */
    private Drawable m80120c(Drawable drawable) {
        boolean z;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f54166c.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) m80121v());
            i2 = (int) Math.ceil((double) m80122w());
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new InsetDrawable(drawable, i2, i, i2, i) {
            /* class com.google.android.material.card.C22199a.C222001 */

            public int getMinimumHeight() {
                return -1;
            }

            public int getMinimumWidth() {
                return -1;
            }

            public boolean getPadding(Rect rect) {
                return false;
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76887a(float f) {
        mo76894a(this.f54177n.mo78002a(f));
        this.f54173j.invalidateSelf();
        if (m80110A() || m80125z()) {
            mo76916o();
        }
        if (m80110A()) {
            mo76914m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76891a(ColorStateList colorStateList) {
        if (this.f54178o != colorStateList) {
            this.f54178o = colorStateList;
            mo76915n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76892a(TypedArray typedArray) {
        Drawable drawable;
        ColorStateList a = C22313c.m80795a(this.f54166c.getContext(), typedArray, 8);
        this.f54178o = a;
        if (a == null) {
            this.f54178o = ColorStateList.valueOf(-1);
        }
        this.f54172i = typedArray.getDimensionPixelSize(9, 0);
        boolean z = typedArray.getBoolean(0, false);
        this.f54184u = z;
        this.f54166c.setLongClickable(z);
        this.f54176m = C22313c.m80795a(this.f54166c.getContext(), typedArray, 3);
        mo76893a(C22313c.m80797b(this.f54166c.getContext(), typedArray, 2));
        ColorStateList a2 = C22313c.m80795a(this.f54166c.getContext(), typedArray, 4);
        this.f54175l = a2;
        if (a2 == null) {
            this.f54175l = ColorStateList.valueOf(C22197a.m80102a(this.f54166c, (int) R.attr.colorControlHighlight));
        }
        mo76902c(C22313c.m80795a(this.f54166c.getContext(), typedArray, 1));
        m80115F();
        mo76913l();
        mo76915n();
        this.f54166c.setBackgroundInternal(m80120c(this.f54168e));
        if (this.f54166c.isClickable()) {
            drawable = m80112C();
        } else {
            drawable = this.f54169f;
        }
        this.f54173j = drawable;
        this.f54166c.setForeground(m80120c(drawable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76893a(Drawable drawable) {
        this.f54174k = drawable;
        if (drawable != null) {
            Drawable g = C0774a.m3779g(drawable.mutate());
            this.f54174k = g;
            C0774a.m3768a(g, this.f54176m);
        }
        if (this.f54180q != null) {
            this.f54180q.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, m80116G());
        }
    }

    /* renamed from: a */
    private float m80118a(C22390d dVar, float f) {
        if (dVar instanceof C22397k) {
            return (float) ((1.0d - f54165b) * ((double) f));
        }
        if (dVar instanceof C22391e) {
            return f / 2.0f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76889a(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        if (this.f54180q != null) {
            int i5 = this.f54170g;
            int i6 = this.f54171h;
            int i7 = (i - i5) - i6;
            int i8 = (i2 - i5) - i6;
            if (Build.VERSION.SDK_INT < 21) {
                z = true;
            } else {
                z = false;
            }
            if (z || this.f54166c.getUseCompatPadding()) {
                i8 -= (int) Math.ceil((double) (m80121v() * 2.0f));
                i7 -= (int) Math.ceil((double) (m80122w() * 2.0f));
            }
            int i9 = this.f54170g;
            if (ViewCompat.m4082h(this.f54166c) == 1) {
                i3 = i7;
                i4 = i9;
            } else {
                i4 = i7;
                i3 = i9;
            }
            this.f54180q.setLayerInset(2, i4, this.f54170g, i3, i8);
        }
    }

    public C22199a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f54166c = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.f54168e = materialShapeDrawable;
        materialShapeDrawable.mo77965a(materialCardView.getContext());
        materialShapeDrawable.mo77947G(-12303292);
        C22398l.C22400a n = materialShapeDrawable.getShapeAppearanceModel().mo78017n();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, new int[]{16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop}, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            n.mo78018a(obtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED));
        }
        this.f54169f = new MaterialShapeDrawable();
        mo76894a(n.mo78024a());
        Resources resources = materialCardView.getResources();
        this.f54170g = resources.getDimensionPixelSize(R.dimen.mtrl_card_checked_icon_margin);
        this.f54171h = resources.getDimensionPixelSize(R.dimen.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76890a(int i, int i2, int i3, int i4) {
        this.f54167d.set(i, i2, i3, i4);
        mo76916o();
    }
}
