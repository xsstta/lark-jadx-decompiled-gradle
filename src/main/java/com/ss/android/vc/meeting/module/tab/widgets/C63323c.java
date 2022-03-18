package com.ss.android.vc.meeting.module.tab.widgets;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.AbstractC60728a;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dto.NewGuideConfig;

/* renamed from: com.ss.android.vc.meeting.module.tab.widgets.c */
public class C63323c {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.tab.widgets.c$a */
    public static class C63326a {

        /* renamed from: a */
        static C63323c f159777a = new C63323c();
    }

    /* renamed from: a */
    public static C63323c m248039a() {
        return C63326a.f159777a;
    }

    /* renamed from: a */
    public void mo219111a(final View view) {
        if (view == null) {
            C60700b.m235851b("VideoChatTab_VCTabGuideComponent", "[startGuide]", "anchorView is null.");
        } else {
            C60735ab.m235996a(new AbstractC60728a<Boolean>() {
                /* class com.ss.android.vc.meeting.module.tab.widgets.C63323c.C633241 */

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public Boolean mo208348a() {
                    return Boolean.valueOf(VideoChatModuleDependency.getGuideDependency().checkToShow("android_vc_new_onboarding"));
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo208351b(Boolean bool) {
                    super.mo208351b(bool);
                    C60700b.m235851b("VideoChatTab_VCTabGuideComponent", "[startGuide2]", "show= " + bool);
                    if (bool.booleanValue()) {
                        View view = view;
                        VideoChatModuleDependency.getGuideDependency().mo196399a("video_chat_main_tab", new NewGuideConfig(view, "android_vc_new_onboarding", "", view.getContext().getString(R.string.View_G_RecentMeetingsOnboarding)), null);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo219112b(final View view) {
        if (view == null) {
            C60700b.m235851b("VideoChatTab_VCTabGuideComponent", "[startHistoryGuide]", "anchorView is null.");
        } else {
            C60735ab.m235996a(new AbstractC60728a<Boolean>() {
                /* class com.ss.android.vc.meeting.module.tab.widgets.C63323c.C633252 */

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public Boolean mo208348a() {
                    return Boolean.valueOf(VideoChatModuleDependency.getGuideDependency().checkToShow("android_vc_tab_recentmeetings_onboarding"));
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo208351b(Boolean bool) {
                    super.mo208351b(bool);
                    C60700b.m235851b("VideoChatTab_VCTabGuideComponent", "[startHistoryGuide2]", "show= " + bool);
                    if (bool.booleanValue()) {
                        View view = view;
                        VideoChatModuleDependency.getGuideDependency().mo196399a("video_chat_history", new NewGuideConfig(view, "android_vc_tab_recentmeetings_onboarding", "", view.getContext().getString(R.string.View_G_TapToViewMeetingDetails), 80), null);
                    }
                }
            });
        }
    }
}
