package com.ss.android.appcenter.business.tab.business.view;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.common.util.C28184h;

public class SafeLinearLayoutManager extends LinearLayoutManager {
    public SafeLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            C28184h.m103248b("SafeLinearLayoutManager", "IndexOutOfBoundsException caught：" + e);
        }
    }
}
