package com.ss.android.lark.calendar.impl.features.messagecard.share.listener;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalShareEventContent;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/share/listener/OpenDetailClickListener;", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "shareEventContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalShareEventContent;", "messageId", "", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalShareEventContent;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "setMessageId", "(Ljava/lang/String;)V", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.share.listener.b */
public final class OpenDetailClickListener extends AbstractView$OnClickListenerC32626b {

    /* renamed from: a */
    private CalendarInternalShareEventContent f82393a;

    /* renamed from: b */
    private String f82394b;

    @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
    /* renamed from: a */
    public void mo108751a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        Log.m165389i("ShareCalendarEventCellBinder", C32673y.m125369a("shareCard"));
        CalendarEvent calendarEvent = this.f82393a.getCalendarEvent();
        if (calendarEvent != null) {
            Context context = view.getContext();
            Object obj = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                C31238b.m116866a(activity, calendarEvent, this.f82394b);
                Map<String, Object> b = ChatParamUtils.m133148b();
                if (b != null) {
                    obj = b.get("chat_id");
                }
                String str = (String) obj;
                String serverId = calendarEvent.getServerId();
                Intrinsics.checkExpressionValueIsNotNull(serverId, "shareEvent.serverId");
                if (serverId == null) {
                    serverId = "";
                }
                String valueOf = String.valueOf(calendarEvent.getStartTime());
                if (str == null) {
                    str = "";
                }
                CalendarEventHitPoint.m124342a(serverId, valueOf, str, "check_more_detail");
            }
        }
    }

    public OpenDetailClickListener(CalendarInternalShareEventContent calendarInternalShareEventContent, String str) {
        Intrinsics.checkParameterIsNotNull(calendarInternalShareEventContent, "shareEventContent");
        this.f82393a = calendarInternalShareEventContent;
        this.f82394b = str;
    }
}
