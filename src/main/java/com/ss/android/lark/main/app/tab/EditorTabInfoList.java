package com.ss.android.lark.main.app.tab;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010(\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/main/app/tab/EditorTabInfoList;", "", "Lcom/ss/android/lark/main/app/tab/EditorTabInfo;", "mainTabItems", "", "navTabItems", "(Ljava/util/List;Ljava/util/List;)V", "getMainTabItems", "()Ljava/util/List;", "getNavTabItems", "iterator", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.c */
public final class EditorTabInfoList implements Iterable<EditorTabInfo>, KMappedMarker {

    /* renamed from: a */
    private final List<EditorTabInfo> f112515a;

    /* renamed from: b */
    private final List<EditorTabInfo> f112516b;

    /* renamed from: a */
    public final List<EditorTabInfo> mo157560a() {
        return this.f112515a;
    }

    /* renamed from: b */
    public final List<EditorTabInfo> mo157561b() {
        return this.f112516b;
    }

    @Override // java.lang.Iterable
    public Iterator<EditorTabInfo> iterator() {
        return CollectionsKt.plus((Collection) this.f112515a, (Iterable) this.f112516b).iterator();
    }

    public EditorTabInfoList(List<EditorTabInfo> list, List<EditorTabInfo> list2) {
        Intrinsics.checkParameterIsNotNull(list, "mainTabItems");
        Intrinsics.checkParameterIsNotNull(list2, "navTabItems");
        this.f112515a = list;
        this.f112516b = list2;
    }
}
