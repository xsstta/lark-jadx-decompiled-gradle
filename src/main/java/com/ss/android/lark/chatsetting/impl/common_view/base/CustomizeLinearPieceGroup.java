package com.ss.android.lark.chatsetting.impl.common_view.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.piece.layout.LinearPieceGroup;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J.\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011J.\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/common_view/base/CustomizeLinearPieceGroup;", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "orientation", "", "(I)V", "bottomPadding", "endPadding", "startPadding", "topPadding", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "setPadding", "start", "", "top", "end", "bottom", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CustomizeLinearPieceGroup extends LinearPieceGroup {

    /* renamed from: a */
    private int f89137a;

    /* renamed from: b */
    private int f89138b;

    /* renamed from: g */
    private int f89139g;

    /* renamed from: h */
    private int f89140h;

    /* renamed from: i */
    private final int f89141i;

    public CustomizeLinearPieceGroup(int i) {
        super(i);
        this.f89141i = i;
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.piece.layout.LinearPieceGroup
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View a = super.mo127619a(context, marginLayoutParams);
        a.setPadding(this.f89139g, this.f89138b, this.f89140h, this.f89137a);
        return a;
    }

    /* renamed from: a */
    public final CustomizeLinearPieceGroup mo127620a(Context context, float f, float f2, float f3, float f4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        CustomizeLinearPieceGroup customizeLinearPieceGroup = this;
        customizeLinearPieceGroup.f89139g = C51468a.m199485a(f, context);
        customizeLinearPieceGroup.f89138b = C51468a.m199485a(f2, context);
        customizeLinearPieceGroup.f89140h = C51468a.m199485a(f3, context);
        customizeLinearPieceGroup.f89137a = C51468a.m199485a(f4, context);
        if (customizeLinearPieceGroup.mo177206t()) {
            customizeLinearPieceGroup.mo177205s().setPadding(customizeLinearPieceGroup.f89139g, customizeLinearPieceGroup.f89138b, customizeLinearPieceGroup.f89140h, customizeLinearPieceGroup.f89137a);
        }
        return customizeLinearPieceGroup;
    }

    /* renamed from: a */
    public final CustomizeLinearPieceGroup mo127621a(Context context, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        CustomizeLinearPieceGroup customizeLinearPieceGroup = this;
        customizeLinearPieceGroup.mo127620a(context, (float) i, (float) i2, (float) i3, (float) i4);
        return customizeLinearPieceGroup;
    }
}
