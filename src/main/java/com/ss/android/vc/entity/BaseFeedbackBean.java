package com.ss.android.vc.entity;

import java.io.Serializable;

public class BaseFeedbackBean implements Serializable {
    public FeedbackData audioVideoFeedback;
    public String carrierName;
    public String deviceModel;
    public String larkVersion;
    public String manufacturer;
    public String meetingId;
    public String otherReason;
    public Quality quatity;
    public String sdkVersion;
    public FeedbackData shareScreenFeedback;

    public enum Quality {
        UNKNOWN(0),
        GOOD(1),
        BAD(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Quality valueOf(int i) {
            return forNumber(i);
        }

        public static Quality forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return GOOD;
            }
            if (i != 2) {
                return null;
            }
            return BAD;
        }

        private Quality(int i) {
            this.value = i;
        }
    }

    public String toString() {
        return "BaseFeedbackBean{meetingId='" + this.meetingId + '\'' + ", quatity=" + this.quatity + ", sdkVersion='" + this.sdkVersion + '\'' + ", audioVideoFeedback=" + this.audioVideoFeedback + ", shareScreenFeedback=" + this.shareScreenFeedback + ", otherReason='" + this.otherReason + '\'' + ", larkVersion='" + this.larkVersion + '\'' + ", manufacturer='" + this.manufacturer + '\'' + ", deviceModel='" + this.deviceModel + '\'' + ", carrierName='" + this.carrierName + '\'' + '}';
    }
}
