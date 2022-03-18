package com.ss.android.lark.search.impl.p2606e;

import com.ss.android.lark.search.impl.entity.viewdata.SearchCalendarEventViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchCalendarEventInfo;

/* renamed from: com.ss.android.lark.search.impl.e.b */
public class C53372b extends AbstractC53371a<SearchCalendarEventViewData, SearchCalendarEventInfo> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SearchCalendarEventViewData mo182051a(SearchCalendarEventInfo searchCalendarEventInfo) {
        return new SearchCalendarEventViewData();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182053a(SearchCalendarEventViewData searchCalendarEventViewData, SearchCalendarEventInfo searchCalendarEventInfo) {
        searchCalendarEventViewData.setCalendarId(searchCalendarEventInfo.getCalendarId());
        searchCalendarEventViewData.setOriginalTime(searchCalendarEventInfo.getOriginalTime());
        searchCalendarEventViewData.setEventKey(searchCalendarEventInfo.getEventKey());
        searchCalendarEventViewData.setIsGoogleEvent(Boolean.valueOf(searchCalendarEventInfo.getIsGoogleEvent()));
        searchCalendarEventViewData.setStartTime(searchCalendarEventInfo.getStartTime());
        searchCalendarEventViewData.setEndTime(searchCalendarEventInfo.getEndTime());
        searchCalendarEventViewData.setEventExactData(searchCalendarEventInfo.getEventExactData());
        searchCalendarEventViewData.setId(searchCalendarEventInfo.getCalendarId());
    }
}
