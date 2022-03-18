package com.ss.android.lark.widget.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class RecyclerViewScrollDetector extends RecyclerView.OnScrollListener {
    private int mScrollThreshold = 8;
    private int mScrolledDy;
    private List<Integer> scrolledIndexList = new ArrayList();

    public abstract void onScrollPassed(int i, int i2);

    public abstract void onScrollStop(int i, int i2);

    public abstract void onScrollToBottom();

    public void setScrollThreshold(int i) {
        this.mScrollThreshold = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (this.scrolledIndexList.size() > 0) {
                Collections.sort(this.scrolledIndexList);
                int intValue = this.scrolledIndexList.get(0).intValue();
                List<Integer> list = this.scrolledIndexList;
                int intValue2 = list.get(list.size() - 1).intValue();
                Log.m165389i("scroll test", "startPosition:" + intValue + "; endPosition: " + intValue2);
                onScrollStop(intValue, intValue2);
            }
            this.scrolledIndexList.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r3, int r4, int r5) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
