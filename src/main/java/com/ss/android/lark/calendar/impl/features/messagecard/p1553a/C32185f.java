package com.ss.android.lark.calendar.impl.features.messagecard.p1553a;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalShareEventContent;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.f */
public class C32185f {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.f$1 */
    public static /* synthetic */ class C321861 {

        /* renamed from: a */
        static final /* synthetic */ int[] f82299a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent$CalendarMessageType[] r0 = com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent.CalendarMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.messagecard.p1553a.C32185f.C321861.f82299a = r0
                com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent$CalendarMessageType r1 = com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent.CalendarMessageType.EVENT_INVITE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.messagecard.p1553a.C32185f.C321861.f82299a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent$CalendarMessageType r1 = com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent.CalendarMessageType.EVENT_DELETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.calendar.impl.features.messagecard.p1553a.C32185f.C321861.f82299a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent$CalendarMessageType r1 = com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent.CalendarMessageType.EVENT_RESCHEDULE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.calendar.impl.features.messagecard.p1553a.C32185f.C321861.f82299a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent$CalendarMessageType r1 = com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent.CalendarMessageType.EVENT_UPDATE_LOCATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.calendar.impl.features.messagecard.p1553a.C32185f.C321861.f82299a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent$CalendarMessageType r1 = com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent.CalendarMessageType.EVENT_UPDATE_DESCRIPTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.messagecard.p1553a.C32185f.C321861.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m122678a(CalendarInternalShareEventContent calendarInternalShareEventContent) {
        String str;
        if (calendarInternalShareEventContent == null || calendarInternalShareEventContent.getCalendarEvent() == null || calendarInternalShareEventContent.getCalendarEvent().getSummary() == null) {
            str = "";
        } else {
            str = calendarInternalShareEventContent.getCalendarEvent().getSummary();
        }
        return UIHelper.getString(R.string.Lark_Legacy_MessagePoShareEvent) + str;
    }

    /* renamed from: a */
    public static String m122676a(Context context, CalendarInternalContent calendarInternalContent) {
        if (calendarInternalContent.isOldVersion()) {
            return m122677a(context, calendarInternalContent.getTitle());
        }
        return m122675a(context, calendarInternalContent.getMeesageType(), calendarInternalContent.getBotMessageSender());
    }

    /* renamed from: a */
    private static String m122677a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("邀请你加入日程", context.getString(R.string.Calendar_Bot_InvitationNotify)).replace("取消了日程", context.getString(R.string.Calendar_Bot_InvitationCanceled)).replace("更新了日程地点", context.getString(R.string.Calendar_Bot_InvitationUpdateLoc)).replace("更新了日程描述", context.getString(R.string.Calendar_Bot_InvitationUpdateDes)).replace("更新了日程时间", context.getString(R.string.Calendar_Bot_InvitationUpdateTime));
    }

    /* renamed from: a */
    private static String m122675a(Context context, CalendarInternalContent.CalendarMessageType calendarMessageType, AbstractC30026d dVar) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(C30022a.f74882a.chatModuleDependency().mo108219a(dVar));
        int i = C321861.f82299a[calendarMessageType.ordinal()];
        if (i == 1) {
            sb.append(context.getString(R.string.Calendar_Bot_InvitationNotify));
        } else if (i == 2) {
            sb.append(context.getString(R.string.Calendar_Bot_InvitationCanceled));
        } else if (i == 3) {
            sb.append(context.getString(R.string.Calendar_Bot_InvitationUpdateTime));
        } else if (i == 4) {
            sb.append(context.getString(R.string.Calendar_Bot_InvitationUpdateLoc));
        } else if (i == 5) {
            sb.append(context.getString(R.string.Calendar_Bot_InvitationUpdateDes));
        }
        return sb.toString();
    }
}
