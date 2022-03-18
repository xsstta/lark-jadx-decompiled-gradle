package org.apache.commons.compress.archivers.zip;

import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: org.apache.commons.compress.archivers.zip.b */
public class C69761b implements Cloneable, AbstractC69778r {

    /* renamed from: a */
    private static final ZipShort f174257a = new ZipShort(30062);

    /* renamed from: b */
    private int f174258b;

    /* renamed from: c */
    private int f174259c;

    /* renamed from: d */
    private int f174260d;

    /* renamed from: e */
    private String f174261e = "";

    /* renamed from: f */
    private boolean f174262f;

    /* renamed from: g */
    private CRC32 f174263g = new CRC32();

    /* renamed from: a */
    public int mo244792a() {
        return this.f174259c;
    }

    /* renamed from: b */
    public int mo244795b() {
        return this.f174260d;
    }

    /* renamed from: c */
    public String mo244797c() {
        return this.f174261e;
    }

    /* renamed from: e */
    public int mo244800e() {
        return this.f174258b;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getHeaderId() {
        return f174257a;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        return getLocalFileDataData();
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        return getLocalFileDataLength();
    }

    /* renamed from: d */
    public boolean mo244799d() {
        if (mo244797c().length() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo244801f() {
        if (!this.f174262f || mo244799d()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            C69761b bVar = (C69761b) super.clone();
            bVar.f174263g = new CRC32();
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(mo244797c().getBytes().length + 14);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        int value = getLocalFileDataLength().getValue() - 4;
        byte[] bArr = new byte[value];
        System.arraycopy(ZipShort.getBytes(mo244800e()), 0, bArr, 0, 2);
        byte[] bytes = mo244797c().getBytes();
        System.arraycopy(ZipLong.getBytes((long) bytes.length), 0, bArr, 2, 4);
        System.arraycopy(ZipShort.getBytes(mo244792a()), 0, bArr, 6, 2);
        System.arraycopy(ZipShort.getBytes(mo244795b()), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.f174263g.reset();
        this.f174263g.update(bArr);
        byte[] bArr2 = new byte[(value + 4)];
        System.arraycopy(ZipLong.getBytes(this.f174263g.getValue()), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, value);
        return bArr2;
    }

    /* renamed from: a */
    public void mo244793a(int i) {
        this.f174258b = mo244796b(i);
    }

    /* renamed from: a */
    public void mo244794a(boolean z) {
        this.f174262f = z;
        this.f174258b = mo244796b(this.f174258b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo244796b(int i) {
        int i2;
        if (mo244799d()) {
            i2 = 40960;
        } else if (mo244801f()) {
            i2 = 16384;
        } else {
            i2 = 32768;
        }
        return (i & 4095) | i2;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        parseFromLocalFileData(bArr, i, i2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        long value = ZipLong.getValue(bArr, i);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        boolean z = false;
        System.arraycopy(bArr, i + 4, bArr2, 0, i3);
        this.f174263g.reset();
        this.f174263g.update(bArr2);
        long value2 = this.f174263g.getValue();
        if (value == value2) {
            int value3 = ZipShort.getValue(bArr2, 0);
            int value4 = (int) ZipLong.getValue(bArr2, 2);
            byte[] bArr3 = new byte[value4];
            this.f174259c = ZipShort.getValue(bArr2, 6);
            this.f174260d = ZipShort.getValue(bArr2, 8);
            if (value4 == 0) {
                this.f174261e = "";
            } else {
                System.arraycopy(bArr2, 10, bArr3, 0, value4);
                this.f174261e = new String(bArr3);
            }
            if ((value3 & 16384) != 0) {
                z = true;
            }
            mo244794a(z);
            mo244793a(value3);
            return;
        }
        throw new ZipException("bad CRC checksum " + Long.toHexString(value) + " instead of " + Long.toHexString(value2));
    }
}
