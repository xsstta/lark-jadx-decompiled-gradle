package com.ss.lark.android.passport.biz.feature.company_login.p3222a;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.storage.util.IsolateStorageUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.account.UserGlobalKeys;
import com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64696d;
import java.util.HashMap;

/* renamed from: com.ss.lark.android.passport.biz.feature.company_login.a.b */
public class C64683b extends AbstractC49021b<C64696d.AbstractC64697a, C64696d.AbstractC64698b, C64696d.AbstractC64698b.AbstractC64699a> {

    /* renamed from: d */
    public final Context f163177d;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo223492h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64696d.AbstractC64698b.AbstractC64699a mo171180c() {
        return new C64685a();
    }

    /* renamed from: h */
    public void mo223492h() {
        if (((C64696d.AbstractC64697a) mo171182e()) != null && mo171181d() != null) {
            ((C64696d.AbstractC64698b) mo171181d()).mo223498f();
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.company_login.a.b$a */
    public class C64685a implements C64696d.AbstractC64698b.AbstractC64699a {
        public C64685a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64696d.AbstractC64698b.AbstractC64699a
        /* renamed from: a */
        public void mo223494a(String str, String str2) {
            C64683b.this.mo223489a(str, str2);
        }
    }

    /* renamed from: b */
    public void mo223490b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            IsolateStorageUtil.f123196a.mo171253b(UserGlobalKeys.f162504f, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            IsolateStorageUtil.f123196a.mo171253b(UserGlobalKeys.f162505g, str2);
        }
    }

    /* renamed from: a */
    public void mo223489a(final String str, final String str2) {
        this.f123081c.mo171465b("n_action_login_idp_auth_url_req", "fetch sso auth url start");
        String str3 = str + str2;
        if (mo171182e() == null) {
            this.f123081c.mo171471d("CompanyLoginPresenter", "null model");
            return;
        }
        ((C64696d.AbstractC64698b) mo171181d()).mo223496d();
        ((C64696d.AbstractC64697a) mo171182e()).mo223488a(str3, new AbstractC49352d<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64683b.C646841 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                C64683b.this.f123081c.mo171471d("n_action_login_idp_auth_url_req_fail", PassportLog.m193687a("checkCompanyInfo error", networkErrorResult));
                ((C64696d.AbstractC64698b) C64683b.this.mo171181d()).mo223497e();
            }

            /* renamed from: a */
            public void mo145179a(BaseStepData baseStepData) {
                C64683b.this.mo223490b(str, str2);
                ((C64696d.AbstractC64698b) C64683b.this.mo171181d()).mo223497e();
                if (baseStepData != null) {
                    PassportLog passportLog = C64683b.this.f123081c;
                    passportLog.mo171465b("n_action_login_idp_auth_url_req_suc", "nextStep: " + baseStepData.nextStep);
                    HashMap hashMap = new HashMap();
                    hashMap.put("next_step", baseStepData.nextStep);
                    WatcherHelper.m193665a(C64683b.this.f123080b, C40654u.f103197t, hashMap);
                    C49092f.m193529a(C64683b.this.f163177d, baseStepData, RouterScene.ALL.value, C64683b.this.f123080b, C64683b.this.f123081c, (AbstractC49336a) null);
                    return;
                }
                C64683b.this.f123081c.mo171471d("n_action_login_idp_auth_url_req_fail", "empty nextStep");
            }
        });
    }

    public C64683b(Context context, C64696d.AbstractC64697a aVar, C64696d.AbstractC64698b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163177d = context;
    }
}
