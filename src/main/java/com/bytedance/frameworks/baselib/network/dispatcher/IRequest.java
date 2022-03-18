package com.bytedance.frameworks.baselib.network.dispatcher;

public interface IRequest {

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* renamed from: a */
    Priority mo51318a();

    /* renamed from: b */
    int mo51319b();
}
