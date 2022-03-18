package com.ss.android.lark.chatsetting.impl.group.avatar.team_setting;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b;
import com.ss.android.lark.chatsetting.impl.group.avatar.team_setting.ITeamSettingAvatarEditContract;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.C57881t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J0\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0016J*\u0010\f\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/TeamSettingAvatarEditModel;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditModel;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IModel;", "team", "Lcom/ss/android/lark/team/entity/Team;", "(Lcom/ss/android/lark/team/entity/Team;)V", "getAvatarMeta", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "getTeam", "updateAvatarWithAvatarMeta", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "avatarMeta", "avatarPath", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.c */
public final class TeamSettingAvatarEditModel extends AbstractC34590b implements ITeamSettingAvatarEditContract.IModel {

    /* renamed from: a */
    public final Team f89297a;

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.team_setting.ITeamSettingAvatarEditContract.IModel
    /* renamed from: a */
    public Team mo127780a() {
        return this.f89297a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/team_setting/TeamSettingAvatarEditModel$updateAvatarWithAvatarMeta$2", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditModel$OnFileSaveListener;", "onFailSaveFailed", "", "error", "", "onFileSaveSuccess", "path", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.c$b */
    public static final class C34581b implements AbstractC34590b.AbstractC34593a {

        /* renamed from: a */
        final /* synthetic */ TeamSettingAvatarEditModel f89301a;

        /* renamed from: b */
        final /* synthetic */ AvatarMeta f89302b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f89303c;

        @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b.AbstractC34593a
        /* renamed from: b */
        public void mo127764b(String str) {
            Log.m165383e("CreateTeamAvatarEditModel", str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b.AbstractC34593a
        /* renamed from: a */
        public void mo127763a(String str) {
            this.f89301a.mo127782a(str, this.f89302b, this.f89303c);
        }

        C34581b(TeamSettingAvatarEditModel cVar, AvatarMeta avatarMeta, IGetDataCallback iGetDataCallback) {
            this.f89301a = cVar;
            this.f89302b = avatarMeta;
            this.f89303c = iGetDataCallback;
        }
    }

    public TeamSettingAvatarEditModel(Team team) {
        this.f89297a = team;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/team_setting/TeamSettingAvatarEditModel$updateAvatarWithAvatarMeta$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.c$a */
    public static final class C34580a implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ TeamSettingAvatarEditModel f89298a;

        /* renamed from: b */
        final /* synthetic */ AvatarMeta f89299b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f89300c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89300c.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            long j;
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            AbstractC34461c.AbstractC34484w x = a.mo127294x();
            Team team = this.f89298a.f89297a;
            if (team != null) {
                j = team.getId();
            } else {
                j = 0;
            }
            if (str == null) {
                str = "";
            }
            x.mo127444a(j, str, this.f89299b, this.f89300c);
        }

        C34580a(TeamSettingAvatarEditModel cVar, AvatarMeta avatarMeta, IGetDataCallback iGetDataCallback) {
            this.f89298a = cVar;
            this.f89299b = avatarMeta;
            this.f89300c = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34598a
    /* renamed from: a */
    public void mo127760a(IGetDataCallback<AvatarMeta> iGetDataCallback) {
        String str;
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ChatSettingService bVar = ChatSettingService.f88988a;
        Team team = this.f89297a;
        if (team == null || (str = team.getAvatarKey()) == null) {
            str = "";
        }
        bVar.mo127459a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.team_setting.ITeamSettingAvatarEditContract.IModel
    /* renamed from: a */
    public void mo127782a(String str, AvatarMeta avatarMeta, IGetDataCallback<Team> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(avatarMeta, "avatarMeta");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        a.mo127286p().mo127301a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C34580a(this, avatarMeta, iGetDataCallback)));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.team_setting.ITeamSettingAvatarEditContract.IModel
    /* renamed from: a */
    public void mo127781a(Context context, Bitmap bitmap, AvatarMeta avatarMeta, IGetDataCallback<Team> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(avatarMeta, "avatarMeta");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        mo127812a(bitmap, C57881t.m224651w(context) + System.currentTimeMillis() + ".png", new C34581b(this, avatarMeta, iGetDataCallback));
    }
}
