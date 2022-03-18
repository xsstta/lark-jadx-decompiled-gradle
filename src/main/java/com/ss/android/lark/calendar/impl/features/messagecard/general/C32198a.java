package com.ss.android.lark.calendar.impl.features.messagecard.general;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.dependency.idependency.entity.IMessageCardData;
import com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.calendar.impl.features.messagecard.InternalContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalGeneralContent;
import com.ss.android.lark.calendar.impl.features.messagecard.general.helper.CalendarGeneralCardFontHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.general.listener.CalendarGeneralViewHolder;
import com.ss.android.lark.calendar.impl.features.messagecard.general.reply.ReplyEventCardBinder;
import com.ss.android.lark.calendar.impl.features.messagecard.general.transfer.TransferEventCardBinder;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.a */
public class C32198a implements IMessageCellFactory {

    /* renamed from: a */
    private static final ConcurrentHashMap<View, Boolean> f82340a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final Activity f82341b;

    public C32198a(Activity activity) {
        this.f82341b = activity;
    }

    @Override // com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory
    /* renamed from: a */
    public View mo117503a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.calendar_bot_item, viewGroup, false);
        f82340a.put(inflate, true);
        return inflate;
    }

    @Override // com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory
    /* renamed from: a */
    public void mo117504a(View view, int i, InternalContent internalContent, IMessageCardData fVar) {
        if (!(internalContent instanceof CalendarInternalGeneralContent)) {
            Log.m165389i("CalendarGeneraMessageCellBinder", C32673y.m125377c("messageContent is invalid"));
            return;
        }
        CalendarGeneralViewHolder calendarGeneralViewHolder = (CalendarGeneralViewHolder) view.getTag();
        if (calendarGeneralViewHolder == null) {
            calendarGeneralViewHolder = new CalendarGeneralViewHolder(view);
            CalendarGeneralCardFontHelper.m122734a(calendarGeneralViewHolder);
            view.setTag(calendarGeneralViewHolder);
        }
        Log.m165389i("CalendarGeneraMessageCellBinder", C32673y.m125374b("pushGeneralCalendarBot"));
        CalendarInternalGeneralContent calendarInternalGeneralContent = (CalendarInternalGeneralContent) internalContent;
        if (calendarInternalGeneralContent.getCalendarCardContent() == null) {
            Log.m165389i("CalendarGeneraMessageCellBinder", C32673y.m125377c("calendarCardContent = null"));
            return;
        }
        CalendarInternalGeneralContent.CalendarMessageType messageType = calendarInternalGeneralContent.getMessageType();
        if (messageType == CalendarInternalGeneralContent.CalendarMessageType.TRANSFER_CALENDAR_EVENT) {
            TransferEventCardBinder.m122766a(this.f82341b, calendarGeneralViewHolder, calendarInternalGeneralContent, false);
        } else if (messageType == CalendarInternalGeneralContent.CalendarMessageType.SWITCH_CALENDAR) {
            TransferEventCardBinder.m122766a(this.f82341b, calendarGeneralViewHolder, calendarInternalGeneralContent, true);
        } else if (messageType == CalendarInternalGeneralContent.CalendarMessageType.RSVP_COMMENT) {
            ReplyEventCardBinder.m122742a(this.f82341b, calendarGeneralViewHolder, calendarInternalGeneralContent);
        }
        ConcurrentHashMap<View, Boolean> concurrentHashMap = f82340a;
        if (concurrentHashMap.containsKey(view) && concurrentHashMap.get(view).booleanValue()) {
            CalendarEventHitPoint.m124345a("none", "none", (Map<String, ? extends Object>) ChatParamUtils.m133148b(), (Boolean) true, (Boolean) false);
            concurrentHashMap.put(view, false);
        }
    }
}
