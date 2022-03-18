package com.google.android.play.core.internal;

import android.util.Pair;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class cg {
    /* renamed from: a */
    private static int m82386a(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown signature algorithm: 0x") : "Unknown signature algorithm: 0x".concat(valueOf));
        }
    }

    /* renamed from: a */
    public static long m82387a(ByteBuffer byteBuffer) {
        m82404c(byteBuffer);
        return m82388a(byteBuffer, byteBuffer.position() + 16);
    }

    /* renamed from: a */
    private static long m82388a(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* renamed from: a */
    static Pair<ByteBuffer, Long> m82389a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> a = m82390a(randomAccessFile, 0);
        return a == null ? m82390a(randomAccessFile, 65535) : a;
    }

    /* renamed from: a */
    private static Pair<ByteBuffer, Long> m82390a(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length >= 22) {
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, -22 + length)) + 22);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            long capacity = length - ((long) allocate.capacity());
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            m82404c(allocate);
            int capacity2 = allocate.capacity();
            if (capacity2 >= 22) {
                int i3 = capacity2 - 22;
                int min = Math.min(i3, 65535);
                int i4 = 0;
                while (true) {
                    if (i4 >= min) {
                        break;
                    }
                    i2 = i3 - i4;
                    if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                        break;
                    }
                    i4++;
                }
            }
            i2 = -1;
            if (i2 != -1) {
                allocate.position(i2);
                ByteBuffer slice = allocate.slice();
                slice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(slice, Long.valueOf(capacity + ((long) i2)));
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m82391a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m82392a(String str, String str2, String str3) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    private static void m82393a(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* renamed from: a */
    public static void m82394a(ByteBuffer byteBuffer, long j) {
        m82404c(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("uint32 value of out range: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        byteBuffer.putInt(byteBuffer.position() + position, (int) j);
    }

    /* renamed from: a */
    private static void m82395a(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            bs bsVar = new bs(fileChannel, 0, j);
            bs bsVar2 = new bs(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            m82394a(duplicate, j);
            C22619a aVar = new C22619a(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            for (Integer num : map.keySet()) {
                iArr[i] = num.intValue();
                i++;
            }
            try {
                byte[][] a = m82397a(iArr, new as[]{bsVar, bsVar2, aVar});
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = iArr[i2];
                    if (!MessageDigest.isEqual(map.get(Integer.valueOf(i3)), a[i2])) {
                        throw new SecurityException(m82401b(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0139 A[Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013a A[Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0146  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.cert.X509Certificate[] m82396a(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 706
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.cg.m82396a(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    /* renamed from: a */
    private static byte[][] m82397a(int[] iArr, as[] asVarArr) throws DigestException {
        long j;
        int i;
        int length;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += (asVarArr[i2].mo78854a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 < 2097151) {
            int i3 = (int) j3;
            byte[][] bArr = new byte[iArr.length][];
            int i4 = 0;
            while (true) {
                length = iArr.length;
                if (i4 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((m82403c(iArr[i4]) * i3) + 5)];
                bArr2[0] = 90;
                m82393a(i3, bArr2);
                bArr[i4] = bArr2;
                i4++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                String b = m82401b(iArr[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(b);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(b.concat(" digest not supported"), e);
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i6 < i; i = 3) {
                as asVar = asVarArr[i6];
                long j4 = j2;
                int i9 = length;
                long a = asVar.mo78854a();
                while (a > j2) {
                    int min = (int) Math.min(a, j);
                    m82393a(min, bArr3);
                    for (int i10 = 0; i10 < i9; i10++) {
                        messageDigestArr[i10].update(bArr3);
                    }
                    try {
                        asVar.mo78855a(messageDigestArr, j4, min);
                        int i11 = 0;
                        while (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            byte[] bArr4 = bArr[i11];
                            int c = m82403c(i12);
                            MessageDigest messageDigest = messageDigestArr[i11];
                            int digest = messageDigest.digest(bArr4, (i7 * c) + 5, c);
                            if (digest == c) {
                                i11++;
                                asVar = asVar;
                                bArr3 = bArr3;
                                messageDigestArr = messageDigestArr;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        long j5 = (long) min;
                        long j6 = j4 + j5;
                        a -= j5;
                        i7++;
                        i9 = i9;
                        j2 = 0;
                        j = 1048576;
                        asVar = asVar;
                        j4 = j6;
                        bArr3 = bArr3;
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i7);
                        sb2.append(" of section #");
                        sb2.append(i8);
                        throw new DigestException(sb2.toString(), e2);
                    }
                }
                i8++;
                i6++;
                length = i9;
            }
            byte[][] bArr5 = new byte[iArr.length][];
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                byte[] bArr6 = bArr[i13];
                String b2 = m82401b(i14);
                try {
                    bArr5[i13] = MessageDigest.getInstance(b2).digest(bArr6);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(b2.concat(" digest not supported"), e3);
                }
            }
            return bArr5;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static X509Certificate[][] m82398a(String str) throws C22636e, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> a = m82389a(randomAccessFile);
            if (a != null) {
                ByteBuffer byteBuffer = (ByteBuffer) a.first;
                long longValue = ((Long) a.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new C22636e("ZIP64 APK not supported");
                    }
                }
                long a2 = m82387a(byteBuffer);
                if (a2 >= longValue) {
                    StringBuilder sb = new StringBuilder((int) SmActions.ACTION_INIT_EXIT);
                    sb.append("ZIP Central Directory offset out of range: ");
                    sb.append(a2);
                    sb.append(". ZIP End of Central Directory offset: ");
                    sb.append(longValue);
                    throw new C22636e(sb.toString());
                } else if (m82400b(byteBuffer) + a2 != longValue) {
                    throw new C22636e("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else if (a2 >= 32) {
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(a2 - ((long) allocate.capacity()));
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    int i = 8;
                    if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                        int i2 = 0;
                        long j2 = allocate.getLong(0);
                        if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                            StringBuilder sb2 = new StringBuilder(57);
                            sb2.append("APK Signing Block size out of range: ");
                            sb2.append(j2);
                            throw new C22636e(sb2.toString());
                        }
                        int i3 = (int) (8 + j2);
                        long j3 = a2 - ((long) i3);
                        if (j3 >= 0) {
                            ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                            allocate2.order(ByteOrder.LITTLE_ENDIAN);
                            randomAccessFile.seek(j3);
                            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                            long j4 = allocate2.getLong(0);
                            if (j4 == j2) {
                                Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                long longValue2 = ((Long) create.second).longValue();
                                if (byteBuffer2.order() == ByteOrder.LITTLE_ENDIAN) {
                                    int capacity = byteBuffer2.capacity() - 24;
                                    if (capacity >= 8) {
                                        int capacity2 = byteBuffer2.capacity();
                                        if (capacity <= byteBuffer2.capacity()) {
                                            int limit = byteBuffer2.limit();
                                            int position = byteBuffer2.position();
                                            try {
                                                byteBuffer2.position(0);
                                                byteBuffer2.limit(capacity);
                                                byteBuffer2.position(8);
                                                ByteBuffer slice = byteBuffer2.slice();
                                                slice.order(byteBuffer2.order());
                                                byteBuffer2.position(0);
                                                byteBuffer2.limit(limit);
                                                byteBuffer2.position(position);
                                                while (slice.hasRemaining()) {
                                                    i2++;
                                                    if (slice.remaining() >= i) {
                                                        long j5 = slice.getLong();
                                                        if (j5 < 4 || j5 > 2147483647L) {
                                                            StringBuilder sb3 = new StringBuilder(76);
                                                            sb3.append("APK Signing Block entry #");
                                                            sb3.append(i2);
                                                            sb3.append(" size out of range: ");
                                                            sb3.append(j5);
                                                            throw new C22636e(sb3.toString());
                                                        }
                                                        int i4 = (int) j5;
                                                        int position2 = slice.position() + i4;
                                                        if (i4 > slice.remaining()) {
                                                            int remaining = slice.remaining();
                                                            StringBuilder sb4 = new StringBuilder(91);
                                                            sb4.append("APK Signing Block entry #");
                                                            sb4.append(i2);
                                                            sb4.append(" size out of range: ");
                                                            sb4.append(i4);
                                                            sb4.append(", available: ");
                                                            sb4.append(remaining);
                                                            throw new C22636e(sb4.toString());
                                                        } else if (slice.getInt() == 1896449818) {
                                                            X509Certificate[][] a3 = m82399a(randomAccessFile.getChannel(), new cd(m82402b(slice, i4 - 4), longValue2, a2, longValue, byteBuffer));
                                                            randomAccessFile.close();
                                                            return a3;
                                                        } else {
                                                            slice.position(position2);
                                                            i = 8;
                                                        }
                                                    } else {
                                                        StringBuilder sb5 = new StringBuilder(70);
                                                        sb5.append("Insufficient data to read size of APK Signing Block entry #");
                                                        sb5.append(i2);
                                                        throw new C22636e(sb5.toString());
                                                    }
                                                }
                                                throw new C22636e("No APK Signature Scheme v2 block in APK Signing Block");
                                            } catch (Throwable th) {
                                                byteBuffer2.position(0);
                                                byteBuffer2.limit(limit);
                                                byteBuffer2.position(position);
                                                throw th;
                                            }
                                        } else {
                                            StringBuilder sb6 = new StringBuilder(41);
                                            sb6.append("end > capacity: ");
                                            sb6.append(capacity);
                                            sb6.append(" > ");
                                            sb6.append(capacity2);
                                            throw new IllegalArgumentException(sb6.toString());
                                        }
                                    } else {
                                        StringBuilder sb7 = new StringBuilder(38);
                                        sb7.append("end < start: ");
                                        sb7.append(capacity);
                                        sb7.append(" < ");
                                        sb7.append(8);
                                        throw new IllegalArgumentException(sb7.toString());
                                    }
                                } else {
                                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                }
                            } else {
                                StringBuilder sb8 = new StringBuilder(103);
                                sb8.append("APK Signing Block sizes in header and footer do not match: ");
                                sb8.append(j4);
                                sb8.append(" vs ");
                                sb8.append(j2);
                                throw new C22636e(sb8.toString());
                            }
                        } else {
                            StringBuilder sb9 = new StringBuilder(59);
                            sb9.append("APK Signing Block offset out of range: ");
                            sb9.append(j3);
                            throw new C22636e(sb9.toString());
                        }
                    } else {
                        throw new C22636e("No APK Signing Block before ZIP Central Directory");
                    }
                } else {
                    StringBuilder sb10 = new StringBuilder(87);
                    sb10.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb10.append(a2);
                    throw new C22636e(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new C22636e(sb11.toString());
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static X509Certificate[][] m82399a(FileChannel fileChannel, cd cdVar) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer d = m82405d(cd.m82381a(cdVar));
                int i = 0;
                while (d.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m82396a(m82405d(d), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    m82395a(hashMap, fileChannel, cd.m82382b(cdVar), cd.m82383c(cdVar), cd.m82384d(cdVar), cd.m82385e(cdVar));
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* renamed from: b */
    public static long m82400b(ByteBuffer byteBuffer) {
        m82404c(byteBuffer);
        return m82388a(byteBuffer, byteBuffer.position() + 12);
    }

    /* renamed from: b */
    private static String m82401b(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private static ByteBuffer m82402b(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private static int m82403c(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private static void m82404c(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: d */
    private static ByteBuffer m82405d(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m82402b(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: e */
    private static byte[] m82406e(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }
}
