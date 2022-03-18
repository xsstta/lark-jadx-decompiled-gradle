package com.bytedance.ee.bear.contract;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/contract/RequestCache;", "", "()V", "MAX_CACHE_SIZE", "", "cache", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/contract/DebugRequest;", "Lkotlin/collections/ArrayList;", "clear", "", "getAll", "put", "request", "debug-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.contract.aq */
public final class RequestCache {

    /* renamed from: a */
    public static final RequestCache f14808a = new RequestCache();

    /* renamed from: b */
    private static final int f14809b = 10000;

    /* renamed from: c */
    private static final ArrayList<DebugRequest> f14810c = new ArrayList<>(1000);

    private RequestCache() {
    }

    /* renamed from: a */
    public final ArrayList<DebugRequest> mo20217a() {
        return f14810c;
    }

    /* renamed from: b */
    public final void mo20219b() {
        f14810c.clear();
    }

    /* renamed from: a */
    public final void mo20218a(DebugRequest debugRequest) {
        Intrinsics.checkParameterIsNotNull(debugRequest, "request");
        ArrayList<DebugRequest> arrayList = f14810c;
        int size = arrayList.size();
        int i = f14809b;
        if (size >= i) {
            arrayList.remove(i - 1);
        }
        arrayList.add(0, debugRequest);
    }
}
