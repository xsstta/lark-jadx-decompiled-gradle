package com.bytedance.ee.bear.contract.route.parcelable;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.io.NonProguard;

public class WikiInfo extends NetService.Result<Info> implements NonProguard {
    @JSONField(serialize = false)
    public String getObjToken() {
        if (this.data == null) {
            return null;
        }
        return ((Info) this.data).obj_token;
    }

    @JSONField(serialize = false)
    public int getObjType() {
        if (this.data == null) {
            return -1;
        }
        return ((Info) this.data).obj_type;
    }

    @JSONField(serialize = false)
    public String getObjTypeString() {
        return C8275a.m34050a(getObjType());
    }

    @JSONField(serialize = false)
    public String getSpaceId() {
        if (this.data == null) {
            return null;
        }
        return ((Info) this.data).space_id;
    }

    @JSONField(serialize = false)
    public String getWikiToken() {
        if (this.data == null) {
            return null;
        }
        return ((Info) this.data).wiki_token;
    }

    public static class Info implements NonProguard {
        public String obj_token;
        public int obj_type = -1;
        public String space_id;
        public String wiki_token;

        public String toString() {
            return "Wiki#Info{obj_type=" + this.obj_type + '}';
        }
    }

    @JSONField(serialize = false)
    public boolean isValid() {
        if (this.code != 0 || TextUtils.isEmpty(getObjToken()) || getObjType() == -1 || TextUtils.isEmpty(getSpaceId()) || TextUtils.isEmpty(getWikiToken())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "WikiInfo{code=" + this.code + ", hash=" + hashCode() + ", msg='" + this.msg + '\'' + ", data=" + this.data + '}';
    }

    public void setObjToken(String str) {
        if (this.data == null) {
            this.data = new Info();
        }
        ((Info) this.data).obj_token = str;
    }

    public void setObjType(int i) {
        if (this.data == null) {
            this.data = new Info();
        }
        ((Info) this.data).obj_type = i;
    }

    public void setSpaceId(String str) {
        if (this.data == null) {
            this.data = new Info();
        }
        ((Info) this.data).space_id = str;
    }

    public void setWikiToken(String str) {
        if (this.data == null) {
            this.data = new Info();
        }
        ((Info) this.data).wiki_token = str;
    }
}
