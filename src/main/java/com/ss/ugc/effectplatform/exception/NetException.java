package com.ss.ugc.effectplatform.exception;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/exception/NetException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "status_code", "", "detailMessage", "", "(ILjava/lang/String;)V", "getStatus_code", "()I", "setStatus_code", "(I)V", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
public class NetException extends Exception {
    private int status_code;

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public NetException(int i, String str) {
        super(str);
        this.status_code = i;
    }
}
