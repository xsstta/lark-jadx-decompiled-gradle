package com.ss.android.lark.chatsetting.impl.group.avatar.team_setting;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditDelegate;
import com.ss.android.lark.chatsetting.impl.group.avatar.team_setting.ITeamSettingAvatarEditContract;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/TeamSettingAvatarEditDelegate;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditDelegate;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IView$Delegate;", "model", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IModel;", "view", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IView;", "(Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IModel;Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IView;)V", "getModel", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IModel;", "getView", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IView;", "getTeam", "Lcom/ss/android/lark/team/entity/Team;", "saveAvatar", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "meta", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "avatarPath", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.b */
public final class TeamSettingAvatarEditDelegate extends AvatarEditDelegate implements ITeamSettingAvatarEditContract.IView.Delegate {

    /* renamed from: a */
    private final ITeamSettingAvatarEditContract.IModel f89293a;

    /* renamed from: b */
    private final ITeamSettingAvatarEditContract.IView f89294b;

    /* renamed from: c */
    public ITeamSettingAvatarEditContract.IModel mo127754b() {
        return this.f89293a;
    }

    /* renamed from: e */
    public ITeamSettingAvatarEditContract.IView mo127756d() {
        return this.f89294b;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.team_setting.ITeamSettingAvatarEditContract.IView.Delegate
    /* renamed from: a */
    public Team mo127783a() {
        return mo127754b().mo127780a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/team_setting/TeamSettingAvatarEditDelegate$saveAvatar$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/Team;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "team", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.b$a */
    public static final class C34578a implements IGetDataCallback<Team> {

        /* renamed from: a */
        final /* synthetic */ TeamSettingAvatarEditDelegate f89295a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34578a(TeamSettingAvatarEditDelegate bVar) {
            this.f89295a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89295a.mo127756d().mo127799d();
            this.f89295a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveFail));
        }

        /* renamed from: a */
        public void onSuccess(Team team) {
            this.f89295a.mo127756d().mo127799d();
            this.f89295a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveSuccess));
            this.f89295a.mo127756d().mo127800e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/team_setting/TeamSettingAvatarEditDelegate$saveAvatar$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/Team;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "team", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.b$b */
    public static final class C34579b implements IGetDataCallback<Team> {

        /* renamed from: a */
        final /* synthetic */ TeamSettingAvatarEditDelegate f89296a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34579b(TeamSettingAvatarEditDelegate bVar) {
            this.f89296a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89296a.mo127756d().mo127799d();
            this.f89296a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveFail));
        }

        /* renamed from: a */
        public void onSuccess(Team team) {
            this.f89296a.mo127756d().mo127799d();
            this.f89296a.mo127756d().mo127798b(UIHelper.getString(R.string.Lark_Legacy_SaveSuccess));
            this.f89296a.mo127756d().mo127800e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TeamSettingAvatarEditDelegate(ITeamSettingAvatarEditContract.IModel aVar, ITeamSettingAvatarEditContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        this.f89293a = aVar;
        this.f89294b = bVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b.AbstractC34601a
    /* renamed from: a */
    public void mo127753a(String str, AvatarMeta avatarMeta) {
        Intrinsics.checkParameterIsNotNull(avatarMeta, "meta");
        if (str == null) {
            str = "";
        }
        mo127754b().mo127782a(str, avatarMeta, new UIGetDataCallback(new C34579b(this)));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b.AbstractC34601a
    /* renamed from: a */
    public void mo127752a(Context context, Bitmap bitmap, AvatarMeta avatarMeta) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(avatarMeta, "meta");
        mo127754b().mo127781a(context, bitmap, avatarMeta, new UIGetDataCallback(new C34578a(this)));
    }
}
