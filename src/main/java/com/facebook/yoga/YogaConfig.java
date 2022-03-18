package com.facebook.yoga;

public class YogaConfig {
    public static int SPACING_TYPE = 1;
    private YogaLogger mLogger;
    long mNativePointer;
    private YogaNodeCloneFunction mYogaNodeCloneFunction;

    private native void jni_YGConfigFree(long j);

    private native long jni_YGConfigNew();

    private native void jni_YGConfigSetExperimentalFeatureEnabled(long j, int i, boolean z);

    private native void jni_YGConfigSetHasCloneNodeFunc(long j, boolean z);

    private native void jni_YGConfigSetLogger(long j, Object obj);

    private native void jni_YGConfigSetPointScaleFactor(long j, float f);

    private native void jni_YGConfigSetPrintTreeFlag(long j, boolean z);

    private native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseWebDefaults(long j, boolean z);

    static {
        YogaJNI.init();
    }

    public YogaLogger getLogger() {
        return this.mLogger;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            jni_YGConfigFree(this.mNativePointer);
        } finally {
            super.finalize();
        }
    }

    public YogaConfig() {
        long jni_YGConfigNew = jni_YGConfigNew();
        this.mNativePointer = jni_YGConfigNew;
        if (jni_YGConfigNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public void setLogger(YogaLogger yogaLogger) {
        this.mLogger = yogaLogger;
        jni_YGConfigSetLogger(this.mNativePointer, yogaLogger);
    }

    public void setPointScaleFactor(float f) {
        jni_YGConfigSetPointScaleFactor(this.mNativePointer, f);
    }

    public void setPrintTreeFlag(boolean z) {
        jni_YGConfigSetPrintTreeFlag(this.mNativePointer, z);
    }

    public void setShouldDiffLayoutWithoutLegacyStretchBehaviour(boolean z) {
        jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(this.mNativePointer, z);
    }

    public void setUseLegacyStretchBehaviour(boolean z) {
        jni_YGConfigSetUseLegacyStretchBehaviour(this.mNativePointer, z);
    }

    public void setUseWebDefaults(boolean z) {
        jni_YGConfigSetUseWebDefaults(this.mNativePointer, z);
    }

    public void setOnCloneNode(YogaNodeCloneFunction yogaNodeCloneFunction) {
        boolean z;
        this.mYogaNodeCloneFunction = yogaNodeCloneFunction;
        long j = this.mNativePointer;
        if (yogaNodeCloneFunction != null) {
            z = true;
        } else {
            z = false;
        }
        jni_YGConfigSetHasCloneNodeFunc(j, z);
    }

    public void setExperimentalFeatureEnabled(YogaExperimentalFeature yogaExperimentalFeature, boolean z) {
        jni_YGConfigSetExperimentalFeatureEnabled(this.mNativePointer, yogaExperimentalFeature.intValue(), z);
    }

    private final YogaNode cloneNode(YogaNode yogaNode, YogaNode yogaNode2, int i) {
        return this.mYogaNodeCloneFunction.cloneNode(yogaNode, yogaNode2, i);
    }
}
