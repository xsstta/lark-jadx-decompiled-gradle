package com.ss.android.lark.team.page.member;

import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.team.bean.TeamMemberVO;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberSearchListExport;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "hide", "", "search", "key", "", "updateMemberTagInfoList", "member", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "tagInfoList", "", "Lcom/ss/android/lark/chat/entity/chatter/TagInfo;", "updateSelection", "selected", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.t */
public interface TeamMemberSearchListExport extends IPieceExport {
    /* renamed from: a */
    void mo189469a(TeamMemberVO dVar, List<TagInfo> list);

    /* renamed from: a */
    void mo189470a(TeamMemberVO dVar, boolean z);

    /* renamed from: a */
    void mo189471a(String str);

    /* renamed from: b */
    void mo189472b();
}
