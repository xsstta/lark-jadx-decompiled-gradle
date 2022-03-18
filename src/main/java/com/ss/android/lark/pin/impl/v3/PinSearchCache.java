package com.ss.android.lark.pin.impl.v3;

import android.util.LruCache;
import com.ss.android.lark.pin.impl.entity.PinCacheEntity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\tH\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/PinSearchCache;", "", "()V", "CACHE_LIMIT", "", "TIME_THRESHOLD", "cache", "Landroid/util/LruCache;", "", "Lcom/ss/android/lark/pin/impl/entity/PinCacheEntity;", "cache$annotations", "get", "key", "put", "", "entity", "remove", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.g */
public final class PinSearchCache {

    /* renamed from: a */
    public static final PinSearchCache f128480a = new PinSearchCache();

    /* renamed from: b */
    private static final LruCache<String, PinCacheEntity> f128481b = new LruCache<>(5);

    private PinSearchCache() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m200340b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        f128481b.remove(str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final PinCacheEntity m200338a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "key");
        PinCacheEntity aVar = f128481b.get(str);
        if (aVar != null) {
            if (System.currentTimeMillis() - aVar.mo177384a() <= ((long) 300000)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return aVar;
            }
        }
        return null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m200339a(String str, PinCacheEntity aVar) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(aVar, "entity");
        f128481b.put(str, aVar);
    }
}
