package com.ss.android.lark.littleapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a;
import com.bytedance.ee.lark.infra.network.ref.p635a.C12859i;
import com.bytedance.ee.larkbrand.C12941a;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.bytedance.ee.larkbrand.permission.C13288e;
import com.bytedance.ee.larkbrand.permission.C13290f;
import com.bytedance.ee.larkbrand.utils.C13373r;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.component.openplatform.core.plugin.passport.C25464i;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.littleapp.entity.LittleAppPermissionData;
import com.ss.android.lark.littleapp.prelaunch.AbstractC41413a;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.miniapp.process.info.C66643a;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.C66654d;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.f */
public class C41343f {
    /* renamed from: a */
    public boolean mo148923a() {
        return C12941a.m53325a();
    }

    /* renamed from: a */
    public boolean mo148924a(IAppSandboxEnvProcessor iAppSandboxEnvProcessor) {
        return iAppSandboxEnvProcessor instanceof C66654d;
    }

    /* renamed from: d */
    private void m163914d() {
        Observable.create(new Action() {
            /* class com.ss.android.lark.littleapp.C41343f.C413441 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    C13373r.m54380a();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
        C12782a.m52835a("key_debug", false);
    }

    /* renamed from: b */
    public void mo148925b() {
        Locale initLocale = HostDependManager.getInst().getInitLocale();
        if (initLocale == null) {
            initLocale = LarkExtensionManager.getInstance().getExtension().mo49563a();
        }
        C67479c.m262467a().mo234227a(initLocale);
        m163914d();
        mo148927c();
    }

    /* renamed from: c */
    public void mo148927c() {
        C13288e.m54115a().mo49529b();
        Observable.create(new Action() {
            /* class com.ss.android.lark.littleapp.C41343f.C413452 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
                        if (iAppSandboxEnvProcessor != null) {
                            iAppSandboxEnvProcessor.killAllSandbox();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
        C12782a.m52835a("key_debug", false);
    }

    /* renamed from: a */
    public static void m163912a(boolean z) {
        C12837a.m53024a(z);
        C12859i.m53078a(z);
    }

    /* renamed from: b */
    public void mo148926b(final boolean z) {
        C67866g.m264026a(new Action() {
            /* class com.ss.android.lark.littleapp.C41343f.C413496 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C41355h.m163961a().mo148961b(z);
            }
        }, Schedulers.shortIO(), true);
    }

    /* renamed from: a */
    public void mo148921a(final String str) {
        C67866g.m264026a(new Action() {
            /* class com.ss.android.lark.littleapp.C41343f.C413485 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C41355h.m163961a().mo148955a(str);
            }
        }, Schedulers.shortIO(), true);
    }

    /* renamed from: a */
    public void mo148914a(final Context context, final int i) {
        Schedulers.longIO().execute(new Runnable() {
            /* class com.ss.android.lark.littleapp.C41343f.RunnableC413474 */

            public void run() {
                for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
                    for (Class cls : iAppSandboxEnvProcessor.getRunningServiceClass(context)) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("env", i);
                            Intent intent = new Intent(context, cls);
                            intent.putExtra("command", "hostActionCommand");
                            intent.putExtra("hostAction", "setRustEnv");
                            intent.putExtra("hostActionParams", jSONObject.toString());
                            context.startService(intent);
                        } catch (Exception e) {
                            AppBrandLogger.stacktrace(6, "LittleAppImpl", e.getStackTrace());
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo148916a(Context context, String str) {
        if (str != null) {
            String[] split = str.split("____");
            if (split.length > 0) {
                m163913b(context, split[0]);
            }
        }
    }

    /* renamed from: b */
    private void m163913b(Context context, String str) {
        AppInfoEntity appInfoEntity = new AppInfoEntity();
        appInfoEntity.appId = str;
        IAppSandboxEnvProcessor iAppSandboxEnvProcessor = null;
        appInfoEntity.versionType = null;
        Iterator<IAppSandboxEnvManagerService.SandBoxEnvType> it = C66645a.m260337a().mo232361c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IAppSandboxEnvManagerService.SandBoxEnvType next = it.next();
            IAppSandboxEnvProcessor a = C66645a.m260337a().mo232355a(next);
            if (a != null && a.getSandboxEnvInfoByAppId(str) != null) {
                appInfoEntity.sandBoxEnvType = next;
                iAppSandboxEnvProcessor = a;
                break;
            }
        }
        if (iAppSandboxEnvProcessor == null) {
            AppBrandLogger.m52829e("LittleAppImpl", "currentAppProcessor == null");
            C48936b.m192783a("currentAppProcessor == null");
            return;
        }
        C66643a launchClass = iAppSandboxEnvProcessor.getLaunchClass(context, appInfoEntity, false, true, false, C67448a.m262353a().mo234181b(C67440a.m262344a(AppType.GadgetAPP, str)));
        if (launchClass != null) {
            Intent intent = new Intent();
            intent.setClass(context, launchClass.mo232275c());
            intent.putExtra("resume_back", true);
            HostDependManager.getInst().startMiniAppActivity(context, intent);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(R.anim.microapp_i_slide_in_top, R.anim.microapp_i_slide_in_no);
            }
        }
    }

    /* renamed from: a */
    public List<LittleAppPermissionData> mo148913a(Context context, String str, AppType appType) {
        return C13290f.m54127a(context, str, appType);
    }

    /* renamed from: a */
    public void mo148917a(Context context, String str, C25464i.AbstractC25468c cVar) {
        new C25464i(context, str, cVar).mo88612a();
    }

    /* renamed from: a */
    public void mo148918a(Context context, String str, String str2) {
        if (str != null) {
            String[] split = str.split("____");
            if (split.length == 2) {
                m163913b(context, split[0]);
                C13374s.m54390a(split[1], str2);
            }
        }
    }

    /* renamed from: a */
    public void mo148922a(String str, int i, String str2) {
        C41355h.m163961a().mo148956a(str, i, str2);
    }

    /* renamed from: a */
    public void mo148919a(Context context, String str, String str2, AppType appType, AbstractC13298i iVar) {
        C13290f.m54128a(context, str, str2, appType, iVar);
    }

    /* renamed from: a */
    public void mo148915a(Context context, final int i, final String str, final IAppSandboxEnvProcessor iAppSandboxEnvProcessor, final IGetDataCallback<Boolean> iGetDataCallback) {
        final AbstractC41413a aVar = (AbstractC41413a) ClaymoreServiceLoader.loadFirst(AbstractC41413a.class);
        Schedulers.longIO().execute(new Runnable() {
            /* class com.ss.android.lark.littleapp.C41343f.RunnableC413463 */

            public void run() {
                IAppSandboxEnvProcessor iAppSandboxEnvProcessor = iAppSandboxEnvProcessor;
                if (iAppSandboxEnvProcessor != null) {
                    iAppSandboxEnvProcessor.setProcessorPreloadCallback(iGetDataCallback);
                    if (HostDependManager.getInst().getFeatureGating("gadget.preload.app") && !C41343f.this.mo148924a(iAppSandboxEnvProcessor)) {
                        String preLaunchAppId = aVar.getPreLaunchAppId();
                        if (!TextUtils.isEmpty(preLaunchAppId) && !aVar.isPreLaunched()) {
                            AppBrandLogger.m52830i("LittleAppImpl", "preloadLaunchApp:" + preLaunchAppId);
                            aVar.preLaunchApp(i, str, preLaunchAppId, iAppSandboxEnvProcessor, C67448a.m262353a().mo234190i());
                            return;
                        }
                    }
                    iAppSandboxEnvProcessor.preloadEmptySandboxEnv(i, str, C67448a.m262353a().mo234190i());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo148920a(Context context, String str, String str2, List<LittleAppPermissionData> list, AppType appType, String str3, Integer num) {
        C13290f.m54129a(context, str, str2, list, appType, str3, num);
    }
}
