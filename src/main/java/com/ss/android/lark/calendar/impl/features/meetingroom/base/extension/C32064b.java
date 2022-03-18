package com.ss.android.lark.calendar.impl.features.meetingroom.base.extension;

import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a#\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\n¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"editEventIsValid", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "isDisableApprovalMeetingRoom", "isRepeatOrExceptionEvent", "eventDuration", "", "isFree", "resumeIfActive", "", "T", "Lkotlinx/coroutines/CancellableContinuation;", "value", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;)V", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.b */
public final class C32064b {
    /* renamed from: a */
    public static final boolean m121943a(CalendarResource calendarResource) {
        Intrinsics.checkParameterIsNotNull(calendarResource, "$this$isFree");
        if (calendarResource.status == CalendarResource.Status.FREE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final <T> void m121942a(CancellableContinuation<? super T> kVar, T t) {
        Intrinsics.checkParameterIsNotNull(kVar, "$this$resumeIfActive");
        if (kVar.mo243066a()) {
            Result.Companion aVar = Result.Companion;
            kVar.resumeWith(Result.m271569constructorimpl(t));
        }
    }

    /* renamed from: a */
    public static final boolean m121944a(CalendarResource calendarResource, boolean z, boolean z2, long j) {
        boolean z3;
        Intrinsics.checkParameterIsNotNull(calendarResource, "$this$editEventIsValid");
        if (!z || !z2 || !C32065c.m121947a(calendarResource, Long.valueOf(j)).getFirst().booleanValue()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!m121943a(calendarResource) || z3) {
            return false;
        }
        return true;
    }
}
