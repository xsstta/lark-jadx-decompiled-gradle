package com.bytedance.ee.bear.list.homepage.title;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;

public class HomeMainTitleBar extends LinearLayout implements AbstractC8505c {

    /* renamed from: a */
    protected int f22936a;

    /* renamed from: b */
    protected int f22937b;

    /* renamed from: c */
    public Animator f22938c;

    /* renamed from: d */
    public boolean f22939d = true;

    /* renamed from: e */
    private BaseTitleBar f22940e;

    /* renamed from: f */
    private LinearLayout f22941f;

    /* renamed from: g */
    private CustomTitleView f22942g;

    /* renamed from: h */
    private LinearLayout f22943h;

    /* renamed from: i */
    private ImageView f22944i;

    /* renamed from: j */
    private FrameLayout f22945j;

    /* renamed from: k */
    private AppCompatImageView f22946k;

    /* renamed from: l */
    private UDBadgeView f22947l;

    /* renamed from: m */
    private AppCompatImageView f22948m;

    /* renamed from: n */
    private AppCompatImageView f22949n;

    /* renamed from: o */
    private AppCompatImageView f22950o;

    /* renamed from: p */
    private String f22951p = "";

    /* renamed from: q */
    private int f22952q;

    /* renamed from: r */
    private boolean f22953r;

    /* renamed from: s */
    private FrameLayout f22954s;

    /* renamed from: t */
    private AbstractC8496b f22955t;

    /* renamed from: u */
    private View.OnClickListener f22956u;

    /* renamed from: v */
    private View.OnClickListener f22957v;

    /* renamed from: w */
    private C8506d f22958w;

    public enum TitleType {
        HOMEPAGE,
        FOLDER_SUB,
        WIKI_HOME,
        PIN_ALL,
        SPACE_ROUTE,
        TODO
    }

    /* renamed from: com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar$a */
    public interface AbstractC8495a {
        /* renamed from: a */
        void mo33214a(boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar$b */
    public interface AbstractC8496b {
        /* renamed from: a */
        boolean mo33215a();
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public View getCreateView() {
        return this.f22954s;
    }

    public View getLeftView() {
        return this.f22941f;
    }

    public String getOriginTitle() {
        return this.f22951p;
    }

    public BaseTitleBar getTitleBar() {
        return this.f22940e;
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public int getTitleType() {
        return this.f22952q;
    }

    /* renamed from: e */
    public void mo33185e() {
        this.f22943h.removeAllViews();
    }

    public Bitmap getTitleSnapshot() {
        return C8292f.m34121a(this.f22940e);
    }

    /* renamed from: j */
    public void mo33197j() {
        this.f22958w.mo33246a();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m35195o();
    }

    /* renamed from: b */
    public void mo33179b() {
        this.f22952q = TitleType.SPACE_ROUTE.ordinal();
        m35192l();
        m35193m();
    }

    /* renamed from: g */
    public void mo33187g() {
        UDBadgeView uDBadgeView = this.f22947l;
        if (uDBadgeView != null) {
            uDBadgeView.setVisibility(8);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public int getTitleBarHeight() {
        return getResources().getDimensionPixelSize(R.dimen.list_home_title_bar_height_min);
    }

    /* renamed from: c */
    public void mo33181c() {
        this.f22952q = TitleType.FOLDER_SUB.ordinal();
        m35192l();
        m35193m();
        mo33195h();
    }

    /* renamed from: d */
    public void mo33183d() {
        this.f22952q = TitleType.WIKI_HOME.ordinal();
        CustomTitleView customTitleView = new CustomTitleView(getContext());
        this.f22942g = customTitleView;
        customTitleView.setTitleSize(18.0f);
        this.f22940e.setCustomTitleView(this.f22942g);
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: k */
    public void mo33198k() {
        mo33197j();
        m35189a(this.f22936a);
        setAlpha(1.0f);
        setVisibility(0);
    }

    /* renamed from: l */
    private void m35192l() {
        CustomTitleView customTitleView = new CustomTitleView(getContext());
        this.f22942g = customTitleView;
        customTitleView.setTitleSize(17.0f);
        this.f22942g.mo30198a(C57582a.m223600a(6), 0, 0, 0);
        this.f22942g.setGravity(17);
        this.f22942g.setTitleTextColor(R.color.text_title);
        this.f22942g.setTitleTextBold(true);
        this.f22940e.setCustomTitleView(this.f22942g);
    }

    /* renamed from: m */
    private void m35193m() {
        if (this.f22950o == null) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            this.f22950o = appCompatImageView;
            appCompatImageView.setBackgroundResource(R.drawable.ud_icon_search_outlined);
            C13747j.m55726a((View) this.f22950o, (int) R.color.facade_selector_icon_n1);
        }
        mo33177a(this.f22950o);
    }

    /* renamed from: p */
    private void m35196p() {
        this.f22945j = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.list_home_search, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.height = (int) getResources().getDimension(R.dimen.list_home_title_search_height);
        layoutParams.setMargins(C13749l.m55738a(16), 0, C13749l.m55738a(16), 0);
        addView(this.f22945j, layoutParams);
    }

    /* renamed from: h */
    public void mo33195h() {
        if (this.f22949n == null) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            this.f22949n = appCompatImageView;
            appCompatImageView.setBackgroundResource(R.drawable.ud_icon_more_outlined);
            C13747j.m55726a((View) this.f22949n, (int) R.color.facade_selector_icon_n1);
        }
        mo33177a(this.f22949n);
    }

    /* renamed from: n */
    private void m35194n() {
        if (this.f22941f == null) {
            this.f22941f = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.list_titlebar_custom_view, (ViewGroup) null);
        }
        CustomTitleView customTitleView = (CustomTitleView) this.f22941f.findViewById(R.id.loading_title);
        this.f22942g = customTitleView;
        customTitleView.setTitleSize(24.0f);
        this.f22942g.setTitleTextBold(true);
        this.f22940e.setCustomLeftView(this.f22941f);
        this.f22944i = (ImageView) this.f22941f.findViewById(R.id.menu_view);
    }

    /* renamed from: o */
    private void m35195o() {
        this.f22940e = new BaseTitleBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.height = (int) getResources().getDimension(R.dimen.list_home_title_bar_height_min);
        addView(this.f22940e, layoutParams);
        this.f22940e.setDividerVisible(false);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.list_main_title_menu, (ViewGroup) null).findViewById(R.id.lark_main_title_menu_container);
        this.f22943h = linearLayout;
        this.f22940e.setCustomRightView(linearLayout);
        this.f22940e.setClickable(true);
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: a */
    public void mo33175a() {
        this.f22952q = TitleType.HOMEPAGE.ordinal();
        mo33185e();
        m35194n();
        mo33196i();
        m35196p();
        this.f22945j.setVisibility(0);
        this.f22946k.setVisibility(0);
    }

    /* renamed from: f */
    public void mo33186f() {
        if (this.f22947l == null) {
            UDBadgeView a = new UDBadgeView.Builder().mo90261a(2131887082).mo90262a(getContext());
            this.f22947l = a;
            a.setId(R.id.list_create_red_point);
        }
        this.f22954s.removeView(this.f22947l);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        layoutParams.setMargins(C13749l.m55738a(0), C13749l.m55738a(3), C13749l.m55738a(3), C13749l.m55738a(0));
        this.f22954s.addView(this.f22947l, layoutParams);
    }

    /* renamed from: i */
    public void mo33196i() {
        if (this.f22954s == null) {
            this.f22954s = new FrameLayout(getContext());
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            this.f22946k = appCompatImageView;
            appCompatImageView.setId(R.id.list_main_menu_add);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(C13749l.m55738a(8), C13749l.m55738a(8), C13749l.m55738a(8), C13749l.m55738a(8));
            this.f22946k.setImageDrawable(getResources().getDrawable(R.drawable.ud_icon_addnew_outlined));
            C13747j.m55728a((ImageView) this.f22946k, (int) R.color.facade_selector_icon_n1);
            this.f22954s.addView(this.f22946k, layoutParams);
        }
        mo33177a(this.f22954s);
        this.f22943h.removeView(this.f22954s);
        this.f22943h.addView(this.f22954s, new LinearLayout.LayoutParams(-2, -2));
        AbstractC8496b bVar = this.f22955t;
        if (bVar == null || !bVar.mo33215a()) {
            mo33187g();
        } else {
            mo33186f();
        }
    }

    public void setShowBadgeDelegate(AbstractC8496b bVar) {
        this.f22955t = bVar;
    }

    /* renamed from: c */
    public void mo33182c(boolean z) {
        CustomTitleView customTitleView = this.f22942g;
        if (customTitleView != null) {
            customTitleView.setExternalVisible(z);
        }
    }

    /* renamed from: d */
    public void mo33184d(boolean z) {
        CustomTitleView customTitleView = this.f22942g;
        if (customTitleView != null) {
            customTitleView.setSecondTabVisible(z);
        }
    }

    public void setOnLeftViewClickListener(View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.f22941f;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    public void setOnSearchBtnClickListener(View.OnClickListener onClickListener) {
        AppCompatImageView appCompatImageView = this.f22950o;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public void setSearchViewClickListener(View.OnClickListener onClickListener) {
        this.f22945j.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    private int m35189a(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        setLayoutParams(layoutParams);
        return i;
    }

    public void setOnCreateViewClickListener(View.OnClickListener onClickListener) {
        this.f22956u = onClickListener;
        FrameLayout frameLayout = this.f22954s;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(onClickListener);
        }
    }

    public void setOnGridViewClickListener(AbstractC8495a aVar) {
        AppCompatImageView appCompatImageView = this.f22948m;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(aVar) {
                /* class com.bytedance.ee.bear.list.homepage.title.$$Lambda$HomeMainTitleBar$JW6YMfCOQ98zFxIeCIiIGV7YYCE */
                public final /* synthetic */ HomeMainTitleBar.AbstractC8495a f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    HomeMainTitleBar.this.m35191a((HomeMainTitleBar) this.f$1, (HomeMainTitleBar.AbstractC8495a) view);
                }
            });
        }
    }

    public void setOnMoreViewClickListener(View.OnClickListener onClickListener) {
        this.f22957v = onClickListener;
        AppCompatImageView appCompatImageView = this.f22949n;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public void setTitle(String str) {
        this.f22951p = str;
        CustomTitleView customTitleView = this.f22942g;
        if (customTitleView != null) {
            customTitleView.setTitle(str);
        }
    }

    public void setMoreViewEnable(boolean z) {
        View.OnClickListener onClickListener;
        AppCompatImageView appCompatImageView = this.f22949n;
        if (appCompatImageView != null) {
            appCompatImageView.setEnabled(z);
        }
        AppCompatImageView appCompatImageView2 = this.f22949n;
        if (appCompatImageView2 != null) {
            if (z) {
                onClickListener = this.f22957v;
            } else {
                onClickListener = null;
            }
            appCompatImageView2.setOnClickListener(onClickListener);
        }
    }

    public void setCreateViewEnable(boolean z) {
        View.OnClickListener onClickListener;
        int i;
        AppCompatImageView appCompatImageView = this.f22946k;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(R.drawable.ud_icon_addnew_outlined);
            AppCompatImageView appCompatImageView2 = this.f22946k;
            if (z) {
                i = R.color.icon_n1;
            } else {
                i = R.color.icon_disable;
            }
            C13747j.m55728a((ImageView) appCompatImageView2, i);
        }
        FrameLayout frameLayout = this.f22954s;
        if (frameLayout != null) {
            if (z) {
                onClickListener = this.f22956u;
            } else {
                onClickListener = null;
            }
            frameLayout.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: b */
    public void mo33180b(boolean z) {
        float f;
        if (z != this.f22939d) {
            Animator animator = this.f22938c;
            if (animator != null) {
                animator.cancel();
            }
            this.f22939d = z;
            if (z) {
                setVisibility(0);
            }
            boolean z2 = this.f22939d;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (z2) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            if (z2) {
                f2 = 1.0f;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", f, f2).setDuration(200L);
            this.f22938c = duration;
            duration.start();
            this.f22938c.addListener(new Animator.AnimatorListener() {
                /* class com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar.C84941 */

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationCancel(Animator animator) {
                    HomeMainTitleBar.this.f22938c = null;
                }

                public void onAnimationStart(Animator animator) {
                    if (HomeMainTitleBar.this.f22939d) {
                        HomeMainTitleBar.this.setVisibility(0);
                    }
                }

                public void onAnimationEnd(Animator animator) {
                    if (!HomeMainTitleBar.this.f22939d) {
                        HomeMainTitleBar.this.setVisibility(8);
                    }
                    HomeMainTitleBar.this.f22938c = null;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo33177a(View view) {
        this.f22943h.removeView(view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(C13749l.m55738a(8), C13749l.m55738a(8), C13749l.m55738a(8), C13749l.m55738a(8));
        this.f22943h.addView(view, layoutParams);
    }

    /* renamed from: a */
    public void mo33178a(boolean z) {
        int i;
        this.f22953r = z;
        if (this.f22948m == null) {
            this.f22948m = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f22948m;
        if (this.f22953r) {
            i = R.drawable.ud_icon_disorder_list_outlined;
        } else {
            i = R.drawable.ud_icon_borders_outlined;
        }
        appCompatImageView.setBackgroundResource(i);
        C13747j.m55726a((View) this.f22948m, (int) R.color.facade_selector_icon_n1);
    }

    public HomeMainTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m35190a(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35191a(AbstractC8495a aVar, View view) {
        int i;
        if (aVar != null) {
            boolean z = !this.f22953r;
            this.f22953r = z;
            AppCompatImageView appCompatImageView = this.f22948m;
            if (z) {
                i = R.drawable.ud_icon_disorder_list_outlined;
            } else {
                i = R.drawable.ud_icon_borders_outlined;
            }
            appCompatImageView.setBackgroundResource(i);
            aVar.mo33214a(this.f22953r);
        }
    }

    /* renamed from: a */
    private void m35190a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.largeHeight, R.attr.smallHeight});
        this.f22937b = (int) obtainStyledAttributes.getDimension(1, BitmapDescriptorFactory.HUE_RED);
        int dimension = (int) obtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED);
        this.f22936a = dimension;
        this.f22958w = new C8506d(this.f22937b, dimension);
        obtainStyledAttributes.recycle();
        mo33197j();
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: a */
    public void mo33176a(int i, int i2) {
        int a = this.f22958w.mo33245a(getLayoutParams().height, i2);
        boolean a2 = this.f22958w.mo33247a(this.f22958w.mo33244a(a));
        m35189a(a);
        mo33180b(a2);
    }

    public HomeMainTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m35190a(context, attributeSet);
    }
}
