package com.ss.android.vc.meeting.module.feedback;

import com.ss.android.vc.entity.FeedbackBean;
import com.ss.android.vc.entity.MeetingFeedbackBean;

/* renamed from: com.ss.android.vc.meeting.module.feedback.c */
public class C61675c {
    /* renamed from: b */
    public static FeedbackBean.Network m240732b(String str) {
        FeedbackBean.Network network;
        FeedbackBean.Network network2 = FeedbackBean.Network.OTHER;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != 1715) {
                if (hashCode == 3649301) {
                    if (str.equals("wifi")) {
                        c = 0;
                    }
                }
            } else if (str.equals("4g")) {
                c = 1;
            }
            if (c == 0) {
                network = FeedbackBean.Network.WIFI;
            } else if (c != 1) {
                network = FeedbackBean.Network.OTHER;
            } else {
                network = FeedbackBean.Network.DATA4G;
            }
            return network;
        } catch (Exception e) {
            e.printStackTrace();
            return network2;
        }
    }

    /* renamed from: a */
    public static MeetingFeedbackBean.Network m240731a(String str) {
        MeetingFeedbackBean.Network network;
        MeetingFeedbackBean.Network network2 = MeetingFeedbackBean.Network.OTHER;
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != 1684) {
                if (hashCode != 1715) {
                    if (hashCode == 3649301) {
                        if (str.equals("wifi")) {
                            c = 0;
                        }
                    }
                } else if (str.equals("4g")) {
                    c = 2;
                }
            } else if (str.equals("3g")) {
                c = 1;
            }
            if (c == 0) {
                network = MeetingFeedbackBean.Network.WIFI;
            } else if (c == 1) {
                network = MeetingFeedbackBean.Network.G3;
            } else if (c != 2) {
                network = MeetingFeedbackBean.Network.OTHER;
            } else {
                network = MeetingFeedbackBean.Network.G4;
            }
            return network;
        } catch (Exception e) {
            e.printStackTrace();
            return network2;
        }
    }
}
