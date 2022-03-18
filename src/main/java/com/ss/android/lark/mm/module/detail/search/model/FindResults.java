package com.ss.android.lark.mm.module.detail.search.model;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/model/FindResults;", "Ljava/io/Serializable;", "subtitles", "", "Lcom/ss/android/lark/mm/module/detail/search/model/FindSubtitle;", "(Ljava/util/List;)V", "getSubtitles", "()Ljava/util/List;", "setSubtitles", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FindResults implements Serializable {
    private List<FindSubtitle> subtitles;

    public FindResults() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.detail.search.model.FindResults */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FindResults copy$default(FindResults findResults, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = findResults.subtitles;
        }
        return findResults.copy(list);
    }

    public final List<FindSubtitle> component1() {
        return this.subtitles;
    }

    public final FindResults copy(List<FindSubtitle> list) {
        return new FindResults(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FindResults) && Intrinsics.areEqual(this.subtitles, ((FindResults) obj).subtitles);
        }
        return true;
    }

    public int hashCode() {
        List<FindSubtitle> list = this.subtitles;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "FindResults(subtitles=" + this.subtitles + ")";
    }

    public final List<FindSubtitle> getSubtitles() {
        return this.subtitles;
    }

    public final void setSubtitles(List<FindSubtitle> list) {
        this.subtitles = list;
    }

    public FindResults(List<FindSubtitle> list) {
        this.subtitles = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FindResults(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
