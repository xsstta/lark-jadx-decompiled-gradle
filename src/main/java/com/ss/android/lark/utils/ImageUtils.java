package com.ss.android.lark.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.framework.utils.C26257ai;
import com.larksuite.framework.utils.C26266d;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

public class ImageUtils {

    public enum ImageType {
        TYPE_JPG("jpg"),
        TYPE_PNG("png"),
        TYPE_GIF("gif"),
        TYPE_TIFF("tiff"),
        TYPE_BMP("bmp"),
        TYPE_WEBP("webp"),
        TYPE_ICO("ico"),
        TYPE_UNKNOWN("unknown");
        
        String value;

        public String getValue() {
            return this.value;
        }

        private ImageType(String str) {
            this.value = str;
        }
    }

    /* renamed from: a */
    public static int[] m224136a(Context context, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 <= 0) {
            i2 = i4;
        }
        if (i <= 0) {
            i = i4;
        }
        int[] iArr = new int[2];
        if (i2 < i4 || i < i4 || i2 > i3 || i > i3) {
            int i6 = i > i2 ? i : i2;
            int i7 = i < i2 ? i : i2;
            float f = ((float) i6) / ((float) i7);
            if (f <= ((float) (i3 / i4))) {
                if (i7 <= i4) {
                    i3 = (int) (((float) i4) * f);
                    i5 = i4;
                } else if (i6 >= i3) {
                    i5 = (int) (((float) i3) / f);
                } else {
                    i3 = 0;
                    i5 = 0;
                }
                if (i >= i2) {
                    iArr[0] = i3;
                    iArr[1] = i5;
                } else {
                    iArr[0] = i5;
                    iArr[1] = i3;
                }
            } else if (i >= i2) {
                iArr[0] = i3;
                iArr[1] = i4;
            } else {
                iArr[0] = i4;
                iArr[1] = i3;
            }
        } else {
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] < i4) {
            iArr[0] = i4;
        }
        if (iArr[1] < i4) {
            iArr[1] = i4;
        }
        iArr[0] = UIUtils.px2dp(context, (float) iArr[0]);
        iArr[1] = UIUtils.px2dp(context, (float) iArr[1]);
        return iArr;
    }

    /* renamed from: a */
    public static int m224128a(Context context) {
        return UIUtils.dp2px(context, 100.0f);
    }

    /* renamed from: a */
    public static ImageType m224131a(File file) {
        Throwable th;
        IOException e;
        byte[] bArr = new byte[12];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileInputStream2.read(bArr);
                C26266d.m95082a(fileInputStream2);
            } catch (IOException e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    e.printStackTrace();
                    C26266d.m95082a(fileInputStream);
                    return m224132a(bArr);
                } catch (Throwable th2) {
                    th = th2;
                    C26266d.m95082a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                C26266d.m95082a(fileInputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            C26266d.m95082a(fileInputStream);
            return m224132a(bArr);
        }
        return m224132a(bArr);
    }

    /* renamed from: a */
    public static ImageType m224132a(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        String upperCase = C26257ai.m95013a(bArr2).toUpperCase();
        if (upperCase.contains("FFD8FF")) {
            return ImageType.TYPE_JPG;
        }
        if (upperCase.contains("89504E47")) {
            return ImageType.TYPE_PNG;
        }
        if (upperCase.contains("47494638")) {
            return ImageType.TYPE_GIF;
        }
        if (upperCase.contains("49492A00") || upperCase.contains("4D4D002A")) {
            return ImageType.TYPE_TIFF;
        }
        if (upperCase.contains("424D")) {
            return ImageType.TYPE_BMP;
        }
        if (upperCase.startsWith("52494646") && upperCase.endsWith("57454250")) {
            return ImageType.TYPE_WEBP;
        }
        if (upperCase.contains("00000100") || upperCase.contains("00000200")) {
            return ImageType.TYPE_ICO;
        }
        return ImageType.TYPE_UNKNOWN;
    }

    /* renamed from: a */
    public static boolean m224134a(List<String> list, boolean z) {
        if (CollectionUtils.isEmpty(list) || !z) {
            return true;
        }
        for (String str : list) {
            if (C26311p.m95281c(new File(str)) >= 10485760) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static Bitmap m224130a(Bitmap bitmap, int i) {
        int[] iArr;
        char c;
        char c2;
        char c3;
        char c4;
        int i2 = i;
        if (bitmap == null) {
            return null;
        }
        try {
            Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
            if (copy == null || i2 < 1) {
                return null;
            }
            int width = copy.getWidth();
            int height = copy.getHeight();
            int i3 = width * height;
            int[] iArr2 = new int[i3];
            copy.getPixels(iArr2, 0, width, 0, 0, width, height);
            int i4 = width - 1;
            int i5 = height - 1;
            int i6 = i2 + i2 + 1;
            int[] iArr3 = new int[i3];
            int[] iArr4 = new int[i3];
            int[] iArr5 = new int[i3];
            int[] iArr6 = new int[Math.max(width, height)];
            int i7 = (i6 + 1) >> 1;
            int i8 = i7 * i7;
            int i9 = i8 * DynamicModule.f58006b;
            int[] iArr7 = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                iArr7[i10] = i10 / i8;
            }
            int[] iArr8 = new int[2];
            iArr8[1] = 3;
            iArr8[0] = i6;
            int[][] iArr9 = (int[][]) Array.newInstance(int.class, iArr8);
            int i11 = i2 + 1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < height) {
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = -i2;
                int i24 = 0;
                while (i23 <= i2) {
                    int i25 = iArr2[i13 + Math.min(i4, Math.max(i23, 0))];
                    int[] iArr10 = iArr9[i23 + i2];
                    if ((i25 & -16777216) != 0) {
                        iArr10[0] = (i25 & 16711680) >> 16;
                        c4 = 1;
                        iArr10[1] = (i25 & 65280) >> 8;
                        iArr10[2] = i25 & 255;
                    } else {
                        c4 = 1;
                        iArr10[2] = 255;
                        iArr10[1] = 255;
                        iArr10[0] = 255;
                    }
                    int abs = i11 - Math.abs(i23);
                    i24 += iArr10[0] * abs;
                    i15 += iArr10[c4] * abs;
                    i16 += iArr10[2] * abs;
                    if (i23 > 0) {
                        i20 += iArr10[0];
                        i21 += iArr10[c4];
                        i22 += iArr10[2];
                    } else {
                        i17 += iArr10[0];
                        i18 += iArr10[c4];
                        i19 += iArr10[2];
                    }
                    i23++;
                    i5 = i5;
                    iArr6 = iArr6;
                }
                int i26 = i24;
                int i27 = i2;
                int i28 = 0;
                while (i28 < width) {
                    iArr3[i13] = iArr7[i26];
                    iArr4[i13] = iArr7[i15];
                    iArr5[i13] = iArr7[i16];
                    int i29 = i26 - i17;
                    int i30 = i15 - i18;
                    int i31 = i16 - i19;
                    int[] iArr11 = iArr9[((i27 - i2) + i6) % i6];
                    int i32 = i17 - iArr11[0];
                    int i33 = i18 - iArr11[1];
                    int i34 = i19 - iArr11[2];
                    if (i12 == 0) {
                        iArr = iArr7;
                        iArr6[i28] = Math.min(i28 + i2 + 1, i4);
                    } else {
                        iArr = iArr7;
                    }
                    int i35 = iArr2[i14 + iArr6[i28]];
                    if ((i35 & -16777216) != 0) {
                        c = 0;
                        iArr11[0] = (i35 & 16711680) >> 16;
                        c3 = 1;
                        iArr11[1] = (i35 & 65280) >> 8;
                        c2 = 2;
                        iArr11[2] = i35 & 255;
                    } else {
                        c3 = 1;
                        c2 = 2;
                        c = 0;
                        iArr11[2] = 255;
                        iArr11[1] = 255;
                        iArr11[0] = 255;
                    }
                    int i36 = i20 + iArr11[c];
                    int i37 = i21 + iArr11[c3];
                    int i38 = i22 + iArr11[c2];
                    i26 = i29 + i36;
                    i15 = i30 + i37;
                    i16 = i31 + i38;
                    i27 = (i27 + 1) % i6;
                    int[] iArr12 = iArr9[i27 % i6];
                    i17 = i32 + iArr12[0];
                    i18 = i33 + iArr12[1];
                    i19 = i34 + iArr12[2];
                    i20 = i36 - iArr12[0];
                    i21 = i37 - iArr12[1];
                    i22 = i38 - iArr12[2];
                    i13++;
                    i28++;
                    iArr7 = iArr;
                }
                i14 += width;
                i12++;
                copy = copy;
                height = height;
                i5 = i5;
                iArr6 = iArr6;
            }
            int i39 = height;
            int i40 = i5;
            int i41 = 0;
            while (i41 < width) {
                int i42 = -i2;
                int i43 = 0;
                int i44 = 0;
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                int i48 = 0;
                int i49 = 0;
                int i50 = i42;
                int i51 = i42 * width;
                int i52 = 0;
                int i53 = 0;
                while (i50 <= i2) {
                    int max = Math.max(0, i51) + i41;
                    int[] iArr13 = iArr9[i50 + i2];
                    iArr13[0] = iArr3[max];
                    iArr13[1] = iArr4[max];
                    iArr13[2] = iArr5[max];
                    int abs2 = i11 - Math.abs(i50);
                    i52 += iArr3[max] * abs2;
                    i53 += iArr4[max] * abs2;
                    i43 += iArr5[max] * abs2;
                    if (i50 > 0) {
                        i47 += iArr13[0];
                        i48 += iArr13[1];
                        i49 += iArr13[2];
                    } else {
                        i44 += iArr13[0];
                        i45 += iArr13[1];
                        i46 += iArr13[2];
                    }
                    if (i50 < i40) {
                        i51 += width;
                    }
                    i50++;
                    i40 = i40;
                    width = width;
                }
                int i54 = i41;
                int i55 = i2;
                int i56 = i43;
                int i57 = i53;
                int i58 = 0;
                while (i58 < i39) {
                    iArr2[i54] = (iArr2[i54] & -16777216) | (iArr7[i52] << 16) | (iArr7[i57] << 8) | iArr7[i56];
                    int i59 = i52 - i44;
                    int i60 = i57 - i45;
                    int i61 = i56 - i46;
                    int[] iArr14 = iArr9[((i55 - i2) + i6) % i6];
                    int i62 = i44 - iArr14[0];
                    int i63 = i45 - iArr14[1];
                    int i64 = i46 - iArr14[2];
                    if (i41 == 0) {
                        iArr6[i58] = Math.min(i58 + i11, i40) * width;
                    }
                    int i65 = iArr6[i58] + i41;
                    iArr14[0] = iArr3[i65];
                    iArr14[1] = iArr4[i65];
                    iArr14[2] = iArr5[i65];
                    int i66 = i47 + iArr14[0];
                    int i67 = i48 + iArr14[1];
                    int i68 = i49 + iArr14[2];
                    i52 = i59 + i66;
                    i57 = i60 + i67;
                    i56 = i61 + i68;
                    i55 = (i55 + 1) % i6;
                    int[] iArr15 = iArr9[i55];
                    i44 = i62 + iArr15[0];
                    i45 = i63 + iArr15[1];
                    i46 = i64 + iArr15[2];
                    i47 = i66 - iArr15[0];
                    i48 = i67 - iArr15[1];
                    i49 = i68 - iArr15[2];
                    i54 += width;
                    i58++;
                    i2 = i;
                }
                i41++;
                i2 = i;
                i40 = i40;
                i39 = i39;
                i6 = i6;
                iArr2 = iArr2;
                width = width;
            }
            copy.setPixels(iArr2, 0, width, 0, 0, width, i39);
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m224129a(Context context, Bitmap bitmap, int i) {
        if (!C26326z.m95342f()) {
            return m224130a(bitmap, i);
        }
        try {
            return m224137b(context, bitmap, i);
        } catch (Throwable unused) {
            return m224130a(bitmap, i);
        }
    }

    /* renamed from: b */
    public static Bitmap m224137b(Context context, Bitmap bitmap, int i) {
        RenderScript create = RenderScript.create(context);
        Log.m165389i("ImageUtils", "scale size:" + bitmap.getWidth() + "*" + bitmap.getHeight());
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setInput(createFromBitmap);
        create2.setRadius((float) i);
        create2.forEach(createTyped);
        createTyped.copyTo(bitmap);
        create.destroy();
        return bitmap;
    }

    /* renamed from: a */
    public static String m224133a(String str, int i, int i2) {
        return "<figure><img src=\"" + str + "\" origin-width=\"" + i + "\" origin-height=\"" + i2 + "\"/></figure>";
    }

    /* renamed from: a */
    public static int[] m224135a(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (i5 > i3) {
            i7 = i3;
        } else {
            i7 = i5;
        }
        if (i6 > i4) {
            i8 = i4;
        } else {
            i8 = i6;
        }
        if (i2 <= 0) {
            i2 = i8;
        }
        if (i <= 0) {
            i = i7;
        }
        int[] iArr = new int[2];
        if (i2 >= i8 && i >= i7 && i2 <= i4 && i <= i3) {
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        } else if (i2 > i4) {
            int i13 = (int) ((((float) (i * i4)) * 1.0f) / ((float) i2));
            if (i13 < i7) {
                i12 = i7;
            } else {
                i12 = i13;
            }
            return m224135a(i12, i4, i3, i4, i7, i8);
        } else if (i > i3) {
            int i14 = (int) ((((float) (i2 * i3)) * 1.0f) / ((float) i));
            if (i14 < i8) {
                i11 = i8;
            } else {
                i11 = i14;
            }
            return m224135a(i3, i11, i3, i4, i7, i8);
        } else if (i2 < i8) {
            int i15 = (int) ((((float) (i * i8)) * 1.0f) / ((float) i2));
            if (i15 < i3) {
                i10 = i15;
            } else {
                i10 = i3;
            }
            return m224135a(i10, i8, i3, i4, i7, i8);
        } else if (i >= i7) {
            return iArr;
        } else {
            int i16 = (int) ((((float) (i2 * i7)) * 1.0f) / ((float) i));
            if (i16 < i4) {
                i9 = i16;
            } else {
                i9 = i4;
            }
            return m224135a(i7, i9, i3, i4, i7, i8);
        }
    }
}
