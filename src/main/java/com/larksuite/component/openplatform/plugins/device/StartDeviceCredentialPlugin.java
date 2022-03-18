package com.larksuite.component.openplatform.plugins.device;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.text.TextUtils;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKPluginParam;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.log.Log;

public class StartDeviceCredentialPlugin extends AbstractC25889a {
    private AbstractC25897h<StartDeviceCredentialResponse> mInvokeCallback;

    public static class StartDeviceCredentialResponse extends C25921b {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mInvokeCallback = null;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (i == 30003) {
            if (this.mInvokeCallback == null) {
                Log.m165383e("StartDeviceCredentialPl", "invokeCallback is null");
                return false;
            }
            StartDeviceCredentialResponse startDeviceCredentialResponse = new StartDeviceCredentialResponse();
            if (i2 == -1) {
                this.mInvokeCallback.callback(startDeviceCredentialResponse);
                Log.m165389i("StartDeviceCredentialPl", "DeviceCredential success");
                return true;
            }
            C25913h hVar = C25913h.f64175e;
            fillFailedResponse(startDeviceCredentialResponse, hVar, "DeviceCredential resultCode: " + i2);
            this.mInvokeCallback.callback(startDeviceCredentialResponse);
            Log.m165389i("StartDeviceCredentialPl", "DeviceCredential resultCode:" + i2);
        }
        return false;
    }

    @LKPluginFunction(async = true, eventName = {"startDeviceCredential"})
    public void startDeviceCredential(@LKPluginParam("authContent") String str, AbstractC25897h<StartDeviceCredentialResponse> hVar, AbstractC25905b bVar) {
        Log.m165389i("StartDeviceCredentialPl", "authContent:" + str);
        this.mInvokeCallback = hVar;
        StartDeviceCredentialResponse startDeviceCredentialResponse = new StartDeviceCredentialResponse();
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("StartDeviceCredentialPl", "authContent field is empty");
            fillFailedResponse(startDeviceCredentialResponse, C25913h.f64176f, "authContent field is empty");
            hVar.callback(startDeviceCredentialResponse);
        } else if (!(bVar.mo92207a() instanceof Activity)) {
            Log.m165383e("StartDeviceCredentialPl", "context is null");
            fillFailedResponse(startDeviceCredentialResponse, C25913h.f64175e, "context is null");
            hVar.callback(startDeviceCredentialResponse);
        } else {
            Intent createConfirmDeviceCredentialIntent = ((KeyguardManager) bVar.mo92207a().getSystemService("keyguard")).createConfirmDeviceCredentialIntent(null, str);
            if (createConfirmDeviceCredentialIntent == null) {
                fillFailedResponse(startDeviceCredentialResponse, C25913h.f64174d, "User has not set lock screen password");
                hVar.callback(startDeviceCredentialResponse);
                Log.m165383e("StartDeviceCredentialPl", "User has not set lock screen password");
                return;
            }
            ((Activity) bVar.mo92207a()).startActivityForResult(createConfirmDeviceCredentialIntent, 30003);
        }
    }
}
