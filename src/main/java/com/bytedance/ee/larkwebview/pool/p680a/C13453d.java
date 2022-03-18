package com.bytedance.ee.larkwebview.pool.p680a;

import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.ss.android.lark.log.Log;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.ee.larkwebview.pool.a.d */
class C13453d extends ConcurrentLinkedQueue<LarkWebView> {
    private String mBizTag;
    private int mMaxPoolSize;

    public void release() {
        while (true) {
            LarkWebView larkWebView = (LarkWebView) poll();
            if (larkWebView != null) {
                larkWebView.destroy();
            } else {
                return;
            }
        }
    }

    public boolean add(LarkWebView larkWebView) {
        if (this.mMaxPoolSize <= 0 || size() < this.mMaxPoolSize) {
            return super.add((Object) larkWebView);
        }
        Log.m165389i("WebViewPoolQueue", "biz : " + this.mBizTag + " , reach the max pool size of " + this.mMaxPoolSize);
        larkWebView.destroy();
        return false;
    }

    C13453d(String str, int i) {
        this.mBizTag = str;
        this.mMaxPoolSize = i;
        if (i <= 0) {
            this.mMaxPoolSize = 3;
            Log.m165397w("WebViewPoolQueue", "losing max pool size config, will use default size 3.");
        }
    }
}
