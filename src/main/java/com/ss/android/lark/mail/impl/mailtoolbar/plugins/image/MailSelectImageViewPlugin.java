package com.ss.android.lark.mail.impl.mailtoolbar.plugins.image;

import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.BaseWebPlugin;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42799b;

public class MailSelectImageViewPlugin extends BaseWebPlugin<C4933k> {
    public C42794a mSelectImageJSHandler;
    private C42799b mSelectImageViewModel;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.MailSelectImageViewPlugin$a */
    public class C42794a implements AbstractC7948j<String> {

        /* renamed from: b */
        private AbstractC7947h f108963b;

        private C42794a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo153646a(String str) {
            AbstractC7947h hVar = this.f108963b;
            if (hVar != null) {
                hVar.mo17190a(str);
            }
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            this.f108963b = hVar;
        }
    }

    public void onAttachToHost(C4933k kVar) {
        super.onAttachToHost((C4943e) kVar);
        this.mSelectImageViewModel = (C42799b) aj.m5366a(getActivity()).mo6005a(C42799b.class);
    }

    @Override // com.bytedance.ee.bear.browser.BaseWebPlugin
    public void onDetachFromUIContainer(C4933k kVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(kVar, nVar);
        this.mSelectImageViewModel.releaseMediaPicker();
    }

    public void onAttachToUIContainer(C4933k kVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) kVar, nVar);
        C42794a aVar = new C42794a();
        this.mSelectImageJSHandler = aVar;
        bindJSHandlerAutoUnbind("biz.util.selectImage", aVar);
        this.mSelectImageViewModel.setDelegate(new C42799b.AbstractC42800a() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.MailSelectImageViewPlugin.C427931 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42799b.AbstractC42800a
            /* renamed from: a */
            public void mo153644a() {
                MailSelectImageViewPlugin.this.execJS("javascript:window.lark.biz.util.cancelFromImageSelector()", new JSONObject());
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42799b.AbstractC42800a
            /* renamed from: a */
            public void mo153645a(String str) {
                MailSelectImageViewPlugin.this.mSelectImageJSHandler.mo153646a(str);
            }
        });
    }
}
