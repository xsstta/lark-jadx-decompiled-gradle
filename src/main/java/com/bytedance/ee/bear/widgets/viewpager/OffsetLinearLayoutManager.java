package com.bytedance.ee.bear.widgets.viewpager;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

public class OffsetLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private Map<Integer, Integer> f32103a;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        int i;
        if (getChildCount() == 0) {
            return 0;
        }
        try {
            int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
            int i2 = -((int) findViewByPosition(findFirstVisibleItemPosition).getY());
            for (int i3 = 0; i3 < findFirstVisibleItemPosition; i3++) {
                if (this.f32103a.get(Integer.valueOf(i3)) == null) {
                    i = 0;
                } else {
                    i = this.f32103a.get(Integer.valueOf(i3)).intValue();
                }
                i2 += i;
            }
            return i2;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f32103a.put(Integer.valueOf(i), Integer.valueOf(getChildAt(i).getHeight()));
        }
    }
}
