package com.ss.android.ttve.common;

import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;

public class TEImageUtils {

    /* renamed from: a */
    private static final String f150192a = TEImageUtils.class.getSimpleName();

    private static native int nativeConvertFrame(VEFrame vEFrame, VEFrame vEFrame2, int i);

    static {
        TENativeLibsLoader.m234143a();
    }

    /* renamed from: a */
    public static int m233918a(VEFrame vEFrame, VEFrame vEFrame2, VEFrame.Operation operation) {
        return nativeConvertFrame(vEFrame, vEFrame2, operation.ordinal());
    }
}
