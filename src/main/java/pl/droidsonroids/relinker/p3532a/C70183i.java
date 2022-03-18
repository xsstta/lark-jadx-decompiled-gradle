package pl.droidsonroids.relinker.p3532a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import pl.droidsonroids.relinker.p3532a.AbstractC70173c;

/* renamed from: pl.droidsonroids.relinker.a.i */
public class C70183i extends AbstractC70173c.AbstractC70177d {
    public C70183i(C70180f fVar, AbstractC70173c.AbstractC70175b bVar, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f175290a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f175303a = fVar.mo247333c(allocate, bVar.f175293d + ((long) (i * bVar.f175296g)) + 28);
    }
}
