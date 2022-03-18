package com.bytedance.ee.bear.lark;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.PlaceholderHeader;
import com.bytedance.ee.bear.list.homepage.FlingBehavior;
import com.bytedance.ee.bear.list.homepage.tab.HomeViewPager;
import com.bytedance.ee.bear.widgets.button.CommonCreateButton;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.bytedance.ee.bear.lark.c */
public class C8012c {

    /* renamed from: a */
    private ViewGroup f21483a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.lark.c$a */
    public static class C8014a {

        /* renamed from: a */
        public static final C8012c f21484a = new C8012c();
    }

    /* renamed from: b */
    public void mo31025b() {
        this.f21483a = null;
    }

    private C8012c() {
    }

    /* renamed from: a */
    public static C8012c m31983a() {
        return C8014a.f21484a;
    }

    /* renamed from: d */
    private HomeViewPager m31986d(Context context) {
        HomeViewPager homeViewPager = new HomeViewPager(context);
        homeViewPager.setId(R.id.list_home_viewpager);
        return homeViewPager;
    }

    /* renamed from: g */
    private LinearLayout m31989g(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.list_header_container);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    /* renamed from: f */
    private CollapsingToolbarLayout m31988f(Context context) {
        CollapsingToolbarLayout collapsingToolbarLayout = new CollapsingToolbarLayout(context);
        collapsingToolbarLayout.setId(R.id.list_collapsing_layout);
        collapsingToolbarLayout.addView(m31989g(context), new CollapsingToolbarLayout.LayoutParams(-1, -2));
        return collapsingToolbarLayout;
    }

    /* renamed from: c */
    private CoordinatorLayout m31985c(Context context) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context);
        coordinatorLayout.setId(R.id.list_home_coordinator_layout);
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
        layoutParams.setBehavior(new FlingBehavior(context, null));
        coordinatorLayout.addView(m31987e(context), layoutParams);
        CoordinatorLayout.LayoutParams layoutParams2 = new CoordinatorLayout.LayoutParams(-1, -1);
        layoutParams2.setBehavior(new AppBarLayout.ScrollingViewBehavior());
        coordinatorLayout.addView(m31986d(context), layoutParams2);
        return coordinatorLayout;
    }

    /* renamed from: e */
    private AppBarLayout m31987e(Context context) {
        AppBarLayout appBarLayout = new AppBarLayout(context);
        appBarLayout.setId(R.id.list_sub_menu_layout);
        appBarLayout.setBackground(null);
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.mo76392a(15);
        CollapsingToolbarLayout f = m31988f(context);
        f.setMinimumHeight(context.getResources().getDimensionPixelSize(R.dimen.list_home_sub_menu_height));
        appBarLayout.addView(f, layoutParams);
        return appBarLayout;
    }

    /* renamed from: a */
    private ViewGroup m31982a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.list_home_drive_root);
        frameLayout.setBackground(context.getResources().getDrawable(R.color.bg_body, null));
        frameLayout.addView(m31984b(context), new FrameLayout.LayoutParams(-1, -1));
        CommonCreateButton commonCreateButton = new CommonCreateButton(context);
        commonCreateButton.setId(R.id.common_create_button);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        frameLayout.addView(commonCreateButton, layoutParams);
        return frameLayout;
    }

    /* renamed from: b */
    private SmartRefreshLayout m31984b(Context context) {
        SmartRefreshLayout smartRefreshLayout = new SmartRefreshLayout(context);
        smartRefreshLayout.setId(R.id.list_refresh_layout);
        smartRefreshLayout.setBackground(null);
        smartRefreshLayout.mo96415m(false);
        smartRefreshLayout.mo96380d(false);
        smartRefreshLayout.mo96388f(false);
        smartRefreshLayout.mo96413l(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C13749l.m55738a(60));
        marginLayoutParams.topMargin = C57582a.m223600a(35);
        PlaceholderHeader placeholderHeader = new PlaceholderHeader(context);
        placeholderHeader.setId(R.id.list_refresh_header);
        placeholderHeader.setVisibility(4);
        placeholderHeader.setLayoutParams(marginLayoutParams);
        smartRefreshLayout.mo96346a((AbstractC27126e) placeholderHeader, -1, C57582a.m223600a(60));
        smartRefreshLayout.mo96352a(m31985c(context));
        return smartRefreshLayout;
    }

    /* renamed from: a */
    public ViewGroup mo31024a(Context context, boolean z) {
        if (this.f21483a == null) {
            this.f21483a = m31982a(context);
        }
        ViewGroup viewGroup = this.f21483a;
        if (z) {
            this.f21483a = null;
        }
        return viewGroup;
    }
}
