package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/team/common/piece/MetadataPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "content", "", "(I)V", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MetadataPiece extends Piece<MetadataPiece> {

    /* renamed from: a */
    private final int f136714a;

    public MetadataPiece(int i) {
        this.f136714a = i;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        TextView textView = new TextView(context);
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        textView.setTextSize(14.0f);
        textView.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
        textView.setText(C51468a.m199493c(this.f136714a, context));
        return textView;
    }
}
