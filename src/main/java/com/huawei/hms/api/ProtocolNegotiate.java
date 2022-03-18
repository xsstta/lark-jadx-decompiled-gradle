package com.huawei.hms.api;

import java.util.List;

public class ProtocolNegotiate {

    /* renamed from: b */
    private static ProtocolNegotiate f57858b = new ProtocolNegotiate();

    /* renamed from: a */
    private int f57859a = 1;

    public static ProtocolNegotiate getInstance() {
        return f57858b;
    }

    public int getVersion() {
        return this.f57859a;
    }

    public int negotiate(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            this.f57859a = 1;
            return 1;
        }
        if (!list.contains(2)) {
            this.f57859a = list.get(list.size() - 1).intValue();
        } else {
            this.f57859a = 2;
        }
        return this.f57859a;
    }
}
