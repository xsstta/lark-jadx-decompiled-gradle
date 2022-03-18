package pl.droidsonroids.relinker.p3532a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import pl.droidsonroids.relinker.p3532a.AbstractC70173c;

/* renamed from: pl.droidsonroids.relinker.a.d */
public class C70178d extends AbstractC70173c.AbstractC70175b {

    /* renamed from: j */
    private final C70180f f175304j;

    @Override // pl.droidsonroids.relinker.p3532a.AbstractC70173c.AbstractC70175b
    /* renamed from: a */
    public AbstractC70173c.AbstractC70176c mo247326a(long j) throws IOException {
        return new C70181g(this.f175304j, this, j);
    }

    @Override // pl.droidsonroids.relinker.p3532a.AbstractC70173c.AbstractC70175b
    /* renamed from: a */
    public AbstractC70173c.AbstractC70177d mo247327a(int i) throws IOException {
        return new C70183i(this.f175304j, this, i);
    }

    @Override // pl.droidsonroids.relinker.p3532a.AbstractC70173c.AbstractC70175b
    /* renamed from: a */
    public AbstractC70173c.AbstractC70174a mo247325a(long j, int i) throws IOException {
        return new C70171a(this.f175304j, this, j, i);
    }

    public C70178d(boolean z, C70180f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f175290a = z;
        this.f175304j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f175291b = fVar.mo247335d(allocate, 16);
        this.f175292c = fVar.mo247333c(allocate, 28);
        this.f175293d = fVar.mo247333c(allocate, 32);
        this.f175294e = fVar.mo247335d(allocate, 42);
        this.f175295f = fVar.mo247335d(allocate, 44);
        this.f175296g = fVar.mo247335d(allocate, 46);
        this.f175297h = fVar.mo247335d(allocate, 48);
        this.f175298i = fVar.mo247335d(allocate, 50);
    }
}
