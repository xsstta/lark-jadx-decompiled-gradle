package com.bytedance.ee.larkbrand.permission;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.google.firebase.messaging.Constants;
import com.p063a.p064a.p065a.p066a.C1713b;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import com.tt.refer.p3400a.p3412i.AbstractC67735c;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AbsPermissionSyncWrapper extends AbstractC67457c implements AbstractC67735c {

    /* renamed from: a */
    private AbstractC67734b f35166a;

    /* renamed from: b */
    private AbstractC67733a f35167b;

    /* renamed from: c */
    private String f35168c;

    public enum SyncAuthState {
        SUCCESS,
        NETWORK_ERROR,
        RESULT_BIZ_FAIL,
        RESULT_DATA_INVALID,
        RESULT_DECRYPT_ERROR,
        AUTH_HAS_NO_SESSION
    }

    /* renamed from: a */
    public abstract String mo49505a();

    /* renamed from: a */
    public abstract void mo49506a(SyncAuthState syncAuthState, Object... objArr);

    /* renamed from: b */
    public abstract String mo49512b();

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0209 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x01db */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r15v1, types: [org.json.JSONObject, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // com.tt.refer.p3400a.p3412i.AbstractC67735c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49510a(java.lang.String r19, org.json.JSONObject r20) {
        /*
        // Method dump skipped, instructions count: 647
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.mo49510a(java.lang.String, org.json.JSONObject):void");
    }

    public AbsPermissionSyncWrapper(IAppContext iAppContext) {
        super(iAppContext);
        this.f35166a = (AbstractC67734b) iAppContext.findServiceByInterface(AbstractC67734b.class);
        this.f35167b = (AbstractC67733a) iAppContext.findServiceByInterface(AbstractC67733a.class);
    }

    /* renamed from: a */
    public void mo49507a(AbstractC13298i iVar, boolean z) {
        if (iVar != null) {
            if (z) {
                iVar.mo49531a();
            } else {
                iVar.mo49532b();
            }
        }
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67735c
    /* renamed from: a */
    public void mo49509a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f35168c = str2;
        }
        mo49508a(str, (AbstractC13298i) null);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67735c
    /* renamed from: a */
    public void mo49508a(final String str, final AbstractC13298i iVar) {
        String str2 = C13047a.C13049b.m53532a() + "/api/GetScopes";
        HashMap hashMap = new HashMap();
        if (ProcessUtil.isMainProcess(this.f170082d.getApplicationContext())) {
            hashMap.put("Cookie", "session=" + LarkExtensionManager.getInstance().getExtension().mo49565b());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appID", str);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("AbsPermissionSyncWrapper", "jsonException", e);
        }
        C12843b.m53038a(str2, hashMap, jSONObject, this.f170082d).subscribe(new Consumer<String>() {
            /* class com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.C132771 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                if (TextUtils.isEmpty(str)) {
                    C1713b.m7631a("AbsPermissionSyncWrapper", "response is empty");
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                C1713b.m7632b("AbsPermissionSyncWrapper", "response:" + str);
                int optInt = jSONObject.optInt("code");
                if (optInt != 0) {
                    C1713b.m7631a("AbsPermissionSyncWrapper", "Request error");
                    AbsPermissionSyncWrapper.this.mo49506a(SyncAuthState.RESULT_BIZ_FAIL, Integer.valueOf(optInt));
                    AbsPermissionSyncWrapper.this.mo49507a(iVar, false);
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject == null) {
                    C1713b.m7631a("AbsPermissionSyncWrapper", "data is null");
                    AbsPermissionSyncWrapper.this.mo49506a(SyncAuthState.RESULT_DATA_INVALID, new Object[0]);
                    AbsPermissionSyncWrapper.this.mo49507a(iVar, false);
                    return;
                }
                AbsPermissionSyncWrapper.this.mo49510a(str, optJSONObject);
                AbsPermissionSyncWrapper.this.mo49506a(SyncAuthState.SUCCESS, new Object[0]);
                AbsPermissionSyncWrapper.this.mo49507a(iVar, true);
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.C132782 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                AbsPermissionSyncWrapper.this.mo49506a(SyncAuthState.NETWORK_ERROR, th.getMessage());
                AbsPermissionSyncWrapper.this.mo49507a(iVar, false);
                C1713b.m7631a("AbsPermissionSyncWrapper", " post syncAuth error ," + th.getMessage());
            }
        });
    }

    /* renamed from: a */
    public void mo49511a(JSONObject jSONObject, final AbstractC13298i iVar) {
        if (TextUtils.isEmpty(this.f35168c)) {
            mo49506a(SyncAuthState.AUTH_HAS_NO_SESSION, new Object[0]);
        } else {
            try {
                jSONObject.put(mo49505a(), this.f35168c);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("AbsPermissionSyncWrapper", "JSONException", e);
            }
        }
        String str = C13047a.C13049b.m53532a() + mo49512b();
        AppBrandLogger.m52830i("AbsPermissionSyncWrapper", "post SyncClientAuth start ");
        final long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap.put("domain_alias", "open");
        }
        C12843b.m53039a(str, (Map<String, String>) hashMap, jSONObject, this.f170082d, true).subscribe(new Consumer<String>() {
            /* class com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.C132793 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                AppBrandLogger.m52830i("AbsPermissionSyncWrapper", " post SyncClientAuth ,response " + str);
                JSONObject jSONObject = new JSONObject(str);
                C13377u.m54414a("success", System.currentTimeMillis() - currentTimeMillis, jSONObject.optInt("error"), jSONObject.optString("message"), AbsPermissionSyncWrapper.this.f170082d);
                AbsPermissionSyncWrapper.this.mo49507a(iVar, true);
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.C132804 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                AppBrandLogger.m52829e("AbsPermissionSyncWrapper", " post SyncClientAuth error ," + th.getMessage());
                C13377u.m54414a("fail", System.currentTimeMillis() - currentTimeMillis, -1, th.getMessage(), AbsPermissionSyncWrapper.this.f170082d);
                AbsPermissionSyncWrapper.this.mo49507a(iVar, false);
            }
        });
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67735c
    /* renamed from: b */
    public void mo49513b(String str, AbstractC13298i iVar) throws JSONException {
        String a;
        if (!TextUtils.isEmpty(str)) {
            this.f35168c = str;
        }
        AppBrandLogger.m52830i("AbsPermissionSyncWrapper", "start sync local permission to service ");
        JSONObject jSONObject = new JSONObject();
        Object b = LarkExtensionManager.getInstance().getExtension().mo49565b();
        jSONObject.put("appVersion", C67043j.m261283f(AppbrandContext.getInst().getApplicationContext()));
        jSONObject.put("appID", this.f170082d.getAppId());
        jSONObject.put("sessionID", b);
        JSONObject jSONObject2 = new JSONObject();
        for (C66578b.C66579a aVar : C13282a.m54093a(this.f170082d)) {
            if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.scope.add_user_info") || aVar != C66578b.C66579a.m260109a(this.f170082d)) {
                boolean b2 = this.f35167b.mo50184b(aVar.mo232177a());
                AppBrandLogger.m52830i("local permission:" + aVar.mo232177a() + " hasRequestPermission:" + b2, new Object[0]);
                if (b2 && (a = C13296g.m54138a(aVar.mo232177a())) != null) {
                    boolean a2 = this.f35167b.mo50179a(aVar.mo232177a(), false);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("auth", a2);
                    if (this.f35166a.mo50192a(aVar.mo232177a())) {
                        jSONObject3.put("modifyTime", this.f35166a.mo50198b(aVar.mo232177a()));
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f35166a.mo50187a(aVar.mo232177a(), currentTimeMillis);
                        jSONObject3.put("modifyTime", currentTimeMillis);
                        AppBrandLogger.m52830i("AbsPermissionSyncWrapper", "local permission " + a + " add current time " + currentTimeMillis);
                    }
                    jSONObject2.put(a, jSONObject3);
                    AppBrandLogger.m52830i("AbsPermissionSyncWrapper", " sync local permission to service, permission: " + a + " permissioninfo:" + jSONObject3.toString());
                }
            }
        }
        jSONObject.put("userAuthScope", jSONObject2);
        if (jSONObject2.length() > 0) {
            mo49511a(jSONObject, iVar);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x00b1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0185 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: org.json.JSONObject */
    /* JADX DEBUG: Multi-variable search result rejected for r6v14, resolved type: java.lang.StringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [long] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m54073a(org.json.JSONObject r18, java.lang.String r19, java.util.List<java.lang.String> r20) {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.m54073a(org.json.JSONObject, java.lang.String, java.util.List):void");
    }

    /* renamed from: a */
    private void m54074a(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) {
        C66578b.C66579a a = C13296g.m54137a(str, this.f170082d);
        if (jSONObject2 != null && a != null && jSONObject2.has("auth")) {
            if (jSONObject2.has("modify_time") || jSONObject2.has("modifyTime")) {
                try {
                    boolean z = jSONObject2.getBoolean("auth");
                    long optLong = jSONObject2.optLong("modify_time", 0);
                    if (optLong == 0) {
                        optLong = jSONObject2.optLong("modifyTime", 0);
                    }
                    boolean a2 = this.f35166a.mo50193a(a.mo232177a(), str2);
                    AppBrandLogger.m52830i("AbsPermissionSyncWrapper", "comparePermission --- net permission " + str + " auth:" + z + " netTime:" + optLong + " ,localHasRequestPermission:" + a2);
                    if (a2) {
                        AppBrandLogger.m52830i("AbsPermissionSyncWrapper", "appid " + str2 + " local has permission " + str);
                        m54072a(jSONObject, a.mo232177a(), z, optLong, str2, str);
                        return;
                    }
                    AppBrandLogger.m52830i("AbsPermissionSyncWrapper", "appid " + str2 + " local no permission " + str + ",use net cover,netAuth: " + z + " netTime:" + optLong);
                    this.f35166a.mo50188a(a.mo232177a(), str2, z, optLong);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("AbsPermissionSyncWrapper", "parse permission fail, permissionType " + str + " err:" + e.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    private void m54072a(JSONObject jSONObject, int i, boolean z, long j, String str, String str2) {
        boolean a = this.f35166a.mo50194a(i, str, false);
        boolean a2 = this.f35166a.mo50196a(str, i);
        AppBrandLogger.m52830i("AbsPermissionSyncWrapper", " permission " + str2 + " localAuth:" + a + " localHasRequestTime:" + a2);
        if (!a2) {
            AppBrandLogger.m52830i("AbsPermissionSyncWrapper", "local permission no modify time,permission " + str2);
            if (a) {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("auth", true);
                    jSONObject2.put("modifyTime", currentTimeMillis);
                    jSONObject.put(str2, jSONObject2);
                    AppBrandLogger.m52830i("AbsPermissionSyncWrapper", " local permission has auth true,sync to service,permission " + str2 + " localtime:" + currentTimeMillis);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                this.f35166a.mo50199b(i, str, currentTimeMillis);
                return;
            }
            AppBrandLogger.m52830i("AbsPermissionSyncWrapper", " local permission has auth false,permission " + str2 + " user net cover local,netAuth:" + z + " netTime:" + j);
            this.f35166a.mo50188a(i, str, z, j);
            return;
        }
        long a3 = this.f35166a.mo50186a(i, str, -1);
        AppBrandLogger.m52830i("AbsPermissionSyncWrapper", " localPermission has modifyTime:" + a3 + " netTime:" + j);
        int i2 = (a3 > j ? 1 : (a3 == j ? 0 : -1));
        if (i2 < 0) {
            AppBrandLogger.m52830i("AbsPermissionSyncWrapper", " localtime:" + a3 + "< netTime:" + j + " use net cover local,permission:" + str2 + "auth:" + z + " appid:" + str);
            this.f35166a.mo50188a(i, str, z, j);
        } else if (i2 > 0) {
            AppBrandLogger.m52830i("AbsPermissionSyncWrapper", " localtime:" + a3 + "> netTime:" + j + " use local cover net,permission:" + str2 + "auth:" + a + " appid:" + str);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("auth", a);
                jSONObject3.put("modifyTime", a3);
                jSONObject.put(str2, jSONObject3);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
