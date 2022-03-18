package com.bytedance.ee.bear.wiki.spacedetail;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;

/* renamed from: com.bytedance.ee.bear.wiki.spacedetail.d */
public class C12049d implements NetService.AbstractC5074c<NetService.Result<RoleBean>> {
    @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
    public NetService.Result<RoleBean> parse(String str) {
        return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<RoleBean>>() {
            /* class com.bytedance.ee.bear.wiki.spacedetail.C12049d.C120501 */
        }, new Feature[0]);
    }
}
