package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.WikiRelation;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class GetRelationPuller extends AbstractC12451a<Params, WikiRelation> {

    public static class Params implements NonProguard {
        public String space_id;
        public String wiki_token;
        public boolean with_perm = true;
        public boolean with_space = true;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", with_space=" + this.with_space + ", with_perm=" + this.with_perm + '}';
        }

        public Params(String str, String str2) {
            this.space_id = str;
            this.wiki_token = str2;
        }
    }

    GetRelationPuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/tree/get_info/", 2);
    }
}
