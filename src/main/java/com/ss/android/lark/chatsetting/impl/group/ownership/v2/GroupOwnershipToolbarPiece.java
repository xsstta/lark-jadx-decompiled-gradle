package com.ss.android.lark.chatsetting.impl.group.ownership.v2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/GroupOwnershipToolbarPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "()V", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupOwnershipToolbarPiece extends Piece<GroupOwnershipToolbarPiece> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chatsetting/impl/group/ownership/v2/GroupOwnershipToolbarPiece$getView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.GroupOwnershipToolbarPiece$a */
    static final class View$OnClickListenerC34870a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupOwnershipToolbarPiece f90036a;

        /* renamed from: b */
        final /* synthetic */ Context f90037b;

        View$OnClickListenerC34870a(GroupOwnershipToolbarPiece groupOwnershipToolbarPiece, Context context) {
            this.f90036a = groupOwnershipToolbarPiece;
            this.f90037b = context;
        }

        public final void onClick(View view) {
            this.f90036a.mo177212z();
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        CommonTitleBar commonTitleBar = new CommonTitleBar(context);
        commonTitleBar.setBackgroundColor(C51468a.m199487a((int) R.color.bg_base, context));
        commonTitleBar.setTitle(R.string.Lark_Legacy_GroupManagementSetting);
        commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC34870a(this, context));
        return commonTitleBar;
    }
}
