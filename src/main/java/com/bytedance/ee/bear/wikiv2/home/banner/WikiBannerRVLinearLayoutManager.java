package com.bytedance.ee.bear.wikiv2.home.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

public class WikiBannerRVLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private boolean f32953a = true;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollHorizontally() {
        if (this.f32953a) {
            return super.canScrollHorizontally();
        }
        return false;
    }

    /* renamed from: a */
    public void mo46830a(boolean z) {
        this.f32953a = z;
    }

    public WikiBannerRVLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public WikiBannerRVLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
