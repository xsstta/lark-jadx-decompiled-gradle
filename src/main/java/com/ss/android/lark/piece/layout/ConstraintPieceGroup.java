package com.ss.android.lark.piece.layout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.lark.piece.core.PieceGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/piece/layout/ConstraintPieceGroup;", "Lcom/ss/android/lark/piece/core/PieceGroup;", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "()V", "buildLayoutParamsForChild", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ConstraintPieceGroup extends PieceGroup<ConstraintPieceGroup, ConstraintLayout.LayoutParams> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ConstraintLayout.LayoutParams mo128668b() {
        return new ConstraintLayout.LayoutParams(-2, -2);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        return new ConstraintLayout(context);
    }
}
