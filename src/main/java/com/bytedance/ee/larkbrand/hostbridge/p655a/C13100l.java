package com.bytedance.ee.larkbrand.hostbridge.p655a;

import android.text.TextUtils;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13307d;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67570a;
import com.tt.miniapphost.process.p3379e.C67577a;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.l */
public class C13100l implements AbstractC67570a {
    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public String mo49145a() {
        return "lark_upload_image";
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public void mo49146a(CrossProcessDataEntity crossProcessDataEntity, final C67577a aVar) {
        if (crossProcessDataEntity == null) {
            mo49161a((String) null, aVar);
        } else {
            LarkExtensionManager.getInstance().getExtension().mo49564a(crossProcessDataEntity.mo234744b("upload_image_path"), new AbstractC13307d.AbstractC13308a() {
                /* class com.bytedance.ee.larkbrand.hostbridge.p655a.C13100l.C131011 */

                @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13307d.AbstractC13308a
                /* renamed from: a */
                public void mo49162a() {
                    C13100l.this.mo49161a((String) null, aVar);
                }

                @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13307d.AbstractC13308a
                /* renamed from: a */
                public void mo49163a(String str) {
                    C13100l.this.mo49161a(str, aVar);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo49161a(String str, C67577a aVar) {
        if (TextUtils.isEmpty(str)) {
            aVar.mo234768a(null, true);
        } else {
            aVar.mo234767a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("lark_upload_image_result", (Object) str).mo234763b());
        }
    }
}
