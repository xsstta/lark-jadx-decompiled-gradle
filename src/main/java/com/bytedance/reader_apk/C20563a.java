package com.bytedance.reader_apk;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.reader_apk.a */
public final class C20563a {
    /* renamed from: b */
    public static long m74885b(FileChannel fileChannel) throws IOException {
        return m74881a(fileChannel, m74880a(fileChannel));
    }

    /* renamed from: c */
    public static C20565b<ByteBuffer, Long> m74888c(FileChannel fileChannel) throws IOException, SignatureNotFoundException {
        return m74886b(fileChannel, m74885b(fileChannel));
    }

    /* renamed from: b */
    private static void m74887b(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: a */
    public static long m74880a(FileChannel fileChannel) throws IOException {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long min = Math.min(j, 65535L);
            int i = 0;
            while (true) {
                long j2 = (long) i;
                if (j2 <= min) {
                    long j3 = j - j2;
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    fileChannel.position(j3);
                    fileChannel.read(allocate);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    if (allocate.getInt(0) == 101010256) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j3 + 20);
                        fileChannel.read(allocate2);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        short s = allocate2.getShort(0);
                        if (s == i) {
                            return (long) s;
                        }
                    }
                    i++;
                } else {
                    throw new IOException("ZIP End of Central Directory (EOCD) record not found");
                }
            }
        } else {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
    }

    /* renamed from: a */
    public static Map<Integer, ByteBuffer> m74884a(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        m74887b(byteBuffer);
        ByteBuffer a = m74883a(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (a.hasRemaining()) {
            i++;
            if (a.remaining() >= 8) {
                long j = a.getLong();
                if (j < 4 || j > 2147483647L) {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
                }
                int i2 = (int) j;
                int position = a.position() + i2;
                if (i2 <= a.remaining()) {
                    linkedHashMap.put(Integer.valueOf(a.getInt()), m74882a(a, i2 - 4));
                    a.position(position);
                } else {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + a.remaining());
                }
            } else {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static long m74881a(FileChannel fileChannel, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j) - 6);
        fileChannel.read(allocate);
        return (long) allocate.getInt(0);
    }

    /* renamed from: a */
    private static ByteBuffer m74882a(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
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
            throw new IllegalArgumentException("size: " + i);
        }
    }

    /* renamed from: b */
    public static C20565b<ByteBuffer, Long> m74886b(FileChannel fileChannel, long j) throws IOException, SignatureNotFoundException {
        if (j >= 32) {
            fileChannel.position(j - 24);
            ByteBuffer allocate = ByteBuffer.allocate(24);
            fileChannel.read(allocate);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                long j2 = allocate.getLong(0);
                if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                    throw new SignatureNotFoundException("APK Signing Block size out of range: " + j2);
                }
                int i = (int) (8 + j2);
                long j3 = j - ((long) i);
                if (j3 >= 0) {
                    fileChannel.position(j3);
                    ByteBuffer allocate2 = ByteBuffer.allocate(i);
                    fileChannel.read(allocate2);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    long j4 = allocate2.getLong(0);
                    if (j4 == j2) {
                        return C20565b.m74892a(allocate2, Long.valueOf(j3));
                    }
                    throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                }
                throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j3);
            }
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static ByteBuffer m74883a(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("start: " + i);
        } else if (i2 >= i) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(i);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    return slice;
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("end > capacity: " + i2 + " > " + capacity);
            }
        } else {
            throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
        }
    }
}
