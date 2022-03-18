package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/team/common/piece/SettingDividerPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "Lcom/ss/android/lark/team/common/piece/SettingDividerExport;", "()V", "dividerView", "Landroid/view/View;", "leftMargin", "", "getView", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "providePieceExport", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "setMarginStart", "", "px", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingDividerPiece extends Piece<SettingDividerPiece> implements SettingDividerExport {

    /* renamed from: a */
    private int f136743a;

    /* renamed from: b */
    private View f136744b;

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return TuplesKt.to(SettingDividerExport.class, this);
    }

    @Override // com.ss.android.lark.team.common.piece.SettingDividerExport
    /* renamed from: a */
    public void mo189008a(int i) {
        this.f136743a = i;
        if (mo177206t()) {
            View view = this.f136744b;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dividerView");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMarginStart(this.f136743a);
                marginLayoutParams = marginLayoutParams2;
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View view = new View(context);
        marginLayoutParams.width = -1;
        marginLayoutParams.height = C51468a.m199485a(0.5f, context);
        marginLayoutParams.leftMargin = C51468a.m199486a(this.f136743a);
        view.setBackgroundColor(C57582a.m223616d(context, R.color.line_divider_default));
        this.f136744b = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dividerView");
        }
        return view;
    }
}
