package com.bytedance.p203b.p204a;

import com.bytedance.p203b.p204a.AbstractC3484c;
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

/* renamed from: com.bytedance.b.a.f */
public class C3491f implements AbstractC3484c, Closeable {

    /* renamed from: a */
    private final int f11034a = 1179403647;

    /* renamed from: b */
    private final FileChannel f11035b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11035b.close();
    }

    /* renamed from: a */
    public AbstractC3484c.AbstractC3486b mo13931a() throws IOException {
        boolean z;
        this.f11035b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (mo13936c(allocate, 0) == 1179403647) {
            short e = mo13939e(allocate, 4);
            if (mo13939e(allocate, 5) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (e == 1) {
                return new C3489d(z, this);
            }
            if (e == 2) {
                return new C3490e(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    /* renamed from: b */
    public List<String> mo13935b() throws IOException {
        ByteOrder byteOrder;
        long j;
        this.f11035b.position(0L);
        ArrayList arrayList = new ArrayList();
        AbstractC3484c.AbstractC3486b a = mo13931a();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (a.f11018a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = (long) a.f11023f;
        int i = 0;
        if (j2 == 65535) {
            j2 = a.mo13930a(0).f11031a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            AbstractC3484c.AbstractC3487c a2 = a.mo13929a(j3);
            if (a2.f11027a == 2) {
                j = a2.f11028b;
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
            AbstractC3484c.AbstractC3485a a3 = a.mo13928a(j, i);
            if (a3.f11016a == 1) {
                arrayList2.add(Long.valueOf(a3.f11017b));
            } else if (a3.f11016a == 5) {
                j4 = a3.f11017b;
            }
            i++;
            if (a3.f11016a == 0) {
                break;
            }
            j = j;
        }
        if (j4 != 0) {
            long a4 = m14729a(a, j2, j4);
            for (Long l : arrayList2) {
                arrayList.add(mo13932a(allocate, l.longValue() + a4));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public C3491f(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f11035b = new FileInputStream(file).getChannel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo13934b(ByteBuffer byteBuffer, long j) throws IOException {
        mo13933a(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo13936c(ByteBuffer byteBuffer, long j) throws IOException {
        mo13933a(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo13938d(ByteBuffer byteBuffer, long j) throws IOException {
        mo13933a(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public short mo13939e(ByteBuffer byteBuffer, long j) throws IOException {
        mo13933a(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13932a(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e = mo13939e(byteBuffer, j);
            if (e == 0) {
                return sb.toString();
            }
            sb.append((char) e);
            j = j2;
        }
    }

    /* renamed from: a */
    private long m14729a(AbstractC3484c.AbstractC3486b bVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            AbstractC3484c.AbstractC3487c a = bVar.mo13929a(j3);
            if (a.f11027a == 1 && a.f11029c <= j2 && j2 <= a.f11029c + a.f11030d) {
                return (j2 - a.f11029c) + a.f11028b;
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13933a(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f11035b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
