package com.ss.android.lark.team.page.member;

import android.view.View;
import com.ss.android.lark.team.bean.TeamMemberVO;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberViewDependency;", "", "canChangeSelection", "", "member", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "isInSelectionMode", "isSelectable", "isSelected", "onClick", "", "view", "Landroid/view/View;", "onLongClick", "onSelectionChanged", "selected", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.w */
public interface TeamMemberViewDependency {
    /* renamed from: a */
    void mo189334a(View view, TeamMemberVO dVar);

    /* renamed from: a */
    boolean mo189338a(TeamMemberVO dVar);

    /* renamed from: b */
    void mo189340b(View view, TeamMemberVO dVar);

    /* renamed from: b */
    void mo189341b(TeamMemberVO dVar, boolean z);

    /* renamed from: b */
    boolean mo189342b(TeamMemberVO dVar);

    /* renamed from: c */
    boolean mo189343c(TeamMemberVO dVar);

    /* renamed from: g */
    boolean mo189347g();
}
