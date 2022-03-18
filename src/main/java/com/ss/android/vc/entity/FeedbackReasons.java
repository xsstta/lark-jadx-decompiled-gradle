package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class FeedbackReasons implements Serializable {
    public MeetingFeedbackReasonItem meetingFeedbackReason;

    public String toString() {
        return "FeedbackReasons{meetingFeedbackReason=" + this.meetingFeedbackReason + '}';
    }

    public static class FeedbackReasonItem implements Serializable {
        public String message;
        public String subkey;

        public String toString() {
            return "FeedbackReasonItem{subkey='" + this.subkey + '\'' + ", message='" + this.message + '\'' + '}';
        }

        public FeedbackReasonItem(String str, String str2) {
            this.subkey = str;
            this.message = str2;
        }
    }

    public static class MeetingFeedbackReasonItem implements Serializable {
        public ArrayList<FeedbackReasonItem> shareScreenItems = new ArrayList<>();
        public ArrayList<FeedbackReasonItem> videoItems = new ArrayList<>();

        public String toString() {
            return "MeetingFeedbackReasonItem{videoItems=" + this.videoItems + ", shareScreenItems=" + this.shareScreenItems + '}';
        }

        public MeetingFeedbackReasonItem(ArrayList<FeedbackReasonItem> arrayList, ArrayList<FeedbackReasonItem> arrayList2) {
            this.videoItems = arrayList;
            this.shareScreenItems = arrayList2;
        }
    }
}
