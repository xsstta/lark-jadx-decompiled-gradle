package com.ss.android.lark.searchcommon.dto.info;

import com.bytedance.lark.pb.search.feedback.v1.SearchResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/info/SearchFeedbackInfo;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "()V", "end", "", "getEnd", "()I", "setEnd", "(I)V", "results", "", "Lcom/bytedance/lark/pb/search/feedback/v1/SearchResult;", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "show", "", "getShow", "()Z", "setShow", "(Z)V", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchFeedbackInfo extends SearchBaseInfo {
    private int end = 15;
    private List<SearchResult> results = new ArrayList();
    private boolean show = true;

    public final int getEnd() {
        return this.end;
    }

    public final List<SearchResult> getResults() {
        return this.results;
    }

    public final boolean getShow() {
        return this.show;
    }

    public SearchFeedbackInfo() {
        this.type = 100000013;
    }

    public final void setEnd(int i) {
        this.end = i;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setResults(List<SearchResult> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.results = list;
    }
}
