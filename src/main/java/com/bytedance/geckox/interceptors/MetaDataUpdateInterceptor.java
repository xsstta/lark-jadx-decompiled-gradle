package com.bytedance.geckox.interceptors;

import com.bytedance.geckox.meta.MetaDataItem;
import com.bytedance.geckox.meta.MetaDataManager;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/geckox/interceptors/MetaDataUpdateInterceptor;", "Lcom/bytedance/pipeline/Interceptor;", "", "Lcom/bytedance/geckox/model/UpdatePackage;", "", "()V", "intercept", "", "chain", "Lcom/bytedance/pipeline/Chain;", "packages", "geckox_noasanRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.geckox.d.j */
public final class MetaDataUpdateInterceptor extends AbstractC20235d<List<UpdatePackage>, List<? extends UpdatePackage>> {
    /* renamed from: a */
    public Object a_(AbstractC20233b<List<UpdatePackage>> bVar, List<UpdatePackage> list) throws Throwable {
        MetaDataItem metaDataItem;
        Intrinsics.checkParameterIsNotNull(bVar, "chain");
        Intrinsics.checkParameterIsNotNull(list, "packages");
        ListIterator<UpdatePackage> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            UpdatePackage next = listIterator.next();
            String accessKey = next.getAccessKey();
            ConcurrentHashMap<String, MetaDataItem> concurrentHashMap = MetaDataManager.f37560a.mo52261a().get(accessKey);
            if (concurrentHashMap == null) {
                MetaDataManager aVar = MetaDataManager.f37560a;
                Intrinsics.checkExpressionValueIsNotNull(accessKey, "accessKey");
                concurrentHashMap = aVar.mo52262a(accessKey);
            }
            if (!(concurrentHashMap == null || (metaDataItem = concurrentHashMap.get(next.getChannel())) == null || metaDataItem.allowUpdate)) {
                listIterator.remove();
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return bVar.proceed(list);
    }
}
