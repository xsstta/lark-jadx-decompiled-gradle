package com.bytedance.bpea.basics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/bpea/basics/BPEAException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCode", "", "errorMsg", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMsg", "()Ljava/lang/String;", "basics_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BPEAException extends Exception {
    private final int errorCode;
    private final String errorMsg;

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BPEAException(int i, String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "errorMsg");
        this.errorCode = i;
        this.errorMsg = str;
    }
}
