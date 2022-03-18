package com.tt.miniapp.dec;

import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.nio.ByteBuffer;

final class Transform {
    private static final byte[] PREFIX_SUFFIX;
    private static final int[] PREFIX_SUFFIX_HEADS;
    private static final int[] TRANSFORMS;

    Transform() {
    }

    static {
        int[] iArr = new int[363];
        TRANSFORMS = iArr;
        byte[] bArr = new byte[SmEvents.EVENT_LOCAL_BUSY_FORCE_END_LAST];
        PREFIX_SUFFIX = bArr;
        int[] iArr2 = new int[51];
        PREFIX_SUFFIX_HEADS = iArr2;
        unpackTransforms(bArr, iArr2, iArr, "# #s #, #e #.# the #.com/#Â # of # and # in # to #\"#\">#\n#]# for # a # that #. # with #'# from # by #. The # on # as # is #ing #\n\t#:#ed #(# at #ly #=\"# of the #. This #,# not #er #al #='#ful #ive #less #est #ize #ous #", "     !! ! ,  *!  &!  \" !  ) *   * -  ! # !  #!*!  +  ,$ !  -  %  .  / #   0  1 .  \"   2  3!*   4%  ! # /   5  6  7  8 0  1 &   $   9 +   :  ;  < '  !=  >  ?! 4  @ 4  2  &   A *# (   B  C& ) %  ) !*# *-% A +! *.  D! %'  & E *6  F  G% ! *A *%  H! D  I!+!  J!+   K +- *4! A  L!*4  M  N +6  O!*% +.! K *G  P +%(  ! G *D +D  Q +# *K!*G!+D!+# +G +A +4!+% +K!+4!*D!+K!*K");
    }

    private static void unpackTransforms(byte[] bArr, int[] iArr, int[] iArr2, String str, String str2) {
        int length = str.length();
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            bArr[i2] = (byte) charAt;
            if (charAt == '#') {
                iArr[i] = i2 + 1;
                bArr[i2] = 0;
                i++;
            }
        }
        for (int i3 = 0; i3 < 363; i3++) {
            iArr2[i3] = str2.charAt(i3) - ' ';
        }
    }

    static int transformDictionaryWord(byte[] bArr, int i, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        int i5;
        int i6 = i4 * 3;
        int[] iArr = PREFIX_SUFFIX_HEADS;
        int[] iArr2 = TRANSFORMS;
        int i7 = iArr[iArr2[i6]];
        int i8 = iArr2[i6 + 1];
        int i9 = iArr[iArr2[i6 + 2]];
        int i10 = i;
        while (true) {
            byte[] bArr2 = PREFIX_SUFFIX;
            if (bArr2[i7] == 0) {
                break;
            }
            bArr[i10] = bArr2[i7];
            i10++;
            i7++;
        }
        int i11 = 0;
        if (i8 >= 12) {
            i5 = i8 - 11;
        } else {
            i5 = 0;
        }
        if (i5 > i3) {
            i5 = i3;
        }
        int i12 = i2 + i5;
        int i13 = i3 - i5;
        if (i8 <= 9) {
            i11 = i8;
        }
        int i14 = i13 - i11;
        int i15 = i14;
        while (i15 > 0) {
            bArr[i10] = byteBuffer.get(i12);
            i15--;
            i10++;
            i12++;
        }
        if (i8 == 11 || i8 == 10) {
            int i16 = i10 - i14;
            if (i8 == 10) {
                i14 = 1;
            }
            while (i14 > 0) {
                int i17 = bArr[i16] & 255;
                if (i17 < 192) {
                    if (i17 >= 97 && i17 <= 122) {
                        bArr[i16] = (byte) (bArr[i16] ^ 32);
                    }
                    i16++;
                    i14--;
                } else if (i17 < 224) {
                    int i18 = i16 + 1;
                    bArr[i18] = (byte) (bArr[i18] ^ 32);
                    i16 += 2;
                    i14 -= 2;
                } else {
                    int i19 = i16 + 2;
                    bArr[i19] = (byte) (bArr[i19] ^ 5);
                    i16 += 3;
                    i14 -= 3;
                }
            }
        }
        while (true) {
            byte[] bArr3 = PREFIX_SUFFIX;
            if (bArr3[i9] == 0) {
                return i10 - i;
            }
            bArr[i10] = bArr3[i9];
            i10++;
            i9++;
        }
    }
}
