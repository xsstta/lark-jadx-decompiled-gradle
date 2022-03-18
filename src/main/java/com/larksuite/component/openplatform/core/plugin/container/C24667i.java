package com.larksuite.component.openplatform.core.plugin.container;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.i */
public class C24667i extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "showShareMenu";
    }

    public C24667i() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(getAppContext());
        ArrayMap<String, Boolean> currentPageHideShareMenuArrayMap = inst.getCurrentPageHideShareMenuArrayMap();
        AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
        if (appInfo.isGame()) {
            currentPageHideShareMenuArrayMap.put(appInfo.appId, false);
        } else {
            String currentPage = inst.getCurrentPage();
            if (!TextUtils.isEmpty(currentPage)) {
                AppBrandLogger.m52830i("ApiShowShareMenuCtrl", "currentPage:", currentPage);
                currentPageHideShareMenuArrayMap.put(currentPage, false);
            } else {
                AppBrandLogger.m52829e("ApiShowShareMenuCtrl", "current page is null");
                callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("currentPage"));
                return;
            }
        }
        callbackOk();
    }

    public C24667i(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
