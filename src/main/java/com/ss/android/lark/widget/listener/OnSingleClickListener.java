package com.ss.android.lark.widget.listener;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.lark.log.Log;

public abstract class OnSingleClickListener implements View.OnClickListener {
    private long mLastClickTime;
    private long mMinClickInterval;

    public abstract void onSingleClick(View view);

    public OnSingleClickListener() {
        this.mMinClickInterval = 500;
        this.mMinClickInterval = 500;
    }

    public OnSingleClickListener(long j) {
        this.mMinClickInterval = 500;
        this.mMinClickInterval = j;
    }

    public void onClick(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.mLastClickTime = uptimeMillis;
        if (uptimeMillis - this.mLastClickTime < this.mMinClickInterval) {
            Log.m165389i("OnSingleClickListener", "elapsedTime is short than LENGTH_SHORT");
        } else {
            onSingleClick(view);
        }
    }
}
