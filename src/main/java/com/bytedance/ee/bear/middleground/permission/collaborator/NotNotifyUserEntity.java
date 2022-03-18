package com.bytedance.ee.bear.middleground.permission.collaborator;

import com.bytedance.ee.util.io.NonProguard;

public class NotNotifyUserEntity implements NonProguard {
    private String avatar_url;
    private boolean can_apply_perm;
    private String cn_name;
    private String email;
    private String en_name;
    private String id;
    private String mobile;
    private String name;
    private int ownerType;
    private int permission;
    private String suid;
    private String tenant_id;
    private String tenant_name;

    public String getAvatar_url() {
        return this.avatar_url;
    }

    public String getCn_name() {
        return this.cn_name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEn_name() {
        return this.en_name;
    }

    public String getId() {
        return this.id;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public int getOwnerType() {
        return this.ownerType;
    }

    public int getPermission() {
        return this.permission;
    }

    public String getSuid() {
        return this.suid;
    }

    public String getTenant_id() {
        return this.tenant_id;
    }

    public String getTenant_name() {
        return this.tenant_name;
    }

    public boolean isCan_apply_perm() {
        return this.can_apply_perm;
    }

    public static NotNotifyUserEntity mock() {
        NotNotifyUserEntity notNotifyUserEntity = new NotNotifyUserEntity();
        notNotifyUserEntity.id = "6616581916592177166";
        notNotifyUserEntity.name = "黄姚警";
        notNotifyUserEntity.cn_name = "黄姚警";
        notNotifyUserEntity.en_name = "黄姚警";
        notNotifyUserEntity.suid = "6616581916592177166";
        return notNotifyUserEntity;
    }

    public void setAvatar_url(String str) {
        this.avatar_url = str;
    }

    public void setCan_apply_perm(boolean z) {
        this.can_apply_perm = z;
    }

    public void setCn_name(String str) {
        this.cn_name = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEn_name(String str) {
        this.en_name = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwnerType(int i) {
        this.ownerType = i;
    }

    public void setPermission(int i) {
        this.permission = i;
    }

    public void setSuid(String str) {
        this.suid = str;
    }

    public void setTenant_id(String str) {
        this.tenant_id = str;
    }

    public void setTenant_name(String str) {
        this.tenant_name = str;
    }
}
