package com.larksuite.framework.callback.Entity;

import android.text.TextUtils;
import java.util.Locale;

public class ErrorResult extends Throwable {
    public static final ErrorResult TIMEOUT_ERROR = new ErrorResult(900, "Time out");
    private static boolean sDisplayMsgFeatureGating = true;
    private String mDebugMsg;
    private String mDisplayMsg;
    private int mErrorCode;
    private Exception mException = new Exception("unknown error");
    private String mRustDisplayMsg;

    public String getDebugMsg() {
        return this.mDebugMsg;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public Exception getException() {
        return this.mException;
    }

    public String getErrorMsg() {
        if (!TextUtils.isEmpty(this.mRustDisplayMsg)) {
            return this.mRustDisplayMsg;
        }
        return this.mDebugMsg;
    }

    public String getDisplayMsg() {
        if (!sDisplayMsgFeatureGating) {
            return getErrorMsg();
        }
        if (!TextUtils.isEmpty(this.mDisplayMsg)) {
            return this.mDisplayMsg;
        }
        return this.mRustDisplayMsg;
    }

    public String toString() {
        return String.format(Locale.US, "ErrorResult{code=%d, dbg=%s, display=%s, e=%s, fg=%b}", Integer.valueOf(this.mErrorCode), this.mDebugMsg, this.mDisplayMsg, this.mException, Boolean.valueOf(sDisplayMsgFeatureGating));
    }

    public static void setDisplayMsgFeatureGating(boolean z) {
        sDisplayMsgFeatureGating = z;
    }

    public void copyFrom(ErrorResult errorResult) {
        this.mErrorCode = errorResult.getErrorCode();
        this.mDebugMsg = errorResult.getDebugMsg();
        this.mDisplayMsg = errorResult.getDisplayMsg();
        this.mException = errorResult.getException();
        this.mRustDisplayMsg = errorResult.mRustDisplayMsg;
    }

    public ErrorResult(int i) {
        this.mErrorCode = i;
        this.mException = new Exception("errorCode  = " + i);
    }

    public String getDisplayMsg(String str) {
        if (sDisplayMsgFeatureGating && !TextUtils.isEmpty(this.mDisplayMsg)) {
            return this.mDisplayMsg;
        }
        return str;
    }

    public ErrorResult(Exception exc) {
        if (exc != null) {
            this.mDebugMsg = exc.getLocalizedMessage();
            this.mException = exc;
        }
    }

    public ErrorResult(String str) {
        this.mDebugMsg = str;
        this.mException = new Exception(str);
    }

    public ErrorResult(int i, String str) {
        this.mErrorCode = i;
        this.mDebugMsg = str;
        this.mException = new Exception(str);
    }

    public ErrorResult(String str, Exception exc) {
        this.mDebugMsg = str;
        if (exc != null) {
            this.mException = exc;
        }
    }

    public ErrorResult(int i, String str, String str2, String str3, Exception exc) {
        this.mErrorCode = i;
        this.mDebugMsg = str;
        this.mRustDisplayMsg = str2;
        this.mDisplayMsg = str3;
        if (exc != null) {
            this.mException = exc;
        }
    }
}
