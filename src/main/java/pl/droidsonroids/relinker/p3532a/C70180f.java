package pl.droidsonroids.relinker.p3532a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pl.droidsonroids.relinker.p3532a.AbstractC70173c;

/* renamed from: pl.droidsonroids.relinker.a.f */
public class C70180f implements Closeable, AbstractC70173c {

    /* renamed from: a */
    private final int f175306a = 1179403647;

    /* renamed from: b */
    private final FileChannel f175307b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f175307b.close();
    }

    /* renamed from: a */
    public AbstractC70173c.AbstractC70175b mo247329a() throws IOException {
        boolean z;
        this.f175307b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (mo247333c(allocate, 0) == 1179403647) {
            short e = mo247336e(allocate, 4);
            if (mo247336e(allocate, 5) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (e == 1) {
                return new C70178d(z, this);
            }
            if (e == 2) {
                return new C70179e(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    /* renamed from: b */
    public List<String> mo247332b() throws IOException {
        ByteOrder byteOrder;
        long j;
        this.f175307b.position(0L);
        ArrayList arrayList = new ArrayList();
        AbstractC70173c.AbstractC70175b a = mo247329a();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (a.f175290a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = (long) a.f175295f;
        int i = 0;
        if (j2 == 65535) {
            j2 = a.mo247327a(0).f175303a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            AbstractC70173c.AbstractC70176c a2 = a.mo247326a(j3);
            if (a2.f175299a == 2) {
                j = a2.f175300b;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList();
        long j4 = 0;
        while (true) {
            AbstractC70173c.AbstractC70174a a3 = a.mo247325a(j, i);
            if (a3.f175288a == 1) {
                arrayList2.add(Long.valueOf(a3.f175289b));
            } else if (a3.f175288a == 5) {
                j4 = a3.f175289b;
            }
            i++;
            if (a3.f175288a == 0) {
                break;
            }
            j = j;
        }
        if (j4 != 0) {
            long a4 = m268975a(a, j2, j4);
            for (Long l : arrayList2) {
                arrayList.add(mo247328a(allocate, l.longValue() + a4));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public C70180f(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f175307b = new FileInputStream(file).getChannel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo247331b(ByteBuffer byteBuffer, long j) throws IOException {
        mo247330a(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo247333c(ByteBuffer byteBuffer, long j) throws IOException {
        mo247330a(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo247335d(ByteBuffer byteBuffer, long j) throws IOException {
        mo247330a(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public short mo247336e(ByteBuffer byteBuffer, long j) throws IOException {
        mo247330a(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo247328a(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e = mo247336e(byteBuffer, j);
            if (e == 0) {
                return sb.toString();
            }
            sb.append((char) e);
            j = j2;
        }
    }

    /* renamed from: a */
    private long m268975a(AbstractC70173c.AbstractC70175b bVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            AbstractC70173c.AbstractC70176c a = bVar.mo247326a(j3);
            if (a.f175299a == 1 && a.f175301c <= j2 && j2 <= a.f175301c + a.f175302d) {
                return (j2 - a.f175301c) + a.f175300b;
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo247330a(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f175307b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
