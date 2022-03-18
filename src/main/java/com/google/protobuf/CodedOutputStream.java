package com.google.protobuf;

import com.google.protobuf.C23203x;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends AbstractC23107d {

    /* renamed from: a */
    public static final boolean f56903a = C23201w.m84007a();

    /* renamed from: b */
    public static final long f56904b = C23201w.m84010c();

    /* renamed from: c */
    private static final Logger f56905c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: b */
    public static int m83531b(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: c */
    public static int m83534c(long j) {
        return 8;
    }

    /* renamed from: d */
    public static int m83535d(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: e */
    public static int m83537e(int i) {
        return 4;
    }

    /* renamed from: a */
    public abstract int mo80042a();

    /* renamed from: a */
    public abstract void mo80043a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo80044a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo80046a(int i, ByteString byteString) throws IOException;

    /* renamed from: a */
    public abstract void mo80047a(int i, AbstractC23125m mVar) throws IOException;

    /* renamed from: a */
    public abstract void mo80048a(int i, String str) throws IOException;

    @Override // com.google.protobuf.AbstractC23107d
    /* renamed from: a */
    public abstract void mo80050a(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: b */
    public abstract void mo80052b(int i, int i2) throws IOException;

    /* renamed from: b */
    public abstract void mo80053b(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo80054c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo80055c(int i, long j) throws IOException;

    private CodedOutputStream() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80049a(String str, C23203x.C23206c cVar) throws IOException {
        f56905c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cVar);
        byte[] bytes = str.getBytes(C23115i.f57061a);
        try {
            mo80043a(bytes.length);
            mo80050a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.CodedOutputStream$a */
    public static class C23042a extends CodedOutputStream {

        /* renamed from: c */
        private final byte[] f56906c;

        /* renamed from: d */
        private final int f56907d;

        /* renamed from: e */
        private final int f56908e;

        /* renamed from: f */
        private int f56909f;

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: a */
        public final int mo80042a() {
            return this.f56908e - this.f56909f;
        }

        /* renamed from: h */
        public final void mo80063h(int i) throws IOException {
            if (i >= 0) {
                mo80043a(i);
            } else {
                mo80061d((long) i);
            }
        }

        /* renamed from: b */
        public final void mo80057b(ByteString byteString) throws IOException {
            mo80043a(byteString.size());
            byteString.writeTo(this);
        }

        /* renamed from: b */
        public final void mo80058b(AbstractC23125m mVar) throws IOException {
            mo80043a(mVar.mo80296n());
            mVar.mo80295a(this);
        }

        /* renamed from: b */
        public final void mo80059b(String str) throws IOException {
            int i = this.f56909f;
            try {
                int d = m83535d(str.length() * 3);
                int d2 = m83535d(str.length());
                if (d2 == d) {
                    int i2 = i + d2;
                    this.f56909f = i2;
                    int a = C23203x.m84022a(str, this.f56906c, i2, mo80042a());
                    this.f56909f = i;
                    mo80043a((a - i) - d2);
                    this.f56909f = a;
                    return;
                }
                mo80043a(C23203x.m84020a(str));
                this.f56909f = C23203x.m84022a(str, this.f56906c, this.f56909f, mo80042a());
            } catch (C23203x.C23206c e) {
                this.f56909f = i;
                mo80049a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        /* renamed from: i */
        public final void mo80064i(int i) throws IOException {
            try {
                byte[] bArr = this.f56906c;
                int i2 = this.f56909f;
                int i3 = i2 + 1;
                this.f56909f = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                this.f56909f = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                this.f56909f = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f56909f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56909f), Integer.valueOf(this.f56908e), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: a */
        public final void mo80043a(int i) throws IOException {
            if (!CodedOutputStream.f56903a || mo80042a() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f56906c;
                    int i2 = this.f56909f;
                    this.f56909f = i2 + 1;
                    bArr[i2] = (byte) ((i & SmActions.ACTION_ONTHECALL_ENTRY) | SmActions.ACTION_ONTHECALL_EXIT);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f56906c;
                    int i3 = this.f56909f;
                    this.f56909f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56909f), Integer.valueOf(this.f56908e), 1), e);
                }
            } else {
                long j = CodedOutputStream.f56904b + ((long) this.f56909f);
                while ((i & -128) != 0) {
                    C23201w.m84006a(this.f56906c, j, (byte) ((i & SmActions.ACTION_ONTHECALL_ENTRY) | SmActions.ACTION_ONTHECALL_EXIT));
                    this.f56909f++;
                    i >>>= 7;
                    j = 1 + j;
                }
                C23201w.m84006a(this.f56906c, j, (byte) i);
                this.f56909f++;
            }
        }

        /* renamed from: d */
        public final void mo80061d(long j) throws IOException {
            if (!CodedOutputStream.f56903a || mo80042a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f56906c;
                    int i = this.f56909f;
                    this.f56909f = i + 1;
                    bArr[i] = (byte) ((((int) j) & SmActions.ACTION_ONTHECALL_ENTRY) | SmActions.ACTION_ONTHECALL_EXIT);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f56906c;
                    int i2 = this.f56909f;
                    this.f56909f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56909f), Integer.valueOf(this.f56908e), 1), e);
                }
            } else {
                long j2 = CodedOutputStream.f56904b + ((long) this.f56909f);
                while ((j & -128) != 0) {
                    C23201w.m84006a(this.f56906c, j2, (byte) ((((int) j) & SmActions.ACTION_ONTHECALL_ENTRY) | SmActions.ACTION_ONTHECALL_EXIT));
                    this.f56909f++;
                    j >>>= 7;
                    j2 = 1 + j2;
                }
                C23201w.m84006a(this.f56906c, j2, (byte) ((int) j));
                this.f56909f++;
            }
        }

        /* renamed from: e */
        public final void mo80062e(long j) throws IOException {
            try {
                byte[] bArr = this.f56906c;
                int i = this.f56909f;
                int i2 = i + 1;
                this.f56909f = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                this.f56909f = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                this.f56909f = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                this.f56909f = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                this.f56909f = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                this.f56909f = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                this.f56909f = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f56909f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56909f), Integer.valueOf(this.f56908e), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: b */
        public final void mo80052b(int i, int i2) throws IOException {
            mo80044a(i, 0);
            mo80063h(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: c */
        public final void mo80054c(int i, int i2) throws IOException {
            mo80044a(i, 5);
            mo80064i(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: a */
        public final void mo80044a(int i, int i2) throws IOException {
            mo80043a(WireFormat.m83736a(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: b */
        public final void mo80053b(int i, long j) throws IOException {
            mo80044a(i, 0);
            mo80061d(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: c */
        public final void mo80055c(int i, long j) throws IOException {
            mo80044a(i, 1);
            mo80062e(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: a */
        public final void mo80046a(int i, ByteString byteString) throws IOException {
            mo80044a(i, 2);
            mo80057b(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: a */
        public final void mo80047a(int i, AbstractC23125m mVar) throws IOException {
            mo80044a(i, 2);
            mo80058b(mVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: a */
        public final void mo80048a(int i, String str) throws IOException {
            mo80044a(i, 2);
            mo80059b(str);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC23107d
        /* renamed from: a */
        public final void mo80050a(byte[] bArr, int i, int i2) throws IOException {
            mo80060c(bArr, i, i2);
        }

        C23042a(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) >= 0) {
                this.f56906c = bArr;
                this.f56907d = i;
                this.f56909f = i;
                this.f56908e = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* renamed from: c */
        public final void mo80060c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f56906c, this.f56909f, i2);
                this.f56909f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f56909f), Integer.valueOf(this.f56908e), Integer.valueOf(i2)), e);
            }
        }
    }

    /* renamed from: b */
    public final void mo80051b() {
        if (mo80042a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: a */
    public static int m83522a(long j) {
        return m83531b(j);
    }

    /* renamed from: f */
    public static int m83540f(int i) {
        return m83533c(i);
    }

    /* renamed from: g */
    static int m83543g(int i) {
        return m83535d(i) + i;
    }

    /* renamed from: a */
    public static int m83523a(ByteString byteString) {
        return m83543g(byteString.size());
    }

    /* renamed from: b */
    public static int m83527b(int i) {
        return m83535d(WireFormat.m83736a(i, 0));
    }

    /* renamed from: c */
    public static int m83533c(int i) {
        if (i >= 0) {
            return m83535d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m83524a(AbstractC23125m mVar) {
        return m83543g(mVar.mo80296n());
    }

    /* renamed from: a */
    public static int m83525a(String str) {
        int i;
        try {
            i = C23203x.m84020a(str);
        } catch (C23203x.C23206c unused) {
            i = str.getBytes(C23115i.f57061a).length;
        }
        return m83543g(i);
    }

    /* renamed from: a */
    public static CodedOutputStream m83526a(byte[] bArr) {
        return m83532b(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public final void mo80056d(int i, int i2) throws IOException {
        mo80052b(i, i2);
    }

    /* renamed from: d */
    public static int m83536d(int i, long j) {
        return m83527b(i) + m83522a(j);
    }

    /* renamed from: e */
    public static int m83538e(int i, int i2) {
        return m83527b(i) + m83537e(i2);
    }

    /* renamed from: f */
    public static int m83541f(int i, int i2) {
        return m83527b(i) + m83540f(i2);
    }

    /* renamed from: b */
    public static int m83528b(int i, ByteString byteString) {
        return m83527b(i) + m83523a(byteString);
    }

    /* renamed from: e */
    public static int m83539e(int i, long j) {
        return m83527b(i) + m83531b(j);
    }

    /* renamed from: f */
    public static int m83542f(int i, long j) {
        return m83527b(i) + m83534c(j);
    }

    /* renamed from: b */
    public static int m83529b(int i, AbstractC23125m mVar) {
        return m83527b(i) + m83524a(mVar);
    }

    /* renamed from: b */
    public static int m83530b(int i, String str) {
        return m83527b(i) + m83525a(str);
    }

    /* renamed from: a */
    public final void mo80045a(int i, long j) throws IOException {
        mo80053b(i, j);
    }

    /* renamed from: b */
    public static CodedOutputStream m83532b(byte[] bArr, int i, int i2) {
        return new C23042a(bArr, i, i2);
    }
}
