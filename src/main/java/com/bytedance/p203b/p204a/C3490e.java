package com.bytedance.p203b.p204a;

import com.bytedance.p203b.p204a.AbstractC3484c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.b.a.e */
public class C3490e extends AbstractC3484c.AbstractC3486b {

    /* renamed from: j */
    private final C3491f f11033j;

    @Override // com.bytedance.p203b.p204a.AbstractC3484c.AbstractC3486b
    /* renamed from: a */
    public AbstractC3484c.AbstractC3487c mo13929a(long j) throws IOException {
        return new C3493h(this.f11033j, this, j);
    }

    @Override // com.bytedance.p203b.p204a.AbstractC3484c.AbstractC3486b
    /* renamed from: a */
    public AbstractC3484c.AbstractC3488d mo13930a(int i) throws IOException {
        return new C3495j(this.f11033j, this, i);
    }

    @Override // com.bytedance.p203b.p204a.AbstractC3484c.AbstractC3486b
    /* renamed from: a */
    public AbstractC3484c.AbstractC3485a mo13928a(long j, int i) throws IOException {
        return new C3483b(this.f11033j, this, j, i);
    }

    public C3490e(boolean z, C3491f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f11018a = z;
        this.f11033j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f11019b = fVar.mo13938d(allocate, 16);
        this.f11020c = fVar.mo13934b(allocate, 32);
        this.f11021d = fVar.mo13934b(allocate, 40);
        this.f11022e = fVar.mo13938d(allocate, 54);
        this.f11023f = fVar.mo13938d(allocate, 56);
        this.f11024g = fVar.mo13938d(allocate, 58);
        this.f11025h = fVar.mo13938d(allocate, 60);
        this.f11026i = fVar.mo13938d(allocate, 62);
    }
}
