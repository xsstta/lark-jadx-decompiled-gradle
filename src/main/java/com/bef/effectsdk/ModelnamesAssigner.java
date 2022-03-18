package com.bef.effectsdk;

public class ModelnamesAssigner {
    private static native int nativeSetAssignedModelNames(long j, String[] strArr, String[] strArr2);

    private static native int nativeSetAssignedModelNamesWithPriority(long j, String[] strArr, String[] strArr2, int[] iArr);

    private ModelnamesAssigner() {
    }
}
