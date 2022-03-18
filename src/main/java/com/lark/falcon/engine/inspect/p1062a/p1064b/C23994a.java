package com.lark.falcon.engine.inspect.p1062a.p1064b;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.lark.falcon.engine.inspect.a.b.a */
class C23994a {

    /* renamed from: a */
    public boolean f59351a;

    /* renamed from: b */
    public boolean f59352b;

    /* renamed from: c */
    public boolean f59353c;

    /* renamed from: d */
    public boolean f59354d;

    /* renamed from: e */
    public byte f59355e;

    /* renamed from: f */
    public boolean f59356f;

    /* renamed from: g */
    public long f59357g;

    /* renamed from: h */
    public byte[] f59358h;

    /* renamed from: i */
    public byte[] f59359i;

    /* renamed from: a */
    private static byte[] m87721a(long j) {
        if (j <= 125) {
            return new byte[]{(byte) ((int) j)};
        } else if (j <= 65535) {
            return new byte[]{126, (byte) ((int) ((j >> 8) & 255)), (byte) ((int) (j & 255))};
        } else {
            return new byte[]{Byte.MAX_VALUE, (byte) ((int) ((j >> 56) & 255)), (byte) ((int) ((j >> 48) & 255)), (byte) ((int) ((j >> 40) & 255)), (byte) ((int) ((j >> 32) & 255)), (byte) ((int) ((j >> 24) & 255)), (byte) ((int) ((j >> 16) & 255)), (byte) ((int) ((j >> 8) & 255)), (byte) ((int) (j & 255))};
        }
    }

    C23994a() {
    }

    /* renamed from: a */
    private byte m87717a() {
        byte b;
        if (this.f59351a) {
            b = (byte) SmActions.ACTION_ONTHECALL_EXIT;
        } else {
            b = 0;
        }
        if (this.f59352b) {
            b = (byte) (b | 64);
        }
        if (this.f59353c) {
            b = (byte) (b | 32);
        }
        if (this.f59354d) {
            b = (byte) (b | 16);
        }
        return (byte) (b | (this.f59355e & 15));
    }

    /* renamed from: a */
    private static byte[] m87722a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4];
        m87720a(inputStream, bArr, 0, 4);
        return bArr;
    }

    /* renamed from: b */
    private static byte m87723b(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    private void m87719a(byte b) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if ((b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f59351a = z;
        if ((b & 64) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f59352b = z2;
        if ((b & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f59353c = z3;
        if ((b & 16) == 0) {
            z4 = false;
        }
        this.f59354d = z4;
        this.f59355e = (byte) (b & 15);
    }

    /* renamed from: a */
    public void mo86159a(BufferedInputStream bufferedInputStream) throws IOException {
        boolean z;
        byte[] bArr;
        m87719a(m87723b(bufferedInputStream));
        byte b = m87723b(bufferedInputStream);
        if ((b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f59356f = z;
        this.f59357g = m87718a((byte) (b & -129), bufferedInputStream);
        if (this.f59356f) {
            bArr = m87722a((InputStream) bufferedInputStream);
        } else {
            bArr = null;
        }
        this.f59358h = bArr;
        long j = this.f59357g;
        byte[] bArr2 = new byte[((int) j)];
        this.f59359i = bArr2;
        m87720a(bufferedInputStream, bArr2, 0, (int) j);
        C23996c.m87731a(this.f59358h, this.f59359i, 0, (int) this.f59357g);
    }

    /* renamed from: a */
    public void mo86160a(BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.write(m87717a());
        byte[] a = m87721a(this.f59357g);
        if (this.f59356f) {
            a[0] = (byte) (a[0] | 128);
        }
        bufferedOutputStream.write(a, 0, a.length);
        if (!this.f59356f) {
            bufferedOutputStream.write(this.f59359i, 0, (int) this.f59357g);
            return;
        }
        throw new UnsupportedOperationException("Writing masked data not implemented");
    }

    /* renamed from: a */
    private long m87718a(byte b, InputStream inputStream) throws IOException {
        if (b <= 125) {
            return (long) b;
        }
        if (b == 126) {
            return (long) (((m87723b(inputStream) & 255) << 8) | (m87723b(inputStream) & 255));
        }
        if (b == Byte.MAX_VALUE) {
            long j = 0;
            for (int i = 0; i < 8; i++) {
                j = (j << 8) | ((long) (m87723b(inputStream) & 255));
            }
            return j;
        }
        throw new IOException("Unexpected length byte: " + ((int) b));
    }

    /* renamed from: a */
    private static void m87720a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                i2 -= read;
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }
}
