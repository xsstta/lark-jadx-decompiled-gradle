package com.bytedance.ee.bear.templates.search.recommend;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import java.util.List;

public class RecommendResult extends NetService.Result<RecommendData> {

    public static class RecommendData implements Serializable {
        public List<String> recommend_keys;

        public List<String> getRecommend_keys() {
            return this.recommend_keys;
        }

        public void setRecommend_keys(List<String> list) {
            this.recommend_keys = list;
        }
    }
}
