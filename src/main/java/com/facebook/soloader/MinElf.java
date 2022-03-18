package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public final class MinElf {

    /* access modifiers changed from: private */
    public static class ElfError extends RuntimeException {
        ElfError(String str) {
            super(str);
        }
    }

    public static String[] extract_DT_NEEDED(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return extract_DT_NEEDED(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    public static String[] extract_DT_NEEDED(FileChannel fileChannel) throws IOException {
        long j;
        long j2;
        int i;
        long j3;
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (getu32(fileChannel, allocate, 0) == 1179403647) {
            boolean z2 = true;
            if (getu8(fileChannel, allocate, 4) != 1) {
                z2 = false;
            }
            if (getu8(fileChannel, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z2) {
                j = getu32(fileChannel, allocate, 28);
            } else {
                j = get64(fileChannel, allocate, 32);
            }
            if (z2) {
                j2 = (long) getu16(fileChannel, allocate, 44);
            } else {
                j2 = (long) getu16(fileChannel, allocate, 56);
            }
            if (z2) {
                i = getu16(fileChannel, allocate, 42);
            } else {
                i = getu16(fileChannel, allocate, 54);
            }
            if (j2 == 65535) {
                if (z2) {
                    j18 = getu32(fileChannel, allocate, 32);
                } else {
                    j18 = get64(fileChannel, allocate, 40);
                }
                if (z2) {
                    j19 = getu32(fileChannel, allocate, j18 + 28);
                } else {
                    j19 = getu32(fileChannel, allocate, j18 + 44);
                }
                j2 = j19;
            }
            long j20 = j;
            long j21 = 0;
            while (true) {
                if (j21 >= j2) {
                    j3 = 0;
                    break;
                }
                if (z2) {
                    j17 = getu32(fileChannel, allocate, j20 + 0);
                } else {
                    j17 = getu32(fileChannel, allocate, j20 + 0);
                }
                if (j17 != 2) {
                    j20 += (long) i;
                    j21++;
                } else if (z2) {
                    j3 = getu32(fileChannel, allocate, j20 + 4);
                } else {
                    j3 = get64(fileChannel, allocate, j20 + 8);
                }
            }
            long j22 = 0;
            if (j3 != 0) {
                long j23 = j3;
                long j24 = 0;
                int i2 = 0;
                while (true) {
                    if (z2) {
                        z = z2;
                        j4 = getu32(fileChannel, allocate, j23 + j22);
                    } else {
                        z = z2;
                        j4 = get64(fileChannel, allocate, j23 + j22);
                    }
                    if (j4 == 1) {
                        j5 = j3;
                        if (i2 != Integer.MAX_VALUE) {
                            i2++;
                        } else {
                            throw new ElfError("malformed DT_NEEDED section");
                        }
                    } else {
                        j5 = j3;
                        if (j4 == 5) {
                            if (z) {
                                j16 = getu32(fileChannel, allocate, j23 + 4);
                            } else {
                                j16 = get64(fileChannel, allocate, j23 + 8);
                            }
                            j24 = j16;
                        }
                    }
                    long j25 = 16;
                    if (z) {
                        j6 = 8;
                    } else {
                        j6 = 16;
                    }
                    j23 += j6;
                    j22 = 0;
                    if (j4 != 0) {
                        z2 = z;
                        j3 = j5;
                    } else if (j24 != 0) {
                        int i3 = 0;
                        while (true) {
                            if (((long) i3) >= j2) {
                                j7 = 0;
                                break;
                            }
                            if (z) {
                                j11 = getu32(fileChannel, allocate, j + j22);
                            } else {
                                j11 = getu32(fileChannel, allocate, j + j22);
                            }
                            if (j11 == 1) {
                                if (z) {
                                    j13 = getu32(fileChannel, allocate, j + 8);
                                } else {
                                    j13 = get64(fileChannel, allocate, j + j25);
                                }
                                if (z) {
                                    j12 = j2;
                                    j14 = getu32(fileChannel, allocate, j + 20);
                                } else {
                                    j12 = j2;
                                    j14 = get64(fileChannel, allocate, j + 40);
                                }
                                if (j13 <= j24 && j24 < j14 + j13) {
                                    if (z) {
                                        j15 = getu32(fileChannel, allocate, j + 4);
                                    } else {
                                        j15 = get64(fileChannel, allocate, j + 8);
                                    }
                                    j7 = j15 + (j24 - j13);
                                }
                            } else {
                                j12 = j2;
                            }
                            j += (long) i;
                            i3++;
                            j2 = j12;
                            j25 = 16;
                            j22 = 0;
                        }
                        long j26 = 0;
                        if (j7 != 0) {
                            String[] strArr = new String[i2];
                            int i4 = 0;
                            while (true) {
                                if (z) {
                                    j8 = getu32(fileChannel, allocate, j5 + j26);
                                } else {
                                    j8 = get64(fileChannel, allocate, j5 + j26);
                                }
                                if (j8 == 1) {
                                    if (z) {
                                        j10 = getu32(fileChannel, allocate, j5 + 4);
                                    } else {
                                        j10 = get64(fileChannel, allocate, j5 + 8);
                                    }
                                    strArr[i4] = getSz(fileChannel, allocate, j10 + j7);
                                    if (i4 != Integer.MAX_VALUE) {
                                        i4++;
                                    } else {
                                        throw new ElfError("malformed DT_NEEDED section");
                                    }
                                }
                                if (z) {
                                    j9 = 8;
                                } else {
                                    j9 = 16;
                                }
                                j5 += j9;
                                if (j8 != 0) {
                                    j26 = 0;
                                } else if (i4 == i2) {
                                    return strArr;
                                } else {
                                    throw new ElfError("malformed DT_NEEDED section");
                                }
                            }
                        } else {
                            throw new ElfError("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new ElfError("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new ElfError("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new ElfError("file is not ELF");
        }
    }

    private static long get64(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        read(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    private static int getu16(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        read(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    private static long getu32(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        read(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static short getu8(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        read(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    private static String getSz(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short u8Var = getu8(fileChannel, byteBuffer, j);
            if (u8Var == 0) {
                return sb.toString();
            }
            sb.append((char) u8Var);
            j = j2;
        }
    }

    private static void read(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new ElfError("ELF file truncated");
    }
}
