package com.bytedance.p203b.p204a;

import com.bytedance.p203b.p204a.AbstractC3484c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.b.a.g */
public class C3492g extends AbstractC3484c.AbstractC3487c {
    public C3492g(C3491f fVar, AbstractC3484c.AbstractC3486b bVar, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f11018a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = bVar.f11020c + (j * ((long) bVar.f11022e));
        this.f11027a = fVar.mo13936c(allocate, j2);
        this.f11028b = fVar.mo13936c(allocate, 4 + j2);
        this.f11029c = fVar.mo13936c(allocate, 8 + j2);
        this.f11030d = fVar.mo13936c(allocate, j2 + 20);
    }
}
