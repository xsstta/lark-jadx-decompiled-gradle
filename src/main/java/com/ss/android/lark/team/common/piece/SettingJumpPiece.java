package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/team/common/piece/SettingJumpPiece;", "Lcom/ss/android/lark/team/common/piece/SettingBasePiece;", "()V", "arrowVisible", "", "hintStr", "", "hintView", "Landroid/widget/TextView;", "rightArrow", "Landroid/widget/ImageView;", "subtitleStr", "subtitleView", "titleStr", "titleView", "isVisible", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "hint", "subtitle", "title", "updateTitleView", "", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SettingJumpPiece extends SettingBasePiece<SettingJumpPiece> {

    /* renamed from: b */
    public static final Companion f136745b = new Companion(null);

    /* renamed from: g */
    private TextView f136746g;

    /* renamed from: h */
    private TextView f136747h;

    /* renamed from: i */
    private TextView f136748i;

    /* renamed from: j */
    private ImageView f136749j;

    /* renamed from: k */
    private String f136750k;

    /* renamed from: l */
    private String f136751l;

    /* renamed from: m */
    private String f136752m;

    /* renamed from: n */
    private boolean f136753n = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/team/common/piece/SettingJumpPiece$Companion;", "", "()V", "HEIGHT_TITLE_ONLY", "", "HEIGHT_WITH_SUBTITLE", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.SettingJumpPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void mo189017a() {
        boolean z;
        int a = C57582a.m223600a(16);
        TextView textView = this.f136746g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            layoutParams = null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (layoutParams2 == null) {
            layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
        }
        layoutParams2.setMarginStart(a);
        layoutParams2.setMarginEnd(C51468a.m199486a(8));
        layoutParams2.f2833y = a;
        layoutParams2.f2816h = 0;
        layoutParams2.f2825q = 0;
        layoutParams2.f2826r = R.id.setting_jump_hint;
        String str = this.f136751l;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            layoutParams2.topMargin = 0;
            layoutParams2.f2819k = 0;
        } else {
            layoutParams2.topMargin = a;
            layoutParams2.f2819k = -1;
        }
        textView.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public final SettingJumpPiece mo189009a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        SettingJumpPiece settingJumpPiece = this;
        settingJumpPiece.f136750k = str;
        if (settingJumpPiece.mo177206t()) {
            TextView textView = settingJumpPiece.f136746g;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            textView.setText(settingJumpPiece.f136750k);
        }
        return settingJumpPiece;
    }

    /* renamed from: c */
    public final SettingJumpPiece mo189011c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "hint");
        SettingJumpPiece settingJumpPiece = this;
        settingJumpPiece.f136752m = str;
        if (settingJumpPiece.mo177206t()) {
            TextView textView = settingJumpPiece.f136748i;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("hintView");
            }
            textView.setText(settingJumpPiece.f136752m);
        }
        return settingJumpPiece;
    }

    /* renamed from: b */
    public final SettingJumpPiece mo189010b(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "subtitle");
        SettingJumpPiece settingJumpPiece = this;
        settingJumpPiece.f136751l = str;
        if (settingJumpPiece.mo177206t()) {
            TextView textView = settingJumpPiece.f136747h;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subtitleView");
            }
            textView.setText(settingJumpPiece.f136751l);
            TextView textView2 = settingJumpPiece.f136747h;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subtitleView");
            }
            String str2 = settingJumpPiece.f136751l;
            int i = 0;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            }
            textView2.setVisibility(i);
            settingJumpPiece.mo189017a();
        }
        return settingJumpPiece;
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.common.piece.SettingBasePiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        boolean z;
        boolean z2;
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        String str = this.f136751l;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo189004a(54.0f);
        } else {
            mo189004a(80.0f);
        }
        View a = super.mo127619a(context, marginLayoutParams);
        if (a != null) {
            ViewGroup viewGroup = (ViewGroup) a;
            int a2 = C51468a.m199486a(16);
            TextView textView = new TextView(viewGroup.getContext());
            textView.setLayoutParams(new ConstraintLayout.LayoutParams(0, -2));
            textView.setTextSize(16.0f);
            textView.setTextColor(C51468a.m199487a((int) R.color.text_title, context));
            textView.setText(this.f136750k);
            textView.setGravity(8388611);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setId(R.id.setting_jump_title);
            this.f136746g = textView;
            viewGroup.addView(textView);
            mo189017a();
            TextView textView2 = new TextView(viewGroup.getContext());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(a2);
            layoutParams.f2817i = R.id.setting_jump_title;
            layoutParams.f2825q = 0;
            layoutParams.topMargin = C51468a.m199486a(4);
            textView2.setLayoutParams(layoutParams);
            textView2.setTextSize(14.0f);
            textView2.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
            textView2.setText(this.f136751l);
            textView2.setSingleLine();
            textView2.setMaxLines(1);
            textView2.setLines(1);
            String str2 = this.f136751l;
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
            textView2.setId(R.id.setting_jump_subtitle);
            this.f136747h = textView2;
            viewGroup.addView(textView2);
            TextView textView3 = new TextView(viewGroup.getContext());
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
            int a3 = C51468a.m199486a(8);
            layoutParams2.f2816h = R.id.setting_jump_title;
            layoutParams2.f2819k = R.id.setting_jump_title;
            layoutParams2.f2826r = R.id.setting_jump_arrow;
            layoutParams2.setMarginEnd(a3);
            layoutParams2.setMarginStart(a3);
            layoutParams2.f2833y = a2;
            textView3.setLayoutParams(layoutParams2);
            textView3.setTextSize(14.0f);
            textView3.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
            textView3.setText(this.f136752m);
            textView3.setSingleLine();
            textView3.setMaxLines(1);
            textView3.setLines(1);
            textView3.setId(R.id.setting_jump_hint);
            this.f136748i = textView3;
            viewGroup.addView(textView3);
            ImageView imageView = new ImageView(viewGroup.getContext());
            ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(a2, a2);
            layoutParams3.setMarginEnd(a2);
            layoutParams3.f2816h = R.id.setting_jump_title;
            layoutParams3.f2819k = R.id.setting_jump_title;
            layoutParams3.f2827s = 0;
            imageView.setLayoutParams(layoutParams3);
            imageView.setImageDrawable(C51468a.m199489a((int) R.drawable.ud_icon_right_outlined, context, (int) R.color.icon_n3));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setId(R.id.setting_jump_arrow);
            if (!this.f136753n) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            this.f136749j = imageView;
            viewGroup.addView(imageView);
            return viewGroup;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
