package com.bytedance.ee.bear.contract.net;

import com.bytedance.ee.bear.contract.NetService;

/* renamed from: com.bytedance.ee.bear.contract.net.a */
public class C5201a implements NetService.AbstractC5074c<DefaultResponse> {
    /* renamed from: a */
    public DefaultResponse parse(String str) throws NetService.ParseException {
        return new DefaultResponse(str);
    }
}
