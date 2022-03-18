package com.ss.lark.android.passport.biz.feature.user_info.p3233a;

import android.app.Activity;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.storage.util.IsolateStorageUtil;
import com.ss.android.lark.passport.infra.log.MonitorKeys;
import com.ss.android.lark.passport.infra.log.MonitorUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.user_info.UserInfoSettingStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a;
import com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65097e;

/* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.e */
public class C65097e extends AbstractC49021b<C65086a.AbstractC65087a, C65086a.AbstractC65088b, C65086a.AbstractC65088b.AbstractC65089a> {

    /* renamed from: d */
    public final Activity f163935d;

    /* renamed from: e */
    public AbstractC49352d<BaseStepData> f163936e = new AbstractC49352d<BaseStepData>() {
        /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65097e.C650981 */

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            PassportLog passportLog = C65097e.this.f123081c;
            passportLog.mo171471d("n_action_set_user_info_next", "setUserInfo error " + networkErrorResult.toString());
            ((C65086a.AbstractC65088b) C65097e.this.mo171181d()).mo224244e();
            UnknownCodeHandler.f123256a.mo171329a(C65097e.this.f163935d, networkErrorResult);
        }

        /* renamed from: a */
        public void mo145179a(BaseStepData baseStepData) {
            if (baseStepData != null) {
                PassportLog passportLog = C65097e.this.f123081c;
                passportLog.mo171465b("n_action_set_user_info_next", "setUserInfo success, nextStep: " + baseStepData.nextStep);
                C49092f.m193529a(C65097e.this.f163935d, baseStepData, RouterScene.ALL.value, C65097e.this.f123080b, C65097e.this.f123081c, new AbstractC49336a() {
                    /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65097e.C650981.C650991 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                    public void onRouterResult(int i, Object obj) {
                        ((C65086a.AbstractC65088b) C65097e.this.mo171181d()).mo224244e();
                    }
                });
                return;
            }
            C65097e.this.f123081c.mo171471d("n_action_set_user_info_next", "sendRequest setUserInfo success, but baseStepData is null");
            ((C65086a.AbstractC65088b) C65097e.this.mo171181d()).mo224244e();
        }
    };

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo224260h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C65086a.AbstractC65088b.AbstractC65089a mo171180c() {
        return new C65100a();
    }

    /* renamed from: h */
    public void mo224260h() {
        C65086a.AbstractC65087a aVar = (C65086a.AbstractC65087a) mo171182e();
        if (aVar != null && mo171181d() != null) {
            ((C65086a.AbstractC65088b) mo171181d()).mo224242a(aVar.mo224240c());
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.e$a */
    public class C65100a implements C65086a.AbstractC65088b.AbstractC65089a {
        public C65100a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a.AbstractC65088b.AbstractC65089a
        /* renamed from: a */
        public void mo224246a(String str) {
            ((C65086a.AbstractC65087a) C65097e.this.mo171182e()).mo224239a(C65097e.this.f163935d, str, ((C65086a.AbstractC65087a) C65097e.this.mo171182e()).mo224240c().usePackageDomain, ((C65086a.AbstractC65087a) C65097e.this.mo171182e()).mo224240c().mUnit, new AbstractC49352d<CountryBean>() {
                /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65097e.C65100a.C651022 */

                /* access modifiers changed from: private */
                /* renamed from: b */
                public /* synthetic */ void m255653b(CountryBean countryBean) {
                    if (countryBean == null) {
                        C65097e.this.f123081c.mo171471d("n_page_set_user_info_start", "handleCountryBean bean is null");
                    } else {
                        ((C65086a.AbstractC65088b) C65097e.this.mo171181d()).mo224241a(countryBean, false);
                    }
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    C65097e.this.f123081c.mo171471d("n_page_set_user_info_start", PassportLog.m193687a("get country info failed", networkErrorResult));
                }

                /* renamed from: a */
                public void mo145179a(CountryBean countryBean) {
                    String str;
                    PassportLog passportLog = C65097e.this.f123081c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("getCountryInfo ");
                    if (countryBean == null) {
                        str = "";
                    } else {
                        str = countryBean.getCode();
                    }
                    sb.append(str);
                    passportLog.mo171465b("n_page_set_user_info_start", sb.toString());
                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(countryBean) {
                        /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$e$a$2$VLC7CGGBd08QIt4tto5LdWgCn8 */
                        public final /* synthetic */ CountryBean f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C65097e.C65100a.C651022.this.m255653b(this.f$1);
                        }
                    });
                }
            });
        }

        @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a.AbstractC65088b.AbstractC65089a
        /* renamed from: a */
        public void mo224245a(int i, final String str, String str2) {
            C65097e.this.f123081c.mo171465b("n_action_set_user_info_next", "start setUserInfo");
            if (C65097e.this.mo171182e() == null) {
                C65097e.this.f123081c.mo171471d("n_action_set_user_info_next", "setUserInfo but model is null");
                return;
            }
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65097e.C65100a.RunnableC651011 */

                public void run() {
                    String a = C49160a.m193855a(str, "EE");
                    MonitorUtil.m193719c(a);
                    IsolateStorageUtil.f123196a.mo171253b(MonitorKeys.f123360a, a);
                }
            });
            UserInfoSettingStatisticsHelper.m255607a(((C65086a.AbstractC65087a) C65097e.this.mo171182e()).mo224240c().mFlowType, i);
            ((C65086a.AbstractC65088b) C65097e.this.mo171181d()).mo224243d();
            ((C65086a.AbstractC65087a) C65097e.this.mo171182e()).mo224238a(i, str, str2, C65097e.this.f163936e);
        }
    }

    public C65097e(Activity activity, C65086a.AbstractC65087a aVar, C65086a.AbstractC65088b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163935d = activity;
    }
}
