package com.ss.android.lark.mm.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/utils/MmRxThrowable;", "", "errorCode", "", "errorMessage", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmRxThrowable extends Throwable {
    private final int errorCode;
    private final String errorMessage;

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRxThrowable(int i, String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "errorMessage");
        this.errorCode = i;
        this.errorMessage = str;
    }
}
