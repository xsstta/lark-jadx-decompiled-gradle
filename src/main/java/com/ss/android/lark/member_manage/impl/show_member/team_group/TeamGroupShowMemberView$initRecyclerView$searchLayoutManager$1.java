package com.ss.android.lark.member_manage.impl.show_member.team_group;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$initRecyclerView$searchLayoutManager$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "canScrollHorizontally", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamGroupShowMemberView$initRecyclerView$searchLayoutManager$1 extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ TeamGroupShowMemberView f114486a;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollHorizontally() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TeamGroupShowMemberView$initRecyclerView$searchLayoutManager$1(TeamGroupShowMemberView eVar, Context context, int i, boolean z) {
        super(context, i, z);
        this.f114486a = eVar;
    }
}
