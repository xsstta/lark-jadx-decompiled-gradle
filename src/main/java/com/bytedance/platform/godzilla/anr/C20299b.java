package com.bytedance.platform.godzilla.anr;

import android.app.Application;
import com.bytedance.platform.godzilla.anr.sp.C20308c;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;

/* renamed from: com.bytedance.platform.godzilla.anr.b */
public class C20299b extends AbstractC20329a {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "SpPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        super.mo68530a();
        C20308c.m74062a();
        Logger.m74095a(mo68532b(), "start");
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        super.mo68531a(application);
    }
}
