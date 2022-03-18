package com.amazing.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.regex.Pattern;

public class TextMeshUtils {
    private static float getDeviceDpi() {
        return (float) Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce A[SYNTHETIC, Splitter:B:49:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d5 A[SYNTHETIC, Splitter:B:56:0x00d5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] getAndroidSystemFontPaths() {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazing.utils.TextMeshUtils.getAndroidSystemFontPaths():java.lang.String[]");
    }

    /* renamed from: a */
    public static boolean m8539a(String str) {
        return Pattern.compile("^[A-Za-z0-9_]+$").matcher(str).matches();
    }

    private static Bitmap callIStaticGenerateBitmapForEmoji(byte[] bArr, int i) {
        String str = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((float) i);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawText(str, (float) (-rect.left), (float) (-rect.top), textPaint);
        canvas.save();
        canvas.restore();
        return createBitmap;
    }

    /* renamed from: a */
    private static int m8538a(Canvas canvas, String str, float f, float f2, Paint paint, int i) {
        int i2;
        int i3;
        Rect rect = new Rect();
        System.out.printf("the text space is: %d\n", Integer.valueOf(i));
        System.out.printf("the text length is: %d\n", Integer.valueOf(str.length()));
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            String valueOf = String.valueOf(charAt);
            Math.round(paint.measureText(String.valueOf(charAt)));
            if (charAt > 55296) {
                i4++;
                String str2 = String.valueOf(charAt) + str.charAt(i4);
                if (i4 != 1) {
                    paint.getTextBounds(str, i4, i4 + 1, rect);
                    rect.width();
                }
                int width = rect.width() + (i / 2);
                f += (float) width;
                i5 += width;
                if (canvas != null) {
                    canvas.drawText(str2, f, f2, paint);
                }
            } else {
                if (charAt == ' ') {
                    i2 = Math.round(paint.measureText(String.valueOf(str.charAt(i4)))) + i;
                } else {
                    paint.getTextBounds(str, i4, i4 + 1, rect);
                    if (charAt >= 128) {
                        i3 = rect.width() + (i / 2);
                        System.out.printf("%s is not NumOrLetters\n", Character.valueOf(charAt));
                    } else if (m8539a(valueOf)) {
                        i3 = rect.width() + i;
                        System.out.printf("%s is NumOrLetters\n", Character.valueOf(charAt));
                    } else {
                        i2 = rect.width() + (i * 2);
                        System.out.printf("%s is: %d, space is: %d, text is %d\n", Character.valueOf(str.charAt(i4)), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(rect.width()));
                    }
                    i2 = i3;
                    System.out.printf("%s is: %d, space is: %d, text is %d\n", Character.valueOf(str.charAt(i4)), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(rect.width()));
                }
                f += (float) i2;
                i5 += i2;
                if (canvas != null) {
                    canvas.drawText(String.valueOf(str.charAt(i4)), f, f2, paint);
                }
            }
            i4++;
        }
        return i5;
    }

    private static float[] generateImageSize(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        float[] fArr = new float[str2.length()];
        textPaint.getTextWidths(str2, fArr);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        if (!z) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (!z2) {
            f3 = BitmapDescriptorFactory.HUE_RED;
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        return new float[]{(float) rect.left, (float) rect.right, (float) (-rect.bottom), (float) (-rect.top), fArr[0], (f2 + Math.max(Math.abs(f3), Math.abs(f4))) * f, textPaint.ascent(), textPaint.descent()};
    }

    private static Bitmap generateImage(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        float f6;
        float f7;
        float f8;
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        float[] fArr = new float[str2.length()];
        textPaint.getTextWidths(str2, fArr);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        Log.i("AE_TEXT_TAG", "paint1 left:" + rect.left + " right:" + rect.right + " bottom:" + rect.bottom + " top:" + rect.top + " advance:" + fArr[0]);
        float f9 = BitmapDescriptorFactory.HUE_RED;
        if (!z) {
            f6 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f6 = f2;
        }
        if (!z2) {
            f8 = BitmapDescriptorFactory.HUE_RED;
            f7 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f9 = f3;
            f8 = f4;
            f7 = f5;
        }
        float max = Math.max(Math.abs(f9), Math.abs(f8)) + f6;
        TextPaint textPaint2 = new TextPaint();
        if (z || z2) {
            textPaint2.setTextSize(f);
            textPaint2.setAntiAlias(true);
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setTextAlign(Paint.Align.LEFT);
            textPaint2.setStrokeWidth(f6 * 2.0f * f);
            textPaint2.setColor(i2);
            if (z2) {
                textPaint2.setShadowLayer(f7 * f, f9 * f, f8 * f, i3);
            }
        }
        float f10 = 2.0f * max * f;
        Bitmap createBitmap = Bitmap.createBitmap((int) (((float) rect.width()) + f10), (int) (((float) rect.height()) + f10), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (z || z2) {
            float f11 = max * f;
            canvas.drawText(str2, ((float) (-rect.left)) + f11, ((float) (-rect.top)) + f11, textPaint2);
        }
        float f12 = max * f;
        canvas.drawText(str2, ((float) (-rect.left)) + f12, ((float) (-rect.top)) + f12, textPaint);
        canvas.save();
        canvas.restore();
        return createBitmap;
    }

    private static Bitmap callIStaticGenerateBitmapFromTextMesh(byte[] bArr, String str, int i, int i2, int i3, float f, int i4, float f2, int i5, float f3, float f4, float f5, int i6, int i7, int i8, int i9) {
        float f6;
        Bitmap bitmap;
        String str2;
        float f7;
        float f8;
        Paint.FontMetrics fontMetrics;
        int i10;
        Canvas canvas;
        float f9;
        Canvas canvas2;
        int i11;
        int i12 = i3;
        String str3 = new String(bArr);
        Rect rect = new Rect(0, 0, i8, i9);
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        Canvas canvas3 = new Canvas(createBitmap);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i2);
        float f10 = (float) i;
        textPaint.setTextSize(f10);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        if (i7 == 0) {
            textPaint.setTextAlign(Paint.Align.LEFT);
        } else if (i7 == 1) {
            textPaint.setTextAlign(Paint.Align.CENTER);
        } else {
            textPaint.setTextAlign(Paint.Align.RIGHT);
        }
        if ((i4 & 16) == 16) {
            textPaint.setUnderlineText(true);
        }
        if ((i4 & 32) == 32) {
            textPaint.setStrikeThruText(true);
        }
        if ((i4 & 4) == 4) {
            textPaint.setTextSkewX((-f) / 90.0f);
        }
        if ((i4 & 8) == 8) {
            textPaint.setFakeBoldText(true);
        }
        if ((i4 & 2) == 2) {
            textPaint.setShadowLayer(f3, f4, f5, i6);
        }
        Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
        float f11 = fontMetrics2.top;
        float f12 = fontMetrics2.bottom;
        String[] split = str3.split("\n");
        int length = split.length;
        if ((i4 & 1) == 1) {
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setColor(i5);
            textPaint2.setTextSize(textPaint.getTextSize());
            textPaint2.setAntiAlias(textPaint.isAntiAlias());
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setStrokeWidth((5.0f * f2) / f10);
            textPaint2.setTextAlign(textPaint.getTextAlign());
            textPaint2.setTextSkewX(textPaint.getTextSkewX());
            textPaint.setFakeBoldText(false);
            textPaint2.setFakeBoldText(true);
            float f13 = ((float) i12) / f10;
            bitmap = createBitmap;
            f6 = f10;
            float f14 = (-fontMetrics2.ascent) + fontMetrics2.descent;
            float f15 = f14 * 0.1f;
            fontMetrics = fontMetrics2;
            int i13 = 0;
            while (i13 < length) {
                int centerY = (int) (((double) ((int) ((((float) rect.centerY()) - (f11 / 2.0f)) - (f12 / 2.0f)))) - (((((double) (length - 1)) * 0.5d) - ((double) i13)) * ((double) (f15 + f14))));
                if (Build.VERSION.SDK_INT >= 21) {
                    textPaint2.setLetterSpacing(f13);
                    if (i7 == 0) {
                        canvas2 = canvas3;
                        canvas2.drawText(split[i13], (float) rect.left, (float) centerY, textPaint2);
                    } else {
                        canvas2 = canvas3;
                        if (i7 == 1) {
                            canvas2.drawText(split[i13], (float) rect.centerX(), (float) centerY, textPaint2);
                        } else {
                            canvas2.drawText(split[i13], (float) rect.right, (float) centerY, textPaint2);
                        }
                    }
                    f9 = f14;
                } else {
                    canvas2 = canvas3;
                    Rect rect2 = new Rect();
                    textPaint.getTextBounds(split[i13], 0, split[i13].length(), rect2);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < split[i13].length()) {
                        if (split[i13].charAt(i14) > 55296) {
                            i14++;
                            i15++;
                        }
                        i14++;
                        f14 = f14;
                    }
                    f9 = f14;
                    if (i7 == 0) {
                        m8538a(canvas2, split[i13], BitmapDescriptorFactory.HUE_RED, (float) centerY, textPaint2, i3);
                    } else {
                        if (i7 == 1) {
                            i11 = i3;
                            m8538a(canvas2, split[i13], (float) ((((rect.width() - rect2.width()) + (i15 * i)) - ((str3.length() - 1) * i11)) / 2), (float) centerY, textPaint2, i3);
                        } else {
                            i11 = i3;
                            m8538a(canvas2, split[i13], (float) (((rect.width() - rect2.width()) + (i15 * i)) - ((str3.length() - 1) * i11)), (float) centerY, textPaint2, i3);
                        }
                        i13++;
                        i12 = i11;
                        canvas3 = canvas2;
                        f11 = f11;
                        f12 = f12;
                        str3 = str3;
                        f14 = f9;
                    }
                }
                i11 = i3;
                i13++;
                i12 = i11;
                canvas3 = canvas2;
                f11 = f11;
                f12 = f12;
                str3 = str3;
                f14 = f9;
            }
            i10 = i12;
            str2 = str3;
            f8 = f11;
            f7 = f12;
        } else {
            bitmap = createBitmap;
            str2 = str3;
            f6 = f10;
            fontMetrics = fontMetrics2;
            f8 = f11;
            f7 = f12;
            i10 = i12;
        }
        Canvas canvas4 = canvas3;
        float f16 = ((float) i10) / f6;
        float f17 = (-fontMetrics.ascent) + fontMetrics.descent;
        float f18 = 0.1f * f17;
        int i16 = 0;
        while (i16 < length) {
            int centerY2 = (int) (((double) ((int) ((((float) rect.centerY()) - (f8 / 2.0f)) - (f7 / 2.0f)))) - (((((double) (length - 1)) * 0.5d) - ((double) i16)) * ((double) (f18 + f17))));
            if (Build.VERSION.SDK_INT >= 21) {
                textPaint.setLetterSpacing(f16);
                if (i7 == 0) {
                    canvas = canvas4;
                    canvas.drawText(split[i16], (float) rect.left, (float) centerY2, textPaint);
                } else {
                    canvas = canvas4;
                    if (i7 == 1) {
                        canvas.drawText(split[i16], (float) rect.centerX(), (float) centerY2, textPaint);
                    } else {
                        canvas.drawText(split[i16], (float) rect.right, (float) centerY2, textPaint);
                    }
                }
            } else {
                canvas = canvas4;
                Rect rect3 = new Rect();
                textPaint.getTextBounds(split[i16], 0, split[i16].length(), rect3);
                int i17 = 0;
                int i18 = 0;
                while (i17 < split[i16].length()) {
                    if (split[i16].charAt(i17) > 55296) {
                        i17++;
                        i18++;
                    }
                    i17++;
                }
                if (i7 == 0) {
                    m8538a(canvas, split[i16], BitmapDescriptorFactory.HUE_RED, (float) centerY2, textPaint, i3);
                } else if (i7 == 1) {
                    m8538a(canvas, split[i16], (float) ((((rect.width() - rect3.width()) + (i18 * i)) - ((str2.length() - 1) * i10)) / 2), (float) centerY2, textPaint, i3);
                } else {
                    m8538a(canvas, split[i16], (float) (((rect.width() - rect3.width()) + (i18 * i)) - ((str2.length() - 1) * i10)), (float) centerY2, textPaint, i3);
                }
            }
            i16++;
            rect = rect;
            canvas4 = canvas;
            length = length;
        }
        canvas4.save();
        canvas4.restore();
        return bitmap;
    }
}
