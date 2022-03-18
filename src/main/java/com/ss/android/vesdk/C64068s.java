package com.ss.android.vesdk;

import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.p3191e.AbstractC63982c;
import com.ss.android.vesdk.runtime.C64066h;

/* renamed from: com.ss.android.vesdk.s */
public class C64068s implements AbstractC63982c {

    /* renamed from: a */
    private final VEEditor f161782a;

    /* renamed from: b */
    private final TEInterface f161783b;

    /* renamed from: c */
    private int f161784c = -1;

    /* renamed from: d */
    private int f161785d = -1;

    /* renamed from: e */
    private int f161786e = -1;

    /* renamed from: f */
    private int f161787f = -1;

    /* renamed from: g */
    private int f161788g = -1;

    /* renamed from: h */
    private int f161789h = -1;

    /* renamed from: i */
    private C64066h f161790i;

    @Override // com.ss.android.vesdk.p3191e.AbstractC63982c
    /* renamed from: a */
    public int mo221426a() {
        try {
            int j = this.f161782a.mo220713j();
            int[] addFilters = this.f161783b.addFilters(new int[]{0, 0, 0}, new String[]{"color filter", "effect hdr filter", "lens hdr filter"}, new int[]{0, 0, 0}, new int[]{j, j, j}, new int[]{0, 0, 0}, new int[]{7, 16, 33});
            this.f161784c = addFilters[0];
            this.f161786e = addFilters[1];
            this.f161787f = addFilters[2];
            this.f161782a.mo220695a(addFilters);
            return 0;
        } catch (NullPointerException unused) {
            throw new VEException(-1, "init failed: VESDK need to be init");
        }
    }

    @Override // com.ss.android.vesdk.p3191e.AbstractC63982c
    /* renamed from: a */
    public void mo221427a(int i) {
        this.f161789h = i;
    }

    public C64068s(VEEditor vEEditor) {
        this.f161782a = vEEditor;
        this.f161783b = vEEditor.mo220704c();
        this.f161790i = new C64066h();
    }
}
