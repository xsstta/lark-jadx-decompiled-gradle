package com.lynx.tasm.animation.p1218b;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.lynx.tasm.behavior.ui.LynxUI;

/* renamed from: com.lynx.tasm.animation.b.i */
public class C26583i extends Animation implements AbstractC26580f {

    /* renamed from: a */
    private final LynxUI f65763a;

    /* renamed from: b */
    private final View f65764b;

    /* renamed from: c */
    private final int f65765c;

    /* renamed from: d */
    private final int f65766d;

    /* renamed from: e */
    private final int f65767e;

    /* renamed from: f */
    private final int f65768f;

    /* renamed from: g */
    private final int f65769g;

    /* renamed from: h */
    private final int f65770h;

    /* renamed from: i */
    private final int f65771i;

    /* renamed from: j */
    private final int f65772j;

    /* renamed from: k */
    private final int f65773k;

    /* renamed from: l */
    private final int f65774l;

    /* renamed from: m */
    private final int f65775m;

    /* renamed from: n */
    private final int f65776n;

    /* renamed from: o */
    private final Rect f65777o;

    /* renamed from: p */
    private float f65778p;

    /* renamed from: q */
    private float f65779q;

    /* renamed from: r */
    private float f65780r;

    /* renamed from: s */
    private float f65781s;

    /* renamed from: t */
    private int f65782t;

    /* renamed from: u */
    private int f65783u;

    /* renamed from: v */
    private int f65784v;

    /* renamed from: w */
    private int f65785w;

    public boolean willChangeBounds() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        this.f65763a.mo53590a(Math.round(this.f65778p + (this.f65780r * f)), Math.round(this.f65779q + (this.f65781s * f)), Math.round(((float) this.f65782t) + (((float) this.f65784v) * f)), Math.round(((float) this.f65783u) + (((float) this.f65785w) * f)), this.f65765c, this.f65766d, this.f65767e, this.f65768f, this.f65769g, this.f65770h, this.f65771i, this.f65772j, this.f65773k, this.f65774l, this.f65775m, this.f65776n, this.f65777o);
    }

    @Override // com.lynx.tasm.animation.p1218b.AbstractC26580f
    /* renamed from: a */
    public void mo94451a(int i, int i2, int i3, int i4) {
        m96383b(i, i2, i3, i4);
    }

    /* renamed from: b */
    private void m96383b(int i, int i2, int i3, int i4) {
        this.f65778p = this.f65764b.getX() - this.f65764b.getTranslationX();
        this.f65779q = this.f65764b.getY() - this.f65764b.getTranslationY();
        this.f65782t = this.f65764b.getWidth();
        int height = this.f65764b.getHeight();
        this.f65783u = height;
        this.f65780r = ((float) i) - this.f65778p;
        this.f65781s = ((float) i2) - this.f65779q;
        this.f65784v = i3 - this.f65782t;
        this.f65785w = i4 - height;
    }

    public C26583i(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.f65763a = lynxUI;
        this.f65764b = lynxUI.av();
        this.f65765c = i5;
        this.f65766d = i6;
        this.f65767e = i7;
        this.f65768f = i8;
        this.f65769g = i9;
        this.f65770h = i10;
        this.f65771i = i11;
        this.f65772j = i12;
        this.f65773k = i13;
        this.f65774l = i14;
        this.f65775m = i15;
        this.f65776n = i16;
        this.f65777o = rect;
        m96383b(i, i2, i3, i4);
    }
}
