package com.ss.android.lark.abtest;

import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/abtest/ExperimentConfig;", "", "()V", "EXPERIMENTS", "", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "isAndInflaterEnabled", "", "()Z", "isChatFragmentEnabled", "isMessageDispatchEnabled", "isMessageWeightEnabled", "isPreloadXMLEnabled", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.abtest.c */
public final class ExperimentConfig {

    /* renamed from: a */
    public static final List<AbstractC28490a<?>> f71632a;

    /* renamed from: b */
    public static final ExperimentConfig f71633b = new ExperimentConfig();

    private ExperimentConfig() {
    }

    /* renamed from: a */
    public final boolean mo101363a() {
        Boolean bool = (Boolean) ((IABTestService) ApiUtils.getApi(IABTestService.class)).getAbTestValue(AndInflaterExperiment.class, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo101364b() {
        Boolean bool = (Boolean) ((IABTestService) ApiUtils.getApi(IABTestService.class)).getAbTestValue(MessageWeightExperiment.class, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo101365c() {
        Boolean bool = (Boolean) ((IABTestService) ApiUtils.getApi(IABTestService.class)).getAbTestValue(PreloadXMLExperiment.class, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo101366d() {
        Boolean bool = (Boolean) ((IABTestService) ApiUtils.getApi(IABTestService.class)).getAbTestValue(ChatFragmentExperiment.class, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f71632a = arrayList;
        arrayList.add(new AndInflaterExperiment());
        arrayList.add(new MessageDispatchExperiment());
        arrayList.add(new MessageWeightExperiment());
        arrayList.add(new PreloadXMLExperiment());
        arrayList.add(new ChatFragmentExperiment());
    }
}
