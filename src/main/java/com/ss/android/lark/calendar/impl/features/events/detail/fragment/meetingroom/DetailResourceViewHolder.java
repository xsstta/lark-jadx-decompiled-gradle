package com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom.DetailMeetingRoomBinder;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom.DetailResourceFragment;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingRoomView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindData", "", "resourceData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "listener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceFragment$DetailResourceFragmentAction;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.a.d */
public final class DetailResourceViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f79241a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceViewHolder$bindData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailMeetingRoomBinder$DetailMeetingRoomListener;", "onMeetingRoomInfoClicked", "", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.a.d$a */
    public static final class C31299a implements DetailMeetingRoomBinder.DetailMeetingRoomListener {

        /* renamed from: a */
        final /* synthetic */ DetailResourceFragment.DetailResourceFragmentAction f79242a;

        C31299a(DetailResourceFragment.DetailResourceFragmentAction aVar) {
            this.f79242a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom.DetailMeetingRoomBinder.DetailMeetingRoomListener
        /* renamed from: a */
        public void mo113707a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            this.f79242a.mo113716a(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DetailResourceViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f79241a = view;
    }

    /* renamed from: a */
    public final void mo113718a(IBodyData.IMeetingRoomData iMeetingRoomData, DetailResourceFragment.DetailResourceFragmentAction aVar) {
        Intrinsics.checkParameterIsNotNull(iMeetingRoomData, "resourceData");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        DetailMeetingRoomBinder aVar2 = DetailMeetingRoomBinder.f79228a;
        MeetingRoomView meetingRoomView = (MeetingRoomView) this.f79241a.findViewById(R.id.resourceView);
        Intrinsics.checkExpressionValueIsNotNull(meetingRoomView, "view.resourceView");
        aVar2.mo113706a(meetingRoomView, iMeetingRoomData, new C31299a(aVar));
    }
}
