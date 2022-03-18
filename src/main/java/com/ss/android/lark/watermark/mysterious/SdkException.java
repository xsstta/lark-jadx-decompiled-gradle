package com.ss.android.lark.watermark.mysterious;

import com.larksuite.framework.callback.Entity.ErrorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/SdkException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "message", "", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;Ljava/lang/String;)V", "getErrorResult", "()Lcom/larksuite/framework/callback/Entity/ErrorResult;", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SdkException extends RuntimeException {
    private final ErrorResult errorResult;

    public final ErrorResult getErrorResult() {
        return this.errorResult;
    }

    public SdkException(ErrorResult errorResult2, String str) {
        super(str);
        this.errorResult = errorResult2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SdkException(ErrorResult errorResult2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorResult2, (i & 2) != 0 ? null : str);
    }
}
