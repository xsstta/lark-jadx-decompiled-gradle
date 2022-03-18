package com.ss.android.lark.integrator.p2000c;

import android.text.TextUtils;
import com.bytedance.platform.godzilla.plugin.AbstractC20331c;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.c.d */
public class C39136d extends AbstractC20331c {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "MultiProcessWebViewCatcher";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) {
        if (th == null || TextUtils.isEmpty(th.getMessage()) || !th.getMessage().contains("Using WebView from more than one process at once with the same data directory is not supported")) {
            return false;
        }
        Log.m165385e("MultiProcessWebViewCatcher", "catch multi process webview instance crash , current process is " + C26252ad.m94994c(LarkContext.getApplication()), th, true);
        return true;
    }
}
