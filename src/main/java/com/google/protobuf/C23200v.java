package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.protobuf.v */
public final class C23200v {

    /* renamed from: a */
    private static final C23200v f57222a = new C23200v(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f57223b;

    /* renamed from: c */
    private int[] f57224c;

    /* renamed from: d */
    private Object[] f57225d;

    /* renamed from: e */
    private int f57226e;

    /* renamed from: f */
    private boolean f57227f;

    /* renamed from: c */
    public void mo80467c() {
        this.f57227f = false;
    }

    /* renamed from: a */
    public static C23200v m83990a() {
        return f57222a;
    }

    /* renamed from: b */
    static C23200v m83994b() {
        return new C23200v();
    }

    private C23200v() {
        this(0, new int[8], new Object[8], true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo80468d() {
        if (!this.f57227f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private void m83995f() {
        int i;
        int i2 = this.f57223b;
        int[] iArr = this.f57224c;
        if (i2 == iArr.length) {
            if (i2 < 4) {
                i = 8;
            } else {
                i = i2 >> 1;
            }
            int i3 = i2 + i;
            this.f57224c = Arrays.copyOf(iArr, i3);
            this.f57225d = Arrays.copyOf(this.f57225d, i3);
        }
    }

    public int hashCode() {
        return ((((527 + this.f57223b) * 31) + Arrays.hashCode(this.f57224c)) * 31) + Arrays.deepHashCode(this.f57225d);
    }

    /* renamed from: e */
    public int mo80469e() {
        int i;
        int i2 = this.f57226e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f57223b; i4++) {
            int i5 = this.f57224c[i4];
            int b = WireFormat.m83737b(i5);
            int a = WireFormat.m83735a(i5);
            if (a == 0) {
                i = CodedOutputStream.m83539e(b, ((Long) this.f57225d[i4]).longValue());
            } else if (a == 1) {
                i = CodedOutputStream.m83542f(b, ((Long) this.f57225d[i4]).longValue());
            } else if (a == 2) {
                i = CodedOutputStream.m83528b(b, (ByteString) this.f57225d[i4]);
            } else if (a == 3) {
                i = (CodedOutputStream.m83527b(b) * 2) + ((C23200v) this.f57225d[i4]).mo80469e();
            } else if (a == 5) {
                i = CodedOutputStream.m83538e(b, ((Integer) this.f57225d[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
            }
            i3 += i;
        }
        this.f57226e = i3;
        return i3;
    }

    /* renamed from: a */
    private C23200v m83991a(C23108e eVar) throws IOException {
        int a;
        do {
            a = eVar.mo80251a();
            if (a == 0) {
                break;
            }
        } while (mo80466a(a, eVar));
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23200v)) {
            return false;
        }
        C23200v vVar = (C23200v) obj;
        if (this.f57223b != vVar.f57223b || !Arrays.equals(this.f57224c, vVar.f57224c) || !Arrays.deepEquals(this.f57225d, vVar.f57225d)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo80464a(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f57223b; i++) {
            int i2 = this.f57224c[i];
            int b = WireFormat.m83737b(i2);
            int a = WireFormat.m83735a(i2);
            if (a == 0) {
                codedOutputStream.mo80053b(b, ((Long) this.f57225d[i]).longValue());
            } else if (a == 1) {
                codedOutputStream.mo80055c(b, ((Long) this.f57225d[i]).longValue());
            } else if (a == 2) {
                codedOutputStream.mo80046a(b, (ByteString) this.f57225d[i]);
            } else if (a == 3) {
                codedOutputStream.mo80044a(b, 3);
                ((C23200v) this.f57225d[i]).mo80464a(codedOutputStream);
                codedOutputStream.mo80044a(b, 4);
            } else if (a == 5) {
                codedOutputStream.mo80054c(b, ((Integer) this.f57225d[i]).intValue());
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: a */
    private void m83993a(int i, Object obj) {
        m83995f();
        int[] iArr = this.f57224c;
        int i2 = this.f57223b;
        iArr[i2] = i;
        this.f57225d[i2] = obj;
        this.f57223b = i2 + 1;
    }

    /* renamed from: a */
    static C23200v m83992a(C23200v vVar, C23200v vVar2) {
        int i = vVar.f57223b + vVar2.f57223b;
        int[] copyOf = Arrays.copyOf(vVar.f57224c, i);
        System.arraycopy(vVar2.f57224c, 0, copyOf, vVar.f57223b, vVar2.f57223b);
        Object[] copyOf2 = Arrays.copyOf(vVar.f57225d, i);
        System.arraycopy(vVar2.f57225d, 0, copyOf2, vVar.f57223b, vVar2.f57223b);
        return new C23200v(i, copyOf, copyOf2, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C23200v mo80463a(int i, int i2) {
        mo80468d();
        if (i != 0) {
            m83993a(WireFormat.m83736a(i, 0), Long.valueOf((long) i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80465a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f57223b; i2++) {
            C23128o.m83837a(sb, i, String.valueOf(WireFormat.m83737b(this.f57224c[i2])), this.f57225d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo80466a(int i, C23108e eVar) throws IOException {
        mo80468d();
        int b = WireFormat.m83737b(i);
        int a = WireFormat.m83735a(i);
        if (a == 0) {
            m83993a(i, Long.valueOf(eVar.mo80255b()));
            return true;
        } else if (a == 1) {
            m83993a(i, Long.valueOf(eVar.mo80256c()));
            return true;
        } else if (a == 2) {
            m83993a(i, eVar.mo80261f());
            return true;
        } else if (a == 3) {
            C23200v vVar = new C23200v();
            vVar.m83991a(eVar);
            eVar.mo80253a(WireFormat.m83736a(b, 4));
            m83993a(i, vVar);
            return true;
        } else if (a == 4) {
            return false;
        } else {
            if (a == 5) {
                m83993a(i, Integer.valueOf(eVar.mo80258d()));
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private C23200v(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f57226e = -1;
        this.f57223b = i;
        this.f57224c = iArr;
        this.f57225d = objArr;
        this.f57227f = z;
    }
}
