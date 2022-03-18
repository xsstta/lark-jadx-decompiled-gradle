package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class UnfavoritePuller extends AbstractC12451a<Params, Result> {

    public static class Result implements NonProguard {
        public boolean is_success;
    }

    public static class Params implements NonProguard {
        public String space_id;
        public String wiki_token;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + "wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + '}';
        }

        public Params(String str, String str2) {
            this.space_id = str;
            this.wiki_token = str2;
        }
    }

    UnfavoritePuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/tree/star/remove/", 1);
    }
}
