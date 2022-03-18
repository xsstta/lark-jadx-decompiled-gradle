package com.bytedance.ee.bear.bizwidget.banner.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bizwidget.banner.banner.Banner;
import com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2;
import java.lang.reflect.Field;

public class ScrollSpeedManger extends LinearLayoutManager {

    /* renamed from: a */
    public Banner f14354a;

    /* renamed from: a */
    public static void m20108a(Banner banner) {
        if (banner.getScrollTime() >= 100) {
            try {
                ViewPager2 viewPager2 = banner.getViewPager2();
                RecyclerView recyclerView = (RecyclerView) viewPager2.getChildAt(0);
                recyclerView.setOverScrollMode(2);
                ScrollSpeedManger scrollSpeedManger = new ScrollSpeedManger(banner, (LinearLayoutManager) recyclerView.getLayoutManager());
                recyclerView.setLayoutManager(scrollSpeedManger);
                Field declaredField = ViewPager2.class.getDeclaredField("mLayoutManager");
                declaredField.setAccessible(true);
                declaredField.set(viewPager2, scrollSpeedManger);
                Field declaredField2 = ViewPager2.class.getDeclaredField("mPageTransformerAdapter");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(viewPager2);
                if (obj != null) {
                    Field declaredField3 = obj.getClass().getDeclaredField("mLayoutManager");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj, scrollSpeedManger);
                }
                Field declaredField4 = ViewPager2.class.getDeclaredField("mScrollEventAdapter");
                declaredField4.setAccessible(true);
                Object obj2 = declaredField4.get(viewPager2);
                if (obj2 != null) {
                    Field declaredField5 = obj2.getClass().getDeclaredField("mLayoutManager");
                    declaredField5.setAccessible(true);
                    declaredField5.set(obj2, scrollSpeedManger);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ScrollSpeedManger(Banner banner, LinearLayoutManager linearLayoutManager) {
        super(banner.getContext(), linearLayoutManager.getOrientation(), false);
        this.f14354a = banner;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C48751 r2 = new LinearSmoothScroller(recyclerView.getContext()) {
            /* class com.bytedance.ee.bear.bizwidget.banner.util.ScrollSpeedManger.C48751 */

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateTimeForDeceleration(int i) {
                return ScrollSpeedManger.this.f14354a.getScrollTime();
            }
        };
        r2.setTargetPosition(i);
        startSmoothScroll(r2);
    }
}
