package org.apache.commons.compress.archivers.zip;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class PKWareExtraHeader implements AbstractC69778r {

    /* renamed from: a */
    private final ZipShort f174235a;

    /* renamed from: b */
    private byte[] f174236b;

    /* renamed from: c */
    private byte[] f174237c;

    public enum EncryptionAlgorithm {
        DES(26113),
        RC2pre52(26114),
        TripleDES168(26115),
        TripleDES192(26121),
        AES128(26126),
        AES192(26127),
        AES256(26128),
        RC2(26370),
        RC4(26625),
        UNKNOWN(65535);
        
        private static final Map<Integer, EncryptionAlgorithm> codeToEnum;
        private final int code;

        public int getCode() {
            return this.code;
        }

        static {
            HashMap hashMap = new HashMap();
            EncryptionAlgorithm[] values = values();
            for (EncryptionAlgorithm encryptionAlgorithm : values) {
                hashMap.put(Integer.valueOf(encryptionAlgorithm.getCode()), encryptionAlgorithm);
            }
            codeToEnum = Collections.unmodifiableMap(hashMap);
        }

        public static EncryptionAlgorithm getAlgorithmByCode(int i) {
            return codeToEnum.get(Integer.valueOf(i));
        }

        private EncryptionAlgorithm(int i) {
            this.code = i;
        }
    }

    public enum HashAlgorithm {
        NONE(0),
        CRC32(1),
        MD5(32771),
        SHA1(32772),
        RIPEND160(32775),
        SHA256(32780),
        SHA384(32781),
        SHA512(32782);
        
        private static final Map<Integer, HashAlgorithm> codeToEnum;
        private final int code;

        public int getCode() {
            return this.code;
        }

        static {
            HashMap hashMap = new HashMap();
            HashAlgorithm[] values = values();
            for (HashAlgorithm hashAlgorithm : values) {
                hashMap.put(Integer.valueOf(hashAlgorithm.getCode()), hashAlgorithm);
            }
            codeToEnum = Collections.unmodifiableMap(hashMap);
        }

        public static HashAlgorithm getAlgorithmByCode(int i) {
            return codeToEnum.get(Integer.valueOf(i));
        }

        private HashAlgorithm(int i) {
            this.code = i;
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getHeaderId() {
        return this.f174235a;
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getLocalFileDataData() {
        return AbstractC69779s.m267788b(this.f174236b);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public byte[] getCentralDirectoryData() {
        byte[] bArr = this.f174237c;
        if (bArr != null) {
            return AbstractC69779s.m267788b(bArr);
        }
        return getLocalFileDataData();
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getCentralDirectoryLength() {
        byte[] bArr = this.f174237c;
        if (bArr != null) {
            return new ZipShort(bArr.length);
        }
        return getLocalFileDataLength();
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public ZipShort getLocalFileDataLength() {
        int i;
        byte[] bArr = this.f174236b;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        return new ZipShort(i);
    }

    protected PKWareExtraHeader(ZipShort zipShort) {
        this.f174235a = zipShort;
    }

    /* renamed from: a */
    public void mo244705a(byte[] bArr) {
        this.f174236b = AbstractC69779s.m267788b(bArr);
    }

    /* renamed from: b */
    public void mo244706b(byte[] bArr) {
        this.f174237c = AbstractC69779s.m267788b(bArr);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        mo244705a(bArr2);
    }

    @Override // org.apache.commons.compress.archivers.zip.AbstractC69778r
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        mo244706b(bArr2);
        if (this.f174236b == null) {
            mo244705a(bArr2);
        }
    }
}
