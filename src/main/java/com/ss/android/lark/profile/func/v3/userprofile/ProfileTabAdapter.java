package com.ss.android.lark.profile.func.v3.userprofile;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.AbstractC1583a;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileState;
import com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.PersonalInfoFragment;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/ProfileTabAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "(Lcom/ss/android/lark/base/fragment/BaseFragment;)V", "getFragment", "()Lcom/ss/android/lark/base/fragment/BaseFragment;", "tabs", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState$TabInfo;", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "tabType", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$TabInfo$TabType;", "position", "", "getItemCount", "setTabs", "", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.d */
public final class ProfileTabAdapter extends AbstractC1583a {

    /* renamed from: e */
    private String f130459e = "";

    /* renamed from: f */
    private final List<UserProfileState.TabInfo> f130460f = new ArrayList();

    /* renamed from: g */
    private final BaseFragment f130461g;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f130460f.size();
    }

    /* renamed from: a */
    public final void mo180202a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f130459e = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ProfileTabAdapter(BaseFragment baseFragment) {
        super(baseFragment);
        Intrinsics.checkParameterIsNotNull(baseFragment, "fragment");
        this.f130461g = baseFragment;
    }

    @Override // androidx.viewpager2.adapter.AbstractC1583a
    /* renamed from: a */
    public Fragment mo8246a(int i) {
        return m204268a(this.f130460f.get(i).mo180094b());
    }

    /* renamed from: a */
    private final Fragment m204268a(GetUserProfileResponse.TabInfo.TabType tabType) {
        int i = C52746e.f130466a[tabType.ordinal()];
        if (i == 1) {
            return new PersonalInfoFragment();
        }
        if (i != 2) {
            return new Fragment();
        }
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        Fragment a = d.mo133593w().mo133648a(this.f130459e);
        Intrinsics.checkExpressionValueIsNotNull(a, "ProfileModule.getDepende…erMomentsFragment(userId)");
        return a;
    }

    /* renamed from: a */
    public final void mo180203a(List<UserProfileState.TabInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "tabs");
        this.f130460f.clear();
        this.f130460f.addAll(list);
        notifyDataSetChanged();
    }
}
