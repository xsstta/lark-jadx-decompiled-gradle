package com.ss.android.vc.meeting.module.p3118e;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.InMeetingGuideView;
import com.ss.android.vc.dto.NewGuideConfig;
import com.ss.android.vc.entity.C60938g;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.lark.guidetips.VideoChatGuideConstants;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.guides.NewGuideDelegate;
import com.ss.android.vc.meeting.module.p3118e.AbstractC61601a;
import java.util.LinkedList;

/* renamed from: com.ss.android.vc.meeting.module.e.c */
public class C61604c extends AbstractC61424d implements AbstractC61601a.AbstractC61602a {

    /* renamed from: a */
    private InMeetingGuideView f154542a;

    /* renamed from: b */
    private boolean f154543b;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m240516e() {
    }

    /* renamed from: d */
    private void m240515d() {
        m240512a(InMeetingGuideView.ThemeMode.LIGHT);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m240517f() {
        InMeetingGuideView inMeetingGuideView = this.f154542a;
        if (inMeetingGuideView != null && inMeetingGuideView.isShown()) {
            this.f154542a.mo208436a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m240518g() {
        mo213471a(findViewById(R.id.share_container));
    }

    @Override // com.ss.android.vc.meeting.module.p3118e.AbstractC61601a.AbstractC61602a
    /* renamed from: b */
    public boolean mo213469b() {
        InMeetingGuideView inMeetingGuideView = this.f154542a;
        if (inMeetingGuideView == null || !inMeetingGuideView.isShown()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        getMeeting().av().mo213464b(this);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        getMeeting().av().mo213463a(this);
    }

    @Override // com.ss.android.vc.meeting.module.p3118e.AbstractC61601a.AbstractC61602a
    /* renamed from: a */
    public void mo213467a() {
        InMeetingGuideView inMeetingGuideView;
        if (this.f154543b && (inMeetingGuideView = this.f154542a) != null && inMeetingGuideView.isShown()) {
            this.f154543b = false;
            this.f154542a.mo208436a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3118e.AbstractC61601a.AbstractC61602a
    /* renamed from: c */
    public int mo213470c() {
        LinearLayout linearLayout;
        InMeetingGuideView inMeetingGuideView = this.f154542a;
        if (inMeetingGuideView == null || !inMeetingGuideView.isShown() || (linearLayout = (LinearLayout) this.f154542a.findViewById(R.id.layout_settings_more_guide)) == null) {
            return 0;
        }
        return linearLayout.getMeasuredHeight();
    }

    public C61604c(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    /* renamed from: a */
    private void m240512a(InMeetingGuideView.ThemeMode themeMode) {
        if (this.f154542a == null) {
            ((ViewStub) findViewById(R.id.stub_guide)).inflate();
            this.f154542a = (InMeetingGuideView) findViewById(R.id.view_guide);
        }
        this.f154542a.setThemeMode(themeMode);
    }

    /* renamed from: b */
    private void m240513b(View view) {
        InMeetingGuideView inMeetingGuideView = this.f154542a;
        if (inMeetingGuideView != null) {
            inMeetingGuideView.setDismissListener($$Lambda$c$HLakVjdbmuo2NUrMhFV7ClI6Yac.INSTANCE);
        }
        if (view == null || view.getVisibility() == 8) {
            InMeetingGuideView inMeetingGuideView2 = this.f154542a;
            if (inMeetingGuideView2 != null && inMeetingGuideView2.isShown()) {
                this.f154542a.mo208436a();
            }
        } else if (getMeeting().ar().mo216861e()) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(new InMeetingGuideView.C60800a("mobile_vc_chatandreaction", C60773o.m236119a((int) R.string.View_G_ChatAndReactionsOnboarding)));
            m240512a(InMeetingGuideView.ThemeMode.LIGHT);
            this.f154542a.mo208438a(view, linkedList, true);
        }
    }

    /* renamed from: a */
    public void mo213471a(View view) {
        InMeetingGuideView inMeetingGuideView = this.f154542a;
        if (inMeetingGuideView != null) {
            inMeetingGuideView.setDismissListener(new InMeetingGuideView.AbstractC60801b() {
                /* class com.ss.android.vc.meeting.module.p3118e.C61604c.C616062 */

                @Override // com.ss.android.vc.common.widget.InMeetingGuideView.AbstractC60801b
                public void onDismiss() {
                }
            });
        }
        if (view == null || view.getVisibility() == 8) {
            InMeetingGuideView inMeetingGuideView2 = this.f154542a;
            if (inMeetingGuideView2 != null && inMeetingGuideView2.isShown()) {
                this.f154542a.mo208436a();
            }
        } else if (getMeeting().mo212105W().mo212845x().mo214446c()) {
            getMeeting().mo212105W().mo212845x().m_(false);
            Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
            this.f154543b = true;
            if (!getMeeting().mo212099Q() || j == null || C60938g.m237062b(j)) {
                InMeetingGuideView inMeetingGuideView3 = this.f154542a;
                if (inMeetingGuideView3 != null) {
                    this.f154543b = false;
                    inMeetingGuideView3.mo208436a();
                    return;
                }
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(new InMeetingGuideView.C60800a(null, C60773o.m236119a((int) R.string.View_G_InterpretingSelectChannel)));
            m240512a(InMeetingGuideView.ThemeMode.DARK);
            this.f154542a.mo208441b(view, linkedList);
            C60735ab.m236002a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.p3118e.$$Lambda$c$WVk101FJx8JTOAguo2HdnaZSlk4 */

                public final void run() {
                    C61604c.this.m240517f();
                }
            }, 6000);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        InMeetingGuideView inMeetingGuideView = this.f154542a;
        if (inMeetingGuideView != null) {
            inMeetingGuideView.mo208440a(z, z2);
        }
    }

    /* renamed from: b */
    private void m240514b(View view, VideoChatGuideConstants.GuideType guideType) {
        boolean z;
        if (guideType == VideoChatGuideConstants.GuideType.Normal) {
            NewGuideDelegate.m240527a(new NewGuideConfig(view, "pc_vc_hide_controlbar", null, C60773o.m236119a((int) R.string.View_VM_ControlBarOnboarding)), new NewGuideDelegate.GuideLifecycleListenerAdapter() {
                /* class com.ss.android.vc.meeting.module.p3118e.C61604c.C616051 */

                @Override // com.ss.android.vc.dependency.AbstractC60902q.AbstractC60903a, com.ss.android.vc.meeting.module.guides.NewGuideDelegate.GuideLifecycleListenerAdapter
                /* renamed from: c */
                public void mo144597c(String str) {
                    C61604c cVar = C61604c.this;
                    cVar.mo213471a(cVar.findViewById(R.id.share_container));
                }
            });
        } else if (guideType == VideoChatGuideConstants.GuideType.Livestream) {
            C61303k meeting = getMeeting();
            if (!meeting.mo212091I().mo212490a().mo212476h() || !meeting.aa().mo216279g() || meeting.mo212058g() != VideoChat.Type.MEET) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                NewGuideDelegate.m240526a(new NewGuideConfig(view, "all_vc_meet_live", null, C60773o.m236119a((int) R.string.View_M_LivestreamingOnboardingNew)));
            }
        } else if (guideType == VideoChatGuideConstants.GuideType.Subtitle) {
            NewGuideDelegate.m240526a(new NewGuideConfig(view, "all_vc_subtitles_history", null, C60773o.m236119a((int) R.string.View_G_SwipeUpForPreviousSubtitles)));
        } else if (guideType == VideoChatGuideConstants.GuideType.LanguageInterpretation) {
            m240515d();
            mo213471a(view);
        } else if (guideType == VideoChatGuideConstants.GuideType.chatAndReaction) {
            m240515d();
            m240513b(view);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3118e.AbstractC61601a.AbstractC61602a
    /* renamed from: a */
    public void mo213468a(View view, VideoChatGuideConstants.GuideType guideType) {
        boolean z;
        if (this.mPresent.mo212926k()) {
            if (NewGuideDelegate.m240533b()) {
                InMeetingGuideView inMeetingGuideView = this.f154542a;
                if (inMeetingGuideView != null) {
                    inMeetingGuideView.mo208436a();
                }
                m240514b(view, guideType);
                return;
            }
            C60700b.m235851b("GuidesViewControl", "[showGuides]", guideType + ", anchorView = " + view);
            if (guideType == VideoChatGuideConstants.GuideType.Normal) {
                if (!VideoChatModule.getDependency().getGuideDependency().checkToShow("pc_vc_hide_controlbar") || view == null || view.getVisibility() != 0) {
                    mo213471a(findViewById(R.id.share_container));
                    return;
                }
                LinkedList linkedList = new LinkedList();
                linkedList.add(new InMeetingGuideView.C60800a("pc_vc_hide_controlbar", C60773o.m236119a((int) R.string.View_VM_ControlBarOnboarding)));
                m240515d();
                this.f154542a.setDismissListener(new InMeetingGuideView.AbstractC60801b() {
                    /* class com.ss.android.vc.meeting.module.p3118e.$$Lambda$c$rCgbssJcJQ6ZKwc_TlMDP9yQ0nA */

                    @Override // com.ss.android.vc.common.widget.InMeetingGuideView.AbstractC60801b
                    public final void onDismiss() {
                        C61604c.this.m240518g();
                    }
                });
                this.f154542a.mo208441b(view, linkedList);
            } else if (guideType == VideoChatGuideConstants.GuideType.Livestream) {
                if (!VideoChatModule.getDependency().getGuideDependency().checkToShow("all_vc_meet_live") || !getMeeting().mo212091I().mo212490a().mo212476h() || !getMeeting().aa().mo216279g() || getMeeting().mo212058g() != VideoChat.Type.MEET) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && view != null && view.getVisibility() == 0) {
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(new InMeetingGuideView.C60800a("all_vc_meet_live", C60773o.m236119a((int) R.string.View_M_LivestreamingOnboardingNew)));
                    m240515d();
                    if (this.f154542a.getVisibility() == 8) {
                        this.f154542a.mo208441b(view, linkedList2);
                    } else {
                        this.f154542a.mo208437a(view, linkedList2);
                    }
                }
            } else if (guideType == VideoChatGuideConstants.GuideType.Subtitle) {
                if (!VideoChatModule.getDependency().getGuideDependency().checkToShow("all_vc_subtitles_history") || view == null || view.getVisibility() != 0) {
                    InMeetingGuideView inMeetingGuideView2 = this.f154542a;
                    if (inMeetingGuideView2 != null) {
                        inMeetingGuideView2.mo208436a();
                        return;
                    }
                    return;
                }
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(new InMeetingGuideView.C60800a("all_vc_subtitles_history", C60773o.m236119a((int) R.string.View_G_SwipeUpForPreviousSubtitles)));
                m240515d();
                this.f154542a.mo208441b(view, linkedList3);
            } else if (guideType == VideoChatGuideConstants.GuideType.LanguageInterpretation) {
                mo213471a(view);
            } else if (guideType == VideoChatGuideConstants.GuideType.chatAndReaction) {
                m240513b(view);
            }
        }
    }
}
