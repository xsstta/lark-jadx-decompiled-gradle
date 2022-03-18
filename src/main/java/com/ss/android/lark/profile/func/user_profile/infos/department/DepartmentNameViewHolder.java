package com.ss.android.lark.profile.func.user_profile.infos.department;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/department/DepartmentNameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mDepartmentNameTv", "Lcom/ss/android/lark/ui/ExpandTextView;", "getMDepartmentNameTv", "()Lcom/ss/android/lark/ui/ExpandTextView;", "mSpreadIv", "Landroid/widget/ImageView;", "getMSpreadIv", "()Landroid/widget/ImageView;", "setMSpreadIv", "(Landroid/widget/ImageView;)V", "mSpreadTv", "Landroid/widget/TextView;", "getMSpreadTv", "()Landroid/widget/TextView;", "mSpreadWrapper", "getMSpreadWrapper", "()Landroid/view/View;", "setupItemInDesktop", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.department.e */
public final class DepartmentNameViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final ExpandTextView f130301a;

    /* renamed from: b */
    private final View f130302b;

    /* renamed from: c */
    private final TextView f130303c;

    /* renamed from: d */
    private ImageView f130304d;

    /* renamed from: a */
    public final ExpandTextView mo179894a() {
        return this.f130301a;
    }

    /* renamed from: b */
    public final View mo179895b() {
        return this.f130302b;
    }

    /* renamed from: c */
    public final TextView mo179896c() {
        return this.f130303c;
    }

    /* renamed from: d */
    private final void m203992d() {
        ViewGroup.LayoutParams layoutParams = this.f130301a.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
            ViewGroup.LayoutParams layoutParams2 = this.f130302b.getLayoutParams();
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, 0, 0, 0);
                this.f130302b.setPadding(0, 0, 0, 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentNameViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.department_name_tv);
        Intrinsics.checkExpressionValueIsNotNull(expandTextView, "itemView.department_name_tv");
        this.f130301a = expandTextView;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.spread_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "itemView.spread_wrapper");
        this.f130302b = linearLayout;
        TextView textView = (TextView) view.findViewById(R.id.spread_btn);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.spread_btn");
        this.f130303c = textView;
        ImageView imageView = (ImageView) view.findViewById(R.id.spread_iv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.spread_iv");
        this.f130304d = imageView;
        ButterKnife.bind(this, view);
        if (DesktopUtil.m144301a(view.getContext())) {
            m203992d();
        }
    }
}
