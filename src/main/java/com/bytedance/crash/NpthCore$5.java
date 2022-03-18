package com.bytedance.crash;

import com.bytedance.crash.util.NativeTools;
import com.bytedance.services.apm.api.IFdCheck;
import java.util.List;

/* access modifiers changed from: package-private */
public class NpthCore$5 implements IFdCheck {
    NpthCore$5() {
    }

    @Override // com.bytedance.services.apm.api.IFdCheck
    public List<String> getFdList() {
        return NativeTools.m16236b().mo15615f();
    }
}
