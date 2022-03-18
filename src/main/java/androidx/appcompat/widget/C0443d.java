package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.d */
public class C0443d {

    /* renamed from: a */
    private final View f1618a;

    /* renamed from: b */
    private final C0445f f1619b;

    /* renamed from: c */
    private int f1620c = -1;

    /* renamed from: d */
    private C0425ad f1621d;

    /* renamed from: e */
    private C0425ad f1622e;

    /* renamed from: f */
    private C0425ad f1623f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo2570a() {
        C0425ad adVar = this.f1622e;
        if (adVar != null) {
            return adVar.f1541a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode mo2576b() {
        C0425ad adVar = this.f1622e;
        if (adVar != null) {
            return adVar.f1542b;
        }
        return null;
    }

    /* renamed from: d */
    private boolean m1889d() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            if (this.f1621d != null) {
                return true;
            }
            return false;
        } else if (i == 21) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2578c() {
        Drawable background = this.f1618a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1889d() || !m1888b(background)) {
            C0425ad adVar = this.f1622e;
            if (adVar != null) {
                C0445f.m1909a(background, adVar, this.f1618a.getDrawableState());
                return;
            }
            C0425ad adVar2 = this.f1621d;
            if (adVar2 != null) {
                C0445f.m1909a(background, adVar2, this.f1618a.getDrawableState());
            }
        }
    }

    C0443d(View view) {
        this.f1618a = view;
        this.f1619b = C0445f.m1910b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2571a(int i) {
        ColorStateList colorStateList;
        this.f1620c = i;
        C0445f fVar = this.f1619b;
        if (fVar != null) {
            colorStateList = fVar.mo2590b(this.f1618a.getContext(), i);
        } else {
            colorStateList = null;
        }
        mo2577b(colorStateList);
        mo2578c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2577b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1621d == null) {
                this.f1621d = new C0425ad();
            }
            this.f1621d.f1541a = colorStateList;
            this.f1621d.f1544d = true;
        } else {
            this.f1621d = null;
        }
        mo2578c();
    }

    /* renamed from: b */
    private boolean m1888b(Drawable drawable) {
        if (this.f1623f == null) {
            this.f1623f = new C0425ad();
        }
        C0425ad adVar = this.f1623f;
        adVar.mo2471a();
        ColorStateList B = ViewCompat.m4008B(this.f1618a);
        if (B != null) {
            adVar.f1544d = true;
            adVar.f1541a = B;
        }
        PorterDuff.Mode C = ViewCompat.m4009C(this.f1618a);
        if (C != null) {
            adVar.f1543c = true;
            adVar.f1542b = C;
        }
        if (!adVar.f1544d && !adVar.f1543c) {
            return false;
        }
        C0445f.m1909a(drawable, adVar, this.f1618a.getDrawableState());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2572a(ColorStateList colorStateList) {
        if (this.f1622e == null) {
            this.f1622e = new C0425ad();
        }
        this.f1622e.f1541a = colorStateList;
        this.f1622e.f1544d = true;
        mo2578c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2573a(PorterDuff.Mode mode) {
        if (this.f1622e == null) {
            this.f1622e = new C0425ad();
        }
        this.f1622e.f1542b = mode;
        this.f1622e.f1543c = true;
        mo2578c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2574a(Drawable drawable) {
        this.f1620c = -1;
        mo2577b((ColorStateList) null);
        mo2578c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2575a(AttributeSet attributeSet, int i) {
        C0427af a = C0427af.m1778a(this.f1618a.getContext(), attributeSet, new int[]{16842964, R.attr.backgroundTint, R.attr.backgroundTintMode}, i, 0);
        View view = this.f1618a;
        ViewCompat.m4034a(view, view.getContext(), new int[]{16842964, R.attr.backgroundTint, R.attr.backgroundTintMode}, attributeSet, a.mo2475a(), i, 0);
        try {
            if (a.mo2492g(0)) {
                this.f1620c = a.mo2491g(0, -1);
                ColorStateList b = this.f1619b.mo2590b(this.f1618a.getContext(), this.f1620c);
                if (b != null) {
                    mo2577b(b);
                }
            }
            if (a.mo2492g(1)) {
                ViewCompat.m4035a(this.f1618a, a.mo2488e(1));
            }
            if (a.mo2492g(2)) {
                ViewCompat.m4037a(this.f1618a, C0460p.m2058a(a.mo2474a(2, -1), null));
            }
        } finally {
            a.mo2482b();
        }
    }
}
