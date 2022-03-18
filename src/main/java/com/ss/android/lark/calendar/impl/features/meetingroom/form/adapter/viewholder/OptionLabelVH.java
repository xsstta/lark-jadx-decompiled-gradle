package com.ss.android.lark.calendar.impl.features.meetingroom.form.adapter.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.data.ResourceFormUIData;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.helper.MeetingRoomFormHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/adapter/viewholder/OptionLabelVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/data/ResourceFormUIData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a.a.c */
public final class OptionLabelVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f82013a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionLabelVH(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f82013a = view;
    }

    /* renamed from: a */
    public final void mo117061a(ResourceFormUIData resourceFormUIData) {
        Intrinsics.checkParameterIsNotNull(resourceFormUIData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = (TextView) this.f82013a.findViewById(R.id.customizationLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.customizationLabel");
        textView.setText(MeetingRoomFormHelper.f82028a.mo117084a(resourceFormUIData.mo117126e().label, resourceFormUIData.mo117126e().is_required));
    }
}
