package com.ss.android.lark.cameraview;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.ss.android.lark.cameraview.C32743b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/cameraview/BaseAdaptation;", "Lcom/ss/android/lark/cameraview/TakingPhotoAdaptation;", "()V", "captureResult", "", "finalBitmap", "Landroid/graphics/Bitmap;", "nowAngle", "", "callback", "Lcom/ss/android/lark/cameraview/CameraInterface$TakePictureCallback;", "createOnPhotoTakenMatrix", "Landroid/graphics/Matrix;", "angle", "cameraview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.cameraview.a */
public final class BaseAdaptation implements TakingPhotoAdaptation {

    /* renamed from: a */
    public static final BaseAdaptation f84001a = new BaseAdaptation();

    private BaseAdaptation() {
    }

    @Override // com.ss.android.lark.cameraview.TakingPhotoAdaptation
    /* renamed from: a */
    public Matrix mo120678a(int i) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i);
        return matrix;
    }

    @Override // com.ss.android.lark.cameraview.TakingPhotoAdaptation
    /* renamed from: a */
    public void mo120679a(Bitmap bitmap, int i, C32743b.AbstractC32751e eVar) {
        Intrinsics.checkParameterIsNotNull(bitmap, "finalBitmap");
        if (i == 90 || i == 270) {
            if (eVar != null) {
                eVar.mo120714a(bitmap, true);
            }
        } else if (eVar != null) {
            eVar.mo120714a(bitmap, false);
        }
    }
}
