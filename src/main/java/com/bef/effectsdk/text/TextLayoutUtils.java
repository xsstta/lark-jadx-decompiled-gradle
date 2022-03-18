package com.bef.effectsdk.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bef.effectsdk.text.data.BitmapType;
import com.bef.effectsdk.text.data.CharLayout;
import com.bef.effectsdk.text.data.TextBitmapResult;
import com.bef.effectsdk.text.data.TextLayoutParam;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

public class TextLayoutUtils {

    /* renamed from: com.bef.effectsdk.text.TextLayoutUtils$a */
    private enum EnumC2084a {
        COLOR_TYPE_RGBA,
        COLOR_TYPE_ALPHA
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bef.effectsdk.text.TextLayoutUtils$1 */
    public static /* synthetic */ class C20831 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7188a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7189b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                com.bef.effectsdk.text.TextLayoutUtils$a[] r0 = com.bef.effectsdk.text.TextLayoutUtils.EnumC2084a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bef.effectsdk.text.TextLayoutUtils.C20831.f7189b = r0
                r1 = 1
                com.bef.effectsdk.text.TextLayoutUtils$a r2 = com.bef.effectsdk.text.TextLayoutUtils.EnumC2084a.COLOR_TYPE_ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.bef.effectsdk.text.TextLayoutUtils.C20831.f7189b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bef.effectsdk.text.TextLayoutUtils$a r3 = com.bef.effectsdk.text.TextLayoutUtils.EnumC2084a.COLOR_TYPE_RGBA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bef.effectsdk.text.data.BitmapType[] r2 = com.bef.effectsdk.text.data.BitmapType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.bef.effectsdk.text.TextLayoutUtils.C20831.f7188a = r2
                com.bef.effectsdk.text.data.BitmapType r3 = com.bef.effectsdk.text.data.BitmapType.TEXT_BITMAP_SHAKE_ALPHA     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = com.bef.effectsdk.text.TextLayoutUtils.C20831.f7188a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bef.effectsdk.text.data.BitmapType r2 = com.bef.effectsdk.text.data.BitmapType.TEXT_BITMAP_NEON_ALPHA     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.C20831.<clinit>():void");
        }
    }

    public static String[] splitLyric(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            StringBuilder sb = new StringBuilder();
            if ((i3 % 5) % 3 == 0) {
                i = 6;
            } else {
                i = 10;
            }
            int i4 = 0;
            while (i2 < split.length && (split[i2].length() + i4 + 1 <= i || i4 <= 3)) {
                i4 += split[i2].length() + 1;
                int i5 = i2 + 1;
                sb.append(split[i2]);
                sb.append(" ");
                if (i5 == split.length - 1 && split[i5].length() < 3) {
                    sb.append(split[i5]);
                }
                i2 = i5;
            }
            i3++;
            arrayList.add(sb.substring(0, sb.length() - 1));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] lyricShakeSplit(String str) {
        boolean z;
        int i;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace(",", "").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < split.length) {
            if (!split[i2].isEmpty()) {
                int length = sb.toString().length();
                if (length == 0) {
                    if (split[i2].length() < 10) {
                        sb.append(split[i2]);
                    } else if (split[i2].length() == 10) {
                        arrayList.add(split[i2]);
                    } else {
                        arrayList.add(split[i2].substring(0, 10));
                        if ((split[i2].length() - 10) % 9 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i = (split[i2].length() - 10) / 9;
                        } else {
                            i = ((split[i2].length() - 10) / 9) + 1;
                        }
                        for (int i3 = 0; i3 < i; i3++) {
                            if (i3 != 0) {
                                int i4 = ((i3 - 1) * 9) + 19;
                                if (i3 < i - 1) {
                                    sb.append("-");
                                    sb.append(split[i2].substring(i4, (i3 * 9) + 19));
                                    String sb2 = sb.toString();
                                    arrayList.add(sb2);
                                    sb.delete(0, sb2.length());
                                } else if (z) {
                                    sb.append("-");
                                    sb.append(split[i2].substring(i4, (i3 * 9) + 19));
                                    String sb3 = sb.toString();
                                    arrayList.add(sb3);
                                    sb.delete(0, sb3.length());
                                } else {
                                    int length2 = split[i2].length();
                                    sb.append("-");
                                    sb.append(split[i2].substring(i4, length2));
                                    sb.toString();
                                }
                            } else if (z) {
                                sb.append("-");
                                sb.append(split[i2].substring(10, 19));
                                String sb4 = sb.toString();
                                arrayList.add(sb4);
                                sb.delete(0, sb4.length());
                            } else if (i == 1) {
                                int length3 = split[i2].length();
                                sb.append("-");
                                sb.append(split[i2].substring(10, length3));
                                sb.toString();
                            } else {
                                sb.append("-");
                                sb.append(split[i2].substring(10, 19));
                                String sb5 = sb.toString();
                                arrayList.add(sb5);
                                sb.delete(0, sb5.length());
                            }
                        }
                    }
                } else if (sb.toString().length() + split[i2].length() + 1 <= 10) {
                    sb.append(" ");
                    sb.append(split[i2]);
                } else {
                    arrayList.add(sb.toString());
                    sb.delete(0, length);
                    i2--;
                }
            }
            i2++;
        }
        if (sb.toString().length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return m9053b(new String(iArr, 0, iArr.length), textLayoutParam, EnumC2084a.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return m9053b(str, textLayoutParam, EnumC2084a.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return m9053b(new String(iArr, 0, iArr.length), textLayoutParam, EnumC2084a.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return m9053b(str, textLayoutParam, EnumC2084a.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return generateBitmapNeonAlphaUTF8(new String(iArr, 0, iArr.length), textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        int i = C20831.f7188a[BitmapType.valueOf(textLayoutParam.bitmapType).ordinal()];
        if (i == 1) {
            return generateTextAutoSizedShakeBitmap(str, textLayoutParam);
        }
        if (i != 2) {
            return null;
        }
        return generateTextAutoSizedNeonBitmap(str, textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return m9052a(new String(iArr, 0, iArr.length), textLayoutParam, EnumC2084a.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return m9052a(str, textLayoutParam, EnumC2084a.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length < 1) {
            return null;
        }
        return m9052a(new String(iArr, 0, iArr.length), textLayoutParam, EnumC2084a.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return m9052a(str, textLayoutParam, EnumC2084a.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateTextAutoSizedNeonBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        int[] iArr;
        float f;
        Paint.FontMetrics fontMetrics;
        Canvas canvas;
        StaticLayout staticLayout;
        float f2;
        float f3;
        float f4;
        String[] splitLyric = splitLyric(str);
        if (TextUtils.isEmpty(str) || textLayoutParam == null) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(C2085a.m9056a(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        boolean z2 = false;
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = splitLyric.length;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[splitLyric.length];
        int[] iArr2 = new int[splitLyric.length];
        float f5 = BitmapDescriptorFactory.HUE_RED;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < splitLyric.length; i++) {
            int i2 = 10;
            String str2 = splitLyric[i];
            textPaint.setTextSize((float) 10);
            for (float measureText = textPaint.measureText(str2, 0, str2.length()); measureText <= ((float) textLayoutParam.lineWidth); measureText = textPaint.measureText(str2, 0, str2.length())) {
                i2 += 2;
                textPaint.setTextSize((float) i2);
            }
            iArr2[i] = i2 - 2;
            textPaint.setTextSize((float) iArr2[i]);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            if (z) {
                f3 = fontMetrics2.bottom;
                f4 = fontMetrics2.top;
            } else {
                f3 = fontMetrics2.descent;
                f4 = fontMetrics2.ascent;
            }
            f6 += f3 - f4;
        }
        Bitmap createBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) f6, Bitmap.Config.ALPHA_8);
        Canvas canvas2 = new Canvas(createBitmap);
        textBitmapResult.bitmap = createBitmap;
        int i3 = 0;
        float f7 = BitmapDescriptorFactory.HUE_RED;
        while (i3 < splitLyric.length) {
            String str3 = splitLyric[i3];
            textPaint.setTextSize((float) iArr2[i3]);
            Paint.FontMetrics fontMetrics3 = textPaint.getFontMetrics();
            if (Build.VERSION.SDK_INT >= 23) {
                int length = str3.length();
                int width = canvas2.getWidth();
                int i4 = z2 ? 1 : 0;
                int i5 = z2 ? 1 : 0;
                int i6 = z2 ? 1 : 0;
                staticLayout = StaticLayout.Builder.obtain(str3, i4, length, textPaint, width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(f5, 1.0f).setIncludePad(z2).build();
                fontMetrics = fontMetrics3;
                canvas = canvas2;
                f = f6;
                iArr = iArr2;
            } else {
                fontMetrics = fontMetrics3;
                f = f6;
                iArr = iArr2;
                staticLayout = new StaticLayout(str3, 0, str3.length(), textPaint, canvas2.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, false);
                canvas = canvas2;
            }
            staticLayout.draw(canvas);
            CharLayout charLayout = new CharLayout();
            if (z) {
                f2 = fontMetrics.bottom - fontMetrics.top;
                charLayout.baseline = (f7 - fontMetrics.top) / f;
            } else {
                f2 = fontMetrics.descent - fontMetrics.ascent;
                charLayout.baseline = (f7 - fontMetrics.ascent) / f;
            }
            charLayout.top = f7 / f;
            f7 += f2;
            charLayout.bottom = f7 / f;
            charLayout.left = BitmapDescriptorFactory.HUE_RED;
            charLayout.right = 1.0f;
            textBitmapResult.charLayouts[i3] = charLayout;
            canvas.translate(BitmapDescriptorFactory.HUE_RED, f2);
            i3++;
            canvas2 = canvas;
            f6 = f;
            iArr2 = iArr;
            f5 = BitmapDescriptorFactory.HUE_RED;
            z2 = false;
        }
        return textBitmapResult;
    }

    public static TextBitmapResult generateTextAutoSizedShakeBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        String[] strArr;
        ArrayList arrayList;
        int i;
        TextPaint textPaint;
        float f;
        int i2;
        float f2;
        Paint.FontMetrics fontMetrics;
        StaticLayout staticLayout;
        String[] lyricShakeSplit = lyricShakeSplit(str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint2.setTypeface(C2085a.m9056a(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        textPaint2.setTextSize(textLayoutParam.fontSize);
        boolean z2 = false;
        if (textPaint2.getFontMetrics().top < textPaint2.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
        ArrayList arrayList2 = new ArrayList();
        float f3 = (float) textLayoutParam.lineWidth;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        int i3 = 0;
        int i4 = 0;
        while (i4 < lyricShakeSplit.length) {
            String str2 = lyricShakeSplit[i4];
            if (Build.VERSION.SDK_INT >= 23) {
                int i5 = z2 ? 1 : 0;
                int i6 = z2 ? 1 : 0;
                int i7 = z2 ? 1 : 0;
                staticLayout = StaticLayout.Builder.obtain(str2, i5, str2.length(), textPaint2, (int) f3).setAlignment(Layout.Alignment.ALIGN_OPPOSITE).setLineSpacing(f4, 1.0f).setIncludePad(z2).build();
                f2 = f5;
                i = i3;
                i2 = i4;
                f = f3;
                arrayList = arrayList2;
                textPaint = textPaint2;
                fontMetrics = fontMetrics2;
            } else {
                f2 = f5;
                i = i3;
                i2 = i4;
                f = f3;
                arrayList = arrayList2;
                textPaint = textPaint2;
                fontMetrics = fontMetrics2;
                staticLayout = new StaticLayout(str2, 0, str2.length(), textPaint2, (int) f3, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, BitmapDescriptorFactory.HUE_RED, false);
            }
            i3 = i + staticLayout.getLineCount();
            arrayList.add(staticLayout);
            float height = ((float) staticLayout.getHeight()) + f2;
            i4 = i2 + 1;
            arrayList2 = arrayList;
            fontMetrics2 = fontMetrics;
            f3 = f;
            textPaint2 = textPaint;
            f4 = BitmapDescriptorFactory.HUE_RED;
            z2 = false;
            f5 = height;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = i3;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[i3];
        Bitmap createBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) f5, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        textBitmapResult.bitmap = createBitmap;
        int i8 = 0;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        int i9 = 0;
        while (i8 < lyricShakeSplit.length) {
            float height2 = (float) ((StaticLayout) arrayList2.get(i8)).getHeight();
            float lineCount = height2 / ((float) ((StaticLayout) arrayList2.get(i8)).getLineCount());
            int i10 = 0;
            while (i10 < ((StaticLayout) arrayList2.get(i8)).getLineCount()) {
                CharLayout charLayout = new CharLayout();
                float lineWidth = ((StaticLayout) arrayList2.get(i8)).getLineWidth(i10);
                if (z) {
                    strArr = lyricShakeSplit;
                    charLayout.baseline = (f6 - fontMetrics2.top) / f5;
                } else {
                    strArr = lyricShakeSplit;
                    charLayout.baseline = (f6 - fontMetrics2.ascent) / f5;
                }
                charLayout.top = f6 / f5;
                f6 += lineCount;
                charLayout.bottom = (f6 - (Math.abs(fontMetrics2.bottom - fontMetrics2.descent) / 2.0f)) / f5;
                if (textLayoutParam.textAlign == 0) {
                    charLayout.left = BitmapDescriptorFactory.HUE_RED;
                    charLayout.right = (f3 - lineWidth) / f3;
                } else {
                    charLayout.left = (f3 - lineWidth) / f3;
                    charLayout.right = 1.0f;
                }
                textBitmapResult.charLayouts[i9] = charLayout;
                i9++;
                i10++;
                lyricShakeSplit = strArr;
                lineCount = lineCount;
            }
            ((StaticLayout) arrayList2.get(i8)).draw(canvas);
            canvas.translate(BitmapDescriptorFactory.HUE_RED, height2 * ((float) ((StaticLayout) arrayList2.get(i8)).getLineCount()));
            i8++;
            lyricShakeSplit = lyricShakeSplit;
        }
        return textBitmapResult;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bef.effectsdk.text.data.TextBitmapResult m9052a(java.lang.String r24, com.bef.effectsdk.text.data.TextLayoutParam r25, com.bef.effectsdk.text.TextLayoutUtils.EnumC2084a r26) {
        /*
        // Method dump skipped, instructions count: 792
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.m9052a(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$a):com.bef.effectsdk.text.data.TextBitmapResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c0, code lost:
        r25 = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0349 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0381 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0383  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bef.effectsdk.text.data.TextBitmapResult m9053b(java.lang.String r29, com.bef.effectsdk.text.data.TextLayoutParam r30, com.bef.effectsdk.text.TextLayoutUtils.EnumC2084a r31) {
        /*
        // Method dump skipped, instructions count: 1013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.m9053b(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$a):com.bef.effectsdk.text.data.TextBitmapResult");
    }
}
