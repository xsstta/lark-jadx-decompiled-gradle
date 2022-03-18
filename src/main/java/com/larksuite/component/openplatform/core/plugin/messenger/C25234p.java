package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.common.service.net.C67852a;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.p */
public class C25234p extends ApiHandler {

    /* renamed from: a */
    long f61600a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "chooseContact";
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25234p() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        String str = "choosenIds";
        this.f61600a = System.currentTimeMillis();
        boolean a = ((AbstractC67734b) getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("contactInfo");
        C13377u.m54418a(getActionName(), "contactInfo", a, getAppContext());
        AppBrandLogger.m52830i("LarkApiChooseContact", "contact info permission has granted " + a);
        if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.api.choosecontact.displayback")) {
            AppBrandLogger.m52830i("LarkApiChooseContact", "FEATURE_KEY_CHOOSECONTACT_DISPLAYBACK is open");
            try {
                JSONObject jSONObject = new JSONObject(this.mArgs);
                if (!jSONObject.has(str)) {
                    str = "chosenIds";
                }
                m90663b(jSONObject.optJSONArray(str), jSONObject.optJSONArray("disableChosenIds"));
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("LarkApiChooseContact", "JSONException", e);
            }
        } else {
            AppBrandLogger.m52830i("LarkApiChooseContact", "FEATURE_KEY_CHOOSECONTACT_DISPLAYBACK is close");
            mo88338a(getAppContext().getCurrentActivity(), null, null);
        }
    }

    /* renamed from: a */
    public void mo88339a(JSONArray jSONArray, JSONArray jSONArray2) {
        JSONObject jSONObject = new JSONObject();
        if (jSONArray == null && jSONArray2 == null) {
            try {
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getActionName(), "fail"));
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("LarkApiChooseContact", "JSONException", e);
            }
        } else {
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
            jSONObject.put("department_data", jSONArray2);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getActionName(), "ok"));
        }
        this.mApiHandlerCallback.callback(this.mCallBackId, jSONObject.toString());
    }

    /* renamed from: b */
    private void m90663b(final JSONArray jSONArray, final JSONArray jSONArray2) {
        if ((jSONArray == null || jSONArray.length() <= 0) && (jSONArray2 == null || jSONArray2.length() <= 0)) {
            AppBrandLogger.m52829e("LarkApiChooseContact", "chosenIds or disableIds invalid, so openLarkChooseContact");
            mo88338a(getAppContext().getCurrentActivity(), null, null);
            return;
        }
        final C67852a aVar = new C67852a();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    jSONArray3.put(jSONArray.get(i));
                }
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("LarkApiChooseContact", "JSONException", e);
            }
        }
        if (jSONArray2 != null) {
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                jSONArray3.put(jSONArray2.get(i2));
            }
        }
        if (getAppContext().getAppId() != null) {
            try {
                jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, getAppContext().getAppId());
                jSONObject.put("openids", jSONArray3);
                jSONObject.put("ttcode", aVar.mo235486a(getAppContext()));
            } catch (JSONException e2) {
                AppBrandLogger.eWithThrowable("LarkApiChooseContact", "JSONException", e2);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        C12843b.m53039a(C13047a.C13049b.m53532a() + "/v2/getUserIDsByOpenIDs", (Map<String, String>) hashMap, jSONObject, getAppContext(), true).subscribe(new Consumer<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25234p.C252373 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52829e("LarkApiChooseContact", "get user ids by open ids failed, response is null");
                }
                JSONObject optJSONObject = new JSONObject(aVar.mo235487a(new JSONObject(str).optString("encryptedData"))).optJSONObject("userids");
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = new ArrayList<>();
                JSONArray jSONArray = jSONArray;
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(optJSONObject.optString((String) jSONArray.get(i)));
                    }
                }
                JSONArray jSONArray2 = jSONArray2;
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        arrayList2.add(optJSONObject.optString((String) jSONArray2.get(i2)));
                    }
                }
                C25234p pVar = C25234p.this;
                pVar.mo88338a(pVar.getAppContext().getCurrentActivity(), arrayList, arrayList2);
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25234p.C252384 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                AppBrandLogger.eWithThrowable("LarkApiChooseContact", "get user ids by open ids failed", th);
                C25234p pVar = C25234p.this;
                pVar.mo88338a(pVar.getAppContext().getCurrentActivity(), null, null);
            }
        });
    }

    /* renamed from: a */
    private boolean m90662a(String str, final HashMap<String, String> hashMap) {
        final C67852a aVar = new C67852a();
        JSONObject jSONObject = new JSONObject();
        final JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONArray(str);
            JSONArray jSONArray3 = new JSONArray();
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("user");
                    String optString = optJSONObject.optString("id");
                    String str2 = "departmentId";
                    if (TextUtils.isEmpty(optString)) {
                        Object[] objArr = new Object[1];
                        StringBuilder sb = new StringBuilder();
                        sb.append("choose contact");
                        if (optBoolean) {
                            str2 = "userId";
                        }
                        sb.append(str2);
                        sb.append("is empty!");
                        objArr[0] = sb.toString();
                        AppBrandLogger.m52829e("LarkApiChooseContact", objArr);
                    } else if (optBoolean) {
                        jSONArray3.put(optString);
                        hashMap.put(optString, optJSONObject.optString("name"));
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(str2, optString);
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            if (jSONArray3.length() != 0) {
                jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, getAppContext().getAppId());
                jSONObject.put("userids", jSONArray3);
                jSONObject.put("ttcode", aVar.mo235486a(getAppContext()));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
                EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
                if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
                    hashMap2.put("domain_alias", "open");
                }
                C12843b.m53039a(C13047a.C13049b.m53532a() + "/v4/getOpenUserSummary", (Map<String, String>) hashMap2, jSONObject, getAppContext(), true).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<String>() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25234p.C252351 */

                    /* renamed from: a */
                    public void accept(String str) throws Exception {
                        if (TextUtils.isEmpty(str)) {
                            C25234p.this.callbackFail(ApiCode.CHOOSECONTACT_GET_USER_INFO_FAIL);
                            C13377u.m54423c("fail", System.currentTimeMillis() - C25234p.this.f61600a, "null_response", C25234p.this.getAppContext());
                            return;
                        }
                        JSONObject jSONObject = new JSONObject(str);
                        if (!jSONObject.has("error") || jSONObject.getInt("error") != 0 || !jSONObject.has("encryptedData")) {
                            AppBrandLogger.m52829e("LarkApiChooseContact", "response has error. response:" + str);
                            C13377u.m54423c("fail", System.currentTimeMillis() - C25234p.this.f61600a, "error_response", C25234p.this.getAppContext());
                            C25234p.this.callbackFail(ApiCode.CHOOSECONTACT_GET_USER_INFO_FAIL);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject(aVar.mo235487a(jSONObject.getString("encryptedData"))).getJSONObject("open_user_summary");
                        JSONArray jSONArray = new JSONArray();
                        boolean a = ((AbstractC67734b) C25234p.this.getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("contactInfo");
                        for (String str2 : hashMap.keySet()) {
                            JSONObject jSONObject3 = new JSONObject();
                            JSONObject optJSONObject = jSONObject2.optJSONObject(str2);
                            if (optJSONObject != null) {
                                String optString = optJSONObject.optString("openid");
                                String optString2 = optJSONObject.optString("name");
                                JSONObject optJSONObject2 = optJSONObject.optJSONObject("i18n_name");
                                JSONArray optJSONArray = optJSONObject.optJSONArray("avatar_urls");
                                jSONObject3.put("openId", optString);
                                if (a) {
                                    jSONObject3.put("name", optString2);
                                    jSONObject3.put("i18nNames", optJSONObject2);
                                    jSONObject3.put("avatarUrls", optJSONArray);
                                }
                                jSONArray.put(jSONObject3);
                            }
                        }
                        C25234p.this.mo88339a(jSONArray, jSONArray);
                        AppBrandLogger.m52830i("LarkApiChooseContact", "choose user and department success");
                        C13377u.m54423c("success", System.currentTimeMillis() - C25234p.this.f61600a, null, C25234p.this.getAppContext());
                    }
                }, new Consumer<Throwable>() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25234p.C252362 */

                    /* renamed from: a */
                    public void accept(Throwable th) throws Exception {
                        C13377u.m54423c("fail", System.currentTimeMillis() - C25234p.this.f61600a, th.getMessage(), C25234p.this.getAppContext());
                        C25234p.this.callbackFail(th);
                    }
                });
                return true;
            } else if (jSONArray.length() > 0) {
                mo88339a(new JSONArray(), jSONArray);
                AppBrandLogger.m52830i("LarkApiChooseContact", "choose department success");
                return true;
            } else {
                AppBrandLogger.m52829e("LarkApiChooseContact", "userId and departmentId not exits");
                callbackFail(ApiCode.GENERAL_UNKONW_ERROR);
                return true;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public C25234p(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        C10548d.m43696a((Context) getAppContext().getCurrentActivity());
        if (i != 20002) {
            return false;
        }
        if (i2 == 0) {
            C13377u.m54423c("success", System.currentTimeMillis() - this.f61600a, null, getAppContext());
            callbackFail(ApiCode.GENERAL_CANCEL);
            return true;
        } else if (intent == null) {
            C13377u.m54423c("success", System.currentTimeMillis() - this.f61600a, "empty_data", getAppContext());
            AppBrandLogger.m52830i("LarkApiChooseContact", "data is null");
            callbackFail(ApiCode.GENERAL_CANCEL);
            return true;
        } else {
            String stringExtra = intent.getStringExtra("params_little_app");
            if (!TextUtils.isEmpty(stringExtra)) {
                return m90662a(stringExtra, new LinkedHashMap());
            }
            C13377u.m54423c("fail", System.currentTimeMillis() - this.f61600a, "json_key_empty", getAppContext());
            callbackFail("params_little_app is null");
            return true;
        }
    }

    /* renamed from: a */
    public void mo88338a(Activity activity, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(activity.getPackageName(), "com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberActivity"));
        intent.putExtra("ui_style", 6);
        if (arrayList != null) {
            intent.putExtra("displayBackMembersId", arrayList);
        }
        if (arrayList2 != null) {
            intent.putExtra("disableIds", arrayList2);
        }
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            intent.putExtra("multi", jSONObject.optBoolean("multi", true));
            intent.putExtra("ignore", jSONObject.optBoolean("ignore"));
            intent.putExtra("maxNum", jSONObject.optInt("maxNum", 100));
            intent.putExtra("limitTips", jSONObject.optString("limitTips"));
            intent.putExtra("externalContact", jSONObject.optBoolean("externalContact", true));
            intent.putExtra("enableChooseDepartment", jSONObject.optBoolean("enableChooseDepartment", false));
            AbstractC12888c i = C25529d.m91168i(getAppContext());
            if (i != null) {
                i.startActivityForResult(intent, 20002);
            } else {
                activity.startActivityForResult(intent, 20002);
            }
        } catch (Exception e) {
            C13377u.m54423c("fail", System.currentTimeMillis() - this.f61600a, e.getMessage(), getAppContext());
            callbackFail(ApiCode.CHOOSECONTACT_OPEN_CONTACT_FAIL);
            AppBrandLogger.eWithThrowable("LarkApiChooseContact", "Exception", e);
        }
    }
}
