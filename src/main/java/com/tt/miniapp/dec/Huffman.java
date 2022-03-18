package com.tt.miniapp.dec;

/* access modifiers changed from: package-private */
public final class Huffman {
    private static int getNextKey(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        while ((i & i3) != 0) {
            i3 >>= 1;
        }
        return (i & (i3 - 1)) + i3;
    }

    Huffman() {
    }

    private static int nextTableBitSize(int[] iArr, int i, int i2) {
        int i3;
        int i4 = 1 << (i - i2);
        while (i < 15 && (i3 = i4 - iArr[i]) > 0) {
            i++;
            i4 = i3 << 1;
        }
        return i - i2;
    }

    private static void replicateValue(int[] iArr, int i, int i2, int i3, int i4) {
        do {
            i3 -= i2;
            iArr[i + i3] = i4;
        } while (i3 > 0);
    }

    static void buildHuffmanTable(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = iArr2[i5];
            iArr4[i6] = iArr4[i6] + 1;
        }
        iArr5[1] = 0;
        int i7 = 1;
        while (i7 < 15) {
            int i8 = i7 + 1;
            iArr5[i8] = iArr5[i7] + iArr4[i7];
            i7 = i8;
        }
        for (int i9 = 0; i9 < i3; i9++) {
            if (iArr2[i9] != 0) {
                int i10 = iArr2[i9];
                int i11 = iArr5[i10];
                iArr5[i10] = i11 + 1;
                iArr3[i11] = i9;
            }
        }
        int i12 = 1 << i2;
        if (iArr5[15] == 1) {
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i + i13] = iArr3[0];
            }
            return;
        }
        int i14 = 2;
        int i15 = 0;
        int i16 = 1;
        int i17 = 2;
        while (i16 <= i2) {
            while (iArr4[i16] > 0) {
                replicateValue(iArr, i + i4, i17, i12, iArr3[i15] | (i16 << 16));
                i4 = getNextKey(i4, i16);
                iArr4[i16] = iArr4[i16] - 1;
                i15++;
            }
            i16++;
            i17 <<= 1;
        }
        int i18 = i12 - 1;
        int i19 = -1;
        int i20 = i2 + 1;
        int i21 = i;
        while (i20 <= 15) {
            while (iArr4[i20] > 0) {
                int i22 = i4 & i18;
                if (i22 != i19) {
                    i21 += i12;
                    int nextTableBitSize = nextTableBitSize(iArr4, i20, i2);
                    iArr[i + i22] = ((nextTableBitSize + i2) << 16) | ((i21 - i) - i22);
                    i12 = 1 << nextTableBitSize;
                    i19 = i22;
                }
                replicateValue(iArr, (i4 >> i2) + i21, i14, i12, ((i20 - i2) << 16) | iArr3[i15]);
                i4 = getNextKey(i4, i20);
                iArr4[i20] = iArr4[i20] - 1;
                i15++;
            }
            i20++;
            i14 <<= 1;
        }
    }
}
