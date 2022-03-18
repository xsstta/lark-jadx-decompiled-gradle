package com.ss.android.ugc.effectmanager.common.cache;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/cache/EffectCacheManager;", "", "()V", "caches", "Ljava/util/HashMap;", "", "Lcom/ss/android/ugc/effectmanager/common/cachemanager/ICache;", "getCache", "dirPath", "setCache", "", "cache", "Companion", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.a.a */
public final class EffectCacheManager {

    /* renamed from: a */
    public static final Lazy f151231a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C60496b.INSTANCE);

    /* renamed from: b */
    public static final Companion f151232b = new Companion(null);

    /* renamed from: c */
    private HashMap<String, ICache> f151233c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/cache/EffectCacheManager$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/ugc/effectmanager/common/cache/EffectCacheManager;", "getInstance", "()Lcom/ss/android/ugc/effectmanager/common/cache/EffectCacheManager;", "instance$delegate", "Lkotlin/Lazy;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.common.a.a$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f151234a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/ss/android/ugc/effectmanager/common/cache/EffectCacheManager;"))};

        /* renamed from: a */
        public final EffectCacheManager mo207127a() {
            Lazy lazy = EffectCacheManager.f151231a;
            Companion aVar = EffectCacheManager.f151232b;
            KProperty kProperty = f151234a[0];
            return (EffectCacheManager) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/effectmanager/common/cache/EffectCacheManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.common.a.a$b */
    static final class C60496b extends Lambda implements Function0<EffectCacheManager> {
        public static final C60496b INSTANCE = new C60496b();

        C60496b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EffectCacheManager invoke() {
            return new EffectCacheManager(null);
        }
    }

    private EffectCacheManager() {
        this.f151233c = new HashMap<>();
    }

    public /* synthetic */ EffectCacheManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final synchronized ICache mo207125a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "dirPath");
        ICache bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f151233c.containsKey(str)) {
            bVar = this.f151233c.get(str);
        }
        return bVar;
    }

    /* renamed from: a */
    public final synchronized void mo207126a(String str, ICache bVar) {
        Intrinsics.checkParameterIsNotNull(str, "dirPath");
        this.f151233c.put(str, bVar);
    }
}
