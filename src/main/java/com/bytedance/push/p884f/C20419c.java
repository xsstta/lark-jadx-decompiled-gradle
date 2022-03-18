package com.bytedance.push.p884f;

import com.bytedance.push.C20386c;
import com.bytedance.push.interfaze.IMonitor;
import com.bytedance.push.p884f.p885a.AbstractC20415a;
import com.ss.android.ug.bus.C60442b;

/* renamed from: com.bytedance.push.f.c */
public class C20419c implements IMonitor {

    /* renamed from: a */
    private final C20386c f49904a;

    /* renamed from: b */
    private final AbstractC20415a f49905b = ((AbstractC20415a) C60442b.m234863a(AbstractC20415a.class));

    @Override // com.bytedance.push.interfaze.IMonitor
    public void markOuterSwitchUploadSuccess() {
        C20428h.m74403b();
    }

    @Override // com.bytedance.push.interfaze.IMonitor
    public void monitorStart() {
        C20416b.m74370a();
    }

    @Override // com.bytedance.push.interfaze.IMonitor
    public void init() {
        C20416b.m74374a(this.f49904a);
        AbstractC20415a aVar = this.f49905b;
        if (aVar != null) {
            aVar.mo68848b();
        }
    }

    @Override // com.bytedance.push.interfaze.IMonitor
    public void markUpdateSenderSuccess() {
        C20428h.m74395a();
        AbstractC20415a aVar = this.f49905b;
        if (aVar != null) {
            aVar.mo68847a(true, 0, null);
        }
    }

    @Override // com.bytedance.push.interfaze.IMonitor
    public void monitorRegisterSender(int i) {
        C20428h.m74396a(i);
        AbstractC20415a aVar = this.f49905b;
        if (aVar != null) {
            aVar.mo68844a(i);
        }
    }

    @Override // com.bytedance.push.interfaze.IMonitor
    public void monitorRegisterSenderSuccess(int i) {
        C20428h.m74404b(i);
        AbstractC20415a aVar = this.f49905b;
        if (aVar != null) {
            aVar.mo68846a(true, i, 0, null);
        }
    }

    public C20419c(C20386c cVar) {
        this.f49904a = cVar;
        C20424f.m74388a(cVar.f49799u);
    }

    @Override // com.bytedance.push.interfaze.IMonitor
    public void markOuterSwitchUploadFailed(int i, String str) {
        C20428h.m74405b(i, str);
    }

    @Override // com.bytedance.push.interfaze.IMonitor
    public void monitorSenderSupport(boolean z, String str) {
        C20428h.m74402a(z, str);
    }

    @Override // com.bytedance.push.interfaze.IMonitor
    public void markUpdateSenderFailed(int i, String str) {
        C20428h.m74398a(i, str);
        AbstractC20415a aVar = this.f49905b;
        if (aVar != null) {
            aVar.mo68847a(false, i, str);
        }
    }

    @Override // com.bytedance.push.interfaze.IMonitor
    public void monitorRegisterSenderFailed(int i, int i2, String str, String str2) {
        C20428h.m74397a(i, i2, str, str2);
        AbstractC20415a aVar = this.f49905b;
        if (aVar != null) {
            aVar.mo68846a(false, i, i2, str + ", " + str2);
        }
    }
}
