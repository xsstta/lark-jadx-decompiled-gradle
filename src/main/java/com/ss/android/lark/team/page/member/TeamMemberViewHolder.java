package com.ss.android.lark.team.page.member;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "avatarItemView", "Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "(Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;)V", "getAvatarItemView", "()Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.x */
public final class TeamMemberViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final AvatarItemView f137173a;

    /* renamed from: a */
    public final AvatarItemView mo189532a() {
        return this.f137173a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TeamMemberViewHolder(AvatarItemView avatarItemView) {
        super(avatarItemView);
        Intrinsics.checkParameterIsNotNull(avatarItemView, "avatarItemView");
        this.f137173a = avatarItemView;
    }
}
