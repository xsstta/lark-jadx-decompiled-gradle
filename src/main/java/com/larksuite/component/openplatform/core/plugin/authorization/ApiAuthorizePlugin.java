package com.larksuite.component.openplatform.core.plugin.authorization;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25103a;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKIncludeWithFailData;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

public class ApiAuthorizePlugin extends OPPlugin {
    private AbstractC25897h<ApiAuthorizeResponse> invokeCallback;
    private ILogger logger;

    @LKIncludeWithFailData
    public static class ApiAuthorizeResponse extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public JSONObject data;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.authorization.ApiAuthorizePlugin$a */
    public interface AbstractC24587a {
        void onFinished(LinkedHashMap<Integer, String> linkedHashMap);
    }

    public String getActionName() {
        return "authorize";
    }

    private static class ApiAuthorizeRequest extends C25920a {
        @JSONField(name = "scope")
        @LKRequiredParam
        public String scope;

        private ApiAuthorizeRequest() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private JSONObject transOrgJson(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return JSON.parseObject(jSONObject.toString());
    }

    private List<String> checkInvalidScope(String str) {
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            hashSet.addAll(Arrays.asList(str.split(",")));
        }
        for (String str2 : hashSet) {
            if (HostDependManager.getInst().scopeToBrandPermission(str2, getAppContext()) == null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    private List<String> getAuthScopes(LinkedHashMap<Integer, String> linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(entry.getKey().intValue(), getAppContext());
            if (permissionTypeToPermission != null) {
                arrayList.add(permissionTypeToPermission.mo232181e());
            }
        }
        return arrayList;
    }

    private Set<C66578b.C66579a> initApiParam(String str) {
        HashSet hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            hashSet2.addAll(Arrays.asList(str.split(",")));
        }
        for (String str2 : hashSet2) {
            C66578b.C66579a scopeToBrandPermission = HostDependManager.getInst().scopeToBrandPermission(str2, getAppContext());
            if (scopeToBrandPermission != null) {
                hashSet.add(scopeToBrandPermission);
            }
        }
        return hashSet;
    }

    private org.json.JSONObject obtainCallbackDataJsonObject(LinkedHashMap<Integer, String> linkedHashMap) throws JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(entry.getKey().intValue(), getAppContext());
            if (permissionTypeToPermission != null) {
                jSONObject.put(permissionTypeToPermission.mo232181e(), entry.getValue());
            }
        }
        return jSONObject;
    }

    private void logE(String str, Object... objArr) {
        ILogger aVar = this.logger;
        if (aVar != null) {
            aVar.mo92223e(str, objArr);
        }
    }

    public void callbackOk(org.json.JSONObject jSONObject, CountDownLatch countDownLatch) {
        ApiAuthorizeResponse apiAuthorizeResponse = new ApiAuthorizeResponse();
        apiAuthorizeResponse.data = transOrgJson(jSONObject);
        AbstractC25897h<ApiAuthorizeResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiAuthorizeResponse);
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private void requestPermission(final C66578b.C66579a aVar, final CountDownLatch countDownLatch) {
        final HashSet hashSet;
        if (aVar != null) {
            if (aVar.mo232182f() == null) {
                hashSet = new HashSet();
            } else {
                hashSet = new HashSet(Arrays.asList(aVar.mo232182f()));
            }
            if (getAppContext() == null) {
                callbackFail(C25906a.f64080j, "appContext is null", countDownLatch);
                return;
            }
            final Activity currentActivity = getAppContext().getCurrentActivity();
            if (currentActivity == null) {
                callbackFail(C25906a.f64080j, "activity is null", countDownLatch);
                return;
            }
            final AbstractC67733a aVar2 = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
            aVar2.mo235103a(currentActivity, getActionName(), aVar, new AbstractC67540b() {
                /* class com.larksuite.component.openplatform.core.plugin.authorization.ApiAuthorizePlugin.C245841 */

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87199a() {
                    if (!hashSet.isEmpty()) {
                        ApiAuthorizePlugin.this.getApiDependency().mo235022a(currentActivity, ApiAuthorizePlugin.this.getActionName(), hashSet, new AbstractC67709b.AbstractC67711b() {
                            /* class com.larksuite.component.openplatform.core.plugin.authorization.ApiAuthorizePlugin.C245841.C245851 */

                            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                            /* renamed from: a */
                            public void mo87574a() {
                                C66020b.m258530a("mp_auth_alert_result", ApiAuthorizePlugin.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "success").mo231092a();
                                C25103a.m90432a(ApiAuthorizePlugin.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(ApiAuthorizePlugin.this.getAppContext()).getAppInfo().appName, ApiAuthorizePlugin.this.getAppContext().getAppType(), aVar.mo232181e(), "approved");
                                ApiAuthorizePlugin.this.callbackOk(null, countDownLatch);
                            }

                            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                            /* renamed from: a */
                            public void mo87575a(String str) {
                                C66020b.m258530a("mp_auth_alert_result", ApiAuthorizePlugin.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                                C25103a.m90432a(ApiAuthorizePlugin.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(ApiAuthorizePlugin.this.getAppContext()).getAppInfo().appName, ApiAuthorizePlugin.this.getAppContext().getAppType(), aVar.mo232181e(), "rejected");
                                ApiAuthorizePlugin.this.callbackFail(C25906a.f64075e, C25906a.f64075e.f64117J, countDownLatch);
                            }
                        });
                        return;
                    }
                    C66020b.m258530a("mp_auth_alert_result", ApiAuthorizePlugin.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "success").mo231092a();
                    C25103a.m90432a(ApiAuthorizePlugin.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(ApiAuthorizePlugin.this.getAppContext()).getAppInfo().appName, ApiAuthorizePlugin.this.getAppContext().getAppType(), aVar.mo232181e(), "approved");
                    ApiAuthorizePlugin.this.callbackOk(null, countDownLatch);
                }

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87200a(String str) {
                    C66020b.m258530a("mp_auth_alert_result", ApiAuthorizePlugin.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                    C25103a.m90432a(ApiAuthorizePlugin.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(ApiAuthorizePlugin.this.getAppContext()).getAppInfo().appName, ApiAuthorizePlugin.this.getAppContext().getAppType(), aVar.mo232181e(), "rejected");
                    ApiAuthorizePlugin.this.callbackFail(C25906a.f64076f, C25906a.f64076f.f64117J, countDownLatch);
                }
            });
            return;
        }
        callbackFail(C25906a.f64072b, (String) null, countDownLatch);
    }

    public void callbackFail(C25906a aVar, String str, CountDownLatch countDownLatch) {
        ApiAuthorizeResponse apiAuthorizeResponse = new ApiAuthorizeResponse();
        fillFailedResponse(apiAuthorizeResponse, aVar, str);
        AbstractC25897h<ApiAuthorizeResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiAuthorizeResponse);
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private void allAuthorizeFiltered(boolean z, LinkedHashMap<Integer, String> linkedHashMap, CountDownLatch countDownLatch) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            if (entry.getValue().contentEquals("system auth deny")) {
                hashSet.add(entry.getKey());
            }
        }
        IAppContext appContext = getAppContext();
        if (appContext == null) {
            callbackFail(C25906a.f64080j, "appContext is null", countDownLatch);
            return;
        }
        Activity currentActivity = appContext.getCurrentActivity();
        if (currentActivity == null) {
            callbackFail(C25906a.f64080j, "activity is null", countDownLatch);
        } else {
            recursionRequestSysPermissions(linkedHashMap, currentActivity, hashSet.iterator(), new AbstractC24587a(linkedHashMap, countDownLatch) {
                /* class com.larksuite.component.openplatform.core.plugin.authorization.$$Lambda$ApiAuthorizePlugin$mIDb5Di0FxUu80u5tw9JuC9z85E */
                public final /* synthetic */ LinkedHashMap f$1;
                public final /* synthetic */ CountDownLatch f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.larksuite.component.openplatform.core.plugin.authorization.ApiAuthorizePlugin.AbstractC24587a
                public final void onFinished(LinkedHashMap linkedHashMap) {
                    ApiAuthorizePlugin.this.lambda$allAuthorizeFiltered$0$ApiAuthorizePlugin(this.f$1, this.f$2, linkedHashMap);
                }
            });
        }
    }

    public /* synthetic */ void lambda$allAuthorizeFiltered$0$ApiAuthorizePlugin(LinkedHashMap linkedHashMap, CountDownLatch countDownLatch, LinkedHashMap linkedHashMap2) {
        boolean z;
        try {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((String) ((Map.Entry) it.next()).getValue()).contentEquals("ok")) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            org.json.JSONObject jSONObject = null;
            if (linkedHashMap.size() > 0) {
                jSONObject = obtainCallbackDataJsonObject(linkedHashMap);
            }
            List<String> authScopes = getAuthScopes(linkedHashMap);
            if (z) {
                for (String str : authScopes) {
                    C25103a.m90432a(getAppContext().getAppId(), AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().appName, getAppContext().getAppType(), str, "rejected");
                }
                callbackFail(C25906a.f64072b, C25906a.f64072b.f64117J, jSONObject, countDownLatch);
                return;
            }
            for (String str2 : authScopes) {
                C25103a.m90432a(getAppContext().getAppId(), AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().appName, getAppContext().getAppType(), str2, "approved");
            }
            callbackOk(jSONObject, countDownLatch);
        } catch (JSONException e) {
            logE("tma_ApiAuthorizePlugin", e.toString());
            callbackFail(C25906a.f64080j, e.getMessage(), countDownLatch);
        }
    }

    @LKPluginFunction(async = true, eventName = {"authorize"})
    public void authorizeAsync(LKEvent lKEvent, ApiAuthorizeRequest apiAuthorizeRequest, AbstractC25897h<ApiAuthorizeResponse> hVar) {
        boolean z;
        boolean z2;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.invokeCallback = hVar;
        this.logger = lKEvent.mo92134c().mo92190b();
        try {
            String str = apiAuthorizeRequest.scope;
            if (!(getAppContext() == null || AppbrandApplicationImpl.getInst(getAppContext()) == null)) {
                C25103a.m90431a(getAppContext().getAppId(), AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().appName, getAppContext().getAppType(), str);
            }
            List<String> checkInvalidScope = checkInvalidScope(str);
            if (checkInvalidScope.size() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                for (String str2 : checkInvalidScope) {
                    jSONObject.put(str2, "invalid scope");
                }
                callbackFail(C25906a.f64072b, ApiCode.AUTHORIZE_AUTH_DENY.code, C25906a.f64072b.f64117J, jSONObject, countDownLatch);
                return;
            }
            Set<C66578b.C66579a> initApiParam = initApiParam(str);
            if (initApiParam.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
            ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo235102a(initApiParam, linkedHashMap);
            if (z) {
                for (C66578b.C66579a aVar : initApiParam) {
                    if (C66578b.C66579a.m260128m(getAppContext()).contains(aVar)) {
                        callbackFail(C25906a.f64072b, "invalid scope", countDownLatch);
                        return;
                    }
                }
            }
            if (initApiParam.size() <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                allAuthorizeFiltered(z, linkedHashMap, countDownLatch);
            } else {
                requestPermission(initApiParam.iterator().next(), countDownLatch);
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                logE("tma_ApiAuthorizePlugin", e.getMessage());
            }
        } catch (JSONException e2) {
            logE("tma_ApiAuthorizePlugin", e2.toString());
            callbackFail(C25906a.f64080j, e2.getMessage(), countDownLatch);
        }
    }

    private void callbackFail(C25906a aVar, String str, org.json.JSONObject jSONObject, CountDownLatch countDownLatch) {
        callbackFail(aVar, aVar.f64115H, str, jSONObject, countDownLatch);
    }

    public void recursionRequestSysPermissions(final LinkedHashMap<Integer, String> linkedHashMap, final Activity activity, final Iterator<Integer> it, final AbstractC24587a aVar) {
        HashSet hashSet;
        if (!it.hasNext()) {
            aVar.onFinished(linkedHashMap);
            return;
        }
        final C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(it.next().intValue(), getAppContext());
        if (permissionTypeToPermission.mo232182f() == null) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(Arrays.asList(permissionTypeToPermission.mo232182f()));
        }
        if (!hashSet.isEmpty()) {
            getApiDependency().mo235022a(activity, getActionName(), hashSet, new AbstractC67709b.AbstractC67711b() {
                /* class com.larksuite.component.openplatform.core.plugin.authorization.ApiAuthorizePlugin.C245862 */

                @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                /* renamed from: a */
                public void mo87574a() {
                    linkedHashMap.put(Integer.valueOf(permissionTypeToPermission.mo232177a()), "ok");
                    ApiAuthorizePlugin.this.recursionRequestSysPermissions(linkedHashMap, activity, it, aVar);
                }

                @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                /* renamed from: a */
                public void mo87575a(String str) {
                    linkedHashMap.put(Integer.valueOf(permissionTypeToPermission.mo232177a()), "system auth deny");
                    ApiAuthorizePlugin.this.recursionRequestSysPermissions(linkedHashMap, activity, it, aVar);
                }
            });
        } else {
            recursionRequestSysPermissions(linkedHashMap, activity, it, aVar);
        }
    }

    private void callbackFail(C25906a aVar, int i, String str, org.json.JSONObject jSONObject, CountDownLatch countDownLatch) {
        ApiAuthorizeResponse apiAuthorizeResponse = new ApiAuthorizeResponse();
        fillFailedResponse(apiAuthorizeResponse, aVar, str);
        apiAuthorizeResponse.mErrorCode = i;
        apiAuthorizeResponse.data = transOrgJson(jSONObject);
        AbstractC25897h<ApiAuthorizeResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.callback(apiAuthorizeResponse);
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
