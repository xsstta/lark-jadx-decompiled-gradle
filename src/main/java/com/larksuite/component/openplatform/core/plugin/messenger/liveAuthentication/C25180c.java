package com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13361m;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.option.ext.AbstractC67619e;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.c */
public class C25180c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setAuthenticationInfo";
    }

    public C25180c() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        JSONObject jSONObject;
        AppBrandLogger.m52830i("ApiSetAuthInfoCtrl", "invoke api");
        try {
            jSONObject = new JSONObject(this.mArgs);
        } catch (JSONException e) {
            callbackDefaultMsg(false);
            AppBrandLogger.m52829e("ApiSetAuthInfoCtrl", "JSONException", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            callbackDefaultMsg(false);
            AppBrandLogger.m52829e("ApiSetAuthInfoCtrl", "json object is null");
        }
        String b = LarkExtensionManager.getInstance().getExtension().mo49565b();
        String str = C13047a.C13049b.m53533b() + "/upload_auth_info";
        HashMap hashMap = new HashMap();
        hashMap.put("session", b);
        hashMap.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap.put("domain_alias", "open");
        }
        AppBrandLogger.m52830i("ApiSetAuthInfoCtrl", "request upload, url" + str);
        C12843b.m53038a(str, hashMap, jSONObject, getAppContext()).subscribe(new Consumer<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.C25180c.C251811 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                AppBrandLogger.m52830i("ApiSetAuthInfoCtrl", "onResult");
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52829e("ApiSetAuthInfoCtrl", "response is null");
                    C25180c.this.callbackDefaultMsg(false);
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("code", -1);
                String optString = jSONObject.optString("msg");
                if (optInt == 0) {
                    AppBrandLogger.m52830i("ApiSetAuthInfoCtrl", "callback success");
                    C25180c.this.callbackDefaultMsg(true);
                    new C67500a(C67501b.aH, C25180c.this.getAppContext()).flush();
                    return;
                }
                int a = C13361m.m54360a(40201, UpdateDialogStatusCode.DISMISS, 4, optInt, -1);
                if (a == -1) {
                    C25180c.this.callbackDefaultMsg(false);
                } else {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("errCode", Integer.valueOf(a));
                    C25180c.this.callbackMsg(false, hashMap, optString);
                }
                C25180c.this.mo88284a(optString, a);
                AppBrandLogger.m52829e("ApiSetAuthInfoCtrl", "callback fail. result:" + str);
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.liveAuthentication.C25180c.C251822 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C25180c.this.callbackDefaultMsg(false);
                AppBrandLogger.m52829e("ApiSetAuthInfoCtrl", "callback fail.", th);
            }
        });
    }

    /* renamed from: a */
    public void mo88284a(String str, int i) {
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

    public C25180c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
