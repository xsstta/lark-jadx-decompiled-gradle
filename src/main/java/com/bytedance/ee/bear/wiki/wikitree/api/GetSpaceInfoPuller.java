package com.bytedance.ee.bear.wiki.wikitree.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wiki.spacedetail.SpaceBean;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.HashMap;

public class GetSpaceInfoPuller extends AbstractC12057a<Params, HashMap<String, SpaceBean>> {

    public static class Params implements NonProguard {
        public String space_id;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + '}';
        }

        public Params(String str) {
            this.space_id = str;
        }
    }

    GetSpaceInfoPuller(NetService netService) {
        super(netService, "api/wiki/space/get_space_info/", 2);
    }
}
