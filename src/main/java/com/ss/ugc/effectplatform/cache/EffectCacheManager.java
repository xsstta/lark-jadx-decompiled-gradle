package com.ss.ugc.effectplatform.cache;

import bytekn.foundation.collections.SharedMutableMap;
import com.ss.ugc.effectplatform.util.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0006R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/EffectCacheManager;", "", "()V", "caches", "Lbytekn/foundation/collections/SharedMutableMap;", "", "Lcom/ss/ugc/effectplatform/cache/ICache;", "clearCache", "", "dirPath", "getCache", "setCache", "cache", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.a.d */
public final class EffectCacheManager {

    /* renamed from: a */
    public static final EffectCacheManager f164822a = new EffectCacheManager();

    /* renamed from: b */
    private static SharedMutableMap<String, ICache> f164823b = new SharedMutableMap<>(true);

    private EffectCacheManager() {
    }

    /* renamed from: a */
    public final ICache mo227691a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "dirPath");
        if (!TextUtils.f165135a.mo228357a(str) && f164823b.containsKey(str)) {
            return f164823b.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo227692a(String str, ICache fVar) {
        Intrinsics.checkParameterIsNotNull(str, "dirPath");
        f164823b.put(str, fVar);
    }
}
