package com.ss.android.lark.searchcommon.dto.info;

import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/info/SearchHistoryListInfo;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "historyList", "", "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "maxRows", "", "(Ljava/util/List;I)V", "getHistoryList", "()Ljava/util/List;", "getMaxRows", "()I", "equals", "", "other", "", "hashCode", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchHistoryListInfo extends SearchBaseInfo {
    private final List<SearchInfoHistory> historyList;
    private final int maxRows;

    public final List<SearchInfoHistory> getHistoryList() {
        return this.historyList;
    }

    public final int getMaxRows() {
        return this.maxRows;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public int hashCode() {
        return Objects.hash(getId(), Integer.valueOf(this.type), this.historyList, Integer.valueOf(this.maxRows));
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj instanceof SearchHistoryListInfo) {
            SearchHistoryListInfo searchHistoryListInfo = (SearchHistoryListInfo) obj;
            if (!Intrinsics.areEqual(searchHistoryListInfo.historyList, this.historyList) || searchHistoryListInfo.maxRows != this.maxRows) {
                if (searchHistoryListInfo.historyList.size() != this.historyList.size() || searchHistoryListInfo.maxRows != this.maxRows) {
                    return false;
                }
                Iterator<T> it = searchHistoryListInfo.historyList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!Intrinsics.areEqual(it.next(), this.historyList.get(i))) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory> */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchHistoryListInfo(List<? extends SearchInfoHistory> list, int i) {
        Intrinsics.checkParameterIsNotNull(list, "historyList");
        this.historyList = list;
        this.maxRows = i;
        this.type = 100000018;
    }
}
