package com.ss.android.medialib.camera;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IESCameraInterface {

    /* renamed from: a */
    public static final int[] f147433a = {2, 0, 1, 3};

    /* renamed from: b */
    public static final int[] f147434b = {1, 2, 0, 3};

    public enum CameraRatio {
        RATIO_18x9,
        RATIO_16x9,
        RATIO_4x3
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface FlashMode {
    }

    /* renamed from: a */
    int mo202230a();

    /* renamed from: a */
    int mo202231a(int i);

    /* renamed from: b */
    boolean mo202232b();
}
