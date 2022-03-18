package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmEditDenyType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "USED_BY_OTHERS", "OFFLINE", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum MmEditDenyType {
    USED_BY_OTHERS("1"),
    OFFLINE("2");
    
    private String value;

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.value = str;
    }

    private MmEditDenyType(String str) {
        this.value = str;
    }
}
