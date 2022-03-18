package com.bytedance.ee.bear.contract.net;

import com.bytedance.ee.bear.contract.NetService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/contract/net/HttpErrorCode;", "", "()V", "CODE_NO_MEANING", "", "DRIVE_COPYING", "DRIVE_COPY_FAIL", "HTTP_FORBIDDEN", "TAG", "", "exceptionMessage", "throwable", "", "exceptionToCode", "isErrorCodeEqual", "", "httpErrorCode", "biz-net_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.contract.net.b */
public final class HttpErrorCode {

    /* renamed from: a */
    public static final HttpErrorCode f14916a = new HttpErrorCode();

    private HttpErrorCode() {
    }

    /* renamed from: a */
    public final int mo20804a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        if (th instanceof NetService.HttpErrorException) {
            return ((NetService.HttpErrorException) th).getCode();
        }
        return -1;
    }

    /* renamed from: b */
    public final String mo20805b(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        if (th instanceof NetService.HttpErrorException) {
            return ((NetService.HttpErrorException) th).getHttpStr();
        }
        return th.getMessage();
    }
}
