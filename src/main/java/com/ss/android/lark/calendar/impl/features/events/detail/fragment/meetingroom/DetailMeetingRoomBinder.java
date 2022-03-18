package com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingRoomView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailMeetingRoomBinder;", "", "()V", "bindMeetingRoom", "", "meetingRoomView", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/MeetingRoomView;", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "resourceListener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailMeetingRoomBinder$DetailMeetingRoomListener;", "getStrikeThroughSpan", "", "prefix", "", "meetingRoomName", "openApproval", "context", "Landroid/content/Context;", "DetailMeetingRoomListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.a.a */
public final class DetailMeetingRoomBinder {

    /* renamed from: a */
    public static final DetailMeetingRoomBinder f79228a = new DetailMeetingRoomBinder();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailMeetingRoomBinder$DetailMeetingRoomListener;", "", "onMeetingRoomInfoClicked", "", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.a.a$a */
    public interface DetailMeetingRoomListener {
        /* renamed from: a */
        void mo113707a(String str);
    }

    private DetailMeetingRoomBinder() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onClickSpanText"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.a.a$c */
    static final class C31297c implements MeetingRoomView.AbstractC31467a {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomView f79231a;

        /* renamed from: b */
        final /* synthetic */ IBodyData.IMeetingRoomData f79232b;

        C31297c(MeetingRoomView meetingRoomView, IBodyData.IMeetingRoomData iMeetingRoomData) {
            this.f79231a = meetingRoomView;
            this.f79232b = iMeetingRoomData;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingRoomView.AbstractC31467a
        /* renamed from: a */
        public final void mo113709a() {
            DetailMeetingRoomBinder aVar = DetailMeetingRoomBinder.f79228a;
            Context context = this.f79231a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "meetingRoomView.context");
            aVar.mo113705a(context, this.f79232b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.a.a$b */
    static final class View$OnClickListenerC31296b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DetailMeetingRoomListener f79229a;

        /* renamed from: b */
        final /* synthetic */ IBodyData.IMeetingRoomData f79230b;

        View$OnClickListenerC31296b(DetailMeetingRoomListener aVar, IBodyData.IMeetingRoomData iMeetingRoomData) {
            this.f79229a = aVar;
            this.f79230b = iMeetingRoomData;
        }

        public final void onClick(View view) {
            this.f79229a.mo113707a(this.f79230b.mo113631f());
        }
    }

    /* renamed from: a */
    private final CharSequence m117615a(String str, String str2) {
        SpannableString spannableString = new SpannableString(str + " " + str2);
        spannableString.setSpan(new StrikethroughSpan(), str.length(), str.length() + str2.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    public final void mo113705a(Context context, IBodyData.IMeetingRoomData iMeetingRoomData) {
        boolean z;
        if (iMeetingRoomData.mo113629d()) {
            String e = iMeetingRoomData.mo113630e();
            if (e.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C30022a.f74882a.browserModuleDependency().mo108211a(context, e);
            }
        }
    }

    /* renamed from: a */
    public final void mo113706a(MeetingRoomView meetingRoomView, IBodyData.IMeetingRoomData iMeetingRoomData, DetailMeetingRoomListener aVar) {
        Intrinsics.checkParameterIsNotNull(meetingRoomView, "meetingRoomView");
        Intrinsics.checkParameterIsNotNull(iMeetingRoomData, "meetingRoom");
        Intrinsics.checkParameterIsNotNull(aVar, "resourceListener");
        meetingRoomView.getMeetingRoomInfoView().setOnClickListener(new View$OnClickListenerC31296b(aVar, iMeetingRoomData));
        meetingRoomView.setDisabledTvVisibility(iMeetingRoomData.mo113628c());
        String b = iMeetingRoomData.mo113627b();
        int a = iMeetingRoomData.mo113626a();
        boolean z = false;
        if (a == 0) {
            meetingRoomView.mo114182a(true, (CharSequence) b);
        } else if (a == 1) {
            String b2 = C32634ae.m125182b(R.string.Calendar_Meeting_FailedToReserve);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…_Meeting_FailedToReserve)");
            meetingRoomView.mo114182a(false, m117615a(b2, b));
        } else if (a == 3) {
            String b3 = C32634ae.m125182b(R.string.Calendar_Bot_MeetingRoomReleased);
            Intrinsics.checkExpressionValueIsNotNull(b3, "ResUtil.getString(R.stri…_Bot_MeetingRoomReleased)");
            meetingRoomView.mo114182a(false, m117615a(b3, b));
        } else if (a == 4) {
            String b4 = C32634ae.m125182b(R.string.Calendar_Approval_InReview);
            if (b4 == null) {
                b4 = "";
            }
            meetingRoomView.mo114181a(b, b4, new C31297c(meetingRoomView, iMeetingRoomData));
        } else if (a == 5) {
            String b5 = C32634ae.m125182b(R.string.Calendar_Detail_ReservingMobile);
            StringBuilder sb = new StringBuilder();
            sb.append(b5);
            sb.append(" ");
            sb.append(b);
            meetingRoomView.setMeetingRoom(sb);
        }
        if (a == 4) {
            z = true;
        }
        meetingRoomView.setIsMeetingRoomApproval(z);
    }
}
