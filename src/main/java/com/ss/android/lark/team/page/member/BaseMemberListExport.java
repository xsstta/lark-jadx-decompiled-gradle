package com.ss.android.lark.team.page.member;

import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.team.bean.TeamMemberVO;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/team/page/member/BaseMemberListExport;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "Lcom/ss/android/lark/team/page/member/TeamMemberAdapterDependency;", "getChatIdForLoadMember", "", "onMemberRemoved", "", "ids", "", "updateSelection", "member", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "selected", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.a */
public interface BaseMemberListExport extends IPieceExport, TeamMemberAdapterDependency {
    /* renamed from: a */
    void mo189335a(TeamMemberVO dVar, boolean z);

    /* renamed from: a */
    void mo189337a(List<String> list);
}
