package com.bytedance.ee.bear.wiki.container.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.contract.NetService;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;

public class WikiResult extends NetService.Result {
    @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private Data data;

    public static class Data implements Serializable {
        private String obj_token;
        private int obj_type;
        private String space_icon;
        private String space_id;
        private String space_name;
        private String title;
        private String wiki_token;

        public String getObj_token() {
            return this.obj_token;
        }

        public int getObj_type() {
            return this.obj_type;
        }

        public String getSpace_icon() {
            return this.space_icon;
        }

        public String getSpace_id() {
            return this.space_id;
        }

        public String getSpace_name() {
            return this.space_name;
        }

        public String getTitle() {
            return this.title;
        }

        public String getWiki_token() {
            return this.wiki_token;
        }

        public void setObj_token(String str) {
            this.obj_token = str;
        }

        public void setObj_type(int i) {
            this.obj_type = i;
        }

        public void setSpace_icon(String str) {
            this.space_icon = str;
        }

        public void setSpace_id(String str) {
            this.space_id = str;
        }

        public void setSpace_name(String str) {
            this.space_name = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setWiki_token(String str) {
            this.wiki_token = str;
        }
    }

    @Override // com.bytedance.ee.bear.contract.NetService.Result
    public Data getData() {
        return this.data;
    }

    public void setData(Data data2) {
        this.data = data2;
    }
}
