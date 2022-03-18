package com.ss.android.lark.chatsetting.impl.group.avatar.group_setting;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.avatar.group_setting.IGroupSettingAvatarEditContract;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/GroupSettingAvatarEditView;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/IGroupSettingAvatarEditContract$IView;", "viewDependency", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView$ViewDependency;", "activity", "Landroid/app/Activity;", "isDefaultChat", "", "(Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView$ViewDependency;Landroid/app/Activity;Z)V", "getActivity", "()Landroid/app/Activity;", "()Z", "mLocalDelegate", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/group_setting/IGroupSettingAvatarEditContract$IView$Delegate;", "getViewDependency", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView$ViewDependency;", "getAvatarKey", "", "getEntityId", "initDefaultAvatar", "", "sendClickSaveHitPoint", "avatarMeta", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "isUpload", "setViewDelegate", "viewDelegate", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IView$Delegate;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.c.c */
public final class GroupSettingAvatarEditView extends AvatarEditView implements IGroupSettingAvatarEditContract.IView {

    /* renamed from: a */
    private IGroupSettingAvatarEditContract.IView.Delegate f89289a;

    /* renamed from: m */
    private final AvatarEditView.AbstractC34588a f89290m;

    /* renamed from: n */
    private final Activity f89291n;

    /* renamed from: o */
    private final boolean f89292o;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: b */
    public void mo127767b() {
        if (this.f89292o) {
            this.mDefaultAvatar.mo127827a(true, R.drawable.ud_icon_community_tab_filled);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: a */
    public String mo127765a() {
        Chat a;
        String avatarKey;
        IGroupSettingAvatarEditContract.IView.Delegate aVar = this.f89289a;
        if (aVar == null || (a = aVar.mo127768a()) == null || (avatarKey = a.getAvatarKey()) == null) {
            return "";
        }
        return avatarKey;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: c */
    public String mo127779c() {
        Chat a;
        String id;
        IGroupSettingAvatarEditContract.IView.Delegate aVar = this.f89289a;
        if (aVar == null || (a = aVar.mo127768a()) == null || (id = a.getId()) == null) {
            return "";
        }
        return id;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: a */
    public void setViewDelegate(AbstractC34597d.AbstractC34600b.AbstractC34601a aVar) {
        super.setViewDelegate(aVar);
        if (aVar instanceof IGroupSettingAvatarEditContract.IView.Delegate) {
            this.f89289a = (IGroupSettingAvatarEditContract.IView.Delegate) aVar;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: a */
    public void mo127777a(AvatarMeta avatarMeta, boolean z) {
        boolean z2;
        boolean z3;
        Chat a;
        Intrinsics.checkParameterIsNotNull(avatarMeta, "avatarMeta");
        boolean z4 = !TextUtils.isEmpty(avatarMeta.getText());
        if (this.f89317k != -1 || !z4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f89316j != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        IGroupSettingAvatarEditContract.IView.Delegate aVar = this.f89289a;
        if (aVar != null && (a = aVar.mo127768a()) != null) {
            GroupHitPoint.f90519a.mo129211a(a, z, z4, this.f89317k, z2, z3, avatarMeta.getColor());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupSettingAvatarEditView(AvatarEditView.AbstractC34588a aVar, Activity activity, boolean z) {
        super(aVar, activity, 2);
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f89290m = aVar;
        this.f89291n = activity;
        this.f89292o = z;
    }
}
