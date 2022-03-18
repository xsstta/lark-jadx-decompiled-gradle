package com.ss.android.appcenter.business.net.dto;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;

public class AvatarModel implements Serializable {
    @SerializedName("fsUnit")
    private String fsUnit;
    @SerializedName("key")
    private String key;

    public String getFsUnit() {
        return this.fsUnit;
    }

    public String getKey() {
        return this.key;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.fsUnit);
    }

    public String toString() {
        return String.format("AvatarModel{key='%s', fsUnit='%s'}", this.key, this.fsUnit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvatarModel avatarModel = (AvatarModel) obj;
        if (!Objects.equals(this.key, avatarModel.key) || !Objects.equals(this.fsUnit, avatarModel.fsUnit)) {
            return false;
        }
        return true;
    }
}
