package pl.droidsonroids.relinker.p3532a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import pl.droidsonroids.relinker.p3532a.AbstractC70173c;

/* renamed from: pl.droidsonroids.relinker.a.b */
public class C70172b extends AbstractC70173c.AbstractC70174a {
    public C70172b(C70180f fVar, AbstractC70173c.AbstractC70175b bVar, long j, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f175290a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + ((long) (i * 16));
        this.f175288a = fVar.mo247331b(allocate, j2);
        this.f175289b = fVar.mo247331b(allocate, j2 + 8);
    }
}
