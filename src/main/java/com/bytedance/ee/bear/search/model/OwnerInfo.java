package com.bytedance.ee.bear.search.model;

import java.io.Serializable;
import java.util.Objects;

public class OwnerInfo implements Serializable {
    private String avatarKey;
    private String avatarUrl;
    private String ownerId;

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public int hashCode() {
        return Objects.hash(this.ownerId, this.avatarUrl, this.avatarKey);
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OwnerInfo ownerInfo = (OwnerInfo) obj;
        if (!Objects.equals(this.ownerId, ownerInfo.ownerId) || !Objects.equals(this.avatarUrl, ownerInfo.avatarUrl) || !Objects.equals(this.avatarKey, ownerInfo.avatarKey)) {
            return false;
        }
        return true;
    }
}
