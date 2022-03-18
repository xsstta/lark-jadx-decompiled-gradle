package com.ss.android.lark.profile.func.user_profile.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.lark.pb.contact.v2.UserContactStatus;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.dto.ProfileFinishResult;
import com.ss.android.lark.profile.func.add_friend.UserAuthorityUtils;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingFinishResult;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingInitData;
import com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import com.ss.android.lark.profile.func.user_profile.infos.alias.AliasItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.phone_number.PhoneNumberItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.status.StatusItemViewData;
import com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.profile.statistics.ProfileSlardarHitPoint;
import com.ss.android.lark.profile.statistics.UserProfilePerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002&'B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u00020\u0010H\u0002J \u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!J\b\u0010\"\u001a\u00020\u0010H\u0002J\u0016\u0010#\u001a\u00020\u00102\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020!R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IModel;", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IView;", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IView$IDelegate;", "model", "view", "(Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IModel;Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IView;)V", "mGetLocalDataFailed", "", "mGetNetDataFailed", "mLocalInfoDataEmpty", "mNetDataShow", "mNetInfoDataEmpty", "needRefreshNameCardDataResult", "create", "", "createModelDelegate", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IModel$IModelDelegate;", "createViewDelegate", "getListString", "", "infoViewDataList", "", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "getProfileFinishResult", "Lcom/ss/android/lark/profile/dto/ProfileFinishResult;", "loadFromNet", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "reload", "sendProfileViewHitPoint", "setNeedRefreshFinishResult", "intent", "Companion", "ViewDelegate", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.b.c */
public final class UserProfilePresenter extends BasePresenter<IUserProfileContract.IModel, IUserProfileContract.IView, IUserProfileContract.IView.IDelegate> {

    /* renamed from: g */
    public static final Companion f130077g = new Companion(null);

    /* renamed from: a */
    public boolean f130078a;

    /* renamed from: b */
    public boolean f130079b;

    /* renamed from: c */
    public boolean f130080c;

    /* renamed from: d */
    public boolean f130081d;

    /* renamed from: e */
    public boolean f130082e;

    /* renamed from: f */
    public boolean f130083f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter$Companion;", "", "()V", "INVALID_DEVICE", "", "SECRET_UN_ENABLE", "TAG", "", "VERSION_PROFILE_OLD", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0012\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0018H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0011H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J\b\u00100\u001a\u00020\u0004H\u0016¨\u00061"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter$ViewDelegate;", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IView$IDelegate;", "(Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter;)V", "doDeleteNameCard", "", "getRecogniseSpansResult", "description", "", "onAcceptBtnClick", "context", "Landroid/content/Context;", "onAddContactBtnClick", "onAliasItemClick", "alias", "onAvatarClick", "avatarKey", "clickView", "Landroid/view/View;", "onCallBtnClick", "activity", "Landroid/app/Activity;", "onCreateNameCard", "onCreateP2pSecretChat", "isFirst", "", "onCtaChatClick", "onCtaCryptoChatClick", "onCtaPhoneClick", "onCtaVideoClick", "onEditNameCardClick", "onEmergencyCallClick", "onEnterprisePhoneCallClick", "onGuideClick", "key", "onLinkItemClicked", ShareHitPoint.f121869d, "onMessageClickHitPoint", "onPhoneCallClick", "onPhoneCallTimeSetMenuClick", "onPhoneNumberItemClick", "phoneNumber", "isCompleted", "onReportMenuClick", "onShareProfileClick", "onShowPhoneNumberClick", "onTitleBarRightClick", "anchorView", "onVcNoRightsError", "onVoiceCallClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$b */
    public final class ViewDelegate implements IUserProfileContract.IView.IDelegate {
        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: a */
        public void mo179700a(boolean z) {
            ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179632b(new C52570d(this, z));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$b$e */
        static final class C52571e<T> implements C57865c.AbstractC57873d<T> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f130092a;

            C52571e(ViewDelegate bVar) {
                this.f130092a = bVar;
            }

            /* renamed from: a */
            public final boolean mo179741a() {
                return ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179640g();
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public /* synthetic */ Object produce() {
                return Boolean.valueOf(mo179741a());
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: d */
        public void mo179707d() {
            String b = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b();
            if (b != null) {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179690g(b);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: e */
        public void mo179709e() {
            String b = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b();
            if (b != null) {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179684c(b);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: f */
        public void mo179710f() {
            String b = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b();
            if (b != null) {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179686d(b);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: g */
        public void mo179711g() {
            String b = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b();
            if (b != null) {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179688e(b);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: h */
        public void mo179712h() {
            String b = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b();
            if (b != null) {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179689f(b);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: i */
        public void mo179713i() {
            String b = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b();
            if (b != null) {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179692i(b);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: j */
        public void mo179714j() {
            String y = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179658y();
            if (y != null) {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179691h(y);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: n */
        public void mo179718n() {
            ProfileHitPoint.m204707a(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179615C(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179614B());
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: o */
        public void mo179719o() {
            ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179637d(new C52566a(this));
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: b */
        public void mo179701b() {
            boolean h = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179641h();
            ProfileHitPoint.m204716c(h);
            C57865c.m224575a(new C52571e(this), new C52572f(this, h), C52573g.f130095a);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: c */
        public void mo179704c() {
            ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179678a(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179644k(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179643j(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179646m(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179645l());
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: k */
        public void mo179715k() {
            ProfileContent profileContent = new ProfileContent();
            profileContent.setId(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b());
            profileContent.setDisplayName(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179639f());
            profileContent.setAvatarKey(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179655v());
            ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179664a(profileContent);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: a */
        public void mo179693a() {
            String b = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b();
            if (!(!TextUtils.isEmpty(b))) {
                b = null;
            }
            if (b != null) {
                if (((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179656w()) {
                    ProfileHitPoint.m204723f();
                }
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179671a(b, ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179653t());
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: m */
        public void mo179717m() {
            ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179665a(new Contact(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179655v(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179639f()), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179653t());
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: l */
        public void mo179716l() {
            if (!C52239a.m202617d().mo133561a("lark.client.contact.opt")) {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179674a(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179654u(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179652s(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179653t());
            } else if (((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b() == null || TextUtils.isEmpty(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b())) {
                Log.m165383e("UserProfilePresenter", "user id is null or empty");
            } else {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179676a(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179654u(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179652s(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179639f(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179653t(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179617E(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179616D());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter$ViewDelegate$onAcceptBtnClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$b$c */
        public static final class C52568c implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f130087a;

            /* renamed from: b */
            final /* synthetic */ Context f130088b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter$ViewDelegate$onAcceptBtnClick$1$onSuccess$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$b$c$a */
            public static final class C52569a implements IGetDataCallback<UserProfileViewData> {

                /* renamed from: a */
                final /* synthetic */ C52568c f130089a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C52569a(C52568c cVar) {
                    this.f130089a = cVar;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    Log.m165383e("UserProfilePresenter", errorResult.getDebugMsg());
                }

                /* renamed from: a */
                public void onSuccess(UserProfileViewData eVar) {
                    if (eVar != null) {
                        ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179668a(eVar);
                    }
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("UserProfilePresenter", errorResult.getDebugMsg());
                if (errorResult.getErrorCode() == UserAuthorityUtils.f129641a.mo179073a()) {
                    UserAuthorityUtils.f129641a.mo179074a(this.f130088b, errorResult);
                    return;
                }
                String displayMsg = errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ProfileAcceptVerificationFailed));
                Intrinsics.checkExpressionValueIsNotNull(displayMsg, "err.getDisplayMsg(\n     …cceptVerificationFailed))");
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179680b(displayMsg);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ActionBtnViewData actionBtnViewData = new ActionBtnViewData(0, false, false, 7, null);
                actionBtnViewData.mo179600a(1);
                ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179622a(1);
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179667a(actionBtnViewData);
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179683c();
                ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179625a(new C52569a(this));
                C57783ah.m224245a().mo196093a(R.id.UiMessageExternalContactUsingItem, UserContactStatus.CONTACT_STATUS_RECEIVE);
            }

            C52568c(ViewDelegate bVar, Context context) {
                this.f130087a = bVar;
                this.f130088b = context;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter$ViewDelegate$doDeleteNameCard$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$b$a */
        public static final class C52566a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f130085a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C52566a(ViewDelegate bVar) {
                this.f130085a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179662a(R.string.Lark_Contacts_UnableToDeleteToast);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                UserProfilePresenter.this.f130083f = true;
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179662a(R.string.Lark_Contacts_DeletedToast);
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179661a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter$ViewDelegate$onShowPhoneNumberClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$b$h */
        public static final class C52574h implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f130096a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C52574h(ViewDelegate bVar) {
                this.f130096a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("UserProfilePresenter", errorResult.getDebugMsg());
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179662a(R.string.Lark_Legacy_ProfileDetailGettingPhoneFailed);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                PhoneNumberItemViewData r = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179651r();
                if (r != null) {
                    r.mo179908a(true);
                    r.mo179907a(str);
                    ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179669a(r);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$b$g */
        static final class C52573g<T> implements C57865c.AbstractC57871b<Throwable> {

            /* renamed from: a */
            public static final C52573g f130095a = new C52573g();

            C52573g() {
            }

            /* renamed from: a */
            public final void consume(Throwable th) {
                Log.m165383e("UserProfilePresenter", th.getMessage());
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: a */
        public void mo179694a(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179624a(activity, new C52574h(this));
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: b */
        public void mo179702b(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "context");
            ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179623a(activity);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: c */
        public void mo179705c(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "context");
            ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179631b(activity);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter$ViewDelegate$onCreateP2pSecretChat$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$b$d */
        public static final class C52570d implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f130090a;

            /* renamed from: b */
            final /* synthetic */ boolean f130091b;

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (this.f130091b) {
                    ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179642i();
                }
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179670a(str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("UserProfilePresenter", "create secret chat failed: " + errorResult.getErrorCode() + " , " + errorResult.getDebugMsg());
                if (errorResult.getErrorCode() == 4051) {
                    IProfileModuleDependency d = C52239a.m202617d();
                    Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                    d.mo133586p().mo133615e(errorResult.getDisplayMsg());
                } else if (errorResult.getErrorCode() == 5101) {
                    String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Chat_CantStaretSecretChatLongTimeNoLoggin);
                    Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…cretChatLongTimeNoLoggin)");
                    ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179680b(mustacheFormat);
                } else if (errorResult.getErrorCode() != 6003 || TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    String displayMsg = errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ProfileDetailCreateSecretChatFailed));
                    Intrinsics.checkExpressionValueIsNotNull(displayMsg, "err.getDisplayMsg(UIHelp…lCreateSecretChatFailed))");
                    ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179680b(displayMsg);
                } else {
                    String displayMsg2 = errorResult.getDisplayMsg();
                    if (displayMsg2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(displayMsg2, "it");
                        ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179680b(displayMsg2);
                    }
                }
            }

            C52570d(ViewDelegate bVar, boolean z) {
                this.f130090a = bVar;
                this.f130091b = z;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "consume", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$b$f */
        static final class C52572f<T> implements C57865c.AbstractC57871b<T> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f130093a;

            /* renamed from: b */
            final /* synthetic */ boolean f130094b;

            C52572f(ViewDelegate bVar, boolean z) {
                this.f130093a = bVar;
                this.f130094b = z;
            }

            /* renamed from: a */
            public final void consume(Boolean bool) {
                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                if (bool.booleanValue()) {
                    ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179677a(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179639f(), this.f130094b);
                } else {
                    this.f130093a.mo179700a(false);
                }
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: a */
        public void mo179695a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            ProfileHitPoint.f130738a.mo180539a(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179617E(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179616D());
            ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179634c(new C52568c(this, context));
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: d */
        public void mo179708d(String str) {
            if (str != null) {
                ProfileHitPoint.m204706a(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179615C(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179653t().getSourceType(), str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "result", "", "", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/widget/span/RecogniseSpansResult;", "", "callBackRecognizeSpanResult"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$b$b */
        static final class C52567b implements C37030f.AbstractC37031a {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f130086a;

            C52567b(ViewDelegate bVar) {
                this.f130086a = bVar;
            }

            @Override // com.ss.android.lark.C37030f.AbstractC37031a
            /* renamed from: a */
            public final void mo136555a(Map<String, RecogniseSpansResult> map) {
                if (map != null && map.get(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b()) != null && ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179621a(map.get(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b())) != null) {
                    IUserProfileContract.IView bVar = (IUserProfileContract.IView) UserProfilePresenter.this.getView();
                    StatusItemViewData a = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179621a(map.get(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b()));
                    if (a == null) {
                        Intrinsics.throwNpe();
                    }
                    bVar.mo179669a(a);
                }
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: b */
        public void mo179703b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "description");
            ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179628a(str, new C52567b(this));
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: c */
        public void mo179706c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179633b(str);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: a */
        public void mo179697a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "anchorView");
            if (((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179619G()) {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179679b();
            } else if (C52239a.m202617d().mo133561a("lark.client.contact.opt")) {
                ProfileSettingInitData q = ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179650q();
                if (q != null) {
                    ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179666a(q);
                }
            } else {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179663a(view, ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179649p(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179647n(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179648o());
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: a */
        public void mo179698a(String str) {
            ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179675a(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179639f(), ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179654u(), str);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: a */
        public void mo179699a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
            if (((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179635c()) {
                Log.m165389i("UserProfilePresenter", "could not call self");
            } else if (!z || TextUtils.isEmpty(str)) {
                Log.m165389i("UserProfilePresenter", "phoneNumber is not Completed");
            } else {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179672a(((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179639f(), str);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IView.IDelegate
        /* renamed from: a */
        public void mo179696a(Context context, String str, View view) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "avatarKey");
            Intrinsics.checkParameterIsNotNull(view, "clickView");
            if (!NetworkUtils.isNetworkAvailable(context)) {
                Log.m165383e("UserProfilePresenter", "Network error ，open avatar failed");
            } else if (((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179635c()) {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179673a(str, ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b(), view);
            } else {
                ((IUserProfileContract.IView) UserProfilePresenter.this.getView()).mo179682b(str, ((IUserProfileContract.IModel) UserProfilePresenter.this.getModel()).mo179630b(), view);
            }
        }
    }

    /* renamed from: c */
    private final IUserProfileContract.IModel.IModelDelegate m203679c() {
        return new C52578f(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IUserProfileContract.IView.IDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    /* renamed from: e */
    private final void m203681e() {
        this.f130081d = true;
        this.f130083f = true;
        m203680d();
    }

    /* renamed from: b */
    public final ProfileFinishResult mo179735b() {
        return ((IUserProfileContract.IModel) getModel()).mo179613A();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData;", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$c */
    public static final class C52575c<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ UserProfilePresenter f130097a;

        C52575c(UserProfilePresenter cVar) {
            this.f130097a = cVar;
        }

        /* renamed from: a */
        public final UserProfileViewData produce() {
            UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180608a();
            return ((IUserProfileContract.IModel) this.f130097a.getModel()).mo179620a();
        }
    }

    /* renamed from: d */
    private final void m203680d() {
        UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180613c();
        ((IUserProfileContract.IModel) getModel()).mo179625a(new C52580h(this));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f130079b = false;
        this.f130080c = false;
        this.f130081d = false;
        this.f130082e = false;
        C57865c.m224575a(new C52575c(this), new C52576d(this), new C52577e(this));
        m203680d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter$createModelDelegate$1", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IModel$IModelDelegate;", "onMineAvatarUpdate", "", "profileChatter", "Lcom/ss/android/lark/profile/dto/ProfileChatter;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$f */
    public static final class C52578f implements IUserProfileContract.IModel.IModelDelegate {

        /* renamed from: a */
        final /* synthetic */ UserProfilePresenter f130100a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52578f(UserProfilePresenter cVar) {
            this.f130100a = cVar;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel.IModelDelegate
        /* renamed from: a */
        public void mo179660a(ProfileChatter profileChatter) {
            Intrinsics.checkParameterIsNotNull(profileChatter, "profileChatter");
            String avatarKey = profileChatter.getAvatarKey();
            Intrinsics.checkExpressionValueIsNotNull(avatarKey, "profileChatter.avatarKey");
            String id = profileChatter.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "profileChatter.id");
            ((IUserProfileContract.IView) this.f130100a.getView()).mo179681b(avatarKey, id);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter$loadFromNet$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$h */
    public static final class C52580h implements IGetDataCallback<UserProfileViewData> {

        /* renamed from: a */
        final /* synthetic */ UserProfilePresenter f130101a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52580h(UserProfilePresenter cVar) {
            this.f130101a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(UserProfileViewData eVar) {
            List<BaseInfoViewData> list;
            UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180614d();
            if (eVar != null) {
                boolean z = true;
                this.f130101a.f130078a = true;
                this.f130101a.f130082e = CollectionUtils.isEmpty(eVar.mo179785c());
                if (!this.f130101a.f130082e || !this.f130101a.f130081d) {
                    z = false;
                }
                eVar.mo179782a(z);
                ((IUserProfileContract.IView) this.f130101a.getView()).mo179668a(eVar);
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180621k();
                UserProfilePresenter cVar = this.f130101a;
                if (cVar.f130082e) {
                    list = CollectionsKt.emptyList();
                } else {
                    list = eVar.mo179785c();
                }
                cVar.mo179734a(list);
            }
            ProfileSlardarHitPoint.f130742b.mo180549c();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UserProfilePresenter", errorResult.getDebugMsg());
            UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180614d();
            this.f130101a.f130082e = true;
            this.f130101a.f130080c = true;
            if (this.f130101a.f130079b) {
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180609a(1);
                ((IUserProfileContract.IView) this.f130101a.getView()).mo179685d();
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180621k();
            } else if (this.f130101a.f130081d) {
                ((IUserProfileContract.IView) this.f130101a.getView()).mo179687e();
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180621k();
            }
            ProfileSlardarHitPoint.f130742b.mo180549c();
            UserProfilePresenter.m203678a(this.f130101a, null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter$onActivityResult$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$i */
    public static final class C52581i implements IGetDataCallback<UserProfileViewData> {

        /* renamed from: a */
        final /* synthetic */ UserProfilePresenter f130102a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52581i(UserProfilePresenter cVar) {
            this.f130102a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(UserProfileViewData eVar) {
            if (eVar != null) {
                ((IUserProfileContract.IView) this.f130102a.getView()).mo179668a(eVar);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UserProfilePresenter", errorResult.getDebugMsg());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$g */
    public static final class C52579g extends Lambda implements Function1<BaseInfoViewData, String> {
        public static final C52579g INSTANCE = new C52579g();

        C52579g() {
            super(1);
        }

        public final String invoke(BaseInfoViewData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return bVar.mo179590d();
        }
    }

    /* renamed from: a */
    public final void mo179733a(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        if (this.f130083f) {
            intent.putExtra("card_edited", true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$j */
    public static final class C52582j extends Lambda implements Function1<JSONObject, JSONObject> {
        final /* synthetic */ List $infoViewDataList;
        final /* synthetic */ UserProfilePresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52582j(UserProfilePresenter cVar, List list) {
            super(1);
            this.this$0 = cVar;
            this.$infoViewDataList = list;
        }

        public final JSONObject invoke(JSONObject jSONObject) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(jSONObject, "$receiver");
            List list = this.$infoViewDataList;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                jSONObject.put("contain_module", this.this$0.mo179736b(this.$infoViewDataList));
            }
            return jSONObject;
        }
    }

    /* renamed from: b */
    public final String mo179736b(List<? extends BaseInfoViewData> list) {
        if (list.isEmpty()) {
            return "none";
        }
        return CollectionsKt.joinToString$default(list, ",", null, null, 0, null, C52579g.INSTANCE, 30, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData;", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$d */
    public static final class C52576d<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ UserProfilePresenter f130098a;

        C52576d(UserProfilePresenter cVar) {
            this.f130098a = cVar;
        }

        /* renamed from: a */
        public final void consume(UserProfileViewData eVar) {
            boolean z;
            UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180611b();
            if (this.f130098a.f130078a) {
                Log.m165389i("UserProfilePresenter", "net work data return first");
            } else if (eVar != null) {
                this.f130098a.f130081d = CollectionUtils.isEmpty(eVar.mo179785c());
                if (!this.f130098a.f130082e || !this.f130098a.f130081d) {
                    z = false;
                } else {
                    z = true;
                }
                eVar.mo179782a(z);
                ((IUserProfileContract.IView) this.f130098a.getView()).mo179668a(eVar);
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180621k();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.c$e */
    public static final class C52577e<T> implements C57865c.AbstractC57871b<Throwable> {

        /* renamed from: a */
        final /* synthetic */ UserProfilePresenter f130099a;

        C52577e(UserProfilePresenter cVar) {
            this.f130099a = cVar;
        }

        /* renamed from: a */
        public final void consume(Throwable th) {
            UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180611b();
            this.f130099a.f130079b = true;
            this.f130099a.f130081d = true;
            Log.m165383e("UserProfilePresenter", "fetch local data error ：" + th.getMessage());
            if (this.f130099a.f130080c) {
                ((IUserProfileContract.IView) this.f130099a.getView()).mo179685d();
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180612b(1);
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180621k();
            } else if (this.f130099a.f130082e) {
                ((IUserProfileContract.IView) this.f130099a.getView()).mo179687e();
                UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180621k();
            }
        }
    }

    /* renamed from: a */
    public final void mo179734a(List<? extends BaseInfoViewData> list) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(list, "infoViewDataList");
        int sourceType = ((IUserProfileContract.IModel) getModel()).mo179653t().getSourceType();
        String C = ((IUserProfileContract.IModel) getModel()).mo179615C();
        String B = ((IUserProfileContract.IModel) getModel()).mo179614B();
        boolean c = ((IUserProfileContract.IModel) getModel()).mo179635c();
        if (TextUtils.isEmpty(((IUserProfileContract.IModel) getModel()).mo179638e()) || !((IUserProfileContract.IModel) getModel()).mo179617E()) {
            z = false;
        } else {
            z = true;
        }
        ProfileHitPoint.m204698a(sourceType, C, B, c, z, ((IUserProfileContract.IModel) getModel()).mo179616D(), ((IUserProfileContract.IModel) getModel()).mo179618F());
        int sourceType2 = ((IUserProfileContract.IModel) getModel()).mo179653t().getSourceType();
        String C2 = ((IUserProfileContract.IModel) getModel()).mo179615C();
        String B2 = ((IUserProfileContract.IModel) getModel()).mo179614B();
        boolean c2 = ((IUserProfileContract.IModel) getModel()).mo179635c();
        if (TextUtils.isEmpty(((IUserProfileContract.IModel) getModel()).mo179638e()) || !((IUserProfileContract.IModel) getModel()).mo179617E()) {
            z2 = false;
        } else {
            z2 = true;
        }
        ProfileHitPoint.m204699a(sourceType2, C2, B2, c2, z2, ((IUserProfileContract.IModel) getModel()).mo179616D(), ((IUserProfileContract.IModel) getModel()).mo179618F(), new C52582j(this, list));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserProfilePresenter(IUserProfileContract.IModel aVar, IUserProfileContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        aVar.mo179626a(m203679c());
    }

    /* renamed from: a */
    public final void mo179732a(int i, int i2, Intent intent) {
        Serializable serializableExtra;
        ActionBtnViewData z;
        if (i2 == -1) {
            Boolean bool = null;
            String str = null;
            String str2 = null;
            if (i == 1) {
                if (intent != null) {
                    bool = Boolean.valueOf(intent.getBooleanExtra("card_edited", false));
                }
                if (bool != null && bool.booleanValue()) {
                    m203681e();
                }
            } else if (i == 529) {
                AliasItemViewData d = ((IUserProfileContract.IModel) getModel()).mo179636d();
                if (d != null) {
                    if (intent != null) {
                        str2 = intent.getStringExtra("result_alias");
                    }
                    d.mo179853a(str2);
                    ((IUserProfileContract.IModel) getModel()).mo179627a(d.mo179854b());
                    ((IUserProfileContract.IView) getView()).mo179669a(d);
                }
            } else if (i == 4842) {
                ((IUserProfileContract.IModel) getModel()).mo179622a(2);
                IUserProfileContract.IModel aVar = (IUserProfileContract.IModel) getModel();
                if (intent != null) {
                    str = intent.getStringExtra("key_result_alias");
                }
                aVar.mo179627a(str);
                AliasItemViewData d2 = ((IUserProfileContract.IModel) getModel()).mo179636d();
                if (d2 != null) {
                    ((IUserProfileContract.IView) getView()).mo179669a(d2);
                }
                ActionBtnViewData z2 = ((IUserProfileContract.IModel) getModel()).mo179659z();
                if (z2 != null) {
                    ((IUserProfileContract.IView) getView()).mo179667a(z2);
                }
                ((IUserProfileContract.IView) getView()).mo179661a();
            } else if (i != 7914) {
                if (i == 8941 && (z = ((IUserProfileContract.IModel) getModel()).mo179659z()) != null) {
                    z.mo179600a(2);
                    ((IUserProfileContract.IModel) getModel()).mo179622a(2);
                    ((IUserProfileContract.IView) getView()).mo179667a(z);
                }
            } else if (intent != null && (serializableExtra = intent.getSerializableExtra("params_key_profile_setting")) != null) {
                Intrinsics.checkExpressionValueIsNotNull(serializableExtra, "data?.getSerializableExt…ROFILE_SETTING) ?: return");
                if (serializableExtra != null) {
                    ProfileSettingFinishResult profileSettingFinishResult = (ProfileSettingFinishResult) serializableExtra;
                    boolean isDeleted = profileSettingFinishResult.isDeleted();
                    if (profileSettingFinishResult.isDeleted()) {
                        ((IUserProfileContract.IModel) getModel()).mo179622a(4);
                    }
                    if (((IUserProfileContract.IModel) getModel()).mo179657x() != profileSettingFinishResult.isBlocked()) {
                        ((IUserProfileContract.IModel) getModel()).mo179629a(profileSettingFinishResult.isBlocked(), new C52581i(this));
                    }
                    if (isDeleted) {
                        ((IUserProfileContract.IView) getView()).mo179661a();
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.func.profile_setting.ProfileSettingFinishResult");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.profile.func.user_profile.b.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m203678a(UserProfilePresenter cVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        cVar.mo179734a(list);
    }
}
