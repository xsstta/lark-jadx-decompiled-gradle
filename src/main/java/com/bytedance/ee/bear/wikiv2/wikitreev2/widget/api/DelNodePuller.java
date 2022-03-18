package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class DelNodePuller extends AbstractC12451a<Params, Result> {

    public static class Result implements NonProguard {
        public int total;

        public String toString() {
            return "Result{total=" + this.total + '}';
        }
    }

    public static class Params implements NonProguard {
        public int auto_delete_mode = 1;
        public String space_id;
        public String synergy_uuid;
        public String wiki_token;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + ", wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + '}';
        }

        public Params(String str, String str2, String str3) {
            this.space_id = str;
            this.wiki_token = str2;
            this.synergy_uuid = str3;
        }
    }

    DelNodePuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/tree/del_node/", 1);
    }
}
