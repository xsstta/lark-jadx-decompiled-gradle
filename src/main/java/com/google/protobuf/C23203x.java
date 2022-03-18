package com.google.protobuf;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.x */
public final class C23203x {

    /* renamed from: a */
    private static final AbstractC23204a f57233a;

    /* renamed from: a */
    public static int m84016a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public static int m84017a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: a */
    public static int m84018a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.x$a */
    public static abstract class AbstractC23204a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract int mo80474a(int i, byte[] bArr, int i2, int i3);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract int mo80475a(CharSequence charSequence, byte[] bArr, int i, int i2);

        AbstractC23204a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo80476a(byte[] bArr, int i, int i2) {
            if (mo80474a(0, bArr, i, i2) == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.protobuf.x$b */
    static final class C23205b extends AbstractC23204a {
        C23205b() {
        }

        /* renamed from: b */
        private static int m84028b(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m84029c(bArr, i, i2);
        }

        /* renamed from: c */
        private static int m84029c(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return C23203x.m84024b(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return C23203x.m84024b(bArr, i3, i2);
                    } else {
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i3 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
            if (r8[r9] > -65) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
            if (r8[r9] > -65) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r8[r9] > -65) goto L_0x001b;
         */
        @Override // com.google.protobuf.C23203x.AbstractC23204a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo80474a(int r7, byte[] r8, int r9, int r10) {
            /*
            // Method dump skipped, instructions count: 135
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23203x.C23205b.mo80474a(int, byte[], int, int):int");
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.protobuf.C23203x.AbstractC23204a
        /* renamed from: a */
        public int mo80475a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i4 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | SmActions.ACTION_ONTHECALL_EXIT);
                    i7++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | SmActions.ACTION_ONTHECALL_EXIT);
                    i4 = i11 + 1;
                    bArr[i11] = (byte) ((charAt2 & '?') | SmActions.ACTION_ONTHECALL_EXIT);
                } else if (i8 <= i6 - 4) {
                    int i12 = i7 + 1;
                    if (i12 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((codePoint >>> 12) & 63) | SmActions.ACTION_ONTHECALL_EXIT);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 6) & 63) | SmActions.ACTION_ONTHECALL_EXIT);
                            i8 = i15 + 1;
                            bArr[i15] = (byte) ((codePoint & 63) | SmActions.ACTION_ONTHECALL_EXIT);
                            i7 = i12;
                            i7++;
                        } else {
                            i7 = i12;
                        }
                    }
                    throw new C23206c(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                } else {
                    throw new C23206c(i7, length);
                }
                i8 = i4;
                i7++;
            }
            return i8;
        }
    }

    /* renamed from: com.google.protobuf.x$d */
    static final class C23207d extends AbstractC23204a {
        C23207d() {
        }

        /* renamed from: a */
        static boolean m84034a() {
            if (!C23201w.m84007a() || !C23201w.m84009b()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private static int m84033a(byte[] bArr, long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = ((int) j) & 7;
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (C23201w.m84003a(bArr, j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (C23201w.m84008b(bArr, j) & -9187201950435737472L) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            return -1;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int m84035b(byte[] r8, long r9, int r11) {
            /*
            // Method dump skipped, instructions count: 143
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23203x.C23207d.m84035b(byte[], long, int):int");
        }

        /* renamed from: a */
        private static int m84032a(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return C23203x.m84016a(i);
            }
            if (i2 == 1) {
                return C23203x.m84017a(i, C23201w.m84003a(bArr, j));
            }
            if (i2 == 2) {
                return C23203x.m84018a(i, C23201w.m84003a(bArr, j), C23201w.m84003a(bArr, j + 1));
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
            if (com.google.protobuf.C23201w.m84003a(r13, r2) > -65) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
            if (com.google.protobuf.C23201w.m84003a(r13, r2) > -65) goto L_0x00aa;
         */
        @Override // com.google.protobuf.C23203x.AbstractC23204a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo80474a(int r12, byte[] r13, int r14, int r15) {
            /*
            // Method dump skipped, instructions count: 214
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23203x.C23207d.mo80474a(int, byte[], int, int):int");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[LOOP:1: B:14:0x003d->B:39:0x0105, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x0034, B:39:0x0105] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x0034, B:39:0x0105] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v4 long) = (r4v3 long), (r4v6 long) binds: [B:10:0x0034, B:39:0x0105] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x0034, B:39:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.google.protobuf.C23203x.AbstractC23204a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo80475a(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
            /*
            // Method dump skipped, instructions count: 373
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23203x.C23207d.mo80475a(java.lang.CharSequence, byte[], int, int):int");
        }
    }

    static {
        AbstractC23204a aVar;
        if (C23207d.m84034a()) {
            aVar = new C23207d();
        } else {
            aVar = new C23205b();
        }
        f57233a = aVar;
    }

    /* renamed from: a */
    static int m84020a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += m84021a(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.x$c */
    public static class C23206c extends IllegalArgumentException {
        C23206c(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* renamed from: a */
    private static int m84021a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= 65536) {
                        i++;
                    } else {
                        throw new C23206c(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public static int m84024b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m84016a(b);
        }
        if (i3 == 1) {
            return m84017a(b, bArr[i]);
        }
        if (i3 == 2) {
            return m84018a(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static boolean m84023a(byte[] bArr, int i, int i2) {
        return f57233a.mo80476a(bArr, i, i2);
    }

    /* renamed from: a */
    public static int m84019a(int i, byte[] bArr, int i2, int i3) {
        return f57233a.mo80474a(i, bArr, i2, i3);
    }

    /* renamed from: a */
    static int m84022a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f57233a.mo80475a(charSequence, bArr, i, i2);
    }
}
