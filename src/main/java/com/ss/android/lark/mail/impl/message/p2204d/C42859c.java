package com.ss.android.lark.mail.impl.message.p2204d;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.webkit.WebView;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.message.view.p2212c.C43194a;

/* renamed from: com.ss.android.lark.mail.impl.message.d.c */
public class C42859c {

    /* renamed from: a */
    private C43194a f109146a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.message.d.c$a */
    public static class C42861a {

        /* renamed from: a */
        public static C42859c f109148a = new C42859c();
    }

    private C42859c() {
    }

    /* renamed from: a */
    public static C42859c m170753a() {
        return C42861a.f109148a;
    }

    /* renamed from: b */
    public void mo153838b() {
        Log.m165389i("CacheWebView", "testAsynRender CacheWebView clear mMailMessageWebView = null");
        this.f109146a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C43194a mo153837b(Context context) {
        if (this.f109146a == null) {
            mo153836a(context);
        }
        return this.f109146a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo153836a(Context context) {
        if (this.f109146a == null) {
            this.f109146a = new C43194a(new MutableContextWrapper(C41816b.m166115a().mo150132b()));
            if (C26284k.m95186b(C41816b.m166115a().mo150132b())) {
                this.f109146a.getWebView().setContentDescription("MailMessageWebView");
            }
            this.f109146a.mo35519a(new IWebViewExtension.RenderProcessGoneListener() {
                /* class com.ss.android.lark.mail.impl.message.p2204d.C42859c.C428601 */

                @Override // com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenersdk112
                public boolean onRenderProcessGone(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
                    Log.m165389i("CacheWebView", "testAsynRender onRenderProcessGone CacheWebView");
                    C42859c.this.mo153838b();
                    return true;
                }
            });
        }
    }
}
