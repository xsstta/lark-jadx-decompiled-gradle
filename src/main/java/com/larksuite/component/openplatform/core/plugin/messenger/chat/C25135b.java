package com.larksuite.component.openplatform.core.plugin.messenger.chat;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.utils.C13362n;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.IdTransformer;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"getChatInfo"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.chat.b */
public class C25135b extends AbstractC65797c {
    public C25135b() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getChatInfo");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        final boolean z;
        final boolean a = ((AbstractC67734b) mo230473f().findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
        C13377u.m54418a(mo230472e(), "chatInfo", a, mo230473f());
        AppBrandLogger.m52830i("ApiHandler", "params: " + this.f165820j.mo234988d());
        try {
            if (TextUtils.isEmpty(this.f165820j.mo234988d())) {
                mo230493c("params empty");
                return;
            }
            JSONObject jSONObject = new JSONObject(this.f165820j.mo234988d());
            final String optString = jSONObject.optString("openChatId");
            final String optString2 = jSONObject.optString("chatType");
            if (jSONObject.optInt("userType", -1) == 1) {
                z = true;
            } else {
                z = false;
            }
            IdTransformer.f35273a.mo49669a(optString, mo230473f(), C12805d.m52894a(C12805d.m52893a(mo230473f()), true, mo230473f()), mo230472e(), new Function1<String, Unit>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.chat.C25135b.C251361 */

                /* renamed from: a */
                public Unit invoke(String str) {
                    try {
                        AppBrandLogger.m52830i("ApiHandler", "result: " + str);
                        JSONObject optJSONObject = new JSONObject(str).optJSONObject("chatids");
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString(optString);
                            if (!TextUtils.isEmpty(optString)) {
                                final JSONObject d = LarkExtensionManager.getInstance().getExtension().mo49582d(optString);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("id", optString);
                                jSONObject.put("chatType", optString2);
                                jSONObject.put("isBot", z);
                                C13362n.m54361a(new JSONArray().put(jSONObject).toString(), new C13362n.AbstractC13365a() {
                                    /* class com.larksuite.component.openplatform.core.plugin.messenger.chat.C25135b.C251361.C251371 */

                                    @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                                    /* renamed from: a */
                                    public void mo49668a(HashMap<String, Object> hashMap) {
                                        try {
                                            AppBrandLogger.m52830i("ApiHandler", hashMap.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
                                            JSONObject jSONObject = ((JSONArray) hashMap.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getJSONObject(0);
                                            if (jSONObject.has("i18nNames")) {
                                                d.put("i18nNames", jSONObject.get("i18nNames"));
                                            }
                                            if (jSONObject.has("name")) {
                                                d.put("name", jSONObject.get("name"));
                                            }
                                            if (jSONObject.has("avatarUrls")) {
                                                d.put("avatarUrls", jSONObject.get("avatarUrls"));
                                            }
                                            C25135b.this.mo230492b(new JSONObject().put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, d));
                                        } catch (JSONException e) {
                                            AppBrandLogger.m52829e("ApiHandler", "transform id fail: " + e);
                                            C25135b.this.mo230493c("system error");
                                            e.printStackTrace();
                                        }
                                    }

                                    @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                                    /* renamed from: a */
                                    public void mo49667a(String str, Throwable th) {
                                        AppBrandLogger.m52829e("ApiHandler", "msg: " + str, th);
                                        C25135b.this.mo230493c("handle result fail");
                                    }
                                }, a, C25135b.this.mo230473f());
                                return null;
                            }
                            C25135b.this.mo230493c("server error");
                            return null;
                        }
                        C25135b.this.mo230493c("server error");
                        return null;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        AppBrandLogger.m52829e("ApiHandler", e);
                        C25135b.this.mo230493c("system error");
                        return null;
                    }
                }
            }, new Function1<Throwable, Unit>() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.chat.C25135b.C251382 */

                /* renamed from: a */
                public Unit invoke(Throwable th) {
                    AppBrandLogger.m52829e("ApiHandler", th);
                    C25135b.this.mo230493c("server error");
                    return null;
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            mo230493c("server error");
        }
    }

    public C25135b(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
