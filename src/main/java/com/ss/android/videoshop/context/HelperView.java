package com.ss.android.videoshop.context;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.videoshop.p3199e.C64159a;

/* access modifiers changed from: package-private */
public class HelperView extends View {

    /* renamed from: a */
    private VideoContext f161929a;

    public HelperView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo221978a(VideoContext videoContext) {
        this.f161929a = videoContext;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        VideoContext videoContext = this.f161929a;
        if (videoContext != null) {
            videoContext.mo222012a(configuration);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        VideoContext videoContext = this.f161929a;
        if (videoContext != null) {
            videoContext.mo222058k(z);
        }
    }

    public void setKeepScreenOn(boolean z) {
        super.setKeepScreenOn(z);
        C64159a.m252083b("HelperView", "keep_screen_on:" + Boolean.valueOf(z).toString() + " hash:" + hashCode());
    }

    public HelperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HelperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
