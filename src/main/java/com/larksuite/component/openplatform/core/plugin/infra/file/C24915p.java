package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.infra.file.read.C24917a;
import com.larksuite.component.openplatform.core.plugin.infra.file.write.C24920a;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3324r.AbstractC66694a;
import com.tt.miniapp.p3324r.p3325a.C66701c;
import com.tt.miniapp.p3324r.p3325a.C66709e;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.p */
public class C24915p extends AbstractC66694a {

    /* renamed from: b */
    private String f61059b;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return this.f61059b;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        IApiOutputParam iApiOutputParam;
        IJsBridge jsBridge;
        if (TextUtils.equals("readFile", this.f61059b)) {
            C24917a aVar = new C24917a(this.f61059b);
            aVar.mo87971a(getAppContext());
            iApiOutputParam = (IApiOutputParam) aVar.mo87974b((C66701c.C66702a) this.f168359a);
        } else if (TextUtils.equals("writeFile", this.f61059b)) {
            C24920a aVar2 = new C24920a(this.f61059b);
            aVar2.mo87971a(getAppContext());
            iApiOutputParam = (IApiOutputParam) aVar2.mo87974b((C66709e.C66710a) this.f168359a);
        } else {
            AppBrandLogger.m52829e("ApiHandler", "api no implement", this.f61059b);
            iApiOutputParam = null;
        }
        if (iApiOutputParam != null && (jsBridge = AppbrandApplicationImpl.getInst(getAppContext()).getJsBridge()) != null) {
            jsBridge.invokeApi(getActionName(), iApiOutputParam, this.mCallBackId);
        }
    }

    public C24915p(String str, IApiInputParam iApiInputParam, int i, AbstractC67619e eVar) {
        super(iApiInputParam, i, eVar);
        this.f61059b = str;
    }
}
