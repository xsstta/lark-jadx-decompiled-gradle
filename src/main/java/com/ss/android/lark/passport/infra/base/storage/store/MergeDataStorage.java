package com.ss.android.lark.passport.infra.base.storage.store;

import com.ss.android.lark.passport.infra.base.storage.config.Logger;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0014J)\u0010\r\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\u000e\u001a\u0002H\u0006H\u0016¢\u0006\u0002\u0010\u000fJ/\u0010\u0010\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0011H\u0016¢\u0006\u0002\u0010\u0012J/\u0010\u0013\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0011H\u0016¢\u0006\u0002\u0010\u0012J3\u0010\u0014\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0015\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J+\u0010\u0016\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\b\u0010\u0017\u001a\u0004\u0018\u0001H\u0006H\u0016¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0014J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/MergeDataStorage;", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "major", "minor", "(Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;)V", "get", "T", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;)Ljava/lang/Object;", "getInternal", "", "cipherKey", "getOrDefault", "fallback", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrPut", "lockGetOrPut", "lockRemove", "put", "value", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "putInternal", "", "serializedCipherValue", "remove", "removeAll", "removeInternal", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.c.e */
public final class MergeDataStorage extends DataStorage {

    /* renamed from: b */
    private final DataStorage f123186b;

    /* renamed from: c */
    private final DataStorage f123187c;

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public void mo171248a() {
        synchronized (this) {
            this.f123186b.mo171248a();
            this.f123187c.mo171248a();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: c */
    public <T> T mo171255c(Key<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        return (T) m193317b((Key) aVar, (Function0) null);
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: e */
    public DataStorage mo171262e(Key<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        return m193318g(aVar);
    }

    /* renamed from: g */
    private final DataStorage m193318g(Key<?> aVar) {
        synchronized (this) {
            this.f123186b.mo171262e(aVar);
            this.f123187c.mo171262e(aVar);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: c */
    public String mo171256c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        throw new UnsupportedOperationException("should not throw this");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: d */
    public void mo171261d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        throw new UnsupportedOperationException("should not throw this");
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public <T> T mo171244a(Key<T> aVar, Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        Intrinsics.checkParameterIsNotNull(function0, "fallback");
        return (T) m193317b((Key) aVar, (Function0) function0);
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: d */
    public <T> T mo171260d(Key<T> aVar, T t) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        T t2 = (T) mo171255c(aVar);
        return t2 != null ? t2 : t;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MergeDataStorage(DataStorage aVar, DataStorage aVar2) {
        super(aVar.mo171251b(), aVar.mo171257c());
        Intrinsics.checkParameterIsNotNull(aVar, "major");
        Intrinsics.checkParameterIsNotNull(aVar2, "minor");
        this.f123186b = aVar;
        this.f123187c = aVar2;
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: b */
    public <T> DataStorage mo171253b(Key<T> aVar, T t) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        if (t == null) {
            m193318g(aVar);
        } else {
            synchronized (this) {
                this.f123186b.mo171253b(aVar, t);
                this.f123187c.mo171253b(aVar, t);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public void mo171249a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        Intrinsics.checkParameterIsNotNull(str2, "serializedCipherValue");
        throw new UnsupportedOperationException("should not throw this");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* renamed from: b */
    private final <T> T m193317b(Key<T> aVar, Function0<? extends T> function0) {
        Object obj;
        T t = (T) this.f123186b.mo171255c(aVar);
        if (t == null) {
            Logger f = mo171251b().mo171228f();
            f.mo171234a("MergeDataStorage: cache miss, key: " + aVar.mo171118a(), "DEBUG");
            synchronized (this) {
                T t2 = (T) this.f123186b.mo171255c(aVar);
                if (t2 != null) {
                    Logger f2 = mo171251b().mo171228f();
                    f2.mo171234a("MergeDataStorage: cache hit, double check, key: " + aVar.mo171118a(), "DEBUG");
                    return t2;
                }
                T t3 = (T) this.f123187c.mo171255c(aVar);
                if (t3 != null) {
                    Logger f3 = mo171251b().mo171228f();
                    f3.mo171234a("MergeDataStorage: cache from secondary, key: " + aVar.mo171118a(), "DEBUG");
                    this.f123186b.mo171253b(aVar, t3);
                    return t3;
                }
                if (function0 != null) {
                    obj = function0.invoke();
                } else {
                    obj = null;
                }
                t = obj;
                if (t != null) {
                    this.f123186b.mo171253b(aVar, t);
                    this.f123187c.mo171253b(aVar, t);
                    Logger f4 = mo171251b().mo171228f();
                    f4.mo171234a("MergeDataStorage: cache from fallback, key: " + aVar.mo171118a(), "DEBUG");
                    return t;
                }
                Unit unit = Unit.INSTANCE;
            }
        } else {
            Logger f5 = mo171251b().mo171228f();
            f5.mo171234a("MergeDataStorage: cache hit, key: " + aVar.mo171118a(), "DEBUG");
        }
        return t;
    }
}
