package com.ss.android.lark.calendar.impl.features.calendars.selector.vh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarTitleVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mView", "Landroid/view/View;", "(Landroid/view/View;)V", "adjust2BigStyle", "", "bindItem", "item", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;", "setSidebarStyle", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.vh.d */
public final class CalendarTitleVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f76188a;

    /* renamed from: a */
    public final void mo109859a() {
        ((TextView) this.f76188a.findViewById(R.id.titleTV)).setTextSize(1, 16.0f);
        ((TextView) this.f76188a.findViewById(R.id.titleTV)).setTextColor(UIHelper.getColor(R.color.text_caption));
        LinearLayout linearLayout = (LinearLayout) this.f76188a.findViewById(R.id.titleContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mView.titleContainer");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = UIUtils.dp2px(this.f76188a.getContext(), 54.0f);
        LinearLayout linearLayout2 = (LinearLayout) this.f76188a.findViewById(R.id.titleContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "mView.titleContainer");
        linearLayout2.setLayoutParams(layoutParams);
        ((LinearLayout) this.f76188a.findViewById(R.id.titleContainer)).setBackgroundColor(UIHelper.getColor(R.color.bg_body));
        View findViewById = this.f76188a.findViewById(R.id.divideViewTop);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mView.divideViewTop");
        findViewById.setVisibility(8);
        View findViewById2 = this.f76188a.findViewById(R.id.divideViewBottom);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mView.divideViewBottom");
        findViewById2.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarTitleVH(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "mView");
        this.f76188a = view;
    }

    /* renamed from: a */
    public final void mo109860a(DataListItem dataListItem) {
        int i;
        Intrinsics.checkParameterIsNotNull(dataListItem, "item");
        LinearLayout linearLayout = (LinearLayout) this.f76188a.findViewById(R.id.titleContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mView.titleContainer");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = UIUtils.dp2px(this.f76188a.getContext(), 36.0f);
            ((TextView) this.f76188a.findViewById(R.id.titleTV)).setTextSize(1, 14.0f);
            LinearLayout linearLayout2 = (LinearLayout) this.f76188a.findViewById(R.id.titleContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "mView.titleContainer");
            linearLayout2.setLayoutParams(layoutParams2);
            TextView textView = (TextView) this.f76188a.findViewById(R.id.titleTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mView.titleTV");
            textView.setText(dataListItem.mo109834s());
            View findViewById = this.f76188a.findViewById(R.id.divideViewTop);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "mView.divideViewTop");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            if (Intrinsics.areEqual(view.getTag(), (Object) 0)) {
                i = 8;
            } else {
                i = 0;
            }
            findViewById.setVisibility(i);
            ImageView imageView = (ImageView) this.f76188a.findViewById(R.id.calendarTypeMarkIV);
            if (dataListItem.mo109838w()) {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ud_icon_google_colorful);
            } else if (dataListItem.mo109839x()) {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ud_icon_exchange_colorful);
            } else if (dataListItem.mo109836u()) {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ud_icon_phone_colorful);
            } else {
                imageView.setVisibility(8);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }
}
