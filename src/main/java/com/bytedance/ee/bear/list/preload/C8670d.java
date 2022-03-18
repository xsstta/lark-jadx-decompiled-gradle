package com.bytedance.ee.bear.list.preload;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.preload.d */
public class C8670d {

    /* renamed from: a */
    private ViewGroup f23468a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.preload.d$a */
    public static class C8671a {

        /* renamed from: a */
        static C8670d f23469a = new C8670d();
    }

    /* renamed from: b */
    public void mo33676b() {
        this.f23468a = null;
    }

    /* renamed from: a */
    public static C8670d m36229a() {
        return C8671a.f23469a;
    }

    /* renamed from: a */
    public ViewGroup mo33675a(Activity activity, boolean z) {
        ViewGroup viewGroup = this.f23468a;
        if (viewGroup == null || viewGroup.getContext() != activity) {
            RecentListContainer recentListContainer = new RecentListContainer(activity);
            recentListContainer.setId(R.id.list_layout_root);
            recentListContainer.setBackgroundColor(activity.getResources().getColor(R.color.bg_body));
            recentListContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            BaseRecyclerView baseRecyclerView = new BaseRecyclerView(activity);
            baseRecyclerView.setId(R.id.list_recycler_view);
            baseRecyclerView.setOverScrollMode(2);
            recentListContainer.addView(baseRecyclerView, new FrameLayout.LayoutParams(-1, -1));
            LoadStateView loadStateView = new LoadStateView(activity);
            loadStateView.setId(R.id.list_state_view_root);
            recentListContainer.addView(loadStateView, new FrameLayout.LayoutParams(-1, -1));
            recentListContainer.mo33668a();
            this.f23468a = recentListContainer;
        }
        ViewGroup viewGroup2 = this.f23468a;
        if (z) {
            this.f23468a = null;
        }
        return viewGroup2;
    }
}
