package com.bytedance.ee.bear.document.permission;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.middleground.permission.permission.doc.PermissionConstraints;
import com.bytedance.ee.bear.share.export.OwnerInfo;
import com.bytedance.ee.util.io.NonProguard;

public class PermissionData implements NonProguard {
    private int code;
    private OwnerInfo owner;
    private int permission_status_code;
    private PublicPermissions publicPermissions;
    private String token;
    private int type;
    private int userPermissions;

    public static class PublicPermissions implements NonProguard {
        private boolean admin_can_cross;
        private boolean anonymous_verify;
        private boolean can_unlock;
        private int comment_entity;
        private PermissionConstraints constraint = new PermissionConstraints();
        private boolean external_access;
        private boolean has_link_password;
        private boolean invite_external;
        private boolean is_owner;
        private String link_password;
        private int link_share_entity;
        private boolean lock_state;
        private int security_entity;
        private int share_entity;

        public int getComment_entity() {
            return this.comment_entity;
        }

        public PermissionConstraints getConstraint() {
            return this.constraint;
        }

        public String getLink_password() {
            return this.link_password;
        }

        public int getLink_share_entity() {
            return this.link_share_entity;
        }

        public int getSecurity_entity() {
            return this.security_entity;
        }

        public int getShare_entity() {
            return this.share_entity;
        }

        public boolean isAdmin_can_cross() {
            return this.admin_can_cross;
        }

        public boolean isAnonymous_verify() {
            return this.anonymous_verify;
        }

        public boolean isCan_unlock() {
            return this.can_unlock;
        }

        public boolean isExternal_access() {
            return this.external_access;
        }

        public boolean isHas_link_password() {
            return this.has_link_password;
        }

        public boolean isInvite_external() {
            return this.invite_external;
        }

        public boolean isIs_owner() {
            return this.is_owner;
        }

        public boolean isLock_state() {
            return this.lock_state;
        }

        @JSONField(serialize = false)
        public String getReportJsonString() {
            return JSON.toJSONString(this);
        }

        public String toString() {
            return "PublicPermissions{link_share_entity=" + this.link_share_entity + ", comment_entity=" + this.comment_entity + ", share_entity=" + this.share_entity + ", security_entity=" + this.security_entity + ", is_owner=" + this.is_owner + ", admin_can_cross=" + this.admin_can_cross + ", link_password='" + this.link_password + '\'' + ", has_link_password=" + this.has_link_password + ", anonymous_verify=" + this.anonymous_verify + ", external_access=" + this.external_access + ", invite_external=" + this.invite_external + ", lock_state=" + this.lock_state + ", can_unlock=" + this.can_unlock + ", constraint= " + this.constraint.toString() + '}';
        }

        public void setAdmin_can_cross(boolean z) {
            this.admin_can_cross = z;
        }

        public void setAnonymous_verify(boolean z) {
            this.anonymous_verify = z;
        }

        public void setCan_unlock(boolean z) {
            this.can_unlock = z;
        }

        public void setComment_entity(int i) {
            this.comment_entity = i;
        }

        public void setConstraint(PermissionConstraints permissionConstraints) {
            this.constraint = permissionConstraints;
        }

        public void setExternal_access(boolean z) {
            this.external_access = z;
        }

        public void setHas_link_password(boolean z) {
            this.has_link_password = z;
        }

        public void setInvite_external(boolean z) {
            this.invite_external = z;
        }

        public void setIs_owner(boolean z) {
            this.is_owner = z;
        }

        public void setLink_password(String str) {
            this.link_password = str;
        }

        public void setLink_share_entity(int i) {
            this.link_share_entity = i;
        }

        public void setLock_state(boolean z) {
            this.lock_state = z;
        }

        public void setSecurity_entity(int i) {
            this.security_entity = i;
        }

        public void setShare_entity(int i) {
            this.share_entity = i;
        }
    }

    public int getCode() {
        return this.code;
    }

    public OwnerInfo getOwner() {
        return this.owner;
    }

    public int getPermissionStatusCode() {
        return this.permission_status_code;
    }

    public PublicPermissions getPublicPermissions() {
        return this.publicPermissions;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public int getUserPermissions() {
        return this.userPermissions;
    }

    public String toString() {
        return "PermissionData{type=" + this.type + ", userPermissions=" + this.userPermissions + ", publicPermissions=" + this.publicPermissions + ", code=" + this.code + ", permissionStatusCode=" + this.permission_status_code + ", owner=" + this.owner + '}';
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setOwner(OwnerInfo ownerInfo) {
        this.owner = ownerInfo;
    }

    public void setPermissionStatusCode(int i) {
        this.permission_status_code = i;
    }

    public void setPublicPermissions(PublicPermissions publicPermissions2) {
        this.publicPermissions = publicPermissions2;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserPermissions(int i) {
        this.userPermissions = i;
    }
}
