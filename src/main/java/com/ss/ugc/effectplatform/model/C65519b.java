package com.ss.ugc.effectplatform.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"expectedMd5", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "effect_model_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.model.b */
public final class C65519b {
    /* renamed from: a */
    public static final String m256862a(Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "$this$expectedMd5");
        if (Intrinsics.areEqual(effect.getFile_url().getUri(), "")) {
            return null;
        }
        return effect.getFile_url().getUri();
    }
}
