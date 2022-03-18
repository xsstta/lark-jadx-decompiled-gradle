package com.ss.android.vc.meeting.module.tab3.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.LoadingLottieView;

public class LoadMoreView extends FrameLayout {
    public LoadingLottieView getLoadingLottieView() {
        return (LoadingLottieView) findViewById(R.id.lottie_loading);
    }

    public LoadMoreView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m248502a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.vc_view_tab_load_more, this);
    }

    public void setOnRetryListener(View.OnClickListener onClickListener) {
        findViewById(R.id.tv_retry).setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public void mo219440a(boolean z) {
        int i;
        View findViewById = findViewById(R.id.tv_retry);
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        View findViewById2 = findViewById(R.id.container_loading);
        if (z) {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
    }

    public LoadMoreView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadMoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m248502a(context);
    }
}
