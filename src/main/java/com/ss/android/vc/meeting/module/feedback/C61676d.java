package com.ss.android.vc.meeting.module.feedback;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.meeting.module.busyring.C61543c;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.feedback.d */
public class C61676d {

    /* renamed from: a */
    public static boolean f154755a;

    /* renamed from: b */
    private static boolean f154756b;

    /* renamed from: a */
    public static void m240734a(boolean z) {
        f154756b = z;
    }

    /* renamed from: c */
    private static boolean m240736c(C61303k kVar) {
        StatusNode[] f = kVar.mo212052b().mo212272f();
        if (f == null || f.length < 2) {
            return false;
        }
        StatusNode statusNode = f[0];
        if (StatusNode.Idle == f[1] && StatusNode.OnTheCall == statusNode) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m240735b(C61303k kVar) {
        List<StatusNode> e = kVar.mo212052b().mo212271e();
        if (e == null || e.size() < 2) {
            return false;
        }
        int size = e.size();
        StatusNode statusNode = e.get(size - 1);
        StatusNode statusNode2 = e.get(size - 2);
        if (StatusNode.Idle == statusNode && StatusNode.OnTheCall == statusNode2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m240733a(C61303k kVar) {
        VideoChat.Type type;
        boolean z = false;
        f154755a = false;
        if (GuestJoinMeetingUtil.m245480b() || GuestJoinMeetingUtil.m245482d()) {
            C60700b.m235851b("FeedbackTrigger", "[showFeedbackDialog]", "is guest or simplify so don't show feedback dialog.");
        } else if (!VideoChatModuleDependency.getLoginDependency().isLogin() || kVar == null || C61543c.m240213a(kVar)) {
            C60700b.m235851b("FeedbackTrigger", "[showFeedbackDialog2]", "not show feedback dialog");
        } else {
            VideoChat e = kVar.mo212056e();
            if (e == null) {
                C60700b.m235851b("FeedbackTrigger", "[showFeedbackDialog3]", "videoChat is null so not show feedback dialog");
            } else if (f154756b) {
                C60700b.m235851b("FeedbackTrigger", "[showFeedbackDialog4]", "isEndByLogout so not show feedback dialog");
            } else if (kVar.f153583k == null || kVar.f153583k.mo5927b() == null || kVar.f153583k.mo5927b().mo212437c() != 217) {
                if (m240735b(kVar) || m240736c(kVar)) {
                    z = true;
                }
                if (e == null) {
                    type = VideoChat.Type.UNKNOWN;
                } else {
                    type = e.getType();
                }
                C60700b.m235851b("FeedbackTrigger", "[showFeedbackDialog6]", "type = " + type + ", shouldShow = " + z);
                if (z) {
                    C61677e.m240737a().mo213627a(e);
                }
            } else {
                C60700b.m235851b("FeedbackTrigger", "[showFeedbackDialog5]", "triggerEvent not show feedback dialog");
            }
        }
    }
}
