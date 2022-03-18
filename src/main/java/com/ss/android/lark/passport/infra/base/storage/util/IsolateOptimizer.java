package com.ss.android.lark.passport.infra.base.storage.util;

import android.util.SparseArray;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorageDelegate;
import com.ss.android.lark.passport.infra.base.storage.store.MergeDataStorage;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.utils.LarkContext;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/util/IsolateOptimizer;", "", "()V", "mergeCache", "Landroid/util/SparseArray;", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "optimizedForMultiProcess", "getOptimizedForMultiProcess", "(Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;)Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "optimizeForMultiProcess", "memory", "disk", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.d.c */
public final class IsolateOptimizer {

    /* renamed from: a */
    public static final IsolateOptimizer f123194a = new IsolateOptimizer();

    /* renamed from: b */
    private static final SparseArray<DataStorageDelegate> f123195b = new SparseArray<>();

    private IsolateOptimizer() {
    }

    /* renamed from: a */
    public final DataStorageDelegate mo171278a(DataStorageDelegate bVar, DataStorageDelegate bVar2) {
        Intrinsics.checkParameterIsNotNull(bVar, "memory");
        Intrinsics.checkParameterIsNotNull(bVar2, "disk");
        if (!C49224w.m194054b(LarkContext.getApplication())) {
            return bVar2;
        }
        int hash = Objects.hash(bVar, bVar2);
        SparseArray<DataStorageDelegate> sparseArray = f123195b;
        DataStorageDelegate bVar3 = sparseArray.get(hash);
        if (bVar3 == null) {
            synchronized (this) {
                bVar3 = sparseArray.get(hash);
                if (bVar3 == null) {
                    bVar3 = DataStorageDelegate.f123163d.mo171267a(new MergeDataStorage(bVar, bVar2));
                    sparseArray.put(hash, bVar3);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        Intrinsics.checkExpressionValueIsNotNull(bVar3, "cached");
        return bVar3;
    }
}
