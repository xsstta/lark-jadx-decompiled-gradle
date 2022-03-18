package com.ss.ugc.effectplatform.cache;

import bytekn.foundation.concurrent.SharedReference;
import bytekn.foundation.io.file.FileInputStream;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.logger.Logger;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.cache.disklrucache.DiskLruCache;
import com.ss.ugc.effectplatform.cache.disklrucache.IAllowListKeyRule;
import com.ss.ugc.effectplatform.exception.CurrentEditingException;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.settings.SettingsFactory;
import com.ss.ugc.effectplatform.settings.Setttings;
import com.ss.ugc.effectplatform.util.C65555m;
import com.ss.ugc.effectplatform.util.TextUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bJf\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00152:\b\u0002\u0010\u0016\u001a4\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/EffectDiskLruCache;", "Lcom/ss/ugc/effectplatform/cache/DiskLruCacheImpl;", "effectConfiguration", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/EffectConfig;)V", "jsonConverter", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "clear", "", "removeEffect", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "unzipEffect", "", "zipFilePath", "", "writeEffectZip", "effectResourceInputStream", "Lbytekn/foundation/io/file/FileInputStream;", "expectMD5", "contentLength", "", "onProgressCallback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "progress", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.a.e */
public final class EffectDiskLruCache extends DiskLruCacheImpl {

    /* renamed from: b */
    public static final SharedReference<Setttings> f164824b = new SharedReference<>(null);

    /* renamed from: c */
    public static SharedReference<String> f164825c = new SharedReference<>(null);

    /* renamed from: d */
    public static SharedReference<List<String>> f164826d = new SharedReference<>(null);

    /* renamed from: e */
    public static final Companion f164827e = new Companion(null);

    /* renamed from: h */
    private static final IAllowListKeyRule f164828h = new C65498b();

    /* renamed from: f */
    private final IJsonConverter f164829f;

    /* renamed from: g */
    private final EffectConfig f164830g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/EffectDiskLruCache$Companion;", "", "()V", "ALLOW_LIST_RULE", "Lcom/ss/ugc/effectplatform/cache/disklrucache/IAllowListKeyRule;", "EFFECT_ID_MAP", "", "MAX_CACHE_SIZE", "", "TAG", "country", "Lbytekn/foundation/concurrent/SharedReference;", "draftDIRAllowList", "", "effectIdSp", "Lcom/ss/ugc/effectplatform/settings/Setttings;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"com/ss/ugc/effectplatform/cache/EffectDiskLruCache$Companion$ALLOW_LIST_RULE$1", "Lcom/ss/ugc/effectplatform/cache/disklrucache/IAllowListKeyRule;", "brAllowList", "", "", "ruAllowList", "isAllowed", "", "key", "isCountry", "code", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a.e$b */
    public static final class C65498b implements IAllowListKeyRule {

        /* renamed from: a */
        private final List<String> f164831a = CollectionsKt.listOf((Object[]) new String[]{"52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781"});

        /* renamed from: b */
        private final List<String> f164832b = CollectionsKt.listOf((Object[]) new String[]{"52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226"});

        C65498b() {
        }

        /* renamed from: b */
        public final boolean mo227696b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "code");
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("EffectDiskLruCache", "cleaneffect: isCountry:" + str + " now:" + EffectDiskLruCache.f164825c);
            if (TextUtils.f165135a.mo228357a(str) || !Intrinsics.areEqual(str, EffectDiskLruCache.f164825c.mo8625a())) {
                return false;
            }
            return true;
        }

        @Override // com.ss.ugc.effectplatform.cache.disklrucache.IAllowListKeyRule
        /* renamed from: a */
        public boolean mo227678a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            if (TextUtils.f165135a.mo228357a(str)) {
                return false;
            }
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("EffectDiskLruCache", "cleaneffect: allowlist：" + str);
            Setttings a = EffectDiskLruCache.f164824b.mo8625a();
            if (a != null) {
                String a2 = Setttings.C65511a.m256855a(a, str, null, 2, null);
                if (mo227696b("BR") && this.f164831a.contains(a2)) {
                    Logger bVar2 = Logger.f5760a;
                    bVar2.mo8662a("EffectDiskLruCache", "cleaneffect: allowlist：BR, key: " + str);
                    return true;
                } else if (!mo227696b("RU") || !this.f164832b.contains(a2)) {
                    List<String> a3 = EffectDiskLruCache.f164826d.mo8625a();
                    if (a3 != null && a3.contains(str)) {
                        Logger bVar3 = Logger.f5760a;
                        bVar3.mo8662a("EffectDiskLruCache", "cleaneffect: allowlist：draft, key: " + str);
                        return true;
                    }
                } else {
                    Logger bVar4 = Logger.f5760a;
                    bVar4.mo8662a("EffectDiskLruCache", "cleaneffect: allowlist：RU, key: " + str);
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectDiskLruCache(EffectConfig effectConfig) {
        super(effectConfig.mo227562i(), 0, 0, 838860800, f164828h, 6, null);
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfiguration");
        this.f164830g = effectConfig;
        String str = "effectid_map";
        if (!TextUtils.f165135a.mo228357a(C65555m.m257111a(effectConfig))) {
            str = C65555m.m257111a(effectConfig) + FileManager.f5817a.mo8712a() + str;
        }
        f164824b.mo8626a(SettingsFactory.f164933a.mo227815a(str, effectConfig.mo227543C()));
        f164825c.mo8626a(effectConfig.mo227563j());
        f164826d.mo8626a(effectConfig.mo227542B());
        this.f164829f = effectConfig.mo227570q();
    }

    /* renamed from: a */
    public final void mo227694a(Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        mo227689d(effect.getId() + ".zip");
        String unzipPath = effect.getUnzipPath();
        if (unzipPath != null) {
            try {
                String d = FileManager.f5817a.mo8726d(unzipPath);
                if (d != null) {
                    mo227689d(d);
                }
                FileManager.f5817a.mo8731g(unzipPath);
            } catch (Exception e) {
                Logger bVar = Logger.f5760a;
                Logger.m7508a(bVar, "EffectDiskLruCache", "remove effect failed! " + e.getMessage(), null, 4, null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo227695a(java.lang.String r31, com.ss.ugc.effectplatform.model.Effect r32) {
        /*
        // Method dump skipped, instructions count: 584
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.cache.EffectDiskLruCache.mo227695a(java.lang.String, com.ss.ugc.effectplatform.model.Effect):boolean");
    }

    /* renamed from: a */
    public final String mo227693a(Effect effect, FileInputStream bVar, String str, long j, Function2<? super Integer, ? super Long, Unit> kVar) {
        Setttings a;
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        Intrinsics.checkParameterIsNotNull(bVar, "effectResourceInputStream");
        DiskLruCache.Companion aVar = DiskLruCache.f164764h;
        String a2 = aVar.mo227659a(effect.getId() + ".zip");
        try {
            Pair<String, Boolean> a3 = mo227683a(a2, bVar, str, j, kVar);
            if (a3.getSecond().booleanValue() && (a = f164824b.mo8625a()) != null) {
                a.mo227813a(effect.getId(), effect.getEffect_id());
            }
            Logger bVar2 = Logger.f5760a;
            bVar2.mo8662a("EffectDiskLruCache", "effect " + effect.getEffect_id() + ", name: " + effect.getName() + ", key: " + a2 + " end in disklrucache, result: " + a3.getSecond().booleanValue());
            return a3.getFirst();
        } catch (Exception e) {
            Logger bVar3 = Logger.f5760a;
            Exception exc = e;
            bVar3.mo8663a("EffectDiskLruCache", "fetch effect: " + effect.getEffect_id() + ", name: " + effect.getName() + " key: " + a2 + " write to disk failed!", exc);
            if (!(e instanceof CurrentEditingException)) {
                mo227689d(a2);
            }
            throw exc;
        }
    }
}
