package com.ss.android.lark.passport.infra.base.storage.util;

import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.config.Config;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorageDelegate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/util/IsolateUserExtension;", "", "()V", "userDisk", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "userId", "", "config", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "userMemory", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.d.e */
public final class IsolateUserExtension {

    /* renamed from: a */
    public static final IsolateUserExtension f123198a = new IsolateUserExtension();

    private IsolateUserExtension() {
    }

    /* renamed from: a */
    public final DataStorageDelegate mo171279a(String str, Config aVar) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        return IsolateStorage.m193170a(CollectionsKt.listOf((Object[]) new String[]{"User", str}), aVar);
    }

    /* renamed from: b */
    public final DataStorageDelegate mo171280b(String str, Config aVar) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        return mo171279a(str, aVar).mo171266d();
    }
}
