package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.widget.C0940c;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.e */
public class C0444e {

    /* renamed from: a */
    private final CompoundButton f1624a;

    /* renamed from: b */
    private ColorStateList f1625b;

    /* renamed from: c */
    private PorterDuff.Mode f1626c;

    /* renamed from: d */
    private boolean f1627d;

    /* renamed from: e */
    private boolean f1628e;

    /* renamed from: f */
    private boolean f1629f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo2580a() {
        return this.f1625b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode mo2584b() {
        return this.f1626c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2585c() {
        if (this.f1629f) {
            this.f1629f = false;
            return;
        }
        this.f1629f = true;
        mo2586d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2586d() {
        Drawable b = C0940c.m4548b(this.f1624a);
        if (b == null) {
            return;
        }
        if (this.f1627d || this.f1628e) {
            Drawable mutate = C0774a.m3779g(b).mutate();
            if (this.f1627d) {
                C0774a.m3768a(mutate, this.f1625b);
            }
            if (this.f1628e) {
                C0774a.m3771a(mutate, this.f1626c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1624a.getDrawableState());
            }
            this.f1624a.setButtonDrawable(mutate);
        }
    }

    C0444e(CompoundButton compoundButton) {
        this.f1624a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2581a(ColorStateList colorStateList) {
        this.f1625b = colorStateList;
        this.f1627d = true;
        mo2586d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2579a(int i) {
        Drawable b;
        if (Build.VERSION.SDK_INT >= 17 || (b = C0940c.m4548b(this.f1624a)) == null) {
            return i;
        }
        return i + b.getIntrinsicWidth();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2582a(PorterDuff.Mode mode) {
        this.f1626c = mode;
        this.f1628e = true;
        mo2586d();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2583a(android.util.AttributeSet r12, int r13) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0444e.mo2583a(android.util.AttributeSet, int):void");
    }
}
