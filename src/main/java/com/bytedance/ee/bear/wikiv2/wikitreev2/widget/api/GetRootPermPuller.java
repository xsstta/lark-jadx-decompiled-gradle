package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpacePerm;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.HashMap;

public class GetRootPermPuller extends AbstractC12451a<Params, HashMap<String, SpacePerm>> {

    public static class Params implements NonProguard {
        public String space_id;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + '}';
        }

        public Params(String str) {
            this.space_id = str;
        }
    }

    GetRootPermPuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/perm/space/", 2);
    }
}
