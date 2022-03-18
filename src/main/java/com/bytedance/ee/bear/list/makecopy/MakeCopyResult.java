package com.bytedance.ee.bear.list.makecopy;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/list/makecopy/MakeCopyResult;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "()V", "obj_token", "", "token", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getObj_token", "()Ljava/lang/String;", "getToken", "getUrl", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MakeCopyResult extends NetService.Result<Serializable> {
    private final String obj_token;
    private final String token;
    private final String url;

    public final String getObj_token() {
        return this.obj_token;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUrl() {
        return this.url;
    }

    public MakeCopyResult() {
        this("", "", "");
    }

    public MakeCopyResult(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "obj_token");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "url");
        this.obj_token = str;
        this.token = str2;
        this.url = str3;
    }
}
