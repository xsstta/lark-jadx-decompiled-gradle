package com.lynx.jsbridge;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.core.JSProxy;

/* renamed from: com.lynx.jsbridge.b */
public class C26507b {

    /* renamed from: a */
    private final String f65545a;

    /* renamed from: b */
    private final JSProxy f65546b;

    public C26507b(String str, JSProxy jSProxy) {
        this.f65545a = str;
        this.f65546b = jSProxy;
    }

    /* renamed from: a */
    public void mo93988a(String str, JavaOnlyArray javaOnlyArray) {
        if (javaOnlyArray == null) {
            javaOnlyArray = new JavaOnlyArray();
        }
        this.f65546b.mo95663a(this.f65545a, str, javaOnlyArray);
    }
}
