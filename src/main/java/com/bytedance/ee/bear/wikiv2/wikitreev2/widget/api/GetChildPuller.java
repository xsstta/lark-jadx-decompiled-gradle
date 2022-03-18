package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.alibaba.fastjson.TypeReference;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

public class GetChildPuller extends AbstractC12451a<Params, HashMap<String, List<TreeNode>>> {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12451a
    /* renamed from: a */
    public Type mo47405a() throws IllegalStateException {
        return new TypeReference<NetService.Result<HashMap<String, List<TreeNode>>>>() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetChildPuller.C124501 */
        }.getType();
    }

    public static class Params implements NonProguard {
        public String space_id;
        public String wiki_token;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + '}';
        }

        public Params(String str, String str2) {
            this.space_id = str;
            this.wiki_token = str2;
        }
    }

    GetChildPuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/tree/get_node_child/", 2);
    }
}
