package com.ss.android.vc.meeting.module.interpretation.p3126a;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.entity.C60938g;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.irtc.SubChannelInfo;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.interpretation.C61934a;
import com.ss.android.vc.meeting.module.interpretation.C61957c;
import com.ss.android.vc.meeting.module.interpretation.p3128c.C61960b;
import com.ss.android.vc.meeting.module.sketch.ISketchLoadListener;
import com.ss.android.vc.statistics.event.C63742at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.a.c */
public class C61937c extends AbstractC61935a implements C61381c.AbstractC61382a, C61388g.AbstractC61393a, ISketchLoadListener {

    /* renamed from: a */
    private List<AbstractC61936b> f155553a = new ArrayList();

    /* renamed from: b */
    private LanguageType f155554b = null;

    /* renamed from: c */
    private String f155555c = null;

    /* renamed from: d */
    private C61960b f155556d;

    /* renamed from: e */
    private boolean f155557e = true;

    /* renamed from: f */
    private C61934a f155558f = null;

    /* renamed from: g */
    private Participant f155559g = null;

    /* renamed from: h */
    private LanguageType f155560h;

    /* renamed from: i */
    private SubChannelInfo f155561i;

    /* renamed from: j */
    private C61957c f155562j;

    /* renamed from: k */
    private boolean f155563k = false;

    /* renamed from: l */
    private boolean f155564l = false;

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212620a(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212487a(boolean z) {
        C61381c.AbstractC61382a.CC.$default$a(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bB_() {
        C61388g.AbstractC61393a.CC.$default$bB_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bD_() {
        C61388g.AbstractC61393a.CC.$default$bD_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bG_() {
        C61388g.AbstractC61393a.CC.$default$bG_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public /* synthetic */ void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        C61381c.AbstractC61382a.CC.$default$onInMeetingInfoUpdate(this, videoChatInMeetingInfo);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$onSelfRtcModeUpdate(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadBegin() {
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadCanceled() {
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadFailed() {
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: a */
    public LanguageType mo214436a() {
        return this.f155554b;
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: b */
    public C61960b mo214442b() {
        return this.f155556d;
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: c */
    public boolean mo214446c() {
        return this.f155557e;
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: d */
    public LanguageType mo214447d() {
        return this.f155560h;
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: f */
    public boolean mo214450f() {
        return this.f155564l;
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: e */
    public C61957c mo214449e() {
        C61957c cVar = this.f155562j;
        if (cVar != null) {
            return cVar;
        }
        return new C61957c();
    }

    /* renamed from: h */
    private void m241954h() {
        if (!this.f155563k) {
            this.f155563k = true;
            getMeeting().mo212105W().mo212831j().addSketchLoadListener(this);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchClosed() {
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214460b(false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadFinished() {
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214460b(true);
        }
    }

    /* renamed from: g */
    private void m241953g() {
        ArrayList arrayList = new ArrayList();
        if (!this.f155564l || TextUtils.equals(this.f155554b.languageType, this.f155560h.languageType)) {
            arrayList.add(this.f155561i);
        }
        LanguageType languageType = this.f155554b;
        if (languageType != null && !TextUtils.equals(languageType.languageType, this.f155560h.languageType)) {
            arrayList.add(new SubChannelInfo(this.f155554b.languageType, -1.0d));
        }
        C61237h.m238223a().mo210520a((SubChannelInfo[]) arrayList.toArray(new SubChannelInfo[arrayList.size()]));
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214453a(this.f155554b);
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    public void m_(boolean z) {
        this.f155557e = z;
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: d */
    public void mo214448d(boolean z) {
        this.f155564l = z;
        m241953g();
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: a */
    public void mo214439a(AbstractC61936b bVar) {
        if (!this.f155553a.contains(bVar)) {
            this.f155553a.add(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: b */
    public void mo214444b(AbstractC61936b bVar) {
        if (this.f155553a.contains(bVar)) {
            this.f155553a.remove(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: b */
    public void mo214443b(Participant participant) {
        this.f155559g = participant;
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214461c(participant);
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: a */
    public void mo214437a(LanguageType languageType) {
        String str;
        if (languageType == null) {
            str = "null";
        } else {
            str = languageType.languageType;
        }
        C60700b.m235851b("InterpretationControl", "[setActiveLanguageType]", str);
        LanguageType languageType2 = this.f155554b;
        if (languageType2 == null || languageType == null || !TextUtils.equals(languageType2.languageType, languageType.languageType)) {
            C63742at.m250097g(this.mMeeting.mo212056e());
            this.f155554b = languageType;
            m241953g();
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: c */
    public void mo214445c(boolean z) {
        C60700b.m235851b("InterpretationControl", "[onFullScreenShowChanged]", "isShow : " + z);
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214462c(z);
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public void h_(boolean z) {
        C60700b.m235851b("InterpretationControl", "[onOpenInterpretationChanged]", "isOpen:" + z);
        this.f155556d.mo214513b(z);
        if (z) {
            m_(true);
        }
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214457a(z);
        }
    }

    public C61937c(C61303k kVar) {
        super(kVar);
        this.f155556d = new C61960b(kVar);
        kVar.mo212091I().mo212494b().mo212593a(this);
        kVar.mo212091I().mo212490a().mo212468a(this);
        LanguageType languageType = new LanguageType();
        this.f155560h = languageType;
        languageType.languageType = "main";
        this.f155560h.despI18nKey = "View_VM_PermissionsOffNew";
        this.f155554b = this.f155560h;
        this.f155561i = new SubChannelInfo("main", -1.0d);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public void mo212619a(Participant participant) {
        C60700b.m235851b("InterpretationControl", "[onInterpreterLeaveMeeting]", "participant" + participant.toString());
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214458b(participant);
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: a */
    public void mo214440a(C61957c cVar) {
        this.f155562j = cVar;
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: a */
    public void mo214441a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C61237h.m238223a().mo210545g(str);
            this.f155555c = str;
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public void mo212486a(List<LanguageType> list) {
        if (this.f155554b != null && !TextUtils.equals(this.f155560h.languageType, this.f155554b.languageType)) {
            boolean z = false;
            if (list != null && list.size() > 0) {
                Iterator<LanguageType> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (TextUtils.equals(it.next().languageType, this.f155554b.languageType)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z) {
                if (!isMeetHost()) {
                    C60738ac.m236023a((int) R.string.View_G_ChannelClosedOriginalAudio);
                }
                mo214437a(this.f155560h);
            }
        }
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214459b(list);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
        if (DisplayMode.WINDOW == displayMode) {
            this.f155556d.mo214511b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a
    /* renamed from: a */
    public void mo214438a(LanguageType languageType, boolean z) {
        this.f155558f = new C61934a(languageType, z);
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214456a(this.f155558f);
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public void mo212617a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
        String str;
        String str2 = "null";
        if (interpreterSetting != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("lastLanguageType:");
            if (interpreterSetting.interpretingLanguage == null) {
                str = str2;
            } else {
                str = interpreterSetting.interpretingLanguage.languageType;
            }
            sb.append(str);
            C60700b.m235851b("InterpretationControl", "[onSelfInterpretingLanguageUpdate]", sb.toString());
        }
        if (interpreterSetting2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("currentLanguageType:");
            if (interpreterSetting2.interpretingLanguage != null) {
                str2 = interpreterSetting2.interpretingLanguage.languageType;
            }
            sb2.append(str2);
            C60700b.m235851b("InterpretationControl", "[onSelfInterpretingLanguageUpdate2]", sb2.toString());
        }
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214452a(interpreterSetting, interpreterSetting2);
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: b */
    public void mo212621b(Participant participant, Participant participant2) {
        C60700b.m235851b("InterpretationControl", "[onSelfInterpretationRoleUpdate]", "lastSelf isInterpretation():" + C60938g.m237062b(participant) + "currentSelf isInterpretation():" + C60938g.m237062b(participant2));
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214455a(participant, participant2);
        }
        m241954h();
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public void mo212618a(LanguageType languageType, LanguageType languageType2) {
        C60700b.m235851b("InterpretationControl", "[onSelfToConfirmInterpretation]", "first:" + languageType.languageType + "second" + languageType2.languageType);
        for (AbstractC61936b bVar : this.f155553a) {
            bVar.mo214454a(languageType, languageType2);
        }
        if (this.mMeeting.mo212067p() == DisplayMode.WINDOW) {
            this.f155556d.mo214509a(languageType, languageType2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            this.f155556d.mo214511b();
        }
    }
}
