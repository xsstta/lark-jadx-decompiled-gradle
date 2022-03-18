package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C0942e;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.widget.h */
public class C0448h {

    /* renamed from: a */
    private final ImageView f1639a;

    /* renamed from: b */
    private C0425ad f1640b;

    /* renamed from: c */
    private C0425ad f1641c;

    /* renamed from: d */
    private C0425ad f1642d;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo2601b() {
        C0425ad adVar = this.f1641c;
        if (adVar != null) {
            return adVar.f1541a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo2602c() {
        C0425ad adVar = this.f1641c;
        if (adVar != null) {
            return adVar.f1542b;
        }
        return null;
    }

    /* renamed from: e */
    private boolean m1929e() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            if (this.f1640b != null) {
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
    /* renamed from: d */
    public void mo2603d() {
        Drawable drawable = this.f1639a.getDrawable();
        if (drawable != null) {
            C0460p.m2060b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m1929e() || !m1928a(drawable)) {
            C0425ad adVar = this.f1641c;
            if (adVar != null) {
                C0445f.m1909a(drawable, adVar, this.f1639a.getDrawableState());
                return;
            }
            C0425ad adVar2 = this.f1640b;
            if (adVar2 != null) {
                C0445f.m1909a(drawable, adVar2, this.f1639a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2600a() {
        Drawable background = this.f1639a.getBackground();
        if (Build.VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public C0448h(ImageView imageView) {
        this.f1639a = imageView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2597a(ColorStateList colorStateList) {
        if (this.f1641c == null) {
            this.f1641c = new C0425ad();
        }
        this.f1641c.f1541a = colorStateList;
        this.f1641c.f1544d = true;
        mo2603d();
    }

    /* renamed from: a */
    private boolean m1928a(Drawable drawable) {
        if (this.f1642d == null) {
            this.f1642d = new C0425ad();
        }
        C0425ad adVar = this.f1642d;
        adVar.mo2471a();
        ColorStateList a = C0942e.m4550a(this.f1639a);
        if (a != null) {
            adVar.f1544d = true;
            adVar.f1541a = a;
        }
        PorterDuff.Mode b = C0942e.m4553b(this.f1639a);
        if (b != null) {
            adVar.f1543c = true;
            adVar.f1542b = b;
        }
        if (!adVar.f1544d && !adVar.f1543c) {
            return false;
        }
        C0445f.m1909a(drawable, adVar, this.f1639a.getDrawableState());
        return true;
    }

    /* renamed from: a */
    public void mo2596a(int i) {
        if (i != 0) {
            Drawable b = C0215a.m655b(this.f1639a.getContext(), i);
            if (b != null) {
                C0460p.m2060b(b);
            }
            this.f1639a.setImageDrawable(b);
        } else {
            this.f1639a.setImageDrawable(null);
        }
        mo2603d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2598a(PorterDuff.Mode mode) {
        if (this.f1641c == null) {
            this.f1641c = new C0425ad();
        }
        this.f1641c.f1542b = mode;
        this.f1641c.f1543c = true;
        mo2603d();
    }

    /* renamed from: a */
    public void mo2599a(AttributeSet attributeSet, int i) {
        int g;
        C0427af a = C0427af.m1778a(this.f1639a.getContext(), attributeSet, new int[]{16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode}, i, 0);
        ImageView imageView = this.f1639a;
        ViewCompat.m4034a(imageView, imageView.getContext(), new int[]{16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode}, attributeSet, a.mo2475a(), i, 0);
        try {
            Drawable drawable = this.f1639a.getDrawable();
            if (!(drawable != null || (g = a.mo2491g(1, -1)) == -1 || (drawable = C0215a.m655b(this.f1639a.getContext(), g)) == null)) {
                this.f1639a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0460p.m2060b(drawable);
            }
            if (a.mo2492g(2)) {
                C0942e.m4551a(this.f1639a, a.mo2488e(2));
            }
            if (a.mo2492g(3)) {
                C0942e.m4552a(this.f1639a, C0460p.m2058a(a.mo2474a(3, -1), null));
            }
        } finally {
            a.mo2482b();
        }
    }
}
