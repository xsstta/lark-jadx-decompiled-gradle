package com.bytedance.lark.sdk;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/lark/sdk/LarkNetProtocol;", "", "protocol", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getProtocol", "()Ljava/lang/String;", GrsBaseInfo.CountryCodeSource.UNKNOWN, "HTTP_1_1", "HTTP_2", "QUIC", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum LarkNetProtocol {
    UNKNOWN("unknown"),
    HTTP_1_1("http/1.1"),
    HTTP_2("h2"),
    QUIC("quic");
    
    private final String protocol;

    public final String getProtocol() {
        return this.protocol;
    }

    private LarkNetProtocol(String str) {
        this.protocol = str;
    }
}
