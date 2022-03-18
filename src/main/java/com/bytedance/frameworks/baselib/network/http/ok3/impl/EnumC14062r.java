package com.bytedance.frameworks.baselib.network.http.ok3.impl;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.r */
enum EnumC14062r {
    NOT_SET(0),
    SERVE_FROM_CACHE(2),
    SERVE_FROM_PREFER_ADDR(5),
    SERVE_FROM_HTTP_DNS_JOB(6),
    SERVE_FROM_PROC_DNS_JOB(8),
    SERVE_FROM_HARDCODE_HOSTS(9),
    SERVE_FROM_BATCH_PRELOAD(19),
    SERVE_FROM_ASYNC_BATCH_PRELOAD(20);
    
    final int mValue;

    private EnumC14062r(int i) {
        this.mValue = i;
    }
}
