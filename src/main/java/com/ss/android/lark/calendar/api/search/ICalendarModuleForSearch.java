package com.ss.android.lark.calendar.api.search;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.api.entity.CalendarSearchEventsResponse;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007H&JI\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0005H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/api/search/ICalendarModuleForSearch;", "", "searchCalendarEvent", "", "searchKey", "", "callBack", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/api/entity/CalendarSearchEventsResponse;", "startCalendarEventDetailActivity", "calendarId", "key", "originalTime", "", "context", "Landroid/content/Context;", "startTime", "endTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;)V", "startCalendarSearchActivity", "tabPageName", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.api.c.a */
public interface ICalendarModuleForSearch {
    /* renamed from: a */
    void mo108346a(Context context, String str, String str2);

    /* renamed from: a */
    void mo108347a(String str, IGetDataCallback<List<CalendarSearchEventsResponse>> iGetDataCallback);

    /* renamed from: a */
    void mo108348a(String str, String str2, Long l, Context context, Long l2, Long l3);
}
