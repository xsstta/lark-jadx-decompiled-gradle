package com.ss.android.lark.profile.func.user_profile.infos;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.profile.func.user_profile.base.BaseProfileBinder;
import com.ss.android.lark.profile.func.user_profile.base.IBinderDependency;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import com.ss.android.lark.ui.ExpandTextView;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0004J\u001a\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H&J \u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0014R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006&"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoBinder;", "VD", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "DP", "Lcom/ss/android/lark/profile/func/user_profile/base/IBinderDependency;", "Lcom/ss/android/lark/profile/func/user_profile/base/BaseProfileBinder;", "dependency", "(Lcom/ss/android/lark/profile/func/user_profile/base/IBinderDependency;)V", "mMarginVer", "", "getMMarginVer", "()I", "mTypeTextViewMaxWidth", "mValueMarginLeft", "getMValueMarginLeft", "binderTextStyle", "", "textStyle", "Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "expandTextView", "Lcom/ss/android/lark/ui/ExpandTextView;", "collapseDrawable", "Landroid/graphics/drawable/Drawable;", "expandDrawable", "binderType", "textView", "Landroid/widget/TextView;", "name", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "setDesktopLayout", "rootView", "Landroid/view/View;", "lineView", "labelView", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.a */
public abstract class BaseInfoBinder<VD extends BaseInfoViewData, DP extends IBinderDependency> extends BaseProfileBinder<VD, DP> {

    /* renamed from: a */
    private final int f130239a = UIHelper.dp2px(10.0f);

    /* renamed from: b */
    private final int f130240b = ((UIHelper.getWindowWidth(mo179589a().mo179591d()) - UIHelper.dp2px(64.0f)) / 2);

    /* renamed from: c */
    private final int f130241c = UIUtils.dp2px(mo179589a().mo179591d(), 44.0f);

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo179842a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo179846b() {
        return this.f130239a;
    }

    /* renamed from: c */
    public final int mo179847c() {
        return this.f130241c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseInfoBinder(DP dp) {
        super(dp);
        Intrinsics.checkParameterIsNotNull(dp, "dependency");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo179844a(TextView textView, String str) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        textView.setMaxWidth(this.f130240b);
        textView.setText(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo179843a(View view, View view2, View view3) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(view2, "lineView");
        Intrinsics.checkParameterIsNotNull(view3, "labelView");
        if (view3 instanceof TextView) {
            DesktopUtil.m144299a((TextView) view3);
        }
        view2.setVisibility(8);
        view.setMinimumHeight(UIHelper.dp2px(36.0f));
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, this.f130239a, marginLayoutParams.rightMargin, this.f130239a);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo179845a(TextStyle eVar, ExpandTextView expandTextView, Drawable drawable, Drawable drawable2) {
        Intrinsics.checkParameterIsNotNull(eVar, "textStyle");
        Intrinsics.checkParameterIsNotNull(expandTextView, "expandTextView");
        if (eVar.mo179598c() != 0) {
            expandTextView.setTextColor(eVar.mo179598c());
        }
        if (eVar.mo179593a() != 0) {
            expandTextView.setMaxCollapsedLines(eVar.mo179593a());
        }
        expandTextView.setEnabled(eVar.mo179597b());
        expandTextView.setClickable(eVar.mo179597b());
        if (!eVar.mo179597b()) {
            expandTextView.setCollapseDrawable(null);
            expandTextView.setExpandDrawable(null);
            expandTextView.setOnClickListener(null);
            return;
        }
        expandTextView.setCollapseDrawable(drawable);
        expandTextView.setExpandDrawable(drawable2);
        expandTextView.setOnClickListener(expandTextView);
    }
}
