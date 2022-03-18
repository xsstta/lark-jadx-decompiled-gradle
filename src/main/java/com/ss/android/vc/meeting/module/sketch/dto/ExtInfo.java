package com.ss.android.vc.meeting.module.sketch.dto;

import com.ss.android.vc.entity.ByteviewUser;

public class ExtInfo {
    public int currentStep;
    public String deviceId;
    public UndoRedoInfo undoRedoInfo;
    public String userId;
    public int userType;
    public boolean visible;

    public String toString() {
        return "[deviceId = " + this.deviceId + ", userId = " + this.userId + ", userType = " + this.userType + ", currentStep = " + this.currentStep + ", undoRedoInfo: " + this.undoRedoInfo + ", visible = " + this.visible + "]";
    }

    public ExtInfo(ByteviewUser byteviewUser, int i, UndoRedoInfo undoRedoInfo2, boolean z) {
        this.deviceId = byteviewUser.getDeviceId();
        this.userId = byteviewUser.getUserId();
        this.userType = byteviewUser.getParticipantType().getNumber();
        this.currentStep = i;
        this.undoRedoInfo = undoRedoInfo2;
        this.visible = z;
    }

    public ExtInfo(String str, String str2, int i, int i2, UndoRedoInfo undoRedoInfo2, boolean z) {
        this.deviceId = str;
        this.userId = str2;
        this.userType = i;
        this.currentStep = i2;
        this.undoRedoInfo = undoRedoInfo2;
        this.visible = z;
    }
}
