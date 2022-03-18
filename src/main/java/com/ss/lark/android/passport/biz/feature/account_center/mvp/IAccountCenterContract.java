package com.ss.lark.android.passport.biz.feature.account_center.mvp;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.lark.android.passport.biz.feature.account_center.UserOperationCenterInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract;", "", "IModel", "IView", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.d */
public interface IAccountCenterContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¨\u0006\u0012"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IModel;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IModel;", "getStepInfo", "Lcom/ss/lark/android/passport/biz/feature/account_center/UserOperationCenterInfo;", "officialEmailInit", "", "tenantId", "", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "switchUser", "context", "Landroid/content/Context;", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.d$a */
    public interface IModel extends AbstractC49025e {
        /* renamed from: a */
        void mo223317a(Context context, User user, IGetDataCallback<C49382d> iGetDataCallback);

        /* renamed from: a */
        void mo223318a(String str, ICallback<BaseStepData> aVar);

        /* renamed from: g */
        UserOperationCenterInfo mo223319g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\n"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IView;", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView$Delegate;", "hideLoadingView", "", "showLoadingView", "showView", "stepInfo", "Lcom/ss/lark/android/passport/biz/feature/account_center/UserOperationCenterInfo;", "Delegate", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.d$b */
    public interface IView extends AbstractC49027g<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IView$Delegate;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IView$IViewDelegate;", "clickTitleBarBack", "", "createTeam", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "joinOtherTeam", "jumpLogin", "jumpOfficialList", "personalUser", "switchUser", "context", "Landroid/content/Context;", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "verifyEmail", "tenantId", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.d$b$a */
        public interface Delegate extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo223323a();

            /* renamed from: a */
            void mo223324a(Context context, User user);

            /* renamed from: a */
            void mo223325a(BaseStepData baseStepData);

            /* renamed from: a */
            void mo223326a(String str);

            /* renamed from: b */
            void mo223327b();

            /* renamed from: b */
            void mo223328b(BaseStepData baseStepData);

            /* renamed from: c */
            void mo223329c();

            /* renamed from: c */
            void mo223330c(BaseStepData baseStepData);
        }

        /* renamed from: a */
        void mo223334a(UserOperationCenterInfo userOperationCenterInfo);

        /* renamed from: o */
        void mo223347o();

        /* renamed from: p */
        void mo223348p();
    }
}
