package com.larksuite.component.openplatform.core.plugin.container;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;

public class ApiShowShareMenuCtrlPlugin extends OPPlugin {

    private static class ApiShowShareMenuCtrlRequest extends C25920a {
        private ApiShowShareMenuCtrlRequest() {
        }
    }

    private static class ApiShowShareMenuCtrlResponse extends C25921b {
        private ApiShowShareMenuCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"showShareMenu"})
    public void apiShowShareMenuCtrlAsync(LKEvent lKEvent, ApiShowShareMenuCtrlRequest apiShowShareMenuCtrlRequest, AbstractC25905b bVar, AbstractC25897h<ApiShowShareMenuCtrlResponse> hVar) {
        ApiShowShareMenuCtrlResponse apiShowShareMenuCtrlResponse = new ApiShowShareMenuCtrlResponse();
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
                apiShowShareMenuCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiShowShareMenuCtrlResponse.mErrorMessage = ApiCallResultHelper.generateDataNullExtraInfo("currentPage");
                hVar.callback(apiShowShareMenuCtrlResponse);
                return;
            }
        }
        hVar.callback(apiShowShareMenuCtrlResponse);
    }
}
