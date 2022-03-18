package com.ss.android.ugc.effectmanager.common.cache;

import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.model.C60633c;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/cache/IModelCache;", "", "cacheDir", "", "getCacheDir", "()Ljava/lang/String;", "getLocalModelInfoByName", "Lcom/ss/android/ugc/effectmanager/model/LocalModelInfo;", "name", "monitorTrace", "Lcom/ss/android/ugc/effectmanager/common/monitor/MonitorTrace;", "getLocalModelInfoList", "", "isBuiltInResource", "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.a.d */
public interface IModelCache {
    /* renamed from: a */
    C60633c mo207017a(String str, MonitorTrace bVar);

    /* renamed from: a */
    Map<String, C60633c> mo207018a();

    /* renamed from: a */
    boolean mo207019a(String str);

    /* renamed from: b */
    String mo207020b();
}
