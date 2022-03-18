package com.ss.android.lark.abtest;

import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/abtest/AndInflaterExperiment;", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "", "()V", "getDefault", "()Ljava/lang/Boolean;", "getLarkExperimentInfo", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentInfo;", "isSticky", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.abtest.a */
public final class AndInflaterExperiment extends AbstractC28490a<Boolean> {

    /* renamed from: a */
    public static final Companion f71626a = new Companion(null);

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public boolean isSticky() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/abtest/AndInflaterExperiment$Companion;", "", "()V", "AB_KEY", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.abtest.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public Boolean getDefault() {
        return true;
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("andinflater_exp", "andinflaterA/B test", "yangzhiyong.123", "chat andinflater A/B test");
    }
}
