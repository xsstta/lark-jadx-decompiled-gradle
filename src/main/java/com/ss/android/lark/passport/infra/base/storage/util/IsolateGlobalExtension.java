package com.ss.android.lark.passport.infra.base.storage.util;

import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorageDelegate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/util/IsolateGlobalExtension;", "", "()V", "globalDisk", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "getGlobalDisk", "()Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "globalMemory", "getGlobalMemory", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.d.b */
public final class IsolateGlobalExtension {

    /* renamed from: a */
    public static final IsolateGlobalExtension f123193a = new IsolateGlobalExtension();

    private IsolateGlobalExtension() {
    }

    /* renamed from: a */
    public final DataStorageDelegate mo171276a() {
        return IsolateStorage.m193171a(CollectionsKt.listOf("Global"), null, 2, null);
    }

    /* renamed from: b */
    public final DataStorageDelegate mo171277b() {
        return mo171276a().mo171266d();
    }
}
