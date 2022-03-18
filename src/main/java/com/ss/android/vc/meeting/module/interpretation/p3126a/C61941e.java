package com.ss.android.vc.meeting.module.interpretation.p3126a;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.C60938g;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.interpretation.C61934a;
import com.ss.android.vc.meeting.module.interpretation.p3128c.C61960b;
import com.ss.android.vc.meeting.module.interpretation.widget.ChannelSwitchBar;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.reaction.AbsReactionControl;
import com.ss.android.vc.meeting.module.topbar.data.TopBarInterpretationData;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.a.e */
public class C61941e extends AbstractC61424d implements AbstractC61936b {

    /* renamed from: a */
    public AbstractC61935a f155570a;

    /* renamed from: b */
    private ChannelSwitchBar f155571b;

    /* renamed from: c */
    private C61960b f155572c;

    /* renamed from: d */
    private boolean f155573d;

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214456a(C61934a aVar) {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: b */
    public void mo214459b(List<LanguageType> list) {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: c */
    public void mo214461c(Participant participant) {
    }

    /* renamed from: b */
    private void m241985b() {
        m241986c();
        m241987d();
        m241988e();
    }

    /* renamed from: f */
    private void m241989f() {
        C26171w.m94676a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.interpretation.p3126a.C61941e.RunnableC619443 */

            public void run() {
                AbsReactionControl r = C61941e.this.getMeeting().mo212105W().mo212839r();
                if (r != null) {
                    r.mo216843a();
                }
            }
        }, 30);
    }

    /* renamed from: e */
    private void m241988e() {
        LanguageType a = getMeeting().mo212105W().mo212845x().mo214436a();
        if (a != null) {
            mo214453a(a);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        getMeeting().mo212105W().mo212845x().mo214444b(this);
        this.f155572c.mo214511b();
    }

    /* renamed from: g */
    private void m241990g() {
        int i;
        if (this.f155573d) {
            boolean f = C61999a.m242220f();
            boolean z = getMeeting().mo212107Y().f159071a;
            if (f) {
                i = UIHelper.dp2px(86.0f);
            } else {
                i = UIHelper.dp2px(124.0f);
            }
            m241983a(i);
            return;
        }
        m241983a(UIHelper.dp2px(6.0f));
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        AbstractC61935a x = getMeeting().mo212105W().mo212845x();
        this.f155570a = x;
        x.mo214439a(this);
        this.f155572c = getMeeting().mo212105W().mo212845x().mo214442b();
    }

    /* renamed from: c */
    private void m241986c() {
        C60700b.m235851b("InterpretationViewControl", "[initChannelBar]", "initChannelBar");
        this.f155571b = (ChannelSwitchBar) findViewById(R.id.bar_channel_switch);
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        VideoChatSettings c = getMeeting().mo212091I().mo212496c().mo212429c();
        if (c == null || !c.isMeetingOpenInterpretation() || j == null || !C60938g.m237062b(j)) {
            m241984a(false, j);
        } else {
            m241984a(true, j);
            m241989f();
        }
        this.f155571b.setSelectedListener(new ChannelSwitchBar.OnItemClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.p3126a.C61941e.C619421 */

            @Override // com.ss.android.vc.meeting.module.interpretation.widget.ChannelSwitchBar.OnItemClickListener
            /* renamed from: a */
            public void mo214473a(boolean z, LanguageType languageType) {
                if (languageType != null) {
                    C60700b.m235851b("InterpretationViewControl", "[setPublishChannel]", "languageType=" + languageType.languageType);
                    C61941e.this.f155570a.mo214441a(languageType.languageType);
                    C61941e.this.mo214472a();
                }
            }
        });
        this.f155573d = getMeeting().ag().isSketchOn();
        m241990g();
    }

    /* renamed from: d */
    private void m241987d() {
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        VideoChatSettings c = getMeeting().mo212091I().mo212496c().mo212429c();
        if (c != null && c.isMeetingOpenInterpretation() && j != null && j.getParticipantSettings() != null && j.getParticipantSettings().getInterpreterSetting() != null && j.getParticipantSettings().getInterpreterSetting().confirmStatus == InterpreterSetting.ConfirmStatus.WAIT_CONFIRM) {
            C60700b.m235851b("InterpretationViewControl", "[initInterpretAssignDialog]", "recovery dialog");
            this.f155572c.mo214508a(getActivity(), j.getParticipantSettings().getInterpreterSetting().firstLanguage, j.getParticipantSettings().getInterpreterSetting().secondLanguage);
        }
    }

    /* renamed from: a */
    public void mo214472a() {
        C60700b.m235851b("InterpretationViewControl", "[sendSwitchChannelRequest]", "start");
        final LanguageType selectedLanguage = this.f155571b.getSelectedLanguage();
        InterpreterSetting interpreterSetting = new InterpreterSetting();
        interpreterSetting.firstLanguage = this.f155571b.getLeftLanguage();
        interpreterSetting.secondLanguage = this.f155571b.getRightLanguage();
        interpreterSetting.interpretingLanguage = selectedLanguage;
        interpreterSetting.confirmStatus = InterpreterSetting.ConfirmStatus.CONFIRMED;
        VcBizSender.m249162a(getMeeting().mo212055d(), interpreterSetting).mo219893b(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.interpretation.p3126a.C61941e.C619432 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("InterpretationViewControl", "[sendSwitchChannelRequest2]", "onSuccess ," + selectedLanguage.languageType);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("InterpretationViewControl", "[sendSwitchChannelRequest3]", "onError error=" + eVar);
            }
        });
    }

    public C61941e(AbstractC61429i iVar) {
        super(iVar);
        init();
        m241985b();
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: b */
    public void mo214460b(boolean z) {
        C60700b.m235851b("InterpretationViewControl", "[onSketchShowInMeeting]", "isShow: " + z);
        this.f155573d = z;
        m241990g();
    }

    /* renamed from: a */
    private void m241983a(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ChannelSwitchBar channelSwitchBar = this.f155571b;
        if ((channelSwitchBar != null || channelSwitchBar.getVisibility() == 0) && (layoutParams = this.f155571b.getLayoutParams()) != null) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            }
            marginLayoutParams.bottomMargin = i;
            this.f155571b.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: c */
    public void mo214462c(boolean z) {
        if (z) {
            boolean z2 = getMeeting().mo212107Y().f159071a;
            int i = 0;
            if (C61999a.m242220f()) {
                if (z2) {
                    i = C60773o.m236123b((int) R.dimen.dp_53);
                }
            } else if (z2) {
                i = C60773o.m236123b((int) R.dimen.subtitle_bottom_view_height);
            }
            m241983a(UIHelper.dp2px(39.0f) - i);
            return;
        }
        m241983a(UIHelper.dp2px(6.0f));
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: b */
    public void mo214458b(Participant participant) {
        VideoChatUser userInfoInCache;
        String str;
        if (getMeeting().mo212099Q() && isHost() && (userInfoInCache = UserInfoService.getUserInfoInCache(participant.getId(), participant.getParticipantType())) != null) {
            if (participant.getParticipantType() == ParticipantType.NEO_USER || participant.getParticipantType().isNewType() || participant.getParticipantType().isUnknownType()) {
                str = participant.getParticipantSettings().getNickname();
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                str = userInfoInCache.getName();
            }
            C60738ac.m236029a(UIHelper.mustacheFormat((int) R.string.View_M_InterpreterLeftMeeting, "name", str));
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214453a(LanguageType languageType) {
        boolean z;
        C60700b.m235851b("InterpretationViewControl", "[onActiveLanguageTypeChanged]", "onActiveLanguageTypeChanged");
        if (languageType == null || TextUtils.equals(languageType.languageType, getMeeting().mo212105W().mo212845x().mo214447d().languageType)) {
            z = false;
        } else {
            z = true;
        }
        getMeeting().ah().mo219478a(new TopBarInterpretationData(z, languageType));
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214457a(boolean z) {
        C60700b.m235851b("InterpretationViewControl", "[onOpenInterpretationChanged]", "isOpen=" + z);
        if (!z) {
            m241984a(false, (Participant) null);
            getMeeting().av().mo213461a();
            return;
        }
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        if (j != null && C60938g.m237062b(j)) {
            m241984a(true, j);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        super.onOrientation(z, z2);
        m241990g();
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214454a(LanguageType languageType, LanguageType languageType2) {
        C60700b.m235851b("InterpretationViewControl", "[onSelfToConfirmInterpretation]", "onSelfToConfirmInterpretation");
        this.f155572c.mo214512b(getActivity(), languageType, languageType2);
    }

    /* renamed from: a */
    private void m241984a(boolean z, Participant participant) {
        C60700b.m235851b("InterpretationViewControl", "[updateChannelBar]", "visible=" + z);
        if (z) {
            this.f155571b.setVisibility(0);
            if (participant != null && participant.getParticipantSettings() != null && participant.getParticipantSettings().getInterpreterSetting() != null) {
                InterpreterSetting interpreterSetting = participant.getParticipantSettings().getInterpreterSetting();
                this.f155571b.mo214575a(interpreterSetting.firstLanguage, interpreterSetting.secondLanguage, interpreterSetting.interpretingLanguage);
                if (interpreterSetting.interpretingLanguage != null) {
                    this.f155570a.mo214441a(interpreterSetting.interpretingLanguage.languageType);
                    return;
                }
                return;
            }
            return;
        }
        this.f155571b.setVisibility(8);
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214452a(@Nullable InterpreterSetting interpreterSetting, @Nullable InterpreterSetting interpreterSetting2) {
        ChannelSwitchBar channelSwitchBar;
        C60700b.m235851b("InterpretationViewControl", "[onSelfInterpretingLanguageUpdate]", "onSelfInterpretingLanguageUpdate");
        if (interpreterSetting2 != null && (channelSwitchBar = this.f155571b) != null && channelSwitchBar.getVisibility() == 0) {
            this.f155571b.mo214575a(interpreterSetting2.firstLanguage, interpreterSetting2.secondLanguage, interpreterSetting2.interpretingLanguage);
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61936b
    /* renamed from: a */
    public void mo214455a(Participant participant, Participant participant2) {
        if (C60938g.m237062b(participant) && !C60938g.m237062b(participant2)) {
            C60700b.m235851b("InterpretationViewControl", "[onSelfInterpretationRoleUpdate]", "isInterpreter? yes -> no");
            m241984a(false, participant2);
            this.f155570a.mo214441a("main");
        } else if (!C60938g.m237062b(participant) && C60938g.m237062b(participant2)) {
            C60700b.m235851b("InterpretationViewControl", "[onSelfInterpretationRoleUpdate]", "isInterpreter? no -> yes");
            m241984a(true, participant2);
            m241989f();
            getMeeting().av().mo213461a();
        }
    }
}
