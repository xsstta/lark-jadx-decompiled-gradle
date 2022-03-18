package com.ss.android.lark.team.bean;

import android.graphics.drawable.Drawable;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.team.bean.AbsTeamMember;
import com.ss.android.lark.team.entity.PickEntities;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/team/bean/ChatterTeamMember;", "Lcom/ss/android/lark/team/bean/AbsTeamMember;", "chatChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "(Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;)V", "getChatChatter", "()Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "convertToSearchBaseInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getAvatarKey", "", "getId", "getName", "memberType", "Lcom/ss/android/lark/team/entity/PickEntities$PickType;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.bean.b */
public final class ChatterTeamMember implements AbsTeamMember {

    /* renamed from: a */
    private final ChatChatter f136676a;

    /* renamed from: a */
    public final ChatChatter mo188944a() {
        return this.f136676a;
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public PickEntities.PickType memberType() {
        return PickEntities.PickType.USER;
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public Drawable getAvatarDrawable() {
        return AbsTeamMember.C55361a.m214878a(this);
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public String getAvatarKey() {
        String avatarKey = this.f136676a.getAvatarKey();
        Intrinsics.checkExpressionValueIsNotNull(avatarKey, "chatChatter.getAvatarKey()");
        return avatarKey;
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public String getId() {
        String id = this.f136676a.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chatChatter.getId()");
        return id;
    }

    public ChatterTeamMember(ChatChatter chatChatter) {
        Intrinsics.checkParameterIsNotNull(chatChatter, "chatChatter");
        this.f136676a = chatChatter;
    }
}
