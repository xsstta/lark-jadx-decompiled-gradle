package com.bytedance.ee.eenet.httpclient.rust.exception;

import com.bytedance.ee.eenet.p598a.C12611a;
import java.io.IOException;

public class RustIOException extends IOException {
    private C12611a mRequestCallInfo;
    private final int mRustSdkErrorCode;

    public C12611a getRequestCallInfo() {
        return this.mRequestCallInfo;
    }

    public int getRustSdkErrorCode() {
        return this.mRustSdkErrorCode;
    }

    public void setRequestCallInfo(C12611a aVar) {
        this.mRequestCallInfo = aVar;
    }

    public RustIOException(String str, int i) {
        super(str);
        this.mRustSdkErrorCode = i;
    }

    public RustIOException(Throwable th, int i) {
        super(th);
        this.mRustSdkErrorCode = i;
    }
}
