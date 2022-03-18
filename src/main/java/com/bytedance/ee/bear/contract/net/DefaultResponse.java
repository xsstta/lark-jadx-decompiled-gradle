package com.bytedance.ee.bear.contract.net;

import com.bytedance.ee.bear.contract.NetService;

public class DefaultResponse extends NetService.Result<String> {
    public String response() {
        return (String) this.data;
    }

    public DefaultResponse(String str) {
        this.data = str;
    }
}
