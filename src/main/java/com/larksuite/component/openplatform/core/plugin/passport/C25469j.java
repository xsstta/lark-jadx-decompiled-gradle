package com.larksuite.component.openplatform.core.plugin.passport;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"startPasswordVerify"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.passport.j */
public class C25469j extends AbstractC65797c {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25469j() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("startPasswordVerify");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("StartPasswordVerifyAsyncHandler", "invoke api");
        if (mo230475h().mo235051f() == null) {
            AppBrandLogger.m52830i("StartPasswordVerifyAsyncHandler", "activity is null");
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
        } else if (!((AbstractC67724a) mo230473f().findServiceByInterface(AbstractC67724a.class)).mo50455b(mo230473f())) {
            AppBrandLogger.m52829e("StartPasswordVerifyAsyncHandler", " start activity fail ");
            mo230493c("start activity fail");
        }
    }

    public C25469j(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.larksuite.framework.apiplugin.AbstractC25937e, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        AppBrandLogger.m52830i("StartPasswordVerifyAsyncHandler", "handleActivityResult, reqCode" + i + " resultCode" + i2);
        if (i == 30004) {
            if (intent == null) {
                mo230493c("");
                AppBrandLogger.m52829e("StartPasswordVerifyAsyncHandler", "intent is null");
                return true;
            } else if (i2 == -1) {
                String stringExtra = intent.getStringExtra("password_verify_data");
                if (TextUtils.isEmpty(stringExtra)) {
                    mo230493c("data is null");
                    AppBrandLogger.m52829e("StartPasswordVerifyAsyncHandler", "data extra is null");
                    return true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject(stringExtra);
                    int optInt = jSONObject2.optInt("errorCode");
                    String optString = jSONObject2.optString("token");
                    jSONObject.put("token", optString);
                    if (optInt != 0 || TextUtils.isEmpty(optString)) {
                        if (optInt == 1) {
                            mo230482a(ApiCode.STARTPASSWORDVERIFY_USER_CANCEL, jSONObject2.optString("errorMessage"));
                        } else if (optInt == 2) {
                            mo230482a(ApiCode.STARTPASSWORDVERIFY_PASSWORD_ERROR, jSONObject2.optString("errorMessage"));
                        } else if (optInt != 3) {
                            mo230493c(jSONObject2.optString("errorMessage"));
                        } else {
                            mo230482a(ApiCode.STARTPASSWORDVERIFY_RETRY_TIME_LIMIT, jSONObject2.optString("errorMessage"));
                        }
                        return true;
                    }
                    mo230492b(jSONObject);
                    return true;
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("StartPasswordVerifyAsyncHandler", e);
                    mo230486a(e);
                }
            }
        }
        return false;
    }
}
