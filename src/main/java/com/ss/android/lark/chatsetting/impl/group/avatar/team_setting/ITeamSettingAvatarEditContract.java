package com.ss.android.lark.chatsetting.impl.group.avatar.team_setting;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d;
import com.ss.android.lark.team.entity.Team;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract;", "", "IModel", "IView", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.a */
public interface ITeamSettingAvatarEditContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\rH&J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\rH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IModel;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IModel;", "getTeam", "Lcom/ss/android/lark/team/entity/Team;", "updateAvatarWithAvatarMeta", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "avatarMeta", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "avatarPath", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.a$a */
    public interface IModel extends AbstractC34597d.AbstractC34598a {
        /* renamed from: a */
        Team mo127780a();

        /* renamed from: a */
        void mo127781a(Context context, Bitmap bitmap, AvatarMeta avatarMeta, IGetDataCallback<Team> iGetDataCallback);

        /* renamed from: a */
        void mo127782a(String str, AvatarMeta avatarMeta, IGetDataCallback<Team> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IView;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IView;", "Delegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.a$b */
    public interface IView extends AbstractC34597d.AbstractC34600b {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/team_setting/ITeamSettingAvatarEditContract$IView$Delegate;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IView$Delegate;", "getTeam", "Lcom/ss/android/lark/team/entity/Team;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.d.a$b$a */
        public interface Delegate extends AbstractC34597d.AbstractC34600b.AbstractC34601a {
            /* renamed from: a */
            Team mo127783a();
        }
    }
}
