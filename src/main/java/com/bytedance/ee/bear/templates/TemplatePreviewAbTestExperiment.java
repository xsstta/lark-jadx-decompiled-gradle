package com.bytedance.ee.bear.templates;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\bB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplatePreviewAbTestExperiment;", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "getDefault", "getLarkExperimentInfo", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentInfo;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TemplatePreviewAbTestExperiment extends AbstractC28490a<String> implements NonProguard {
    public static final Companion Companion = new Companion(null);

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public String getDefault() {
        return "false";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplatePreviewAbTestExperiment$Companion;", "", "()V", "KEY", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.TemplatePreviewAbTestExperiment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("single_template_preview_ab", "模板中心模板预览 AB-Test", "zhangyu", "模板中心模板预览 AB-Test");
    }
}
