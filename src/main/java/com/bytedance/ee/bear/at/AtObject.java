package com.bytedance.ee.bear.at;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.p700c.C13598b;
import java.io.Serializable;

public class AtObject implements Serializable {
    private String avatar_url;
    private String cn_name;
    private String content;
    private String count;
    private String department;
    private String desc;
    private String edit_time;
    private String en_name;
    private String icon_fsunit;
    private String icon_key;
    private int icon_type;
    private String id = "";
    @JSONField(alternateNames = {"is_cross_tenant"}, name = "is_external")
    private boolean isExternal;
    @JSONField(name = "has_join_chat")
    private boolean isJoinChat;
    private String name;
    private boolean not_notify;
    private String owner;
    private int sequenceNum;
    private int source;
    private int sub_type;
    private String tenant_id;
    private String title;
    private String token;
    private int type;
    private String union_id;
    private String url;

    public String getAvatar_url() {
        return this.avatar_url;
    }

    public String getCn_name() {
        return this.cn_name;
    }

    public String getContent() {
        return this.content;
    }

    public String getCount() {
        return this.count;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getEdit_time() {
        return this.edit_time;
    }

    public String getEn_name() {
        return this.en_name;
    }

    public String getIcon_fsunit() {
        return this.icon_fsunit;
    }

    public String getIcon_key() {
        return this.icon_key;
    }

    public int getIcon_type() {
        return this.icon_type;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getSequenceNum() {
        return this.sequenceNum;
    }

    public int getSource() {
        return this.source;
    }

    public int getSub_type() {
        return this.sub_type;
    }

    public String getTenant_id() {
        return this.tenant_id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public String getUnion_id() {
        return this.union_id;
    }

    public String getUrl() {
        return this.url;
    }

    @JSONField(alternateNames = {"is_cross_tenant"}, name = "is_external")
    public boolean isExternal() {
        return this.isExternal;
    }

    public boolean isJoinChat() {
        return this.isJoinChat;
    }

    public boolean isNot_notify() {
        return this.not_notify;
    }

    public String toString() {
        return "AtObject{, type=" + this.type + ", token='" + C13598b.m55197d(this.token) + '\'' + ", url='" + C13598b.m55197d(this.url) + '\'' + ", avatar_url='" + C13598b.m55197d(this.avatar_url) + '\'' + ", id='" + this.id + '\'' + ", isExternal='" + this.isExternal + '\'' + ",icon_key=" + this.icon_key + '\'' + ",icon_fsunit=" + this.icon_fsunit + '\'' + ",icon_type=" + this.icon_type + '\'' + ",tenant_id=" + this.tenant_id + '\'' + ",union_id=" + this.union_id + '\'' + '}';
    }

    public void setAvatar_url(String str) {
        this.avatar_url = str;
    }

    public void setCn_name(String str) {
        this.cn_name = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setDepartment(String str) {
        this.department = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEdit_time(String str) {
        this.edit_time = str;
    }

    public void setEn_name(String str) {
        this.en_name = str;
    }

    @JSONField(alternateNames = {"is_cross_tenant"}, name = "is_external")
    public void setExternal(boolean z) {
        this.isExternal = z;
    }

    public void setIcon_fsunit(String str) {
        this.icon_fsunit = str;
    }

    public void setIcon_key(String str) {
        this.icon_key = str;
    }

    public void setIcon_type(int i) {
        this.icon_type = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setJoinChat(boolean z) {
        this.isJoinChat = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNot_notify(boolean z) {
        this.not_notify = z;
    }

    public void setOwner(String str) {
        this.owner = str;
    }

    public void setSequenceNum(int i) {
        this.sequenceNum = i;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setSub_type(int i) {
        this.sub_type = i;
    }

    public void setTenant_id(String str) {
        this.tenant_id = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUnion_id(String str) {
        this.union_id = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void copy(AtObject atObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        if (TextUtils.isEmpty(atObject.cn_name)) {
            str = this.cn_name;
        } else {
            str = atObject.cn_name;
        }
        this.cn_name = str;
        if (TextUtils.isEmpty(atObject.en_name)) {
            str2 = this.en_name;
        } else {
            str2 = atObject.en_name;
        }
        this.en_name = str2;
        if (TextUtils.isEmpty(atObject.content)) {
            str3 = this.content;
        } else {
            str3 = atObject.content;
        }
        this.content = str3;
        if (TextUtils.isEmpty(atObject.edit_time)) {
            str4 = this.edit_time;
        } else {
            str4 = atObject.edit_time;
        }
        this.edit_time = str4;
        if (TextUtils.isEmpty(atObject.owner)) {
            str5 = this.owner;
        } else {
            str5 = atObject.owner;
        }
        this.owner = str5;
        if (TextUtils.isEmpty(atObject.desc)) {
            str6 = this.desc;
        } else {
            str6 = atObject.desc;
        }
        this.desc = str6;
        if (TextUtils.isEmpty(atObject.count)) {
            str7 = this.count;
        } else {
            str7 = atObject.count;
        }
        this.count = str7;
        if (TextUtils.isEmpty(atObject.url)) {
            str8 = this.url;
        } else {
            str8 = atObject.url;
        }
        this.url = str8;
        if (TextUtils.isEmpty(atObject.department)) {
            str9 = this.department;
        } else {
            str9 = atObject.department;
        }
        this.department = str9;
        if (TextUtils.isEmpty(atObject.avatar_url)) {
            str10 = this.avatar_url;
        } else {
            str10 = atObject.avatar_url;
        }
        this.avatar_url = str10;
        if (TextUtils.isEmpty(atObject.name)) {
            str11 = this.name;
        } else {
            str11 = atObject.name;
        }
        this.name = str11;
        if (TextUtils.isEmpty(atObject.id)) {
            str12 = this.id;
        } else {
            str12 = atObject.id;
        }
        this.id = str12;
        if (TextUtils.isEmpty(atObject.title)) {
            str13 = this.title;
        } else {
            str13 = atObject.title;
        }
        this.title = str13;
        this.isExternal = atObject.isExternal;
        this.not_notify = atObject.not_notify;
        this.icon_fsunit = atObject.icon_fsunit;
        this.icon_key = atObject.icon_key;
        this.icon_type = atObject.icon_type;
    }
}
