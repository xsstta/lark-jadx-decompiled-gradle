package com.bytedance.ee.bear.drive.biz.versions.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class DriveVersionHistoryRecord implements Serializable {
    @JSONField(name = "has_more")
    private boolean hasMore;
    private List<RecordBean> list;
    private Map<String, UserBean> users;

    public static class RecordBean implements Serializable {
        @JSONField(name = "data_version")
        private String dataVersion;
        @JSONField(name = "edit_time")
        private long editTime;
        @JSONField(name = "edit_uid")
        private String editUid;
        @JSONField(name = "is_deleted")
        private boolean isDeleted;
        private String name;
        private long size;
        @JSONField(name = "source_name")
        private String sourceName;
        @JSONField(name = "source_tag")
        private int sourceTag;
        private int tag;
        private int type;
        private String version;

        public String getDataVersion() {
            return this.dataVersion;
        }

        public long getEditTime() {
            return this.editTime;
        }

        public String getEditUid() {
            return this.editUid;
        }

        public String getName() {
            return this.name;
        }

        public long getSize() {
            return this.size;
        }

        public String getSourceName() {
            return this.sourceName;
        }

        public int getSourceTag() {
            return this.sourceTag;
        }

        public int getTag() {
            return this.tag;
        }

        public int getType() {
            return this.type;
        }

        public String getVersion() {
            return this.version;
        }

        public boolean isDeleted() {
            return this.isDeleted;
        }

        public void setDataVersion(String str) {
            this.dataVersion = str;
        }

        public void setDeleted(boolean z) {
            this.isDeleted = z;
        }

        public void setEditTime(long j) {
            this.editTime = j;
        }

        public void setEditUid(String str) {
            this.editUid = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setSize(long j) {
            this.size = j;
        }

        public void setSourceName(String str) {
            this.sourceName = str;
        }

        public void setSourceTag(int i) {
            this.sourceTag = i;
        }

        public void setTag(int i) {
            this.tag = i;
        }

        public void setType(int i) {
            this.type = i;
        }

        public void setVersion(String str) {
            this.version = str;
        }
    }

    public static class UserBean implements Serializable {
        @JSONField(name = "avatar_url")
        private String avataUrl;
        @JSONField(name = "cn_name")
        private String cname;
        private String email;
        @JSONField(name = "en_name")
        private String enName;
        private String id;
        private String mobile;
        private String suid;
        @JSONField(name = "tanant_id")
        private String tanantId;
        @JSONField(name = "tenant_name")
        private String tenantName;

        public String getAvataUrl() {
            return this.avataUrl;
        }

        public String getCname() {
            return this.cname;
        }

        public String getEmail() {
            return this.email;
        }

        public String getEnName() {
            return this.enName;
        }

        public String getId() {
            return this.id;
        }

        public String getMobile() {
            return this.mobile;
        }

        public String getSuid() {
            return this.suid;
        }

        public String getTanantId() {
            return this.tanantId;
        }

        public String getTenantName() {
            return this.tenantName;
        }

        public void setAvataUrl(String str) {
            this.avataUrl = str;
        }

        public void setCname(String str) {
            this.cname = str;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setEnName(String str) {
            this.enName = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setMobile(String str) {
            this.mobile = str;
        }

        public void setSuid(String str) {
            this.suid = str;
        }

        public void setTanantId(String str) {
            this.tanantId = str;
        }

        public void setTenantName(String str) {
            this.tenantName = str;
        }
    }

    public List<RecordBean> getList() {
        return this.list;
    }

    public Map<String, UserBean> getUsers() {
        return this.users;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setList(List<RecordBean> list2) {
        this.list = list2;
    }

    public void setUsers(Map<String, UserBean> map) {
        this.users = map;
    }
}
