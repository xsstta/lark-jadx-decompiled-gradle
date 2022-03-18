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

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.d */
public class C24660d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "hideShareMenu";
    }

    public C24660d() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(getAppContext());
        ArrayMap<String, Boolean> currentPageHideShareMenuArrayMap = inst.getCurrentPageHideShareMenuArrayMap();
        AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
        if (appInfo.isGame()) {
            currentPageHideShareMenuArrayMap.put(appInfo.appId, true);
        } else {
            String currentPage = inst.getCurrentPage();
            if (!TextUtils.isEmpty(currentPage)) {
                AppBrandLogger.m52830i("tma_ApiHideShareMenuCtrl", "currentPage:", currentPage);
                currentPageHideShareMenuArrayMap.put(currentPage, true);
            } else {
                AppBrandLogger.m52829e("tma_ApiHideShareMenuCtrl", "current page is null");
                callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("currentPage"));
                return;
            }
        }
        callbackOk();
    }

    public C24660d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
