package com.ss.android.lark.team.page.info;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.team.common.piece.SettingJumpPiece;
import com.ss.android.lark.team.entity.Team;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/team/page/info/TeamNamePiece;", "Lcom/ss/android/lark/team/common/piece/SettingJumpPiece;", "()V", "teamChangeObserver", "com/ss/android/lark/team/page/info/TeamNamePiece$teamChangeObserver$1", "Lcom/ss/android/lark/team/page/info/TeamNamePiece$teamChangeObserver$1;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onCreate", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamNamePiece extends SettingJumpPiece {

    /* renamed from: g */
    private final C55493a f137017g = new C55493a(this, true);

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177190a("intent_team", this.f137017g);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/info/TeamNamePiece$teamChangeObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/Team;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.info.TeamNamePiece$a */
    public static final class C55493a extends DataObserver<Team> {

        /* renamed from: a */
        final /* synthetic */ TeamNamePiece f137018a;

        /* renamed from: a */
        public void mo127664a(Team team) {
            if (team != null) {
                TeamNamePiece teamNamePiece = this.f137018a;
                String name = team.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "it.name");
                teamNamePiece.mo189010b(name);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55493a(TeamNamePiece teamNamePiece, boolean z) {
            super(z);
            this.f137018a = teamNamePiece;
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.common.piece.SettingBasePiece, com.ss.android.lark.team.common.piece.SettingJumpPiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View a = super.mo127619a(context, marginLayoutParams);
        TextView textView = (TextView) a.findViewById(R.id.setting_jump_subtitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view");
        textView.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.width = 0;
            layoutParams2.f2827s = 0;
            layoutParams2.setMarginEnd(layoutParams2.getMarginStart());
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.piece.ext.ConstraintParams /* = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams */");
    }
}
