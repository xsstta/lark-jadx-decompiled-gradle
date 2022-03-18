package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.littleapp.EnvInfo;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.common.service.net.C67852a;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public class LarkApiChooseContactPlugin extends OPPlugin {
    public LarkApiChooseContactRequest chooseContactRequest;
    private LKEvent lkEvent;
    public AbstractC25897h<LarkApiChooseContactResponse> mEventInvokeCallback;
    long startTime;

    /* access modifiers changed from: private */
    public static class LarkApiChooseContactResponse extends C25921b {
        @JSONField(name = "department_data")
        public List<DepartmentModel> mDepartmentModel;
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public List<UserModel> mUserModel;

        /* access modifiers changed from: private */
        public static class DepartmentModel {
            @JSONField(name = "departmentId")
            public String mDepartmentId;
            @JSONField(name = "openDepartmentId")
            public String mOpenDepartmentId;

            private DepartmentModel() {
            }
        }

        /* access modifiers changed from: private */
        public static class UserModel {
            @JSONField(name = "avatarUrls")
            public List<String> mAvatarUrls;
            @JSONField(name = "i18nNames")
            public JSONObject mI18NName;
            @JSONField(name = "name")
            public String mName;
            @JSONField(name = "openId")
            public String mOpenId;

            private UserModel() {
                this.mAvatarUrls = new ArrayList();
            }
        }

        private LarkApiChooseContactResponse() {
            this.mUserModel = new ArrayList();
            this.mDepartmentModel = new ArrayList();
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
        this.mEventInvokeCallback = null;
    }

    /* access modifiers changed from: private */
    public static class LarkApiChooseContactRequest extends C25920a {
        @JSONField(name = "choosenIds")
        public List<String> mChoosenIds;
        @JSONField(name = "chosenIds")
        public List<String> mChosenIds;
        @JSONField(name = "enableChooseDepartment")
        public boolean mEnableChooseDepartment;
        @JSONField(name = "externalContact")
        public boolean mExternalContact = true;
        @JSONField(name = "ignore")
        public boolean mIgnore;
        @JSONField(name = "limitTips")
        public String mLimitTips;
        @JSONField(name = "maxNum")
        public int mMaxNum = 100;
        @JSONField(name = "multi")
        public boolean mMulti = true;

        private LarkApiChooseContactRequest() {
        }
    }

    private void callback(LarkApiChooseContactResponse larkApiChooseContactResponse) {
        this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
    }

    private boolean sendBackUserSummary(String str, HashMap<String, String> hashMap) {
        String str2;
        C67852a aVar = new C67852a();
        LarkApiChooseContactResponse larkApiChooseContactResponse = new LarkApiChooseContactResponse();
        try {
            JSONArray jSONArray = new JSONArray(str);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("user");
                    String optString = optJSONObject.optString("id");
                    if (TextUtils.isEmpty(optString)) {
                        Object[] objArr = new Object[1];
                        StringBuilder sb = new StringBuilder();
                        sb.append("choose contact");
                        if (optBoolean) {
                            str2 = "userId";
                        } else {
                            str2 = "departmentId";
                        }
                        sb.append(str2);
                        sb.append("is empty!");
                        objArr[0] = sb.toString();
                        AppBrandLogger.m52829e("LarkApiChooseContact", objArr);
                    } else if (optBoolean) {
                        jSONArray2.put(optString);
                        hashMap.put(optString, optJSONObject.optString("name"));
                    } else {
                        arrayList.add(optString);
                    }
                }
            }
            if (arrayList.size() > 0) {
                sendDepartmentIdToOpenDepartmentId(arrayList, jSONArray2, hashMap, aVar, larkApiChooseContactResponse);
                return true;
            }
            getUserInfoById(jSONArray2, aVar, hashMap, larkApiChooseContactResponse);
            return true;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("LarkApiChooseContact", "handle userInfo json exception", e);
            larkApiChooseContactResponse.mErrorCode = C25906a.f64080j.f64115H;
            larkApiChooseContactResponse.mErrorMessage = C25906a.f64080j.f64117J;
            larkApiChooseContactResponse.mInnerMsg = "handle userInfo json exception:" + e.getMessage();
            callback(larkApiChooseContactResponse);
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        C10548d.m43696a((Context) getAppContext().getCurrentActivity());
        LarkApiChooseContactResponse larkApiChooseContactResponse = new LarkApiChooseContactResponse();
        if (i != 20002) {
            return false;
        }
        if (i2 == 0) {
            C13377u.m54423c("success", System.currentTimeMillis() - this.startTime, null, getAppContext());
            fillFailedResponse(larkApiChooseContactResponse, C25906a.f64073c, C25906a.f64073c.f64117J);
            this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
            return true;
        } else if (intent == null) {
            C13377u.m54423c("success", System.currentTimeMillis() - this.startTime, "empty_data", getAppContext());
            AppBrandLogger.m52830i("LarkApiChooseContact", "data is null");
            fillFailedResponse(larkApiChooseContactResponse, C25906a.f64080j, "data is null");
            this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
            return true;
        } else {
            String stringExtra = intent.getStringExtra("params_little_app");
            if (!TextUtils.isEmpty(stringExtra)) {
                return sendBackUserSummary(stringExtra, new LinkedHashMap());
            }
            C13377u.m54423c("fail", System.currentTimeMillis() - this.startTime, "json_key_empty", getAppContext());
            fillFailedResponse(larkApiChooseContactResponse, C25906a.f64080j, "params_little_app is null");
            this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
            return true;
        }
    }

    @LKPluginFunction(async = true, eventName = {"chooseContact"})
    public void chooseContact(LKEvent lKEvent, LarkApiChooseContactRequest larkApiChooseContactRequest, ILogger aVar, AbstractC25897h<LarkApiChooseContactResponse> hVar) {
        this.mEventInvokeCallback = hVar;
        this.lkEvent = lKEvent;
        this.startTime = System.currentTimeMillis();
        this.chooseContactRequest = larkApiChooseContactRequest;
        boolean a = ((AbstractC67734b) getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("contactInfo");
        C13377u.m54418a("chooseContact", "contactInfo", a, getAppContext());
        aVar.mo92224i("LarkApiChooseContact", "contact info permission has granted " + a);
        org.json.JSONObject n = lKEvent.mo92147n();
        String str = "choosenIds";
        if (!n.has(str)) {
            str = "chosenIds";
        }
        openLarkChooseContactWithDisplayBack(n.optJSONArray(str), n.optJSONArray("disableChosenIds"), larkApiChooseContactRequest, aVar);
    }

    private void openLarkChooseContactWithDisplayBack(final JSONArray jSONArray, final JSONArray jSONArray2, final LarkApiChooseContactRequest larkApiChooseContactRequest, final ILogger aVar) {
        if ((jSONArray == null || jSONArray.length() <= 0) && (jSONArray2 == null || jSONArray2.length() <= 0)) {
            AppBrandLogger.m52829e("LarkApiChooseContact", "chosenIds or disableIds invalid, so openLarkChooseContact");
            openLarkChooseContact(getAppContext().getCurrentActivity(), null, null, larkApiChooseContactRequest, aVar);
            return;
        }
        final C67852a aVar2 = new C67852a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
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
            String g = getApiDependency().mo235054g(getAppContext().getAppId());
            try {
                jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, getAppContext().getAppId());
                getApiDependency().mo235029a(jSONObject);
                jSONObject.put("session", g);
                jSONObject.put("openids", jSONArray3);
                jSONObject.put("ttcode", aVar2.mo235486a(getAppContext()));
            } catch (JSONException e2) {
                AppBrandLogger.eWithThrowable("LarkApiChooseContact", "JSONException", e2);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        C12843b.m53038a(C13047a.C13049b.m53532a() + "/v2/getUserIDsByOpenIDs", hashMap, jSONObject, getAppContext()).subscribe(new Consumer<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkApiChooseContactPlugin.C250664 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52829e("LarkApiChooseContact", "get user ids by open ids failed, response is null");
                }
                org.json.JSONObject optJSONObject = new org.json.JSONObject(aVar2.mo235487a(new org.json.JSONObject(str).optString("encryptedData"))).optJSONObject("userids");
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
                LarkApiChooseContactPlugin larkApiChooseContactPlugin = LarkApiChooseContactPlugin.this;
                larkApiChooseContactPlugin.openLarkChooseContact(larkApiChooseContactPlugin.getAppContext().getCurrentActivity(), arrayList, arrayList2, larkApiChooseContactRequest, aVar);
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkApiChooseContactPlugin.C250675 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                AppBrandLogger.eWithThrowable("LarkApiChooseContact", "get user ids by open ids failed", th);
                LarkApiChooseContactPlugin larkApiChooseContactPlugin = LarkApiChooseContactPlugin.this;
                larkApiChooseContactPlugin.openLarkChooseContact(larkApiChooseContactPlugin.getAppContext().getCurrentActivity(), null, null, larkApiChooseContactRequest, aVar);
            }
        });
    }

    public void getUserInfoById(JSONArray jSONArray, final C67852a aVar, final HashMap<String, String> hashMap, final LarkApiChooseContactResponse larkApiChooseContactResponse) throws JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        String g = getApiDependency().mo235054g(getAppContext().getAppId());
        jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, getAppContext().getAppId());
        getApiDependency().mo235029a(jSONObject);
        jSONObject.put("session", g);
        jSONObject.put("userids", jSONArray);
        jSONObject.put("ttcode", aVar.mo235486a(getAppContext()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap2.put("domain_alias", "open");
        }
        C12843b.m53038a(C13047a.C13049b.m53532a() + "/v4/getOpenUserSummary", hashMap2, jSONObject, getAppContext()).observeOn(C68279a.m265021a()).subscribe(new Consumer<String>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkApiChooseContactPlugin.C250631 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                if (TextUtils.isEmpty(str)) {
                    LarkApiChooseContactResponse larkApiChooseContactResponse = new LarkApiChooseContactResponse();
                    LarkApiChooseContactPlugin.this.fillFailedResponse(larkApiChooseContactResponse, C25906a.f64081k, "get userinfo == null");
                    LarkApiChooseContactPlugin.this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
                    C13377u.m54423c("fail", System.currentTimeMillis() - LarkApiChooseContactPlugin.this.startTime, "null_response", LarkApiChooseContactPlugin.this.getAppContext());
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (!jSONObject.has("error") || jSONObject.getInt("error") != 0 || !jSONObject.has("encryptedData")) {
                    AppBrandLogger.m52829e("LarkApiChooseContact", "response has error. response:" + str);
                    C13377u.m54423c("fail", System.currentTimeMillis() - LarkApiChooseContactPlugin.this.startTime, "error_response", LarkApiChooseContactPlugin.this.getAppContext());
                    LarkApiChooseContactResponse larkApiChooseContactResponse2 = new LarkApiChooseContactResponse();
                    LarkApiChooseContactPlugin larkApiChooseContactPlugin = LarkApiChooseContactPlugin.this;
                    C25906a aVar = C25906a.f64081k;
                    larkApiChooseContactPlugin.fillFailedResponse(larkApiChooseContactResponse2, aVar, "response has error. response:" + str);
                    LarkApiChooseContactPlugin.this.mEventInvokeCallback.callback(larkApiChooseContactResponse2);
                    return;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(aVar.mo235487a(jSONObject.getString("encryptedData"))).getJSONObject("open_user_summary");
                boolean a = ((AbstractC67734b) LarkApiChooseContactPlugin.this.getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("contactInfo");
                for (String str2 : hashMap.keySet()) {
                    LarkApiChooseContactResponse.UserModel userModel = new LarkApiChooseContactResponse.UserModel();
                    org.json.JSONObject optJSONObject = jSONObject2.optJSONObject(str2);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("openid");
                        String optString2 = optJSONObject.optString("name");
                        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("i18n_name");
                        JSONArray optJSONArray = optJSONObject.optJSONArray("avatar_urls");
                        userModel.mOpenId = optString;
                        if (a) {
                            userModel.mName = optString2;
                            if (optJSONObject2 != null) {
                                userModel.mI18NName = JSON.parseObject(optJSONObject2.toString());
                            }
                            if (optJSONArray != null) {
                                for (int i = 0; i < optJSONArray.length(); i++) {
                                    userModel.mAvatarUrls.add(optJSONArray.getString(i));
                                }
                            }
                        }
                        larkApiChooseContactResponse.mUserModel.add(userModel);
                    }
                }
                if (!LarkApiChooseContactPlugin.this.chooseContactRequest.mEnableChooseDepartment) {
                    larkApiChooseContactResponse.mDepartmentModel = null;
                }
                LarkApiChooseContactPlugin.this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
                AppBrandLogger.m52830i("LarkApiChooseContact", "choose user and department success");
                C13377u.m54423c("success", System.currentTimeMillis() - LarkApiChooseContactPlugin.this.startTime, null, LarkApiChooseContactPlugin.this.getAppContext());
            }
        }, new Consumer<Throwable>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkApiChooseContactPlugin.C250642 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13377u.m54423c("fail", System.currentTimeMillis() - LarkApiChooseContactPlugin.this.startTime, th.getMessage(), LarkApiChooseContactPlugin.this.getAppContext());
                LarkApiChooseContactResponse larkApiChooseContactResponse = new LarkApiChooseContactResponse();
                LarkApiChooseContactPlugin.this.fillFailedResponse(larkApiChooseContactResponse, C25906a.f64079i, th.getMessage());
                LarkApiChooseContactPlugin.this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
            }
        });
    }

    private void sendDepartmentIdToOpenDepartmentId(List<String> list, final JSONArray jSONArray, final HashMap<String, String> hashMap, final C67852a aVar, final LarkApiChooseContactResponse larkApiChooseContactResponse) {
        AbstractC25905b d = this.lkEvent.mo92136d();
        if (d == null) {
            AppBrandLogger.m52829e("LarkApiChooseContact", "bridgeContext is null");
            larkApiChooseContactResponse.mErrorCode = C25906a.f64080j.f64115H;
            larkApiChooseContactResponse.mErrorMessage = C25906a.f64080j.f64117J;
            larkApiChooseContactResponse.mInnerMsg = "bridgeContext is null";
            this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
            return;
        }
        Messenger.DepartmentId2OpenDepartmentRequest departmentId2OpenDepartmentRequest = new Messenger.DepartmentId2OpenDepartmentRequest();
        departmentId2OpenDepartmentRequest.mDepartmentIds.addAll(list);
        d.mo92209a("departmentIdToOpenDepartmentId", departmentId2OpenDepartmentRequest, new AbstractC25897h<Messenger.DepartmentId2OpenDepartmentResponse>() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkApiChooseContactPlugin.C250653 */

            /* renamed from: a */
            public void callback(Messenger.DepartmentId2OpenDepartmentResponse departmentId2OpenDepartmentResponse) {
                if (departmentId2OpenDepartmentResponse.mErrorCode != Integer.MIN_VALUE) {
                    AppBrandLogger.m52829e("LarkApiChooseContact", "DepartmentId2OpenDepartment server error");
                    larkApiChooseContactResponse.mErrorMessage = departmentId2OpenDepartmentResponse.mErrorMessage;
                    larkApiChooseContactResponse.mErrorCode = departmentId2OpenDepartmentResponse.mErrorCode;
                    larkApiChooseContactResponse.mInnerMsg = departmentId2OpenDepartmentResponse.mInnerMsg;
                    LarkApiChooseContactPlugin.this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
                    return;
                }
                Map<String, String> map = departmentId2OpenDepartmentResponse.mDepartmentIdsWithOpenDepartmentIds;
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        LarkApiChooseContactResponse.DepartmentModel departmentModel = new LarkApiChooseContactResponse.DepartmentModel();
                        departmentModel.mDepartmentId = str;
                        departmentModel.mOpenDepartmentId = map.get(str);
                        larkApiChooseContactResponse.mDepartmentModel.add(departmentModel);
                    }
                }
                if (jSONArray.length() == 0) {
                    LarkApiChooseContactPlugin.this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
                    AppBrandLogger.m52830i("LarkApiChooseContact", "choose department success");
                    return;
                }
                try {
                    LarkApiChooseContactPlugin.this.getUserInfoById(jSONArray, aVar, hashMap, larkApiChooseContactResponse);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("LarkApiChooseContact", "handle userInfo json exception", e);
                    larkApiChooseContactResponse.mErrorCode = C25906a.f64080j.f64115H;
                    larkApiChooseContactResponse.mErrorMessage = C25906a.f64080j.f64117J;
                    LarkApiChooseContactResponse larkApiChooseContactResponse = larkApiChooseContactResponse;
                    larkApiChooseContactResponse.mInnerMsg = "handle userInfo json exception:" + e.getMessage();
                    LarkApiChooseContactPlugin.this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
                }
            }
        }, Messenger.DepartmentId2OpenDepartmentResponse.class);
    }

    public void openLarkChooseContact(Activity activity, ArrayList<String> arrayList, ArrayList<String> arrayList2, LarkApiChooseContactRequest larkApiChooseContactRequest, ILogger aVar) {
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
            aVar.mo92224i("LarkApiChooseContact", "start activity");
            intent.putExtra("multi", larkApiChooseContactRequest.mMulti);
            intent.putExtra("ignore", larkApiChooseContactRequest.mIgnore);
            intent.putExtra("maxNum", larkApiChooseContactRequest.mMaxNum);
            intent.putExtra("limitTips", larkApiChooseContactRequest.mLimitTips);
            intent.putExtra("externalContact", larkApiChooseContactRequest.mExternalContact);
            intent.putExtra("enableChooseDepartment", larkApiChooseContactRequest.mEnableChooseDepartment);
            AbstractC12888c i = C25529d.m91168i(getAppContext());
            if (i != null) {
                i.startActivityForResult(intent, 20002);
            } else {
                activity.startActivityForResult(intent, 20002);
            }
        } catch (Exception e) {
            LarkApiChooseContactResponse larkApiChooseContactResponse = new LarkApiChooseContactResponse();
            C13377u.m54423c("fail", System.currentTimeMillis() - this.startTime, e.getMessage(), getAppContext());
            fillFailedResponse(larkApiChooseContactResponse, C25906a.f64080j, e.getMessage());
            this.mEventInvokeCallback.callback(larkApiChooseContactResponse);
            aVar.mo92223e("LarkApiChooseContact", "Exception", e);
        }
    }
}
