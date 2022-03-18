package com.ss.android.lark.search.widget.calendar;

import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/search/widget/calendar/EmailInfo;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "address", "", "(Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EmailInfo extends SearchBaseInfo {
    private final String address;

    public final String getAddress() {
        return this.address;
    }

    public EmailInfo(String str) {
        Intrinsics.checkParameterIsNotNull(str, "address");
        this.address = str;
        super.setId(str);
        super.setTitle(str);
    }
}
