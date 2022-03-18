package com.tt.miniapp.dec;

import com.ss.ttm.player.MediaPlayer;

final class Context {
    static final int[] LOOKUP;

    Context() {
    }

    static {
        int[] iArr = new int[2048];
        LOOKUP = iArr;
        unpackLookupTable(iArr, "         !!  !                  \"#$##%#$&'##(#)#++++++++++((&*'##,---,---,-----,-----,-----&#'###.///.///./////./////./////&#'# ", "A/*  ':  & : $   @");
    }

    private static void unpackLookupTable(int[] iArr, String str, String str2) {
        for (int i = 0; i < 256; i++) {
            iArr[i] = i & 63;
            iArr[i + MediaPlayer.MEDIA_PLAYER_OPTION_APPID] = i >> 2;
            iArr[i + 1792] = (i >> 6) + 2;
        }
        for (int i2 = 0; i2 < 128; i2++) {
            iArr[i2 + 1024] = (str.charAt(i2) - ' ') * 4;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            int i4 = i3 & 1;
            iArr[i3 + 1152] = i4;
            iArr[i3 + 1216] = i4 + 2;
        }
        int i5 = 1280;
        for (int i6 = 0; i6 < 19; i6++) {
            int i7 = i6 & 3;
            int charAt = str2.charAt(i6) - ' ';
            int i8 = 0;
            while (i8 < charAt) {
                iArr[i5] = i7;
                i8++;
                i5++;
            }
        }
        for (int i9 = 0; i9 < 16; i9++) {
            iArr[i9 + 1792] = 1;
            iArr[i9 + 2032] = 6;
        }
        iArr[1792] = 0;
        iArr[2047] = 7;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10 + 1536] = iArr[i10 + 1792] << 3;
        }
    }
}
