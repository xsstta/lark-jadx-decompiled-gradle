package com.ss.android.vesdk.utils;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.ss.android.medialib.p2999b.C59381c;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.C64047r;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BitmapLoader {
    public static boolean isSampleSizeRound = false;
    public static int maxSide = 4096;

    public static int UpAlignPo2(int i, int i2) {
        return ((i + i2) - 1) & (~(i2 - 1));
    }

    public enum ImageRotation {
        INVALID(-1),
        ROTATION_0(0),
        ROTATION_90(90),
        ROTATION_180(180),
        ROTATION_270(270);
        
        private int value;

        public int getRotation() {
            return this.value;
        }

        private ImageRotation(int i) {
            this.value = i;
        }
    }

    private static Bitmap makeDimensionEven(Bitmap bitmap) {
        boolean z;
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z2 = true;
            if ((bitmap.getWidth() & 1) == 1) {
                width = bitmap.getWidth() - 1;
                z = true;
            } else {
                z = false;
            }
            if ((bitmap.getHeight() & 1) == 1) {
                height = bitmap.getHeight() - 1;
            } else {
                z2 = z;
            }
            if (!z2) {
                return bitmap;
            }
            if (width > 0) {
                if (height > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
                    bitmap.recycle();
                    return createBitmap;
                }
            }
            return null;
        } catch (OutOfMemoryError e) {
            C59381c.m230520b("makeDimensionEven", e.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e A[SYNTHETIC, Splitter:B:43:0x007e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point getPictureSize(android.content.ContentResolver r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.getPictureSize(android.content.ContentResolver, java.lang.String):android.graphics.Point");
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static Bitmap loadBitmap(String str, int i, int i2) {
        return loadBitmap(str, i, i2, ImageRotation.INVALID, true);
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2) {
        return loadBitmapCompat(contentResolver, str, i, i2, ImageRotation.INVALID, true);
    }

    private static int calculateInSampleSize(ContentResolver contentResolver, String str, int i, int i2) {
        if (i == -1 || i2 == -1) {
            return 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (!C64047r.m251372c(str)) {
            BitmapFactory.decodeFile(str, options);
        } else {
            Uri parse = Uri.parse(str);
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (contentResolver == null) {
                try {
                    C63929ab.m250980d("BitmapLoader", "contentResolver should not be null after Android Q");
                    return 1;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    if (0 != 0) {
                        parcelFileDescriptor.close();
                    }
                } catch (OutOfMemoryError e2) {
                    C59381c.m230520b("loadBitmap", e2.getMessage());
                    if (0 != 0) {
                        parcelFileDescriptor.close();
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        try {
                            openFileDescriptor.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return 1;
                }
                BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), new Rect(-1, -1, -1, -1), options);
                if (openFileDescriptor != null) {
                    try {
                        openFileDescriptor.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 0;
        if (i2 <= i) {
            i2 = i;
            i = i2;
        }
        if (i3 > i4) {
            i4 = i3;
            i3 = i4;
        }
        if (i3 > i || i4 > i2) {
            float f = ((float) i4) / ((float) i2);
            float f2 = ((float) i3) / ((float) i);
            if (isSampleSizeRound) {
                i5 = Math.round(Math.max(f2, f));
                while (Math.max(i4, i3) / i5 > maxSide) {
                    i5 *= 2;
                }
            } else {
                i5 = (int) Math.max(f2, f);
            }
        }
        return Math.max(1, i5);
    }

    public static Bitmap loadBitmap(String str, int i, int i2, ImageRotation imageRotation, boolean z) {
        return loadBitmap(str, i, i2, ImageRotation.INVALID, true, false);
    }

    public static int[] calAutoScale(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int[] iArr = new int[2];
        if (i > 0 || i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (i5 == 90 || i5 == 270) {
            i4 = i3;
            i3 = i4;
        }
        if (z) {
            if (i <= 0) {
                i = (i2 * i3) / i4;
            }
            if (i2 <= 0) {
                i2 = (i4 * i) / i3;
            }
            i3 = UpAlignPo2(i, 2);
            i4 = UpAlignPo2(i2, 2);
        }
        if (i5 == 90 || i5 == 270) {
            i4 = i3;
            i3 = i4;
        }
        iArr[0] = i3;
        iArr[1] = i4;
        return iArr;
    }

    public static Bitmap loadBitmap(String str, int i, int i2, ImageRotation imageRotation, boolean z, boolean z2) {
        return loadBitmap(str, i, i2, ImageRotation.INVALID, z, z2, false);
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2, ImageRotation imageRotation, boolean z) {
        return loadBitmapCompat(contentResolver, str, i, i2, ImageRotation.INVALID, true, false);
    }

    public static Bitmap loadBitmap(String str, int i, int i2, ImageRotation imageRotation, boolean z, boolean z2, boolean z3) {
        int i3;
        ExifInterface exifInterface;
        int i4 = i;
        int i5 = i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i4 > 0 && i5 > 0) {
            options.inSampleSize = calculateInSampleSize(null, str, i, i5);
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile == null) {
                C59381c.m230520b("loadBitmap", "BitmapFactory.decodeFile failed, imgPath" + str);
                return null;
            }
            if (z2) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, i, i5, true);
                if (!createScaledBitmap.sameAs(decodeFile) && decodeFile != null && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createScaledBitmap;
            }
            if (imageRotation == ImageRotation.INVALID) {
                try {
                    exifInterface = new ExifInterface(str);
                } catch (IOException e) {
                    e.printStackTrace();
                    exifInterface = null;
                }
                if (exifInterface != null) {
                    int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
                    if (attributeInt == 3) {
                        i3 = 180;
                    } else if (attributeInt == 6) {
                        i3 = 90;
                    } else if (attributeInt == 8) {
                        i3 = 270;
                    }
                }
                i3 = 0;
            } else {
                i3 = imageRotation.getRotation();
            }
            if (z3) {
                int[] calAutoScale = calAutoScale(i, i5, decodeFile.getWidth(), decodeFile.getHeight(), i3);
                int i6 = calAutoScale[0];
                i5 = calAutoScale[1];
                i4 = i6;
            }
            if (z2) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeFile, i4, i5, true);
                if (!createScaledBitmap2.sameAs(decodeFile) && decodeFile != null && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createScaledBitmap2;
            }
            if (i3 != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i3);
                Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                if (decodeFile != null && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createBitmap;
            }
            if (z) {
                return makeDimensionEven(decodeFile);
            }
            return decodeFile;
        } catch (OutOfMemoryError e2) {
            C59381c.m230520b("loadBitmap", e2.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092 A[SYNTHETIC, Splitter:B:35:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0116 A[SYNTHETIC, Splitter:B:72:0x0116] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmapCompat(android.content.ContentResolver r9, java.lang.String r10, int r11, int r12, com.ss.android.vesdk.utils.BitmapLoader.ImageRotation r13, boolean r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 287
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.loadBitmapCompat(android.content.ContentResolver, java.lang.String, int, int, com.ss.android.vesdk.utils.BitmapLoader$ImageRotation, boolean, boolean):android.graphics.Bitmap");
    }
}
