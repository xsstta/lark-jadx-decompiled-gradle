package com.bytedance.ies.bullet.xresourceloader.geckox;

import com.bytedance.geckox.C14205b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0006R.\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ies/bullet/xresourceloader/geckox/GeckoXClientManager;", "", "()V", "map", "Ljava/util/HashMap;", "", "Lcom/bytedance/geckox/GeckoClient;", "Lkotlin/collections/HashMap;", "getGeckoClient", "accessKey", "putGeckoClient", "", "geckoClient", "x-resloader-dep-geckox_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ies.bullet.c.a.a */
public final class GeckoXClientManager {

    /* renamed from: a */
    private final HashMap<String, C14205b> f37821a = new HashMap<>();

    /* renamed from: a */
    public final C14205b mo52607a(String str) {
        boolean z;
        C14205b bVar;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        synchronized (this.f37821a) {
            bVar = this.f37821a.get(str);
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo52608a(String str, C14205b bVar) {
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        synchronized (this.f37821a) {
            this.f37821a.put(str, bVar);
            Unit unit = Unit.INSTANCE;
        }
    }
}
