package com.larksuite.component.openplatform.core.plugin.passport;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"getEnvVariable"}, support = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.passport.d */
public class C25455d extends AbstractC65797c {
    public C25455d() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getEnvVariable");
    }

    /* renamed from: b */
    private void m90983b() {
        if (AppbrandApplicationImpl.getInst(mo230473f()).getAppInfo() == null || TextUtils.isEmpty(AppbrandApplicationImpl.getInst(mo230473f()).getAppInfo().appId)) {
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
            AppBrandLogger.m52829e("LarkApiGetEnvConfig", "appinfo is error");
            return;
        }
        C66467o.C66470b bVar = null;
        CrossProcessDataEntity f = C67556a.m262949f();
        if (f != null) {
            bVar = new C66467o.C66470b(f);
        }
        if (bVar == null || TextUtils.isEmpty(bVar.f167782h)) {
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "not login");
            AppBrandLogger.m52829e("LarkApiGetEnvConfig", "session is empty");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, C67432a.m262319a(mo230473f()).getAppInfo().appId);
        hashMap.put("session", bVar.f167782h);
        C12843b.m53040a(C13047a.C13049b.m53532a() + "/getEnvConfig", null, new JSONObject(hashMap), null, mo230473f(), false).subscribe(new Consumer<C12830f>() {
            /* class com.larksuite.component.openplatform.core.plugin.passport.C25455d.C254561 */

            /* renamed from: a */
            public void accept(C12830f fVar) throws Exception {
                JSONObject jSONObject;
                JSONObject jSONObject2 = new JSONObject(fVar.mo48466d());
                JSONObject optJSONObject = jSONObject2.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                int optInt = jSONObject2.optInt("code", -1);
                if (optJSONObject == null || optInt != 0) {
                    C25455d.this.mo230481a(ApiCode.GETENVVARIABLE_GET_CONFIG_FAIL);
                    AppBrandLogger.m52829e("LarkApiGetEnvConfig", "config from service is fail, code:" + optInt);
                    return;
                }
                String optString = optJSONObject.optString("config");
                ((AbstractC12910a) C25455d.this.mo230473f().findServiceByInterface(AbstractC12910a.class)).mo48692a("key_env_config", optString, 600);
                JSONObject jSONObject3 = new JSONObject();
                if (!TextUtils.isEmpty(optString)) {
                    jSONObject = new JSONObject(optString);
                } else {
                    jSONObject = new JSONObject();
                }
                jSONObject3.put("config", jSONObject);
                C25455d.this.mo230492b(jSONObject3);
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.passport.C25455d.C254572 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C25455d.this.mo230486a(th);
                AppBrandLogger.m52829e("LarkApiGetEnvConfig", "get config from service fail", th);
            }
        });
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        JSONObject jSONObject;
        String a = ((AbstractC12910a) mo230473f().findServiceByInterface(AbstractC12910a.class)).mo48688a("key_env_config");
        if (a != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(a)) {
                    jSONObject = new JSONObject(a);
                } else {
                    jSONObject = new JSONObject();
                }
                jSONObject2.put("config", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mo230492b(jSONObject2);
            return;
        }
        m90983b();
    }

    public C25455d(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
