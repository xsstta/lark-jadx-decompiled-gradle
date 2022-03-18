package pl.droidsonroids.relinker.p3532a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import pl.droidsonroids.relinker.p3532a.AbstractC70173c;

/* renamed from: pl.droidsonroids.relinker.a.a */
public class C70171a extends AbstractC70173c.AbstractC70174a {
    public C70171a(C70180f fVar, AbstractC70173c.AbstractC70175b bVar, long j, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f175290a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + ((long) (i * 8));
        this.f175288a = fVar.mo247333c(allocate, j2);
        this.f175289b = fVar.mo247333c(allocate, j2 + 4);
    }
}
