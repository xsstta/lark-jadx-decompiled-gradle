package com.bytedance.ee.util.p699b;

import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.abtest.api.p1324a.C28491b;

/* renamed from: com.bytedance.ee.util.b.a */
public class C13594a extends AbstractC28490a<Boolean> {
    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public boolean isSticky() {
        return true;
    }

    /* renamed from: a */
    public Boolean getDefault() {
        return true;
    }

    @Override // com.ss.android.lark.abtest.api.p1324a.AbstractC28490a
    public C28491b getLarkExperimentInfo() {
        return new C28491b("is_p0_merge_to_main_proc", "is p0 process merged to main process", "xiaochao.91", "is p0 process merged to main process");
    }
}
