package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.List;

public class ShareCardResponse implements Serializable {
    private List<String> bannedGroupIds;
    private TargetUserPermissions mTargetUserPermissions;

    public List<String> getBannedGroupIds() {
        return this.bannedGroupIds;
    }

    public TargetUserPermissions getTargetUserPermissions() {
        return this.mTargetUserPermissions;
    }

    public String toString() {
        return "ShareCardResponse{bannedGroupIds=" + this.bannedGroupIds + ", mTargetUserPermissions=" + this.mTargetUserPermissions + '}';
    }

    public void setBannedGroupIds(List<String> list) {
        this.bannedGroupIds = list;
    }

    public void setTargetUserPermissions(TargetUserPermissions targetUserPermissions) {
        this.mTargetUserPermissions = targetUserPermissions;
    }

    public enum TargetUserPermissions {
        ALL(0),
        PARTIAL(1),
        NONE(2);
        
        private final int value;

        public static TargetUserPermissions valueOf(int i) {
            TargetUserPermissions targetUserPermissions = ALL;
            if (i == targetUserPermissions.value) {
                return targetUserPermissions;
            }
            TargetUserPermissions targetUserPermissions2 = PARTIAL;
            if (i == targetUserPermissions2.value) {
                return targetUserPermissions2;
            }
            return NONE;
        }

        private TargetUserPermissions(int i) {
            this.value = i;
        }
    }
}
