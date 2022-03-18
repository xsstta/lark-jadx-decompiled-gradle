package com.ss.android.vc.meeting.module.sketch.dto;

import java.io.Serializable;

public class SketchByteviewUser implements Serializable {
    public int currentStep;
    public String deviceId;
    public String userId;
    public int userType;

    public String toString() {
        return "SketchByteviewUser { deviceId: " + this.deviceId + ", userId: " + this.userId + ", userType: " + this.userType + " } ";
    }

    public SketchByteviewUser(String str, String str2, int i) {
        this.deviceId = str;
        this.userId = str2;
        this.userType = i;
    }
}
