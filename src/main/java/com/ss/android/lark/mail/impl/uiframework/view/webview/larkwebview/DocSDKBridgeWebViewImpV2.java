package com.ss.android.lark.mail.impl.uiframework.view.webview.larkwebview;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.bear.middleground.docsdk.DocSDKBridgeWebViewV2;
import com.bytedance.ee.larkwebview.monitor.webview.BizType;

public class DocSDKBridgeWebViewImpV2 extends DocSDKBridgeWebViewV2 {
    /* renamed from: a */
    private void mo19616a() {
        setBizType(BizType.f35444h.mo49863d());
        getSettings().setTextZoom(100);
    }

    public DocSDKBridgeWebViewImpV2(Context context) {
        super(context);
        mo19616a();
    }

    public DocSDKBridgeWebViewImpV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo19616a();
    }
}
