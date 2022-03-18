package com.larksuite.component.openplatform.core.plugin.device;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"startDeviceCredential"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.o */
public class C24865o extends AbstractC65797c {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C24865o() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("startDeviceCredential");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        String str = (String) bVar.mo234984a("authContent");
        AppBrandLogger.m52830i("ApiHandler", "handle DeviceCredential" + str);
        if (mo230473f().getApplicationContext() == null) {
            mo230481a(ApiCode.STARTDEVICECREDENTIAL_UNLOCK_FAIL);
            AppBrandLogger.m52829e("ApiHandler", "context is null");
        } else if (TextUtils.isEmpty(str)) {
            mo230481a(ApiCode.STARTDEVICECREDENTIAL_AUTHCONTENT_EMPTY);
            AppBrandLogger.m52829e("ApiHandler", "authContent field is empty");
        } else {
            Activity f = mo230475h().mo235051f();
            if (f == null) {
                mo230481a(ApiCode.STARTDEVICECREDENTIAL_UNLOCK_FAIL);
                AppBrandLogger.m52829e("ApiHandler", "currentActivity is null");
                return;
            }
            Intent createConfirmDeviceCredentialIntent = ((KeyguardManager) f.getSystemService("keyguard")).createConfirmDeviceCredentialIntent(null, str);
            if (createConfirmDeviceCredentialIntent == null) {
                mo230481a(ApiCode.STARTDEVICECREDENTIAL_PASSWORD_NOT_SET);
                AppBrandLogger.m52829e("ApiHandler", "User has not set lock screen password");
                return;
            }
            f.startActivityForResult(createConfirmDeviceCredentialIntent, 30003);
        }
    }

    public C24865o(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.larksuite.framework.apiplugin.AbstractC25937e, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (i != 30003) {
            return false;
        }
        if (i2 == -1) {
            mo230494j();
            AppBrandLogger.m52830i("ApiHandler", "DeviceCredential success");
        } else if (mo230473f().getApplicationContext() != null) {
            mo230481a(ApiCode.STARTDEVICECREDENTIAL_UNLOCK_FAIL);
            AppBrandLogger.m52829e("ApiHandler", "handler callback fail, result code:" + i);
        } else {
            mo230481a(ApiCode.STARTDEVICECREDENTIAL_UNLOCK_FAIL);
            AppBrandLogger.m52829e("ApiHandler", "handler callback fail, context is null");
        }
        return true;
    }
}
