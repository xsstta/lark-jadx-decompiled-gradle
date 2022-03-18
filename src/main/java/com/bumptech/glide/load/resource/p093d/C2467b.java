package com.bumptech.glide.load.resource.p093d;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;

/* renamed from: com.bumptech.glide.load.resource.d.b */
public final class C2467b implements GifDecoder.AbstractC2130a {

    /* renamed from: a */
    private final AbstractC2283e f8050a;

    /* renamed from: b */
    private final AbstractC2278b f8051b;

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.AbstractC2130a
    /* renamed from: a */
    public void mo10457a(Bitmap bitmap) {
        this.f8050a.mo10693a(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.AbstractC2130a
    /* renamed from: b */
    public int[] mo10461b(int i) {
        AbstractC2278b bVar = this.f8051b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo10668a(i, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.AbstractC2130a
    /* renamed from: a */
    public void mo10458a(byte[] bArr) {
        AbstractC2278b bVar = this.f8051b;
        if (bVar != null) {
            bVar.mo10671a(bArr);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.AbstractC2130a
    /* renamed from: a */
    public void mo10459a(int[] iArr) {
        AbstractC2278b bVar = this.f8051b;
        if (bVar != null) {
            bVar.mo10671a(iArr);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.AbstractC2130a
    /* renamed from: a */
    public byte[] mo10460a(int i) {
        AbstractC2278b bVar = this.f8051b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo10668a(i, byte[].class);
    }

    public C2467b(AbstractC2283e eVar, AbstractC2278b bVar) {
        this.f8050a = eVar;
        this.f8051b = bVar;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.AbstractC2130a
    /* renamed from: a */
    public Bitmap mo10456a(int i, int i2, Bitmap.Config config) {
        return this.f8050a.mo10694b(i, i2, config);
    }
}
