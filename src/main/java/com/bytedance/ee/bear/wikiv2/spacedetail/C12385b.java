package com.bytedance.ee.bear.wikiv2.spacedetail;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;

/* renamed from: com.bytedance.ee.bear.wikiv2.spacedetail.b */
public class C12385b implements NetService.AbstractC5074c<NetService.Result<WikiSpaceInfo>> {
    @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
    public NetService.Result<WikiSpaceInfo> parse(String str) {
        return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<WikiSpaceInfo>>() {
            /* class com.bytedance.ee.bear.wikiv2.spacedetail.C12385b.C123861 */
        }, new Feature[0]);
    }
}
