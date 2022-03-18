package com.ss.android.vc.meeting.module.sketch.dto;

public class RemoveData {
    public int currentStep;
    public String[] ids;
    public int removeType;
    public SketchByteviewUser[] users;

    public String toString() {
        String str = "[";
        for (String str2 : this.ids) {
            str = str + str2;
        }
        return "[ removeType: " + this.removeType + ", ids: " + (str + "] ") + ", currentStep: " + this.currentStep + " ] ";
    }

    public RemoveData(int i, String[] strArr, int i2) {
        this.removeType = i;
        this.ids = strArr;
        this.currentStep = i2;
    }

    public RemoveData(int i, String[] strArr, SketchByteviewUser[] sketchByteviewUserArr, int i2) {
        this.removeType = i;
        this.ids = strArr;
        this.currentStep = i2;
        this.users = sketchByteviewUserArr;
    }
}
