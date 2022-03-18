package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.TypeTitleModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/TypeTitleViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/TypeTitleModel;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "setUpView", "", "model", "position", "", "adapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.n */
public final class TypeTitleViewHolder extends BaseViewHolder<TypeTitleModel> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeTitleViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo115682a(TypeTitleModel mVar, int i, BuildingAdapter cVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar, "adapter");
        ImageView imageView = (ImageView) mo115681a(R.id.icon);
        if (imageView != null) {
            imageView.setImageResource(mVar.mo115815a());
        }
        TextView textView = (TextView) mo115681a(R.id.meeting_room_type_title);
        if (textView != null) {
            textView.setText(mVar.mo115817b());
        }
    }
}
