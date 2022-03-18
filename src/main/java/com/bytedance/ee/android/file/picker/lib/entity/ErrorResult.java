package com.bytedance.ee.android.file.picker.lib.entity;

import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0013\b\u0016\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n¢\u0006\u0002\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n¢\u0006\u0002\u0010\u000eB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000J\b\u0010\u001c\u001a\u00020\u0006H\u0016R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u00060\tj\u0002`\n2\n\u0010\u0010\u001a\u00060\tj\u0002`\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/entity/ErrorResult;", "", "errorCode", "", "(I)V", "_errorMsg", "", "(Ljava/lang/String;)V", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "(ILjava/lang/String;)V", "(ILjava/lang/Exception;)V", "(Ljava/lang/String;Ljava/lang/Exception;)V", "(ILjava/lang/String;Ljava/lang/Exception;)V", "<set-?>", "getErrorCode", "()I", "errorMsg", "getErrorMsg", "()Ljava/lang/String;", ApiHandler.API_CALLBACK_EXCEPTION, "getException", "()Ljava/lang/Exception;", "copyFrom", "", "errorResult", "toString", "Companion", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ErrorResult extends Throwable {
    public static final Companion Companion = new Companion(null);
    public static final ErrorResult TIMEOUT_ERROR = new ErrorResult(900, "Time out");
    private int errorCode;
    private String errorMsg;
    private Exception exception = new Exception("unknown error");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/entity/ErrorResult$Companion;", "", "()V", "TIMEOUT_ERROR", "Lcom/bytedance/ee/android/file/picker/lib/entity/ErrorResult;", "getTIMEOUT_ERROR", "()Lcom/bytedance/ee/android/file/picker/lib/entity/ErrorResult;", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.entity.ErrorResult$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final Exception getException() {
        return this.exception;
    }

    public String toString() {
        return "ErrorResult{_errorCode=" + this.errorCode + ", _errorMsg='" + this.errorMsg + "'" + ", _exception=" + this.exception + "}";
    }

    public final void copyFrom(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        this.errorCode = errorResult.errorCode;
        this.errorMsg = errorResult.errorMsg;
        this.exception = errorResult.exception;
    }

    public ErrorResult(int i) {
        this.errorCode = i;
        this.exception = new Exception("errorCode  = " + i);
    }

    public ErrorResult(Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, "e");
        this.exception = exc;
    }

    public ErrorResult(String str) {
        Intrinsics.checkParameterIsNotNull(str, "_errorMsg");
        this.errorMsg = str;
        this.exception = new Exception(str);
    }

    public ErrorResult(int i, Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, "e");
        this.errorCode = i;
        this.exception = exc;
    }

    public ErrorResult(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "_errorMsg");
        this.errorCode = i;
        this.errorMsg = str;
        this.exception = new Exception(str);
    }

    public ErrorResult(String str, Exception exc) {
        Intrinsics.checkParameterIsNotNull(str, "_errorMsg");
        Intrinsics.checkParameterIsNotNull(exc, "e");
        this.errorMsg = str;
        this.exception = exc;
    }

    public ErrorResult(int i, String str, Exception exc) {
        Intrinsics.checkParameterIsNotNull(str, "_errorMsg");
        Intrinsics.checkParameterIsNotNull(exc, "e");
        this.errorCode = i;
        this.errorMsg = str;
        this.exception = exc;
    }
}
