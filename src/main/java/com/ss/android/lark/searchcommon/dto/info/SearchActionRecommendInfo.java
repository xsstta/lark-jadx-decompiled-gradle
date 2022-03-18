package com.ss.android.lark.searchcommon.dto.info;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/info/SearchActionRecommendInfo;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "actionRecommends", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchActionRecommend;", "maxRows", "", "(Ljava/util/List;I)V", "getActionRecommends", "()Ljava/util/List;", "setActionRecommends", "(Ljava/util/List;)V", "getMaxRows", "()I", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchActionRecommendInfo extends SearchBaseInfo {
    private List<SearchActionRecommend> actionRecommends;
    private final int maxRows;

    public final List<SearchActionRecommend> getActionRecommends() {
        return this.actionRecommends;
    }

    public final int getMaxRows() {
        return this.maxRows;
    }

    public final void setActionRecommends(List<SearchActionRecommend> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.actionRecommends = list;
    }

    public SearchActionRecommendInfo(List<SearchActionRecommend> list, int i) {
        Intrinsics.checkParameterIsNotNull(list, "actionRecommends");
        this.actionRecommends = list;
        this.maxRows = i;
        this.type = 100000019;
    }
}
