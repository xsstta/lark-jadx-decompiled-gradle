package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0774a;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.graphics.drawable.b */
public class C0289b extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private AbstractC0292b f818a;

    /* renamed from: b */
    private Rect f819b;

    /* renamed from: c */
    private Drawable f820c;

    /* renamed from: d */
    private Drawable f821d;

    /* renamed from: e */
    private int f822e = 255;

    /* renamed from: f */
    private boolean f823f;

    /* renamed from: g */
    private int f824g = -1;

    /* renamed from: h */
    private boolean f825h;

    /* renamed from: i */
    private Runnable f826i;

    /* renamed from: j */
    private long f827j;

    /* renamed from: k */
    private long f828k;

    /* renamed from: l */
    private C0291a f829l;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.graphics.drawable.b$b */
    public static abstract class AbstractC0292b extends Drawable.ConstantState {

        /* renamed from: A */
        boolean f832A;

        /* renamed from: B */
        int f833B;

        /* renamed from: C */
        int f834C;

        /* renamed from: D */
        int f835D;

        /* renamed from: E */
        boolean f836E;

        /* renamed from: F */
        ColorFilter f837F;

        /* renamed from: G */
        boolean f838G;

        /* renamed from: H */
        ColorStateList f839H;

        /* renamed from: I */
        PorterDuff.Mode f840I;

        /* renamed from: J */
        boolean f841J;

        /* renamed from: K */
        boolean f842K;

        /* renamed from: c */
        final C0289b f843c;

        /* renamed from: d */
        Resources f844d;

        /* renamed from: e */
        int f845e = 160;

        /* renamed from: f */
        int f846f;

        /* renamed from: g */
        int f847g;

        /* renamed from: h */
        SparseArray<Drawable.ConstantState> f848h;

        /* renamed from: i */
        Drawable[] f849i;

        /* renamed from: j */
        int f850j;

        /* renamed from: k */
        boolean f851k;

        /* renamed from: l */
        boolean f852l;

        /* renamed from: m */
        Rect f853m;

        /* renamed from: n */
        boolean f854n;

        /* renamed from: o */
        boolean f855o;

        /* renamed from: p */
        int f856p;

        /* renamed from: q */
        int f857q;

        /* renamed from: r */
        int f858r;

        /* renamed from: s */
        int f859s;

        /* renamed from: t */
        boolean f860t;

        /* renamed from: u */
        int f861u;

        /* renamed from: v */
        boolean f862v;

        /* renamed from: w */
        boolean f863w;

        /* renamed from: x */
        boolean f864x;

        /* renamed from: y */
        boolean f865y;

        /* renamed from: z */
        boolean f866z = true;

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final int mo1087c() {
            return this.f849i.length;
        }

        /* renamed from: d */
        public final int mo1090d() {
            return this.f850j;
        }

        /* renamed from: f */
        public final boolean mo1095f() {
            return this.f854n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1085b() {
            this.f860t = false;
            this.f862v = false;
        }

        public int getChangingConfigurations() {
            return this.f846f | this.f847g;
        }

        /* renamed from: g */
        public final int mo1096g() {
            if (!this.f855o) {
                mo1101k();
            }
            return this.f856p;
        }

        /* renamed from: h */
        public final int mo1098h() {
            if (!this.f855o) {
                mo1101k();
            }
            return this.f857q;
        }

        /* renamed from: i */
        public final int mo1099i() {
            if (!this.f855o) {
                mo1101k();
            }
            return this.f858r;
        }

        /* renamed from: j */
        public final int mo1100j() {
            if (!this.f855o) {
                mo1101k();
            }
            return this.f859s;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1057a() {
            int i = this.f850j;
            Drawable[] drawableArr = this.f849i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f832A = true;
        }

        /* renamed from: o */
        private void m1112o() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f848h;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f849i[this.f848h.keyAt(i)] = m1111b(this.f848h.valueAt(i).newDrawable(this.f844d));
                }
                this.f848h = null;
            }
        }

        public boolean canApplyTheme() {
            int i = this.f850j;
            Drawable[] drawableArr = this.f849i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f848h.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: l */
        public final int mo1102l() {
            int i;
            if (this.f860t) {
                return this.f861u;
            }
            m1112o();
            int i2 = this.f850j;
            Drawable[] drawableArr = this.f849i;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            } else {
                i = -2;
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            this.f861u = i;
            this.f860t = true;
            return i;
        }

        /* renamed from: m */
        public final boolean mo1103m() {
            if (this.f862v) {
                return this.f863w;
            }
            m1112o();
            int i = this.f850j;
            Drawable[] drawableArr = this.f849i;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f863w = z;
            this.f862v = true;
            return z;
        }

        /* renamed from: n */
        public synchronized boolean mo1104n() {
            if (this.f864x) {
                return this.f865y;
            }
            m1112o();
            this.f864x = true;
            int i = this.f850j;
            Drawable[] drawableArr = this.f849i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f865y = false;
                    return false;
                }
            }
            this.f865y = true;
            return true;
        }

        /* renamed from: e */
        public final Rect mo1093e() {
            Rect rect = null;
            if (this.f851k) {
                return null;
            }
            Rect rect2 = this.f853m;
            if (rect2 != null || this.f852l) {
                return rect2;
            }
            m1112o();
            Rect rect3 = new Rect();
            int i = this.f850j;
            Drawable[] drawableArr = this.f849i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    if (rect3.left > rect.left) {
                        rect.left = rect3.left;
                    }
                    if (rect3.top > rect.top) {
                        rect.top = rect3.top;
                    }
                    if (rect3.right > rect.right) {
                        rect.right = rect3.right;
                    }
                    if (rect3.bottom > rect.bottom) {
                        rect.bottom = rect3.bottom;
                    }
                }
            }
            this.f852l = true;
            this.f853m = rect;
            return rect;
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo1101k() {
            this.f855o = true;
            m1112o();
            int i = this.f850j;
            Drawable[] drawableArr = this.f849i;
            this.f857q = -1;
            this.f856p = -1;
            this.f859s = 0;
            this.f858r = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f856p) {
                    this.f856p = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f857q) {
                    this.f857q = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f858r) {
                    this.f858r = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f859s) {
                    this.f859s = minimumHeight;
                }
            }
        }

        /* renamed from: a */
        public final void mo1083a(boolean z) {
            this.f851k = z;
        }

        /* renamed from: b */
        public final void mo1086b(boolean z) {
            this.f854n = z;
        }

        /* renamed from: c */
        public final void mo1088c(int i) {
            this.f834C = i;
        }

        /* renamed from: d */
        public final void mo1091d(int i) {
            this.f835D = i;
        }

        /* renamed from: b */
        private Drawable m1111b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f833B);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f843c);
            return mutate;
        }

        /* renamed from: a */
        public final int mo1080a(Drawable drawable) {
            int i = this.f850j;
            if (i >= this.f849i.length) {
                mo1094e(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f843c);
            this.f849i[i] = drawable;
            this.f850j++;
            this.f847g = drawable.getChangingConfigurations() | this.f847g;
            mo1085b();
            this.f853m = null;
            this.f852l = false;
            this.f855o = false;
            this.f864x = false;
            return i;
        }

        /* renamed from: b */
        public final Drawable mo1084b(int i) {
            int indexOfKey;
            Drawable drawable = this.f849i[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f848h;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable b = m1111b(this.f848h.valueAt(indexOfKey).newDrawable(this.f844d));
            this.f849i[i] = b;
            this.f848h.removeAt(indexOfKey);
            if (this.f848h.size() == 0) {
                this.f848h = null;
            }
            return b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo1081a(Resources.Theme theme) {
            if (theme != null) {
                m1112o();
                int i = this.f850j;
                Drawable[] drawableArr = this.f849i;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f847g |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo1082a(theme.getResources());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo1082a(Resources resources) {
            if (resources != null) {
                this.f844d = resources;
                int a = C0289b.m1100a(resources, this.f845e);
                int i = this.f845e;
                this.f845e = a;
                if (i != a) {
                    this.f855o = false;
                    this.f852l = false;
                }
            }
        }

        /* renamed from: e */
        public void mo1094e(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f849i, 0, drawableArr, 0, i);
            this.f849i = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo1092d(int i, int i2) {
            boolean z;
            int i3 = this.f850j;
            Drawable[] drawableArr = this.f849i;
            boolean z2 = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        z = drawableArr[i4].setLayoutDirection(i);
                    } else {
                        z = false;
                    }
                    if (i4 == i2) {
                        z2 = z;
                    }
                }
            }
            this.f833B = i;
            return z2;
        }

        AbstractC0292b(AbstractC0292b bVar, C0289b bVar2, Resources resources) {
            Resources resources2;
            int i;
            this.f843c = bVar2;
            if (resources != null) {
                resources2 = resources;
            } else if (bVar != null) {
                resources2 = bVar.f844d;
            } else {
                resources2 = null;
            }
            this.f844d = resources2;
            if (bVar != null) {
                i = bVar.f845e;
            } else {
                i = 0;
            }
            int a = C0289b.m1100a(resources, i);
            this.f845e = a;
            if (bVar != null) {
                this.f846f = bVar.f846f;
                this.f847g = bVar.f847g;
                this.f864x = true;
                this.f865y = true;
                this.f851k = bVar.f851k;
                this.f854n = bVar.f854n;
                this.f866z = bVar.f866z;
                this.f832A = bVar.f832A;
                this.f833B = bVar.f833B;
                this.f834C = bVar.f834C;
                this.f835D = bVar.f835D;
                this.f836E = bVar.f836E;
                this.f837F = bVar.f837F;
                this.f838G = bVar.f838G;
                this.f839H = bVar.f839H;
                this.f840I = bVar.f840I;
                this.f841J = bVar.f841J;
                this.f842K = bVar.f842K;
                if (bVar.f845e == a) {
                    if (bVar.f852l) {
                        this.f853m = new Rect(bVar.f853m);
                        this.f852l = true;
                    }
                    if (bVar.f855o) {
                        this.f856p = bVar.f856p;
                        this.f857q = bVar.f857q;
                        this.f858r = bVar.f858r;
                        this.f859s = bVar.f859s;
                        this.f855o = true;
                    }
                }
                if (bVar.f860t) {
                    this.f861u = bVar.f861u;
                    this.f860t = true;
                }
                if (bVar.f862v) {
                    this.f863w = bVar.f863w;
                    this.f862v = true;
                }
                Drawable[] drawableArr = bVar.f849i;
                this.f849i = new Drawable[drawableArr.length];
                this.f850j = bVar.f850j;
                SparseArray<Drawable.ConstantState> sparseArray = bVar.f848h;
                if (sparseArray != null) {
                    this.f848h = sparseArray.clone();
                } else {
                    this.f848h = new SparseArray<>(this.f850j);
                }
                int i2 = this.f850j;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f848h.put(i3, constantState);
                        } else {
                            this.f849i[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f849i = new Drawable[10];
            this.f850j = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.graphics.drawable.b$a */
    public static class C0291a implements Drawable.Callback {

        /* renamed from: a */
        private Drawable.Callback f831a;

        public void invalidateDrawable(Drawable drawable) {
        }

        C0291a() {
        }

        /* renamed from: a */
        public Drawable.Callback mo1075a() {
            Drawable.Callback callback = this.f831a;
            this.f831a = null;
            return callback;
        }

        /* renamed from: a */
        public C0291a mo1076a(Drawable.Callback callback) {
            this.f831a = callback;
            return this;
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f831a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f831a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC0292b mo1018c() {
        return this.f818a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo1070d() {
        return this.f824g;
    }

    public int getAlpha() {
        return this.f822e;
    }

    public Drawable getCurrent() {
        return this.f820c;
    }

    public boolean canApplyTheme() {
        return this.f818a.canApplyTheme();
    }

    public boolean isAutoMirrored() {
        return this.f818a.f836E;
    }

    public boolean isStateful() {
        return this.f818a.mo1103m();
    }

    C0289b() {
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f818a.getChangingConfigurations();
    }

    /* renamed from: a */
    private boolean mo1013a() {
        if (!isAutoMirrored() || C0774a.m3781i(this) != 1) {
            return false;
        }
        return true;
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f818a.mo1104n()) {
            return null;
        }
        this.f818a.f846f = getChangingConfigurations();
        return this.f818a;
    }

    public int getIntrinsicHeight() {
        if (this.f818a.mo1095f()) {
            return this.f818a.mo1098h();
        }
        Drawable drawable = this.f820c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f818a.mo1095f()) {
            return this.f818a.mo1096g();
        }
        Drawable drawable = this.f820c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f818a.mo1095f()) {
            return this.f818a.mo1100j();
        }
        Drawable drawable = this.f820c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f818a.mo1095f()) {
            return this.f818a.mo1099i();
        }
        Drawable drawable = this.f820c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f820c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f818a.mo1102l();
    }

    public Drawable mutate() {
        if (!this.f825h && super.mutate() == this) {
            AbstractC0292b c = mo1018c();
            c.mo1057a();
            mo1014a(c);
            this.f825h = true;
        }
        return this;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f821d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f821d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f820c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f823f) {
                this.f820c.setAlpha(this.f822e);
            }
        }
        if (this.f828k != 0) {
            this.f828k = 0;
            z = true;
        }
        if (this.f827j != 0) {
            this.f827j = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1067a(Resources resources) {
        this.f818a.mo1082a(resources);
    }

    public void applyTheme(Resources.Theme theme) {
        this.f818a.mo1081a(theme);
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f820c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f820c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f821d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f819b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f821d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f820c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f818a.mo1092d(i, mo1070d());
    }

    public void invalidateDrawable(Drawable drawable) {
        AbstractC0292b bVar = this.f818a;
        if (bVar != null) {
            bVar.mo1085b();
        }
        if (drawable == this.f820c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f821d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f820c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f821d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f820c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void setAutoMirrored(boolean z) {
        if (this.f818a.f836E != z) {
            this.f818a.f836E = z;
            Drawable drawable = this.f820c;
            if (drawable != null) {
                C0774a.m3772a(drawable, this.f818a.f836E);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f818a.f838G = true;
        if (this.f818a.f837F != colorFilter) {
            this.f818a.f837F = colorFilter;
            Drawable drawable = this.f820c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        if (this.f818a.f866z != z) {
            this.f818a.f866z = z;
            Drawable drawable = this.f820c;
            if (drawable != null) {
                drawable.setDither(this.f818a.f866z);
            }
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f818a.f841J = true;
        if (this.f818a.f839H != colorStateList) {
            this.f818a.f839H = colorStateList;
            C0774a.m3768a(this.f820c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f818a.f842K = true;
        if (this.f818a.f840I != mode) {
            this.f818a.f840I = mode;
            C0774a.m3771a(this.f820c, mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1014a(AbstractC0292b bVar) {
        this.f818a = bVar;
        int i = this.f824g;
        if (i >= 0) {
            Drawable b = bVar.mo1084b(i);
            this.f820c = b;
            if (b != null) {
                m1101a(b);
            }
        }
        this.f821d = null;
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect e = this.f818a.mo1093e();
        if (e != null) {
            rect.set(e);
            if ((e.right | e.left | e.top | e.bottom) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            Drawable drawable = this.f820c;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (mo1013a()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void setAlpha(int i) {
        if (!this.f823f || this.f822e != i) {
            this.f823f = true;
            this.f822e = i;
            Drawable drawable = this.f820c;
            if (drawable == null) {
                return;
            }
            if (this.f827j == 0) {
                drawable.setAlpha(i);
            } else {
                mo1068a(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1068a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0289b.mo1068a(boolean):void");
    }

    /* renamed from: a */
    private void m1101a(Drawable drawable) {
        if (this.f829l == null) {
            this.f829l = new C0291a();
        }
        drawable.setCallback(this.f829l.mo1076a(drawable.getCallback()));
        try {
            if (this.f818a.f834C <= 0 && this.f823f) {
                drawable.setAlpha(this.f822e);
            }
            if (this.f818a.f838G) {
                drawable.setColorFilter(this.f818a.f837F);
            } else {
                if (this.f818a.f841J) {
                    C0774a.m3768a(drawable, this.f818a.f839H);
                }
                if (this.f818a.f842K) {
                    C0774a.m3771a(drawable, this.f818a.f840I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f818a.f866z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f818a.f836E);
            }
            Rect rect = this.f819b;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f829l.mo1075a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1069a(int i) {
        if (i == this.f824g) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f818a.f835D > 0) {
            Drawable drawable = this.f821d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f820c;
            if (drawable2 != null) {
                this.f821d = drawable2;
                this.f828k = ((long) this.f818a.f835D) + uptimeMillis;
            } else {
                this.f821d = null;
                this.f828k = 0;
            }
        } else {
            Drawable drawable3 = this.f820c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i < 0 || i >= this.f818a.f850j) {
            this.f820c = null;
            this.f824g = -1;
        } else {
            Drawable b = this.f818a.mo1084b(i);
            this.f820c = b;
            this.f824g = i;
            if (b != null) {
                if (this.f818a.f834C > 0) {
                    this.f827j = uptimeMillis + ((long) this.f818a.f834C);
                }
                m1101a(b);
            }
        }
        if (!(this.f827j == 0 && this.f828k == 0)) {
            Runnable runnable = this.f826i;
            if (runnable == null) {
                this.f826i = new Runnable() {
                    /* class androidx.appcompat.graphics.drawable.C0289b.RunnableC02901 */

                    public void run() {
                        C0289b.this.mo1068a(true);
                        C0289b.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            mo1068a(true);
        }
        invalidateSelf();
        return true;
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f820c;
        if (drawable != null) {
            C0774a.m3765a(drawable, f, f2);
        }
    }

    /* renamed from: a */
    static int m1100a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f821d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f820c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f820c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f820c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f819b;
        if (rect == null) {
            this.f819b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f820c;
        if (drawable != null) {
            C0774a.m3767a(drawable, i, i2, i3, i4);
        }
    }
}
