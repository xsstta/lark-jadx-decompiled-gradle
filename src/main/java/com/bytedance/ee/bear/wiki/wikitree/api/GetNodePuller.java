package com.bytedance.ee.bear.wiki.wikitree.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;
import java.io.Serializable;

public class GetNodePuller extends AbstractC12057a<Params, Result> {

    public static class HomePage implements Serializable {
        public String obj_token;
        public int obj_type;
        public String wiki_token;

        public String toString() {
            return "HomePage{wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + '}';
        }
    }

    public static class Params implements NonProguard {
        public String wiki_token;

        public String toString() {
            return "Params{wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + '}';
        }

        public Params(String str) {
            this.wiki_token = str;
        }
    }

    public static class Result implements NonProguard {
        public String area_id;
        public int child_num;
        public HomePage home_page;
        public String obj_token;
        public int obj_type;
        public String parent;
        public double sort_id;
        public String space_icon;
        public String space_id;
        public String space_name;
        public String title;
        public String wiki_token;

        public String toString() {
            return "Result{, wiki_token='" + C13721c.m55650d(this.wiki_token) + '\'' + ", title='" + C13721c.m55650d(this.title) + '\'' + ", sort_id=" + this.sort_id + ", area_id='" + this.area_id + '\'' + ", child_num=" + this.child_num + '}';
        }
    }

    GetNodePuller(NetService netService) {
        super(netService, "api/wiki/tree/get_node/", 2);
    }
}
