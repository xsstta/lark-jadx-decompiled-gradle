package com.bytedance.ee.bear.facade.common.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

public class DocsLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private boolean f20956a = true;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollVertically() {
        if (!this.f20956a || !super.canScrollVertically()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo30335a(boolean z) {
        this.f20956a = z;
    }

    public DocsLinearLayoutManager(Context context) {
        super(context);
    }

    public DocsLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public DocsLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
