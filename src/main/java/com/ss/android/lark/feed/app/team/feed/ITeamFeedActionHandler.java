package com.ss.android.lark.feed.app.team.feed;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.app.team.entity.C37878g;
import com.ss.android.lark.team.entity.Team;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/feed/app/team/feed/ITeamFeedActionHandler;", "", "onClickChat", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "onClickHiddenChat", "", "onClickTeam", "Lcom/ss/android/lark/feed/app/team/entity/TeamVO;", "onClickTeamMoreAction", "team", "Lcom/ss/android/lark/team/entity/Team;", "onUpdateChatVisibility", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "hideChat", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.a.a */
public interface ITeamFeedActionHandler {
    /* renamed from: a */
    void mo138615a(RecyclerView.ViewHolder viewHolder, C37874d dVar, boolean z);

    /* renamed from: a */
    void mo138616a(C37874d dVar);

    /* renamed from: a */
    void mo138617a(C37878g gVar);

    /* renamed from: a */
    void mo138618a(Team team);

    /* renamed from: a */
    void mo138619a(List<? extends C37874d> list);
}
