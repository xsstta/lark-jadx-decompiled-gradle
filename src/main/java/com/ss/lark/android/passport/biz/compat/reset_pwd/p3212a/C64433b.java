package com.ss.lark.android.passport.biz.compat.reset_pwd.p3212a;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.perf.C49099a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract;
import com.ss.lark.android.passport.biz.compat.reset_pwd.p3212a.C64433b;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.SetPwdData;
import com.ss.lark.android.passport.biz.compat.v2.http.common.UnknownCodeHandler;

/* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.b */
public class C64433b extends AbstractC49021b<ISetPasswordContract.IModel, ISetPasswordContract.IView, ISetPasswordContract.IView.Delegate> {

    /* renamed from: d */
    public final Activity f162740d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ISetPasswordContract.IView.Delegate mo171180c() {
        return new C64435a();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        ((ISetPasswordContract.IView) mo171181d()).mo223001a(((ISetPasswordContract.IModel) mo171182e()).ce_());
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.b$a */
    public class C64435a implements ISetPasswordContract.IView.Delegate {
        public C64435a() {
        }

        @Override // com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract.IView.Delegate
        /* renamed from: a */
        public void mo223006a(String str, String str2) {
            C64433b.this.mo223008a(str, str2);
        }
    }

    /* renamed from: a */
    public void mo223008a(String str, String str2) {
        final C49099a a = new C49099a("passport_set_pwd").mo171417a();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.f123081c.mo171471d("SetPasswordPresenter", "pwd or pwdAgain is null");
            return;
        }
        ((ISetPasswordContract.IView) mo171181d()).mo223002d();
        final ISetPasswordContract.IModel aVar = (ISetPasswordContract.IModel) mo171182e();
        ISetPasswordContract.IView bVar = (ISetPasswordContract.IView) mo171181d();
        if (aVar != null && bVar != null) {
            aVar.mo222999a(str, new AbstractC49352d<SetPwdData>() {
                /* class com.ss.lark.android.passport.biz.compat.reset_pwd.p3212a.C64433b.C644341 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m253232a() {
                    UDToast.makeToast(C64433b.this.f162740d, C64433b.this.f162740d.getString(R.string.Lark_Settings_ReminderAfterResetPassword)).show();
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    a.mo171420a("result", "other").mo171421b().mo171422c();
                    ((ISetPasswordContract.IView) C64433b.this.mo171181d()).mo223003e();
                    if (networkErrorResult.getErrorCode() == 4203) {
                        ((ISetPasswordContract.IView) C64433b.this.mo171181d()).mo223005g();
                        ((ISetPasswordContract.IView) C64433b.this.mo171181d()).mo223004f();
                        if (KeyboardUtils.isSoftShowing(C64433b.this.f162740d)) {
                            KeyboardUtils.hideKeyboard(C64433b.this.f162740d);
                        }
                    }
                    PassportLog passportLog = C64433b.this.f123081c;
                    PassportLog passportLog2 = C64433b.this.f123081c;
                    passportLog.mo171471d("SetPasswordPresenter", PassportLog.m193687a("setPwdFinish onError", networkErrorResult));
                    if (networkErrorResult != null) {
                        UnknownCodeHandler.f162912a.mo223191a(C64433b.this.f162740d, networkErrorResult);
                    }
                }

                /* renamed from: a */
                public void mo145179a(SetPwdData setPwdData) {
                    a.mo171420a("result", "success").mo171421b().mo171422c();
                    if (setPwdData != null) {
                        PassportLog passportLog = C64433b.this.f123081c;
                        passportLog.mo171465b("SetPasswordPresenter", "set pwd success" + setPwdData.nextStep);
                        ((ISetPasswordContract.IView) C64433b.this.mo171181d()).mo223003e();
                        if (aVar.ce_() != null && aVar.ce_().fromRecoverAccount) {
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.lark.android.passport.biz.compat.reset_pwd.p3212a.$$Lambda$b$1$PCaWt0_W4LnRzt8ypet6pNOFTA */

                                public final void run() {
                                    C64433b.C644341.m271524lambda$PCaWt0_W4LnRzt8ypet6pNOFTA(C64433b.C644341.this);
                                }
                            });
                        }
                        C49092f.m193529a(C64433b.this.f162740d, setPwdData, RouterScene.ALL.value, C64433b.this.f123080b, C64433b.this.f123081c, new AbstractC49336a() {
                            /* class com.ss.lark.android.passport.biz.compat.reset_pwd.p3212a.$$Lambda$b$1$lMJ2wOotNZndDovTB6NZOY_8xYo */

                            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                            public final void onRouterResult(int i, Object obj) {
                                C64433b.C644341.lambda$lMJ2wOotNZndDovTB6NZOY_8xYo(C64433b.C644341.this, i, obj);
                            }
                        });
                        return;
                    }
                    ((ISetPasswordContract.IView) C64433b.this.mo171181d()).mo223003e();
                    C64433b.this.f123081c.mo171471d("SetPasswordPresenter", "setPwdFinish data is empty");
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m253233a(int i, Object obj) {
                    if (i == -106) {
                        C64433b.this.f123081c.mo171465b("SetPasswordPresenter", "set pwd enter app success");
                        return;
                    }
                    PassportLog passportLog = C64433b.this.f123081c;
                    passportLog.mo171465b("SetPasswordPresenter", "setPwdFinish code: " + i);
                }
            });
        }
    }

    public C64433b(Activity activity, ISetPasswordContract.IModel aVar, ISetPasswordContract.IView bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f162740d = activity;
    }
}
