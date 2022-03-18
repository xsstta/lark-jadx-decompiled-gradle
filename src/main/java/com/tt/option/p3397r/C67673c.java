package com.tt.option.p3397r;

import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import java.util.List;

/* renamed from: com.tt.option.r.c */
public class C67673c {

    /* renamed from: a */
    private boolean f170514a;

    /* renamed from: b */
    private List<String> f170515b;

    /* renamed from: c */
    private List<String> f170516c;

    /* renamed from: d */
    private IAppContext f170517d;

    /* renamed from: b */
    private void m263286b() {
        if (AppbrandContext.getInst().getApplicationContext() != null) {
            this.f170515b = C12738a.m52724a(AppbrandContext.getInst().getApplicationContext(), Settings.BDP_LAUNCH_APP_SCENE_LIST, Settings.BdpLaunchSceneList.WHITE_LIST);
            this.f170516c = C12738a.m52724a(AppbrandContext.getInst().getApplicationContext(), Settings.BDP_LAUNCH_APP_SCENE_LIST, Settings.BdpLaunchSceneList.GRAY_LIST);
        }
    }

    /* renamed from: a */
    public boolean mo234939a() {
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(this.f170517d).getAppInfo();
        if (appInfo != null) {
            if (this.f170515b.contains(appInfo.scene)) {
                this.f170514a = true;
            } else if (!this.f170516c.contains(appInfo.scene)) {
                this.f170514a = false;
            }
        }
        return this.f170514a;
    }

    public C67673c(IAppContext iAppContext) {
        this.f170517d = iAppContext;
        m263286b();
    }

    /* renamed from: a */
    public static C67673c m263285a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234289j();
    }
}
