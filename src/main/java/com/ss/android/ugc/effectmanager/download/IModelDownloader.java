package com.ss.android.ugc.effectmanager.download;

import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/effectmanager/download/IModelDownloader;", "", "download", "", "modelInfo", "Lcom/ss/android/ugc/effectmanager/model/ModelInfo;", "fetchModelType", "Lcom/ss/android/ugc/effectmanager/FetchModelType;", "monitorTrace", "Lcom/ss/android/ugc/effectmanager/common/monitor/MonitorTrace;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.d.a */
public interface IModelDownloader {
    /* renamed from: a */
    long mo207042a(ModelInfo modelInfo, FetchModelType fetchModelType, MonitorTrace bVar);
}
