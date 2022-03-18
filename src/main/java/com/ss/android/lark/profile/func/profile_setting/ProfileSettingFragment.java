package com.ss.android.lark.profile.func.profile_setting;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingView;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingPresenter;", "getDependency", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingView$IProfileSettingDependency;", "handleBackPress", "", "initMVP", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFinish", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.profile_setting.c */
public final class ProfileSettingFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f129888a = new Companion(null);

    /* renamed from: b */
    private ProfileSettingPresenter f129889b;

    /* renamed from: c */
    private HashMap f129890c;

    /* renamed from: b */
    public void mo179446b() {
        HashMap hashMap = this.f129890c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo179446b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingFragment$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/profile/func/profile_setting/ProfileSettingFragment$getDependency$1", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingView$IProfileSettingDependency;", "finish", "", "go2ProfileShare", "content", "Lcom/ss/android/lark/chat/entity/message/content/ProfileContent;", "openPhoneQueryAmountEditPage", "userId", "", "openUrl", "url", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.c$b */
    public static final class C52445b implements ProfileSettingView.IProfileSettingDependency {

        /* renamed from: a */
        final /* synthetic */ ProfileSettingFragment f129891a;

        @Override // com.ss.android.lark.profile.func.profile_setting.ProfileSettingView.IProfileSettingDependency
        /* renamed from: a */
        public void mo179447a() {
            this.f129891a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52445b(ProfileSettingFragment cVar) {
            this.f129891a = cVar;
        }

        @Override // com.ss.android.lark.profile.func.profile_setting.ProfileSettingView.IProfileSettingDependency
        /* renamed from: b */
        public void mo179449b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            if (this.f129891a.getActivity() != null) {
                C52239a.m202617d().mo133550a(this.f129891a.getActivity(), str);
            }
        }

        @Override // com.ss.android.lark.profile.func.profile_setting.ProfileSettingView.IProfileSettingDependency
        /* renamed from: a */
        public void mo179448a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            if (this.f129891a.getActivity() != null) {
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                d.mo133584n().mo133667c(this.f129891a.getActivity(), str);
            }
        }
    }

    /* renamed from: c */
    private final ProfileSettingView.IProfileSettingDependency m203226c() {
        return new C52445b(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ProfileSettingPresenter eVar = this.f129889b;
        if (eVar != null) {
            eVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo179445a() {
        ProfileSettingPresenter eVar = this.f129889b;
        if (eVar != null) {
            Intent intent = new Intent();
            intent.putExtra("params_key_profile_setting", eVar.mo179451a());
            setResult(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onFinish() {
        ProfileSettingPresenter eVar = this.f129889b;
        if (eVar != null) {
            Intent intent = new Intent();
            intent.putExtra("params_key_profile_setting", eVar.mo179451a());
            setResult(-1, intent);
        }
        super.onFinish();
    }

    /* renamed from: a */
    private final void m203225a(View view) {
        Serializable serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("params_key_profile_setting_init_data");
        } else {
            serializable = null;
        }
        if (serializable != null && (serializable instanceof ProfileSettingInitData)) {
            ProfileSettingInitData profileSettingInitData = (ProfileSettingInitData) serializable;
            if (!TextUtils.isEmpty(profileSettingInitData.getUserId())) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    Intrinsics.checkExpressionValueIsNotNull(activity, "it");
                    ProfileSettingPresenter eVar = new ProfileSettingPresenter(new ProfileSettingModel(profileSettingInitData), new ProfileSettingView(activity, view, m203226c()));
                    this.f129889b = eVar;
                    if (eVar != null) {
                        eVar.create();
                    }
                }
                UserProfileHitPointV3.f130746c.mo180595n();
                return;
            }
        }
        Log.m165383e(this.TAG, "init data does not match");
        finish();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        C48211b.m190251a().mo168689b("onCreateView");
        View inflate = layoutInflater.inflate(R.layout.activity_profile_setting, viewGroup, false);
        C48211b.m190251a().mo168691c("onCreateView");
        C48211b.m190251a().mo168689b("initMVP");
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        m203225a(inflate);
        C48211b.m190251a().mo168691c("initMVP");
        return inflate;
    }
}
