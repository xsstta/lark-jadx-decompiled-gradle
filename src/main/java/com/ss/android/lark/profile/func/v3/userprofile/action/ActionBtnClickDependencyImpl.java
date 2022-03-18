package com.ss.android.lark.profile.func.v3.userprofile.action;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJF\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J$\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/action/ActionBtnClickDependencyImpl;", "Lcom/ss/android/lark/profile/func/v3/userprofile/action/IActionBtnClickDependency;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "launcherService", "Lcom/ss/android/lark/biz/core/api/IProfileLauncherService;", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/base/fragment/BaseFragment;Lcom/ss/android/lark/biz/core/api/IProfileLauncherService;)V", "startAddContactPage", "", "token", "", "userId", "chatId", "userName", ShareHitPoint.f121868c, "Lcom/ss/android/lark/biz/core/api/ContactSource;", "isHasTenantCertification", "", "isTenantCertification", "startReasonRequestEditActivity", "friendRequestToken", "fromChatId", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.action.b */
public final class ActionBtnClickDependencyImpl implements IActionBtnClickDependency {

    /* renamed from: a */
    private final FragmentActivity f130367a;

    /* renamed from: b */
    private final BaseFragment f130368b;

    /* renamed from: c */
    private final AbstractC29542ad f130369c;

    @Inject
    public ActionBtnClickDependencyImpl(FragmentActivity fragmentActivity, BaseFragment baseFragment, AbstractC29542ad adVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(baseFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(adVar, "launcherService");
        this.f130367a = fragmentActivity;
        this.f130368b = baseFragment;
        this.f130369c = adVar;
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.action.IActionBtnClickDependency
    /* renamed from: a */
    public void mo179972a(String str, String str2, ContactSource contactSource) {
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        this.f130369c.mo105566a(this.f130367a, this.f130368b, str, str2, contactSource, 8941);
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.action.IActionBtnClickDependency
    /* renamed from: a */
    public void mo179973a(String str, String str2, String str3, String str4, ContactSource contactSource, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str4, "userName");
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        FragmentActivity fragmentActivity = this.f130367a;
        contactSource.setFromTag("profile_add");
        this.f130369c.mo105578a(fragmentActivity, str2, str, str3, str4, contactSource, Boolean.valueOf(z), Boolean.valueOf(z2), this.f130368b, 4842);
    }
}
