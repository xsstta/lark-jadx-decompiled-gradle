package com.ss.android.lark.mail.impl.uiframework.view.webview.p2222a;

import android.content.Context;
import com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f;
import com.bytedance.ee.bear.middleground.docsdk.C9306a;
import com.bytedance.ee.larkwebview.base.AbstractC13402a;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.service.C13477l;

/* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.a.a */
public abstract class AbstractC43714a extends AbstractC9313f {
    @Override // com.bytedance.ee.bear.middleground.docsdk.AbstractC9313f
    /* renamed from: a */
    public C9306a mo35539a() {
        return C9306a.f25027a;
    }

    public AbstractC43714a(final LarkWebView larkWebView) {
        super(new AbstractC13402a() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.p2222a.AbstractC43714a.C437151 */

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public LarkWebView getWebView() {
                return LarkWebView.this;
            }

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public C13477l getServiceManager() {
                return new C13477l();
            }

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public Context getWebViewContext() {
                return LarkWebView.this.getWebViewContext();
            }
        });
    }
}
