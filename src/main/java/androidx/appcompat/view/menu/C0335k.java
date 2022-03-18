package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.core.view.C0904f;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.view.menu.k */
public class C0335k {

    /* renamed from: a */
    private final Context f1133a;

    /* renamed from: b */
    private final C0322f f1134b;

    /* renamed from: c */
    private final boolean f1135c;

    /* renamed from: d */
    private final int f1136d;

    /* renamed from: e */
    private final int f1137e;

    /* renamed from: f */
    private View f1138f;

    /* renamed from: g */
    private int f1139g;

    /* renamed from: h */
    private boolean f1140h;

    /* renamed from: i */
    private AbstractC0337l.AbstractC0338a f1141i;

    /* renamed from: j */
    private AbstractC0334j f1142j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1143k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1144l;

    /* renamed from: a */
    public int mo1593a() {
        return this.f1139g;
    }

    /* renamed from: b */
    public void mo1600b() {
        if (!mo1602d()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: c */
    public AbstractC0334j mo1601c() {
        if (this.f1142j == null) {
            this.f1142j = m1448i();
        }
        return this.f1142j;
    }

    /* renamed from: e */
    public void mo1603e() {
        if (mo1605g()) {
            this.f1142j.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo1604f() {
        this.f1142j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1143k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: g */
    public boolean mo1605g() {
        AbstractC0334j jVar = this.f1142j;
        if (jVar == null || !jVar.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public ListView mo1606h() {
        return mo1601c().getListView();
    }

    /* renamed from: d */
    public boolean mo1602d() {
        if (mo1605g()) {
            return true;
        }
        if (this.f1138f == null) {
            return false;
        }
        m1447a(0, 0, false, false);
        return true;
    }

    /* renamed from: i */
    private AbstractC0334j m1448i() {
        boolean z;
        AbstractC0334j jVar;
        Display defaultDisplay = ((WindowManager) this.f1133a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.f1133a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jVar = new CascadingMenuPopup(this.f1133a, this.f1138f, this.f1136d, this.f1137e, this.f1135c);
        } else {
            jVar = new View$OnKeyListenerC0343p(this.f1133a, this.f1134b, this.f1138f, this.f1136d, this.f1137e, this.f1135c);
        }
        jVar.mo1240a(this.f1134b);
        jVar.mo1239a(this.f1144l);
        jVar.mo1238a(this.f1138f);
        jVar.mo1242a(this.f1141i);
        jVar.mo1246b(this.f1140h);
        jVar.mo1236a(this.f1139g);
        return jVar;
    }

    /* renamed from: a */
    public void mo1594a(int i) {
        this.f1139g = i;
    }

    /* renamed from: a */
    public void mo1595a(View view) {
        this.f1138f = view;
    }

    /* renamed from: a */
    public void mo1596a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1143k = onDismissListener;
    }

    /* renamed from: a */
    public void mo1597a(AbstractC0337l.AbstractC0338a aVar) {
        this.f1141i = aVar;
        AbstractC0334j jVar = this.f1142j;
        if (jVar != null) {
            jVar.mo1242a(aVar);
        }
    }

    /* renamed from: a */
    public void mo1598a(boolean z) {
        this.f1140h = z;
        AbstractC0334j jVar = this.f1142j;
        if (jVar != null) {
            jVar.mo1246b(z);
        }
    }

    /* renamed from: a */
    public boolean mo1599a(int i, int i2) {
        if (mo1605g()) {
            return true;
        }
        if (this.f1138f == null) {
            return false;
        }
        m1447a(i, i2, true, true);
        return true;
    }

    /* renamed from: a */
    private void m1447a(int i, int i2, boolean z, boolean z2) {
        AbstractC0334j c = mo1601c();
        c.mo1249c(z2);
        if (z) {
            if ((C0904f.m4351a(this.f1139g, ViewCompat.m4082h(this.f1138f)) & 7) == 5) {
                i -= this.f1138f.getWidth();
            }
            c.mo1245b(i);
            c.mo1248c(i2);
            int i3 = (int) ((this.f1133a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo1590a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.show();
    }

    public C0335k(Context context, C0322f fVar, View view, boolean z, int i) {
        this(context, fVar, view, z, i, 0);
    }

    public C0335k(Context context, C0322f fVar, View view, boolean z, int i, int i2) {
        this.f1139g = 8388611;
        this.f1144l = new PopupWindow.OnDismissListener() {
            /* class androidx.appcompat.view.menu.C0335k.C03361 */

            public void onDismiss() {
                C0335k.this.mo1604f();
            }
        };
        this.f1133a = context;
        this.f1134b = fVar;
        this.f1138f = view;
        this.f1135c = z;
        this.f1136d = i;
        this.f1137e = i2;
    }
}
