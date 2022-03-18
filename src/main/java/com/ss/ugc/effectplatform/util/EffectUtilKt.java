package com.ss.ugc.effectplatform.util;

import com.ss.ugc.effectplatform.algorithm.AlgorithmLibraryLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H ¨\u0006\u0005"}, d2 = {"checkEffectChildrenFile", "", "effectUnzipPath", "", "nativeCheckEffectChildrenFile", "effectplatform_release"}, mo238835k = 2, mv = {1, 1, 16})
public final class EffectUtilKt {
    public static final native boolean nativeCheckEffectChildrenFile(String str);

    /* renamed from: a */
    public static final boolean m257038a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "effectUnzipPath");
        AlgorithmLibraryLoader.f164838a.mo227704a();
        return nativeCheckEffectChildrenFile(str);
    }
}
