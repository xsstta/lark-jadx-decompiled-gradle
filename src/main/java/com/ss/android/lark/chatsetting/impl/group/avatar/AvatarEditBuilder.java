package com.ss.android.lark.chatsetting.impl.group.avatar;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.avatar.create_team.CreateTeamAvatarEditDelegate;
import com.ss.android.lark.chatsetting.impl.group.avatar.create_team.CreateTeamAvatarEditModel;
import com.ss.android.lark.chatsetting.impl.group.avatar.create_team.CreateTeamAvatarEditView;
import com.ss.android.lark.chatsetting.impl.group.avatar.group_setting.GroupSettingAvatarEditDelegate;
import com.ss.android.lark.chatsetting.impl.group.avatar.group_setting.GroupSettingAvatarEditModel;
import com.ss.android.lark.chatsetting.impl.group.avatar.group_setting.GroupSettingAvatarEditView;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34590b;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditDelegate;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView;
import com.ss.android.lark.chatsetting.impl.group.avatar.team_setting.TeamSettingAvatarEditDelegate;
import com.ss.android.lark.chatsetting.impl.group.avatar.team_setting.TeamSettingAvatarEditModel;
import com.ss.android.lark.chatsetting.impl.group.avatar.team_setting.TeamSettingAvatarEditView;
import com.ss.android.lark.team.entity.Team;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/AvatarEditBuilder;", "", "()V", "CURRENT_CHAT", "", "INTENT_AVATAR_EDIT_TYPE", "INTENT_AVATAR_KEY", "INTENT_AVATAR_META", "INTENT_IS_DEFAULT_CHAT", "INTENT_TEAM", "INTENT_TEAM_NAME", "buildModelView", "Lkotlin/Triple;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditModel;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditDelegate;", "bundle", "Landroid/os/Bundle;", "viewDependency", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView$ViewDependency;", "activity", "Landroid/app/Activity;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.a */
public final class AvatarEditBuilder {

    /* renamed from: a */
    public static final AvatarEditBuilder f89247a = new AvatarEditBuilder();

    private AvatarEditBuilder() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Triple<AvatarEditView, AbstractC34590b, AvatarEditDelegate> m134275a(Bundle bundle, AvatarEditView.AbstractC34588a aVar, Activity activity) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        int i = bundle.getInt("intent_avatar_edit_type", 2);
        TeamSettingAvatarEditModel cVar = null;
        TeamSettingAvatarEditView dVar = null;
        TeamSettingAvatarEditDelegate bVar = null;
        if (i == 0) {
            Serializable serializable = bundle.getSerializable("intent_team");
            if (!(serializable instanceof Team)) {
                serializable = null;
            }
            dVar = new TeamSettingAvatarEditView(aVar, activity);
            cVar = new TeamSettingAvatarEditModel((Team) serializable);
            bVar = new TeamSettingAvatarEditDelegate(cVar, dVar);
        } else if (i == 1) {
            Serializable serializable2 = bundle.getSerializable("intent_avatar_meta");
            if (!(serializable2 instanceof AvatarMeta)) {
                serializable2 = null;
            }
            AvatarMeta avatarMeta = (AvatarMeta) serializable2;
            String string = bundle.getString("intent_avatar_key");
            String str = "";
            if (string == null) {
                string = str;
            }
            Intrinsics.checkExpressionValueIsNotNull(string, "bundle.getString(INTENT_AVATAR_KEY) ?:\"\"");
            String string2 = bundle.getString("intent_team_name");
            if (string2 != null) {
                str = string2;
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "bundle.getString(INTENT_TEAM_NAME) ?: \"\"");
            dVar = new CreateTeamAvatarEditView(aVar, activity, string);
            cVar = new CreateTeamAvatarEditModel(string, str, avatarMeta);
            bVar = new CreateTeamAvatarEditDelegate(cVar, dVar);
        } else if (i == 2) {
            Serializable serializable3 = bundle.getSerializable("current_chat");
            if (!(serializable3 instanceof Chat)) {
                serializable3 = null;
            }
            dVar = new GroupSettingAvatarEditView(aVar, activity, bundle.getBoolean("intent_is_default_chat", false));
            cVar = new GroupSettingAvatarEditModel((Chat) serializable3);
            bVar = new GroupSettingAvatarEditDelegate(cVar, dVar);
        }
        if (cVar == null || dVar == null || bVar == null) {
            return null;
        }
        return new Triple<>(dVar, cVar, bVar);
    }
}
