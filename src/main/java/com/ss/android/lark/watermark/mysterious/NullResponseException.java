package com.ss.android.lark.watermark.mysterious;

import com.larksuite.framework.callback.Entity.ErrorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/NullResponseException;", "Lcom/ss/android/lark/watermark/mysterious/SdkException;", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "message", "", "(Lcom/larksuite/framework/callback/Entity/ErrorResult;Ljava/lang/String;)V", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
public class NullResponseException extends SdkException {
    public NullResponseException(ErrorResult errorResult, String str) {
        super(errorResult, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NullResponseException(ErrorResult errorResult, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorResult, (i & 2) != 0 ? null : str);
    }
}
