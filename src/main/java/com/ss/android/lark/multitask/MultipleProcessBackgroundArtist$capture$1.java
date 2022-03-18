package com.ss.android.lark.multitask;

import android.os.ParcelFileDescriptor;
import com.ss.android.lark.multitask.task.ScreenshotCapturedCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/multitask/MultipleProcessBackgroundArtist$capture$1", "Lcom/ss/android/lark/multitask/task/ScreenshotCapturedCallback$Stub;", "onScreenshotCaptured", "", "width", "", "height", "descriptor", "Landroid/os/ParcelFileDescriptor;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MultipleProcessBackgroundArtist$capture$1 extends ScreenshotCapturedCallback.Stub {
    final /* synthetic */ MultipleProcessBackgroundArtist this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MultipleProcessBackgroundArtist$capture$1(MultipleProcessBackgroundArtist dVar) {
        this.this$0 = dVar;
    }

    @Override // com.ss.android.lark.multitask.task.ScreenshotCapturedCallback
    public void onScreenshotCaptured(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        Intrinsics.checkParameterIsNotNull(parcelFileDescriptor, "descriptor");
        this.this$0.mo168899a(i, i2, parcelFileDescriptor);
    }
}
