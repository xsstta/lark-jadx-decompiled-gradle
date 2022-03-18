package com.ss.android.vesdk;

import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.p3191e.AbstractC63983d;
import java.util.List;

/* renamed from: com.ss.android.vesdk.ac */
public class C63931ac implements AbstractC63983d {

    /* renamed from: a */
    public volatile VEListener.AbstractC63879v f161416a;

    /* renamed from: b */
    private final VEEditor f161417b;

    /* renamed from: c */
    private final TEInterface f161418c;

    /* renamed from: d */
    private List<Integer> f161419d;

    /* renamed from: e */
    private int f161420e = -1;

    /* renamed from: f */
    private boolean f161421f;

    /* renamed from: g */
    private int f161422g = -1;

    /* renamed from: h */
    private NativeCallbacks.AbstractC60240f f161423h = new NativeCallbacks.AbstractC60240f() {
        /* class com.ss.android.vesdk.C63931ac.C639321 */

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60240f
        /* renamed from: a */
        public void mo205734a() {
            if (C63931ac.this.f161416a != null) {
                C63931ac.this.f161416a.mo220859a();
            }
        }
    };

    @Override // com.ss.android.vesdk.p3191e.AbstractC63983d
    /* renamed from: a */
    public boolean mo221151a() {
        return this.f161421f;
    }

    @Override // com.ss.android.vesdk.p3191e.AbstractC63983d
    /* renamed from: a */
    public void mo221150a(int i) {
        List<Integer> list = this.f161419d;
        if (list != null) {
            list.add(Integer.valueOf(i));
        }
    }

    public C63931ac(VEEditor vEEditor) {
        this.f161417b = vEEditor;
        this.f161418c = vEEditor.mo220704c();
    }
}
