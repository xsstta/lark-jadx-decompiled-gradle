package com.ss.android.lark.calendar.impl.features.meetingroom.signin.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.utils.CalendarLoadAvatarUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/adapter/ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "contact", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.a.b */
public final class ViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f82198a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f82198a = view;
    }

    /* renamed from: a */
    public final void mo117406a(CalendarEventCreator calendarEventCreator) {
        Intrinsics.checkParameterIsNotNull(calendarEventCreator, "contact");
        TextView textView = (TextView) this.f82198a.findViewById(R.id.adapterContactNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.adapterContactNameTv");
        textView.setText(calendarEventCreator.getName());
        Context context = this.f82198a.getContext();
        if (context != null) {
            CalendarLoadAvatarUtil.m125306a(context, (SelectableRoundedImageView) this.f82198a.findViewById(R.id.adapterContactAvatarIv), 32, 32, calendarEventCreator.getAvatarKey(), calendarEventCreator.getChatterId(), null);
        }
    }
}
