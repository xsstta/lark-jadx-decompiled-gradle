package com.ss.android.lark.member_manage.impl.show_member.team_group;

import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment;
import com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$getItemClickListener$1", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;", "onItemClick", "", "item", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamGroupShowMemberView$getItemClickListener$1 implements IBaseFragment.ItemClickListener {
    final /* synthetic */ String $className;
    final /* synthetic */ TeamGroupShowMemberView this$0;

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment.ItemClickListener
    public void onItemClick(C45084c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "item");
        ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate aVar = this.this$0.f114508b;
        if (aVar != null) {
            aVar.mo159854a(cVar);
        }
        TeamGroupShowMemberView eVar = this.this$0;
        String h = cVar.mo159513h();
        Intrinsics.checkExpressionValueIsNotNull(h, "item.id");
        eVar.mo159868a(h, cVar.mo159504b(), this.$className);
    }

    TeamGroupShowMemberView$getItemClickListener$1(TeamGroupShowMemberView eVar, String str) {
        this.this$0 = eVar;
        this.$className = str;
    }
}
