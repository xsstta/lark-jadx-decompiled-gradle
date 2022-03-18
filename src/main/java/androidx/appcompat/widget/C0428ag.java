package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.view.menu.C0316a;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0924x;
import androidx.core.view.C0929z;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.widget.ag */
public class C0428ag implements AbstractC0459o {

    /* renamed from: a */
    Toolbar f1549a;

    /* renamed from: b */
    CharSequence f1550b;

    /* renamed from: c */
    Window.Callback f1551c;

    /* renamed from: d */
    boolean f1552d;

    /* renamed from: e */
    private int f1553e;

    /* renamed from: f */
    private View f1554f;

    /* renamed from: g */
    private View f1555g;

    /* renamed from: h */
    private Drawable f1556h;

    /* renamed from: i */
    private Drawable f1557i;

    /* renamed from: j */
    private Drawable f1558j;

    /* renamed from: k */
    private boolean f1559k;

    /* renamed from: l */
    private CharSequence f1560l;

    /* renamed from: m */
    private CharSequence f1561m;

    /* renamed from: n */
    private ActionMenuPresenter f1562n;

    /* renamed from: o */
    private int f1563o;

    /* renamed from: p */
    private int f1564p;

    /* renamed from: q */
    private Drawable f1565q;

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: b */
    public void mo2508b(boolean z) {
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: m */
    public void mo2526m() {
        this.f1552d = true;
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: a */
    public ViewGroup mo2493a() {
        return this.f1549a;
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: o */
    public int mo2528o() {
        return this.f1553e;
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: p */
    public int mo2529p() {
        return this.f1563o;
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: a */
    public void mo2503a(boolean z) {
        this.f1549a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: b */
    public Context mo2504b() {
        return this.f1549a.getContext();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: d */
    public void mo2513d() {
        this.f1549a.mo2394h();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: e */
    public CharSequence mo2516e() {
        return this.f1549a.getTitle();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: f */
    public void mo2518f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: g */
    public void mo2520g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: h */
    public boolean mo2521h() {
        return this.f1549a.mo2352a();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: i */
    public boolean mo2522i() {
        return this.f1549a.mo2354b();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: j */
    public boolean mo2523j() {
        return this.f1549a.mo2355c();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: k */
    public boolean mo2524k() {
        return this.f1549a.mo2357d();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: l */
    public boolean mo2525l() {
        return this.f1549a.mo2358e();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: n */
    public void mo2527n() {
        this.f1549a.mo2359f();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: q */
    public Menu mo2530q() {
        return this.f1549a.getMenu();
    }

    /* renamed from: r */
    private int m1800r() {
        if (this.f1549a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1565q = this.f1549a.getNavigationIcon();
        return 15;
    }

    /* renamed from: s */
    private void m1801s() {
        Drawable drawable;
        int i = this.f1553e;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1557i;
            if (drawable == null) {
                drawable = this.f1556h;
            }
        } else {
            drawable = this.f1556h;
        }
        this.f1549a.setLogo(drawable);
    }

    /* renamed from: t */
    private void m1802t() {
        if ((this.f1553e & 4) != 0) {
            Toolbar toolbar = this.f1549a;
            Drawable drawable = this.f1558j;
            if (drawable == null) {
                drawable = this.f1565q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1549a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: u */
    private void m1803u() {
        if ((this.f1553e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1561m)) {
            this.f1549a.setNavigationContentDescription(this.f1564p);
        } else {
            this.f1549a.setNavigationContentDescription(this.f1561m);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: c */
    public boolean mo2512c() {
        return this.f1549a.mo2360g();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: a */
    public void mo2496a(Drawable drawable) {
        this.f1556h = drawable;
        m1801s();
    }

    /* renamed from: c */
    public void mo2510c(Drawable drawable) {
        this.f1558j = drawable;
        m1802t();
    }

    /* renamed from: e */
    private void m1799e(CharSequence charSequence) {
        this.f1550b = charSequence;
        if ((this.f1553e & 8) != 0) {
            this.f1549a.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: a */
    public void mo2495a(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0215a.m655b(mo2504b(), i);
        } else {
            drawable = null;
        }
        mo2496a(drawable);
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: b */
    public void mo2505b(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0215a.m655b(mo2504b(), i);
        } else {
            drawable = null;
        }
        mo2506b(drawable);
    }

    /* renamed from: c */
    public void mo2511c(CharSequence charSequence) {
        this.f1560l = charSequence;
        if ((this.f1553e & 8) != 0) {
            this.f1549a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: d */
    public void mo2514d(int i) {
        String str;
        if (i == 0) {
            str = null;
        } else {
            str = mo2504b().getString(i);
        }
        mo2515d(str);
    }

    /* renamed from: b */
    public void mo2506b(Drawable drawable) {
        this.f1557i = drawable;
        m1801s();
    }

    /* renamed from: d */
    public void mo2515d(CharSequence charSequence) {
        this.f1561m = charSequence;
        m1803u();
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: e */
    public void mo2517e(int i) {
        this.f1549a.setVisibility(i);
    }

    /* renamed from: f */
    public void mo2519f(int i) {
        if (i != this.f1564p) {
            this.f1564p = i;
            if (TextUtils.isEmpty(this.f1549a.getNavigationContentDescription())) {
                mo2514d(this.f1564p);
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: b */
    public void mo2507b(CharSequence charSequence) {
        this.f1559k = true;
        m1799e(charSequence);
    }

    /* renamed from: a */
    public void mo2498a(View view) {
        View view2 = this.f1555g;
        if (!(view2 == null || (this.f1553e & 16) == 0)) {
            this.f1549a.removeView(view2);
        }
        this.f1555g = view;
        if (view != null && (this.f1553e & 16) != 0) {
            this.f1549a.addView(view);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: c */
    public void mo2509c(int i) {
        View view;
        int i2 = this.f1553e ^ i;
        this.f1553e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1803u();
                }
                m1802t();
            }
            if ((i2 & 3) != 0) {
                m1801s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1549a.setTitle(this.f1550b);
                    this.f1549a.setSubtitle(this.f1560l);
                } else {
                    this.f1549a.setTitle((CharSequence) null);
                    this.f1549a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f1555g) != null) {
                if ((i & 16) != 0) {
                    this.f1549a.addView(view);
                } else {
                    this.f1549a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: a */
    public void mo2499a(Window.Callback callback) {
        this.f1551c = callback;
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: a */
    public void mo2501a(C0481y yVar) {
        Toolbar toolbar;
        View view = this.f1554f;
        if (view != null && view.getParent() == (toolbar = this.f1549a)) {
            toolbar.removeView(this.f1554f);
        }
        this.f1554f = yVar;
        if (yVar != null && this.f1563o == 2) {
            this.f1549a.addView(yVar, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1554f.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f476a = 8388691;
            yVar.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: a */
    public void mo2502a(CharSequence charSequence) {
        if (!this.f1559k) {
            m1799e(charSequence);
        }
    }

    public C0428ag(Toolbar toolbar, boolean z) {
        this(toolbar, z, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_material);
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: a */
    public C0924x mo2494a(final int i, long j) {
        float f;
        C0924x r = ViewCompat.m4103r(this.f1549a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return r.mo4723a(f).mo4724a(j).mo4727a(new C0929z() {
            /* class androidx.appcompat.widget.C0428ag.C04302 */

            /* renamed from: c */
            private boolean f1570c;

            @Override // androidx.core.view.C0929z, androidx.core.view.AbstractC0928y
            /* renamed from: c */
            public void mo2464c(View view) {
                this.f1570c = true;
            }

            @Override // androidx.core.view.C0929z, androidx.core.view.AbstractC0928y
            /* renamed from: a */
            public void mo868a(View view) {
                C0428ag.this.f1549a.setVisibility(0);
            }

            @Override // androidx.core.view.C0929z, androidx.core.view.AbstractC0928y
            /* renamed from: b */
            public void mo869b(View view) {
                if (!this.f1570c) {
                    C0428ag.this.f1549a.setVisibility(i);
                }
            }
        });
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: a */
    public void mo2497a(Menu menu, AbstractC0337l.AbstractC0338a aVar) {
        if (this.f1562n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1549a.getContext());
            this.f1562n = actionMenuPresenter;
            actionMenuPresenter.mo1344a(R.id.action_menu_presenter);
        }
        this.f1562n.mo1242a(aVar);
        this.f1549a.mo2350a((C0322f) menu, this.f1562n);
    }

    @Override // androidx.appcompat.widget.AbstractC0459o
    /* renamed from: a */
    public void mo2500a(AbstractC0337l.AbstractC0338a aVar, C0322f.AbstractC0323a aVar2) {
        this.f1549a.mo2351a(aVar, aVar2);
    }

    public C0428ag(Toolbar toolbar, boolean z, int i, int i2) {
        boolean z2;
        Drawable drawable;
        this.f1549a = toolbar;
        this.f1550b = toolbar.getTitle();
        this.f1560l = toolbar.getSubtitle();
        if (this.f1550b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1559k = z2;
        this.f1558j = toolbar.getNavigationIcon();
        C0427af a = C0427af.m1778a(toolbar.getContext(), null, new int[]{R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle}, R.attr.actionBarStyle, 0);
        this.f1565q = a.mo2477a(15);
        if (z) {
            CharSequence c = a.mo2484c(27);
            if (!TextUtils.isEmpty(c)) {
                mo2507b(c);
            }
            CharSequence c2 = a.mo2484c(25);
            if (!TextUtils.isEmpty(c2)) {
                mo2511c(c2);
            }
            Drawable a2 = a.mo2477a(20);
            if (a2 != null) {
                mo2506b(a2);
            }
            Drawable a3 = a.mo2477a(17);
            if (a3 != null) {
                mo2496a(a3);
            }
            if (this.f1558j == null && (drawable = this.f1565q) != null) {
                mo2510c(drawable);
            }
            mo2509c(a.mo2474a(10, 0));
            int g = a.mo2491g(9, 0);
            if (g != 0) {
                mo2498a(LayoutInflater.from(this.f1549a.getContext()).inflate(g, (ViewGroup) this.f1549a, false));
                mo2509c(this.f1553e | 16);
            }
            int f = a.mo2489f(13, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1549a.getLayoutParams();
                layoutParams.height = f;
                this.f1549a.setLayoutParams(layoutParams);
            }
            int d = a.mo2485d(7, -1);
            int d2 = a.mo2485d(3, -1);
            if (d >= 0 || d2 >= 0) {
                this.f1549a.mo2348a(Math.max(d, 0), Math.max(d2, 0));
            }
            int g2 = a.mo2491g(28, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f1549a;
                toolbar2.mo2349a(toolbar2.getContext(), g2);
            }
            int g3 = a.mo2491g(26, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f1549a;
                toolbar3.mo2353b(toolbar3.getContext(), g3);
            }
            int g4 = a.mo2491g(22, 0);
            if (g4 != 0) {
                this.f1549a.setPopupTheme(g4);
            }
        } else {
            this.f1553e = m1800r();
        }
        a.mo2482b();
        mo2519f(i);
        this.f1561m = this.f1549a.getNavigationContentDescription();
        this.f1549a.setNavigationOnClickListener(new View.OnClickListener() {
            /* class androidx.appcompat.widget.C0428ag.View$OnClickListenerC04291 */

            /* renamed from: a */
            final C0316a f1566a;

            {
                this.f1566a = new C0316a(C0428ag.this.f1549a.getContext(), 0, 16908332, 0, 0, C0428ag.this.f1550b);
            }

            public void onClick(View view) {
                if (C0428ag.this.f1551c != null && C0428ag.this.f1552d) {
                    C0428ag.this.f1551c.onMenuItemSelected(0, this.f1566a);
                }
            }
        });
    }
}
