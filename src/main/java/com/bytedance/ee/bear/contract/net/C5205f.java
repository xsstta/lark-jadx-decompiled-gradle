package com.bytedance.ee.bear.contract.net;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;

/* renamed from: com.bytedance.ee.bear.contract.net.f */
public class C5205f implements NetService.AbstractC5074c<SimpleRequestResult> {
    /* renamed from: a */
    public SimpleRequestResult parse(String str) throws NetService.ParseException {
        return (SimpleRequestResult) JSON.parseObject(str, SimpleRequestResult.class);
    }
}
