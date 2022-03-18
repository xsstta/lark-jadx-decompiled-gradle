package com.bytedance.ee.bear.wikiv2.home.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12451a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.List;

public class GetSpacePuller extends AbstractC12451a<Params, Result> {

    public static class Params implements NonProguard {
        public String last_label;
        public int size;
        public Integer type;

        public String toString() {
            return "Params{type='" + this.type + '\'' + ", size=" + this.size + ", last_label='" + this.last_label + '\'' + '}';
        }
    }

    public static class Result implements NonProguard {
        public boolean has_more;
        public String last_label;
        public List<SpaceBean> spaces;

        public String toString() {
            return "Result{spaces=" + C13657b.m55424c(this.spaces) + ", last_label='" + this.last_label + '\'' + ", has_more=" + this.has_more + '}';
        }
    }

    public GetSpacePuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/space/get/", 2);
    }
}
