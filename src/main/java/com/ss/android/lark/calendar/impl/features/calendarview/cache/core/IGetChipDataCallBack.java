package com.ss.android.lark.calendar.impl.features.calendarview.cache.core;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IGetChipDataCallBack;", "", "onError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.e */
public interface IGetChipDataCallBack {
    /* renamed from: a */
    void mo110833a(String str);

    /* renamed from: a */
    void mo110834a(ArrayList<EventChipViewData> arrayList);
}
