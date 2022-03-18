package com.ss.android.lark.passport.infra.base.storage.store;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.storage.config.Config;
import com.ss.android.lark.passport.infra.base.storage.config.Crypto;
import com.ss.android.lark.passport.infra.base.storage.config.Logger;
import com.ss.android.lark.passport.infra.base.storage.config.Serializer;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.utils.LarkContext;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u0000 ;2\u00020\u0001:\u0003;<=B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0004J+\u0010\u0014\u001a\u0004\u0018\u0001H\u0015\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0004¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00062\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0004J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0004J#\u0010\u001d\u001a\u0004\u0018\u0001H\u0015\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017H\u0016¢\u0006\u0002\u0010\u001eJ#\u0010\u001f\u001a\u0004\u0018\u0001H\u0015\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017H\u0014¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H$J)\u0010!\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00172\u0006\u0010\"\u001a\u0002H\u0015H\u0016¢\u0006\u0002\u0010#J/\u0010$\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00150%H\u0016¢\u0006\u0002\u0010&J/\u0010'\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00150%H\u0016¢\u0006\u0002\u0010&J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0002J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\"\u0010-\u001a\b\u0012\u0004\u0012\u0002H\u00150.\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017H\u0014J+\u0010/\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00172\b\u00100\u001a\u0004\u0018\u0001H\u0015H\u0016¢\u0006\u0002\u00101J)\u00102\u001a\u000203\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00172\u0006\u00100\u001a\u0002H\u0015H\u0014¢\u0006\u0002\u00104J\u0018\u00102\u001a\u0002032\u0006\u0010 \u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H$J\u0014\u00106\u001a\u00020\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0016J\b\u00107\u001a\u000203H&J\u0014\u00108\u001a\u0002032\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014J\u0010\u00108\u001a\u0002032\u0006\u0010 \u001a\u00020\u0006H$J+\u00109\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00172\b\u00100\u001a\u0004\u0018\u0001H\u0015H\u0004¢\u0006\u0002\u0010:R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006>"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "", "config", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allLayers", "", "", "(Lcom/ss/android/lark/passport/infra/base/storage/config/Config;Ljava/util/List;)V", "getAllLayers", "()Ljava/util/List;", "getConfig", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "keyCrypto", "Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "getKeyCrypto", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Crypto;", "valueCrypto", "getValueCrypto", "decryptValue", "cipherValue", "deserialize", "T", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "clearValue", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/String;)Ljava/lang/Object;", "encryptKey", "clearKey", "encryptValue", "get", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;)Ljava/lang/Object;", "getInternal", "cipherKey", "getOrDefault", "fallback", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrPut", "getSerializedClearValue", "isCreateBy", "", "factory", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "newSerializer", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer;", "put", "value", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "putInternal", "", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)V", "serializedCipherValue", "remove", "removeAll", "removeInternal", "serialize", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Factory", "PendingActions", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.c.a */
public abstract class DataStorage {

    /* renamed from: a */
    public static final Companion f123155a = new Companion(null);

    /* renamed from: f */
    private static final ConcurrentHashMap<Type, Serializer<?>> f123156f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static final boolean f123157g = C49224w.m194054b(LarkContext.getApplication());

    /* renamed from: b */
    private final Crypto f123158b;

    /* renamed from: c */
    private final Crypto f123159c;

    /* renamed from: d */
    private final Config f123160d;

    /* renamed from: e */
    private final List<String> f123161e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "", "name", "", "getName", "()Ljava/lang/String;", "createDataStorage", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "context", "Landroid/content/Context;", "config", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "allLayers", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.a$b */
    public interface Factory {
        /* renamed from: a */
        DataStorage mo171264a(Context context, Config aVar, List<String> list);

        /* renamed from: a */
        String mo171265a();
    }

    /* renamed from: a */
    public abstract void mo171248a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo171249a(String str, String str2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo171256c(String str);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo171261d(String str);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Companion;", "", "()V", "inMainProcess", "", "serializerCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/reflect/Type;", "Lcom/ss/android/lark/passport/infra/base/storage/config/Serializer;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final Config mo171251b() {
        return this.f123160d;
    }

    /* renamed from: c */
    public final List<String> mo171257c() {
        return this.f123161e;
    }

    /* renamed from: e */
    private final String m193245e(String str) {
        return mo171254b(mo171256c(str));
    }

    /* renamed from: a */
    public final boolean mo171250a(Factory bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "factory");
        return Intrinsics.areEqual(bVar, this.f123160d.mo171227e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo171263f(Key<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        mo171261d(mo171245a(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public <T> T mo171259d(Key<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        return (T) mo171243a((Key) aVar, m193245e(mo171245a((Key<?>) aVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T> Serializer<T> mo171252b(Key<T> aVar) {
        Object putIfAbsent;
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        ConcurrentMap concurrentMap = f123156f;
        Type b = aVar.mo171119b();
        Object obj = concurrentMap.get(b);
        if (obj == null && (putIfAbsent = concurrentMap.putIfAbsent(b, (obj = this.f123160d.mo171230h().mo171241a()))) != null) {
            obj = putIfAbsent;
        }
        if (obj != null) {
            return (Serializer) obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.passport.infra.base.storage.config.Serializer<T>");
    }

    /* renamed from: c */
    public <T> T mo171255c(Key<T> aVar) {
        T t;
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        try {
            Result.Companion aVar2 = Result.Companion;
            t = (T) Result.m271569constructorimpl(mo171259d(aVar));
        } catch (Throwable th) {
            Result.Companion aVar3 = Result.Companion;
            t = (T) Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Throwable r1 = Result.m271572exceptionOrNullimpl(t);
        if (r1 == null) {
            return t;
        }
        Logger f = this.f123160d.mo171228f();
        f.mo171234a("get failed, " + aVar.mo171118a() + ", " + r1.getMessage(), "ERROR");
        return null;
    }

    /* renamed from: e */
    public DataStorage mo171262e(Key<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        if (!f123157g && !mo171250a(MemoryDataStorage.f123183c.mo171273a())) {
            Logger f = this.f123160d.mo171228f();
            f.mo171234a("remove in " + C49224w.m194051a(LarkContext.getApplication()) + ", key: " + aVar.mo171118a(), "ERROR");
        }
        mo171263f(aVar);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo171245a(Key<?> aVar) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(aVar, "clearKey");
        try {
            Result.Companion aVar2 = Result.Companion;
            obj = Result.m271569constructorimpl(this.f123158b.mo171231a(aVar.mo171118a()));
        } catch (Throwable th) {
            Result.Companion aVar3 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Throwable r1 = Result.m271572exceptionOrNullimpl(obj);
        if (r1 != null) {
            Logger f = this.f123160d.mo171228f();
            f.mo171234a("encryptKey failed, " + r1.getMessage(), "ERROR");
            obj = aVar.mo171118a();
        }
        return (String) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo171254b(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "cipherValue");
        try {
            Result.Companion aVar = Result.Companion;
            str2 = Result.m271569constructorimpl(this.f123159c.mo171232b(str));
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            str2 = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Throwable r1 = Result.m271572exceptionOrNullimpl(str2);
        if (r1 == null) {
            str = str2;
        } else {
            Logger f = this.f123160d.mo171228f();
            f.mo171234a("decryptValue failed, " + r1.getMessage(), "ERROR");
        }
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo171247a(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "clearValue");
        try {
            Result.Companion aVar = Result.Companion;
            str2 = Result.m271569constructorimpl(this.f123159c.mo171231a(str));
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            str2 = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Throwable r1 = Result.m271572exceptionOrNullimpl(str2);
        if (r1 == null) {
            str = str2;
        } else {
            Logger f = this.f123160d.mo171228f();
            f.mo171234a("encryptValue failed, " + r1.getMessage(), "ERROR");
        }
        return str;
    }

    /* renamed from: d */
    public <T> T mo171260d(Key<T> aVar, T t) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        T t2 = (T) mo171255c(aVar);
        return t2 != null ? t2 : t;
    }

    public DataStorage(Config aVar, List<String> list) {
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        Intrinsics.checkParameterIsNotNull(list, "allLayers");
        this.f123160d = aVar;
        this.f123161e = list;
        this.f123158b = aVar.mo171223a();
        this.f123159c = aVar.mo171224b();
    }

    /* renamed from: a */
    public <T> T mo171244a(Key<T> aVar, Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        Intrinsics.checkParameterIsNotNull(function0, "fallback");
        T t = (T) mo171255c(aVar);
        if (t != null) {
            return t;
        }
        T t2 = (T) function0.invoke();
        mo171253b(aVar, t2);
        return t2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public <T> void mo171258c(Key<T> aVar, T t) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        mo171249a(mo171245a((Key<?>) aVar), mo171247a(mo171246a((Key) aVar, (Object) t)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> T mo171243a(Key<T> aVar, String str) {
        T t;
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        Intrinsics.checkParameterIsNotNull(str, "clearValue");
        try {
            Result.Companion aVar2 = Result.Companion;
            t = (T) Result.m271569constructorimpl(mo171252b(aVar).mo171236a((Key) aVar, str));
        } catch (Throwable th) {
            Result.Companion aVar3 = Result.Companion;
            t = (T) Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Throwable r0 = Result.m271572exceptionOrNullimpl(t);
        if (r0 == null) {
            return t;
        }
        Logger f = this.f123160d.mo171228f();
        f.mo171234a("deserialize failed, " + aVar.mo171118a() + ", " + r0.getMessage(), "ERROR");
        return null;
    }

    /* renamed from: b */
    public <T> DataStorage mo171253b(Key<T> aVar, T t) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        if (!f123157g && !mo171250a(MemoryDataStorage.f123183c.mo171273a())) {
            Logger f = this.f123160d.mo171228f();
            f.mo171234a("put in " + C49224w.m194051a(LarkContext.getApplication()) + ", key: " + aVar.mo171118a(), "ERROR");
        }
        if (t == null) {
            mo171262e((Key<?>) aVar);
        } else {
            mo171258c(aVar, t);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> String mo171246a(Key<T> aVar, T t) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        try {
            Result.Companion aVar2 = Result.Companion;
            obj = Result.m271569constructorimpl(mo171252b(aVar).mo171237a((Key) aVar, (Object) t));
        } catch (Throwable th) {
            Result.Companion aVar3 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Throwable r0 = Result.m271572exceptionOrNullimpl(obj);
        if (r0 != null) {
            Logger f = this.f123160d.mo171228f();
            f.mo171234a("serialize failed, " + aVar.mo171118a() + ", " + r0.getMessage(), "ERROR");
            obj = "";
        }
        return (String) obj;
    }
}
