package com.larksuite.component.openplatform.core.plugin.device.p1131b;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3337v.C67076b;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.b.a */
public class C24735a extends ApiHandler {

    /* renamed from: a */
    private String f60845a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return this.f60845a;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean z;
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "activity is null");
            AppBrandLogger.m52830i("tma_ApiCompassCtrl", "activity is null");
            return;
        }
        AppBrandLogger.m52830i("tma_ApiCompassCtrl", this.f60845a);
        if (TextUtils.equals(this.f60845a, "startCompass")) {
            z = C67076b.m261418a(currentActivity).mo233179a(getAppContext());
        } else if (TextUtils.equals(this.f60845a, "stopCompass")) {
            z = C67076b.m261418a(currentActivity).mo233180b(getAppContext());
        } else {
            z = false;
        }
        if (z) {
            callbackOk();
            return;
        }
        callbackFail(ApiCode.OPERATECOMPASS_COMPASS_NOT_SUPPORT);
        AppBrandLogger.m52830i("tma_ApiCompassCtrl", "sensor unsupport or disable");
    }

    public C24735a(String str, String str2, int i, AbstractC67619e eVar) {
        super(str2, i, eVar);
        this.f60845a = str;
    }
}
