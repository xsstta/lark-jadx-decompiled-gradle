package com.bytedance.ee.larkbrand.utils;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.hostbridge.sync.C13118f;
import com.bytedance.ee.larkbrand.hostbridge.sync.p658b.C13113b;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.process.p3379e.C67577a;
import com.tt.miniapphost.util.C67587d;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.utils.s */
public final class C13374s {
    /* renamed from: a */
    public static void m54393a(String str, String str2, boolean z) {
        try {
            C67577a generateAsyncIpcHandlerFromJSONObject = ProcessUtil.generateAsyncIpcHandlerFromJSONObject(new JSONObject(str));
            if (generateAsyncIpcHandlerFromJSONObject != null) {
                generateAsyncIpcHandlerFromJSONObject.mo234768a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("cross_process_data", (Object) str2).mo234763b(), z);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m54391a(String str, String str2, int i) {
        C13113b.m53692a(LarkHostDependManager.f34682b.mo49086a().mo48919b(), str2, str, i);
        C13118f.m53716a("lark_life_cycle_callback", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) str).mo234760a("life_cycle_callback_method", (Object) str2).mo234760a("life_cycle_callback_code", (Object) Integer.valueOf(i)).mo234763b());
    }

    /* renamed from: a */
    public static void m54392a(String str, String str2, AppType appType) {
        C13118f.m53716a("lark_notify_permission", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) str).mo234760a("permission", (Object) str2).mo234759a("app_type", (Serializable) appType).mo234763b());
    }

    /* renamed from: a */
    public static boolean m54394a(String str) {
        return C13118f.m53717b("lark_can_open_url", CrossProcessDataEntity.C67574a.m263013a().mo234760a("open_url", str).mo234763b()) != null;
    }

    /* renamed from: b */
    public static void m54396b(AbstractC67565b bVar) {
        C67560a.m262959a("lark_get_deviceId", (CrossProcessDataEntity) null, bVar);
    }

    /* renamed from: c */
    public static void m54399c(AbstractC67565b bVar) {
        C67560a.m262959a("lark_get_userInfo_ex", (CrossProcessDataEntity) null, bVar);
    }

    /* renamed from: a */
    public static String m54385a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            return null;
        }
        return crossProcessDataEntity.mo234744b("cross_process_data");
    }

    /* renamed from: b */
    public static JSONObject m54395b(String str) {
        CrossProcessDataEntity b = C13118f.m53717b("lark_ab_experiment", CrossProcessDataEntity.C67574a.m263013a().mo234760a("ab_experiment_key", (Object) str).mo234763b());
        if (b != null) {
            return b.mo234749f("ab_experiment_result");
        }
        return null;
    }

    /* renamed from: a */
    public static String m54382a(DomainSettings.Alias alias) {
        CrossProcessDataEntity b = C13118f.m53717b("lark_get_domain", CrossProcessDataEntity.C67574a.m263013a().mo234760a("domain_alias", (Object) Integer.valueOf(alias.getValue())).mo234763b());
        if (b == null) {
            return "";
        }
        return "https://" + b.mo234740a("domain", "");
    }

    /* renamed from: c */
    public static String m54398c(String str) {
        CrossProcessDataEntity b = C13118f.m53717b("lark_get_domain", CrossProcessDataEntity.C67574a.m263013a().mo234760a("domain_key", (Object) str).mo234763b());
        if (b == null) {
            return "";
        }
        return "https://" + b.mo234740a("domain", "");
    }

    /* renamed from: a */
    public static String m54383a(AbstractC67565b bVar) {
        return new C67587d().mo234783a("ma_callerProcessIdentify", ProcessUtil.getProcessIdentify()).mo234783a("ma_callbackId", Integer.valueOf(bVar.mo234709b())).mo234784a().toString();
    }

    /* renamed from: a */
    public static void m54390a(String str, String str2) {
        m54393a(str, str2, true);
    }

    /* renamed from: a */
    public static void m54386a(String str, AbstractC67565b bVar) {
        C67560a.m262959a("lark_upload_image", CrossProcessDataEntity.C67574a.m263013a().mo234760a("upload_image_path", (Object) str).mo234763b(), bVar);
    }

    /* renamed from: a */
    public static String m54384a(AbstractC67565b bVar, IAppContext iAppContext) {
        String a = m54383a(bVar);
        return C67432a.m262319a(iAppContext).getAppInfo().appId + "____" + a;
    }

    /* renamed from: b */
    public static boolean m54397b(String str, String str2, boolean z) {
        CrossProcessDataEntity b = C13118f.m53717b("lark_enter_chat", CrossProcessDataEntity.C67574a.m263013a().mo234760a("chatter_id", (Object) str).mo234760a("app_id", (Object) str2).mo234760a("isBot", (Object) Boolean.valueOf(z)).mo234763b());
        if (b != null) {
            return b.mo234746d("enter_chat_result");
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m54400c(String str, String str2, boolean z) {
        CrossProcessDataEntity b = C13118f.m53717b("lark_enter_chat", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) str2).mo234760a("chat_id", (Object) str).mo234760a("needBadge", (Object) Boolean.valueOf(z)).mo234763b());
        if (b != null) {
            return b.mo234746d("enter_chat_result");
        }
        return false;
    }

    /* renamed from: a */
    public static void m54387a(final String str, final AbstractC67565b bVar, final boolean z) {
        C67866g.m264025a(new Action() {
            /* class com.bytedance.ee.larkbrand.utils.C13374s.C133751 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C67560a.m262959a("lark_external_check", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) str).mo234760a("app_launch", (Object) Boolean.valueOf(z)).mo234763b(), bVar);
            }
        }, C67554l.m262725b());
    }

    /* renamed from: a */
    public static void m54388a(String str, CrossProcessDataEntity crossProcessDataEntity, boolean z) {
        try {
            C67577a generateAsyncIpcHandlerFromJSONObject = ProcessUtil.generateAsyncIpcHandlerFromJSONObject(new JSONObject(str));
            if (generateAsyncIpcHandlerFromJSONObject != null) {
                generateAsyncIpcHandlerFromJSONObject.mo234768a(crossProcessDataEntity, z);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m54389a(String str, Object obj, IAppContext iAppContext) {
        AppBrandLogger.m52828d("LarkHostProcessBridge", "notifyAppUpdateStatusChange: " + str + "-" + obj);
        C13118f.m53717b("lark_app_async_update", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_update_action", (Object) str).mo234760a("app_update_action_result", obj).mo234760a("app_id", (Object) C67432a.m262319a(iAppContext).getAppInfo().appId).mo234763b());
    }
}
