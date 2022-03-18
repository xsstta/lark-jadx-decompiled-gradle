package com.bytedance.geckox;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/geckox/GeckoClientManager;", "", "()V", "geckoClientRegister", "", "", "Lcom/bytedance/geckox/GeckoClient;", "getGeckoClientFromRegister", "accessKey", "registerGeckoClient", "", "client", "geckox_noasanRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.geckox.c */
public final class GeckoClientManager {

    /* renamed from: a */
    public static final GeckoClientManager f37390a = new GeckoClientManager();

    /* renamed from: b */
    private static final Map<String, C14205b> f37391b = new ConcurrentHashMap();

    private GeckoClientManager() {
    }

    /* renamed from: a */
    public final void mo52127a(String str, C14205b bVar) {
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        Intrinsics.checkParameterIsNotNull(bVar, "client");
        Map<String, C14205b> map = f37391b;
        if (map.get(str) == null) {
            map.put(str, bVar);
        }
    }
}
