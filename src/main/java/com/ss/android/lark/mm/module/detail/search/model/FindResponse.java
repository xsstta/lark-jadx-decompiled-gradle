package com.ss.android.lark.mm.module.detail.search.model;

import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JD\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "Ljava/io/Serializable;", SearchIntents.EXTRA_QUERY, "", ShareHitPoint.f121869d, "", "results", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResults;", "timeline", "", "Lcom/ss/android/lark/mm/module/detail/search/model/FindTimeline;", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/ss/android/lark/mm/module/detail/search/model/FindResults;Ljava/util/List;)V", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "getResults", "()Lcom/ss/android/lark/mm/module/detail/search/model/FindResults;", "setResults", "(Lcom/ss/android/lark/mm/module/detail/search/model/FindResults;)V", "getTimeline", "()Ljava/util/List;", "setTimeline", "(Ljava/util/List;)V", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/ss/android/lark/mm/module/detail/search/model/FindResults;Ljava/util/List;)Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "equals", "", "other", "", "hashCode", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FindResponse implements Serializable {
    private String query;
    private FindResults results;
    private List<FindTimeline> timeline;
    private Integer type;

    public FindResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.detail.search.model.FindResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FindResponse copy$default(FindResponse findResponse, String str, Integer num, FindResults findResults, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = findResponse.query;
        }
        if ((i & 2) != 0) {
            num = findResponse.type;
        }
        if ((i & 4) != 0) {
            findResults = findResponse.results;
        }
        if ((i & 8) != 0) {
            list = findResponse.timeline;
        }
        return findResponse.copy(str, num, findResults, list);
    }

    public final String component1() {
        return this.query;
    }

    public final Integer component2() {
        return this.type;
    }

    public final FindResults component3() {
        return this.results;
    }

    public final List<FindTimeline> component4() {
        return this.timeline;
    }

    public final FindResponse copy(String str, Integer num, FindResults findResults, List<FindTimeline> list) {
        return new FindResponse(str, num, findResults, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindResponse)) {
            return false;
        }
        FindResponse findResponse = (FindResponse) obj;
        return Intrinsics.areEqual(this.query, findResponse.query) && Intrinsics.areEqual(this.type, findResponse.type) && Intrinsics.areEqual(this.results, findResponse.results) && Intrinsics.areEqual(this.timeline, findResponse.timeline);
    }

    public int hashCode() {
        String str = this.query;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        FindResults findResults = this.results;
        int hashCode3 = (hashCode2 + (findResults != null ? findResults.hashCode() : 0)) * 31;
        List<FindTimeline> list = this.timeline;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "FindResponse(query=" + this.query + ", type=" + this.type + ", results=" + this.results + ", timeline=" + this.timeline + ")";
    }

    public final String getQuery() {
        return this.query;
    }

    public final FindResults getResults() {
        return this.results;
    }

    public final List<FindTimeline> getTimeline() {
        return this.timeline;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setQuery(String str) {
        this.query = str;
    }

    public final void setResults(FindResults findResults) {
        this.results = findResults;
    }

    public final void setTimeline(List<FindTimeline> list) {
        this.timeline = list;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public FindResponse(String str, Integer num, FindResults findResults, List<FindTimeline> list) {
        this.query = str;
        this.type = num;
        this.results = findResults;
        this.timeline = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FindResponse(String str, Integer num, FindResults findResults, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : findResults, (i & 8) != 0 ? null : list);
    }
}
