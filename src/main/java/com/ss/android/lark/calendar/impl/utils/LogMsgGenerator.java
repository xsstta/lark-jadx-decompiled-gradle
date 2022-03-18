package com.ss.android.lark.calendar.impl.utils;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/LogMsgGenerator;", "", "()V", "getRSVPMsg", "", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.z */
public final class LogMsgGenerator {

    /* renamed from: a */
    public static final LogMsgGenerator f83821a = new LogMsgGenerator();

    private LogMsgGenerator() {
    }

    /* renamed from: a */
    public final String mo120363a(RSVPStatus rSVPStatus, CalendarEvent.Span span) {
        String str;
        Intrinsics.checkParameterIsNotNull(rSVPStatus, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(span, "span");
        int i = C32630aa.f83728d[rSVPStatus.ordinal()];
        if (i == 1) {
            int i2 = C32630aa.f83725a[span.ordinal()];
            if (i2 == 1) {
                str = "acceptAll";
            } else if (i2 == 2) {
                str = "acceptThis";
            } else if (i2 != 3) {
                str = "reply accept span exception = " + span;
            } else {
                str = "accept";
            }
        } else if (i == 2) {
            int i3 = C32630aa.f83726b[span.ordinal()];
            if (i3 == 1) {
                str = "refuseAll";
            } else if (i3 == 2) {
                str = "refuseThis";
            } else if (i3 != 3) {
                str = "reply refuse span exception = " + span;
            } else {
                str = "refuse";
            }
        } else if (i != 3) {
            str = "reply status exception = " + rSVPStatus;
        } else {
            int i4 = C32630aa.f83727c[span.ordinal()];
            if (i4 == 1) {
                str = "udmAll";
            } else if (i4 == 2) {
                str = "udmThis";
            } else if (i4 != 3) {
                str = "reply udm span exception = " + span;
            } else {
                str = "udm";
            }
        }
        String d = C32673y.m125378d(str);
        Intrinsics.checkExpressionValueIsNotNull(d, "LogMessageUtil.getMonitorMsg(msg)");
        return d;
    }
}
