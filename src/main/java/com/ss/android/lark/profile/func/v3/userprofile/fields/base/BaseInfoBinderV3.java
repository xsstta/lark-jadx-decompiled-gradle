package com.ss.android.lark.profile.func.v3.userprofile.fields.base;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.profile.func.user_profile.base.TextStyle;
import com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import com.ss.android.lark.ui.ExpandTextView;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0004J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0004J,\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0004J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H&R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006$"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "VD", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "DP", "Lcom/ss/android/lark/profile/func/v3/userprofile/IBinderDependencyV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseProfileBinderV3;", "dependency", "(Lcom/ss/android/lark/profile/func/v3/userprofile/IBinderDependencyV3;)V", "mTypeTextViewMaxWidth", "", "mValueMarginLeft", "getMValueMarginLeft", "()I", "bindBottomLine", "", "lineView", "Landroid/view/View;", "isLast", "", "bindFieldName", "textView", "Landroid/widget/TextView;", "fieldName", "", "bindTextStyle", "textStyle", "Lcom/ss/android/lark/profile/func/user_profile/base/TextStyle;", "expandTextView", "Lcom/ss/android/lark/ui/ExpandTextView;", "collapseDrawable", "Landroid/graphics/drawable/Drawable;", "expandDrawable", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.c.a */
public abstract class BaseInfoBinderV3<VD extends BaseInfoViewDataV3, DP extends IBinderDependencyV3> extends BaseProfileBinderV3<VD, DP> {

    /* renamed from: a */
    private final int f130490a = ((UIHelper.getWindowWidth(mo180255b().mo180100a()) - UIHelper.dp2px(64.0f)) / 2);

    /* renamed from: b */
    private final int f130491b = UIUtils.dp2px(mo180255b().mo180100a(), 44.0f);

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo180235a(ViewGroup viewGroup);

    /* renamed from: a */
    public final int mo180250a() {
        return this.f130491b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseInfoBinderV3(DP dp) {
        super(dp);
        Intrinsics.checkParameterIsNotNull(dp, "dependency");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo180251a(View view, boolean z) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "lineView");
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo180252a(TextView textView, String str) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        textView.setMaxWidth(this.f130490a);
        textView.setText(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo180253a(TextStyle eVar, ExpandTextView expandTextView, Drawable drawable, Drawable drawable2) {
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
