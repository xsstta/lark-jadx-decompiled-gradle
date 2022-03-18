package com.ss.android.lark.passport.infra.util.collection;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\u001aU\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032:\b\u0004\u0010\u0004\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u0001H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0005H\b\u001a\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\r"}, d2 = {"foreach", "", "T", "Landroid/util/SparseArray;", "block", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "k", "v", "values", "", "passport-infra_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.collection.d */
public final class C49184d {
    /* renamed from: a */
    public static final <T> Collection<T> m193924a(SparseArray<T> sparseArray) {
        Intrinsics.checkParameterIsNotNull(sparseArray, "$this$values");
        ArrayList arrayList = new ArrayList();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            T valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                arrayList.add(valueAt);
            }
        }
        return arrayList;
    }
}
