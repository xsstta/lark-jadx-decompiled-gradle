package com.ss.lark.android.passport.biz.feature.accountandsecurity;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.ss.android.lark.passport.infra.base.network.C49081e;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.config.PassportConfigHelper;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49157ai;
import com.ss.android.lark.passport.infra.widget.DialogC49246b;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import java.lang.reflect.Type;

/* renamed from: com.ss.lark.android.passport.biz.feature.accountandsecurity.b */
public class C64601b {

    /* renamed from: b */
    public static final PassportLog f163062b = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    protected DialogC49246b f163063a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.feature.accountandsecurity.b$a */
    public static final class C64603a {

        /* renamed from: a */
        public static final C64601b f163069a = new C64601b();
    }

    private C64601b() {
    }

    /* renamed from: a */
    public static C64601b m253843a() {
        return C64603a.f163069a;
    }

    /* renamed from: a */
    public void mo223363a(Context context) {
        m253844a(context, PassportConfigHelper.m193016a("account_security_center"));
    }

    /* renamed from: b */
    public void mo223365b(Context context) {
        m253844a(context, PassportConfigHelper.m193016a("account_management"));
    }

    /* renamed from: c */
    public void mo223366c(Context context) {
        m253844a(context, PassportConfigHelper.m193016a("password_setting"));
    }

    /* renamed from: d */
    public void mo223367d(Context context) {
        m253844a(context, PassportConfigHelper.m193016a("security_password_setting"));
    }

    /* renamed from: c */
    private boolean m253845c(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo223362a(Activity activity) {
        if (m253845c(activity)) {
            DialogC49246b bVar = new DialogC49246b(activity, true);
            this.f163063a = bVar;
            if (!bVar.isShowing()) {
                this.f163063a.show();
            }
        }
    }

    /* renamed from: b */
    public void mo223364b(Activity activity) {
        DialogC49246b bVar;
        if (m253845c(activity) && (bVar = this.f163063a) != null && bVar.isShowing()) {
            this.f163063a.dismiss();
        }
    }

    /* renamed from: a */
    private void m253844a(final Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            f163062b.mo171471d("AccountAndSecurityManager", "open accountAndSecurity page failed with empty url");
            return;
        }
        boolean isFgEnable = ServiceFinder.m193748c().isFgEnable("lark.passport.change.user.agent");
        PassportLog passportLog = f163062b;
        passportLog.mo171465b("AccountAndSecurityManager", "open accountAndSecurity page: " + str);
        final Bundle bundle = new Bundle();
        boolean z = true;
        bundle.putBoolean("doNotShowMore", true);
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("lang", C49081e.m193469b().toLowerCase());
        if (UDUiModeUtils.m93319a(context)) {
            str2 = "dark";
        } else {
            str2 = "light";
        }
        final Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("theme", str2);
        if (ServiceFinder.m193749d().isCnEnv() && !ServiceFinder.m193748c().isLarkPackage()) {
            z = false;
        }
        if (!z || !isFgEnable) {
            C49157ai.m193847a(context, appendQueryParameter2.build().toString(), bundle, false);
            return;
        }
        passportLog.mo171465b("AccountAndSecurityManager", "isLarkPackage or unit, And enableChangeUserAgent");
        final Activity c = C64340b.m252955a().mo222861c();
        mo223362a(c);
        FeatureCApi.m253708b(UniContext.CONTEXT_GLOBAL, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.accountandsecurity.C64601b.C646021 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                C64601b.this.mo223364b(c);
                UnknownCodeHandler.f123256a.mo171329a(context, networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                C64601b.this.mo223364b(c);
                if (responseModel == null || responseModel.getData() == null) {
                    C64601b.f163062b.mo171471d("AccountAndSecurityManager", "data is null");
                    return;
                }
                BaseStepData data = responseModel.getData();
                if (data == null || data.stepInfo == null) {
                    C64601b.f163062b.mo171471d("AccountAndSecurityManager", "baseStepData is null");
                    return;
                }
                bundle.putString("ua", data.stepInfo.getString("user_agent"));
                C49157ai.m193847a(context, appendQueryParameter2.build().toString(), bundle, false);
            }
        });
    }
}
