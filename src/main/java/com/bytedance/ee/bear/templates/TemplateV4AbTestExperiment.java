package com.bytedance.ee.bear.templates;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\tB\u0005¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateV4AbTestExperiment;", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "getDefault", "()Ljava/lang/Boolean;", "getLarkExperimentInfo", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentInfo;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TemplateV4AbTestExperiment extends AbstractC28490a<Boolean> implements NonProguard {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateV4AbTestExperiment$Companion;", "", "()V", "KEY", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.TemplateV4AbTestExperiment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public Boolean getDefault() {
        return false;
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("template_optimization_v4_ab", "模版中心优化v4.1 ab test", "caichuangxing", "模版V4.1 AB Test");
    }
}
