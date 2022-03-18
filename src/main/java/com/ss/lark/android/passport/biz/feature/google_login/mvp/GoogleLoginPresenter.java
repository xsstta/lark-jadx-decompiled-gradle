package com.ss.lark.android.passport.biz.feature.google_login.mvp;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.feature.google_login.mvp.IGoogleLoginContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00122\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004:\u0001\u0012B'\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0004H\u0014J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/GoogleLoginPresenter;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BasePresenter;", "Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IModel;", "Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IView;", "Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IView$Delegate;", "model", "view", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "(Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IModel;Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IView;Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;Lcom/ss/android/lark/passport/infra/log/PassportLog;)V", "createViewDelegate", "sdkLogin", "", "flowType", "", "token", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.google_login.a.b */
public final class GoogleLoginPresenter extends AbstractC49021b<IGoogleLoginContract.IModel, IGoogleLoginContract.IView, IGoogleLoginContract.IView.Delegate> implements IGoogleLoginContract.IView.Delegate {

    /* renamed from: d */
    public static final Companion f163349d = new Companion(null);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public IGoogleLoginContract.IView.Delegate mo171180c() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/GoogleLoginPresenter$Companion;", "", "()V", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.google_login.a.b$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/google_login/mvp/GoogleLoginPresenter$sdkLogin$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "onError", "", "errorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.google_login.a.b$b */
    public static final class C64775b implements AbstractC49352d<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ GoogleLoginPresenter f163350a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.google_login.a.b$b$a */
        public static final class C64776a extends Lambda implements Function0<Unit> {
            final /* synthetic */ C64775b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C64776a(C64775b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                ((IGoogleLoginContract.IView) this.this$0.f163350a.mo171181d()).mo223655e();
                ((IGoogleLoginContract.IView) this.this$0.f163350a.mo171181d()).mo223656f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64775b(GoogleLoginPresenter bVar) {
            this.f163350a = bVar;
        }

        /* renamed from: a */
        public void mo145179a(BaseStepData baseStepData) {
            if (baseStepData != null) {
                PassportLog passportLog = this.f163350a.f123081c;
                passportLog.mo171465b("n_action_idp_auth_sdk_suc", "sdk login success, next: " + baseStepData.nextStep);
                ((IGoogleLoginContract.IView) this.f163350a.mo171181d()).mo223652a(baseStepData, new C64776a(this));
                return;
            }
            this.f163350a.f123081c.mo171471d("n_action_idp_auth_sdk_failed", "sdk login step is null");
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            PassportLog passportLog = this.f163350a.f123081c;
            passportLog.mo171471d("n_action_idp_auth_sdk_failed", "sdk login error, " + networkErrorResult);
            ((IGoogleLoginContract.IView) this.f163350a.mo171181d()).mo223655e();
            ((IGoogleLoginContract.IView) this.f163350a.mo171181d()).mo223656f();
        }
    }

    /* renamed from: a */
    public void mo223649a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "token");
        this.f123081c.mo171465b("n_action_idp_auth_sdk", "sdk login request start");
        ((IGoogleLoginContract.IView) mo171181d()).mo223654d();
        ((IGoogleLoginContract.IModel) mo171182e()).mo223648a(str, str2, new C64775b(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoogleLoginPresenter(IGoogleLoginContract.IModel aVar, IGoogleLoginContract.IView bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(passportLog, "log");
    }
}
