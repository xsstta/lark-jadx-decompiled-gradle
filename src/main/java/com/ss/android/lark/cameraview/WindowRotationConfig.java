package com.ss.android.lark.cameraview;

import android.view.Display;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.vesdk.VESize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/cameraview/WindowRotationConfig;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "degrees", "", "getDegrees", "()I", "layoutParamsHeight", "getLayoutParamsHeight", "layoutParamsWidth", "getLayoutParamsWidth", "previewRotation", "getPreviewRotation", "()Ljava/lang/Integer;", "sceneMode", "", "getSceneMode", "()Ljava/lang/String;", "renderSizeOf", "Lcom/ss/android/vesdk/VESize;", "previewSize", "", "cameraview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.cameraview.n */
public final class WindowRotationConfig {

    /* renamed from: a */
    private final int f84173a;

    /* renamed from: a */
    public final String mo120790a() {
        int i = this.f84173a;
        if (i == 90 || i == 270) {
            return "landscape";
        }
        return "portrait";
    }

    /* renamed from: b */
    public final int mo120791b() {
        int i = this.f84173a;
        if (i == 90 || i == 270) {
            return -1;
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo120792c() {
        int i = this.f84173a;
        if (i == 90 || i == 270) {
            return 0;
        }
        return -1;
    }

    public WindowRotationConfig(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        WindowManager windowManager = fragmentActivity.getWindowManager();
        Intrinsics.checkExpressionValueIsNotNull(windowManager, "activity.windowManager");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Intrinsics.checkExpressionValueIsNotNull(defaultDisplay, "activity.windowManager.defaultDisplay");
        int rotation = defaultDisplay.getRotation();
        int i = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        this.f84173a = i;
    }

    /* renamed from: a */
    public final VESize mo120789a(int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "previewSize");
        int i = this.f84173a;
        if (i == 90 || i == 270) {
            return new VESize(iArr[1], iArr[0]);
        }
        return new VESize(iArr[0], iArr[1]);
    }
}
