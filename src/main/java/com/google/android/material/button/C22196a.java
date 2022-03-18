package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p982c.C22197a;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.p989j.C22372a;
import com.google.android.material.p989j.C22375b;
import com.google.android.material.shape.AbstractC22413o;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.button.a */
public class C22196a {

    /* renamed from: a */
    private static final boolean f54136a;

    /* renamed from: b */
    private final MaterialButton f54137b;

    /* renamed from: c */
    private C22398l f54138c;

    /* renamed from: d */
    private int f54139d;

    /* renamed from: e */
    private int f54140e;

    /* renamed from: f */
    private int f54141f;

    /* renamed from: g */
    private int f54142g;

    /* renamed from: h */
    private int f54143h;

    /* renamed from: i */
    private int f54144i;

    /* renamed from: j */
    private PorterDuff.Mode f54145j;

    /* renamed from: k */
    private ColorStateList f54146k;

    /* renamed from: l */
    private ColorStateList f54147l;

    /* renamed from: m */
    private ColorStateList f54148m;

    /* renamed from: n */
    private Drawable f54149n;

    /* renamed from: o */
    private boolean f54150o;

    /* renamed from: p */
    private boolean f54151p;

    /* renamed from: q */
    private boolean f54152q;

    /* renamed from: r */
    private boolean f54153r;

    /* renamed from: s */
    private LayerDrawable f54154s;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo76838c() {
        return this.f54146k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo76841d() {
        return this.f54145j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ColorStateList mo76842e() {
        return this.f54148m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo76843f() {
        return this.f54147l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo76844g() {
        return this.f54144i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo76845h() {
        return this.f54143h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo76847j() {
        return this.f54153r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C22398l mo76849l() {
        return this.f54138c;
    }

    /* renamed from: o */
    private MaterialShapeDrawable m80073o() {
        return m80070c(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo76837b() {
        return this.f54151p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public MaterialShapeDrawable mo76846i() {
        return m80070c(false);
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f54136a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76826a() {
        this.f54151p = true;
        this.f54137b.setSupportBackgroundTintList(this.f54146k);
        this.f54137b.setSupportBackgroundTintMode(this.f54145j);
    }

    /* renamed from: n */
    private void m80072n() {
        int i;
        MaterialShapeDrawable i2 = mo76846i();
        MaterialShapeDrawable o = m80073o();
        if (i2 != null) {
            i2.mo77963a((float) this.f54144i, this.f54147l);
            if (o != null) {
                float f = (float) this.f54144i;
                if (this.f54150o) {
                    i = C22197a.m80102a(this.f54137b, (int) R.attr.colorSurface);
                } else {
                    i = 0;
                }
                o.mo77962a(f, i);
            }
        }
    }

    /* renamed from: k */
    public AbstractC22413o mo76848k() {
        LayerDrawable layerDrawable = this.f54154s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f54154s.getNumberOfLayers() > 2) {
            return (AbstractC22413o) this.f54154s.getDrawable(2);
        }
        return (AbstractC22413o) this.f54154s.getDrawable(1);
    }

    /* renamed from: m */
    private Drawable m80071m() {
        int i;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f54138c);
        materialShapeDrawable.mo77965a(this.f54137b.getContext());
        C0774a.m3768a(materialShapeDrawable, this.f54146k);
        PorterDuff.Mode mode = this.f54145j;
        if (mode != null) {
            C0774a.m3771a(materialShapeDrawable, mode);
        }
        materialShapeDrawable.mo77963a((float) this.f54144i, this.f54147l);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f54138c);
        materialShapeDrawable2.setTint(0);
        float f = (float) this.f54144i;
        if (this.f54150o) {
            i = C22197a.m80102a(this.f54137b, (int) R.attr.colorSurface);
        } else {
            i = 0;
        }
        materialShapeDrawable2.mo77962a(f, i);
        if (f54136a) {
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f54138c);
            this.f54149n = materialShapeDrawable3;
            C0774a.m3766a(materialShapeDrawable3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C22375b.m81040b(this.f54148m), m80068a(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.f54149n);
            this.f54154s = rippleDrawable;
            return rippleDrawable;
        }
        C22372a aVar = new C22372a(this.f54138c);
        this.f54149n = aVar;
        C0774a.m3768a(aVar, C22375b.m81040b(this.f54148m));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable, this.f54149n});
        this.f54154s = layerDrawable;
        return m80068a(layerDrawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76836b(boolean z) {
        this.f54153r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76832a(C22398l lVar) {
        this.f54138c = lVar;
        m80069b(lVar);
    }

    /* renamed from: a */
    private InsetDrawable m80068a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f54139d, this.f54141f, this.f54140e, this.f54142g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76834b(int i) {
        if (this.f54144i != i) {
            this.f54144i = i;
            m80072n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo76840c(ColorStateList colorStateList) {
        if (this.f54147l != colorStateList) {
            this.f54147l = colorStateList;
            m80072n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo76839c(int i) {
        if (!this.f54152q || this.f54143h != i) {
            this.f54143h = i;
            this.f54152q = true;
            mo76832a(this.f54138c.mo78002a((float) i));
        }
    }

    /* renamed from: b */
    private void m80069b(C22398l lVar) {
        if (mo76846i() != null) {
            mo76846i().setShapeAppearanceModel(lVar);
        }
        if (m80073o() != null) {
            m80073o().setShapeAppearanceModel(lVar);
        }
        if (mo76848k() != null) {
            mo76848k().setShapeAppearanceModel(lVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private MaterialShapeDrawable m80070c(boolean z) {
        LayerDrawable layerDrawable = this.f54154s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f54136a) {
            return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f54154s.getDrawable(0)).getDrawable()).getDrawable(!z);
        }
        return (MaterialShapeDrawable) this.f54154s.getDrawable(!z ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76827a(int i) {
        if (mo76846i() != null) {
            mo76846i().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76835b(ColorStateList colorStateList) {
        if (this.f54148m != colorStateList) {
            this.f54148m = colorStateList;
            boolean z = f54136a;
            if (z && (this.f54137b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f54137b.getBackground()).setColor(C22375b.m81040b(colorStateList));
            } else if (!z && (this.f54137b.getBackground() instanceof C22372a)) {
                ((C22372a) this.f54137b.getBackground()).setTintList(C22375b.m81040b(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76829a(ColorStateList colorStateList) {
        if (this.f54146k != colorStateList) {
            this.f54146k = colorStateList;
            if (mo76846i() != null) {
                C0774a.m3768a(mo76846i(), this.f54146k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76830a(TypedArray typedArray) {
        this.f54139d = typedArray.getDimensionPixelOffset(1, 0);
        this.f54140e = typedArray.getDimensionPixelOffset(2, 0);
        this.f54141f = typedArray.getDimensionPixelOffset(3, 0);
        this.f54142g = typedArray.getDimensionPixelOffset(4, 0);
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(8, -1);
            this.f54143h = dimensionPixelSize;
            mo76832a(this.f54138c.mo78002a((float) dimensionPixelSize));
            this.f54152q = true;
        }
        this.f54144i = typedArray.getDimensionPixelSize(20, 0);
        this.f54145j = C22365r.m81021a(typedArray.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        this.f54146k = C22313c.m80795a(this.f54137b.getContext(), typedArray, 6);
        this.f54147l = C22313c.m80795a(this.f54137b.getContext(), typedArray, 19);
        this.f54148m = C22313c.m80795a(this.f54137b.getContext(), typedArray, 16);
        this.f54153r = typedArray.getBoolean(5, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(9, 0);
        int l = ViewCompat.m4094l(this.f54137b);
        int paddingTop = this.f54137b.getPaddingTop();
        int m = ViewCompat.m4097m(this.f54137b);
        int paddingBottom = this.f54137b.getPaddingBottom();
        if (typedArray.hasValue(0)) {
            mo76826a();
        } else {
            this.f54137b.setInternalBackground(m80071m());
            MaterialShapeDrawable i = mo76846i();
            if (i != null) {
                i.mo77985r((float) dimensionPixelSize2);
            }
        }
        ViewCompat.m4058b(this.f54137b, l + this.f54139d, paddingTop + this.f54141f, m + this.f54140e, paddingBottom + this.f54142g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76831a(PorterDuff.Mode mode) {
        if (this.f54145j != mode) {
            this.f54145j = mode;
            if (mo76846i() != null && this.f54145j != null) {
                C0774a.m3771a(mo76846i(), this.f54145j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76833a(boolean z) {
        this.f54150o = z;
        m80072n();
    }

    C22196a(MaterialButton materialButton, C22398l lVar) {
        this.f54137b = materialButton;
        this.f54138c = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76828a(int i, int i2) {
        Drawable drawable = this.f54149n;
        if (drawable != null) {
            drawable.setBounds(this.f54139d, this.f54141f, i2 - this.f54140e, i - this.f54142g);
        }
    }
}
