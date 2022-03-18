package com.ss.android.lark.cameraview;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.ss.android.lark.cameraview.C32743b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/cameraview/TakingPhotoAdaptation;", "", "captureResult", "", "finalBitmap", "Landroid/graphics/Bitmap;", "nowAngle", "", "callback", "Lcom/ss/android/lark/cameraview/CameraInterface$TakePictureCallback;", "createOnPhotoTakenMatrix", "Landroid/graphics/Matrix;", "angle", "cameraview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.cameraview.k */
public interface TakingPhotoAdaptation {
    /* renamed from: a */
    Matrix mo120678a(int i);

    /* renamed from: a */
    void mo120679a(Bitmap bitmap, int i, C32743b.AbstractC32751e eVar);
}
