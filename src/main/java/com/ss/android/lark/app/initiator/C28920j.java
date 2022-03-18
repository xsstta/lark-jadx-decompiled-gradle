package com.ss.android.lark.app.initiator;

import android.content.Context;
import android.content.res.Configuration;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.platform.statistics.p2502b.C51959a;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.vc.api.IVCApi;

/* renamed from: com.ss.android.lark.app.initiator.j */
public class C28920j implements AbstractC28914d {

    /* renamed from: a */
    private AbstractC28914d f72537a;

    /* renamed from: com.ss.android.lark.app.initiator.j$a */
    private static class C28922a implements AbstractC28914d {

        /* renamed from: a */
        private AbstractC28915e f72538a;

        private C28922a() {
        }

        @Override // com.ss.android.lark.app.initiator.AbstractC28914d
        /* renamed from: d */
        public void mo102664d(Context context) {
            this.f72538a.mo102529d(context);
        }

        @Override // com.ss.android.lark.app.initiator.AbstractC28914d
        /* renamed from: b */
        public void mo102662b(Configuration configuration) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).beforeConfigurationChangedForLocale(configuration);
        }

        @Override // com.ss.android.lark.app.initiator.AbstractC28914d
        /* renamed from: c */
        public void mo102663c(Context context) {
            C51959a.m201538g();
            this.f72538a.mo102528c(context);
            C51959a.m201539h();
        }

        @Override // com.ss.android.lark.app.initiator.AbstractC28914d
        /* renamed from: a */
        public void mo102659a(Context context) {
            C51959a.m201529a(context, false);
            C51959a.m201536e();
            PassportUpgradeProcessInitiator passportUpgradeProcessInitiator = new PassportUpgradeProcessInitiator();
            this.f72538a = passportUpgradeProcessInitiator;
            passportUpgradeProcessInitiator.mo102526a(context);
            C51959a.m201537f();
            C51995b.m201716a("install_content_provider");
        }

        @Override // com.ss.android.lark.app.initiator.AbstractC28914d
        /* renamed from: b */
        public void mo102661b(Context context) {
            C51995b.m201714a();
            C51995b.m201716a("before_application_create");
            this.f72538a.mo102527b(context);
            C51995b.m201714a();
        }

        @Override // com.ss.android.lark.app.initiator.AbstractC28914d
        /* renamed from: a */
        public void mo102660a(Configuration configuration) {
            ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).onAppStatusConfigurationChanged(LarkContext.getApplication(), configuration);
            IVCApi iVCApi = (IVCApi) ApiUtils.getApi(IVCApi.class);
            if (iVCApi != null) {
                iVCApi.onConfigurationChanged(configuration);
            }
        }
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: a */
    public void mo102660a(Configuration configuration) {
        this.f72537a.mo102660a(configuration);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: b */
    public void mo102661b(Context context) {
        this.f72537a.mo102661b(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: c */
    public void mo102663c(Context context) {
        this.f72537a.mo102663c(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: d */
    public void mo102664d(Context context) {
        this.f72537a.mo102664d(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: b */
    public void mo102662b(Configuration configuration) {
        this.f72537a.mo102662b(configuration);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: a */
    public void mo102659a(Context context) {
        if (C49224w.m194052a()) {
            this.f72537a = new C28922a();
        } else {
            this.f72537a = new C28926n();
        }
        this.f72537a.mo102659a(context);
    }
}
