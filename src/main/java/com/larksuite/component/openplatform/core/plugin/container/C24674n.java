package com.larksuite.component.openplatform.core.plugin.container;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.C67432a;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.n */
public class C24674n extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getShowModalTipInfo";
    }

    public C24674n() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (getAppContext().getCurrentActivity() == null || C67432a.m262319a(getAppContext()).getAppInfo() == null) {
            callbackDefaultMsg(false);
            AppBrandLogger.m52829e("LarkApiGetShowModalTipInfo", "appbrandcontext activity is null");
            return;
        }
        AppBrandLogger.m52830i("LarkApiGetShowModalTipInfo", this.mArgs);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("title", getAppContext().getCurrentActivity().getString(R.string.lark_brand_show_modal_tip_title, new Object[]{C67432a.m262319a(getAppContext()).getAppInfo().appName}));
        hashMap.put("confirmText", getAppContext().getCurrentActivity().getString(R.string.lark_brand_show_modal_tip_confirm));
        hashMap.put("cancelText", getAppContext().getCurrentActivity().getString(R.string.lark_brand_show_modal_tip_cancel));
        callbackMsg(true, hashMap, null);
    }

    public C24674n(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
