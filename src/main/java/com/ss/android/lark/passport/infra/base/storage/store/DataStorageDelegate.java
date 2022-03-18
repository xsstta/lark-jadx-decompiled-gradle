package com.ss.android.lark.passport.infra.base.storage.store;

import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.config.Config;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J#\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0016¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014J)\u0010\f\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\r\u001a\u0002H\u0005H\u0016¢\u0006\u0002\u0010\u000eJ/\u0010\u000f\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0010H\u0016¢\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0013\u001a\u00020\u0000J\u0006\u0010\u0014\u001a\u00020\u0000J+\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\b\u0010\u0016\u001a\u0004\u0018\u0001H\u0005H\u0016¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0014J\u0014\u0010\u001b\u001a\u00020\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "origin", "(Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;)V", "get", "T", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;)Ljava/lang/Object;", "getInternal", "", "cipherKey", "getOrDefault", "fallback", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrPut", "memory", "mmkv", "put", "value", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "putInternal", "", "serializedCipherValue", "remove", "removeAll", "removeInternal", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.c.b */
public final class DataStorageDelegate extends DataStorage {

    /* renamed from: c */
    public static final ConcurrentHashMap<DataStorage, DataStorageDelegate> f123162c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final Companion f123163d = new Companion(null);

    /* renamed from: b */
    public final DataStorage f123164b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\n\u001a\u00020\u0006*\u00020\u0005J\n\u0010\u000b\u001a\u00020\u0006*\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate$Companion;", "", "()V", "delegateCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "delegate", "getDelegate", "(Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;)Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "memory", "mmkv", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DataStorageDelegate mo171267a(DataStorage aVar) {
            DataStorageDelegate putIfAbsent;
            Intrinsics.checkParameterIsNotNull(aVar, "$this$delegate");
            while (aVar instanceof DataStorageDelegate) {
                aVar = ((DataStorageDelegate) aVar).f123164b;
            }
            ConcurrentHashMap<DataStorage, DataStorageDelegate> concurrentHashMap = DataStorageDelegate.f123162c;
            DataStorageDelegate bVar = concurrentHashMap.get(aVar);
            if (bVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(aVar, (bVar = new DataStorageDelegate(aVar)))) != null) {
                bVar = putIfAbsent;
            }
            Intrinsics.checkExpressionValueIsNotNull(bVar, "delegateCache.getOrPut(o…StorageDelegate(origin) }");
            return bVar;
        }

        /* renamed from: b */
        public final DataStorageDelegate mo171268b(DataStorage aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$this$memory");
            return IsolateStorage.m193170a(CollectionsKt.minus(aVar.mo171257c(), aVar.mo171251b().mo171229g()), Config.C49042b.m193186a(aVar.mo171251b(), null, MemoryDataStorage.f123183c.mo171273a(), null, null, null, false, 61, null));
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public void mo171248a() {
        this.f123164b.mo171248a();
    }

    /* renamed from: d */
    public final DataStorageDelegate mo171266d() {
        Companion aVar = f123163d;
        return aVar.mo171267a(aVar.mo171268b(this.f123164b));
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: c */
    public <T> T mo171255c(Key<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        return (T) this.f123164b.mo171255c(aVar);
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: e */
    public DataStorage mo171262e(Key<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        return this.f123164b.mo171262e(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStorageDelegate(DataStorage aVar) {
        super(aVar.mo171251b(), aVar.mo171257c());
        Intrinsics.checkParameterIsNotNull(aVar, "origin");
        this.f123164b = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: c */
    public String mo171256c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        throw new UnsupportedOperationException("it should not happened");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: d */
    public void mo171261d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        throw new UnsupportedOperationException("it should not happened");
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: b */
    public <T> DataStorage mo171253b(Key<T> aVar, T t) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        return this.f123164b.mo171253b(aVar, t);
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public <T> T mo171244a(Key<T> aVar, Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        Intrinsics.checkParameterIsNotNull(function0, "fallback");
        return (T) this.f123164b.mo171244a((Key) aVar, (Function0) function0);
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: d */
    public <T> T mo171260d(Key<T> aVar, T t) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        return (T) this.f123164b.mo171260d(aVar, t);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public void mo171249a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        Intrinsics.checkParameterIsNotNull(str2, "serializedCipherValue");
        throw new UnsupportedOperationException("it should not happened");
    }
}
