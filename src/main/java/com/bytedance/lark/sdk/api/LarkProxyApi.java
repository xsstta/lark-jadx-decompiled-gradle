package com.bytedance.lark.sdk.api;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/lark/sdk/api/LarkProxyApi;", "", "clearProxy", "", "setProxy", "ipAdder", "", "port", "proxyType", "Lcom/bytedance/lark/sdk/api/LarkProxyApi$ProxyType;", "ProxyType", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface LarkProxyApi {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/lark/sdk/api/LarkProxyApi$ProxyType;", "", "(Ljava/lang/String;I)V", "HTTP", "HTTPS", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ProxyType {
        HTTP,
        HTTPS
    }

    /* renamed from: a */
    void mo67173a();

    /* renamed from: a */
    void mo67174a(String str, String str2, ProxyType proxyType);
}
