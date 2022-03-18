package com.lynx.tasm.core;

import com.lynx.C26421a;
import com.lynx.tasm.AbstractC26861c;
import com.lynx.tasm.LynxEnv;

public class LynxRuntimeManager {
    private static long makeJSEngineRuntime() {
        AbstractC26861c p;
        if (!C26421a.f65259a.booleanValue() || (p = LynxEnv.m96123e().mo94111p()) == null) {
            return 0;
        }
        return p.mo95614b();
    }
}
