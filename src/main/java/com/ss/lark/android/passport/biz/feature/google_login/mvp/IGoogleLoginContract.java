package com.ss.lark.android.passport.biz.feature.google_login.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract;", "", "()V", "IModel", "IView", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.google_login.a.d */
public final class IGoogleLoginContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IModel;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IModel;", "sdkLogin", "", "flowType", "", "token", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.google_login.a.d$a */
    public interface IModel extends AbstractC49025e {
        /* renamed from: a */
        void mo223648a(String str, String str2, AbstractC49352d<BaseStepData> dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\fJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&J\b\u0010\u000b\u001a\u00020\u0004H&¨\u0006\r"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IView;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IView;", "Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IView$Delegate;", "finishActivity", "", "hideLoadingView", "routeTo", "stepData", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "callback", "Lkotlin/Function0;", "showLoadingView", "Delegate", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.google_login.a.d$b */
    public interface IView extends AbstractC49027g<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/google_login/mvp/IGoogleLoginContract$IView$Delegate;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IView$IViewDelegate;", "sdkLogin", "", "flowType", "", "token", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.google_login.a.d$b$a */
        public interface Delegate extends AbstractC49027g.AbstractC49028a {
        }

        /* renamed from: a */
        void mo223652a(BaseStepData baseStepData, Function0<Unit> function0);

        /* renamed from: d */
        void mo223654d();

        /* renamed from: e */
        void mo223655e();

        /* renamed from: f */
        void mo223656f();
    }
}
