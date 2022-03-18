package com.ss.android.lark.calendar.impl.features.messagecard.helper;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarCardContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.utils.C32632ac;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/CalendarMessageCardHelper;", "", "()V", "getBotMessageTitle", "", "context", "Landroid/content/Context;", "calendarInternalContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent;", "getGeneralBotMessageRepeat", "content", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.d */
public final class CalendarMessageCardHelper {

    /* renamed from: a */
    public static final CalendarMessageCardHelper f82297a = new CalendarMessageCardHelper();

    private CalendarMessageCardHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m122674a(CalendarCardContent calendarCardContent) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarCardContent, "content");
        String rRule = calendarCardContent.getRRule();
        if (rRule == null || rRule.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return C32632ac.m125171b(calendarCardContent.getRRule());
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m122673a(Context context, CalendarInternalContent calendarInternalContent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(calendarInternalContent, "calendarInternalContent");
        if (calendarInternalContent.getEventCardStatus() == CalendarInternalContent.CalendarEventCardStatus.INVALID) {
            String string = context.getString(R.string.Calendar_Bot_EventInfoUpdated);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…dar_Bot_EventInfoUpdated)");
            return string;
        } else if (calendarInternalContent.getEventCardDiffInfo() == null) {
            String a = C32185f.m122676a(context, calendarInternalContent);
            Intrinsics.checkExpressionValueIsNotNull(a, "CalendarMessageDisplay.g… calendarInternalContent)");
            return a;
        } else {
            String a2 = C30022a.f74882a.chatModuleDependency().mo108219a(calendarInternalContent.getBotMessageSender());
            StringBuilder sb = new StringBuilder(40);
            sb.append(a2);
            CalendarInternalContent.CalendarMessageType meesageType = calendarInternalContent.getMeesageType();
            if (meesageType != null) {
                int i = C32184e.f82298a[meesageType.ordinal()];
                if (i == 1) {
                    sb.append(context.getString(R.string.Calendar_Bot_InvitationNotify));
                } else if (i == 2) {
                    sb.append(context.getString(R.string.Calendar_Bot_InvitationCanceled));
                } else if (i == 3 || i == 4 || i == 5) {
                    String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Calendar_Bot_GuestUpdatedEvent, "guest", a2);
                    Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…ent, \"guest\", senderName)");
                    return mustacheFormat;
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "titleBuilder.toString()");
            return sb2;
        }
    }
}
