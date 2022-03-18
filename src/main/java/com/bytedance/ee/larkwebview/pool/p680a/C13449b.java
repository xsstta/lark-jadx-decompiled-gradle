package com.bytedance.ee.larkwebview.pool.p680a;

import android.content.Context;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.monitor.webview.BizType;
import com.bytedance.ee.larkwebview.pool.AbstractC13447a;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.larkwebview.pool.a.b */
public class C13449b implements AbstractC13447a {
    @Override // com.bytedance.ee.larkwebview.pool.AbstractC13447a
    /* renamed from: a */
    public int mo49887a() {
        return 1;
    }

    @Override // com.bytedance.ee.larkwebview.pool.AbstractC13447a
    /* renamed from: b */
    public int mo49889b() {
        return 3;
    }

    @Override // com.bytedance.ee.larkwebview.pool.AbstractC13447a
    /* renamed from: c */
    public boolean mo49890c() {
        return false;
    }

    @Override // com.bytedance.ee.larkwebview.pool.AbstractC13447a
    /* renamed from: a */
    public LarkWebView mo49888a(Context context) {
        Log.m165389i("DefaultPoolStrategy", "newInstance");
        LarkWebView larkWebView = new LarkWebView(context, BizType.f35444h.mo49861b());
        larkWebView.getServiceManager().mo49930a(C13448a.class);
        return larkWebView;
    }
}
