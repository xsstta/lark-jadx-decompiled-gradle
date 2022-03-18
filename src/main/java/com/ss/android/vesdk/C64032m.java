package com.ss.android.vesdk;

import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.p3191e.AbstractC63981b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.m */
public class C64032m implements AbstractC63981b {

    /* renamed from: a */
    public final TEInterface f161677a;

    /* renamed from: b */
    public Map<Integer, Boolean> f161678b = new HashMap();

    /* renamed from: c */
    private final VEEditor f161679c;

    public C64032m(VEEditor vEEditor) {
        this.f161679c = vEEditor;
        this.f161677a = vEEditor.mo220704c();
    }
}
