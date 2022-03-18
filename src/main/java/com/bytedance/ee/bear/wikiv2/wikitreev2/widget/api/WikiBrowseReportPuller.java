package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p716r.C13721c;

public class WikiBrowseReportPuller extends AbstractC12451a<Params, Result> {

    public static class Result implements NonProguard {
        public boolean is_success;
    }

    public static class Params implements NonProguard {
        public String token;

        public String toString() {
            return "Params{token='" + C13721c.m55650d(this.token) + '\'' + '}';
        }

        public Params(String str) {
            this.token = str;
        }
    }

    WikiBrowseReportPuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/search/wiki_browse_report/", 1);
    }
}
