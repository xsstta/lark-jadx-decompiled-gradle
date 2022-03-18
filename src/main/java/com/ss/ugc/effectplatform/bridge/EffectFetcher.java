package com.ss.ugc.effectplatform.bridge;

import com.ss.ugc.effectplatform.task.SyncTask;
import com.ss.ugc.effectplatform.task.result.EffectTaskResult;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/ugc/effectplatform/bridge/EffectFetcher;", "", "fetchEffect", "Lcom/ss/ugc/effectplatform/task/SyncTask;", "Lcom/ss/ugc/effectplatform/task/result/EffectTaskResult;", "arguments", "Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.bridge.a */
public interface EffectFetcher {
    /* renamed from: a */
    SyncTask<EffectTaskResult> mo227702a(EffectFetcherArguments bVar);
}
