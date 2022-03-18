package pl.droidsonroids.relinker.p3532a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import pl.droidsonroids.relinker.p3532a.AbstractC70173c;

/* renamed from: pl.droidsonroids.relinker.a.g */
public class C70181g extends AbstractC70173c.AbstractC70176c {
    public C70181g(C70180f fVar, AbstractC70173c.AbstractC70175b bVar, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f175290a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = bVar.f175292c + (j * ((long) bVar.f175294e));
        this.f175299a = fVar.mo247333c(allocate, j2);
        this.f175300b = fVar.mo247333c(allocate, 4 + j2);
        this.f175301c = fVar.mo247333c(allocate, 8 + j2);
        this.f175302d = fVar.mo247333c(allocate, j2 + 20);
    }
}
