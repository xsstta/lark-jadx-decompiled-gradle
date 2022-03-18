package com.ss.android.lark.ug.scheduler.common.storage;

import com.ss.android.lark.ug.scheduler.common.api.Storage;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/storage/MemoryStorage;", "Lcom/ss/android/lark/ug/scheduler/common/api/Storage;", "()V", "storageMap", "", "", "clear", "", "get", "key", "remove", "set", "value", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.common.d.a */
public final class MemoryStorage implements Storage {

    /* renamed from: a */
    private final Map<Object, Object> f141782a = new ConcurrentHashMap();

    @Override // com.ss.android.lark.ug.scheduler.common.api.Storage
    /* renamed from: a */
    public void mo195271a() {
        this.f141782a.clear();
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.Storage
    /* renamed from: a */
    public Object mo195270a(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        return this.f141782a.get(obj);
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.Storage
    /* renamed from: b */
    public void mo195273b(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        this.f141782a.remove(obj);
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.Storage
    /* renamed from: a */
    public void mo195272a(Object obj, Object obj2) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        Intrinsics.checkParameterIsNotNull(obj2, "value");
        this.f141782a.put(obj, obj2);
    }
}
