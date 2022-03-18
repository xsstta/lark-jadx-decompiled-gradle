package com.larksuite.component.dybrid.offlineresource.bean;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class DynamicUrlSettingsBean implements Serializable {
    @SerializedName("dynamic_url_mapper")
    public List<DynamicMapperBean> list;

    public static class DynamicUrlBean implements Serializable {
        public String accessKey;
        public String bizName;
        public String channel;
        public boolean forceApply;
        public String newUrl;
    }

    public static class DynamicMapperBean implements Serializable {
        private JSONObject params;
        private String path;
        private String pattern;
        @SerializedName("url")
        private DynamicUrlBean urlBean;

        public JSONObject getParams() {
            return this.params;
        }

        public String getPattern() {
            return this.pattern;
        }

        public DynamicUrlBean getUrlBean() {
            return this.urlBean;
        }

        public String getPath() {
            if (TextUtils.isEmpty(this.path)) {
                return this.pattern;
            }
            return this.path;
        }
    }
}
