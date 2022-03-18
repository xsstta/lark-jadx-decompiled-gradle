package com.ss.android.ugc.effectmanager.model;

import com.ss.android.ugc.effectmanager.common.p3052g.C60518b;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/effectmanager/model/FetchSingleAlgorithmModelTaskResult;", "Lcom/ss/android/ugc/effectmanager/common/task/BaseTaskResult;", "response", "Lcom/ss/ugc/effectplatform/model/algorithm/SingleAlgorithmModelResponse;", "exceptionResult", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "(Lcom/ss/ugc/effectplatform/model/algorithm/SingleAlgorithmModelResponse;Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;)V", "getExceptionResult", "()Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "getResponse", "()Lcom/ss/ugc/effectplatform/model/algorithm/SingleAlgorithmModelResponse;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.model.b */
public final class FetchSingleAlgorithmModelTaskResult extends C60518b {

    /* renamed from: a */
    private final SingleAlgorithmModelResponse f151634a;

    /* renamed from: b */
    private final C60519c f151635b;

    /* renamed from: b */
    public final SingleAlgorithmModelResponse mo208104b() {
        return this.f151634a;
    }

    /* renamed from: c */
    public final C60519c mo208105c() {
        return this.f151635b;
    }

    public FetchSingleAlgorithmModelTaskResult(SingleAlgorithmModelResponse singleAlgorithmModelResponse, C60519c cVar) {
        this.f151634a = singleAlgorithmModelResponse;
        this.f151635b = cVar;
    }
}
