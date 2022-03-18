package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.mail_api.IMailApi;
import com.ss.android.lark.monitor.C48246q;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.preload.AbstractC52220a;
import com.ss.android.lark.preload.C52224b;
import com.ss.android.lark.preload.moment.PreloadMoment;
import com.ss.android.lark.preload.p2519b.AbstractC52229a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.ApiUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class IdlePreloadTask extends AsyncLaunchTask {

    @AppConfig(key = "smart_preload_config")
    public static class PreloadConfig implements Serializable {
        @SerializedName("decision_preload_threshold")
        float preloadThreshold = 0.3f;

        public float getPreloadThreshold() {
            return this.preloadThreshold;
        }

        public void setPreloadThreshold(float f) {
            this.preloadThreshold = f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m106782g() {
        List<AbstractC52229a> preloadTasks = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getPreloadTasks(9);
        if (!(preloadTasks == null || preloadTasks.isEmpty())) {
            for (AbstractC52229a aVar : preloadTasks) {
                C52224b.m202589a().mo178804a(aVar, PreloadMoment.IDLE);
            }
        }
    }

    /* renamed from: b */
    private List<AbstractC52220a> m106780b(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocsIdleActions());
        AbstractC52220a mailIdlePreloadActions = ((IMailApi) ApiUtils.getApi(IMailApi.class)).getMailIdlePreloadActions();
        if (mailIdlePreloadActions != null) {
            arrayList.add(mailIdlePreloadActions);
        }
        arrayList.add($$Lambda$IdlePreloadTask$0pJJ3bVGhmivdCFiqyJ2wCTHlz8.INSTANCE);
        return arrayList;
    }

    /* renamed from: c */
    private void m106781c(Context context) {
        List<AbstractC52229a> preloadTasks = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getPreloadTasks(8);
        if (!(preloadTasks == null || preloadTasks.isEmpty())) {
            for (AbstractC52229a aVar : preloadTasks) {
                C52224b.m202589a().mo178804a(aVar, PreloadMoment.FIRST_SCREEN_SHOWED);
            }
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        if (!C37239a.m146648b().mo136952a("idle_preload_switch", false)) {
            C53241h.m205898b("IdlePreloadTask", "FG close");
            return;
        }
        C48246q.m190374b(true);
        C53241h.m205898b("IdlePreloadTask", "begin execute");
        PreloadConfig preloadConfig = (PreloadConfig) SettingManager.getInstance().get(PreloadConfig.class);
        C52224b.C52226a a = new C52224b.C52227b().mo178809a(new IdleStateManager()).mo178810a(CoreThreadPool.getDefault().getFixedThreadPool()).mo178808a();
        if (preloadConfig != null) {
            a.f129567a = Float.valueOf(preloadConfig.getPreloadThreshold());
        }
        C52224b.m202589a().mo178803a(a);
        C52224b.m202589a().mo178806a(m106780b(context));
        m106781c(context);
    }
}
