package com.ss.android.ttve.nativePort;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;

public class TEImageFactory {

    public static class ImageInfo {
        Bitmap bitmap;
        int height;
        String mimeType;
        int rotation;
        int width;

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public int getHeight() {
            return this.height;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getWidth() {
            return this.width;
        }
    }

    public static void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str) {
        return decodeFile(contentResolver, str, null, 0, 0, -1);
    }

    public static String getImageColorSpace(ContentResolver contentResolver, String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return "Unknown";
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeFileCompat(contentResolver, str, options);
        if (options.outColorSpace != null) {
            return options.outColorSpace.getName();
        }
        return "Unknown";
    }

    public static ImageInfo getImageInfo(ContentResolver contentResolver, String str) {
        String str2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeFileCompat(contentResolver, str, options);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = options.outWidth;
        imageInfo.height = options.outHeight;
        imageInfo.mimeType = options.outMimeType;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf + 1 >= str.length()) {
            str2 = null;
        } else {
            str2 = str.substring(str.lastIndexOf(46) + 1);
        }
        if (!(imageInfo.mimeType == null || str2 == null || !str2.equals("mpg"))) {
            imageInfo.mimeType = null;
        }
        return imageInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x008c A[SYNTHETIC, Splitter:B:59:0x008c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getRotation(android.content.ContentResolver r3, java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEImageFactory.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077 A[SYNTHETIC, Splitter:B:28:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099 A[SYNTHETIC, Splitter:B:36:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9 A[SYNTHETIC, Splitter:B:43:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010f A[SYNTHETIC, Splitter:B:80:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeFileCompat(android.content.ContentResolver r7, java.lang.String r8, android.graphics.BitmapFactory.Options r9) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEImageFactory.decodeFileCompat(android.content.ContentResolver, java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str, BitmapFactory.Options options, int i, int i2, int i3) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (i3 == 0) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            } else if (i3 == 1) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
            }
        }
        if (i > 0 && i2 > 0) {
            options.inJustDecodeBounds = true;
            decodeFileCompat(contentResolver, str, options);
            int calBestSampleSize = TEJpegUtils.calBestSampleSize(options.outWidth, options.outHeight, i, i2);
            if (calBestSampleSize > 0) {
                options.inSampleSize = calBestSampleSize;
            }
            options.inJustDecodeBounds = false;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeFileCompat = decodeFileCompat(contentResolver, str, options);
        if (decodeFileCompat == null) {
            return null;
        }
        if (decodeFileCompat.getConfig() != Bitmap.Config.ARGB_8888) {
            Bitmap copy = decodeFileCompat.copy(Bitmap.Config.ARGB_8888, false);
            recycleBitmap(decodeFileCompat);
            decodeFileCompat = copy;
        }
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = decodeFileCompat.getWidth();
        imageInfo.height = decodeFileCompat.getHeight();
        imageInfo.bitmap = decodeFileCompat;
        imageInfo.mimeType = "bitmap";
        imageInfo.rotation = getRotation(contentResolver, str);
        return imageInfo;
    }
}
