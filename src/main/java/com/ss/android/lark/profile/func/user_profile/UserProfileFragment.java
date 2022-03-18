package com.ss.android.lark.profile.func.user_profile;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.layout.LKUIRelativeLayout;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingActivity;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingFragment;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingInitData;
import com.ss.android.lark.profile.func.user_profile.mvp.UserProfileModel;
import com.ss.android.lark.profile.func.user_profile.mvp.UserProfilePresenter;
import com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView;
import com.ss.android.lark.profile.service.C52904e;
import com.ss.android.lark.profile.statistics.UserProfilePerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.widget.photo_picker.C58630d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\fH\u0016J\b\u0010\u001e\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/UserProfileFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mLauncherService", "Lcom/ss/android/lark/biz/core/api/IProfileLauncherService;", "mPresenter", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfilePresenter;", "mRootRelativeLayout", "Lcom/larksuite/component/ui/layout/LKUIRelativeLayout;", "getViewDependency", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$ViewDependency;", "handleBackPress", "", "initMVP", "view", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFinish", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.a */
public final class UserProfileFragment extends BaseFragment {

    /* renamed from: c */
    public static final Companion f130031c = new Companion(null);

    /* renamed from: a */
    public final AbstractC29542ad f130032a;

    /* renamed from: b */
    public UserProfilePresenter f130033b;

    /* renamed from: d */
    private LKUIRelativeLayout f130034d;

    /* renamed from: e */
    private HashMap f130035e;

    /* renamed from: b */
    public void mo179568b() {
        HashMap hashMap = this.f130035e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo179568b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/UserProfileFragment$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo179567a() {
        onFinish();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016JF\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0016J0\u0010(\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J$\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020\u0011H\u0016J\u0018\u00100\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u00104\u001a\u000202H\u0016¨\u00065"}, d2 = {"com/ss/android/lark/profile/func/user_profile/UserProfileFragment$getViewDependency$1", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileView$ViewDependency;", "callUser", "", "phoneNumber", "", "copy2Clipboard", "content", "finishActivity", "go2ProfileSetting", "profileSettingInitData", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;", "go2ProfileShare", "Lcom/ss/android/lark/chat/entity/message/content/ProfileContent;", "openChat", "userId", "contactSource", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "openCommonAvatar", "avatarKey", "entityId", "view", "Landroid/view/View;", "openLoginUserAvatar", "openPhoneQueryAmountEditPage", "openRouterActivity", "url", "openSecretChat", "chatId", "openUrl", "showApplyCollabDialog", "contact", "Lcom/ss/android/lark/contact/entity/Contact;", "startAddContactPage", "token", "userName", ShareHitPoint.f121868c, "isHasTenantCertification", "", "isTenantCertification", "startAliasEditorActivity", "alias", "startEmergencyCall", "startEnterprisePhoneCall", "startQueryPhoneNumber", "startReasonRequestEditActivity", "friendRequestToken", "fromChatId", "startVideoChat", "launcherCallback", "Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency$IVCLaunchCallback;", "startVoiceCall", "launchCallback", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.a$b */
    public static final class C52553b implements UserProfileView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragment f130036a;

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179578a(String str, String str2, String str3, String str4) {
            if (this.f130036a.getActivity() != null) {
                this.f130036a.f130032a.mo105567a(this.f130036a.getActivity(), this.f130036a, str, str2, str3, str4, 529);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179577a(String str, String str2, ContactSource contactSource) {
            Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
            if (this.f130036a.getActivity() != null) {
                this.f130036a.f130032a.mo105566a(this.f130036a.getActivity(), this.f130036a, str, str2, contactSource, 8941);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179579a(String str, String str2, String str3, String str4, ContactSource contactSource, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str4, "userName");
            Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
            if (this.f130036a.getActivity() != null) {
                contactSource.setFromTag("profile_add");
                this.f130036a.f130032a.mo105578a(this.f130036a.getActivity(), str2, str, str3, str4, contactSource, Boolean.valueOf(z), Boolean.valueOf(z2), this.f130036a, 4842);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179569a() {
            this.f130036a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52553b(UserProfileFragment aVar) {
            this.f130036a = aVar;
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: b */
        public void mo179580b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            C52239a.m202617d().mo133574f(str);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: c */
        public void mo179583c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            FragmentActivity activity = this.f130036a.getActivity();
            if (activity != null) {
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                d.mo133584n().mo133662a((Activity) activity, str);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: d */
        public void mo179584d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            FragmentActivity activity = this.f130036a.getActivity();
            if (activity != null) {
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                d.mo133584n().mo133666b(activity, str);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: e */
        public void mo179585e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            if (this.f130036a.getActivity() != null) {
                C52239a.m202617d().mo133550a(this.f130036a.getActivity(), str);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: g */
        public void mo179587g(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            FragmentActivity activity = this.f130036a.getActivity();
            if (activity != null) {
                C52239a.m202617d().mo133568d(activity, str);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179570a(ProfileContent profileContent) {
            Intrinsics.checkParameterIsNotNull(profileContent, "content");
            if (this.f130036a.getActivity() != null) {
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                d.mo133582l().mo133653a(this.f130036a.getActivity(), profileContent);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: f */
        public void mo179586f(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            if (this.f130036a.getActivity() != null) {
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                d.mo133584n().mo133667c(this.f130036a.getActivity(), str);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179572a(ProfileSettingInitData profileSettingInitData) {
            Intrinsics.checkParameterIsNotNull(profileSettingInitData, "profileSettingInitData");
            Bundle bundle = new Bundle();
            bundle.putSerializable("params_key_profile_setting_init_data", profileSettingInitData);
            if (DesktopUtil.m144301a(this.f130036a.getContext())) {
                ProfileSettingFragment cVar = new ProfileSettingFragment();
                cVar.setArguments(bundle);
                C36512a.m144041a().mo134760a(this.f130036a, cVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_POPOVER_P1).mo134930b(), 7914);
                return;
            }
            Intent intent = new Intent(this.f130036a.getContext(), ProfileSettingActivity.class);
            intent.putExtras(bundle);
            Context context = this.f130036a.getContext();
            if (context != null) {
                ((Activity) context).startActivityForResult(intent, 7914);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: h */
        public void mo179588h(String str) {
            Object systemService;
            Intrinsics.checkParameterIsNotNull(str, "content");
            FragmentActivity activity = this.f130036a.getActivity();
            if (activity != null && (systemService = activity.getSystemService("clipboard")) != null) {
                String str2 = str;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (systemService != null) {
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, str2));
                    LKUIToast.show(this.f130036a.getActivity(), (int) R.string.Lark_Legacy_Copied);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179573a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            if (this.f130036a.getActivity() != null) {
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                d.mo133586p().mo133603a(this.f130036a.getActivity(), str);
                IProfileModuleDependency d2 = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
                d2.mo133565c().mo133649a();
                this.f130036a.finish();
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179571a(Contact contact, ContactSource contactSource) {
            Intrinsics.checkParameterIsNotNull(contact, "contact");
            Intrinsics.checkParameterIsNotNull(contactSource, "contactSource");
            FragmentActivity activity = this.f130036a.getActivity();
            if (activity != null) {
                C52239a.m202617d().mo133549a(activity, contact, contactSource, "profile_add");
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: b */
        public void mo179581b(String str, IProfileModuleDependency.IVCLaunchCallback iVCLaunchCallback) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intrinsics.checkParameterIsNotNull(iVCLaunchCallback, "launcherCallback");
            if (this.f130036a.getActivity() != null) {
                C52239a.m202617d().mo133559a(str, false, false, iVCLaunchCallback);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179574a(String str, ContactSource contactSource) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intrinsics.checkParameterIsNotNull(contactSource, "contactSource");
            if (this.f130036a.getActivity() != null) {
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                d.mo133586p().mo133604a(this.f130036a.getActivity(), str, contactSource, "contact_profile");
                this.f130036a.finish();
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179575a(String str, IProfileModuleDependency.IVCLaunchCallback iVCLaunchCallback) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intrinsics.checkParameterIsNotNull(iVCLaunchCallback, "launchCallback");
            C52239a.m202617d().mo133559a(str, false, true, iVCLaunchCallback);
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: b */
        public void mo179582b(String str, String str2, View view) {
            Intrinsics.checkParameterIsNotNull(str, "avatarKey");
            Intrinsics.checkParameterIsNotNull(view, "view");
            FragmentActivity activity = this.f130036a.getActivity();
            if (activity != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str2);
                C58630d.m227375a((Context) activity, (List<String>) arrayList, (List<String>) arrayList2, 0, view, false, 640, 640, Biz.Core, Scene.Profile, 5);
            }
        }

        @Override // com.ss.android.lark.profile.func.user_profile.mvp.UserProfileView.ViewDependency
        /* renamed from: a */
        public void mo179576a(String str, String str2, View view) {
            Intrinsics.checkParameterIsNotNull(str, "avatarKey");
            Intrinsics.checkParameterIsNotNull(view, "view");
            FragmentActivity activity = this.f130036a.getActivity();
            if (activity != null) {
                C52239a.m202617d().mo133551a(activity, str, str2, view);
            }
        }
    }

    /* renamed from: c */
    private final UserProfileView.ViewDependency m203456c() {
        return new C52553b(this);
    }

    public UserProfileFragment() {
        C52904e a = C52904e.m204638a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ProfileLauncherService.inst()");
        this.f130032a = a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.f130033b != null) {
            UserProfilePresenter cVar = this.f130033b;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            cVar.destroy();
        }
        LKUIRelativeLayout lKUIRelativeLayout = this.f130034d;
        if (lKUIRelativeLayout != null) {
            lKUIRelativeLayout.unRegisterPlus(UserProfileDrawEventPlus.class);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onFinish() {
        Intent intent = new Intent();
        if (this.f130033b != null) {
            UserProfilePresenter cVar = this.f130033b;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            intent.putExtra("params_key_profile", cVar.mo179735b());
            UserProfilePresenter cVar2 = this.f130033b;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            cVar2.mo179733a(intent);
        }
        setResult(-1, intent);
        super.onFinish();
    }

    /* renamed from: a */
    private final void m203455a(View view) {
        String str;
        String str2;
        String str3;
        Serializable serializable;
        String str4;
        ContactSource contactSource;
        boolean z;
        Bundle arguments = getArguments();
        String str5 = null;
        if (arguments != null) {
            str = arguments.getString("param_key_user_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("param_key_chat_id");
        } else {
            str2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("param_key_token");
        } else {
            str3 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            serializable = arguments4.getSerializable("param_key_source");
        } else {
            serializable = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str4 = arguments5.getString("param_key_name_card_id");
        } else {
            str4 = null;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            str5 = arguments6.getString("param_key_email");
        }
        boolean z2 = false;
        if (serializable == null || !(serializable instanceof ContactSource)) {
            contactSource = new ContactSource.C29531a().mo104726a(0).mo104728a();
        } else {
            contactSource = (ContactSource) serializable;
        }
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            z = arguments7.getBoolean("param_show_at_last");
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5)) {
            z2 = true;
        }
        if (z2) {
            finish();
            Log.m165389i("UserProfileFragment", "is illegal parameters, so return");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(contactSource, "contactSource");
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            UserProfilePresenter cVar = new UserProfilePresenter(new UserProfileModel(str, str2, str3, contactSource, z, str4, str5), new UserProfileView(view, activity, m203456c()));
            this.f130033b = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            cVar.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        UserProfilePresenter cVar = this.f130033b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        cVar.mo179732a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180617g();
        View inflate = layoutInflater.inflate(R.layout.activity_user_profile, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        LKUIRelativeLayout lKUIRelativeLayout = (LKUIRelativeLayout) inflate.findViewById(R.id.mRootViewGroup);
        this.f130034d = lKUIRelativeLayout;
        if (lKUIRelativeLayout != null) {
            UserProfileDrawEventPlus userProfileDrawEventPlus = (UserProfileDrawEventPlus) lKUIRelativeLayout.registerPlus(UserProfileDrawEventPlus.class);
        }
        UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180618h();
        m203455a(inflate);
        return inflate;
    }
}
