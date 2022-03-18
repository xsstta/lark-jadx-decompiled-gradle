package com.larksuite.component.dybrid.h5core.core.impl;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24164g;
import com.larksuite.component.dybrid.h5api.api.AbstractC24166i;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24172n;
import com.larksuite.component.dybrid.h5api.api.C24160c;
import com.larksuite.component.dybrid.h5api.api.C24162e;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.component.dybrid.h5api.p1070a.AbstractC24153a;
import com.larksuite.component.dybrid.h5api.p1070a.AbstractC24154b;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.core.p1075a.AbstractC24200a;
import com.larksuite.component.dybrid.h5core.p1072a.C24183a;
import com.ss.android.lark.openapi.jsapi.AbstractC48759a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@ClaymoreImpl(singleton = true, value = AbstractC24152a.class)
public class H5ServiceImpl implements AbstractC24152a {
    private AbstractC24200a lkh5Service = C24210e.m88437g();

    @Override // com.larksuite.component.dybrid.h5api.AbstractC24152a
    public boolean exitService() {
        return this.lkh5Service.mo86826e();
    }

    public AbstractC24164g getData() {
        return this.lkh5Service.mo86744c();
    }

    public AbstractC24172n getTopSession() {
        return this.lkh5Service.mo86827f();
    }

    @Override // com.larksuite.component.dybrid.h5api.AbstractC24152a
    public void addPluginConfig(H5PluginConfig h5PluginConfig) {
        this.lkh5Service.mo86823a(h5PluginConfig);
    }

    @Override // com.larksuite.component.dybrid.h5api.AbstractC24152a
    public Map<String, AbstractC48759a<String>> h5PluginConfigToJSHandlers(AbstractC24168k kVar) {
        return this.lkh5Service.mo86819a(kVar);
    }

    public void setMetricLogListener(AbstractC24154b bVar) {
        if (bVar != null) {
            this.lkh5Service.mo86822a(bVar);
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.AbstractC24152a
    public void setOpenBrowserListener(AbstractC24153a aVar) {
        if (aVar != null) {
            this.lkh5Service.mo86821a(aVar);
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.AbstractC24152a
    public void init(Context context, AbstractC24166i iVar) {
        this.lkh5Service.mo86820a(context, iVar);
    }

    public Fragment createH5Fragment(C24162e eVar, C24160c cVar) {
        if (cVar.mo86729a() == null) {
            return null;
        }
        return this.lkh5Service.mo86825b(eVar, cVar);
    }

    @Override // com.larksuite.component.dybrid.h5api.AbstractC24152a
    public void startH5Page(C24162e eVar, C24160c cVar) {
        if (cVar.mo86729a() != null) {
            this.lkh5Service.mo86824a(eVar, cVar);
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.AbstractC24152a
    public WebResourceResponse getOfflineResByPath(String str, String str2) {
        C24174b.m88296a("H5ServiceImpl", "getOfflineResByPath offlineResRootPath:" + str + " path:" + str2);
        return this.lkh5Service.mo86817a(str, str2);
    }

    @Override // com.larksuite.component.dybrid.h5api.AbstractC24152a
    public AbstractC24168k createH5Page(C24162e eVar, C24160c cVar, WebView webView) {
        if (cVar.mo86729a() == null) {
            return null;
        }
        return this.lkh5Service.mo86818a(eVar, cVar, webView);
    }

    public void sendToWeb(WebView webView, String str, String str2) {
        try {
            new C24183a(webView).mo86780b(new H5Event.C24156a().mo86719b(str).mo86717a(new JSONObject(str2)).mo86718a());
        } catch (JSONException e) {
            C24174b.m88297a("H5ServiceImpl", "sentToWeb", e);
        }
    }
}
