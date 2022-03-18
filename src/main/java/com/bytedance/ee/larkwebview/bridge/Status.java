package com.bytedance.ee.larkwebview.bridge;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/larkwebview/bridge/Status;", "", UpdateKey.STATUS, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "SUCCESS", "FAILURE", "CANCEL", "TIMEOUT", "PROGRESS", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum Status {
    SUCCESS("success"),
    FAILURE("failure"),
    CANCEL("cancel"),
    TIMEOUT("timeout"),
    PROGRESS("progress");
    
    private final String status;

    public final String getStatus() {
        return this.status;
    }

    private Status(String str) {
        this.status = str;
    }
}
