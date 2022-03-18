package com.bytedance.ee.bear.document;

import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4929h;
import com.bytedance.ee.bear.document.rendergone.AbstractC6088b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p704g.C13665a;
import java.io.Serializable;

/* renamed from: com.bytedance.ee.bear.document.ae */
public class C5630ae extends C4929h implements AbstractC6277u {

    /* renamed from: a */
    protected String f15947a = ("SimpleDocumentWebV2#" + Integer.toHexString(hashCode()));

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public DocBridgeWebViewV2 mo22569e() {
        return (DocBridgeWebViewV2) super.mo19435b();
    }

    /* renamed from: d */
    private boolean mo22535d() {
        if (!(mo19435b() instanceof DocBridgeWebViewV2) || !((DocBridgeWebViewV2) mo19435b()).f15873i || ((DocBridgeWebViewV2) mo19435b()).mo22364k()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6277u
    /* renamed from: a */
    public void mo22565a(AbstractC6088b bVar) {
        mo22569e().mo22328a(bVar);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6277u
    /* renamed from: b */
    public void mo22567b(AbstractC6088b bVar) {
        mo22569e().mo22340b(bVar);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6277u
    /* renamed from: d */
    public void mo22568d(String str) {
        mo22569e().mo22345d(str);
    }

    public C5630ae(DocBridgeWebViewV2 docBridgeWebViewV2) {
        super(docBridgeWebViewV2, docBridgeWebViewV2.getBridge());
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6277u
    /* renamed from: a */
    public void mo22566a(String str, Serializable serializable) {
        mo22569e().mo22333a(str, serializable);
    }

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19429a(String str, JSONObject jSONObject, ValueCallback<String> valueCallback) {
        if (mo22535d()) {
            super.mo19429a(str, jSONObject, valueCallback);
            return;
        }
        String str2 = this.f15947a;
        C13479a.m54775e(str2, " execJS DocBridgeWebView is not ready  js : " + C13665a.m55441a(str, jSONObject));
    }

    @Override // com.bytedance.ee.bear.browser.C4929h, com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19434a(String str, NonProguard nonProguard, ValueCallback<String> valueCallback) {
        if (mo22535d()) {
            super.mo19434a(str, nonProguard, valueCallback);
            return;
        }
        String str2 = this.f15947a;
        C13479a.m54775e(str2, " execJS DocBridgeWebView is not ready  js : " + C13665a.m55441a(str, nonProguard));
    }
}
