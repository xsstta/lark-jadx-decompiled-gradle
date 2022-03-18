package com.ss.android.lark.profile.func.profile_setting;

import com.bytedance.lark.pb.contact.v2.UserContactStatus;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0014J\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IModel;", "Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IView;", "Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IView$IDelegate;", "model", "view", "(Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IModel;Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IView;)V", "create", "", "createViewDelegate", "getProfileSettingFinishResult", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingFinishResult;", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.profile_setting.e */
public final class ProfileSettingPresenter extends BasePresenter<IProfileSettingContract.IModel, IProfileSettingContract.IView, IProfileSettingContract.IView.IDelegate> {

    /* renamed from: a */
    public static final Companion f129899a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingPresenter$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IProfileSettingContract.IView.IDelegate createViewDelegate() {
        return new C52447b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/profile_setting/ProfileSettingPresenter$createViewDelegate$1", "Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IView$IDelegate;", "onBlockItemClick", "", "isBlocked", "", "onDeleteContactClick", "onPhoneCallTimeSettingItemClick", "onReportItemClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.e$b */
    public static final class C52447b implements IProfileSettingContract.IView.IDelegate {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingPresenter f129900a;

        @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IView.IDelegate
        /* renamed from: c */
        public void mo179439c() {
            ProfileHitPoint.m204728h("delete");
            ProfileHitPoint.m204735o();
            UserProfileHitPointV3.f130746c.mo180599r();
            ((IProfileSettingContract.IModel) this.f129900a.getModel()).mo179423a(new C52449b(this));
        }

        @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IView.IDelegate
        /* renamed from: a */
        public void mo179436a() {
            ProfileHitPoint.m204728h("phone_query");
            IProfileSettingContract.IView bVar = (IProfileSettingContract.IView) this.f129900a.getView();
            String a = ((IProfileSettingContract.IModel) this.f129900a.getModel()).mo179422a();
            if (a == null) {
                a = "";
            }
            bVar.mo179432a(a);
        }

        @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IView.IDelegate
        /* renamed from: b */
        public void mo179438b() {
            ProfileHitPoint.m204728h("report");
            ProfileHitPoint.m204736p();
            UserProfileHitPointV3.f130746c.mo180596o();
            String e = ((IProfileSettingContract.IModel) this.f129900a.getModel()).mo179428e();
            if (e != null) {
                ((IProfileSettingContract.IView) this.f129900a.getView()).mo179434b(e);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/profile/func/profile_setting/ProfileSettingPresenter$createViewDelegate$1$onDeleteContactClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.profile_setting.e$b$b */
        public static final class C52449b implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C52447b f129903a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C52449b(C52447b bVar) {
                this.f129903a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((IProfileSettingContract.IModel) this.f129903a.f129900a.getModel()).mo179427d();
                ((IProfileSettingContract.IView) this.f129903a.f129900a.getView()).mo179430a();
                C57783ah.m224245a().mo196093a(R.id.UiMessageExternalContactUsingItem, UserContactStatus.CONTACT_STATUS_NOT_FRIEND);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("ProfileSettingPresenter", errorResult.getDebugMsg());
                String string = UIHelper.getString(R.string.Lark_Legacy_DeleteFail);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Lark_Legacy_DeleteFail)");
                ((IProfileSettingContract.IView) this.f129903a.f129900a.getView()).mo179435c(string);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52447b(ProfileSettingPresenter eVar) {
            this.f129900a = eVar;
        }

        @Override // com.ss.android.lark.profile.func.profile_setting.IProfileSettingContract.IView.IDelegate
        /* renamed from: a */
        public void mo179437a(boolean z) {
            String str;
            if (z) {
                str = "block";
            } else {
                str = "unblock";
            }
            ProfileHitPoint.m204728h(str);
            ((IProfileSettingContract.IModel) this.f129900a.getModel()).mo179424a(z, new C52448a(this, z));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/profile/func/profile_setting/ProfileSettingPresenter$createViewDelegate$1$onBlockItemClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.profile_setting.e$b$a */
        public static final class C52448a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C52447b f129901a;

            /* renamed from: b */
            final /* synthetic */ boolean f129902b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("ProfileSettingPresenter", errorResult.getDebugMsg());
                String string = UIHelper.getString(R.string.Lark_Setting_PrivacySetupFailed);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…tting_PrivacySetupFailed)");
                ((IProfileSettingContract.IView) this.f129901a.f129900a.getView()).mo179435c(string);
                ((IProfileSettingContract.IView) this.f129901a.f129900a.getView()).mo179433a(!this.f129902b);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (!this.f129902b) {
                    String a = C57859q.m224565a(((IProfileSettingContract.IModel) this.f129901a.f129900a.getModel()).mo179422a());
                    Intrinsics.checkExpressionValueIsNotNull(a, "EncryptUtils.uidEncrypto…model.getCurrentUserId())");
                    ProfileHitPoint.m204721e(a);
                    UserProfileHitPointV3.f130746c.mo180598q();
                    String string = UIHelper.getString(R.string.Lark_NewContacts_UnblockedSuccessfully);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ts_UnblockedSuccessfully)");
                    ((IProfileSettingContract.IView) this.f129901a.f129900a.getView()).mo179435c(string);
                    return;
                }
                String a2 = C57859q.m224565a(((IProfileSettingContract.IModel) this.f129901a.f129900a.getModel()).mo179422a());
                Intrinsics.checkExpressionValueIsNotNull(a2, "EncryptUtils.uidEncrypto…model.getCurrentUserId())");
                ProfileHitPoint.m204718d(a2);
                UserProfileHitPointV3.f130746c.mo180597p();
                String string2 = UIHelper.getString(R.string.Lark_NewContacts_BlockedSuccessfully);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…acts_BlockedSuccessfully)");
                ((IProfileSettingContract.IView) this.f129901a.f129900a.getView()).mo179435c(string2);
            }

            C52448a(C52447b bVar, boolean z) {
                this.f129901a = bVar;
                this.f129902b = z;
            }
        }
    }

    /* renamed from: a */
    public final ProfileSettingFinishResult mo179451a() {
        return new ProfileSettingFinishResult(((IProfileSettingContract.IModel) getModel()).mo179426c(), ((IProfileSettingContract.IModel) getModel()).mo179425b());
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IProfileSettingContract.IView) getView()).mo179431a(((IProfileSettingContract.IModel) getModel()).mo179429f());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileSettingPresenter(IProfileSettingContract.IModel aVar, IProfileSettingContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
    }
}
