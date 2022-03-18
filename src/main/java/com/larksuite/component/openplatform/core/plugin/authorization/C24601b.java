package com.larksuite.component.openplatform.core.plugin.authorization;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25103a;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.authorization.b */
public class C24601b extends ApiHandler {

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.authorization.b$a */
    public interface AbstractC24613a {
        /* renamed from: a */
        void mo87603a(LinkedHashMap<Integer, String> linkedHashMap);
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "authorize";
    }

    public C24601b() {
    }

    /* renamed from: a */
    public boolean mo87597a() {
        boolean z;
        List<String> c = C67556a.m262945c();
        String str = C67432a.m262319a(getAppContext()).getAppInfo().appId;
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

    /* renamed from: b */
    public static Boolean m89664b() {
        return false;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        final boolean z;
        if (!TextUtils.isEmpty(this.mArgs)) {
            try {
                C25103a.m90431a(getAppContext().getAppId(), AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().appName, getAppContext().getAppType(), new JSONObject(this.mArgs).optString("scope"));
                List<String> a = m89662a(this.mArgs);
                if (a.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str : a) {
                        jSONObject2.put(str, "invalid scope");
                    }
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
                    mo87593a(ApiCode.AUTHORIZE_AUTH_DENY, jSONObject2);
                    return;
                }
                final Set<C66578b.C66579a> b = m89665b(this.mArgs);
                boolean z2 = false;
                if (b.size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                final LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
                ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo235102a(b, linkedHashMap);
                if (z) {
                    for (C66578b.C66579a aVar : b) {
                        if (C66578b.C66579a.m260128m(getAppContext()).contains(aVar)) {
                            callbackFail(ApiCode.AUTHORIZE_INVALID_SCOPE);
                            return;
                        }
                    }
                }
                if (b.size() <= 0) {
                    z2 = true;
                }
                if (z2) {
                    m89663a(z, linkedHashMap);
                } else {
                    Observable.create(new Function<Boolean>() {
                        /* class com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246032 */

                        /* renamed from: a */
                        public Boolean fun() {
                            return C24601b.m89664b();
                        }
                    }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
                        /* class com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246021 */

                        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                        public void onError(Throwable th) {
                            C24601b.this.mo87594a((C66578b.C66579a) b.iterator().next());
                            AppBrandLogger.m52829e("tma_ApiAuthorizeCtrl", th);
                        }

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            if (bool != Boolean.TRUE) {
                                C24601b.this.mo87594a((C66578b.C66579a) b.iterator().next());
                            } else if (z) {
                                if (!C67556a.m262944b()) {
                                    C24601b.this.mo87599b(b, linkedHashMap);
                                } else if (C24601b.this.mo87597a()) {
                                    C24601b.this.mo87599b(b, linkedHashMap);
                                } else {
                                    C24601b.this.callbackFail(ApiCode.AUTHORIZE_INVALID_SCOPE);
                                }
                            } else if (((C66578b.C66579a) b.iterator().next()).equals(C66578b.C66579a.m260109a(C24601b.this.getAppContext()))) {
                                C24601b.this.mo87596a(b, linkedHashMap);
                            } else {
                                C24601b.this.mo87599b(b, linkedHashMap);
                            }
                        }
                    });
                }
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(6, "tma_ApiAuthorizeCtrl", e.getStackTrace());
                callbackFail(ApiCode.GENERAL_JSON_ERROR);
            }
        } else {
            callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("mArgs"));
        }
    }

    /* renamed from: a */
    public List<String> mo87592a(LinkedHashMap<Integer, String> linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(entry.getKey().intValue(), getAppContext());
            if (permissionTypeToPermission != null) {
                arrayList.add(permissionTypeToPermission.mo232181e());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public JSONObject mo87600c(LinkedHashMap<Integer, String> linkedHashMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(entry.getKey().intValue(), getAppContext());
            if (permissionTypeToPermission != null) {
                jSONObject.put(permissionTypeToPermission.mo232181e(), entry.getValue());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private List<String> m89662a(String str) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject(str);
        AppBrandLogger.m52828d("tma_ApiAuthorizeCtrl", str);
        String optString = jSONObject.optString("scope");
        HashSet<String> hashSet = new HashSet();
        if (!TextUtils.isEmpty(optString)) {
            hashSet.addAll(Arrays.asList(optString.split(",")));
        }
        for (String str2 : hashSet) {
            if (HostDependManager.getInst().scopeToBrandPermission(str2, getAppContext()) == null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private Set<C66578b.C66579a> m89665b(String str) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject = new JSONObject(str);
        AppBrandLogger.m52828d("tma_ApiAuthorizeCtrl", str);
        String optString = jSONObject.optString("scope");
        HashSet<String> hashSet2 = new HashSet();
        if (!TextUtils.isEmpty(optString)) {
            hashSet2.addAll(Arrays.asList(optString.split(",")));
        }
        for (String str2 : hashSet2) {
            C66578b.C66579a scopeToBrandPermission = HostDependManager.getInst().scopeToBrandPermission(str2, getAppContext());
            if (scopeToBrandPermission != null) {
                hashSet.add(scopeToBrandPermission);
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public JSONObject mo87598b(LinkedHashMap<Integer, String> linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
                jSONObject2.put(HostDependManager.getInst().permissionTypeToPermission(entry.getKey().intValue(), getAppContext()).mo232181e(), entry.getValue());
            }
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_ApiAuthorizeCtrl", "requestPermissions", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo87594a(final C66578b.C66579a aVar) {
        final HashSet hashSet;
        if (aVar != null) {
            if (aVar.mo232182f() == null) {
                hashSet = new HashSet();
            } else {
                hashSet = new HashSet(Arrays.asList(aVar.mo232182f()));
            }
            final Activity currentActivity = getAppContext().getCurrentActivity();
            final AbstractC67733a aVar2 = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
            aVar2.mo235103a(currentActivity, getActionName(), aVar, new AbstractC67540b() {
                /* class com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246107 */

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87199a() {
                    if (!hashSet.isEmpty()) {
                        C66588h.m260183a().mo232189a(currentActivity, hashSet, new AbstractC66590i() {
                            /* class com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246107.C246111 */

                            @Override // com.tt.miniapp.permission.AbstractC66590i
                            /* renamed from: a */
                            public void mo48890a() {
                                C66020b.m258530a("mp_auth_alert_result", C24601b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "success").mo231092a();
                                C25103a.m90432a(C24601b.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(C24601b.this.getAppContext()).getAppInfo().appName, C24601b.this.getAppContext().getAppType(), aVar.mo232181e(), "approved");
                                C24601b.this.callbackOk();
                            }

                            @Override // com.tt.miniapp.permission.AbstractC66590i
                            /* renamed from: a */
                            public void mo48891a(String str) {
                                C66020b.m258530a("mp_auth_alert_result", C24601b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                                C25103a.m90432a(C24601b.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(C24601b.this.getAppContext()).getAppInfo().appName, C24601b.this.getAppContext().getAppType(), aVar.mo232181e(), "rejected");
                                C24601b.this.callbackFail(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                            }
                        });
                        return;
                    }
                    C66020b.m258530a("mp_auth_alert_result", C24601b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "success").mo231092a();
                    C25103a.m90432a(C24601b.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(C24601b.this.getAppContext()).getAppInfo().appName, C24601b.this.getAppContext().getAppType(), aVar.mo232181e(), "approved");
                    C24601b.this.callbackOk();
                }

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87200a(String str) {
                    C66020b.m258530a("mp_auth_alert_result", C24601b.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar2.mo50175a(aVar.mo232177a())).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                    C25103a.m90432a(C24601b.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(C24601b.this.getAppContext()).getAppInfo().appName, C24601b.this.getAppContext().getAppType(), aVar.mo232181e(), "rejected");
                    C24601b.this.callbackFail(ApiCode.GENERAL_USER_AUTH_DENIED);
                }
            });
            return;
        }
        callbackFail(ApiCode.AUTHORIZE_INVALID_SCOPE);
    }

    /* renamed from: a */
    public void mo87593a(ApiCode apiCode, JSONObject jSONObject) {
        callbackFail(apiCode.code, apiCode.msg, jSONObject);
    }

    /* renamed from: b */
    public void mo87599b(Set<C66578b.C66579a> set, final LinkedHashMap<Integer, String> linkedHashMap) {
        final Activity currentActivity = getAppContext().getCurrentActivity();
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235101a(currentActivity, getActionName(), set, linkedHashMap, new AbstractC67539a() {
            /* class com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246086 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: a */
            public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
                    if (entry.getValue().equals("ok")) {
                        hashSet.add(entry.getKey());
                    }
                }
                C24601b.this.mo87595a(linkedHashMap, currentActivity, hashSet.iterator(), new AbstractC24613a() {
                    /* class com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246086.C246091 */

                    @Override // com.larksuite.component.openplatform.core.plugin.authorization.C24601b.AbstractC24613a
                    /* renamed from: a */
                    public void mo87603a(LinkedHashMap<Integer, String> linkedHashMap) {
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
                        C66020b.C66021a a = C66020b.m258530a("mp_auth_alert_result", C24601b.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", str).mo231090a("result", str4);
                        if (str4.contentEquals("fail")) {
                            a.mo231090a("fail_type", str3);
                        }
                        a.mo231092a();
                        List<String> a2 = C24601b.this.mo87592a(linkedHashMap);
                        if ("authorize:ok".equals(str2)) {
                            for (String str5 : a2) {
                                C25103a.m90432a(C24601b.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(C24601b.this.getAppContext()).getAppInfo().appName, C24601b.this.getAppContext().getAppType(), str5, "approved");
                            }
                            C24601b.this.callbackOk(C24601b.this.mo87598b(linkedHashMap));
                            return;
                        }
                        for (String str6 : a2) {
                            C25103a.m90432a(C24601b.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(C24601b.this.getAppContext()).getAppInfo().appName, C24601b.this.getAppContext().getAppType(), str6, "rejected");
                        }
                        C24601b.this.mo87593a(ApiCode.AUTHORIZE_AUTH_DENY, C24601b.this.mo87598b(linkedHashMap));
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
                C66020b.m258530a("mp_auth_alert_result", C24601b.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", str).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                for (String str2 : C24601b.this.mo87592a(linkedHashMap)) {
                    C25103a.m90432a(C24601b.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(C24601b.this.getAppContext()).getAppInfo().appName, C24601b.this.getAppContext().getAppType(), str2, "rejected");
                }
                C24601b.this.mo87593a(ApiCode.AUTHORIZE_AUTH_DENY, C24601b.this.mo87598b(linkedHashMap));
            }
        }, null);
    }

    /* renamed from: a */
    private void m89663a(boolean z, final LinkedHashMap<Integer, String> linkedHashMap) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            if (entry.getValue().contentEquals("system auth deny")) {
                hashSet.add(entry.getKey());
            }
        }
        mo87595a(linkedHashMap, getAppContext().getCurrentActivity(), hashSet.iterator(), new AbstractC24613a() {
            /* class com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246043 */

            @Override // com.larksuite.component.openplatform.core.plugin.authorization.C24601b.AbstractC24613a
            /* renamed from: a */
            public void mo87603a(LinkedHashMap<Integer, String> linkedHashMap) {
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
                        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C24601b.this.mo87600c(linkedHashMap));
                    }
                    List<String> a = C24601b.this.mo87592a(linkedHashMap);
                    if (z) {
                        for (String str : a) {
                            C25103a.m90432a(C24601b.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(C24601b.this.getAppContext()).getAppInfo().appName, C24601b.this.getAppContext().getAppType(), str, "rejected");
                        }
                        C24601b.this.mo87593a(ApiCode.AUTHORIZE_AUTH_DENY, jSONObject);
                        return;
                    }
                    for (String str2 : a) {
                        C25103a.m90432a(C24601b.this.getAppContext().getAppId(), AppbrandApplicationImpl.getInst(C24601b.this.getAppContext()).getAppInfo().appName, C24601b.this.getAppContext().getAppType(), str2, "approved");
                    }
                    C24601b.this.callbackOk(jSONObject);
                } catch (JSONException e) {
                    AppBrandLogger.stacktrace(6, "tma_ApiAuthorizeCtrl", e.getStackTrace());
                    C24601b.this.callbackFail(ApiCode.GENERAL_JSON_ERROR);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo87596a(final Set<C66578b.C66579a> set, LinkedHashMap<Integer, String> linkedHashMap) {
        C66467o.C66470b bVar;
        final Activity currentActivity = getAppContext().getCurrentActivity();
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        final boolean b = aVar.mo50184b(11);
        try {
            CrossProcessDataEntity f = C67556a.m262949f();
            if (f != null) {
                bVar = new C66467o.C66470b(f);
            } else {
                bVar = null;
            }
            final String a = C66612a.m260219a(C67432a.m262319a(getAppContext()).getAppInfo().appId);
            if (TextUtils.isEmpty(a)) {
                AppBrandLogger.m52829e("tma_ApiAuthorizeCtrl", "session is empty");
                callbackExtraInfoMsg(false, "session is empty");
            } else if (!bVar.f167780f) {
                callbackExtraInfoMsg(false, "platform auth deny");
            } else {
                Observable.create(new Function<String>() {
                    /* class com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246075 */

                    /* renamed from: a */
                    public String fun() {
                        String str;
                        String str2 = AppbrandConstant.C65701b.m257612c().mo230140e() + C67432a.m262319a(C24601b.this.getAppContext()).getAppInfo().appId;
                        if (AppbrandContext.getInst().getInitParams() != null) {
                            str = AppbrandContext.getInst().getInitParams().mo234510j();
                        } else {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            AppBrandLogger.m52828d("tma_ApiAuthorizeCtrl", "aid = ", str);
                            str2 = str2 + "&aid=" + str;
                        }
                        String d = C66434g.m259707a().mo231985a(str2 + "&session=" + a, C24601b.this.getAppContext()).mo48466d();
                        AppBrandLogger.m52828d("tma_ApiAuthorizeCtrl", d);
                        return d;
                    }
                }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber() {
                    /* class com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246054 */

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                    public void onError(Throwable th) {
                        C24601b.this.callbackExtraInfoMsg(false, "server error ");
                        AppBrandLogger.m52829e("tma_ApiAuthorizeCtrl", th);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d A[ADDED_TO_REGION] */
                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onSuccess(java.lang.Object r18) {
                        /*
                        // Method dump skipped, instructions count: 171
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246054.onSuccess(java.lang.Object):void");
                    }
                });
            }
        } catch (Exception e) {
            callbackDefaultMsg(false);
            AppBrandLogger.stacktrace(6, "tma_ApiAuthorizeCtrl", e.getStackTrace());
        }
    }

    public C24601b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    /* renamed from: a */
    public void mo87595a(final LinkedHashMap<Integer, String> linkedHashMap, final Activity activity, final Iterator<Integer> it, final AbstractC24613a aVar) {
        HashSet hashSet;
        if (!it.hasNext()) {
            aVar.mo87603a(linkedHashMap);
            return;
        }
        final C66578b.C66579a permissionTypeToPermission = HostDependManager.getInst().permissionTypeToPermission(it.next().intValue(), getAppContext());
        if (permissionTypeToPermission.mo232182f() == null) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(Arrays.asList(permissionTypeToPermission.mo232182f()));
        }
        if (!hashSet.isEmpty()) {
            C66588h.m260183a().mo232189a(activity, hashSet, new AbstractC66590i() {
                /* class com.larksuite.component.openplatform.core.plugin.authorization.C24601b.C246128 */

                @Override // com.tt.miniapp.permission.AbstractC66590i
                /* renamed from: a */
                public void mo48890a() {
                    linkedHashMap.put(Integer.valueOf(permissionTypeToPermission.mo232177a()), "ok");
                    C24601b.this.mo87595a(linkedHashMap, activity, it, aVar);
                }

                @Override // com.tt.miniapp.permission.AbstractC66590i
                /* renamed from: a */
                public void mo48891a(String str) {
                    linkedHashMap.put(Integer.valueOf(permissionTypeToPermission.mo232177a()), "system auth deny");
                    C24601b.this.mo87595a(linkedHashMap, activity, it, aVar);
                }
            });
        } else {
            mo87595a(linkedHashMap, activity, it, aVar);
        }
    }
}
