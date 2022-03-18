package com.bytedance.ee.bear.basesdk.apiimpl;

import com.bytedance.ee.bear.basesdk.api.AbstractC4387k;
import com.bytedance.ee.bear.lark.NewerOnboardingBannerAbTestExperiment;
import com.bytedance.ee.bear.templates.FixedTemplateBannerAbTestExperiment;
import com.bytedance.ee.bear.templates.TemplatePreviewAbTestExperiment;
import com.bytedance.ee.bear.templates.TemplateV4CreateAbTestExperiment;
import com.bytedance.ee.util.p699b.C13594a;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.l */
public class C4408l implements AbstractC4387k {
    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4387k
    /* renamed from: a */
    public List<AbstractC28490a> mo17067a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NewerOnboardingBannerAbTestExperiment());
        arrayList.add(new FixedTemplateBannerAbTestExperiment());
        arrayList.add(new TemplateV4CreateAbTestExperiment());
        arrayList.add(new TemplatePreviewAbTestExperiment());
        arrayList.add(new C13594a());
        return arrayList;
    }
}
