package com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.helper.CalendarBotMessageHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/OpenDetailActivityClickListener;", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "calendarContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent;", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent;)V", "getCalendarContent", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent;", "setCalendarContent", "doClick", "", "v", "Landroid/view/View;", "showErrDialog", "activity", "Landroid/app/Activity;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.a */
public final class OpenDetailActivityClickListener extends AbstractView$OnClickListenerC32626b {

    /* renamed from: a */
    private CalendarInternalContent f82315a;

    public OpenDetailActivityClickListener(CalendarInternalContent calendarInternalContent) {
        Intrinsics.checkParameterIsNotNull(calendarInternalContent, "calendarContent");
        this.f82315a = calendarInternalContent;
    }

    /* renamed from: a */
    private final void m122715a(Activity activity) {
        if (activity != null && C57582a.m223607a(activity)) {
            new RequestLoadingDialog(activity).mo112589a(false, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, true);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
    /* renamed from: a */
    public void mo108751a(View view) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(view, "v");
        if (this.f82315a.isNeedShowAction()) {
            Activity activity = null;
            if (CalendarEventAttendee.Status.REMOVED == this.f82315a.getmStatus()) {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    activity = context;
                }
                m122715a((Activity) activity);
                return;
            }
            Map<String, Object> b = ChatParamUtils.m133148b();
            if (b != null) {
                obj = b.get("chat_id");
            } else {
                obj = null;
            }
            String str = (String) obj;
            String eventServiceId = this.f82315a.getEventServiceId();
            if (eventServiceId == null) {
                eventServiceId = "";
            }
            String valueOf = String.valueOf(this.f82315a.getStartTime());
            if (str == null) {
                str = "";
            }
            CalendarEventHitPoint.m124342a(eventServiceId, valueOf, str, "check_more_detail");
            CalendarBotMessageHelper bVar = CalendarBotMessageHelper.f82307a;
            Context context2 = view.getContext();
            if (context2 instanceof Activity) {
                activity = context2;
            }
            bVar.mo117530a(activity, this.f82315a);
            Log.m165389i("CalendarMessageCellBinder", C32673y.m125369a("botCard"));
            CalendarHitPoint.m124134f();
        }
    }
}
