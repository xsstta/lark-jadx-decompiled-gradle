package com.ss.android.lark.passport.infra.base.storage;

import android.app.Application;
import com.ss.android.lark.passport.infra.base.storage.config.Config;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorage;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorageDelegate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J*\u0010\u0016\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007J \u0010\u001c\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0011H\u0007J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0011H\u0002J \u0010\u001e\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0011H\u0002J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\nH\u0007J\u001f\u0010\"\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\nH\u0001¢\u0006\u0002\b#J%\u0010$\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110%2\b\b\u0002\u0010!\u001a\u00020\nH\u0007¢\u0006\u0002\u0010&J \u0010$\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\b\b\u0002\u0010!\u001a\u00020\nH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/IsolateStorage;", "", "()V", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "globalConfig", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "getGlobalConfig", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "setGlobalConfig", "(Lcom/ss/android/lark/passport/infra/base/storage/config/Config;)V", "storageCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "clearCache", "", "clearCache$passport_infra_release", "delete", "layers", "", "root", "factory", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage$Factory;", "deleteLayers", "generateAllLayers", "generateUri", "init", "app", "config", "reInit", "reInit$passport_infra_release", "useOrCreate", "", "([Ljava/lang/String;Lcom/ss/android/lark/passport/infra/base/storage/config/Config;)Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.a */
public final class IsolateStorage {

    /* renamed from: a */
    public static volatile Config f123103a;

    /* renamed from: b */
    public static volatile Application f123104b;

    /* renamed from: c */
    public static final IsolateStorage f123105c = new IsolateStorage();

    /* renamed from: d */
    private static final ConcurrentHashMap<String, ConcurrentHashMap<String, DataStorageDelegate>> f123106d = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.a$a */
    public static final class C49041a extends Lambda implements Function1<String, String> {
        public static final C49041a INSTANCE = new C49041a();

        C49041a() {
            super(1);
        }

        public final String invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            return str;
        }
    }

    private IsolateStorage() {
    }

    /* renamed from: a */
    public final Config mo171220a() {
        Config aVar = f123103a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalConfig");
        }
        return aVar;
    }

    static {
        IsolateStorageInitializer.f123147a.mo171242a();
    }

    /* renamed from: b */
    private final String m193174b(List<String> list, String str) {
        return CollectionsKt.joinToString$default(m193172a(list, str), "_", null, null, 0, null, C49041a.INSTANCE, 30, null);
    }

    /* renamed from: a */
    private final List<String> m193172a(List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : CollectionsKt.plus((Collection) CollectionsKt.listOf(str), (Iterable) list)) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: a */
    public static final DataStorageDelegate m193170a(List<String> list, Config aVar) {
        ConcurrentHashMap<String, DataStorageDelegate> putIfAbsent;
        Intrinsics.checkParameterIsNotNull(list, "layers");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        IsolateStorage aVar2 = f123105c;
        List<String> a = aVar2.m193172a(list, aVar.mo171229g());
        String b = aVar2.m193174b(list, aVar.mo171229g());
        ConcurrentHashMap<String, ConcurrentHashMap<String, DataStorageDelegate>> concurrentHashMap = f123106d;
        ConcurrentHashMap<String, DataStorageDelegate> concurrentHashMap2 = concurrentHashMap.get(b);
        if (concurrentHashMap2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(b, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = putIfAbsent;
        }
        ConcurrentHashMap<String, DataStorageDelegate> concurrentHashMap3 = concurrentHashMap2;
        Intrinsics.checkExpressionValueIsNotNull(concurrentHashMap3, "map");
        ConcurrentHashMap<String, DataStorageDelegate> concurrentHashMap4 = concurrentHashMap3;
        String a2 = aVar.mo171227e().mo171265a();
        DataStorageDelegate bVar = concurrentHashMap4.get(a2);
        if (bVar == null) {
            DataStorageDelegate.Companion aVar3 = DataStorageDelegate.f123163d;
            DataStorage.Factory e = aVar.mo171227e();
            Application application = f123104b;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
            }
            bVar = aVar3.mo171267a(e.mo171264a(application, aVar, a));
            DataStorageDelegate putIfAbsent2 = concurrentHashMap4.putIfAbsent(a2, bVar);
            if (putIfAbsent2 != null) {
                bVar = putIfAbsent2;
            }
        }
        Intrinsics.checkExpressionValueIsNotNull(bVar, "map.getOrPut(config.fact…ayers).delegate\n        }");
        return bVar;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193173a(Application application, Config aVar) {
        Intrinsics.checkParameterIsNotNull(application, "app");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        if (f123104b == null) {
            f123104b = application;
            f123103a = aVar;
            return;
        }
        throw new IllegalStateException("IsolateStorage has been initialized");
    }

    /* renamed from: a */
    public static /* synthetic */ DataStorageDelegate m193171a(List list, Config aVar, int i, Object obj) {
        if ((i & 2) != 0 && (aVar = f123103a) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalConfig");
        }
        return m193170a(list, aVar);
    }
}
