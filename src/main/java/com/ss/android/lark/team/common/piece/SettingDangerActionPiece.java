package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/team/common/piece/SettingDangerActionPiece;", "Lcom/ss/android/lark/team/common/piece/SettingBasePiece;", "()V", "titleStr", "", "titleView", "Landroid/widget/TextView;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "title", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SettingDangerActionPiece extends SettingBasePiece<SettingDangerActionPiece> {

    /* renamed from: b */
    private TextView f136741b;

    /* renamed from: g */
    private String f136742g;

    /* renamed from: a */
    public final SettingDangerActionPiece mo189007a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        SettingDangerActionPiece settingDangerActionPiece = this;
        settingDangerActionPiece.f136742g = str;
        if (settingDangerActionPiece.mo177206t()) {
            TextView textView = settingDangerActionPiece.f136741b;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            textView.setText(settingDangerActionPiece.f136742g);
        }
        return settingDangerActionPiece;
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.common.piece.SettingBasePiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View a = super.mo127619a(context, marginLayoutParams);
        if (a != null) {
            ViewGroup viewGroup = (ViewGroup) a;
            TextView textView = new TextView(viewGroup.getContext());
            int a2 = C51468a.m199486a(16);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(a2);
            layoutParams.setMarginEnd(a2);
            layoutParams.f2816h = 0;
            layoutParams.f2819k = 0;
            layoutParams.f2825q = 0;
            layoutParams.f2827s = 0;
            textView.setLayoutParams(layoutParams);
            textView.setTextSize(16.0f);
            textView.setTextColor(C51468a.m199487a((int) R.color.function_danger_500, context));
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setId(R.id.setting_jump_title);
            textView.setText(this.f136742g);
            this.f136741b = textView;
            viewGroup.addView(textView);
            return viewGroup;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
