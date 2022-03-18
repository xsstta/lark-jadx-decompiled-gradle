package org.tukaani.xz;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.tukaani.xz.p3527e.C70063a;
import org.tukaani.xz.p3528f.C70069b;
import org.tukaani.xz.p3529g.C70078c;

/* renamed from: org.tukaani.xz.o */
public class C70094o extends InputStream {

    /* renamed from: a */
    private final C70046a f175173a;

    /* renamed from: b */
    private DataInputStream f175174b;

    /* renamed from: c */
    private C70063a f175175c;

    /* renamed from: d */
    private C70078c f175176d;

    /* renamed from: e */
    private C70069b f175177e;

    /* renamed from: f */
    private int f175178f;

    /* renamed from: g */
    private boolean f175179g;

    /* renamed from: h */
    private boolean f175180h = true;

    /* renamed from: i */
    private boolean f175181i = true;

    /* renamed from: j */
    private boolean f175182j;

    /* renamed from: k */
    private IOException f175183k;

    /* renamed from: l */
    private final byte[] f175184l = new byte[1];

    C70094o(InputStream inputStream, int i, byte[] bArr, C70046a aVar) {
        Objects.requireNonNull(inputStream);
        this.f175173a = aVar;
        this.f175174b = new DataInputStream(inputStream);
        this.f175176d = new C70078c(65536, aVar);
        this.f175175c = new C70063a(m268854b(i), bArr, aVar);
        if (bArr != null && bArr.length > 0) {
            this.f175180h = false;
        }
    }

    /* renamed from: a */
    public static int m268852a(int i) {
        return (m268854b(i) / 1024) + 104;
    }

    /* renamed from: a */
    private void m268853a() throws IOException {
        int readUnsignedByte = this.f175174b.readUnsignedByte();
        if (readUnsignedByte == 0) {
            this.f175182j = true;
            m268856c();
            return;
        }
        if (readUnsignedByte >= 224 || readUnsignedByte == 1) {
            this.f175181i = true;
            this.f175180h = false;
            this.f175175c.mo246747a();
        } else if (this.f175180h) {
            throw new CorruptedInputException();
        }
        if (readUnsignedByte >= 128) {
            this.f175179g = true;
            int i = (readUnsignedByte & 31) << 16;
            this.f175178f = i;
            this.f175178f = i + this.f175174b.readUnsignedShort() + 1;
            int readUnsignedShort = this.f175174b.readUnsignedShort() + 1;
            if (readUnsignedByte >= 192) {
                this.f175181i = false;
                m268855b();
            } else if (this.f175181i) {
                throw new CorruptedInputException();
            } else if (readUnsignedByte >= 160) {
                this.f175177e.mo246761a();
            }
            this.f175176d.mo246783a(this.f175174b, readUnsignedShort);
        } else if (readUnsignedByte <= 2) {
            this.f175179g = false;
            this.f175178f = this.f175174b.readUnsignedShort() + 1;
        } else {
            throw new CorruptedInputException();
        }
    }

    /* renamed from: b */
    private static int m268854b(int i) {
        if (i >= 4096 && i <= 2147483632) {
            return (i + 15) & -16;
        }
        throw new IllegalArgumentException("Unsupported dictionary size " + i);
    }

    /* renamed from: b */
    private void m268855b() throws IOException {
        int readUnsignedByte = this.f175174b.readUnsignedByte();
        if (readUnsignedByte <= 224) {
            int i = readUnsignedByte / 45;
            int i2 = readUnsignedByte - ((i * 9) * 5);
            int i3 = i2 / 9;
            int i4 = i2 - (i3 * 9);
            if (i4 + i3 <= 4) {
                this.f175177e = new C70069b(this.f175175c, this.f175176d, i4, i3, i);
                return;
            }
            throw new CorruptedInputException();
        }
        throw new CorruptedInputException();
    }

    /* renamed from: c */
    private void m268856c() {
        C70063a aVar = this.f175175c;
        if (aVar != null) {
            aVar.mo246752a(this.f175173a);
            this.f175175c = null;
            this.f175176d.mo246784a(this.f175173a);
            this.f175176d = null;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        DataInputStream dataInputStream = this.f175174b;
        if (dataInputStream != null) {
            IOException iOException = this.f175183k;
            if (iOException == null) {
                return this.f175179g ? this.f175178f : Math.min(this.f175178f, dataInputStream.available());
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        if (this.f175174b != null) {
            m268856c();
            try {
                this.f175174b.close();
            } finally {
                this.f175174b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f175184l, 0, 1) == -1) {
            return -1;
        }
        return this.f175184l[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f175174b != null) {
            IOException iOException = this.f175183k;
            if (iOException != null) {
                throw iOException;
            } else if (this.f175182j) {
                return -1;
            } else {
                while (i2 > 0) {
                    try {
                        if (this.f175178f == 0) {
                            m268853a();
                            if (this.f175182j) {
                                if (i4 == 0) {
                                    return -1;
                                }
                                return i4;
                            }
                        }
                        int min = Math.min(this.f175178f, i2);
                        if (!this.f175179g) {
                            this.f175175c.mo246751a(this.f175174b, min);
                        } else {
                            this.f175175c.mo246749a(min);
                            this.f175177e.mo246766c();
                        }
                        int a = this.f175175c.mo246746a(bArr, i);
                        i += a;
                        i2 -= a;
                        i4 += a;
                        int i5 = this.f175178f - a;
                        this.f175178f = i5;
                        if (i5 == 0) {
                            if (!this.f175176d.mo246785b() || this.f175175c.mo246755c()) {
                                throw new CorruptedInputException();
                            }
                        }
                    } catch (IOException e) {
                        this.f175183k = e;
                        throw e;
                    }
                }
                return i4;
            }
        } else {
            throw new XZIOException("Stream closed");
        }
    }
}
