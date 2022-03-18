package com.tt.miniapp.process.p3321f;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapp.manager.C66440j;
import com.tt.miniapp.manager.C66452l;
import com.tt.miniapp.p3352w.C67288b;
import com.tt.miniapp.p3352w.p3354b.AbstractC67297c;
import com.tt.miniapp.p3352w.p3354b.C67294b;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.p3370d.C67481d;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.C67566c;
import com.tt.miniapphost.process.p3379e.C67577a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import java.io.File;
import java.util.Locale;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.tt.miniapp.process.f.c */
public class C66639c {
    /* renamed from: a */
    private static void m260322a(IAppContext iAppContext) {
        MiniappHostBase miniappHostBase;
        AppBrandLogger.m52828d("InnerMiniAppProcessCallHandler", "notifyUpdateSnapshot");
        Activity currentActivity = iAppContext.getCurrentActivity();
        if ((currentActivity instanceof MiniappHostBase) && (miniappHostBase = (MiniappHostBase) currentActivity) != null) {
            miniappHostBase.notifyUpdateSnapShot();
        }
    }

    /* renamed from: a */
    public static void m260323a(CrossProcessDataEntity crossProcessDataEntity) {
        AppBrandLogger.m52828d("InnerMiniAppProcessCallHandler", "changeLanguageTo");
        String b = crossProcessDataEntity.mo234744b("localeLang");
        AppBrandLogger.m52828d("InnerMiniAppProcessCallHandler", "changeLanguageTo " + b);
        final Locale a = C67481d.m262479a(b);
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.process.p3321f.C66639c.RunnableC666412 */

            public void run() {
                C67479c.m262467a().mo234227a(a);
            }
        });
    }

    /* renamed from: b */
    private static void m260329b(CrossProcessDataEntity crossProcessDataEntity) {
        String b = crossProcessDataEntity.mo234744b("host_event_evt_name");
        String b2 = crossProcessDataEntity.mo234744b("host_event_mp_id");
        JSONObject f = crossProcessDataEntity.mo234749f("host_event_evt_params");
        AbstractC67297c cVar = (AbstractC67297c) C67288b.m262152a().mo233958a(C67294b.class);
        if (cVar != null) {
            cVar.mo233961a(b2, b, f);
        }
    }

    /* renamed from: a */
    private static void m260327a(final C67577a aVar, final IAppContext iAppContext) {
        C67866g.m264026a(new Action() {
            /* class com.tt.miniapp.process.p3321f.C66639c.C666401 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                CrossProcessDataEntity crossProcessDataEntity;
                long currentTimeMillis = System.currentTimeMillis();
                Activity currentActivity = iAppContext.getCurrentActivity();
                File a = C66452l.m259766a(currentActivity, C66452l.m259770a(C66452l.m259762a(currentActivity)));
                if (a != null) {
                    crossProcessDataEntity = CrossProcessDataEntity.C67574a.m263013a().mo234760a("snapshot", (Object) a.getAbsolutePath()).mo234763b();
                } else {
                    crossProcessDataEntity = null;
                }
                aVar.mo234768a(crossProcessDataEntity, true);
                AppBrandLogger.m52828d("InnerMiniAppProcessCallHandler", "getSnapShot duration:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }, C67554l.m262725b(), true);
    }

    /* renamed from: b */
    private static void m260330b(CrossProcessDataEntity crossProcessDataEntity, IAppContext iAppContext) {
        String b = crossProcessDataEntity.mo234744b("ttrequest_prefetch_appid");
        String b2 = crossProcessDataEntity.mo234744b("ttrequest_prefetch_info");
        if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(b2)) {
            C66440j.m259737a(b, b2, iAppContext);
        }
    }

    /* renamed from: a */
    public static void m260324a(CrossProcessDataEntity crossProcessDataEntity, IAppContext iAppContext) {
        HostDependManager.getInst().savePermissionGrant(crossProcessDataEntity.mo234748e("appbrandPermissionType"), crossProcessDataEntity.mo234746d("isGranted"), iAppContext);
    }

    /* renamed from: a */
    private static void m260325a(CrossProcessDataEntity crossProcessDataEntity, AbstractC67433a aVar) {
        String str;
        AppInfoEntity appInfoEntity = (AppInfoEntity) crossProcessDataEntity.mo234751h("appinfo");
        String b = crossProcessDataEntity.mo234744b("schema");
        String b2 = crossProcessDataEntity.mo234744b("sand_box_env_name");
        if (appInfoEntity == null || TextUtils.isEmpty(b)) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("prepareLaunch, schema: ");
            sb.append(b);
            sb.append(", appInfoEntity: ");
            if (appInfoEntity != null) {
                str = "not null";
            } else {
                str = "null";
            }
            sb.append(str);
            objArr[0] = sb.toString();
            AppBrandLogger.m52831w("InnerMiniAppProcessCallHandler", objArr);
            return;
        }
        appInfoEntity.schema = b;
        aVar.mo234157a(C67440a.m262344a(AppType.GadgetAPP, appInfoEntity.appId));
        aVar.mo234160a(b2);
        C67448a.m262353a().mo234182b(aVar);
        ((LaunchScheduler) AppbrandApplicationImpl.getInst(aVar).getService(LaunchScheduler.class)).startLaunch(appInfoEntity, b);
    }

    /* renamed from: a */
    private static void m260326a(CrossProcessDataEntity crossProcessDataEntity, CrossProcessDataEntity crossProcessDataEntity2) {
        if (crossProcessDataEntity2 == null) {
            DebugUtil.outputError("InnerMiniAppProcessCallHandler", "callback callExtraData == null");
            return;
        }
        C67566c.m262973a().mo232255a(crossProcessDataEntity2.mo234737a("callbackId", 0), crossProcessDataEntity, crossProcessDataEntity2.mo234746d("finishCallBack"));
    }

    /* renamed from: a */
    static boolean m260328a(String str, CrossProcessDataEntity crossProcessDataEntity, CrossProcessDataEntity crossProcessDataEntity2, C67577a aVar) {
        AbstractC67433a k = C67448a.m262353a().mo234192k();
        if (k == null) {
            AppBrandLogger.m52829e("InnerMiniAppProcessCallHandler", " running appContext is null");
            k = C67448a.m262353a().mo234190i();
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1932192966:
                if (str.equals("getSnapshot")) {
                    c = 0;
                    break;
                }
                break;
            case -1844080713:
                if (str.equals("dispatchHostEventToMiniApp")) {
                    c = 1;
                    break;
                }
                break;
            case -821813039:
                if (str.equals("notifyLanguageChange")) {
                    c = 2;
                    break;
                }
                break;
            case 42687103:
                if (str.equals("miniAppProcess_callback")) {
                    c = 3;
                    break;
                }
                break;
            case 360924619:
                if (str.equals("syncTTRequestPrefetch")) {
                    c = 4;
                    break;
                }
                break;
            case 991034266:
                if (str.equals("prepareLaunch")) {
                    c = 5;
                    break;
                }
                break;
            case 1042549078:
                if (str.equals("notifyUpdateSnapshot")) {
                    c = 6;
                    break;
                }
                break;
            case 1849852240:
                if (str.equals("savePermissionGrant")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m260327a(aVar, k);
                break;
            case 1:
                m260329b(crossProcessDataEntity);
                break;
            case 2:
                m260323a(crossProcessDataEntity);
                break;
            case 3:
                m260326a(crossProcessDataEntity, crossProcessDataEntity2);
                break;
            case 4:
                m260330b(crossProcessDataEntity, k);
                break;
            case 5:
                m260325a(crossProcessDataEntity, k);
                break;
            case 6:
                m260322a(k);
                break;
            case 7:
                m260324a(crossProcessDataEntity, (IAppContext) k);
                break;
            default:
                return false;
        }
        return true;
    }
}
