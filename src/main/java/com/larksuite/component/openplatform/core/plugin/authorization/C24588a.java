package com.larksuite.component.openplatform.core.plugin.authorization;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25103a;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"authorize"}, support = {AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.authorization.a */
public class C24588a extends AbstractC65797c {

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.authorization.a$a */
    public interface AbstractC24600a {
        /* renamed from: a */
        void mo87588a(LinkedHashMap<Integer, String> linkedHashMap);
    }

    /* renamed from: d */
    public String mo87585d() {
        return "authorize";
    }

    public C24588a() {
    }

    /* renamed from: a */
    public void mo87580a(final Set<C66578b.C66579a> set, LinkedHashMap<Integer, String> linkedHashMap) {
        final Activity currentActivity = mo230473f().getCurrentActivity();
        final AbstractC67733a aVar = (AbstractC67733a) mo230473f().findServiceByInterface(AbstractC67733a.class);
        final boolean b = aVar.mo50184b(11);
        try {
            CrossProcessDataEntity f = C67556a.m262949f();
            C66467o.C66470b bVar = f != null ? new C66467o.C66470b(f) : null;
            final String appId = mo230473f().getAppId();
            final String g = mo230475h().mo235054g(appId);
            if (TextUtils.isEmpty(g)) {
                AppBrandLogger.m52829e("tma_ApiAuthorizeCtrl", "session is empty");
                mo230493c("session is empty");
            } else if (!bVar.f167780f) {
                mo230493c("platform auth deny");
            } else {
                Observable.create(new Function<String>() {
                    /* class com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245945 */

                    /* renamed from: a */
                    public String fun() {
                        String str;
                        String str2 = AppbrandConstant.C65701b.m257612c().mo230140e() + appId;
                        if (AppbrandContext.getInst().getInitParams() != null) {
                            str = AppbrandContext.getInst().getInitParams().mo234510j();
                        } else {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            AppBrandLogger.m52828d("tma_ApiAuthorizeCtrl", "aid = ", str);
                            str2 = str2 + "&aid=" + str;
                        }
                        String d = C66434g.m259707a().mo231985a(str2 + "&session=" + g, C24588a.this.mo230473f()).mo48466d();
                        AppBrandLogger.m52828d("tma_ApiAuthorizeCtrl", d);
                        return d;
                    }
                }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber() {
                    /* class com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245924 */

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                    public void onError(Throwable th) {
                        C24588a.this.mo230493c("server error ");
                        AppBrandLogger.m52829e("tma_ApiAuthorizeCtrl", th);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076 A[ADDED_TO_REGION] */
                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onSuccess(java.lang.Object r15) {
                        /*
                        // Method dump skipped, instructions count: 164
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245924.onSuccess(java.lang.Object):void");
                    }
                });
            }
        } catch (Exception e) {
            mo230486a(e);
            AppBrandLogger.stacktrace(6, "tma_ApiAuthorizeCtrl", e.getStackTrace());
        }
    }

    /* renamed from: c */
    public static Boolean m89632c() {
        return false;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("authorize");
    }

    /* renamed from: b */
    public boolean mo87583b() {
        boolean z;
        List<String> c = C67556a.m262945c();
        String str = C67432a.m262319a(mo230473f()).getAppInfo().appId;
        if (c != null) {
            Iterator<String> it = c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.contentEquals(it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        AppBrandLogger.m52829e("tma_ApiAuthorizeCtrl", "isWhiteMiniApp == ", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: a */
    public List<String> mo87576a(LinkedHashMap<Integer, String> linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(entry.getKey().intValue(), mo230473f());
            if (permissionTypeToPermission != null) {
                arrayList.add(permissionTypeToPermission.mo232181e());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public JSONObject mo87584c(LinkedHashMap<Integer, String> linkedHashMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(entry.getKey().intValue(), mo230473f());
            if (permissionTypeToPermission != null) {
                jSONObject.put(permissionTypeToPermission.mo232181e(), entry.getValue());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private List<String> m89630a(String str) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject(str);
        AppBrandLogger.m52828d("tma_ApiAuthorizeCtrl", str);
        String optString = jSONObject.optString("scope");
        HashSet<String> hashSet = new HashSet();
        if (!TextUtils.isEmpty(optString)) {
            hashSet.addAll(Arrays.asList(optString.split(",")));
        }
        for (String str2 : hashSet) {
            if (HostDependManager.getInst().scopeToBrandPermission(str2, mo230473f()) == null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private Set<C66578b.C66579a> m89633d(String str) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject = new JSONObject(str);
        AppBrandLogger.m52828d("tma_ApiAuthorizeCtrl", str);
        String optString = jSONObject.optString("scope");
        HashSet<String> hashSet2 = new HashSet();
        if (!TextUtils.isEmpty(optString)) {
            hashSet2.addAll(Arrays.asList(optString.split(",")));
        }
        for (String str2 : hashSet2) {
            C66578b.C66579a scopeToBrandPermission = HostDependManager.getInst().scopeToBrandPermission(str2, mo230473f());
            if (scopeToBrandPermission != null) {
                hashSet.add(scopeToBrandPermission);
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public JSONObject mo87581b(LinkedHashMap<Integer, String> linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
                jSONObject2.put(HostDependManager.getInst().permissionTypeToPermission(entry.getKey().intValue(), mo230473f()).mo232181e(), entry.getValue());
            }
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_ApiAuthorizeCtrl", "requestPermissions", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo87578a(final C66578b.C66579a aVar) {
        final HashSet hashSet;
        if (aVar != null) {
            if (aVar.mo232182f() == null) {
                hashSet = new HashSet();
            } else {
                hashSet = new HashSet(Arrays.asList(aVar.mo232182f()));
            }
            final Activity currentActivity = mo230473f().getCurrentActivity();
            final AbstractC67733a aVar2 = (AbstractC67733a) mo230473f().findServiceByInterface(AbstractC67733a.class);
            aVar2.mo235103a(currentActivity, mo87585d(), aVar, new AbstractC67540b() {
                /* class com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245977 */

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87199a() {
                    if (!hashSet.isEmpty()) {
                        C24588a.this.mo230475h().mo235022a(currentActivity, C24588a.this.mo87585d(), hashSet, new AbstractC67709b.AbstractC67711b() {
                            /* class com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245977.C245981 */

                            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                            /* renamed from: a */
                            public void mo87574a() {
                                C66020b.m258530a("mp_auth_alert_result", C24588a.this.mo230473f()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "success").mo231092a();
                                C25103a.m90432a(C24588a.this.mo230473f().getAppId(), AppbrandApplicationImpl.getInst(C24588a.this.mo230473f()).getAppInfo().appName, C24588a.this.mo230473f().getAppType(), aVar.mo232181e(), "approved");
                                C24588a.this.mo230494j();
                            }

                            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                            /* renamed from: a */
                            public void mo87575a(String str) {
                                C66020b.m258530a("mp_auth_alert_result", C24588a.this.mo230473f()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                                C25103a.m90432a(C24588a.this.mo230473f().getAppId(), AppbrandApplicationImpl.getInst(C24588a.this.mo230473f()).getAppInfo().appName, C24588a.this.mo230473f().getAppType(), aVar.mo232181e(), "rejected");
                                C24588a.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                            }
                        });
                        return;
                    }
                    C66020b.m258530a("mp_auth_alert_result", C24588a.this.mo230473f()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "success").mo231092a();
                    C25103a.m90432a(C24588a.this.mo230473f().getAppId(), AppbrandApplicationImpl.getInst(C24588a.this.mo230473f()).getAppInfo().appName, C24588a.this.mo230473f().getAppType(), aVar.mo232181e(), "approved");
                    C24588a.this.mo230494j();
                }

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87200a(String str) {
                    C66020b.m258530a("mp_auth_alert_result", C24588a.this.mo230473f()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                    C25103a.m90432a(C24588a.this.mo230473f().getAppId(), AppbrandApplicationImpl.getInst(C24588a.this.mo230473f()).getAppInfo().appName, C24588a.this.mo230473f().getAppType(), aVar.mo232181e(), "rejected");
                    C24588a.this.mo230481a(ApiCode.GENERAL_USER_AUTH_DENIED);
                }
            });
            return;
        }
        mo230481a(ApiCode.AUTHORIZE_INVALID_SCOPE);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        final boolean z;
        String d = bVar.mo234988d();
        if (!TextUtils.isEmpty(d)) {
            try {
                C25103a.m90431a(mo230473f().getAppId(), AppbrandApplicationImpl.getInst(mo230473f()).getAppInfo().appName, mo230473f().getAppType(), new JSONObject(d).optString("scope"));
                List<String> a = m89630a(d);
                if (a.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str : a) {
                        jSONObject2.put(str, "invalid scope");
                    }
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
                    mo87577a(ApiCode.AUTHORIZE_AUTH_DENY, jSONObject2);
                    return;
                }
                final Set<C66578b.C66579a> d2 = m89633d(d);
                boolean z2 = false;
                if (d2.size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                final LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
                ((AbstractC67733a) mo230473f().findServiceByInterface(AbstractC67733a.class)).mo235102a(d2, linkedHashMap);
                if (z) {
                    for (C66578b.C66579a aVar : d2) {
                        if (C66578b.C66579a.m260128m(mo230473f()).contains(aVar)) {
                            mo230481a(ApiCode.AUTHORIZE_INVALID_SCOPE);
                            return;
                        }
                    }
                }
                if (d2.size() <= 0) {
                    z2 = true;
                }
                if (z2) {
                    m89631a(z, linkedHashMap);
                } else {
                    Observable.create(new Function<Boolean>() {
                        /* class com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245902 */

                        /* renamed from: a */
                        public Boolean fun() {
                            return C24588a.m89632c();
                        }
                    }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
                        /* class com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245891 */

                        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                        public void onError(Throwable th) {
                            C24588a.this.mo87578a((C66578b.C66579a) d2.iterator().next());
                            AppBrandLogger.m52829e("tma_ApiAuthorizeCtrl", th);
                        }

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            if (bool != Boolean.TRUE) {
                                C24588a.this.mo87578a((C66578b.C66579a) d2.iterator().next());
                            } else if (z) {
                                if (!C67556a.m262944b()) {
                                    C24588a.this.mo87582b(d2, linkedHashMap);
                                } else if (C24588a.this.mo87583b()) {
                                    C24588a.this.mo87582b(d2, linkedHashMap);
                                } else {
                                    C24588a.this.mo230481a(ApiCode.AUTHORIZE_INVALID_SCOPE);
                                }
                            } else if (((C66578b.C66579a) d2.iterator().next()).equals(C66578b.C66579a.m260109a(C24588a.this.mo230473f()))) {
                                C24588a.this.mo87580a(d2, linkedHashMap);
                            } else {
                                C24588a.this.mo87582b(d2, linkedHashMap);
                            }
                        }
                    });
                }
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(6, "tma_ApiAuthorizeCtrl", e.getStackTrace());
                mo230481a(ApiCode.GENERAL_JSON_ERROR);
            }
        } else {
            mo230493c(ApiCallResultHelper.generateDataNullExtraInfo("mArgs"));
        }
    }

    public C24588a(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    public void mo87577a(ApiCode apiCode, JSONObject jSONObject) {
        mo230483a(apiCode, jSONObject, apiCode.msg);
    }

    /* renamed from: b */
    public void mo87582b(Set<C66578b.C66579a> set, final LinkedHashMap<Integer, String> linkedHashMap) {
        final Activity currentActivity = mo230473f().getCurrentActivity();
        final AbstractC67733a aVar = (AbstractC67733a) mo230473f().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235101a(currentActivity, mo87585d(), set, linkedHashMap, new AbstractC67539a() {
            /* class com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245956 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: a */
            public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
                    if (entry.getValue().equals("ok")) {
                        hashSet.add(entry.getKey());
                    }
                }
                C24588a.this.mo87579a(linkedHashMap, currentActivity, hashSet.iterator(), new AbstractC24600a() {
                    /* class com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245956.C245961 */

                    @Override // com.larksuite.component.openplatform.core.plugin.authorization.C24588a.AbstractC24600a
                    /* renamed from: a */
                    public void mo87588a(LinkedHashMap<Integer, String> linkedHashMap) {
                        String str;
                        String str2;
                        if (linkedHashMap.size() > 1) {
                            str = "multiple";
                        } else if (linkedHashMap.keySet().iterator().hasNext()) {
                            str = aVar.mo50175a(linkedHashMap.keySet().iterator().next().intValue());
                        } else {
                            str = null;
                        }
                        if (linkedHashMap.size() == 1) {
                            str2 = "authorize:fail auth deny";
                        } else {
                            str2 = "authorize:fail";
                        }
                        String str3 = "mp_reject";
                        String str4 = "fail";
                        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
                            if (entry.getValue().equals("ok")) {
                                str4 = "success";
                                str2 = "authorize:ok";
                            }
                            if (entry.getValue().equals("system auth deny")) {
                                str3 = "system_reject";
                            }
                        }
                        C66020b.C66021a a = C66020b.m258530a("mp_auth_alert_result", C24588a.this.mo230473f()).mo231090a("alert_type", "new").mo231090a("auth_type", str).mo231090a("result", str4);
                        if (str4.contentEquals("fail")) {
                            a.mo231090a("fail_type", str3);
                        }
                        a.mo231092a();
                        List<String> a2 = C24588a.this.mo87576a(linkedHashMap);
                        if ("authorize:ok".equals(str2)) {
                            for (String str5 : a2) {
                                C25103a.m90432a(C24588a.this.mo230473f().getAppId(), AppbrandApplicationImpl.getInst(C24588a.this.mo230473f()).getAppInfo().appName, C24588a.this.mo230473f().getAppType(), str5, "approved");
                            }
                            C24588a.this.mo230492b(C24588a.this.mo87581b(linkedHashMap));
                            return;
                        }
                        for (String str6 : a2) {
                            C25103a.m90432a(C24588a.this.mo230473f().getAppId(), AppbrandApplicationImpl.getInst(C24588a.this.mo230473f()).getAppInfo().appName, C24588a.this.mo230473f().getAppType(), str6, "rejected");
                        }
                        C24588a.this.mo87577a(ApiCode.AUTHORIZE_AUTH_DENY, C24588a.this.mo87581b(linkedHashMap));
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: b */
            public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                String str;
                if (linkedHashMap.size() > 1) {
                    str = "multiple";
                } else if (linkedHashMap.keySet().iterator().hasNext()) {
                    str = aVar.mo50175a(linkedHashMap.keySet().iterator().next().intValue());
                } else {
                    str = null;
                }
                C66020b.m258530a("mp_auth_alert_result", C24588a.this.mo230473f()).mo231090a("alert_type", "new").mo231090a("auth_type", str).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                for (String str2 : C24588a.this.mo87576a(linkedHashMap)) {
                    C25103a.m90432a(C24588a.this.mo230473f().getAppId(), AppbrandApplicationImpl.getInst(C24588a.this.mo230473f()).getAppInfo().appName, C24588a.this.mo230473f().getAppType(), str2, "rejected");
                }
                C24588a.this.mo87577a(ApiCode.AUTHORIZE_AUTH_DENY, C24588a.this.mo87581b(linkedHashMap));
            }
        }, null);
    }

    /* renamed from: a */
    private void m89631a(boolean z, final LinkedHashMap<Integer, String> linkedHashMap) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            if (entry.getValue().contentEquals("system auth deny")) {
                hashSet.add(entry.getKey());
            }
        }
        mo87579a(linkedHashMap, mo230473f().getCurrentActivity(), hashSet.iterator(), new AbstractC24600a() {
            /* class com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245913 */

            @Override // com.larksuite.component.openplatform.core.plugin.authorization.C24588a.AbstractC24600a
            /* renamed from: a */
            public void mo87588a(LinkedHashMap<Integer, String> linkedHashMap) {
                boolean z = true;
                try {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) ((Map.Entry) it.next()).getValue()).contentEquals("ok")) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (linkedHashMap.size() > 0) {
                        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C24588a.this.mo87584c(linkedHashMap));
                    }
                    List<String> a = C24588a.this.mo87576a(linkedHashMap);
                    if (z) {
                        for (String str : a) {
                            C25103a.m90432a(C24588a.this.mo230473f().getAppId(), AppbrandApplicationImpl.getInst(C24588a.this.mo230473f()).getAppInfo().appName, C24588a.this.mo230473f().getAppType(), str, "rejected");
                        }
                        C24588a.this.mo87577a(ApiCode.AUTHORIZE_AUTH_DENY, jSONObject);
                        return;
                    }
                    for (String str2 : a) {
                        C25103a.m90432a(C24588a.this.mo230473f().getAppId(), AppbrandApplicationImpl.getInst(C24588a.this.mo230473f()).getAppInfo().appName, C24588a.this.mo230473f().getAppType(), str2, "approved");
                    }
                    C24588a.this.mo230492b(jSONObject);
                } catch (JSONException e) {
                    AppBrandLogger.stacktrace(6, "tma_ApiAuthorizeCtrl", e.getStackTrace());
                    C24588a.this.mo230481a(ApiCode.GENERAL_JSON_ERROR);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo87579a(final LinkedHashMap<Integer, String> linkedHashMap, final Activity activity, final Iterator<Integer> it, final AbstractC24600a aVar) {
        HashSet hashSet;
        if (!it.hasNext()) {
            aVar.mo87588a(linkedHashMap);
            return;
        }
        final C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(it.next().intValue(), mo230473f());
        if (permissionTypeToPermission.mo232182f() == null) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(Arrays.asList(permissionTypeToPermission.mo232182f()));
        }
        if (!hashSet.isEmpty()) {
            mo230475h().mo235022a(activity, mo87585d(), hashSet, new AbstractC67709b.AbstractC67711b() {
                /* class com.larksuite.component.openplatform.core.plugin.authorization.C24588a.C245998 */

                @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                /* renamed from: a */
                public void mo87574a() {
                    linkedHashMap.put(Integer.valueOf(permissionTypeToPermission.mo232177a()), "ok");
                    C24588a.this.mo87579a(linkedHashMap, activity, it, aVar);
                }

                @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                /* renamed from: a */
                public void mo87575a(String str) {
                    linkedHashMap.put(Integer.valueOf(permissionTypeToPermission.mo232177a()), "system auth deny");
                    C24588a.this.mo87579a(linkedHashMap, activity, it, aVar);
                }
            });
        } else {
            mo87579a(linkedHashMap, activity, it, aVar);
        }
    }
}
