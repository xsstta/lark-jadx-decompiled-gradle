package com.ss.android.lark.chatsetting.impl.common_view.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingCenterTextPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingBasePiece;", "()V", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "titleColorRes", "", "titleRes", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class SettingCenterTextPiece extends SettingBasePiece<SettingCenterTextPiece> {
    /* renamed from: j */
    public abstract int mo127642j();

    /* renamed from: k */
    public int mo127643k() {
        return R.color.function_danger_500;
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View a = super.mo127619a(context, marginLayoutParams);
        if (a != null) {
            ViewGroup viewGroup = (ViewGroup) a;
            viewGroup.setBackground(C51468a.m199492b(R.drawable.bg_setting_group_item_round, context));
            int a2 = C51468a.m199486a(54);
            TextView textView = new TextView(viewGroup.getContext());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, a2);
            layoutParams.f2816h = 0;
            layoutParams.f2819k = 0;
            layoutParams.f2825q = 0;
            layoutParams.f2827s = 0;
            textView.setLayoutParams(layoutParams);
            textView.setText(C51468a.m199493c(mo127642j(), context));
            textView.setTextSize(15.0f);
            textView.setTextColor(C51468a.m199487a(mo127643k(), context));
            textView.setGravity(17);
            viewGroup.addView(textView);
            return viewGroup;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
