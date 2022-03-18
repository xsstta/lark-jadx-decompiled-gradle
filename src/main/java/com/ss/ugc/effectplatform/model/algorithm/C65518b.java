package com.ss.ugc.effectplatform.model.algorithm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getMD5", "", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "effect_model_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.model.algorithm.b */
public final class C65518b {
    /* renamed from: a */
    public static final String m256861a(ModelInfo modelInfo) {
        Intrinsics.checkParameterIsNotNull(modelInfo, "$this$getMD5");
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        if (file_url != null) {
            return file_url.getUri();
        }
        return null;
    }
}
