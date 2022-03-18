package com.bumptech.glide.load.resource.p090a;

import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.util.C2567j;

/* renamed from: com.bumptech.glide.load.resource.a.b */
public class C2399b implements AbstractC2383u<byte[]> {

    /* renamed from: a */
    private final byte[] f7942a;

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: f */
    public void mo10880f() {
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: e */
    public int mo10879e() {
        return this.f7942a.length;
    }

    /* renamed from: a */
    public byte[] mo10878d() {
        return this.f7942a;
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2383u
    /* renamed from: c */
    public Class<byte[]> mo10877c() {
        return byte[].class;
    }

    public C2399b(byte[] bArr) {
        this.f7942a = (byte[]) C2567j.m10894a(bArr);
    }
}
