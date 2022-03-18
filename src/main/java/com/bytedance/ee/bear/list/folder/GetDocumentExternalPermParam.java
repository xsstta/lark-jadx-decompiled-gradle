package com.bytedance.ee.bear.list.folder;

import java.io.Serializable;
import java.util.List;

public class GetDocumentExternalPermParam implements Serializable {
    private List<ObjsBean> objs;

    public static class ObjsBean implements Serializable {
        private String token;
        private int type;

        public String getToken() {
            return this.token;
        }

        public int getType() {
            return this.type;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setType(int i) {
            this.type = i;
        }
    }

    public List<ObjsBean> getObjs() {
        return this.objs;
    }

    public void setObjs(List<ObjsBean> list) {
        this.objs = list;
    }
}
