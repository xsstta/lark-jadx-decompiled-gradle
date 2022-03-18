package com.ss.android.vc.meeting.module.subtitle;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.LangDetectInfo;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.lark.guidetips.VideoChatGuideConstants;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.subtitle.C63190r;
import com.ss.android.vc.meeting.module.subtitle.widget.C63215e;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event2.MeetingSubtitleEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.r */
public class C63190r extends AbstractC61424d implements AbstractC63157e {

    /* renamed from: a */
    public C63172n f159299a;

    /* renamed from: b */
    public LinearLayout f159300b;

    /* renamed from: c */
    public boolean f159301c;

    /* renamed from: d */
    private View f159302d;

    /* renamed from: e */
    private FrameLayout f159303e;

    /* renamed from: f */
    private C63189q f159304f;

    /* renamed from: g */
    private FrameLayout f159305g;

    /* renamed from: h */
    private SubtitleStatusBar f159306h;

    /* renamed from: i */
    private SubtitleSettingFrame f159307i;

    /* renamed from: j */
    private C63164k f159308j;

    /* renamed from: k */
    private View f159309k;

    /* renamed from: l */
    private View f159310l;

    /* renamed from: m */
    private View f159311m;

    /* renamed from: n */
    private View f159312n;

    /* renamed from: o */
    private String f159313o = "";

    /* renamed from: p */
    private boolean f159314p;

    /* renamed from: q */
    private ViewTreeObserver.OnGlobalLayoutListener f159315q;

    /* renamed from: r */
    private boolean f159316r;

    /* renamed from: d */
    public View mo218733d() {
        return this.f159302d;
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: g */
    public void mo218628g() {
        if (m247478j() != null) {
            m247478j().mo218722b();
        }
    }

    /* renamed from: f */
    private void m247476f() {
        if (!this.f159316r) {
            this.f159316r = true;
            this.f159312n.getViewTreeObserver().addOnGlobalLayoutListener(this.f159315q);
        }
    }

    /* renamed from: i */
    private void m247477i() {
        if (this.f159316r) {
            this.f159312n.getViewTreeObserver().removeOnGlobalLayoutListener(this.f159315q);
            this.f159316r = false;
        }
    }

    /* renamed from: l */
    private void m247480l() {
        int i;
        if (this.f159308j != null) {
            boolean checkToShow = VideoChatModule.getDependency().getGuideDependency().checkToShow("all_vc_subtitles");
            View view = this.f159308j.f159169d;
            if (checkToShow) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: c */
    public void mo218732c() {
        if (this.f159310l != null) {
            View view = this.f159311m;
            if (view == null || view.getMeasuredHeight() <= 0) {
                this.f159310l.setVisibility(8);
            } else {
                this.f159310l.setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: h */
    public void mo218630h() {
        getMeeting().av().mo213462a(mo218733d(), VideoChatGuideConstants.GuideType.Subtitle);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        getMeeting().mo212107Y().mo218556a(this);
        getMeeting().mo212107Y().mo218554a(getActivity());
    }

    /* renamed from: j */
    private C63189q m247478j() {
        if (this.f159303e == null) {
            m247475e();
        }
        if (this.f159304f == null) {
            C63189q qVar = new C63189q(this.mPresent);
            this.f159304f = qVar;
            this.f159303e.addView(qVar, new FrameLayout.LayoutParams(-1, -1));
            this.f159304f.setHisOpenListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$r$_S1pjkzGCMf_cmthEvjqDwAXY */

                public final void onClick(View view) {
                    C63190r.this.m247473b((C63190r) view);
                }
            });
            this.f159304f.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.C63190r.C631933 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C63190r.this.mo218731b();
                    MeetingSubtitleEvent.m249722a().mo220228a("show_history", "none", null, C63190r.this.getMeeting().mo212056e(), null);
                }
            });
        }
        return this.f159304f;
    }

    /* renamed from: k */
    private void m247479k() {
        if (this.f159308j != null) {
            if (getMeeting().mo212107Y().f159071a) {
                this.f159308j.f159168c.setText(R.string.View_G_TurnSubtitlesOff);
            } else {
                this.f159308j.f159168c.setText(R.string.View_M_Subtitles);
            }
        }
        m247480l();
    }

    /* renamed from: a */
    public SubtitleStatusBar mo218730a() {
        if (this.f159306h == null) {
            this.f159306h = new SubtitleStatusBar(getContext());
        }
        return this.f159306h;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        getMeeting().mo212107Y().mo218559b(this);
        C60740ad.m236044a((View) this.f159306h);
        FrameLayout frameLayout = this.f159303e;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f159303e = null;
        }
        FrameLayout frameLayout2 = this.f159305g;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
            this.f159305g = null;
        }
        SubtitleStatusBar subtitleStatusBar = this.f159306h;
        if (subtitleStatusBar != null) {
            subtitleStatusBar.mo218547a();
            this.f159306h = null;
        }
        C63189q qVar = this.f159304f;
        if (qVar != null) {
            qVar.mo218723c();
            this.f159304f = null;
        }
    }

    /* renamed from: b */
    public void mo218731b() {
        C63172n nVar = new C63172n(this.mPresent);
        this.f159299a = nVar;
        nVar.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63190r.View$OnAttachStateChangeListenerC631944 */

            public void onViewAttachedToWindow(View view) {
                C63190r.this.getMeeting().mo212107Y().mo218565d(true);
                if (C61999a.m242220f()) {
                    C63190r.this.f159301c = true;
                    if (C63190r.this.getActivity() != null && !C63190r.this.getActivity().isFinishing()) {
                        C63190r.this.getActivity().setRequestedOrientation(1);
                        return;
                    }
                    return;
                }
                C63190r.this.f159301c = false;
            }

            public void onViewDetachedFromWindow(View view) {
                C63190r.this.getMeeting().mo212107Y().mo218565d(false);
                if (C63190r.this.getRootView().isAttachedToWindow() && C63190r.this.mo218730a() != null) {
                    C63190r.this.mo218730a().mo218548a(C63190r.this.f159300b, C63190r.this.getMeeting().mo212107Y().mo218564d());
                }
                C63190r.this.f159299a.removeOnAttachStateChangeListener(this);
                if (C63190r.this.f159301c && C63190r.this.mPresent.mo212924i() && C63190r.this.getActivity() != null && !C63190r.this.getActivity().isFinishing()) {
                    C63190r.this.getActivity().setRequestedOrientation(0);
                }
            }
        });
        if (getMeeting().mo212058g() == VideoChat.Type.CALL) {
            C63763l.m250313g(getMeeting().mo212056e());
        } else if (getMeeting().mo212058g() == VideoChat.Type.MEET) {
            C63742at.m250112s(getMeeting().mo212056e());
        }
        FrameLayout frameLayout = this.f159305g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f159305g.addView(this.f159299a);
        }
    }

    /* renamed from: e */
    private void m247475e() {
        if (this.f159302d == null || this.f159305g == null) {
            this.f159305g = (FrameLayout) getRootView().findViewById(R.id.history_content);
            C60748b.m236068a(getActivity(), R.layout.layout_real_subtitle_bottom, (ViewGroup) getRootView().findViewById(R.id.container_subtitle), true);
            this.f159300b = (LinearLayout) getRootView().findViewById(R.id.meeting_loading_container);
            this.f159302d = getRootView().findViewById(R.id.subtitle_container);
            this.f159303e = (FrameLayout) getRootView().findViewById(R.id.subtitle_content);
            this.f159311m = getRootView().findViewById(R.id.container_share_toolbar);
            this.f159310l = findViewById(R.id.divider_view);
            this.f159309k = findViewById(R.id.close_subtitle_view);
            this.f159312n = getRootView().findViewById(R.id.container_bottom_extra_layout);
            this.f159315q = new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.C63190r.ViewTreeObserver$OnGlobalLayoutListenerC631911 */

                public void onGlobalLayout() {
                    C63190r.this.mo218732c();
                }
            };
            this.f159309k.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.C63190r.C631922 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    VcBizSender.m249197a(C63190r.this.mPresent.mo212921f().mo212055d(), false, (String) null, (String) null, (Boolean) null).mo219896d();
                    MeetingSubtitleEvent.m249722a().mo220228a("close", "vc_meeting_onthecall_view", null, C63190r.this.getMeeting().mo212056e(), null);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m247473b(View view) {
        mo218731b();
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: f */
    public void mo218568f(boolean z) {
        this.f159314p = z;
    }

    public C63190r(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    /* renamed from: b */
    private void m247474b(final LangDetectInfo langDetectInfo) {
        VcBizSender.m249235b(langDetectInfo.f152445c, (Map<String, String>) null).mo219889a(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63190r.C631966 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m247497a(DialogInterface dialogInterface, int i) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleViewControl", "[onDetectedLangUnsupported2]", "get i18n template failed");
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("SubtitleViewControl", "[ponDetectedLangUnsupported]", "detectedLang: " + langDetectInfo.f152445c + "=> " + str);
                VCDialogUtils.m236206a(C63190r.this.getContext(), UIHelper.mustacheFormat((int) R.string.View_G_DetectedSpokenLanguageTitleBraces, "detectedLang", str), 2, UIHelper.mustacheFormat((int) R.string.View_G_SpeakingUnsupportedLangSelectBraces, "unsupportedLang", str), (int) R.string.View_G_OpenSubtitleSettings, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$r$6$F_z4oF4Fb0KtPqfIejCJEwkG4PQ */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C63190r.C631966.this.m247498b(dialogInterface, i);
                    }
                }, (int) R.string.View_G_OkButton, (DialogInterface.OnClickListener) $$Lambda$r$6$9XOotjufNcM07JSLBRltLDR894I.INSTANCE, false);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m247498b(DialogInterface dialogInterface, int i) {
                C63215e.m247567a(C63190r.this.getActivity(), C63190r.this.getMeeting(), "mismatch_language_tip").mo211606a();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: a */
    public void mo218555a(View view) {
        C63164k kVar = new C63164k();
        this.f159308j = kVar;
        kVar.mo218641a(view);
        m247479k();
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: e */
    public void mo218567e(boolean z) {
        int i;
        View view = this.f159302d;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m247472a(final LangDetectInfo langDetectInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(langDetectInfo.f152447e);
        arrayList.add(langDetectInfo.f152445c);
        VcBizSender.m249241b(arrayList, (Map<String, String>) null).mo219889a(new AbstractC63598b<List<String>>() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63190r.C631955 */

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ void m247495b(DialogInterface dialogInterface, int i) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleViewControl", "[onDetectedLangMismatch]", "get i18n template failed");
            }

            /* renamed from: a */
            public void onSuccess(List<String> list) {
                HashMap hashMap = new HashMap();
                hashMap.put("originalLang", list.get(0));
                hashMap.put("detectedLang", list.get(1));
                C60700b.m235851b("SubtitleViewControl", "[onDetectedLangMismatch]", "originalLang: " + langDetectInfo.f152447e + "=> " + list.get(0) + "; detectedLang, " + langDetectInfo.f152445c + "=> " + list.get(1));
                VCDialogUtils.m236208a(C63190r.this.getContext(), UIHelper.mustacheFormat((int) R.string.View_G_DetectedSpokenLanguageTitleBraces, "detectedLang", list.get(1)), 2, UIHelper.mustacheFormat((int) R.string.View_G_DetectedSpokenLanguageInfoBraces, hashMap), UIHelper.mustacheFormat((int) R.string.View_G_KeepUsingOriginalBraces, "originalLang", list.get(0)), (DialogInterface.OnClickListener) $$Lambda$r$5$Lnwr1Fa1Lig41H_fCAnLBwv2dhw.INSTANCE, C63190r.this.getContext().getResources().getString(R.string.View_G_OpenSubtitleSettings), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$r$5$4y2sdP9r1fE_yurP3LrMMwLjmKM */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C63190r.C631955.this.m247494a(dialogInterface, i);
                    }
                }, false);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m247494a(DialogInterface dialogInterface, int i) {
                C63215e.m247567a(C63190r.this.getActivity(), C63190r.this.getMeeting(), "mismatch_language_tip").mo211606a();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: a */
    public void mo218625a(InMeetingData.SubtitleStatusData subtitleStatusData) {
        if (subtitleStatusData.f152438a == InMeetingData.SubtitleStatusData.Status.LANG_DETECTED && !getMeeting().aa().mo216276d()) {
            if (subtitleStatusData.f152439b.f152443a == LangDetectInfo.Type.MISMATCH) {
                m247472a(subtitleStatusData.f152439b);
            } else if (subtitleStatusData.f152439b.f152443a == LangDetectInfo.Type.UNSUPPORTED) {
                m247474b(subtitleStatusData.f152439b);
            }
        }
        if (this.f159299a != null && getMeeting().mo212107Y().mo218569f()) {
            this.f159299a.mo218659a(subtitleStatusData);
        }
        mo218730a().mo218548a(this.f159300b, getMeeting().mo212107Y().mo218564d());
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: g */
    public void mo218629g(boolean z) {
        int i;
        m247475e();
        if (z) {
            m247476f();
            mo218732c();
            MeetingSubtitleEvent.m249722a().mo220227a(getMeeting().mo212056e());
        } else {
            m247477i();
        }
        View view = this.f159302d;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        getMeeting().mo212107Y().mo218562c(z);
        if (z) {
            onOrientation(C60776r.m236143a(getActivity()), false);
            m247478j().mo218720a(true, getMeeting().mo212107Y().mo218564d());
        }
        m247479k();
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: a */
    public void mo218626a(MeetingSubtitleData meetingSubtitleData) {
        C63172n nVar;
        if (getMeeting().mo212107Y().mo218569f() && (nVar = this.f159299a) != null) {
            nVar.mo218660a(meetingSubtitleData);
        }
        if (meetingSubtitleData.mEvent == null) {
            mo218730a().mo218548a(this.f159300b, getMeeting().mo212107Y().mo218564d());
            m247478j().mo218719a(meetingSubtitleData);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        if (getMeeting().mo212107Y().f159071a) {
            if (this.f159303e == null) {
                m247478j();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f159303e.getLayoutParams();
            if (z) {
                marginLayoutParams.height = C60773o.m236123b((int) R.dimen.subtitle_bottom_view_height);
            } else {
                marginLayoutParams.height = C60773o.m236123b((int) R.dimen.subtitle_bottom_view_height);
            }
            this.f159303e.setLayoutParams(marginLayoutParams);
            C63172n nVar = this.f159299a;
            if (nVar != null && nVar.isAttachedToWindow()) {
                this.f159299a.mo218667b(z, z2);
            }
            C63189q qVar = this.f159304f;
            if (qVar != null) {
                qVar.mo218721a(z, z2);
            }
            SubtitleSettingFrame subtitleSettingFrame = this.f159307i;
            if (subtitleSettingFrame != null && subtitleSettingFrame.isAttachedToWindow()) {
                this.f159307i.mo218542a(z, z2);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: a */
    public void mo218627a(boolean z, String str, String str2) {
        boolean z2;
        boolean z3 = false;
        if (!z || this.f159314p) {
            z2 = false;
        } else {
            z2 = true;
        }
        mo218629g(z2);
        if (z) {
            mo218730a().mo218549a(this.f159300b, true, getMeeting().mo212107Y().mo218564d());
            if (this.f159299a != null) {
                if (!TextUtils.isEmpty(str) && !str.equals(this.f159313o)) {
                    z3 = true;
                }
                if (m247478j() != null && z3) {
                    this.f159313o = str;
                    m247478j().mo218722b();
                }
                this.f159299a.mo218664a(true, z3);
            }
            SubtitleSettingFrame subtitleSettingFrame = this.f159307i;
            if (subtitleSettingFrame != null) {
                subtitleSettingFrame.mo218541a(str2);
            }
        }
    }
}
