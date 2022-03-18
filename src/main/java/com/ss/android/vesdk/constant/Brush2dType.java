package com.ss.android.vesdk.constant;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/vesdk/constant/Brush2dType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "BRUSH2D_TYPE_COLOR", "BRUSH2D_TYPE_SAMPLER", "BRUSH2D_TYPE_MASK", "BRUSH2D_TYPE_STICKER", "BRUSH2D_TYPE_ERASER", "veimage_release"}, mo238835k = 1, mv = {1, 1, 13})
public enum Brush2dType {
    BRUSH2D_TYPE_COLOR(0),
    BRUSH2D_TYPE_SAMPLER(1),
    BRUSH2D_TYPE_MASK(2),
    BRUSH2D_TYPE_STICKER(4),
    BRUSH2D_TYPE_ERASER(8);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    protected Brush2dType(int i) {
        this.value = i;
    }
}
