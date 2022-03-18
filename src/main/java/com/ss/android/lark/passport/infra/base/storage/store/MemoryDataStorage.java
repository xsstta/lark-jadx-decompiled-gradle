package com.ss.android.lark.passport.infra.base.storage.store;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.storage.config.Config;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorage;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J#\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0014¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014J/\u0010\u0011\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\f0\u0013H\u0016¢\u0006\u0002\u0010\u0014J)\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0006\u0010\u0017\u001a\u0002H\fH\u0014¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0014\u0010\u001b\u001a\u00020\u00162\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0006H\u0014R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/MemoryDataStorage;", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "config", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allLayers", "", "", "(Lcom/ss/android/lark/passport/infra/base/storage/config/Config;Ljava/util/List;)V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getInternal", "T", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;)Ljava/lang/Object;", "cipherKey", "getOrPut", "fallback", "Lkotlin/Function0;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "putInternal", "", "value", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)V", "serializedCipherValue", "removeAll", "removeInternal", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.c.d */
public final class MemoryDataStorage extends DataStorage {

    /* renamed from: b */
    public static final DataStorage.Factory f123182b = new C49064b();

    /* renamed from: c */
    public static final Companion f123183c = new Companion(null);

    /* renamed from: d */
    private final ConcurrentHashMap<String, Object> f123184d = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/MemoryDataStorage$Companion;", "", "()V", "FACTORY", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "getFACTORY", "()Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final DataStorage.Factory mo171273a() {
            return MemoryDataStorage.f123182b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/store/MemoryDataStorage$Companion$FACTORY$1", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "name", "", "getName", "()Ljava/lang/String;", "createDataStorage", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "context", "Landroid/content/Context;", "config", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allLayers", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.d$b */
    public static final class C49064b implements DataStorage.Factory {

        /* renamed from: a */
        private final String f123185a = "Memory";

        @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage.Factory
        /* renamed from: a */
        public String mo171265a() {
            return this.f123185a;
        }

        C49064b() {
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage.Factory
        /* renamed from: a */
        public DataStorage mo171264a(Context context, Config aVar, List<String> list) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(aVar, "config");
            Intrinsics.checkParameterIsNotNull(list, "allLayers");
            return new MemoryDataStorage(aVar, list);
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public void mo171248a() {
        this.f123184d.clear();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: c */
    public String mo171256c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        throw new UnsupportedOperationException("memory storage do not need deserialize and decrypt");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: d */
    public void mo171261d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        throw new UnsupportedOperationException("memory storage do not need encrypt key");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: f */
    public void mo171263f(Key<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        this.f123184d.remove(aVar.mo171118a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: d */
    public <T> T mo171259d(Key<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        T t = (T) this.f123184d.get(aVar.mo171118a());
        if (t == null) {
            t = null;
        }
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoryDataStorage(Config aVar, List<String> list) {
        super(aVar, list);
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        Intrinsics.checkParameterIsNotNull(list, "allLayers");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public void mo171249a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "cipherKey");
        Intrinsics.checkParameterIsNotNull(str2, "serializedCipherValue");
        throw new UnsupportedOperationException("memory storage do not need serialize and encrypt");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: c */
    public <T> void mo171258c(Key<T> aVar, T t) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        if (t == null) {
            mo171263f(aVar);
        } else {
            this.f123184d.put(aVar.mo171118a(), t);
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.storage.store.DataStorage
    /* renamed from: a */
    public <T> T mo171244a(Key<T> aVar, Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        Intrinsics.checkParameterIsNotNull(function0, "fallback");
        ConcurrentHashMap<String, Object> concurrentHashMap = this.f123184d;
        String a = aVar.mo171118a();
        T t = (T) concurrentHashMap.get(a);
        if (t != null) {
            return t;
        }
        T t2 = (T) function0.invoke();
        T t3 = (T) concurrentHashMap.putIfAbsent(a, t2);
        return t3 != null ? t3 : t2;
    }
}
