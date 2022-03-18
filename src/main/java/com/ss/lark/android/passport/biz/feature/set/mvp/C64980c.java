package com.ss.lark.android.passport.biz.feature.set.mvp;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.entity.PwdSetPwdStepInfo;
import com.ss.lark.android.passport.biz.feature.set.SetPasswordStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.set.mvp.C64975a;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.ss.lark.android.passport.biz.feature.set.mvp.c */
public class C64980c extends AbstractC49021b<C64975a.AbstractC64976a, C64975a.AbstractC64977b, C64975a.AbstractC64977b.AbstractC64978a> {

    /* renamed from: d */
    public final Activity f163717d;

    /* renamed from: e */
    public final PwdSetPwdStepInfo f163718e;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64975a.AbstractC64977b.AbstractC64978a mo171180c() {
        return new C64981a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.lark.android.passport.biz.feature.set.mvp.c$a */
    public class C64981a implements C64975a.AbstractC64977b.AbstractC64978a {
        /* renamed from: b */
        public void mo224012b() {
            ((C64975a.AbstractC64977b) C64980c.this.mo171181d()).mo223998h();
        }

        @Override // com.ss.lark.android.passport.biz.feature.set.mvp.C64975a.AbstractC64977b.AbstractC64978a
        /* renamed from: a */
        public void mo224007a() {
            C64980c.this.f123081c.mo171465b("n_action_set_pwd_later", "start");
            ((C64975a.AbstractC64977b) C64980c.this.mo171181d()).mo223997g();
            ((C64975a.AbstractC64976a) C64980c.this.mo171182e()).mo224005a(new AbstractC49352d<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.set.mvp.C64980c.C64981a.C649832 */

                /* renamed from: a */
                public void mo145179a(BaseStepData baseStepData) {
                    C64981a.this.mo224011a(baseStepData);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    C64981a.this.mo224012b();
                }
            });
        }

        C64981a() {
        }

        /* renamed from: a */
        public void mo224011a(BaseStepData baseStepData) {
            C49092f.m193529a(C64980c.this.f163717d, baseStepData, RouterScene.ALL.value, C64980c.this.f123080b, C64980c.this.f123081c, new AbstractC49336a() {
                /* class com.ss.lark.android.passport.biz.feature.set.mvp.C64980c.C64981a.C649843 */

                @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                public void onRouterResult(int i, Object obj) {
                    C64981a.this.mo224012b();
                    ((C64975a.AbstractC64977b) C64980c.this.mo171181d()).mo223994d();
                }
            });
        }

        @Override // com.ss.lark.android.passport.biz.feature.set.mvp.C64975a.AbstractC64977b.AbstractC64978a
        /* renamed from: a */
        public void mo224008a(String str) {
            String str2;
            C64980c.this.f123081c.mo171465b("n_action_set_pwd_next", "start");
            if (!C64980c.this.mo224009a(str)) {
                if (C64980c.this.f163718e == null || TextUtils.isEmpty(C64980c.this.f163718e.regExp)) {
                    str2 = "";
                } else {
                    str2 = C64980c.this.f163718e.formatErrorText;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = C64980c.this.f163717d.getString(R.string.Lark_Settings_DescOfSetPassword);
                }
                UDToast.build(C64980c.this.f163717d).mo91643a(str2).mo91638a(17, 0, 0).mo91656k();
                if (KeyboardUtils.isSoftShowing(C64980c.this.f163717d)) {
                    KeyboardUtils.hideKeyboard(C64980c.this.f163717d);
                }
                C64980c.this.f123081c.mo171468c("n_action_set_pwd_next", "not matched");
                return;
            }
            SetPasswordStatisticsHelper.m255092a(C64980c.this.f163718e.flowType);
            ((C64975a.AbstractC64977b) C64980c.this.mo171181d()).mo223997g();
            ((C64975a.AbstractC64976a) C64980c.this.mo171182e()).mo224006a(str, new AbstractC49352d<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.set.mvp.C64980c.C64981a.C649821 */

                /* renamed from: a */
                public void mo145179a(BaseStepData baseStepData) {
                    C64981a.this.mo224011a(baseStepData);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    C64981a.this.mo224012b();
                    if (networkErrorResult.getErrorCode() == 4203) {
                        ((C64975a.AbstractC64977b) C64980c.this.mo171181d()).mo223995e();
                        ((C64975a.AbstractC64977b) C64980c.this.mo171181d()).mo223996f();
                        if (KeyboardUtils.isSoftShowing(C64980c.this.f163717d)) {
                            KeyboardUtils.hideKeyboard(C64980c.this.f163717d);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo224009a(String str) {
        PwdSetPwdStepInfo pwdSetPwdStepInfo = this.f163718e;
        if (pwdSetPwdStepInfo == null || TextUtils.isEmpty(pwdSetPwdStepInfo.regExp)) {
            this.f123081c.mo171465b("n_action_set_pwd_next", "pattern or step is empty");
            return true;
        } else if (TextUtils.isEmpty(str)) {
            this.f123081c.mo171471d("n_action_set_pwd_next", "new pwd is empty");
            return false;
        } else {
            try {
                return str.matches(this.f163718e.regExp);
            } catch (PatternSyntaxException e) {
                PassportLog passportLog = this.f123081c;
                passportLog.mo171462a("n_action_set_pwd_next", "pattern syntax is invalid, regex = " + this.f163718e.regExp, e);
                return true;
            }
        }
    }

    public C64980c(C64979b bVar, SetNewPasswordView setNewPasswordView, Activity activity, UniContext uniContext, PwdSetPwdStepInfo pwdSetPwdStepInfo, PassportLog passportLog) {
        super(bVar, setNewPasswordView, uniContext, passportLog);
        this.f163717d = activity;
        this.f163718e = pwdSetPwdStepInfo;
    }
}
