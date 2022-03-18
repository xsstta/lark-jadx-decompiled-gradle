package com.larksuite.component.openplatform.core.plugin.inner;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.p654h.C13073a;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.a */
public class C24996a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "consoleLogOutput";
    }

    public C24996a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (TextUtils.isEmpty(this.mArgs)) {
            AppBrandLogger.m52829e("ApiHandler", "params is empty");
            callbackDefaultMsg(false);
            return;
        }
        callbackDefaultMsg(C13073a.m53600a(this.mArgs, getAppContext()));
    }

    public C24996a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
