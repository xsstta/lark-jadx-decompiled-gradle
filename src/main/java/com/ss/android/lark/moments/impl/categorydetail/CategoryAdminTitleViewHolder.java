package com.ss.android.lark.moments.impl.categorydetail;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/CategoryAdminTitleViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "onBind", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categorydetail.d */
public final class CategoryAdminTitleViewHolder extends AbstractC58967a<Unit, View> {

    /* renamed from: a */
    public static final Companion f119120a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/CategoryAdminTitleViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/categorydetail/CategoryAdminTitleViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CategoryAdminTitleViewHolder mo165993a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            return new CategoryAdminTitleViewHolder(new TextView(viewGroup.getContext()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryAdminTitleViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo165944a(Unit unit) {
        Intrinsics.checkParameterIsNotNull(unit, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        if (view != null) {
            TextView textView = (TextView) view;
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            textView.setHeight(UIUtils.dp2px(((TextView) view2).getContext(), 20.0f));
            TextView textView2 = textView;
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            int dp2px = UIUtils.dp2px(((TextView) view3).getContext(), 8.0f);
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), dp2px, UIUtils.dp2px(((TextView) view4).getContext(), 2.0f));
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            textView.setText(UIUtils.getString(((TextView) view5).getContext(), R.string.Lark_Moments_Administrator));
            textView.setGravity(16);
            textView.setTextColor(C25653b.m91893a(UIHelper.getColor(R.color.static_white), 0.7f));
            textView.setTextSize(1, 12.0f);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}
