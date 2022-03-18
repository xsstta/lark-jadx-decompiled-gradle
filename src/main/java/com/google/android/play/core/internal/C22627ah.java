package com.google.android.play.core.internal;

import android.os.Build;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.play.core.internal.ah */
public final class C22627ah {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static AbstractC22626ag m82256a() {
        if (Build.VERSION.SDK_INT >= 21) {
            switch (Build.VERSION.SDK_INT) {
                case 21:
                    return new an();
                case 22:
                    return new ao();
                case 23:
                    return new C22629at();
                case 24:
                    return new au();
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                    return new av();
                case 26:
                    return new ay();
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                    if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                        return new az();
                    }
                    break;
            }
            return new bb();
        }
        throw new AssertionError("Unsupported Android Version");
    }

    /* renamed from: a */
    public static String m82257a(File file) {
        if (file.getName().endsWith(".apk")) {
            return file.getName().replaceFirst("(_\\d+)?\\.apk", "").replace("base-", "config.").replace("-", ".config.").replace(".config.master", "").replace("config.master", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: a */
    public static void m82258a(AbstractC22631bg bgVar, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            throw new bu(valueOf.length() == 0 ? new String("Unexpected magic=") : "Unexpected magic=".concat(valueOf));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j2 = 0;
            while (true) {
                long j3 = j - j2;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                m82260a(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                m82260a(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m82259a(bArr, bgVar, outputStream, readUnsignedShort, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 250:
                                read2 = dataInputStream.readUnsignedShort();
                                m82259a(bArr, bgVar, outputStream, (long) dataInputStream.readUnsignedShort(), read2, j3);
                                break;
                            case 251:
                                read2 = dataInputStream.readInt();
                                m82259a(bArr, bgVar, outputStream, (long) dataInputStream.readUnsignedShort(), read2, j3);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m82259a(bArr, bgVar, outputStream, readInt2, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                read2 = dataInputStream.readUnsignedShort();
                                m82259a(bArr, bgVar, outputStream, (long) dataInputStream.readInt(), read2, j3);
                                break;
                            case 254:
                                read2 = dataInputStream.readInt();
                                m82259a(bArr, bgVar, outputStream, (long) dataInputStream.readInt(), read2, j3);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                m82259a(bArr, bgVar, outputStream, readLong, read2, j3);
                                break;
                            default:
                                m82260a(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                        }
                        j2 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(read);
            throw new bu(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m82259a(byte[] bArr, AbstractC22631bg bgVar, OutputStream outputStream, long j, int i, long j2) throws IOException {
        int i2 = i;
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        } else if (j >= 0) {
            long j3 = (long) i2;
            if (j3 <= j2) {
                try {
                    InputStream b = new bh(bgVar, j, j3).mo78882b();
                    while (i2 > 0) {
                        try {
                            int min = Math.min(i2, 16384);
                            int i3 = 0;
                            while (i3 < min) {
                                int read = b.read(bArr, i3, min - i3);
                                if (read != -1) {
                                    i3 += read;
                                } else {
                                    throw new IOException("truncated input stream");
                                }
                            }
                            outputStream.write(bArr, 0, min);
                            i2 -= min;
                        } catch (Throwable th) {
                            bx.m82371a(th, th);
                        }
                    }
                    if (b != null) {
                        b.close();
                        return;
                    }
                    return;
                } catch (EOFException e) {
                    throw new IOException("patch underrun", e);
                }
            } else {
                throw new IOException("Output length overrun");
            }
        } else {
            throw new IOException("inputOffset negative");
        }
        throw th;
    }

    /* renamed from: a */
    private static void m82260a(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }
}
