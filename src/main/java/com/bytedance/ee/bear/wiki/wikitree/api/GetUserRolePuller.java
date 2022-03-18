package com.bytedance.ee.bear.wiki.wikitree.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class GetUserRolePuller extends AbstractC12057a<Params, Result> {

    public static class Params implements NonProguard {
        public String space_id;

        public String toString() {
            return "Params{space_id='" + C13721c.m55650d(this.space_id) + '\'' + '}';
        }

        public Params(String str) {
            this.space_id = str;
        }
    }

    public static class Result implements NonProguard {
        public int prop;
        public int role;

        public String toString() {
            return "Result{role=" + this.role + ", prop=" + this.prop + '}';
        }
    }

    GetUserRolePuller(NetService netService) {
        super(netService, "/api/wiki/perm/get_user_role/", 2);
    }
}
