package com.ss.android.ttvecamera.systemresmanager;

import android.content.Context;
import com.ss.android.ttvecamera.TEVBoostInterface;

/* renamed from: com.ss.android.ttvecamera.systemresmanager.b */
public class C60432b implements AbstractC60431a {
    @Override // com.ss.android.ttvecamera.systemresmanager.AbstractC60431a
    /* renamed from: a */
    public void mo206926a() {
        if (TEVBoostInterface.m234243a(TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN)) {
            TEVBoostInterface.m234244b(TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN);
        }
        if (TEVBoostInterface.m234243a(TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX)) {
            TEVBoostInterface.m234244b(TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX);
        }
    }

    @Override // com.ss.android.ttvecamera.systemresmanager.AbstractC60431a
    /* renamed from: a */
    public void mo206928a(Context context) {
        TEVBoostInterface.m234242a(context);
    }

    @Override // com.ss.android.ttvecamera.systemresmanager.AbstractC60431a
    /* renamed from: a */
    public void mo206927a(int i) {
        if (TEVBoostInterface.m234243a(TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN)) {
            TEVBoostInterface.m234241a(TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MIN, 9, (long) i);
        }
        if (TEVBoostInterface.m234243a(TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX)) {
            TEVBoostInterface.m234241a(TEVBoostInterface.VBoostCapabilityType.CPU_FREQ_MAX, 9, (long) i);
        }
    }
}
