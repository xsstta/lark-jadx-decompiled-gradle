package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class SSSurfaceView extends SurfaceView {
    public SSSurfaceView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (i == 0) {
            super.onWindowVisibilityChanged(i);
        }
    }

    public SSSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SSSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
