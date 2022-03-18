package com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13361m;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.littleapp.EnvInfo;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONObject;

public class ApiSetAuthInfoPlugin extends OPPlugin {
    private AbstractC25897h<ApiSetAuthInfoResponse> invokeCallback;
    private ILogger logger;

    private static class ApiSetAuthInfoRequest extends C25920a {
        private ApiSetAuthInfoRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiSetAuthInfoResponse extends C25921b {
        private ApiSetAuthInfoResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private void callbackOk() {
        ApiSetAuthInfoResponse apiSetAuthInfoResponse = new ApiSetAuthInfoResponse();
        AbstractC25897h<ApiSetAuthInfoResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiSetAuthInfoResponse);
        }
    }

    public /* synthetic */ void lambda$setAuthInfoAsync$1$ApiSetAuthInfoPlugin(Throwable th) throws Exception {
        callbackFail(ApiCode.GENERAL_UNKONW_ERROR.code, th.getMessage());
        logE("ApiSetAuthInfoPlugin", "callback fail.", th);
    }

    public /* synthetic */ void lambda$setAuthInfoAsync$0$ApiSetAuthInfoPlugin(String str) throws Exception {
        logI("ApiSetAuthInfoPlugin", "onResult");
        if (TextUtils.isEmpty(str)) {
            logE("ApiSetAuthInfoPlugin", "response is null");
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR.code, "response is null");
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        int optInt = jSONObject.optInt("code", -1);
        String optString = jSONObject.optString("msg");
        if (optInt == 0) {
            logI("ApiSetAuthInfoPlugin", "callback success");
            callbackOk();
            new C67500a(C67501b.aH, getAppContext()).flush();
            return;
        }
        int a = C13361m.m54360a(40201, UpdateDialogStatusCode.DISMISS, 4, optInt, -1);
        if (a == -1) {
            callbackFail(ApiCode.GENERAL_UNKONW_ERROR.code, ApiCode.GENERAL_UNKONW_ERROR.msg);
        } else {
            new HashMap().put("errCode", Integer.valueOf(a));
            callbackFail(a, "");
        }
        monitor(optString, a);
        logE("ApiSetAuthInfoPlugin", "callback fail. result:" + str);
    }

    private void logE(String str, Object... objArr) {
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92223e(str, objArr);
        }
    }

    private void logI(String str, Object... objArr) {
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92222d(str, objArr);
        }
    }

    private void callbackFail(int i, String str) {
        ApiSetAuthInfoResponse apiSetAuthInfoResponse = new ApiSetAuthInfoResponse();
        apiSetAuthInfoResponse.mErrorCode = i;
        apiSetAuthInfoResponse.mErrorMessage = str;
        AbstractC25897h<ApiSetAuthInfoResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiSetAuthInfoResponse);
        }
    }

    private void monitor(String str, int i) {
        if (i != 10100) {
            switch (i) {
                case UpdateDialogStatusCode.DISMISS:
                    new C67500a(C67501b.aI, getAppContext()).setErrorMessage(str).setErrorCode(String.valueOf(i)).flush();
                    return;
                case UpdateDialogStatusCode.SHOW:
                    new C67500a(C67501b.aJ, getAppContext()).setErrorMessage(str).setErrorCode(String.valueOf(i)).flush();
                    return;
                case 10003:
                    new C67500a(C67501b.aK, getAppContext()).setErrorMessage(str).setErrorCode(String.valueOf(i)).flush();
                    return;
                case 10004:
                    new C67500a(C67501b.aL, getAppContext()).setErrorMessage(str).setErrorCode(String.valueOf(i)).flush();
                    return;
                default:
                    new C67500a(C67501b.aQ, getAppContext()).setErrorMessage(str).setErrorCode(String.valueOf(i)).flush();
                    return;
            }
        } else {
            new C67500a(C67501b.aZ, getAppContext()).setErrorMessage(str).setErrorCode(String.valueOf(i)).flush();
        }
    }

    @LKPluginFunction(async = true, eventName = {"setAuthenticationInfo"})
    public void setAuthInfoAsync(LKEvent lKEvent, ApiSetAuthInfoRequest apiSetAuthInfoRequest, AbstractC25905b bVar, AbstractC25897h<ApiSetAuthInfoResponse> hVar) {
        this.invokeCallback = hVar;
        this.logger = lKEvent.mo92134c().mo92190b();
        logI("ApiSetAuthInfoPlugin", "invoke api");
        JSONObject n = lKEvent.mo92147n();
        String b = LarkExtensionManager.getInstance().getExtension().mo49565b();
        String str = C13047a.C13049b.m53533b() + "/upload_auth_info";
        HashMap hashMap = new HashMap();
        hashMap.put("session", b);
        hashMap.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap.put("domain_alias", "open");
        }
        logI("ApiSetAuthInfoPlugin", "request upload, url" + str);
        C12843b.m53038a(str, hashMap, n, getAppContext()).subscribe(new Consumer() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.$$Lambda$ApiSetAuthInfoPlugin$_KHTZBS2bhDt7MVRa4nC6CccnBM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApiSetAuthInfoPlugin.this.lambda$setAuthInfoAsync$0$ApiSetAuthInfoPlugin((String) obj);
            }
        }, new Consumer() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.$$Lambda$ApiSetAuthInfoPlugin$tLwoi2khtDnbijbVrx4lK_rP2c */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApiSetAuthInfoPlugin.this.lambda$setAuthInfoAsync$1$ApiSetAuthInfoPlugin((Throwable) obj);
            }
        });
    }
}
