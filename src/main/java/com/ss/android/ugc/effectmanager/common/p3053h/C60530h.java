package com.ss.android.ugc.effectmanager.common.p3053h;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"expectedMd5", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "effectmanager_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.h.h */
public final class C60530h {
    /* renamed from: a */
    public static final String m235257a(Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "$this$expectedMd5");
        UrlModel fileUrl = effect.getFileUrl();
        if (fileUrl != null) {
            return fileUrl.getUri();
        }
        return null;
    }
}
