package com.larksuite.component.openplatform.core.plugin.messenger.chat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13362n;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.larksuite.suite.R;
import com.ss.android.lark.littleapp.C41300b;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.chat.a */
public class C25133a extends AbstractC65797c {

    /* renamed from: a */
    private long f61406a;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25133a() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("chooseChat");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        this.f61406a = System.currentTimeMillis();
        AppBrandLogger.m52830i("ChooseChatAsyncHandler", "AppContextKey:" + mo230473f().getAppId());
        boolean a = ((AbstractC67734b) mo230473f().findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
        C13377u.m54418a(mo230472e(), "chatInfo", a, mo230473f());
        AppBrandLogger.m52830i("ChooseChatAsyncHandler", "chatInfo permission has granted " + a);
        m90483a(mo230473f().getCurrentActivity(), bVar.mo234988d());
    }

    public C25133a(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    private void m90483a(Activity activity, String str) {
        JSONObject jSONObject;
        Bundle bundle = new Bundle();
        String string = activity.getResources().getString(R.string.lark_brand_choose_chat_confirm);
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
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
            if (jSONObject.has("cardJSON")) {
                bundle.putSerializable("cardJSON", jSONObject.getString("cardJSON"));
                bundle.putString("appId", this.f165819i.getAppId());
            }
            if (jSONObject.has("needLeaveMessage")) {
                bundle.putBoolean("needLeaveMessage", jSONObject.getBoolean("needLeaveMessage"));
            }
            C41300b.m163749a(bundle, mo230473f());
        } catch (Exception e) {
            C13377u.m54424d("fail", System.currentTimeMillis() - this.f61406a, e.getMessage(), mo230473f());
            mo230486a(e);
            AppBrandLogger.eWithThrowable("ChooseChatAsyncHandler", "parse params exception", e);
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.larksuite.framework.apiplugin.AbstractC25937e, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        if (i == 20009) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("result");
                if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                    AppBrandLogger.m52829e("ChooseChatAsyncHandler", "choose chat result null");
                    if (i2 == 0) {
                        mo230481a(ApiCode.GENERAL_CANCEL);
                    } else {
                        mo230493c("data is null");
                    }
                } else {
                    boolean a = ((AbstractC67734b) mo230473f().findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
                    try {
                        final JSONObject jSONObject = new JSONObject(stringExtra);
                        JSONArray optJSONArray = jSONObject.optJSONArray("choose_chat_result");
                        if (optJSONArray != null) {
                            C13362n.m54361a(optJSONArray.toString(), new C13362n.AbstractC13365a() {
                                /* class com.larksuite.component.openplatform.core.plugin.messenger.chat.C25133a.C251341 */

                                @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                                /* renamed from: a */
                                public void mo49668a(HashMap<String, Object> hashMap) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("send_message_card_result");
                                    if (optJSONObject == null) {
                                        AppBrandLogger.m52830i("ChooseChatAsyncHandler", "from chooseChat");
                                        C25133a.this.mo230487a(hashMap);
                                        return;
                                    }
                                    AppBrandLogger.m52830i("ChooseChatAsyncHandler", "from sendMessageCard");
                                    C25133a.this.mo230492b(optJSONObject);
                                }

                                @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
                                /* renamed from: a */
                                public void mo49667a(String str, Throwable th) {
                                    if (th != null) {
                                        C25133a.this.mo230486a(th);
                                    } else {
                                        C25133a.this.mo230493c(str);
                                    }
                                }
                            }, a, mo230473f());
                            return true;
                        }
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("ChooseChatAsyncHandler", "JSONException", e);
                    }
                    mo230493c("result is null");
                    AppBrandLogger.m52829e("ChooseChatAsyncHandler", "choose chat result key error");
                }
            } else {
                AppBrandLogger.m52829e("ChooseChatAsyncHandler", "choose chat request key error");
            }
        }
        return true;
    }
}
