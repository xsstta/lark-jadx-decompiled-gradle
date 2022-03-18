package com.bytedance.p203b.p204a;

import com.bytedance.p203b.p204a.AbstractC3484c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.b.a.a */
public class C3482a extends AbstractC3484c.AbstractC3485a {
    public C3482a(C3491f fVar, AbstractC3484c.AbstractC3486b bVar, long j, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f11018a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + ((long) (i * 8));
        this.f11016a = fVar.mo13936c(allocate, j2);
        this.f11017b = fVar.mo13936c(allocate, j2 + 4);
    }
}
