package com.ss.android.ugc.effectmanager.p3055e;

import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.model.algorithm.FetchModelType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0007"}, d2 = {"toKNFetchModelType", "Lcom/ss/ugc/effectplatform/model/algorithm/FetchModelType;", "Lcom/ss/android/ugc/effectmanager/FetchModelType;", "toKNModel", "Lcom/ss/ugc/effectplatform/EffectConfig$ModelFileEnv;", "Lcom/ss/android/ugc/effectmanager/DownloadableModelConfig$ModelFileEnv;", "toOldFetchModelType", "effectmanager_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.e.i */
public final class C60557i {
    /* renamed from: a */
    public static final EffectConfig.ModelFileEnv m235415a(DownloadableModelConfig.ModelFileEnv modelFileEnv) {
        Intrinsics.checkParameterIsNotNull(modelFileEnv, "$this$toKNModel");
        int i = C60558j.f151449c[modelFileEnv.ordinal()];
        if (i == 1) {
            return EffectConfig.ModelFileEnv.TEST;
        }
        if (i == 2) {
            return EffectConfig.ModelFileEnv.ONLINE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final FetchModelType m235416a(com.ss.android.ugc.effectmanager.FetchModelType fetchModelType) {
        Intrinsics.checkParameterIsNotNull(fetchModelType, "$this$toKNFetchModelType");
        int i = C60558j.f151448b[fetchModelType.ordinal()];
        if (i == 1) {
            return FetchModelType.ORIGIN;
        }
        if (i == 2) {
            return FetchModelType.ZIP;
        }
        throw new NoWhenBranchMatchedException();
    }
}
