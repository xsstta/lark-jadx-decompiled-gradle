package com.ss.android.lark.setting.page.content.general.feedfilter.dto;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010(\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedTabInfoList;", "", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedTabInfo;", "myFiltersItems", "", "moreFiltersItems", "(Ljava/util/List;Ljava/util/List;)V", "getMoreFiltersItems", "()Ljava/util/List;", "getMyFiltersItems", "iterator", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.dto.d */
public final class FeedTabInfoList implements Iterable<FeedTabInfo>, KMappedMarker {

    /* renamed from: a */
    private final List<FeedTabInfo> f134790a;

    /* renamed from: b */
    private final List<FeedTabInfo> f134791b;

    /* renamed from: a */
    public final List<FeedTabInfo> mo186326a() {
        return this.f134790a;
    }

    /* renamed from: b */
    public final List<FeedTabInfo> mo186327b() {
        return this.f134791b;
    }

    @Override // java.lang.Iterable
    public Iterator<FeedTabInfo> iterator() {
        return CollectionsKt.plus((Collection) this.f134790a, (Iterable) this.f134791b).iterator();
    }

    public FeedTabInfoList(List<FeedTabInfo> list, List<FeedTabInfo> list2) {
        Intrinsics.checkParameterIsNotNull(list, "myFiltersItems");
        Intrinsics.checkParameterIsNotNull(list2, "moreFiltersItems");
        this.f134790a = list;
        this.f134791b = list2;
    }
}
