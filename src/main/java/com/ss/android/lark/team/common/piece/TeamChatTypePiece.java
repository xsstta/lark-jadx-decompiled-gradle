package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.page.TeamChatTypeSelectActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/team/common/piece/TeamChatTypePiece;", "Lcom/ss/android/lark/team/common/piece/SettingJumpPiece;", "Lcom/ss/android/lark/team/common/piece/TeamChatTypeExport;", "()V", "teamChatType", "Lcom/ss/android/lark/chat/entity/chat/TeamChatType;", "getType", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamChatTypePiece extends SettingJumpPiece implements TeamChatTypeExport {

    /* renamed from: g */
    public TeamChatType f136764g = TeamChatType.TEAM_CHAT_TYPE_PUBLIC;

    @Override // com.ss.android.lark.team.common.piece.TeamChatTypeExport
    /* renamed from: a */
    public TeamChatType mo189017a() {
        return this.f136764g;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(TeamChatTypeExport.class, this);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo189002a(new View$OnClickListenerC55385a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.TeamChatTypePiece$a */
    static final class View$OnClickListenerC55385a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamChatTypePiece f136765a;

        View$OnClickListenerC55385a(TeamChatTypePiece teamChatTypePiece) {
            this.f136765a = teamChatTypePiece;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f136765a.mo177180C(), TeamChatTypeSelectActivity.class);
            intent.putExtra("intent_team_chat_type", this.f136765a.f136764g);
            this.f136765a.mo177187a(intent, 16);
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.common.piece.SettingBasePiece, com.ss.android.lark.team.common.piece.SettingJumpPiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        mo189009a(C51468a.m199493c(R.string.Project_MV_PrivacySettings, context));
        mo189011c(C51468a.m199493c(R.string.Project_MV_GroupPrivacyStandard, context));
        return super.mo127619a(context, marginLayoutParams);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        Serializable serializable;
        if (i != 16 || i2 != -1) {
            return false;
        }
        TeamChatType teamChatType = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("result_team_chat_type");
        } else {
            serializable = null;
        }
        if (serializable instanceof TeamChatType) {
            teamChatType = serializable;
        }
        TeamChatType teamChatType2 = teamChatType;
        if (teamChatType2 == null) {
            return true;
        }
        this.f136764g = teamChatType2;
        if (teamChatType2 == TeamChatType.TEAM_CHAT_TYPE_PRIVATE) {
            mo189011c(C51468a.m199493c(R.string.Project_MV_GroupPrivacyPrivate, mo177180C()));
            return true;
        }
        mo189011c(C51468a.m199493c(R.string.Project_MV_GroupPrivacyStandard, mo177180C()));
        return true;
    }
}
