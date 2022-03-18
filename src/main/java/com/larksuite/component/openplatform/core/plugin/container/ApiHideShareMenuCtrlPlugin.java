package com.larksuite.component.openplatform.core.plugin.container;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;

public class ApiHideShareMenuCtrlPlugin extends OPPlugin {

    private static class ApiHideShareMenuCtrlResponse extends C25921b {
        private ApiHideShareMenuCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"hideShareMenu"})
    public void ApiHideShareMenuCtrlAsync(LKEvent lKEvent, AbstractC25895f fVar, AbstractC25897h<ApiHideShareMenuCtrlResponse> hVar) {
        ApiHideShareMenuCtrlResponse apiHideShareMenuCtrlResponse = new ApiHideShareMenuCtrlResponse();
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(getAppContext());
        ArrayMap<String, Boolean> currentPageHideShareMenuArrayMap = inst.getCurrentPageHideShareMenuArrayMap();
        AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
        if (appInfo.isGame()) {
            currentPageHideShareMenuArrayMap.put(appInfo.appId, true);
        } else {
            String currentPage = inst.getCurrentPage();
            if (!TextUtils.isEmpty(currentPage)) {
                fVar.mo92190b().mo92224i("tma_ApiHideShareMenuCtrl", "currentPage:", currentPage);
                currentPageHideShareMenuArrayMap.put(currentPage, true);
            } else {
                fVar.mo92190b().mo92223e("tma_ApiHideShareMenuCtrl", "current page is null");
                apiHideShareMenuCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiHideShareMenuCtrlResponse.mErrorMessage = ApiCallResultHelper.generateDataNullExtraInfo("currentPage");
                hVar.callback(apiHideShareMenuCtrlResponse);
                return;
            }
        }
        hVar.callback(apiHideShareMenuCtrlResponse);
    }
}
