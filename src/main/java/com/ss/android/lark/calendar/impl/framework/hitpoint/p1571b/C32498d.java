package com.ss.android.lark.calendar.impl.framework.hitpoint.p1571b;

import com.ss.android.lark.calendar.impl.features.calendars.subscribe.SubViewType;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.b.d */
public final /* synthetic */ class C32498d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f83336a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f83337b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f83338c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f83339d;

    /* renamed from: e */
    public static final /* synthetic */ int[] f83340e;

    /* renamed from: f */
    public static final /* synthetic */ int[] f83341f;

    /* renamed from: g */
    public static final /* synthetic */ int[] f83342g;

    /* renamed from: h */
    public static final /* synthetic */ int[] f83343h;

    /* renamed from: i */
    public static final /* synthetic */ int[] f83344i;

    /* renamed from: j */
    public static final /* synthetic */ int[] f83345j;

    /* renamed from: k */
    public static final /* synthetic */ int[] f83346k;

    /* renamed from: l */
    public static final /* synthetic */ int[] f83347l;

    /* renamed from: m */
    public static final /* synthetic */ int[] f83348m;

    static {
        int[] iArr = new int[CalendarEventAttendee.Status.values().length];
        f83336a = iArr;
        iArr[CalendarEventAttendee.Status.DECLINE.ordinal()] = 1;
        iArr[CalendarEventAttendee.Status.TENTATIVE.ordinal()] = 2;
        iArr[CalendarEventAttendee.Status.ACCEPT.ordinal()] = 3;
        int[] iArr2 = new int[CalendarEventAttendee.Status.values().length];
        f83337b = iArr2;
        iArr2[CalendarEventAttendee.Status.ACCEPT.ordinal()] = 1;
        iArr2[CalendarEventAttendee.Status.DECLINE.ordinal()] = 2;
        iArr2[CalendarEventAttendee.Status.TENTATIVE.ordinal()] = 3;
        int[] iArr3 = new int[CalendarEventAttendee.Status.values().length];
        f83338c = iArr3;
        iArr3[CalendarEventAttendee.Status.ACCEPT.ordinal()] = 1;
        iArr3[CalendarEventAttendee.Status.DECLINE.ordinal()] = 2;
        iArr3[CalendarEventAttendee.Status.TENTATIVE.ordinal()] = 3;
        int[] iArr4 = new int[Calendar.Type.values().length];
        f83339d = iArr4;
        iArr4[Calendar.Type.PRIMARY.ordinal()] = 1;
        iArr4[Calendar.Type.OTHER.ordinal()] = 2;
        iArr4[Calendar.Type.GOOGLE.ordinal()] = 3;
        iArr4[Calendar.Type.EXCHANGE.ordinal()] = 4;
        int[] iArr5 = new int[Calendar.Type.values().length];
        f83340e = iArr5;
        iArr5[Calendar.Type.OTHER.ordinal()] = 1;
        iArr5[Calendar.Type.RESOURCES.ordinal()] = 2;
        int[] iArr6 = new int[CalendarMember.CalendarMemberType.values().length];
        f83341f = iArr6;
        iArr6[CalendarMember.CalendarMemberType.GROUP.ordinal()] = 1;
        int[] iArr7 = new int[Calendar.Type.values().length];
        f83342g = iArr7;
        iArr7[Calendar.Type.PRIMARY.ordinal()] = 1;
        iArr7[Calendar.Type.RESOURCES.ordinal()] = 2;
        int[] iArr8 = new int[CalendarEvent.Type.values().length];
        f83343h = iArr8;
        iArr8[CalendarEvent.Type.MEETING.ordinal()] = 1;
        int[] iArr9 = new int[CalendarEvent.Span.values().length];
        f83344i = iArr9;
        iArr9[CalendarEvent.Span.FUTURE_EVENTS.ordinal()] = 1;
        iArr9[CalendarEvent.Span.ALL_EVENTS.ordinal()] = 2;
        int[] iArr10 = new int[ShareType.values().length];
        f83345j = iArr10;
        iArr10[ShareType.LARK.ordinal()] = 1;
        iArr10[ShareType.COPY.ordinal()] = 2;
        iArr10[ShareType.CREATE_IMAGE.ordinal()] = 3;
        iArr10[ShareType.WX.ordinal()] = 4;
        iArr10[ShareType.WX_TIMELINE.ordinal()] = 5;
        iArr10[ShareType.WEIBO.ordinal()] = 6;
        iArr10[ShareType.QQ.ordinal()] = 7;
        iArr10[ShareType.SAVE_IMAGE.ordinal()] = 8;
        iArr10[ShareType.SYS.ordinal()] = 9;
        int[] iArr11 = new int[SubViewType.values().length];
        f83346k = iArr11;
        iArr11[SubViewType.Contact.ordinal()] = 1;
        iArr11[SubViewType.ShareCalendar.ordinal()] = 2;
        int[] iArr12 = new int[CalendarEvent.NotificationType.values().length];
        f83347l = iArr12;
        iArr12[CalendarEvent.NotificationType.SEND_NOTIFICATION.ordinal()] = 1;
        iArr12[CalendarEvent.NotificationType.NO_NOTIFICATION.ordinal()] = 2;
        iArr12[CalendarEvent.NotificationType.DEFAULT_NOTIFICATION_TYPE.ordinal()] = 3;
        int[] iArr13 = new int[EventDetailSource.values().length];
        f83348m = iArr13;
        iArr13[EventDetailSource.FROM_MEETING_CHAT_CARD.ordinal()] = 1;
        iArr13[EventDetailSource.FROM_CALENDAR_NOTIFICATION.ordinal()] = 2;
        iArr13[EventDetailSource.FROM_REMINDER.ordinal()] = 3;
        iArr13[EventDetailSource.FROM_SHARE_EVENT.ordinal()] = 4;
        iArr13[EventDetailSource.FROM_CALENDAR_GENERAL_BOT.ordinal()] = 5;
        iArr13[EventDetailSource.FROM_BOT.ordinal()] = 6;
        iArr13[EventDetailSource.FROM_VCHAT_CARD.ordinal()] = 7;
        iArr13[EventDetailSource.FROM_EMAIL.ordinal()] = 8;
        iArr13[EventDetailSource.FROM_RSVP_COMMENT_BOT.ordinal()] = 9;
    }
}
