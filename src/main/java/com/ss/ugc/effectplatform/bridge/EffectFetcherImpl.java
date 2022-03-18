package com.ss.ugc.effectplatform.bridge;

import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.download.DownloadManager;
import com.ss.ugc.effectplatform.download.DownloadType;
import com.ss.ugc.effectplatform.download.EffectUnZipper;
import com.ss.ugc.effectplatform.download.EffectWriteDisk;
import com.ss.ugc.effectplatform.task.EffectFetcherTask;
import com.ss.ugc.effectplatform.task.SyncTask;
import com.ss.ugc.effectplatform.task.result.EffectTaskResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/bridge/EffectFetcherImpl;", "Lcom/ss/ugc/effectplatform/bridge/EffectFetcher;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/EffectConfig;)V", "getEffectConfig", "()Lcom/ss/ugc/effectplatform/EffectConfig;", "fetchEffect", "Lcom/ss/ugc/effectplatform/task/SyncTask;", "Lcom/ss/ugc/effectplatform/task/result/EffectTaskResult;", "arguments", "Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.bridge.c */
public final class EffectFetcherImpl implements EffectFetcher {

    /* renamed from: a */
    private final EffectConfig f164868a;

    public EffectFetcherImpl(EffectConfig effectConfig) {
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        this.f164868a = effectConfig;
    }

    @Override // com.ss.ugc.effectplatform.bridge.EffectFetcher
    /* renamed from: a */
    public SyncTask<EffectTaskResult> mo227702a(EffectFetcherArguments bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "arguments");
        DownloadManager.Builder aVar = new DownloadManager.Builder();
        INetworkClient a = this.f164868a.mo227571r().mo8625a();
        if (a == null) {
            Intrinsics.throwNpe();
        }
        return new EffectFetcherTask(bVar, aVar.mo227771a(a).mo227773a(new EffectUnZipper(bVar, this.f164868a)).mo227774a(new EffectWriteDisk(bVar.mo227733a())).mo227772a(DownloadType.EFFECT).mo227775a(), this.f164868a);
    }
}
