package com.ss.android.vc.meeting.module.tab3.widgets;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dto.NewGuideConfig;
import com.ss.android.vc.meeting.module.tab3.widgets.p3178a.C63440b;

/* renamed from: com.ss.android.vc.meeting.module.tab3.widgets.a */
public class C63436a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.tab3.widgets.a$a */
    public static class C63437a {

        /* renamed from: a */
        static C63436a f160195a = new C63436a();
    }

    /* renamed from: a */
    public static C63436a m248525a() {
        return C63437a.f160195a;
    }

    /* renamed from: a */
    public void mo219464a(View view) {
        if (C63440b.m248531a()) {
            if (view == null) {
                C60700b.m235851b("VideoChatTab_GuideComponent", "[startHistoryGuide]", "anchorView is null.");
                return;
            }
            boolean checkToShow = VideoChatModuleDependency.getGuideDependency().checkToShow("android_vc_tab_recentmeetings_onboarding");
            C60700b.m235851b("VideoChatTab_GuideComponent", "[startHistoryGuide2]", "show= " + checkToShow);
            if (checkToShow) {
                VideoChatModuleDependency.getGuideDependency().mo196399a("video_chat_history", new NewGuideConfig(view, "android_vc_tab_recentmeetings_onboarding", "", view.getContext().getString(R.string.View_G_TapToViewMeetingDetails), 80), null);
            }
        }
    }
}
