package com.bytedance.ee.android.file.picker.lib.local;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.log.Log;

public class LocalFilePickerLayoutManager extends LinearLayoutManager {
    public LocalFilePickerLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException unused) {
            Log.m165383e("LocalFilePickerLayoutManager", "onLayoutChildren failed: throw IndexOutOfBoundsException");
        }
    }

    public LocalFilePickerLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
