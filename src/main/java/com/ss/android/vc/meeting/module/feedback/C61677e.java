package com.ss.android.vc.meeting.module.feedback;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.BaseFeedbackBean;
import com.ss.android.vc.entity.FeedbackBean;
import com.ss.android.vc.entity.FeedbackReasons;
import com.ss.android.vc.entity.MeetingFeedbackBean;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.module.multi.MeetingNetDisconnectActivity;
import com.ss.android.vc.net.request.C63599c;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.p3182c.C63724a;
import java.util.ArrayList;

/* renamed from: com.ss.android.vc.meeting.module.feedback.e */
public class C61677e {

    /* renamed from: a */
    private static ArrayList<FeedbackReasons.FeedbackReasonItem> f154757a;

    /* renamed from: b */
    private static ArrayList<FeedbackReasons.FeedbackReasonItem> f154758b;

    /* renamed from: c */
    private static C61677e f154759c;

    /* renamed from: d */
    private Handler f154760d = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public ArrayList<FeedbackReasons.FeedbackReasonItem> mo213628d() {
        return f154757a;
    }

    /* renamed from: e */
    public ArrayList<FeedbackReasons.FeedbackReasonItem> mo213629e() {
        return f154758b;
    }

    /* renamed from: a */
    public static synchronized C61677e m240737a() {
        C61677e eVar;
        synchronized (C61677e.class) {
            if (f154759c == null) {
                f154759c = new C61677e();
            }
            eVar = f154759c;
        }
        return eVar;
    }

    /* renamed from: b */
    public static synchronized void m240740b() {
        Handler handler;
        synchronized (C61677e.class) {
            C61677e eVar = f154759c;
            if (!(eVar == null || (handler = eVar.f154760d) == null)) {
                handler.removeCallbacksAndMessages(null);
            }
            C61676d.f154755a = false;
            f154759c = null;
        }
    }

    /* renamed from: c */
    public static boolean m240742c() {
        ArrayList<FeedbackReasons.FeedbackReasonItem> arrayList;
        ArrayList<FeedbackReasons.FeedbackReasonItem> arrayList2 = f154758b;
        if (arrayList2 == null || arrayList2.isEmpty() || (arrayList = f154757a) == null || arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m240741b(VideoChat videoChat) {
        new View$OnClickListenerC61668a(videoChat).mo213615a();
    }

    /* renamed from: a */
    public C61677e mo213625a(FeedbackReasons.MeetingFeedbackReasonItem meetingFeedbackReasonItem) {
        if (meetingFeedbackReasonItem != null) {
            f154757a = meetingFeedbackReasonItem.videoItems;
            f154758b = meetingFeedbackReasonItem.shareScreenItems;
        }
        return f154759c;
    }

    /* renamed from: a */
    private void m240738a(FeedbackBean feedbackBean) {
        feedbackBean.network = C61675c.m240732b(C63724a.m249903a(ar.m236694a()));
        if (feedbackBean.meetingId != null && feedbackBean.quatity != null && feedbackBean.sdkVersion != null) {
            VcBizService.submit1v1Feedback(feedbackBean);
        }
    }

    /* renamed from: a */
    private void m240739a(MeetingFeedbackBean meetingFeedbackBean) {
        meetingFeedbackBean.network = C61675c.m240731a(C63724a.m249903a(ar.m236694a()));
        C63599c.m249416a(meetingFeedbackBean);
    }

    /* renamed from: a */
    public void mo213626a(BaseFeedbackBean baseFeedbackBean) {
        if (baseFeedbackBean != null) {
            baseFeedbackBean.sdkVersion = C61237h.m238223a().mo210561s();
            baseFeedbackBean.larkVersion = C26246a.m94977a(ar.m236694a());
            baseFeedbackBean.carrierName = C26284k.m95187c(ar.m236694a());
            baseFeedbackBean.manufacturer = Build.MANUFACTURER;
            baseFeedbackBean.deviceModel = Build.MODEL;
            if (baseFeedbackBean instanceof FeedbackBean) {
                m240738a((FeedbackBean) baseFeedbackBean);
            } else if (baseFeedbackBean instanceof MeetingFeedbackBean) {
                m240739a((MeetingFeedbackBean) baseFeedbackBean);
            }
        }
    }

    /* renamed from: a */
    public void mo213627a(VideoChat videoChat) {
        if (videoChat != null) {
            try {
                if (videoChat.getId() != null) {
                    if (!videoChat.getId().equals(MeetingNetDisconnectActivity.m244180b())) {
                        C61674b.m240730a(videoChat);
                        if (C63634c.m249496b("byteview.callmeeting.android.feedback_display")) {
                            C60700b.m235851b("MeetingFeedbackDialog", "[showFeedbackDialog]", "fg don't show feedback dialog.");
                            return;
                        }
                        C61676d.f154755a = true;
                        C60700b.m235851b("MeetingFeedbackDialog", "[showFeedbackDialog2]", "show");
                        if (DesktopUtil.m144307b()) {
                            C60735ab.m236001a(new Runnable() {
                                /* class com.ss.android.vc.meeting.module.feedback.$$Lambda$e$xWHjc6V0T8XUwWFC9DDyYUX_9Bk */

                                public final void run() {
                                    C61677e.m240741b(VideoChat.this);
                                }
                            });
                            return;
                        }
                        Intent intent = new Intent(ar.m236694a(), MeetingFeedbackDialogActivity.class);
                        intent.putExtra("videoChatInfo", videoChat);
                        intent.addFlags(268435456);
                        ar.m236694a().startActivity(intent);
                        return;
                    }
                }
            } catch (Exception e) {
                C60775q.m236136a(e.getMessage());
                return;
            }
        }
        C60700b.m235851b("MeetingFeedbackDialog", "[show]", "meetingId is error so don't show dialog");
    }
}
