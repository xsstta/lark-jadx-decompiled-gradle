package com.ss.android.lark.calendar.impl.features.search.calendar.vh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/vh/CalendarListSubscribeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "listener", "Landroid/view/View$OnClickListener;", "(Landroid/view/View;Landroid/view/View$OnClickListener;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.vh.b */
public final class CalendarListSubscribeViewHolder extends RecyclerView.ViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarListSubscribeViewHolder(View view, final View.OnClickListener onClickListener) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        ButterKnife.bind(this, view);
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListSubscribeViewHolder.View$OnClickListenerC323551 */

            public final void onClick(View view) {
                onClickListener.onClick(view);
            }
        });
    }
}
