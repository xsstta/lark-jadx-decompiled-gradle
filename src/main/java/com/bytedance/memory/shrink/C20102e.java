package com.bytedance.memory.shrink;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.memory.shrink.e */
public class C20102e {

    /* renamed from: a */
    private final InputStream f49077a;

    /* renamed from: b */
    private int f49078b;

    /* renamed from: a */
    private int m73347a() throws IOException {
        int read = this.f49077a.read();
        BaseType type = BaseType.getType(read);
        if (type != null) {
            int size = type.getSize(this.f49078b);
            C20106h.m73409b(this.f49077a, (long) size);
            return size + 1;
        }
        throw new IllegalStateException("failure to skip type, cannot find type def of typeid: " + read);
    }

    public C20102e(InputStream inputStream) {
        this.f49077a = inputStream;
    }

    /* renamed from: a */
    public void mo68199a(C20103f fVar) throws IOException {
        m73355b(fVar);
        m73358c(fVar);
        fVar.mo68201a();
    }

    /* renamed from: a */
    private int m73349a(C20100c cVar) throws IOException {
        cVar.mo68183a(C20106h.m73412c(this.f49077a), C20106h.m73398a(this.f49077a, this.f49078b));
        return this.f49078b + 4;
    }

    /* renamed from: b */
    private int m73352b(C20100c cVar) throws IOException {
        cVar.mo68186a(C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73412c(this.f49077a), C20106h.m73412c(this.f49077a));
        return this.f49078b + 4 + 4;
    }

    /* renamed from: c */
    private int m73356c(C20100c cVar) throws IOException {
        cVar.mo68192b(C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73412c(this.f49077a), C20106h.m73412c(this.f49077a));
        return this.f49078b + 4 + 4;
    }

    /* renamed from: d */
    private int m73359d(C20100c cVar) throws IOException {
        cVar.mo68185a(C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73412c(this.f49077a));
        return this.f49078b + 4;
    }

    /* renamed from: e */
    private int m73361e(C20100c cVar) throws IOException {
        cVar.mo68191b(C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73412c(this.f49077a));
        return this.f49078b + 4;
    }

    /* renamed from: f */
    private int m73362f(C20100c cVar) throws IOException {
        cVar.mo68193c(C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73412c(this.f49077a), C20106h.m73412c(this.f49077a));
        return this.f49078b + 4 + 4;
    }

    /* renamed from: j */
    private int m73366j(C20100c cVar) throws IOException {
        cVar.mo68194d(C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73412c(this.f49077a), C20106h.m73412c(this.f49077a));
        return this.f49078b + 4 + 4;
    }

    /* renamed from: h */
    private int m73364h(C20100c cVar) throws IOException {
        C20101d a = C20106h.m73398a(this.f49077a, this.f49078b);
        int c = C20106h.m73412c(this.f49077a);
        C20101d a2 = C20106h.m73398a(this.f49077a, this.f49078b);
        int c2 = C20106h.m73412c(this.f49077a);
        byte[] bArr = new byte[c2];
        C20106h.m73402a(this.f49077a, bArr, 0, (long) c2);
        cVar.mo68189a(a, c, a2, bArr);
        int i = this.f49078b;
        return i + 4 + i + 4 + c2;
    }

    /* renamed from: i */
    private int m73365i(C20100c cVar) throws IOException {
        C20101d a = C20106h.m73398a(this.f49077a, this.f49078b);
        int c = C20106h.m73412c(this.f49077a);
        int c2 = C20106h.m73412c(this.f49077a);
        C20101d a2 = C20106h.m73398a(this.f49077a, this.f49078b);
        int i = this.f49078b * c2;
        byte[] bArr = new byte[i];
        C20106h.m73402a(this.f49077a, bArr, 0, (long) i);
        cVar.mo68187a(a, c, c2, a2, bArr);
        int i2 = this.f49078b;
        return i2 + 4 + 4 + i2 + i;
    }

    /* renamed from: c */
    private void m73358c(C20103f fVar) throws IOException {
        while (true) {
            try {
                int read = this.f49077a.read();
                int c = C20106h.m73412c(this.f49077a);
                long c2 = 4294967295L & ((long) C20106h.m73412c(this.f49077a));
                if (read == 1) {
                    m73351a(c, c2, fVar);
                } else if (read == 2) {
                    m73354b(c, c2, fVar);
                } else if (read == 4) {
                    m73357c(c, c2, fVar);
                } else if (read == 5) {
                    m73360d(c, c2, fVar);
                } else if (read == 12 || read == 28) {
                    m73350a(read, c, c2, fVar);
                } else {
                    m73353b(read, c, c2, fVar);
                }
            } catch (EOFException unused) {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m73355b(C20103f fVar) throws IOException {
        String d = C20106h.m73413d(this.f49077a);
        int c = C20106h.m73412c(this.f49077a);
        if (c <= 0 || c >= 1073741823) {
            throw new IOException("bad idSize: " + c);
        }
        long b = C20106h.m73408b(this.f49077a);
        this.f49078b = c;
        fVar.mo68207a(d, c, b);
    }

    /* renamed from: g */
    private int m73363g(C20100c cVar) throws IOException {
        C20101d a = C20106h.m73398a(this.f49077a, this.f49078b);
        int c = C20106h.m73412c(this.f49077a);
        C20101d a2 = C20106h.m73398a(this.f49077a, this.f49078b);
        C20101d a3 = C20106h.m73398a(this.f49077a, this.f49078b);
        C20106h.m73409b(this.f49077a, (long) (this.f49078b << 2));
        int c2 = C20106h.m73412c(this.f49077a);
        short a4 = C20106h.m73401a(this.f49077a);
        int i = (this.f49078b * 7) + 4 + 4 + 2;
        for (int i2 = 0; i2 < a4; i2++) {
            C20106h.m73409b(this.f49077a, 2);
            i += m73347a() + 2;
        }
        int a5 = C20106h.m73401a(this.f49077a);
        C20099b[] bVarArr = new C20099b[a5];
        int i3 = i + 2;
        for (int i4 = 0; i4 < a5; i4++) {
            C20101d a6 = C20106h.m73398a(this.f49077a, this.f49078b);
            int read = this.f49077a.read();
            BaseType type = BaseType.getType(read);
            if (type != null) {
                bVarArr[i4] = new C20099b(read, a6, C20106h.m73399a(this.f49077a, type, this.f49078b));
                int i5 = this.f49078b;
                i3 += i5 + 1 + type.getSize(i5);
            } else {
                throw new IllegalStateException("accept class failed, lost type def of typeId: " + read);
            }
        }
        int a7 = C20106h.m73401a(this.f49077a);
        C20099b[] bVarArr2 = new C20099b[a7];
        int i6 = i3 + 2;
        for (int i7 = 0; i7 < a7; i7++) {
            bVarArr2[i7] = new C20099b(this.f49077a.read(), C20106h.m73398a(this.f49077a, this.f49078b), null);
            i6 += this.f49078b + 1;
        }
        cVar.mo68188a(a, c, a2, a3, c2, bVarArr, bVarArr2);
        return i6;
    }

    /* renamed from: a */
    private int m73348a(int i, C20100c cVar) throws IOException {
        C20101d a = C20106h.m73398a(this.f49077a, this.f49078b);
        int c = C20106h.m73412c(this.f49077a);
        int c2 = C20106h.m73412c(this.f49077a);
        int read = this.f49077a.read();
        BaseType type = BaseType.getType(read);
        if (type != null) {
            int size = type.getSize(this.f49078b) * c2;
            byte[] bArr = new byte[size];
            C20106h.m73402a(this.f49077a, bArr, 0, (long) size);
            cVar.mo68184a(i, a, c, c2, read, bArr);
            return this.f49078b + 4 + 4 + 1 + size;
        }
        throw new IllegalStateException("accept primitive array failed, lost type def of typeId: " + read);
    }

    /* renamed from: c */
    private void m73357c(int i, long j, C20103f fVar) throws IOException {
        fVar.mo68205a(C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73412c(this.f49077a), C20106h.m73412c(this.f49077a), i, j);
    }

    /* renamed from: d */
    private void m73360d(int i, long j, C20103f fVar) throws IOException {
        int c = C20106h.m73412c(this.f49077a);
        int c2 = C20106h.m73412c(this.f49077a);
        int c3 = C20106h.m73412c(this.f49077a);
        C20101d[] dVarArr = new C20101d[c3];
        for (int i2 = 0; i2 < c3; i2++) {
            dVarArr[i2] = C20106h.m73398a(this.f49077a, this.f49078b);
        }
        fVar.mo68203a(c, c2, dVarArr, i, j);
    }

    /* renamed from: b */
    private void m73354b(int i, long j, C20103f fVar) throws IOException {
        fVar.mo68204a(C20106h.m73412c(this.f49077a), C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73412c(this.f49077a), C20106h.m73398a(this.f49077a, this.f49078b), i, j);
    }

    /* renamed from: a */
    private void m73351a(int i, long j, C20103f fVar) throws IOException {
        fVar.mo68206a(C20106h.m73398a(this.f49077a, this.f49078b), C20106h.m73400a(this.f49077a, j - ((long) this.f49078b)), i, j);
    }

    /* renamed from: b */
    private void m73353b(int i, int i2, long j, C20103f fVar) throws IOException {
        byte[] bArr = new byte[((int) j)];
        C20106h.m73402a(this.f49077a, bArr, 0, j);
        fVar.mo68202a(i, i2, j, bArr);
    }

    /* renamed from: a */
    private void m73350a(int i, int i2, long j, C20103f fVar) throws IOException {
        int i3;
        C20100c a = fVar.mo68200a(i, i2, j);
        if (a == null) {
            C20106h.m73409b(this.f49077a, j);
            return;
        }
        while (j > 0) {
            int read = this.f49077a.read();
            long j2 = j - 1;
            if (read == 144) {
                a.mo68190b(read, C20106h.m73398a(this.f49077a, this.f49078b));
                i3 = this.f49078b;
            } else if (read == 195) {
                i3 = m73348a(read, a);
            } else if (read == 254) {
                i3 = m73349a(a);
            } else if (read != 255) {
                switch (read) {
                    case 1:
                        a.mo68190b(read, C20106h.m73398a(this.f49077a, this.f49078b));
                        C20106h.m73409b(this.f49077a, (long) this.f49078b);
                        i3 = this.f49078b << 1;
                        continue;
                    case 2:
                        i3 = m73352b(a);
                        continue;
                    case 3:
                        i3 = m73356c(a);
                        continue;
                    case 4:
                        i3 = m73359d(a);
                        continue;
                    case 5:
                        a.mo68190b(read, C20106h.m73398a(this.f49077a, this.f49078b));
                        i3 = this.f49078b;
                        continue;
                    case 6:
                        i3 = m73361e(a);
                        continue;
                    case 7:
                        a.mo68190b(read, C20106h.m73398a(this.f49077a, this.f49078b));
                        i3 = this.f49078b;
                        continue;
                    case 8:
                        i3 = m73362f(a);
                        continue;
                    default:
                        switch (read) {
                            case 32:
                                i3 = m73363g(a);
                                continue;
                            case 33:
                                i3 = m73364h(a);
                                continue;
                            case 34:
                                i3 = m73365i(a);
                                continue;
                            case 35:
                                i3 = m73348a(read, a);
                                continue;
                            default:
                                switch (read) {
                                    case 137:
                                        a.mo68190b(read, C20106h.m73398a(this.f49077a, this.f49078b));
                                        i3 = this.f49078b;
                                        continue;
                                    case 138:
                                        a.mo68190b(read, C20106h.m73398a(this.f49077a, this.f49078b));
                                        i3 = this.f49078b;
                                        continue;
                                    case 139:
                                        a.mo68190b(read, C20106h.m73398a(this.f49077a, this.f49078b));
                                        i3 = this.f49078b;
                                        continue;
                                    case 140:
                                        a.mo68190b(read, C20106h.m73398a(this.f49077a, this.f49078b));
                                        i3 = this.f49078b;
                                        continue;
                                    case SmActions.ACTION_IDLE_ENTRY /*{ENCODED_INT: 141}*/:
                                        a.mo68190b(read, C20106h.m73398a(this.f49077a, this.f49078b));
                                        i3 = this.f49078b;
                                        continue;
                                    case 142:
                                        i3 = m73366j(a);
                                        continue;
                                        continue;
                                        continue;
                                    default:
                                        throw new IllegalArgumentException("acceptHeapDumpRecord loop with unknown tag " + read + " with " + this.f49077a.available() + " bytes possibly remaining");
                                }
                        }
                }
            } else {
                a.mo68190b(read, C20106h.m73398a(this.f49077a, this.f49078b));
                i3 = this.f49078b;
            }
            j = j2 - ((long) i3);
        }
        a.mo68182a();
    }
}
