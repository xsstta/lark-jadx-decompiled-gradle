package com.bytedance.platform.godzilla.plugin;

import com.bytedance.platform.godzilla.GodzillaCore;
import com.bytedance.platform.godzilla.common.AbstractC20328h;
import com.bytedance.platform.godzilla.common.Logger;

/* renamed from: com.bytedance.platform.godzilla.plugin.c */
public abstract class AbstractC20331c extends AbstractC20329a implements AbstractC20328h {
    /* renamed from: c */
    public abstract boolean mo68569c();

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: d */
    public StartType mo68641d() {
        return StartType.REGISTER_EXCEPTION;
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        if (mo68569c()) {
            GodzillaCore.INSTANCE.addUncaughtExceptionConsumer(this);
            Logger.m74095a(mo68532b(), "start called.");
        }
    }
}
