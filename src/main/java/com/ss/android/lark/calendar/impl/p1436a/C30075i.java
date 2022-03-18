package com.ss.android.lark.calendar.impl.p1436a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.calendar.impl.a.i */
public final class C30075i {

    /* renamed from: a */
    public final ViewPager f74982a;

    /* renamed from: b */
    public final UDTabLayout f74983b;

    /* renamed from: c */
    private final LinearLayout f74984c;

    /* renamed from: a */
    public static C30075i m111289a(View view) {
        int i = R.id.buildingViewPager;
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.buildingViewPager);
        if (viewPager != null) {
            i = R.id.tabLayout;
            UDTabLayout uDTabLayout = (UDTabLayout) view.findViewById(R.id.tabLayout);
            if (uDTabLayout != null) {
                return new C30075i((LinearLayout) view, viewPager, uDTabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    private C30075i(LinearLayout linearLayout, ViewPager viewPager, UDTabLayout uDTabLayout) {
        this.f74984c = linearLayout;
        this.f74982a = viewPager;
        this.f74983b = uDTabLayout;
    }

    /* renamed from: a */
    public static C30075i m111288a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_building_page_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111289a(inflate);
    }
}
