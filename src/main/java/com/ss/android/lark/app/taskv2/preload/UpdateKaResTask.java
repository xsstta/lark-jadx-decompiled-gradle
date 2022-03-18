package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.p771g.C14276b;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.account_provider.integrator.env.C28518a;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.gecko.C38544a;
import com.ss.android.lark.gecko.C38547b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.dynamicconfig.C51797a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.PackageChannelManager;

public class UpdateKaResTask extends AsyncLaunchTask {

    public static class GeckoSettingConfig {

        /* renamed from: a */
        public String f72855a;
    }

    /* renamed from: a */
    private boolean m106886a(TenantInfo tenantInfo) {
        if (tenantInfo == null || TextUtils.isEmpty(tenantInfo.getTenantId())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m106888c(Context context) {
        Log.m165389i("UpdateKaResTask", "monitorTenant");
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(new AbstractC49379a(context) {
            /* class com.ss.android.lark.app.taskv2.preload.$$Lambda$UpdateKaResTask$C9Is9NdYs1rqZTCJUhJ52hxb6Nw */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public /* synthetic */ void mo102549a(C49380b bVar) {
                AbstractC49379a.CC.$default$a(this, bVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public /* synthetic */ void mo102550a(C49381c cVar) {
                AbstractC49379a.CC.$default$a(this, cVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            public final void onUserSwitchSuccess(C49382d dVar) {
                UpdateKaResTask.lambda$C9Is9NdYs1rqZTCJUhJ52hxb6Nw(UpdateKaResTask.this, this.f$1, dVar);
            }
        });
        C28513a.m104512a(new C28513a.AbstractC28514a(context) {
            /* class com.ss.android.lark.app.taskv2.preload.$$Lambda$UpdateKaResTask$oJ2LE1bW7Gnck_EdO3wYwGpgxxE */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
            public final void onLoginStatusChanged(int i) {
                UpdateKaResTask.lambda$oJ2LE1bW7Gnck_EdO3wYwGpgxxE(UpdateKaResTask.this, this.f$1, i);
            }
        });
    }

    /* renamed from: b */
    private void m106887b(Context context) {
        boolean z;
        String deviceId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
        Log.m165379d("UpdateKaResTask", "initGecko context:" + context + ", did:" + deviceId);
        if (!TextUtils.isEmpty(deviceId)) {
            String a = DynamicConfigModule.m145552b().mo136165a("gecko");
            if (TextUtils.isEmpty(a)) {
                Log.m165389i("UpdateKaResTask", "initGecko host is empty.");
                return;
            }
            GeckoSettingConfig geckoSettingConfig = (GeckoSettingConfig) SettingManager.getInstance().get(GeckoSettingConfig.class);
            if (geckoSettingConfig == null || TextUtils.isEmpty(geckoSettingConfig.f72855a)) {
                Log.m165389i("UpdateKaResTask", "fetch geckoSettingConfig failed.");
                return;
            }
            C14218d.C14220a a2 = new C14218d.C14220a(context).mo52154a((long) C29410a.m108287a().mo104277a());
            if (C28518a.m104522a().mo101493a() == 2) {
                z = true;
            } else {
                z = false;
            }
            C38544a.m151996a().mo141232a(a2.mo52155a(new C38547b(z)).mo52158a(C26246a.m94977a(context)).mo52163b(deviceId).mo52161a(geckoSettingConfig.f72855a).mo52165b(geckoSettingConfig.f72855a).mo52166c(a).mo52164b(CoreThreadPool.getDefault().getCachedThreadPool()).mo52159a(CoreThreadPool.getDefault().getCachedThreadPool()).mo52162a());
            if (C26284k.m95186b(context)) {
                C14276b.m57601a();
            }
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        int deployMode = PackageChannelManager.getDeployMode(context);
        Log.m165389i("UpdateKaResTask", "UpdateKaResTask execute deployMode:" + deployMode);
        if (1 == deployMode) {
            m106888c(context);
            boolean a = C37239a.m146648b().mo136952a("lark.ka.dynamicres", false);
            Log.m165389i("UpdateKaResTask", "kaResFg:" + a);
            if (a) {
                String tenantId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantId();
                if (!TextUtils.isEmpty(tenantId)) {
                    C51797a.m200805a().mo177920a(tenantId);
                    m106887b(context);
                    C38544a.m151996a().mo141233a(tenantId);
                }
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m106883a(Context context, int i) {
        Log.m165379d("UpdateKaResTask", "onLoginStatusChanged loginType:" + i);
        if (i == 1) {
            m106884a(context, ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getForegroundTenant());
        }
    }

    /* renamed from: a */
    private void m106884a(Context context, TenantInfo tenantInfo) {
        Log.m165379d("UpdateKaResTask", "syncServerRes loginInfo:" + tenantInfo);
        if (!m106886a(tenantInfo)) {
            C51797a.m200805a().mo177920a(tenantInfo.getTenantId());
            C38544a a = C38544a.m151996a();
            if (!a.mo141235b()) {
                m106887b(context);
            }
            a.mo141234b(tenantInfo.getTenantId());
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m106885a(Context context, C49382d dVar) {
        Log.m165379d("UpdateKaResTask", "onAccountChange:" + dVar);
        m106884a(context, ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getForegroundTenant());
    }
}
