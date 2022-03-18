package com.ss.lark.android.passport.biz.feature.sso.external;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginSourceService;
import com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.external.c */
public class C65030c extends AbstractC49021b<AbstractC65033d.AbstractC65034a, AbstractC65033d.AbstractC65035b, AbstractC65033d.AbstractC65035b.AbstractC65036a> {

    /* renamed from: d */
    private final Context f163803d;

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.external.c$a */
    public class C65032a implements AbstractC65033d.AbstractC65035b.AbstractC65036a {
        @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65035b.AbstractC65036a
        /* renamed from: a */
        public void mo224105a() {
            C65030c.this.mo224102h();
        }

        public C65032a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65035b.AbstractC65036a
        /* renamed from: a */
        public void mo224106a(List<String> list) {
            C65030c.this.mo224100a(list);
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        m255313j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AbstractC65033d.AbstractC65035b.AbstractC65036a mo171180c() {
        return new C65032a();
    }

    /* renamed from: j */
    private void m255313j() {
        this.f123081c.mo171465b("ExternalAuthPresenter", "enter ExternalAuth Page");
        if (((AbstractC65033d.AbstractC65034a) mo171182e()).mo224097h() != null) {
            ((AbstractC65033d.AbstractC65035b) mo171181d()).mo224077a(((AbstractC65033d.AbstractC65034a) mo171182e()).mo224097h());
        } else {
            this.f123081c.mo171471d("ExternalAuthPresenter", "AuthInfo is null");
        }
    }

    /* renamed from: k */
    private void m255314k() {
        ILoginSourceService n = ServiceFinder.m193759n();
        if (n.getLoginSource().getLoginSource() == 1) {
            n.resetLoginSource();
            ServiceFinder.m193752g().onLoginCallback(this.f163803d, ServiceFinder.m193744a().getForegroundUser(), null);
            this.f123081c.mo171465b("n_page_authz_end", "checkLoginSource finish for external login");
        }
    }

    /* renamed from: g */
    public void mo224101g() {
        this.f123081c.mo171465b("n_action_auth_login_confirm_request_succ", "ExternalAuth onConfirm Succ after request");
        if (!((AbstractC65033d.AbstractC65035b) mo171181d()).mo224087g()) {
            m255314k();
            if (((AbstractC65033d.AbstractC65034a) mo171182e()).mo224098i() == 2) {
                ((AbstractC65033d.AbstractC65035b) mo171181d()).mo224081a(true);
            }
            if (!DesktopUtil.m144301a(this.f163803d)) {
                ((AbstractC65033d.AbstractC65035b) mo171181d()).mo224086f();
            } else {
                ((AbstractC65033d.AbstractC65035b) mo171181d()).mo224088h();
            }
        }
    }

    /* renamed from: h */
    public void mo224102h() {
        this.f123081c.mo171465b("n_page_authz_back", "click close or back,onBackEvent");
        if (!((AbstractC65033d.AbstractC65035b) mo171181d()).mo224087g()) {
            if (!TextUtils.isEmpty(((AbstractC65033d.AbstractC65034a) mo171182e()).mo224096g())) {
                ((AbstractC65033d.AbstractC65034a) mo171182e()).mo224099j();
            }
            m255314k();
            if (((AbstractC65033d.AbstractC65034a) mo171182e()).mo224098i() == 2) {
                ((AbstractC65033d.AbstractC65035b) mo171181d()).mo224081a(true);
            }
            if (!DesktopUtil.m144301a(this.f163803d)) {
                ((AbstractC65033d.AbstractC65035b) mo171181d()).mo224086f();
            } else {
                ((AbstractC65033d.AbstractC65035b) mo171181d()).mo224088h();
            }
        }
    }

    /* renamed from: a */
    public void mo224100a(List<String> list) {
        ((AbstractC65033d.AbstractC65035b) mo171181d()).mo224084d();
        ((AbstractC65033d.AbstractC65034a) mo171182e()).mo224095a(list, new IGetDataCallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.sso.external.C65030c.C650311 */

            /* renamed from: a */
            public void onSuccess(BaseStepData baseStepData) {
                ((AbstractC65033d.AbstractC65035b) C65030c.this.mo171181d()).mo224085e();
                C65030c.this.f123081c.mo171465b("n_action_auth_login_confirm_request", "External Auth success!");
                C65030c.this.mo224101g();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC65033d.AbstractC65035b) C65030c.this.mo171181d()).mo224085e();
                if (errorResult.getErrorCode() == 4402) {
                    ((AbstractC65033d.AbstractC65035b) C65030c.this.mo171181d()).mo224083b(errorResult.getDebugMsg());
                }
                C65030c.this.f123081c.mo171471d("n_action_auth_login_confirm_request", PassportLog.m193685a("External Auth failed", errorResult));
            }
        });
    }

    public C65030c(Context context, AbstractC65033d.AbstractC65035b bVar, AbstractC65033d.AbstractC65034a aVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163803d = context;
        ((AbstractC65033d.AbstractC65035b) mo171181d()).mo171188a(mo171180c());
    }
}
