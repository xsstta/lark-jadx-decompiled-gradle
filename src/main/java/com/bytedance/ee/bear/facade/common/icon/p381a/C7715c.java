package com.bytedance.ee.bear.facade.common.icon.p381a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a[\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000326\u0010\u0004\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u00060\u0005\"\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006¢\u0006\u0002\u0010\b\u001a>\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000b0\u00070\u0006\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\n0\u00052\u0006\u0010\f\u001a\u0002H\u000bH\u0004¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"mapOf", "", "K", "V", "pairs", "", "", "Lkotlin/Pair;", "([Ljava/util/List;)Ljava/util/Map;", "flatTo", "A", "B", "that", "([Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;", "list-export-min_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.facade.common.icon.a.c */
public final class C7715c {
    /* renamed from: a */
    public static final <K, V> Map<K, V> m30856a(List<? extends Pair<? extends K, ? extends V>>... listArr) {
        Intrinsics.checkParameterIsNotNull(listArr, "pairs");
        ArrayList arrayList = new ArrayList();
        for (List<? extends Pair<? extends K, ? extends V>> list : listArr) {
            CollectionsKt.addAll(arrayList, list);
        }
        return MapsKt.toMap(arrayList);
    }

    /* renamed from: a */
    public static final <A, B> List<Pair<A, B>> m30855a(A[] aArr, B b) {
        Intrinsics.checkParameterIsNotNull(aArr, "$this$flatTo");
        ArrayList arrayList = new ArrayList(aArr.length);
        for (A a : aArr) {
            arrayList.add(new Pair(a, b));
        }
        return arrayList;
    }
}
