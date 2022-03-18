package com.ss.android.lark.chatsetting.impl.group.avatar.team_setting;

import android.app.Activity;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView;
import com.ss.android.lark.chatsetting.impl.group.avatar.team_setting.ITeamSettingAvatarEditContract;
import com.ss.android.lark.team.entity.Team;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/TeamSettingAvatarEditView;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IView;", "viewDependency", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView$ViewDependency;", "activity", "Landroid/app/Activity;", "(Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView$ViewDependency;Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "mLocalViewDelegate", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IView$Delegate;", "getViewDependency", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView$ViewDependency;", "getAvatarKey", "", "getEntityId", "initDefaultAvatar", "", "setViewDelegate", "viewDelegate", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IView$Delegate;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.d */
public final class TeamSettingAvatarEditView extends AvatarEditView implements ITeamSettingAvatarEditContract.IView {

    /* renamed from: a */
    private ITeamSettingAvatarEditContract.IView.Delegate f89304a;

    /* renamed from: m */
    private final AvatarEditView.AbstractC34588a f89305m;

    /* renamed from: n */
    private final Activity f89306n;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: b */
    public void mo127767b() {
        this.mDefaultAvatar.mo127827a(true, R.drawable.ud_icon_community_tab_filled);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: a */
    public String mo127765a() {
        Team a;
        String avatarKey;
        ITeamSettingAvatarEditContract.IView.Delegate aVar = this.f89304a;
        if (aVar == null || (a = aVar.mo127783a()) == null || (avatarKey = a.getAvatarKey()) == null) {
            return "";
        }
        return avatarKey;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: c */
    public String mo127779c() {
        Long l;
        Team a;
        ITeamSettingAvatarEditContract.IView.Delegate aVar = this.f89304a;
        if (aVar == null || (a = aVar.mo127783a()) == null) {
            l = null;
        } else {
            l = Long.valueOf(a.getId());
        }
        return String.valueOf(l);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: a */
    public void setViewDelegate(AbstractC34597d.AbstractC34600b.AbstractC34601a aVar) {
        super.setViewDelegate(aVar);
        if (aVar instanceof ITeamSettingAvatarEditContract.IView.Delegate) {
            this.f89304a = (ITeamSettingAvatarEditContract.IView.Delegate) aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TeamSettingAvatarEditView(AvatarEditView.AbstractC34588a aVar, Activity activity) {
        super(aVar, activity, 0);
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f89305m = aVar;
        this.f89306n = activity;
    }
}
