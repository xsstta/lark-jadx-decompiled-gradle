package com.bytedance.ee.bear.wiki.spacedetail;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.wiki.spacedetail.b */
public class C12043b implements NetService.AbstractC5074c<NetService.Result<HashMap<String, SpaceBean>>> {
    @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
    public NetService.Result<HashMap<String, SpaceBean>> parse(String str) {
        return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<HashMap<String, SpaceBean>>>() {
            /* class com.bytedance.ee.bear.wiki.spacedetail.C12043b.C120441 */
        }, new Feature[0]);
    }
}
