package com.bytedance.p203b.p204a;

import com.bytedance.p203b.p204a.AbstractC3484c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.b.a.j */
public class C3495j extends AbstractC3484c.AbstractC3488d {
    public C3495j(C3491f fVar, AbstractC3484c.AbstractC3486b bVar, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f11018a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f11031a = fVar.mo13936c(allocate, bVar.f11021d + ((long) (i * bVar.f11024g)) + 44);
    }
}
