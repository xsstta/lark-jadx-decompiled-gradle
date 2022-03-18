package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.j */
public final class C0784j extends Drawable.ConstantState {

    /* renamed from: a */
    int f3176a;

    /* renamed from: b */
    Drawable.ConstantState f3177b;

    /* renamed from: c */
    ColorStateList f3178c;

    /* renamed from: d */
    PorterDuff.Mode f3179d = C0782h.f3168a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4361a() {
        if (this.f3177b != null) {
            return true;
        }
        return false;
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public int getChangingConfigurations() {
        int i;
        int i2 = this.f3176a;
        Drawable.ConstantState constantState = this.f3177b;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    C0784j(C0784j jVar) {
        if (jVar != null) {
            this.f3176a = jVar.f3176a;
            this.f3177b = jVar.f3177b;
            this.f3178c = jVar.f3178c;
            this.f3179d = jVar.f3179d;
        }
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0783i(this, resources);
        }
        return new C0782h(this, resources);
    }
}
