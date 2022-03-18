package com.ss.android.lark.mm.module.participant.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

public class MmParticipants implements Serializable {
    @JSONField(name = "user_id")
    private boolean hasMore;
    private List<MmParticipantInfo> list;
    private int offset;
    private int size;
    private int total;

    public static class MmParticipantInfo implements Serializable {
        private boolean _isSelected;
        private String action_id;
        @JSONField(name = "avatar_url")
        private String avatarUrl;
        private String department_name;
        @JSONField(name = "device_id")
        private String deviceId;
        private boolean is_external;
        private boolean is_host_user;
        private boolean is_in_participants;
        private boolean is_login_user;
        private boolean is_paragraph_speaker;
        private List<String> paragraph_ids;
        private long tenant_id;
        private String tenant_name;
        @JSONField(name = "user_id")
        private String userId;
        @JSONField(name = "user_name")
        private String userName;
        @JSONField(name = "user_type")
        private int userType;

        public boolean _isSelected() {
            return this._isSelected;
        }

        public String getAction_id() {
            return this.action_id;
        }

        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public String getDepartment_name() {
            return this.department_name;
        }

        public String getDeviceId() {
            return this.deviceId;
        }

        public List<String> getParagraph_ids() {
            return this.paragraph_ids;
        }

        public long getTenant_id() {
            return this.tenant_id;
        }

        public String getTenant_name() {
            return this.tenant_name;
        }

        public String getUserId() {
            return this.userId;
        }

        public String getUserName() {
            return this.userName;
        }

        public int getUserType() {
            return this.userType;
        }

        public boolean isIs_host_user() {
            return this.is_host_user;
        }

        public boolean is_external() {
            return this.is_external;
        }

        public boolean is_in_participants() {
            return this.is_in_participants;
        }

        public boolean is_login_user() {
            return this.is_login_user;
        }

        public boolean is_paragraph_speaker() {
            return this.is_paragraph_speaker;
        }

        public void setAction_id(String str) {
            this.action_id = str;
        }

        public void setAvatarUrl(String str) {
            this.avatarUrl = str;
        }

        public void setDepartment_name(String str) {
            this.department_name = str;
        }

        public void setDeviceId(String str) {
            this.deviceId = str;
        }

        public void setIsSelected(boolean z) {
            this._isSelected = z;
        }

        public void setIs_external(boolean z) {
            this.is_external = z;
        }

        public void setIs_host_user(boolean z) {
            this.is_host_user = z;
        }

        public void setIs_in_participants(boolean z) {
            this.is_in_participants = z;
        }

        public void setIs_login_user(boolean z) {
            this.is_login_user = z;
        }

        public void setIs_paragraph_speaker(boolean z) {
            this.is_paragraph_speaker = z;
        }

        public void setParagraph_ids(List<String> list) {
            this.paragraph_ids = list;
        }

        public void setTenant_id(long j) {
            this.tenant_id = j;
        }

        public void setTenant_name(String str) {
            this.tenant_name = str;
        }

        public void setUserId(String str) {
            this.userId = str;
        }

        public void setUserName(String str) {
            this.userName = str;
        }

        public void setUserType(int i) {
            this.userType = i;
        }
    }

    public List<MmParticipantInfo> getList() {
        return this.list;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getSize() {
        return this.size;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setList(List<MmParticipantInfo> list2) {
        this.list = list2;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
