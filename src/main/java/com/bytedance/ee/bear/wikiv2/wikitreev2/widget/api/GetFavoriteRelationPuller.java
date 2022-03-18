package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.HashMap;
import java.util.List;

public class GetFavoriteRelationPuller extends AbstractC12451a<Params, Result> {

    public static class Data implements NonProguard {
        public HashMap<String, TreeNode> nodes;
        public List<String> root_list;
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

    public static class Result implements NonProguard {
        public Data favorite_node_list;

        public String toString() {
            int i;
            Data data = this.favorite_node_list;
            if (data != null) {
                i = C13657b.m55424c(data.root_list);
            } else {
                i = 0;
            }
            return "Result{root_list=" + i + '}';
        }
    }

    GetFavoriteRelationPuller(NetService netService) {
        super(netService, "/space/api/wiki/v2/tree/star/get_favorite_info/", 2);
    }
}
