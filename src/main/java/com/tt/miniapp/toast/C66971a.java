package com.tt.miniapp.toast;

import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;

/* renamed from: com.tt.miniapp.toast.a */
public class C66971a extends AbstractC67550j {
    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "hideToast";
    }

    public C66971a(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49104a(String str, AbstractC67550j.AbstractC67551a aVar) throws Exception {
        HostDependManager.getInst().hideToast();
        if (aVar != null) {
            aVar.onNativeModuleCall(null);
        }
        return null;
    }
}
