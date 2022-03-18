package com.bytedance.frameworks.baselib.network.http.ok3.impl;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.b */
enum EnumC14022b {
    CONNECTION_INFO_UNKNOWN(0),
    CONNECTION_INFO_HTTP1_1(1),
    CONNECTION_INFO_DEPRECATED_SPDY3(3),
    CONNECTION_INFO_HTTP2(4),
    CONNECTION_INFO_QUIC_UNKNOWN_VERSION(5),
    CONNECTION_INFO_HTTP1_0(9);
    
    final int mValue;

    private EnumC14022b(int i) {
        this.mValue = i;
    }
}
