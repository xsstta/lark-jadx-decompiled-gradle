package com.bytedance.ee.bear.doc.history;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class HistoryPlugin extends DocumentPlugin implements AbstractC7666d {
    public AbstractC7947h mJsCallback;
    private AbstractC5443a mOnShowHistory;

    /* renamed from: com.bytedance.ee.bear.doc.history.HistoryPlugin$a */
    public interface AbstractC5443a {
        /* renamed from: a */
        void mo21790a();
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        getDocViewModel().isShowingHistory().mo5929b((Boolean) false);
        return false;
    }

    private void touchWebViewIfNeeded() {
        if (getWeb().mo19435b().getScrollY() == 0) {
            MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            MotionEvent obtain2 = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            getWeb().mo19435b().dispatchTouchEvent(obtain);
            getWeb().mo19435b().dispatchTouchEvent(obtain2);
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public void showHistory() {
        String str;
        boolean z;
        DocViewModel docViewModel = getDocViewModel();
        CharSequence b = docViewModel.getTitle().mo5927b();
        if (b != null) {
            str = b.toString();
        } else {
            str = "";
        }
        touchWebViewIfNeeded();
        StringBuilder sb = new StringBuilder();
        sb.append("showHistory()... jsCallback null is ");
        if (this.mJsCallback == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54772d("HistoryPlugin", sb.toString());
        if (this.mJsCallback != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("title", (Object) str);
            this.mJsCallback.mo17188a(jSONObject);
            AbstractC5443a aVar = this.mOnShowHistory;
            if (aVar != null) {
                aVar.mo21790a();
            }
            docViewModel.isShowingHistory().mo5929b((Boolean) true);
        }
    }

    public void setOnShowHistoryListener(AbstractC5443a aVar) {
        this.mOnShowHistory = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.doc.history.HistoryPlugin$b */
    public class C5444b implements AbstractC7945d<String> {
        private C5444b() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            HistoryPlugin.this.mJsCallback = hVar;
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        bindBridgeHandlerAutoUnbind("biz.history.show", new C5444b());
    }
}
