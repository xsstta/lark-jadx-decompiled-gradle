package com.bytedance.ee.bear.widgets.viewpager.viewpager2.adapter;

import android.os.Parcelable;

public interface StatefulAdapter {
    void restoreState(Parcelable parcelable);

    Parcelable saveState();
}
