package com.ss.android.lark.calendar.impl.features.events.detail.utils;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.SpanMenuItem;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/utils/RsvpUtil;", "", "()V", "convertToAttendeeStatus", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "replyStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "convertToRsvpStatus", "getRsvpMenuItem", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/SpanMenuItem;", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "getRsvpMenuString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d.e */
public final class RsvpUtil {

    /* renamed from: a */
    public static final RsvpUtil f79159a = new RsvpUtil();

    private RsvpUtil() {
    }

    /* renamed from: a */
    public final RSVPStatus mo113579a(CalendarEventAttendee.Status status) {
        if (status == null) {
            return RSVPStatus.NEEDS_ACTION;
        }
        int i = C31258f.f79161b[status.ordinal()];
        if (i == 1) {
            return RSVPStatus.ACCEPT;
        }
        if (i == 2) {
            return RSVPStatus.DECLINE;
        }
        if (i == 3) {
            return RSVPStatus.TENTATIVE;
        }
        if (i == 4) {
            return RSVPStatus.REMOVED;
        }
        if (i == 5) {
            return RSVPStatus.NEEDS_ACTION;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public final CalendarEventAttendee.Status mo113580a(RSVPStatus rSVPStatus) {
        if (rSVPStatus == null) {
            return CalendarEventAttendee.Status.NEEDS_ACTION;
        }
        int i = C31258f.f79160a[rSVPStatus.ordinal()];
        if (i == 1) {
            return CalendarEventAttendee.Status.NEEDS_ACTION;
        }
        if (i == 2) {
            return CalendarEventAttendee.Status.ACCEPT;
        }
        if (i == 3) {
            return CalendarEventAttendee.Status.TENTATIVE;
        }
        if (i == 4) {
            return CalendarEventAttendee.Status.DECLINE;
        }
        if (i == 5) {
            return CalendarEventAttendee.Status.REMOVED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final SpanMenuItem mo113582b(RSVPStatus rSVPStatus, CalendarEvent.Span span) {
        Intrinsics.checkParameterIsNotNull(rSVPStatus, "replyStatus");
        Intrinsics.checkParameterIsNotNull(span, "span");
        return new SpanMenuItem.Builder().mo115308a(span).mo115309a(mo113581a(rSVPStatus, span)).mo115324i();
    }

    /* renamed from: a */
    public final String mo113581a(RSVPStatus rSVPStatus, CalendarEvent.Span span) {
        Intrinsics.checkParameterIsNotNull(rSVPStatus, "replyStatus");
        Intrinsics.checkParameterIsNotNull(span, "span");
        int i = C31258f.f79164e[span.ordinal()];
        if (i == 1) {
            int i2 = C31258f.f79162c[rSVPStatus.ordinal()];
            if (i2 == 1) {
                String b = C32634ae.m125182b(R.string.Calendar_Detail_AccpetThisEventOnly);
                Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…tail_AccpetThisEventOnly)");
                return b;
            } else if (i2 == 2) {
                String b2 = C32634ae.m125182b(R.string.Calendar_Detail_DeclineThisEventOnly);
                Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…ail_DeclineThisEventOnly)");
                return b2;
            } else if (i2 != 3) {
                return "";
            } else {
                String b3 = C32634ae.m125182b(R.string.Calendar_Detail_TentativeAcceptThisEventOnly);
                Intrinsics.checkExpressionValueIsNotNull(b3, "ResUtil.getString(R.stri…ativeAcceptThisEventOnly)");
                return b3;
            }
        } else if (i != 2) {
            return "";
        } else {
            int i3 = C31258f.f79163d[rSVPStatus.ordinal()];
            if (i3 == 1) {
                String b4 = C32634ae.m125182b(R.string.Calendar_Detail_AcceptAllEvents);
                Intrinsics.checkExpressionValueIsNotNull(b4, "ResUtil.getString(R.stri…r_Detail_AcceptAllEvents)");
                return b4;
            } else if (i3 == 2) {
                String b5 = C32634ae.m125182b(R.string.Calendar_Detail_DeclineAllEvents);
                Intrinsics.checkExpressionValueIsNotNull(b5, "ResUtil.getString(R.stri…_Detail_DeclineAllEvents)");
                return b5;
            } else if (i3 != 3) {
                return "";
            } else {
                String b6 = C32634ae.m125182b(R.string.Calendar_Detail_TentativeAcceptAllEvent);
                Intrinsics.checkExpressionValueIsNotNull(b6, "ResUtil.getString(R.stri…_TentativeAcceptAllEvent)");
                return b6;
            }
        }
    }
}
