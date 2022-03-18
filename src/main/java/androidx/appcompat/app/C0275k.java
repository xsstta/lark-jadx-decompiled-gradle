package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.AbstractC0297b;
import androidx.appcompat.view.C0296a;
import androidx.appcompat.view.C0303f;
import androidx.appcompat.view.C0306g;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.widget.AbstractC0459o;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0481y;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC0882aa;
import androidx.core.view.AbstractC0928y;
import androidx.core.view.C0924x;
import androidx.core.view.C0929z;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.k */
public class C0275k extends ActionBar implements ActionBarOverlayLayout.AbstractC0352a {

    /* renamed from: s */
    private static final Interpolator f749s = new AccelerateInterpolator();

    /* renamed from: t */
    private static final Interpolator f750t = new DecelerateInterpolator();

    /* renamed from: A */
    private ArrayList<ActionBar.AbstractC0217a> f751A = new ArrayList<>();

    /* renamed from: B */
    private boolean f752B;

    /* renamed from: C */
    private int f753C = 0;

    /* renamed from: D */
    private boolean f754D;

    /* renamed from: E */
    private boolean f755E = true;

    /* renamed from: F */
    private boolean f756F;

    /* renamed from: a */
    Context f757a;

    /* renamed from: b */
    ActionBarOverlayLayout f758b;

    /* renamed from: c */
    ActionBarContainer f759c;

    /* renamed from: d */
    AbstractC0459o f760d;

    /* renamed from: e */
    ActionBarContextView f761e;

    /* renamed from: f */
    View f762f;

    /* renamed from: g */
    C0481y f763g;

    /* renamed from: h */
    C0279a f764h;

    /* renamed from: i */
    AbstractC0297b f765i;

    /* renamed from: j */
    AbstractC0297b.AbstractC0298a f766j;

    /* renamed from: k */
    boolean f767k = true;

    /* renamed from: l */
    boolean f768l;

    /* renamed from: m */
    boolean f769m;

    /* renamed from: n */
    C0306g f770n;

    /* renamed from: o */
    boolean f771o;

    /* renamed from: p */
    final AbstractC0928y f772p = new C0929z() {
        /* class androidx.appcompat.app.C0275k.C02761 */

        @Override // androidx.core.view.C0929z, androidx.core.view.AbstractC0928y
        /* renamed from: b */
        public void mo869b(View view) {
            if (C0275k.this.f767k && C0275k.this.f762f != null) {
                C0275k.this.f762f.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                C0275k.this.f759c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            C0275k.this.f759c.setVisibility(8);
            C0275k.this.f759c.setTransitioning(false);
            C0275k.this.f770n = null;
            C0275k.this.mo978h();
            if (C0275k.this.f758b != null) {
                ViewCompat.m4108w(C0275k.this.f758b);
            }
        }
    };

    /* renamed from: q */
    final AbstractC0928y f773q = new C0929z() {
        /* class androidx.appcompat.app.C0275k.C02772 */

        @Override // androidx.core.view.C0929z, androidx.core.view.AbstractC0928y
        /* renamed from: b */
        public void mo869b(View view) {
            C0275k.this.f770n = null;
            C0275k.this.f759c.requestLayout();
        }
    };

    /* renamed from: r */
    final AbstractC0882aa f774r = new AbstractC0882aa() {
        /* class androidx.appcompat.app.C0275k.C02783 */

        @Override // androidx.core.view.AbstractC0882aa
        public void a_(View view) {
            ((View) C0275k.this.f759c.getParent()).invalidate();
        }
    };

    /* renamed from: u */
    private Context f775u;

    /* renamed from: v */
    private Activity f776v;

    /* renamed from: w */
    private ArrayList<Object> f777w = new ArrayList<>();

    /* renamed from: x */
    private int f778x = -1;

    /* renamed from: y */
    private boolean f779y;

    /* renamed from: z */
    private boolean f780z;

    /* renamed from: a */
    static boolean m1009a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0352a
    /* renamed from: m */
    public void mo986m() {
    }

    /* renamed from: androidx.appcompat.app.k$a */
    public class C0279a extends AbstractC0297b implements C0322f.AbstractC0323a {

        /* renamed from: b */
        private final Context f785b;

        /* renamed from: c */
        private final C0322f f786c;

        /* renamed from: d */
        private AbstractC0297b.AbstractC0298a f787d;

        /* renamed from: e */
        private WeakReference<View> f788e;

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: b */
        public Menu mo993b() {
            return this.f786c;
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: a */
        public MenuInflater mo988a() {
            return new C0303f(this.f785b);
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: f */
        public CharSequence mo999f() {
            return C0275k.this.f761e.getTitle();
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: g */
        public CharSequence mo1000g() {
            return C0275k.this.f761e.getSubtitle();
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: h */
        public boolean mo1001h() {
            return C0275k.this.f761e.mo1678d();
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: i */
        public View mo1002i() {
            WeakReference<View> weakReference = this.f788e;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: d */
        public void mo997d() {
            if (C0275k.this.f764h == this) {
                this.f786c.mo1432h();
                try {
                    this.f787d.mo887b(this, this.f786c);
                } finally {
                    this.f786c.mo1434i();
                }
            }
        }

        /* renamed from: e */
        public boolean mo998e() {
            this.f786c.mo1432h();
            try {
                return this.f787d.mo885a(this, this.f786c);
            } finally {
                this.f786c.mo1434i();
            }
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: c */
        public void mo996c() {
            if (C0275k.this.f764h == this) {
                if (!C0275k.m1009a(C0275k.this.f768l, C0275k.this.f769m, false)) {
                    C0275k.this.f765i = this;
                    C0275k.this.f766j = this.f787d;
                } else {
                    this.f787d.mo884a(this);
                }
                this.f787d = null;
                C0275k.this.mo983j(false);
                C0275k.this.f761e.mo1676b();
                C0275k.this.f760d.mo2493a().sendAccessibilityEvent(32);
                C0275k.this.f758b.setHideOnContentScrollEnabled(C0275k.this.f771o);
                C0275k.this.f764h = null;
            }
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: b */
        public void mo995b(CharSequence charSequence) {
            C0275k.this.f761e.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: a */
        public void mo989a(int i) {
            mo995b(C0275k.this.f757a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: b */
        public void mo994b(int i) {
            mo991a((CharSequence) C0275k.this.f757a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: a */
        public void mo990a(View view) {
            C0275k.this.f761e.setCustomView(view);
            this.f788e = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
        /* renamed from: a */
        public void mo836a(C0322f fVar) {
            if (this.f787d != null) {
                mo997d();
                C0275k.this.f761e.mo1675a();
            }
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: a */
        public void mo991a(CharSequence charSequence) {
            C0275k.this.f761e.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC0297b
        /* renamed from: a */
        public void mo992a(boolean z) {
            super.mo992a(z);
            C0275k.this.f761e.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
        /* renamed from: a */
        public boolean mo839a(C0322f fVar, MenuItem menuItem) {
            AbstractC0297b.AbstractC0298a aVar = this.f787d;
            if (aVar != null) {
                return aVar.mo886a(this, menuItem);
            }
            return false;
        }

        public C0279a(Context context, AbstractC0297b.AbstractC0298a aVar) {
            this.f785b = context;
            this.f787d = aVar;
            C0322f a = new C0322f(context).mo1382a(1);
            this.f786c = a;
            a.mo1390a(this);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public void mo698a(boolean z) {
        mo975a(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public boolean mo699a(int i, KeyEvent keyEvent) {
        Menu b;
        C0279a aVar = this.f764h;
        if (aVar == null || (b = aVar.mo993b()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: p */
    private boolean m1015p() {
        return ViewCompat.m4012F(this.f759c);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public int mo692a() {
        return this.f760d.mo2528o();
    }

    /* renamed from: i */
    public int mo980i() {
        return this.f760d.mo2529p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo978h() {
        AbstractC0297b.AbstractC0298a aVar = this.f766j;
        if (aVar != null) {
            aVar.mo884a(this.f765i);
            this.f765i = null;
            this.f766j = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0352a
    /* renamed from: j */
    public void mo982j() {
        if (this.f769m) {
            this.f769m = false;
            m1012l(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0352a
    /* renamed from: k */
    public void mo984k() {
        if (!this.f769m) {
            this.f769m = true;
            m1012l(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0352a
    /* renamed from: l */
    public void mo985l() {
        C0306g gVar = this.f770n;
        if (gVar != null) {
            gVar.mo1197c();
            this.f770n = null;
        }
    }

    /* renamed from: n */
    private void m1013n() {
        if (!this.f754D) {
            this.f754D = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f758b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m1012l(false);
        }
    }

    /* renamed from: o */
    private void m1014o() {
        if (this.f754D) {
            this.f754D = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f758b;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1012l(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: f */
    public boolean mo711f() {
        AbstractC0459o oVar = this.f760d;
        if (oVar == null || !oVar.mo2512c()) {
            return false;
        }
        this.f760d.mo2513d();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: b */
    public Context mo701b() {
        if (this.f775u == null) {
            TypedValue typedValue = new TypedValue();
            this.f757a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f775u = new ContextThemeWrapper(this.f757a, i);
            } else {
                this.f775u = this.f757a;
            }
        }
        return this.f775u;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0352a
    /* renamed from: b */
    public void mo976b(int i) {
        this.f753C = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0352a
    /* renamed from: g */
    public void mo977g(boolean z) {
        this.f767k = z;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: b */
    public void mo702b(CharSequence charSequence) {
        this.f760d.mo2502a(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: d */
    public void mo706d(boolean z) {
        if (!this.f779y) {
            mo698a(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: b */
    public void mo703b(boolean z) {
        this.f760d.mo2508b(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: e */
    public void mo708e(boolean z) {
        C0306g gVar;
        this.f756F = z;
        if (!z && (gVar = this.f770n) != null) {
            gVar.mo1197c();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public void mo694a(float f) {
        ViewCompat.m4092k(this.f759c, f);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: c */
    public void mo704c(boolean z) {
        if (!z || this.f758b.mo1703a()) {
            this.f771o = z;
            this.f758b.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: f */
    public void mo710f(boolean z) {
        if (z != this.f780z) {
            this.f780z = z;
            int size = this.f751A.size();
            for (int i = 0; i < size; i++) {
                this.f751A.get(i).mo713a(z);
            }
        }
    }

    public C0275k(Dialog dialog) {
        m1008a(dialog.getWindow().getDecorView());
    }

    /* renamed from: b */
    private AbstractC0459o m1010b(View view) {
        String str;
        if (view instanceof AbstractC0459o) {
            return (AbstractC0459o) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: l */
    private void m1012l(boolean z) {
        if (m1009a(this.f768l, this.f769m, this.f754D)) {
            if (!this.f755E) {
                this.f755E = true;
                mo979h(z);
            }
        } else if (this.f755E) {
            this.f755E = false;
            mo981i(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public AbstractC0297b mo693a(AbstractC0297b.AbstractC0298a aVar) {
        C0279a aVar2 = this.f764h;
        if (aVar2 != null) {
            aVar2.mo996c();
        }
        this.f758b.setHideOnContentScrollEnabled(false);
        this.f761e.mo1677c();
        C0279a aVar3 = new C0279a(this.f761e.getContext(), aVar);
        if (!aVar3.mo998e()) {
            return null;
        }
        this.f764h = aVar3;
        aVar3.mo997d();
        this.f761e.mo1674a(aVar3);
        mo983j(true);
        this.f761e.sendAccessibilityEvent(32);
        return aVar3;
    }

    /* renamed from: k */
    private void m1011k(boolean z) {
        boolean z2;
        boolean z3;
        this.f752B = z;
        if (!z) {
            this.f760d.mo2501a((C0481y) null);
            this.f759c.setTabContainer(this.f763g);
        } else {
            this.f759c.setTabContainer(null);
            this.f760d.mo2501a(this.f763g);
        }
        boolean z4 = true;
        if (mo980i() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0481y yVar = this.f763g;
        if (yVar != null) {
            if (z2) {
                yVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f758b;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.m4108w(actionBarOverlayLayout);
                }
            } else {
                yVar.setVisibility(8);
            }
        }
        AbstractC0459o oVar = this.f760d;
        if (this.f752B || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        oVar.mo2503a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f758b;
        if (this.f752B || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public void mo695a(int i) {
        this.f760d.mo2514d(i);
    }

    /* renamed from: j */
    public void mo983j(boolean z) {
        C0924x xVar;
        C0924x xVar2;
        if (z) {
            m1013n();
        } else {
            m1014o();
        }
        if (m1015p()) {
            if (z) {
                xVar = this.f760d.mo2494a(4, 100);
                xVar2 = this.f761e.mo1673a(0, 200);
            } else {
                xVar2 = this.f760d.mo2494a(0, 200);
                xVar = this.f761e.mo1673a(8, 100);
            }
            C0306g gVar = new C0306g();
            gVar.mo1193a(xVar, xVar2);
            gVar.mo1195a();
        } else if (z) {
            this.f760d.mo2517e(4);
            this.f761e.setVisibility(0);
        } else {
            this.f760d.mo2517e(0);
            this.f761e.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m1008a(View view) {
        boolean z;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f758b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f760d = m1010b(view.findViewById(R.id.action_bar));
        this.f761e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f759c = actionBarContainer;
        AbstractC0459o oVar = this.f760d;
        if (oVar == null || this.f761e == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f757a = oVar.mo2504b();
        if ((this.f760d.mo2528o() & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f779y = true;
        }
        C0296a a = C0296a.m1150a(this.f757a);
        if (a.mo1156f() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo703b(z2);
        m1011k(a.mo1154d());
        TypedArray obtainStyledAttributes = this.f757a.obtainStyledAttributes(null, new int[]{R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle}, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            mo704c(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            mo694a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    public void mo979h(boolean z) {
        View view;
        View view2;
        C0306g gVar = this.f770n;
        if (gVar != null) {
            gVar.mo1197c();
        }
        this.f759c.setVisibility(0);
        if (this.f753C != 0 || (!this.f756F && !z)) {
            this.f759c.setAlpha(1.0f);
            this.f759c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            if (this.f767k && (view = this.f762f) != null) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            this.f773q.mo869b(null);
        } else {
            this.f759c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            float f = (float) (-this.f759c.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f759c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f759c.setTranslationY(f);
            C0306g gVar2 = new C0306g();
            C0924x c = ViewCompat.m4103r(this.f759c).mo4731c(BitmapDescriptorFactory.HUE_RED);
            c.mo4726a(this.f774r);
            gVar2.mo1192a(c);
            if (this.f767k && (view2 = this.f762f) != null) {
                view2.setTranslationY(f);
                gVar2.mo1192a(ViewCompat.m4103r(this.f762f).mo4731c(BitmapDescriptorFactory.HUE_RED));
            }
            gVar2.mo1191a(f750t);
            gVar2.mo1190a(250);
            gVar2.mo1194a(this.f773q);
            this.f770n = gVar2;
            gVar2.mo1195a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f758b;
        if (actionBarOverlayLayout != null) {
            ViewCompat.m4108w(actionBarOverlayLayout);
        }
    }

    /* renamed from: i */
    public void mo981i(boolean z) {
        View view;
        C0306g gVar = this.f770n;
        if (gVar != null) {
            gVar.mo1197c();
        }
        if (this.f753C != 0 || (!this.f756F && !z)) {
            this.f772p.mo869b(null);
            return;
        }
        this.f759c.setAlpha(1.0f);
        this.f759c.setTransitioning(true);
        C0306g gVar2 = new C0306g();
        float f = (float) (-this.f759c.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f759c.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0924x c = ViewCompat.m4103r(this.f759c).mo4731c(f);
        c.mo4726a(this.f774r);
        gVar2.mo1192a(c);
        if (this.f767k && (view = this.f762f) != null) {
            gVar2.mo1192a(ViewCompat.m4103r(view).mo4731c(f));
        }
        gVar2.mo1191a(f749s);
        gVar2.mo1190a(250);
        gVar2.mo1194a(this.f772p);
        this.f770n = gVar2;
        gVar2.mo1195a();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public void mo696a(Configuration configuration) {
        m1011k(C0296a.m1150a(this.f757a).mo1154d());
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public void mo697a(CharSequence charSequence) {
        this.f760d.mo2507b(charSequence);
    }

    public C0275k(Activity activity, boolean z) {
        this.f776v = activity;
        View decorView = activity.getWindow().getDecorView();
        m1008a(decorView);
        if (!z) {
            this.f762f = decorView.findViewById(16908290);
        }
    }

    /* renamed from: a */
    public void mo975a(int i, int i2) {
        int o = this.f760d.mo2528o();
        if ((i2 & 4) != 0) {
            this.f779y = true;
        }
        this.f760d.mo2509c((i & i2) | ((~i2) & o));
    }
}
