package org.apache.commons.compress.compressors.p3498e;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.compress.compressors.AbstractC69780a;
import org.apache.commons.compress.p3493a.C69748c;
import org.apache.commons.compress.p3493a.C69752f;
import org.apache.commons.compress.p3493a.C69753g;

/* renamed from: org.apache.commons.compress.compressors.e.a */
public class C69805a extends AbstractC69780a {

    /* renamed from: a */
    static final /* synthetic */ boolean f174420a = true;

    /* renamed from: b */
    private final C69752f f174421b;

    /* renamed from: c */
    private final InputStream f174422c;

    /* renamed from: d */
    private final boolean f174423d;

    /* renamed from: e */
    private final byte[] f174424e = new byte[8192];

    /* renamed from: f */
    private int f174425f;

    /* renamed from: g */
    private Inflater f174426g = new Inflater(f174420a);

    /* renamed from: h */
    private final CRC32 f174427h = new CRC32();

    /* renamed from: i */
    private boolean f174428i = false;

    /* renamed from: j */
    private final byte[] f174429j = new byte[1];

    /* renamed from: k */
    private final C69806b f174430k = new C69806b();

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        Inflater inflater = this.f174426g;
        if (inflater != null) {
            inflater.end();
            this.f174426g = null;
        }
        if (this.f174422c != System.in) {
            this.f174422c.close();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f174429j, 0, 1) == -1) {
            return -1;
        }
        return this.f174429j[0] & 255;
    }

    /* renamed from: a */
    private static byte[] m267877a(DataInput dataInput) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int readUnsignedByte = dataInput.readUnsignedByte();
            if (readUnsignedByte == 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(readUnsignedByte);
        }
    }

    /* renamed from: a */
    private boolean m267876a(boolean z) throws IOException {
        String str;
        if (f174420a || z || this.f174423d) {
            int read = this.f174422c.read();
            int read2 = this.f174422c.read();
            if (read == -1 && !z) {
                return false;
            }
            if (read == 31 && read2 == 139) {
                DataInputStream dataInputStream = new DataInputStream(this.f174422c);
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                if (readUnsignedByte == 8) {
                    int readUnsignedByte2 = dataInputStream.readUnsignedByte();
                    if ((readUnsignedByte2 & 224) == 0) {
                        this.f174430k.mo244873a(C69748c.m267709a(dataInputStream, 4) * 1000);
                        int readUnsignedByte3 = dataInputStream.readUnsignedByte();
                        if (readUnsignedByte3 == 2) {
                            this.f174430k.mo244872a(9);
                        } else if (readUnsignedByte3 == 4) {
                            this.f174430k.mo244872a(1);
                        }
                        this.f174430k.mo244875b(dataInputStream.readUnsignedByte());
                        if ((readUnsignedByte2 & 4) != 0) {
                            int readUnsignedByte4 = (dataInputStream.readUnsignedByte() << 8) | dataInputStream.readUnsignedByte();
                            while (true) {
                                int i = readUnsignedByte4 - 1;
                                if (readUnsignedByte4 <= 0) {
                                    break;
                                }
                                dataInputStream.readUnsignedByte();
                                readUnsignedByte4 = i;
                            }
                        }
                        if ((readUnsignedByte2 & 8) != 0) {
                            this.f174430k.mo244874a(new String(m267877a(dataInputStream), "ISO-8859-1"));
                        }
                        if ((readUnsignedByte2 & 16) != 0) {
                            this.f174430k.mo244876b(new String(m267877a(dataInputStream), "ISO-8859-1"));
                        }
                        if ((readUnsignedByte2 & 2) != 0) {
                            dataInputStream.readShort();
                        }
                        this.f174426g.reset();
                        this.f174427h.reset();
                        return f174420a;
                    }
                    throw new IOException("Reserved flags are set in the .gz header");
                }
                throw new IOException("Unsupported compression method " + readUnsignedByte + " in the .gz header");
            }
            if (z) {
                str = "Input is not in the .gz format";
            } else {
                str = "Garbage after a valid .gz stream";
            }
            throw new IOException(str);
        }
        throw new AssertionError();
    }

    public C69805a(InputStream inputStream, boolean z) throws IOException {
        C69752f fVar = new C69752f(inputStream);
        this.f174421b = fVar;
        if (fVar.markSupported()) {
            this.f174422c = fVar;
        } else {
            this.f174422c = new BufferedInputStream(fVar);
        }
        this.f174423d = z;
        m267876a(f174420a);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f174428i) {
            return -1;
        }
        int i3 = 0;
        while (i2 > 0) {
            if (this.f174426g.needsInput()) {
                this.f174422c.mark(this.f174424e.length);
                int read = this.f174422c.read(this.f174424e);
                this.f174425f = read;
                if (read != -1) {
                    this.f174426g.setInput(this.f174424e, 0, read);
                } else {
                    throw new EOFException();
                }
            }
            try {
                int inflate = this.f174426g.inflate(bArr, i, i2);
                this.f174427h.update(bArr, i, inflate);
                i += inflate;
                i2 -= inflate;
                i3 += inflate;
                mo244818a(inflate);
                if (this.f174426g.finished()) {
                    this.f174422c.reset();
                    long remaining = (long) (this.f174425f - this.f174426g.getRemaining());
                    if (C69753g.m267721a(this.f174422c, remaining) == remaining) {
                        this.f174425f = 0;
                        DataInputStream dataInputStream = new DataInputStream(this.f174422c);
                        if (C69748c.m267709a(dataInputStream, 4) != this.f174427h.getValue()) {
                            throw new IOException("Gzip-compressed data is corrupt (CRC32 error)");
                        } else if (C69748c.m267709a(dataInputStream, 4) != (this.f174426g.getBytesWritten() & 4294967295L)) {
                            throw new IOException("Gzip-compressed data is corrupt(uncompressed size mismatch)");
                        } else if (!this.f174423d || !m267876a(false)) {
                            this.f174426g.end();
                            this.f174426g = null;
                            this.f174428i = f174420a;
                            if (i3 == 0) {
                                return -1;
                            }
                            return i3;
                        }
                    } else {
                        throw new IOException();
                    }
                }
            } catch (DataFormatException unused) {
                throw new IOException("Gzip-compressed data is corrupt");
            }
        }
        return i3;
    }
}
