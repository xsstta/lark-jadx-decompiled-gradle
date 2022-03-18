package com.ss.android.lark.team.page.member;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.Piece;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberFailedPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "Lcom/ss/android/lark/team/page/member/TeamMemberFailedExport;", "()V", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "updateVisibility", "", "visibility", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamMemberFailedPiece extends Piece<TeamMemberFailedPiece> implements TeamMemberFailedExport {
    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(TeamMemberFailedExport.class, this);
    }

    @Override // com.ss.android.lark.team.page.member.TeamMemberFailedExport
    /* renamed from: a */
    public void mo189429a(int i) {
        mo177194b(i);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View inflate = LayoutInflater.from(context).inflate(R.layout.activity_common_load_fail, (ViewGroup) null, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…n_load_fail, null, false)");
        return inflate;
    }
}
