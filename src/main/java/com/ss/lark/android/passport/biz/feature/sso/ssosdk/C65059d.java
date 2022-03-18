package com.ss.lark.android.passport.biz.feature.sso.ssosdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49229z;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.SSOConfirmStepInfo;
import com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.ssosdk.d */
public class C65059d extends AbstractC49021b<AbstractC65052a.AbstractC65053a, AbstractC65052a.AbstractC65054b, AbstractC65052a.AbstractC65054b.AbstractC65055a> {

    /* renamed from: d */
    private Context f163854d;

    /* renamed from: e */
    private Uri f163855e;

    /* renamed from: f */
    private String f163856f;

    /* renamed from: g */
    private String f163857g;

    /* renamed from: h */
    private String f163858h;

    /* renamed from: i */
    private boolean f163859i;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        m255474j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AbstractC65052a.AbstractC65054b.AbstractC65055a mo171180c() {
        return new C65061a();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.ssosdk.d$a */
    public class C65061a implements AbstractC65052a.AbstractC65054b.AbstractC65055a {
        @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b.AbstractC65055a
        /* renamed from: a */
        public void mo224160a() {
            C65059d.this.mo224168h();
            C65059d.this.mo224167g();
        }

        public C65061a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b.AbstractC65055a
        /* renamed from: a */
        public void mo224162a(List<String> list) {
            C65059d.this.mo224166a(list);
        }

        @Override // com.ss.lark.android.passport.biz.feature.sso.ssosdk.AbstractC65052a.AbstractC65054b.AbstractC65055a
        /* renamed from: a */
        public void mo224161a(String str) {
            C65059d.this.mo224165a(str);
            C65059d.this.mo224167g();
        }
    }

    /* renamed from: j */
    private void m255474j() {
        this.f123081c.mo171465b("SSOSdkAuthPresenter", "enter SSOSdkAuth Page");
        if (((AbstractC65052a.AbstractC65053a) mo171182e()).mo224159c() != null) {
            ((AbstractC65052a.AbstractC65054b) mo171181d()).mo224139a(((AbstractC65052a.AbstractC65053a) mo171182e()).mo224159c());
        } else {
            this.f123081c.mo171471d("SSOSdkAuthPresenter", "AuthInfo is null");
        }
    }

    /* renamed from: g */
    public void mo224167g() {
        this.f123081c.mo171465b("SSOSdkAuthPresenter", "onBackEvent");
        if (((AbstractC65052a.AbstractC65054b) mo171181d()).mo224149g()) {
            return;
        }
        if (!DesktopUtil.m144301a(this.f163854d)) {
            ((AbstractC65052a.AbstractC65054b) mo171181d()).mo224146d();
        } else {
            ((AbstractC65052a.AbstractC65054b) mo171181d()).mo224150h();
        }
    }

    /* renamed from: h */
    public void mo224168h() {
        String queryParameter = this.f163855e.getQueryParameter("app_id");
        String queryParameter2 = this.f163855e.getQueryParameter("state");
        String format = String.format("%s://oauth/cancel?state=%s&code=0", queryParameter, queryParameter2);
        PassportLog passportLog = this.f123081c;
        passportLog.mo171465b("n_action_ssosdk_auth_cancel", "SSOSdk auth cancel, associate_id=" + queryParameter2);
        m255473b(format);
    }

    /* renamed from: k */
    private boolean m255475k() {
        List<String> a = C49229z.m194069a(this.f163854d, this.f163856f);
        if (a == null || a.size() == 0 || this.f163854d == null) {
            this.f123081c.mo171471d("SSOSdkAuthPresenter", "the md5 list is null");
            return false;
        } else if (TextUtils.isEmpty(this.f163858h) || !a.get(0).equals(this.f163857g) || !C49229z.m194070a(this.f163854d, this.f163856f, a.get(0)) || TextUtils.isEmpty(this.f163854d.getPackageName()) || this.f163854d.getPackageName().equals(this.f163856f)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private void m255471a(Intent intent) {
        try {
            this.f123081c.mo171465b("SSOSdkAuthPresenter", "jump to sdk success");
            this.f163854d.startActivity(intent);
        } catch (Throwable th) {
            PassportLog passportLog = this.f123081c;
            passportLog.mo171462a("SSOSdkAuthPresenter", "jump to sdk failed:" + th.getMessage(), th);
        }
    }

    /* renamed from: a */
    private void m255472a(Bundle bundle) {
        this.f163856f = bundle.getString("package_id");
        this.f163858h = bundle.getString("class_name");
        this.f163857g = bundle.getString("signature", this.f163857g);
        if (TextUtils.isEmpty(this.f163856f) || TextUtils.isEmpty(this.f163858h) || TextUtils.isEmpty(this.f163857g)) {
            this.f123081c.mo171471d("SSOSdkAuthPresenter", "the related info is null");
            mo224167g();
        }
    }

    /* renamed from: b */
    private void m255473b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f123081c.mo171471d("SSOSdkAuthPresenter", "returnUri is null");
            mo224167g();
            return;
        }
        if (!this.f163859i) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            m255471a(intent);
        } else if (m255475k()) {
            this.f123081c.mo171465b("SSOSdkAuthPresenter", "go safety mode");
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setComponent(new ComponentName(this.f163856f, this.f163858h));
            intent2.setData(Uri.parse(str));
            intent2.addFlags(268435456);
            m255471a(intent2);
        } else {
            this.f123081c.mo171471d("SSOSdkAuthPresenter", "package or signature is not correct");
        }
        mo224167g();
    }

    /* renamed from: a */
    public void mo224164a(SSOConfirmStepInfo sSOConfirmStepInfo) {
        if (sSOConfirmStepInfo == null || TextUtils.isEmpty(sSOConfirmStepInfo.mode) || TextUtils.isEmpty(sSOConfirmStepInfo.uri) || !sSOConfirmStepInfo.mode.equalsIgnoreCase("openClient")) {
            ((AbstractC65052a.AbstractC65054b) mo171181d()).mo224143a("0", "Server data can not parse");
            PassportLog passportLog = this.f123081c;
            passportLog.mo171471d("n_page_ssosdk_auth_end_succ", "SSOSdk auth success, but data is not correct" + this.f163855e.getQueryParameter("state"));
            return;
        }
        try {
            m255473b(sSOConfirmStepInfo.uri);
            PassportLog passportLog2 = this.f123081c;
            passportLog2.mo171465b("n_page_ssosdk_auth_end_succ", "SSOSdk auth success,associate_id=" + this.f163855e.getQueryParameter("state") + "Uri:" + sSOConfirmStepInfo.uri);
        } catch (Exception unused) {
            ((AbstractC65052a.AbstractC65054b) mo171181d()).mo224143a("0", "Jump to app failed");
            this.f123081c.mo171471d("n_page_ssosdk_auth_end_fail", "SSOSdk auth failed, associate_id=");
        }
    }

    /* renamed from: a */
    public void mo224165a(String str) {
        String queryParameter = this.f163855e.getQueryParameter("app_id");
        String queryParameter2 = this.f163855e.getQueryParameter("state");
        String format = String.format("%s://oauth/failure?state=%s&code=0&err_code=%s", queryParameter, queryParameter2, str);
        try {
            PassportLog passportLog = this.f123081c;
            passportLog.mo171471d("n_page_ssosdk_auth_end_fail", "SSOSdk auth failed,associate_id=" + queryParameter2);
            m255473b(format);
        } catch (Exception unused) {
            PassportLog passportLog2 = this.f123081c;
            passportLog2.mo171461a("n_page_ssosdk_auth_end_fail", "SSOSdk auth failed and jump failed, associate_id=" + queryParameter2);
        }
    }

    /* renamed from: a */
    public void mo224166a(List<String> list) {
        String str;
        User foregroundUser;
        ((AbstractC65052a.AbstractC65054b) mo171181d()).mo224147e();
        IUserListService a = ServiceFinder.m193744a();
        if (a == null || (foregroundUser = a.getForegroundUser()) == null) {
            str = "";
        } else {
            str = foregroundUser.userId;
        }
        PassportLog passportLog = this.f123081c;
        passportLog.mo171465b("n_action_ssosdk_auth_confirm_request", "scopes.size = " + list.size());
        ((AbstractC65052a.AbstractC65053a) mo171182e()).mo224158a(str, list, new IGetDataCallback<SSOConfirmStepInfo>() {
            /* class com.ss.lark.android.passport.biz.feature.sso.ssosdk.C65059d.C650601 */

            /* renamed from: a */
            public void onSuccess(SSOConfirmStepInfo sSOConfirmStepInfo) {
                ((AbstractC65052a.AbstractC65054b) C65059d.this.mo171181d()).mo224148f();
                C65059d.this.f123081c.mo171460a("n_action_ssosdk_auth_confirm_req_succ");
                C65059d.this.mo224164a(sSOConfirmStepInfo);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC65052a.AbstractC65054b) C65059d.this.mo171181d()).mo224148f();
                if (errorResult.getErrorCode() == 4402) {
                    ((AbstractC65052a.AbstractC65054b) C65059d.this.mo171181d()).mo224143a(String.valueOf(errorResult.getErrorCode()), errorResult.getDebugMsg());
                } else {
                    ((AbstractC65052a.AbstractC65054b) C65059d.this.mo171181d()).mo224141a(String.valueOf(errorResult.getErrorCode()));
                }
                PassportLog passportLog = C65059d.this.f123081c;
                passportLog.mo171471d("n_action_ssosdk_auth_confirm_req_fail", "errCode=" + errorResult.getErrorCode() + "errMsg=" + errorResult.getDebugMsg());
            }
        });
    }

    public C65059d(Context context, AbstractC65052a.AbstractC65054b bVar, AbstractC65052a.AbstractC65053a aVar, Bundle bundle, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        if (bundle == null || bundle.getParcelable("sso_uri") == null) {
            this.f123081c.mo171471d("SSOSdkAuthPresenter", "bundle or sso_uri is null");
            return;
        }
        this.f163854d = context;
        Uri uri = (Uri) bundle.getParcelable("sso_uri");
        this.f163855e = uri;
        if (TextUtils.isEmpty(uri.getQueryParameter("safety_mode"))) {
            this.f163859i = false;
        } else {
            this.f163859i = true;
            m255472a(bundle);
        }
        ((AbstractC65052a.AbstractC65054b) mo171181d()).mo171188a(mo171180c());
    }
}
