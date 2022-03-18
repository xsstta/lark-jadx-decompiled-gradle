package com.ss.android.lark.calendar.impl.features.calendarview.cache.core;

import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData;", "", "onError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onPrepared", "dataType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "DataType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IPrepareChipData {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "", "(Ljava/lang/String;I)V", "DISK", "SDK", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DataType {
        DISK,
        SDK
    }

    /* renamed from: a */
    void mo110810a(DataType dataType);

    /* renamed from: a */
    void mo110811a(String str);
}
