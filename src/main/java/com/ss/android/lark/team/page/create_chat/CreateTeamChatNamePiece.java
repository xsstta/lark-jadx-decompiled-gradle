package com.ss.android.lark.team.page.create_chat;

import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.page.create_team.CreateTeamNamePiece;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/page/create_chat/CreateTeamChatNamePiece;", "Lcom/ss/android/lark/team/page/create_team/CreateTeamNamePiece;", "()V", "onCreate", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CreateTeamChatNamePiece extends CreateTeamNamePiece {
    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.page.create_team.CreateTeamNamePiece
    public void onCreate() {
        super.onCreate();
        mo189316d().setHint(C51468a.m199493c(R.string.Project_MV_NameYourGroup, mo177180C()));
        mo189317e().setText(C51468a.m199493c(R.string.Project_T_AlreadyTakenChange, mo177180C()));
        ((TextView) mo177201f(R.id.title)).setText(C51468a.m199493c(R.string.Project_MV_FieldGroupName, mo177180C()));
    }
}
