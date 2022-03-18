package com.bytedance.ee.larkbrand.hostbridge.p655a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13322k;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.b */
public class C13081b implements AbstractC67728b {

    /* renamed from: a */
    private AbstractC41371j f34762a;

    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public String mo49147a() {
        return "get_chat_avatar";
    }

    public C13081b(AbstractC41371j jVar) {
        this.f34762a = jVar;
    }

    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b
    /* renamed from: a */
    public void mo49148a(CrossProcessDataEntity crossProcessDataEntity, final AbstractC67727a aVar) {
        if (crossProcessDataEntity == null) {
            AppBrandLogger.m52830i("GADGET_SENG_MSG", "getchatavatar data is null");
            aVar.mo49530a(null);
            return;
        }
        this.f34762a.mo149003a(crossProcessDataEntity.mo234750g("chat_ids"), new AbstractC13322k.AbstractC13323a() {
            /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13081b.C130821 */

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13322k.AbstractC13323a
            /* renamed from: a */
            public void mo49149a(List<String> list, List<String> list2) {
                aVar.mo49530a(CrossProcessDataEntity.C67574a.m263013a().mo234762a("chat_avatar_urls", list).mo234762a("chat_names", list2).mo234763b());
            }
        });
    }
}
