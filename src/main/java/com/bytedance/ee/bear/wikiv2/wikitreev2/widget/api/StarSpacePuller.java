package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class StarSpacePuller extends AbstractC12451a<Params, Result> {

    public static class Result implements NonProguard {
        public boolean is_success;
    }

    public static class Params implements NonProguard {
        public String space_id;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + '}';
        }

        public Params(String str) {
            this.space_id = str;
        }
    }

    StarSpacePuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/space/star/add/", 1);
    }
}
