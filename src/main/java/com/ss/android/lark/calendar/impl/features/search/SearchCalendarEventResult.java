package com.ss.android.lark.calendar.impl.features.search;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR-\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "", "instances", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventInstance;", "Lkotlin/collections/ArrayList;", "contents", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventContent;", "Lkotlin/collections/HashMap;", "searchResultCount", "", "(Ljava/util/ArrayList;Ljava/util/HashMap;J)V", "getContents", "()Ljava/util/HashMap;", "getInstances", "()Ljava/util/ArrayList;", "getSearchResultCount", "()J", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.f */
public final class SearchCalendarEventResult {

    /* renamed from: a */
    private final ArrayList<SearchCalendarEventInstance> f82848a;

    /* renamed from: b */
    private final HashMap<String, SearchCalendarEventContent> f82849b;

    /* renamed from: c */
    private final long f82850c;

    /* renamed from: a */
    public final ArrayList<SearchCalendarEventInstance> mo118186a() {
        return this.f82848a;
    }

    /* renamed from: b */
    public final HashMap<String, SearchCalendarEventContent> mo118187b() {
        return this.f82849b;
    }

    /* renamed from: c */
    public final long mo118188c() {
        return this.f82850c;
    }

    public SearchCalendarEventResult(ArrayList<SearchCalendarEventInstance> arrayList, HashMap<String, SearchCalendarEventContent> hashMap, long j) {
        Intrinsics.checkParameterIsNotNull(arrayList, "instances");
        Intrinsics.checkParameterIsNotNull(hashMap, "contents");
        this.f82848a = arrayList;
        this.f82849b = hashMap;
        this.f82850c = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchCalendarEventResult(ArrayList arrayList, HashMap hashMap, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new HashMap() : hashMap, j);
    }
}
