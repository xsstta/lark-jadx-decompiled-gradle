package com.ss.android.lark.team.common.piece;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.common.DividerType;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bJ\u0013\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/team/common/piece/SettingBasePiece;", "T", "Lcom/ss/android/lark/piece/core/Piece;", "()V", "bottomDivider", "Landroid/view/View;", "bottomDividerType", "Lcom/ss/android/lark/team/common/DividerType;", "containerHeightDp", "", "contentViewClickListener", "Landroid/view/View$OnClickListener;", "topDivider", "topDividerType", ShareHitPoint.f121869d, "(Lcom/ss/android/lark/team/common/DividerType;)Ljava/lang/Object;", "containerHeight", "", "newHeightDp", "getView", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onClick", "listener", "updateDividerType", "dividerView", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class SettingBasePiece<T> extends Piece<T> {

    /* renamed from: a */
    public View.OnClickListener f136732a;

    /* renamed from: b */
    private View f136733b;

    /* renamed from: g */
    private View f136734g;

    /* renamed from: h */
    private DividerType f136735h = DividerType.HIDDEN;

    /* renamed from: i */
    private DividerType f136736i = DividerType.HIDDEN;

    /* renamed from: j */
    private float f136737j = 54.0f;

    /* renamed from: a */
    public final SettingBasePiece<T> mo189002a(View.OnClickListener onClickListener) {
        SettingBasePiece<T> settingBasePiece = this;
        settingBasePiece.f136732a = onClickListener;
        return settingBasePiece;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/team/common/piece/SettingBasePiece$getView$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.SettingBasePiece$a */
    static final class View$OnClickListenerC55383a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingBasePiece f136738a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f136739b;

        /* renamed from: c */
        final /* synthetic */ Context f136740c;

        View$OnClickListenerC55383a(SettingBasePiece settingBasePiece, ViewGroup.MarginLayoutParams marginLayoutParams, Context context) {
            this.f136738a = settingBasePiece;
            this.f136739b = marginLayoutParams;
            this.f136740c = context;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f136738a.f136732a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: a */
    public final T mo189003a(DividerType dividerType) {
        Intrinsics.checkParameterIsNotNull(dividerType, ShareHitPoint.f121869d);
        this.f136735h = dividerType;
        if (mo177206t()) {
            View view = this.f136733b;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topDivider");
            }
            m214942a(view, dividerType);
        }
        return mo177210x();
    }

    /* renamed from: b */
    public final T mo189005b(DividerType dividerType) {
        Intrinsics.checkParameterIsNotNull(dividerType, ShareHitPoint.f121869d);
        this.f136736i = dividerType;
        if (mo177206t()) {
            View view = this.f136734g;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomDivider");
            }
            m214942a(view, dividerType);
        }
        return mo177210x();
    }

    /* renamed from: a */
    public final void mo189004a(float f) {
        ViewGroup.LayoutParams layoutParams;
        this.f136737j = f;
        if (mo177206t() && (layoutParams = mo177205s().getLayoutParams()) != null) {
            float f2 = this.f136737j;
            Context context = mo177205s().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "contentView.context");
            layoutParams.height = C51468a.m199485a(f2, context);
            mo177205s().setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private final void m214942a(View view, DividerType dividerType) {
        if (view != null) {
            int i = C55401d.f136808a[dividerType.ordinal()];
            if (i != 1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = null;
                if (i == 2) {
                    view.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = layoutParams;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.setMarginStart(0);
                        view.setLayoutParams(marginLayoutParams2);
                    }
                } else if (i == 3) {
                    view.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = layoutParams2;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) marginLayoutParams;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.setMarginStart(C57582a.m223600a(16));
                        view.setLayoutParams(marginLayoutParams3);
                    }
                }
            } else {
                view.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        marginLayoutParams.width = -1;
        marginLayoutParams.height = C51468a.m199485a(this.f136737j, context);
        constraintLayout.setBackground(C51468a.m199492b(R.drawable.item_bg_selector_c11, context));
        int a = C51468a.m199485a(0.5f, context);
        int a2 = C51468a.m199487a((int) R.color.line_divider_default, context);
        ConstraintLayout constraintLayout2 = constraintLayout;
        View view = new View(constraintLayout2.getContext());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, a);
        layoutParams.f2816h = 0;
        layoutParams.f2825q = 0;
        layoutParams.f2827s = 0;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(a2);
        m214942a(view, this.f136735h);
        this.f136733b = view;
        constraintLayout2.addView(view);
        View view2 = new View(constraintLayout2.getContext());
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, a);
        layoutParams2.f2819k = 0;
        layoutParams2.f2825q = 0;
        layoutParams2.f2827s = 0;
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(a2);
        m214942a(view2, this.f136736i);
        this.f136734g = view2;
        constraintLayout2.addView(view2);
        constraintLayout.setOnClickListener(new View$OnClickListenerC55383a(this, marginLayoutParams, context));
        return constraintLayout;
    }
}
