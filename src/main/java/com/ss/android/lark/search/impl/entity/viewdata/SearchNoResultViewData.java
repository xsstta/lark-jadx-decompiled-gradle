package com.ss.android.lark.search.impl.entity.viewdata;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/search/impl/entity/viewdata/SearchNoResultViewData;", "Lcom/ss/android/lark/search/impl/entity/viewdata/SearchBaseViewData;", "()V", "sectionResultType", "", "getSectionResultType", "()I", "setSectionResultType", "(I)V", "getSearchResultType", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchNoResultViewData extends SearchBaseViewData {
    public static final Companion Companion = new Companion(null);
    private int sectionResultType;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 10000005;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/impl/entity/viewdata/SearchNoResultViewData$Companion;", "", "()V", "SHOW_MORE_ID", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.entity.viewdata.SearchNoResultViewData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getSectionResultType() {
        return this.sectionResultType;
    }

    public SearchNoResultViewData() {
        this.id = "-3000";
    }

    public final void setSectionResultType(int i) {
        this.sectionResultType = i;
    }
}
