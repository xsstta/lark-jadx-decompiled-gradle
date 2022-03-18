package com.ss.android.lark.moments.impl.abtest;

import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/abtest/MomentsExperimentConfig;", "", "()V", "EXPERIMENTS", "", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "isFeedShowComment", "", "()Z", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.a.a */
public final class MomentsExperimentConfig {

    /* renamed from: a */
    public static final List<AbstractC28490a<?>> f119000a;

    /* renamed from: b */
    public static final MomentsExperimentConfig f119001b = new MomentsExperimentConfig();

    private MomentsExperimentConfig() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MomentsExposeCommentExperiment());
        f119000a = arrayList;
    }

    /* renamed from: a */
    public final boolean mo165902a() {
        Boolean bool;
        IABTestService iABTestService = (IABTestService) ApiUtils.getApi(IABTestService.class);
        Boolean bool2 = null;
        if (iABTestService != null) {
            bool = (Boolean) iABTestService.getAbTestValue(MomentsExposeCommentExperiment.class, true);
        } else {
            bool = null;
        }
        if (bool instanceof Boolean) {
            bool2 = bool;
        }
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }
}
