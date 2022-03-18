package com.bytedance.p203b.p204a;

import com.bytedance.p203b.p204a.AbstractC3484c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.b.a.d */
public class C3489d extends AbstractC3484c.AbstractC3486b {

    /* renamed from: j */
    private final C3491f f11032j;

    @Override // com.bytedance.p203b.p204a.AbstractC3484c.AbstractC3486b
    /* renamed from: a */
    public AbstractC3484c.AbstractC3487c mo13929a(long j) throws IOException {
        return new C3492g(this.f11032j, this, j);
    }

    @Override // com.bytedance.p203b.p204a.AbstractC3484c.AbstractC3486b
    /* renamed from: a */
    public AbstractC3484c.AbstractC3488d mo13930a(int i) throws IOException {
        return new C3494i(this.f11032j, this, i);
    }

    @Override // com.bytedance.p203b.p204a.AbstractC3484c.AbstractC3486b
    /* renamed from: a */
    public AbstractC3484c.AbstractC3485a mo13928a(long j, int i) throws IOException {
        return new C3482a(this.f11032j, this, j, i);
    }

    public C3489d(boolean z, C3491f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f11018a = z;
        this.f11032j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f11019b = fVar.mo13938d(allocate, 16);
        this.f11020c = fVar.mo13936c(allocate, 28);
        this.f11021d = fVar.mo13936c(allocate, 32);
        this.f11022e = fVar.mo13938d(allocate, 42);
        this.f11023f = fVar.mo13938d(allocate, 44);
        this.f11024g = fVar.mo13938d(allocate, 46);
        this.f11025h = fVar.mo13938d(allocate, 48);
        this.f11026i = fVar.mo13938d(allocate, 50);
    }
}
