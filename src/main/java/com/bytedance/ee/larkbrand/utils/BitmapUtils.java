package com.bytedance.ee.larkbrand.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/BitmapUtils;", "", "()V", "readPictureDegree", "", "path", "", "rotateImageView", "Landroid/graphics/Bitmap;", "angle", "bitmap", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.utils.b */
public final class BitmapUtils {

    /* renamed from: a */
    public static final BitmapUtils f35241a = new BitmapUtils();

    private BitmapUtils() {
    }

    /* renamed from: a */
    public final int mo49646a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final Bitmap mo49647a(int i, Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "Bitmap.createBitmap(bitm…map.height, matrix, true)");
        return createBitmap;
    }
}
