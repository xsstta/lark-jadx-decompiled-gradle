package com.ss.android.lark.piece.layout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.lark.piece.core.PieceGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "Lcom/ss/android/lark/piece/core/PieceGroup;", "Landroid/widget/LinearLayout$LayoutParams;", "orientation", "", "(I)V", "buildLayoutParamsForChild", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
public class LinearPieceGroup extends PieceGroup<LinearPieceGroup, LinearLayout.LayoutParams> {

    /* renamed from: a */
    private final int f128089a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LinearLayout.LayoutParams mo128668b() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public LinearPieceGroup(int i) {
        this.f128089a = i;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(this.f128089a);
        return linearLayout;
    }
}
