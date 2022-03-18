package com.ss.android.vc.meeting.module.speakrequest;

import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.C60938g;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.request.ManageApprovalRequest;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.C63634c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.speakrequest.b */
public class C63112b extends AbsSpeakRequestControl {

    /* renamed from: a */
    private List<AbsSpeakRequestControl.ISpeakRequestControlListener> f159018a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private ParticipantSettings.HandsStatus f159019b;

    /* renamed from: c */
    private ConcurrentHashMap<String, Participant> f159020c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private List<AbsSpeakRequestControl.ISpeakRequestViewControlListener> f159021d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private boolean f159022e = false;

    /* renamed from: f */
    private boolean f159023f;

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: a */
    public ParticipantSettings.HandsStatus mo218455a() {
        return this.f159019b;
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: c */
    public boolean mo218467c() {
        return this.f159022e;
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: d */
    public boolean mo218468d() {
        return C63634c.m249496b("byteview.meeting.android.forced_mute");
    }

    /* renamed from: f */
    private ParticipantSettings.EquipmentStatus m247114f() {
        if (!C60788y.m236247a(ar.m236694a())) {
            return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        return ParticipantSettings.EquipmentStatus.NORMAL;
    }

    /* renamed from: g */
    private ParticipantSettings.EquipmentStatus m247115g() {
        if (!C60788y.m236250b(ar.m236694a())) {
            return ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        return ParticipantSettings.EquipmentStatus.NORMAL;
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: e */
    public List<Participant> mo218469e() {
        return new LinkedList(this.f159020c.values());
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: b */
    public void mo218463b() {
        if (!CollectionUtils.isEmpty(this.f159021d)) {
            Iterator<AbsSpeakRequestControl.ISpeakRequestViewControlListener> it = this.f159021d.iterator();
            if (it.hasNext()) {
                it.next().mo218470a();
            }
        }
    }

    /* renamed from: b */
    public void mo218473b(ParticipantSettings.HandsStatus handsStatus) {
        this.f159019b = handsStatus;
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: a */
    public void mo218459a(AbsSpeakRequestControl.ISpeakRequestViewControlListener bVar) {
        if (bVar != null) {
            this.f159021d.add(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: b */
    public void mo218465b(AbsSpeakRequestControl.ISpeakRequestViewControlListener bVar) {
        if (bVar != null) {
            this.f159021d.remove(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: a */
    public void mo218458a(AbsSpeakRequestControl.ISpeakRequestControlListener aVar) {
        if (!this.f159018a.contains(aVar)) {
            this.f159018a.add(aVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: b */
    public void mo218464b(AbsSpeakRequestControl.ISpeakRequestControlListener aVar) {
        if (this.f159018a.contains(aVar)) {
            this.f159018a.remove(aVar);
        }
    }

    public C63112b(C61303k kVar) {
        super(kVar);
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: a */
    public void mo218460a(List<Participant> list) {
        if (!CollectionUtils.isEmpty(this.f159021d)) {
            for (AbsSpeakRequestControl.ISpeakRequestViewControlListener bVar : this.f159021d) {
                bVar.mo218471a(list);
            }
        }
    }

    /* renamed from: c */
    public void mo218474c(boolean z) {
        for (AbsSpeakRequestControl.ISpeakRequestControlListener aVar : this.f159018a) {
            aVar.mo214289a(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: b */
    public void mo218466b(boolean z) {
        this.f159022e = z;
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: a */
    public void mo218456a(ParticipantSettings.HandsStatus handsStatus) {
        C60700b.m235851b("SpeakRequestControl", "[sendSpeakRequest]", "HandsStatus= " + handsStatus);
        ParticipantSettings participantSettings = this.mMeeting.mo212091I().mo212494b().mo212605j().getParticipantSettings();
        if (participantSettings != null) {
            participantSettings.setHandsStatus(handsStatus);
            VcBizService.changeOwnSetting(getMeeting().mo212055d(), participantSettings, m247114f(), m247115g(), C60788y.m236247a(ar.m236694a()), C60788y.m236250b(ar.m236694a()), this.mMeeting.mo212091I().mo212494b().mo212605j().getBreakoutRoomId());
            mo218473b(handsStatus);
        }
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: a */
    public void mo218457a(VideoChatSettings videoChatSettings) {
        C60700b.m235851b("SpeakRequestControl", "[dealAllowPritiUnMute", "allowPartiUnMute= " + videoChatSettings.getAllowPartiUnMute());
        if (videoChatSettings.getAllowPartiUnMute()) {
            if (mo218455a() == ParticipantSettings.HandsStatus.PUT_UP && !isHostOrCoHost()) {
                if (isNormalMode()) {
                    C60738ac.m236023a((int) R.string.View_M_YouCanNowUnmuteYourself);
                }
                VcBizService.triggerPushSelfInfo();
            }
            mo218463b();
        }
        if (isHostOrCoHost()) {
            mo218474c(videoChatSettings.getAllowPartiUnMute());
        }
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: a */
    public void mo218461a(boolean z) {
        C60700b.m235851b("SpeakRequestControl", "[showSpeakRequestDialog]", "shouldHandsUp= " + z + " isHost= " + isHost() + " isCoHost= " + isCoHost());
        if (!isHostOrCoHost() && DataAdapterUtil.f154006a.mo212853b(getMeeting()) && !CollectionUtils.isEmpty(this.f159021d)) {
            Iterator<AbsSpeakRequestControl.ISpeakRequestViewControlListener> it = this.f159021d.iterator();
            if (it.hasNext()) {
                it.next().mo218472a(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public synchronized void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        boolean z;
        boolean z2;
        if (this.mMeeting.mo212091I() != null) {
            if (this.mMeeting.mo212091I().mo212494b() != null) {
                if (isHostOrCoHost()) {
                    List<Participant> f = getMeeting().mo212091I().mo212494b().mo212601f();
                    HashSet hashSet = new HashSet();
                    boolean z3 = false;
                    boolean z4 = false;
                    for (Participant participant : f) {
                        if (participant.getParticipantSettings().getHandsStatus() == ParticipantSettings.HandsStatus.PUT_UP) {
                            if (!this.f159020c.containsKey(C60938g.m237060a(participant))) {
                                this.f159020c.put(C60938g.m237060a(participant), participant);
                                z3 = true;
                            }
                        } else if (this.f159020c.containsKey(C60938g.m237060a(participant))) {
                            this.f159020c.remove(C60938g.m237060a(participant));
                            z4 = true;
                        }
                        hashSet.add(C60938g.m237060a(participant));
                    }
                    Iterator<Map.Entry<String, Participant>> it = this.f159020c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!hashSet.contains(it.next().getKey())) {
                            it.remove();
                            z4 = true;
                        }
                    }
                    if (!z3 && (!(z2 = this.f159022e) || !z4)) {
                        if (this.f159023f) {
                            if (!z2 && z4 && this.f159020c.size() == 0) {
                                this.mMeeting.mo212114a((Boolean) null, (Boolean) false);
                            }
                            mo218463b();
                        }
                    }
                    if (this.f159020c.size() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mo218466b(z);
                    LinkedList linkedList = new LinkedList(this.f159020c.values());
                    if (!CollectionUtils.isEmpty(this.f159021d)) {
                        for (AbsSpeakRequestControl.ISpeakRequestViewControlListener bVar : this.f159021d) {
                            bVar.mo218471a(linkedList);
                        }
                    }
                    if (this.f159020c.size() > 0) {
                        this.mMeeting.mo212114a((Boolean) null, (Boolean) true);
                    } else {
                        this.mMeeting.mo212114a((Boolean) null, (Boolean) false);
                    }
                    mo218463b();
                } else {
                    if (this.mMeeting.mo212091I().mo212494b().mo212605j() != null) {
                        if (this.mMeeting.mo212091I().mo212494b().mo212605j().getParticipantSettings() != null) {
                            ParticipantSettings.HandsStatus handsStatus = this.mMeeting.mo212091I().mo212494b().mo212605j().getParticipantSettings().getHandsStatus();
                            if (handsStatus == ParticipantSettings.HandsStatus.APPROVED && mo218455a() == ParticipantSettings.HandsStatus.PUT_UP) {
                                C60738ac.m236023a((int) R.string.View_M_HostUnmutedYou);
                            } else if (handsStatus == ParticipantSettings.HandsStatus.REJECT && mo218455a() == ParticipantSettings.HandsStatus.PUT_UP) {
                                C60738ac.m236023a((int) R.string.View_M_HostDeclinedRequestToSpeak);
                            }
                            mo218473b(handsStatus);
                            if (this.f159023f) {
                                mo218460a((List<Participant>) null);
                                this.mMeeting.mo212114a((Boolean) null, (Boolean) false);
                            }
                        }
                    }
                    C60700b.m235864f("SpeakRequestControl", "[onInMeetingInfoUpdate]", "SelfParticipant or ParticipantSettings is null");
                    return;
                }
                this.f159023f = isHostOrCoHost();
                return;
            }
        }
        C60700b.m235864f("SpeakRequestControl", "[onInMeetingInfoUpdate]", "MeetingData or ParticipantData is null");
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl
    /* renamed from: a */
    public void mo218462a(boolean z, Participant participant) {
        final ManageApprovalRequest.ApprovalAction approvalAction;
        if (z) {
            approvalAction = ManageApprovalRequest.ApprovalAction.PASS;
        } else {
            approvalAction = ManageApprovalRequest.ApprovalAction.REJECT;
        }
        C60700b.m235851b("SpeakRequestControl", "[hostManageApprovalRequest]", "approvalAction= " + approvalAction);
        VcBizService.manageApproval(this.mMeeting.mo212055d(), ManageApprovalRequest.ApprovalType.PUT_UP_HANDS, approvalAction, Collections.singletonList(new ByteviewUser(participant.getId(), participant.getDeviceId(), participant.getParticipantType())), new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.speakrequest.C63112b.C631131 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("SpeakRequestControl", "[hostManageApprovalRequest2]", "host manage approval with TYPE: PUT_UP_HANDS, ACTION: " + approvalAction + " success. resp= " + str);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SpeakRequestControl", "[hostManageApprovalRequest3]", "host manage approval with TYPE: PUT_UP_HANDS, ACTION: " + approvalAction + " failed. error= " + eVar.mo219902b());
            }
        });
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5 && !CollectionUtils.isEmpty(this.f159021d)) {
            this.f159021d.clear();
        }
    }
}
