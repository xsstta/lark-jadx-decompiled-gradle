package com.bytedance.ee.larkwebview.pool.p680a;

import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import com.bytedance.ee.larkwebview.service.AbstractC13467b;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.larkwebview.pool.a.a */
public class C13448a implements AbstractC13467b {
    @Override // com.bytedance.ee.larkwebview.service.AbstractC13467b
    /* renamed from: b */
    public boolean mo49896b(WebBackForwardList webBackForwardList) {
        return mo49895a(webBackForwardList, 1);
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13467b
    /* renamed from: a */
    public boolean mo49894a(WebBackForwardList webBackForwardList) {
        if (webBackForwardList == null) {
            Log.m165389i("AboutBlankPageInterceptor", "webBackForwardList is null");
            return false;
        }
        Log.m165389i("AboutBlankPageInterceptor", "webBackForwardList size=" + webBackForwardList.getSize() + " index=" + webBackForwardList.getCurrentIndex());
        return mo49895a(webBackForwardList, -1);
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13467b
    /* renamed from: a */
    public boolean mo49895a(WebBackForwardList webBackForwardList, int i) {
        if (i >= 0) {
            if (webBackForwardList == null) {
                Log.m165389i("AboutBlankPageInterceptor", "canGoBackOrForward webBackForwardList = null, so return ");
                return false;
            }
            int size = webBackForwardList.getSize();
            int currentIndex = webBackForwardList.getCurrentIndex();
            Log.m165389i("AboutBlankPageInterceptor", "canGoBackOrForward size = " + size + " , current = " + currentIndex + " , step = " + i);
            if (currentIndex + i < size) {
                return true;
            }
            return false;
        } else if (webBackForwardList.getSize() <= 0 || webBackForwardList.getCurrentIndex() == 0) {
            return false;
        } else {
            if (webBackForwardList.getCurrentIndex() + i > 0 || !TextUtils.equals(webBackForwardList.getItemAtIndex(0).getUrl(), "about:blank")) {
                return true;
            }
            return false;
        }
    }
}
