package com.ss.android.vc.meeting.module.speakrequest;

import android.content.Context;
import android.content.DialogInterface;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62378o;
import com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl;
import com.ss.android.vc.meeting.module.speakrequest.SpeakRequestTipView;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.statistics.event.ax;
import com.ss.android.vc.statistics.event.bf;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.speakrequest.c */
public class C63114c extends AbstractC61424d implements AbsSpeakRequestControl.ISpeakRequestViewControlListener {

    /* renamed from: c */
    private static DialogC25637f f159026c;

    /* renamed from: a */
    private SpeakRequestTipView f159027a;

    /* renamed from: b */
    private boolean f159028b;

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl.ISpeakRequestViewControlListener
    /* renamed from: a */
    public void mo218470a() {
        DialogC25637f fVar = f159026c;
        if (fVar != null && fVar.isShowing()) {
            f159026c.dismiss();
        }
        f159026c = null;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        SpeakRequestTipView speakRequestTipView = this.f159027a;
        if (speakRequestTipView != null && speakRequestTipView.getVisibility() == 0) {
            this.f159027a.mo218439c();
        }
        this.f159027a = null;
        DialogC25637f fVar = f159026c;
        if (fVar != null && fVar.isShowing()) {
            f159026c.dismiss();
        }
        f159026c = null;
        getMeeting().ao().mo218465b(this);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        getMeeting().ao().mo218459a(this);
        if (getMeeting().ao().mo218467c()) {
            C60700b.m235851b("SpeakRequestViewControl", "[init]", "Restore hand up tip view");
            List<Participant> f = getMeeting().mo212091I().mo212494b().mo212601f();
            if (f == null || f.size() == 0) {
                getMeeting().ao().mo218466b(false);
            } else {
                m247138c(getMeeting().ao().mo218469e());
            }
        }
    }

    public C63114c(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl.ISpeakRequestViewControlListener
    /* renamed from: a */
    public void mo218471a(List<Participant> list) {
        C26171w.m94675a(new Runnable(list) {
            /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$c$NyVtNQmccyexkzRfUlKt2hkEo4 */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C63114c.this.m247138c(this.f$1);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl.ISpeakRequestViewControlListener
    /* renamed from: a */
    public void mo218472a(boolean z) {
        DialogC25637f fVar = f159026c;
        if (fVar != null && fVar.isShowing()) {
            f159026c.dismiss();
        }
        if (z) {
            f159026c = VCDialogUtils.m236178a((Context) getActivity(), (int) R.string.View_M_RaiseHandToSpeak, 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$c$PsEmSfMxovDD1P31MSoVn_NYilk */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C63114c.this.m247139d(dialogInterface, i);
                }
            }, (int) R.string.View_M_RaiseHand, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$c$3V10OWmWgJU00D1mWP9MUK46GI */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C63114c.this.m247137c(dialogInterface, i);
                }
            }, false);
        } else {
            f159026c = VCDialogUtils.m236214b((Context) getActivity(), (int) R.string.View_M_LowerHandQuestion, 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$c$gKF3GACSlu1bgixlf22ZWshdBdw */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C63114c.this.m247135b(dialogInterface, i);
                }
            }, (int) R.string.View_M_LowerHand, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.speakrequest.$$Lambda$c$pekyRxkmbPJLSJODi5DncHQqRpk */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C63114c.this.m247134a(dialogInterface, i);
                }
            }, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m247138c(final List<Participant> list) {
        if (CollectionUtils.isEmpty(list)) {
            SpeakRequestTipView speakRequestTipView = this.f159027a;
            if (speakRequestTipView != null && speakRequestTipView.getVisibility() == 0) {
                this.f159027a.mo218439c();
            }
            getMeeting().ao().mo218466b(false);
        } else if (C60773o.m236120a(C60773o.m236124b(this.mPresent.mo212916a()))) {
            SpeakRequestTipView speakRequestTipView2 = this.f159027a;
            if (speakRequestTipView2 != null && speakRequestTipView2.getVisibility() == 0) {
                this.f159027a.mo218438b();
            }
            SpeakRequestTipView speakRequestTipView3 = new SpeakRequestTipView(this.mPresent.mo212916a());
            this.f159027a = speakRequestTipView3;
            speakRequestTipView3.setSpeakRequestTipListener(new SpeakRequestTipView.AbstractC63110a() {
                /* class com.ss.android.vc.meeting.module.speakrequest.C63114c.C631151 */

                @Override // com.ss.android.vc.meeting.module.speakrequest.SpeakRequestTipView.AbstractC63110a
                /* renamed from: c */
                public void mo218453c() {
                    C63114c.this.getMeeting().ao().mo218466b(false);
                    bf.m250158a(C63114c.this.getMeeting().mo212056e(), "close", (String) null, (String) null);
                    MeetingPopupEvent.m249838a().mo220318a("close", "raise_hand_notification", C63114c.this.getMeeting().mo212056e());
                }

                @Override // com.ss.android.vc.meeting.module.speakrequest.SpeakRequestTipView.AbstractC63110a
                /* renamed from: a */
                public void mo218451a() {
                    C62378o.m243759a(C63114c.this.mPresent.mo212918b(), C63114c.this.mPresent.mo212921f()).mo211606a();
                    C63114c.this.getMeeting().ao().mo218466b(false);
                    bf.m250158a(C63114c.this.getMeeting().mo212056e(), "view_details", (String) null, (String) null);
                    MeetingPopupEvent.m249838a().mo220318a("view_details", "raise_hand_notification", C63114c.this.getMeeting().mo212056e());
                }

                @Override // com.ss.android.vc.meeting.module.speakrequest.SpeakRequestTipView.AbstractC63110a
                /* renamed from: b */
                public void mo218452b() {
                    if (list.size() != 0) {
                        Participant participant = (Participant) list.get(0);
                        if (participant == null) {
                            C60700b.m235851b("SpeakRequestViewControl", "[onUnMute]", "participant is null, un mute faile.");
                            return;
                        }
                        C63114c.this.getMeeting().ao().mo218462a(true, participant);
                        bf.m250158a(C63114c.this.getMeeting().mo212056e(), "unmute", participant.getId(), participant.getDeviceId());
                        MeetingPopupEvent.m249838a().mo220318a("unmute", "raise_hand_notification", C63114c.this.getMeeting().mo212056e());
                    }
                }
            });
            this.f159027a.setByteviewUserClickListener(new C63497j.AbstractC63498a() {
                /* class com.ss.android.vc.meeting.module.speakrequest.C63114c.C631162 */

                @Override // com.ss.android.vc.meeting.utils.C63497j.AbstractC63498a
                /* renamed from: a */
                public void mo214951a(ByteviewUser byteviewUser) {
                    if (byteviewUser != null && C63497j.m248860d(C63114c.this.getMeeting(), byteviewUser)) {
                        ax.m250128a(C63114c.this.getMeeting().mo212056e(), byteviewUser.getUserId(), byteviewUser.getDeviceId());
                        C63497j.m248853a(C63114c.this.getActivity(), C63114c.this.getMeeting(), byteviewUser);
                    }
                    MeetingPopupEvent.m249838a().mo220318a("user_profile", "raise_hand_notification", C63114c.this.getMeeting().mo212056e());
                }
            });
            this.f159027a.mo218436a(this.mPresent.mo212921f().mo212055d(), list);
            this.f159027a.mo218435a(this.mPresent.mo212920e(), this.f159028b);
            bf.m250158a(getMeeting().mo212056e(), Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, (String) null, (String) null);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        this.f159028b = z;
        SpeakRequestTipView speakRequestTipView = this.f159027a;
        if (speakRequestTipView != null) {
            speakRequestTipView.mo218437a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m247139d(DialogInterface dialogInterface, int i) {
        bf.m250156a(getMeeting().mo212056e(), "cancel");
        f159026c = null;
        MeetingPopupEvent.m249838a().mo220324b("cancel", "none", getMeeting());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247134a(DialogInterface dialogInterface, int i) {
        getMeeting().ao().mo218456a(ParticipantSettings.HandsStatus.PUT_DOWN);
        bf.m250162b(getMeeting().mo212056e(), "lower_hand");
        f159026c = null;
        MeetingPopupEvent.m249838a().mo220318a("confirm", "self_lower_hand", getMeeting().mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m247135b(DialogInterface dialogInterface, int i) {
        bf.m250162b(getMeeting().mo212056e(), "keep_raising");
        f159026c = null;
        MeetingPopupEvent.m249838a().mo220318a("cancel", "self_lower_hand", getMeeting().mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m247137c(DialogInterface dialogInterface, int i) {
        String str;
        getMeeting().ao().mo218456a(ParticipantSettings.HandsStatus.PUT_UP);
        AbsBreakoutRoomControl al = getMeeting().al();
        VideoChat e = getMeeting().mo212056e();
        if (al.mo213183j()) {
            str = "mainroom";
        } else {
            str = "inrooms";
        }
        bf.m250157a(e, "raise_hand", str, al.mo213181h() ? 1 : 0);
        MeetingPopupEvent.m249838a().mo220324b("raise_hand", "none", getMeeting());
        f159026c = null;
    }
}
