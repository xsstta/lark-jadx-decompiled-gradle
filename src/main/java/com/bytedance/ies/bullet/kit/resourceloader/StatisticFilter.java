package com.bytedance.ies.bullet.kit.resourceloader;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/StatisticFilter;", "", "()V", "filterScheme", "", "", "filterResult", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "resource", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.j */
public final class StatisticFilter {

    /* renamed from: a */
    public static final StatisticFilter f37809a = new StatisticFilter();

    /* renamed from: b */
    private static final List<String> f37810b;

    private StatisticFilter() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("http");
        arrayList.add("local_file");
        arrayList.add("assets");
        arrayList.add("https");
        arrayList.add("lynxview");
        f37810b = arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r5 != false) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.bullet.service.base.ResourceInfo mo52602a(com.bytedance.ies.bullet.service.base.ResourceInfo r4, com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig r5) {
        /*
            r3 = this;
            java.lang.String r0 = "resource"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            android.net.Uri r0 = r4.mo52702b()
            java.lang.String r0 = r0.getScheme()
            java.util.List<java.lang.String> r1 = com.bytedance.ies.bullet.kit.resourceloader.StatisticFilter.f37810b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = kotlin.collections.CollectionsKt.contains(r1, r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0035
            com.bytedance.ies.bullet.service.base.ResourceFrom r0 = r4.mo52707e()
            if (r0 != 0) goto L_0x0035
            java.lang.String r5 = r5.mo52760f()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0032
            r5 = 1
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r5 == 0) goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            r4.mo52704b(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.resourceloader.StatisticFilter.mo52602a(com.bytedance.ies.bullet.service.base.m, com.bytedance.ies.bullet.service.base.resourceloader.config.j):com.bytedance.ies.bullet.service.base.m");
    }
}
