package com.larksuite.component.openplatform.core.plugin.messenger.chat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.utils.C13362n;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.larksuite.suite.R;
import com.ss.android.lark.littleapp.C41300b;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.chat.c */
public class C25139c extends ApiHandler {

    /* renamed from: a */
    private long f61417a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "chooseChat";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25139c() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        this.f61417a = System.currentTimeMillis();
        AppBrandLogger.m52830i("LarkApiChooseChat", "AppContextKey:" + getAppContext().getAppId());
        boolean a = ((AbstractC67734b) getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
        C13377u.m54418a(getActionName(), "chatInfo", a, getAppContext());
        AppBrandLogger.m52830i("LarkApiChooseChat", "chatInfo permission has granted " + a);
        m90494a(getAppContext().getCurrentActivity());
    }

    /* renamed from: a */
    private void m90494a(Activity activity) {
        Bundle bundle = new Bundle();
        String string = activity.getResources().getString(R.string.lark_brand_choose_chat_confirm);
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            bundle.putBoolean("allowCreateGroup", jSONObject.optBoolean("allowCreateGroup", true));
            bundle.putBoolean("multiSelect", jSONObject.optBoolean("multiSelect", false));
            bundle.putBoolean("ignoreSelf", jSONObject.optBoolean("ignoreSelf", false));
            bundle.putBoolean("ignoreBot", jSONObject.optBoolean("ignoreBot", false));
            bundle.putBoolean("externalChat", jSONObject.optBoolean("externalChat", true));
            bundle.putInt("selectType", jSONObject.optInt("selectType", 0));
            String optString = jSONObject.optString("confirmTitle", string);
            String optString2 = jSONObject.optString("confirmDesc", "");
            if (!TextUtils.isEmpty(optString)) {
                string = optString;
            }
            bundle.putString("confirmTitle", string);
            bundle.putString("confirmDesc", optString2);
            C41300b.m163749a(bundle, getAppContext());
        } catch (Exception e) {
            C13377u.m54424d("fail", System.currentTimeMillis() - this.f61417a, e.getMessage(), getAppContext());
            callbackFail(e);
            AppBrandLogger.eWithThrowable("LarkApiChooseChat", "parse params exception", e);
        }
    }

    public C25139c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (i != 20009) {
            AppBrandLogger.m52829e("LarkApiChooseChat", "choose chat request key error");
        } else if (intent != null) {
            String stringExtra = intent.getStringExtra("choose_chat_result");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                callbackFail("result is null");
                AppBrandLogger.m52829e("LarkApiChooseChat", "choose chat result key error");
            } else {
                C13362n.m54361a(stringExtra, new C13362n.AbstractC13365a() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.chat.C25139c.C251401 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                    /* renamed from: a */
                    public void mo49668a(HashMap<String, Object> hashMap) {
                        C25139c.this.callbackOk(hashMap);
                    }

                    @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                    /* renamed from: a */
                    public void mo49667a(String str, Throwable th) {
                        if (th != null) {
                            C25139c.this.callbackFail(th);
                        } else {
                            C25139c.this.callbackFail(str);
                        }
                    }
                }, ((AbstractC67734b) getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo"), getAppContext());
            }
        } else {
            AppBrandLogger.m52829e("LarkApiChooseChat", "choose chat result null");
            if (i2 == 0) {
                callbackFail(ApiCode.GENERAL_CANCEL);
            } else {
                callbackFail("data is null");
            }
        }
        return super.handleActivityResult(i, i2, intent);
    }
}
