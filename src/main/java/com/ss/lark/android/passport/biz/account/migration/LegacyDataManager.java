package com.ss.lark.android.passport.biz.account.migration;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.p2425b.C49038b;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorage;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.util.share_preference.C57744a;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J+\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00120\u000b2\b\u0010\u0013\u001a\u0004\u0018\u0001H\u0012¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0013\u001a\u00020\u0016J \u0010\u0017\u001a\u0004\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J$\u0010\u0018\u001a\u00020\u00192\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0004J\u0014\u0010\u001c\u001a\u00020\u001d2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\"\u0010\u001e\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00120\u000b2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\f0\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\""}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/LegacyDataManager;", "", "()V", "TAG", "", "globalSPFetcher", "Lcom/ss/lark/android/passport/biz/account/migration/LegacyDataManager$ILegacyDataFetcher;", "getGlobalSPFetcher", "()Lcom/ss/lark/android/passport/biz/account/migration/LegacyDataManager$ILegacyDataFetcher;", "keyConstantMap", "", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "Lkotlin/Pair;", "spHelperFetcher", "getSpHelperFetcher", "findFetcher", "key", "get", "T", "default", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Ljava/lang/Object;", "getInt", "", "getString", "register", "", "fetcher", "keyInSP", "shouldFetchFromLegacy", "", "simpleMigrate", "to", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "ILegacyDataFetcher", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.account.migration.d */
public final class LegacyDataManager {

    /* renamed from: a */
    public static final LegacyDataManager f162572a = new LegacyDataManager();

    /* renamed from: b */
    private static final ILegacyDataFetcher f162573b = new C64327b();

    /* renamed from: c */
    private static final ILegacyDataFetcher f162574c = new C64328c();

    /* renamed from: d */
    private static final Map<Key<?>, Pair<String, ILegacyDataFetcher>> f162575d = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/LegacyDataManager$ILegacyDataFetcher;", "", "get", "", "key", "", "default", "remove", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.d$a */
    public interface ILegacyDataFetcher {
        /* renamed from: a */
        int mo222852a(String str, int i);

        /* renamed from: a */
        String mo222853a(String str, String str2);

        /* renamed from: a */
        void mo222854a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/account/migration/LegacyDataManager$globalSPFetcher$1", "Lcom/ss/lark/android/passport/biz/account/migration/LegacyDataManager$ILegacyDataFetcher;", "get", "", "key", "", "default", "remove", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.d$b */
    public static final class C64327b implements ILegacyDataFetcher {
        C64327b() {
        }

        @Override // com.ss.lark.android.passport.biz.account.migration.LegacyDataManager.ILegacyDataFetcher
        /* renamed from: a */
        public void mo222854a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            C57744a.m224104a().remove(str);
        }

        @Override // com.ss.lark.android.passport.biz.account.migration.LegacyDataManager.ILegacyDataFetcher
        /* renamed from: a */
        public int mo222852a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            return C57744a.m224104a().getInt(str, i);
        }

        @Override // com.ss.lark.android.passport.biz.account.migration.LegacyDataManager.ILegacyDataFetcher
        /* renamed from: a */
        public String mo222853a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            return C57744a.m224104a().getString(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/account/migration/LegacyDataManager$spHelperFetcher$1", "Lcom/ss/lark/android/passport/biz/account/migration/LegacyDataManager$ILegacyDataFetcher;", "get", "", "key", "", "default", "remove", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.d$c */
    public static final class C64328c implements ILegacyDataFetcher {
        C64328c() {
        }

        @Override // com.ss.lark.android.passport.biz.account.migration.LegacyDataManager.ILegacyDataFetcher
        /* renamed from: a */
        public void mo222854a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            C49038b.m193165a().mo171217a(str);
        }

        @Override // com.ss.lark.android.passport.biz.account.migration.LegacyDataManager.ILegacyDataFetcher
        /* renamed from: a */
        public int mo222852a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            return C49038b.m193165a().mo171216a(str, i);
        }

        @Override // com.ss.lark.android.passport.biz.account.migration.LegacyDataManager.ILegacyDataFetcher
        /* renamed from: a */
        public String mo222853a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            return C49038b.m193165a().mo171219b(str, str2);
        }
    }

    private LegacyDataManager() {
    }

    /* renamed from: a */
    public final ILegacyDataFetcher mo222846a() {
        return f162573b;
    }

    /* renamed from: b */
    public final ILegacyDataFetcher mo222851b() {
        return f162574c;
    }

    /* renamed from: b */
    private final ILegacyDataFetcher m252917b(Key<?> aVar) {
        Pair<String, ILegacyDataFetcher> pair;
        if (m252916a(aVar) && (pair = f162575d.get(aVar)) != null) {
            return pair.getSecond();
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m252916a(Key<?> aVar) {
        boolean containsKey = f162575d.containsKey(aVar);
        if (containsKey) {
            Log.m165389i("CompatDataStorage", "put or get when migrating: key = " + aVar.mo171118a());
        }
        return containsKey;
    }

    /* renamed from: a */
    public final int mo222845a(Key<Integer> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        ILegacyDataFetcher b = m252917b(aVar);
        if (b != null) {
            return b.mo222852a(aVar.mo171118a(), i);
        }
        return i;
    }

    /* renamed from: a */
    public final <T> T mo222847a(Key<T> aVar, T t) {
        int i;
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        Type b = aVar.mo171119b();
        if (Intrinsics.areEqual(b, String.class)) {
            return (T) mo222848a((Key<String>) aVar, (String) t);
        }
        if (!Intrinsics.areEqual(b, Integer.class) && !Intrinsics.areEqual(b, Integer.TYPE)) {
            ILegacyDataFetcher b2 = m252917b(aVar);
            if (b2 != null) {
                T t2 = (T) C49202p.m193969a(b2.mo222853a(aVar.mo171118a(), ""), aVar.mo171119b());
                return t2 != null ? t2 : t;
            }
            Log.m165383e("CompatDataStorage", "key: " + aVar.mo171118a() + " not found");
            return t;
        }
        T t3 = t;
        if (t3 != null) {
            i = t3.intValue();
        } else {
            i = 0;
        }
        return (T) Integer.valueOf(mo222845a(aVar, i));
    }

    /* renamed from: a */
    public final String mo222848a(Key<String> aVar, String str) {
        String a;
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        ILegacyDataFetcher b = m252917b(aVar);
        return (b == null || (a = b.mo222853a(aVar.mo171118a(), str)) == null) ? str : a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.passport.infra.base.c.c.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> void mo222849a(Key<T> aVar, DataStorage aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        Intrinsics.checkParameterIsNotNull(aVar2, "to");
        if (m252917b(aVar) != null) {
            aVar2.mo171253b(aVar, mo222847a(aVar, (Object) null));
        }
    }

    /* renamed from: a */
    public final void mo222850a(Key<?> aVar, ILegacyDataFetcher aVar2, String str) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        Intrinsics.checkParameterIsNotNull(aVar2, "fetcher");
        Intrinsics.checkParameterIsNotNull(str, "keyInSP");
        f162575d.put(aVar, TuplesKt.to(str, aVar2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m252915a(LegacyDataManager dVar, Key aVar, ILegacyDataFetcher aVar2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = aVar.mo171118a();
        }
        dVar.mo222850a(aVar, aVar2, str);
    }
}
