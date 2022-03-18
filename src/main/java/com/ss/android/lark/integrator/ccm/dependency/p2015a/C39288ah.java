package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.lark.p414b.AbstractC8008q;
import com.bytedance.ee.util.p699b.C13594a;
import com.bytedance.ee.util.p701d.C13628h;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.ah */
public class C39288ah implements AbstractC8008q {

    /* renamed from: a */
    private volatile Boolean f100619a;

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8008q
    /* renamed from: a */
    public boolean mo31022a() {
        if (this.f100619a == null) {
            synchronized (this) {
                if (this.f100619a == null) {
                    m154967b();
                }
            }
        }
        return this.f100619a.booleanValue();
    }

    /* renamed from: b */
    private void m154967b() {
        if (!C57765ac.m224188b(LarkContext.getApplication())) {
            this.f100619a = Boolean.valueOf(C57744a.m224104a().getBoolean("isP0MergeToMainProc", false));
        } else if (C13628h.m55294a(LarkContext.getApplication())) {
            this.f100619a = Boolean.valueOf(C57744a.m224104a().getBoolean("isP0MergeToMainProc", false));
        } else {
            C53241h.m205898b("ProcConfigDependencyImpl", "initP0MergeToMainProcValue from fg and abtest");
            boolean z = true;
            if (!C37239a.m146648b().mo136951a("spacekit.mobile.is_p0_merge_to_main_proc") || !((Boolean) ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getAbTestValue(C13594a.class, true)).booleanValue()) {
                z = false;
            }
            this.f100619a = Boolean.valueOf(z);
            C57744a.m224104a().putBoolean("isP0MergeToMainProc", this.f100619a.booleanValue());
            C57744a.m224104a().commit(false);
        }
        C53241h.m205898b("ProcConfigDependencyImpl", "initP0MergeToMainProcValue " + this.f100619a);
    }
}
