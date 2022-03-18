package com.ss.android.lark.team.common.piece;

import android.view.View;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.piece.layout.LinearPieceGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/common/piece/ClearNameInputFocusPiece;", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "()V", "onCreate", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ClearNameInputFocusPiece extends LinearPieceGroup {
    public ClearNameInputFocusPiece() {
        super(1);
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177205s().setOnClickListener(new View$OnClickListenerC55369a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.ClearNameInputFocusPiece$a */
    static final class View$OnClickListenerC55369a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ClearNameInputFocusPiece f136691a;

        View$OnClickListenerC55369a(ClearNameInputFocusPiece clearNameInputFocusPiece) {
            this.f136691a = clearNameInputFocusPiece;
        }

        public final void onClick(View view) {
            IPieceExport aVar;
            PieceContext r = this.f136691a.mo177204r();
            if (r != null) {
                aVar = r.mo177222a(TeamNameInputExport.class);
            } else {
                aVar = null;
            }
            TeamNameInputExport hVar = (TeamNameInputExport) aVar;
            if (hVar != null) {
                hVar.mo189039d();
            }
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
    }
}
