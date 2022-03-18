package com.bytedance.ee.bear.browser;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.bear.browser.view.DecorateWebViewV2;
import com.bytedance.ee.log.C13479a;

public class WebViewV2 extends DecorateWebViewV2 {

    /* renamed from: b */
    private int f14465b;

    /* renamed from: b */
    private void mo22336b() {
    }

    public int getLastVerticalScrollRange() {
        return this.f14465b;
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeVerticalScrollRange() {
        int computeVerticalScrollRange = super.computeVerticalScrollRange();
        this.f14465b = computeVerticalScrollRange;
        return computeVerticalScrollRange;
    }

    public WebViewV2(Context context) {
        super(context);
        mo22336b();
    }

    public void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (Throwable th) {
            C13479a.m54761a("WebViewV2", th);
        }
    }

    public WebViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo22336b();
    }
}
