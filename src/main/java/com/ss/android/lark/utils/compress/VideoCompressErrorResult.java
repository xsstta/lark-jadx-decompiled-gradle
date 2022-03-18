package com.ss.android.lark.utils.compress;

import com.larksuite.framework.callback.Entity.ErrorResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/utils/compress/VideoCompressErrorResult;", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "errorCode", "", "debugMsg", "", "(ILjava/lang/String;)V", "videoCompressResult", "Lcom/ss/android/lark/utils/compress/VideoCompressResult;", "getVideoCompressResult", "()Lcom/ss/android/lark/utils/compress/VideoCompressResult;", "setVideoCompressResult", "(Lcom/ss/android/lark/utils/compress/VideoCompressResult;)V", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoCompressErrorResult extends ErrorResult {
    private VideoCompressResult videoCompressResult;

    public final VideoCompressResult getVideoCompressResult() {
        return this.videoCompressResult;
    }

    public final void setVideoCompressResult(VideoCompressResult videoCompressResult2) {
        this.videoCompressResult = videoCompressResult2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoCompressErrorResult(int i, String str) {
        super(i, str);
        Intrinsics.checkParameterIsNotNull(str, "debugMsg");
    }
}
