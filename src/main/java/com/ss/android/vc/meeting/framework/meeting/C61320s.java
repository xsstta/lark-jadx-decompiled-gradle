package com.ss.android.vc.meeting.framework.meeting;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.entity.C60998v;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.busyring.C61543c;
import com.ss.android.vc.meeting.module.feedback.C61676d;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.C63736af;
import com.ss.android.vc.statistics.event.C63759i;
import com.ss.android.vc.statistics.event.C63761k;
import com.ss.android.vc.statistics.event.ao;
import com.ss.android.vc.statistics.p3182c.C63724a;
import com.ss.android.vc.statistics.p3182c.C63726b;
import com.ss.android.vc.trace.C63784a;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.s */
public class C61320s implements AbstractC61301i {

    /* renamed from: a */
    private C61303k f153640a;

    /* renamed from: c */
    private void m238807c() {
        C60738ac.m236023a((int) R.string.View_G_CallEnded);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.framework.meeting.s$1 */
    public static /* synthetic */ class C613211 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153641a;

        static {
            int[] iArr = new int[VideoChat.UpdateVideoChatAction.values().length];
            f153641a = iArr;
            try {
                iArr[VideoChat.UpdateVideoChatAction.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: b */
    private void m238802b() {
        VideoChat e = this.f153640a.mo212056e();
        if (C63724a.m249907a(e)) {
            C63726b.m249913a("vc_monitor_caller_hangup", e);
        } else {
            C63726b.m249913a("vc_monitor_callee_hangup", e);
        }
    }

    /* renamed from: a */
    private void m238796a() {
        boolean z;
        if (this.f153640a.mo212056e() == null || TextUtils.isEmpty(this.f153640a.mo212056e().getId())) {
            z = false;
        } else {
            z = true;
        }
        C60700b.m235851b("MessagePreAssembler", "[isMeetingIdExist]", "return " + z);
        if (z) {
            m238798a(VideoChat.UpdateVideoChatAction.CANCEL, this.f153640a.mo212056e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m238819g(int i) {
        m238807c();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m238823k(int i) {
        m238796a();
    }

    public C61320s(AbstractC61294b bVar) {
        this.f153640a = (C61303k) bVar;
    }

    /* renamed from: d */
    private void m238813d(VideoChat videoChat) {
        ao.m250026a(videoChat, "hang_up");
    }

    /* renamed from: a */
    private void m238799a(VideoChat videoChat) {
        C60700b.m235851b("MessagePreAssembler", "[handleRingingReceived]", "start ...");
    }

    /* renamed from: c */
    private void m238809c(VideoChat videoChat) {
        ao.m250026a(videoChat, "leave");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m238818f(int i) {
        m238798a(VideoChat.UpdateVideoChatAction.SDK_EXCEPTION, this.f153640a.mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m238820h(int i) {
        if (i == 3 || i == 2) {
            m238807c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m238797a(int i) {
        this.f153640a.mo212056e().setEndReason(VideoChat.EndReason.AUTO_END);
        m238798a(VideoChat.UpdateVideoChatAction.AUTO_END, this.f153640a.mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m238808c(int i) {
        if (this.f153640a.mo212057f() == VideoChat.Type.CALL && i == 2) {
            m238799a(this.f153640a.mo212056e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m238816e(int i) {
        if (this.f153640a.mo212057f() == VideoChat.Type.MEET) {
            m238798a(VideoChat.UpdateVideoChatAction.TRIAL_TIMEOUT, this.f153640a.mo212056e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m238821i(int i) {
        m238798a(VideoChat.UpdateVideoChatAction.END, this.f153640a.mo212056e());
        m238813d(this.f153640a.mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m238824l(int i) {
        if (i == 4) {
            this.f153640a.mo212160e(true);
        }
        m238798a(VideoChat.UpdateVideoChatAction.REFUSE, this.f153640a.mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m238803b(int i) {
        this.f153640a.mo212056e().setEndReason(VideoChat.EndReason.HANGUP);
        m238798a(VideoChat.UpdateVideoChatAction.LEAVE, this.f153640a.mo212056e());
    }

    /* renamed from: c */
    private void m238810c(C61344j jVar) {
        if (jVar.mo212334b() != null && this.f153640a.aq() != null) {
            this.f153640a.aq().mo214936a(jVar.mo212334b().mo212341b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m238812d(int i) {
        C61676d.m240734a(true);
        if (this.f153640a.mo212057f() == VideoChat.Type.CALL) {
            C63761k.m250297a(this.f153640a.mo212056e());
        } else if (this.f153640a.mo212057f() == VideoChat.Type.MEET) {
            ao.m250026a(this.f153640a.mo212056e(), "interrupted");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m238822j(int i) {
        this.f153640a.mo212056e().setEndReason(VideoChat.EndReason.HANGUP);
        m238798a(VideoChat.UpdateVideoChatAction.LEAVE, this.f153640a.mo212056e());
        if (this.f153640a.mo212057f() == VideoChat.Type.CALL) {
            m238804b(this.f153640a.mo212056e());
        } else if (this.f153640a.mo212057f() == VideoChat.Type.MEET) {
            m238809c(this.f153640a.mo212056e());
        }
    }

    /* renamed from: b */
    private void m238804b(VideoChat videoChat) {
        C63761k.m250298a(videoChat, 1, "hang_up");
        if (C63724a.m249907a(videoChat)) {
            C63726b.m249913a("vc_monitor_caller_hangup", videoChat);
        } else {
            C63726b.m249913a("vc_monitor_callee_hangup", videoChat);
        }
    }

    /* renamed from: e */
    private void m238817e(C61344j jVar) {
        String str;
        AbstractC63598b bVar;
        String str2;
        boolean z;
        C63784a.m250430c("[VideoChat_MessagePreAssembler_handleCreateVideoChat]");
        if (this.f153640a.mo212057f() == VideoChat.Type.MEET) {
            String str3 = "";
            boolean z2 = false;
            if (jVar.mo212334b() == null || jVar.mo212334b().mo212338a() == null) {
                str = str3;
                str2 = null;
                bVar = null;
                z = false;
            } else {
                C60998v a = jVar.mo212334b().mo212338a();
                z2 = a.f152845j;
                String str4 = a.f152846k;
                z = a.f152847l;
                AbstractC63598b bVar2 = a.f152853r;
                String str5 = a.f152855t;
                str = a.f152854s;
                bVar = bVar2;
                str3 = str5;
                str2 = str4;
            }
            C63736af.m250001a(str3, !z, str, VcBizService.createVideoChatMeet(this.f153640a.mo212056e(), z2, str2, z, bVar, this.f153640a));
        }
    }

    /* renamed from: b */
    private void m238805b(C61344j jVar) {
        int i = jVar.f153703a;
        VideoChat videoChat = jVar.f153704b;
        if (i == 100) {
            this.f153640a.mo212154b(jVar);
        } else if (i == 116) {
            VcBizSender.m249216a(jVar.f153704b, true);
        } else if (i == 205 || i == 203) {
            VideoChat e = this.f153640a.mo212056e();
            if (e != null) {
                e.setEndReason(VideoChat.EndReason.CONNECTION_FAILED);
                jVar.mo212330a(e);
            } else if (videoChat != null) {
                videoChat.setEndReason(VideoChat.EndReason.CONNECTION_FAILED);
            }
        } else if (i == 210) {
            VideoChat e2 = this.f153640a.mo212056e();
            if (e2 != null) {
                e2.setEndReason(VideoChat.EndReason.SDK_EXCEPTION);
                jVar.mo212330a(e2);
            }
        } else if (i == 215) {
            VideoChat e3 = this.f153640a.mo212056e();
            if (e3 != null) {
                e3.setEndReason(VideoChat.EndReason.HANGUP);
                jVar.mo212330a(e3);
            }
        } else if (i == 110) {
            C61543c.m240214a(this.f153640a, (int) SmEvents.EVENT_NO);
        } else if (i == 216) {
            VideoChat e4 = this.f153640a.mo212056e();
            if (e4 != null) {
                e4.setEndReason(VideoChat.EndReason.TRIAL_TIMEOUT);
                jVar.mo212330a(e4);
            }
        } else if (i == 120) {
            m238810c(jVar);
        }
    }

    /* renamed from: d */
    private void m238814d(C61344j jVar) {
        if (jVar != null) {
            AbstractC61346l r0 = new AbstractC61346l() {
                /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$P11xa9Bt0XMEQLplKWKmz4M2_s */

                @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                public final void eventHandledOnState(int i) {
                    C61320s.this.m238824l(i);
                }
            };
            int i = jVar.f153703a;
            if (i == 103) {
                r0 = new AbstractC61346l() {
                    /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$usXShwgIJ0jdHKZkmr6i4NXp5Rs */

                    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                    public final void eventHandledOnState(int i) {
                        C61320s.this.m238822j(i);
                    }
                };
            } else if (i == 104) {
                r0 = new AbstractC61346l() {
                    /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$YpRThO1o4Nw17YBM9TFjtFQVwpE */

                    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                    public final void eventHandledOnState(int i) {
                        C61320s.this.m238823k(i);
                    }
                };
            } else if (i == 114) {
                r0 = new AbstractC61346l() {
                    /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$zNZLYNc01NlkN5aXDYS_avQROxk */

                    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                    public final void eventHandledOnState(int i) {
                        C61320s.this.m238820h(i);
                    }
                };
            } else if (i != 116) {
                if (!(i == 120 || i == 144)) {
                    if (i != 206) {
                        if (i != 214) {
                            if (i == 210) {
                                r0 = new AbstractC61346l() {
                                    /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$N1MnVzpftprJDaYWWduXjyEjk1o */

                                    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                                    public final void eventHandledOnState(int i) {
                                        C61320s.this.m238818f(i);
                                    }
                                };
                            } else if (i != 211) {
                                switch (i) {
                                    case SmEvents.EVENT_UE /*{ENCODED_INT: 99}*/:
                                        r0 = new AbstractC61346l() {
                                            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$_XNC6__iLYxiAekrpyr5JP4KSm4 */

                                            @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                                            public final void eventHandledOnState(int i) {
                                                C61320s.this.m238821i(i);
                                            }
                                        };
                                        break;
                                    case 100:
                                        r0 = new AbstractC61346l(jVar) {
                                            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$IZKhdvg4VLcelm0kAtTzjjL7Y2s */
                                            public final /* synthetic */ C61344j f$1;

                                            {
                                                this.f$1 = r2;
                                            }

                                            @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                                            public final void eventHandledOnState(int i) {
                                                C61320s.this.m238815d(this.f$1, i);
                                            }
                                        };
                                        break;
                                    case 101:
                                        break;
                                    default:
                                        switch (i) {
                                            case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
                                            case SmEvents.EVENT_NO /*{ENCODED_INT: 110}*/:
                                                break;
                                            case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                                                break;
                                            case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                                                r0 = new AbstractC61346l() {
                                                    /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$aUqLkdorbMR7r_NqwgH2guuEp1I */

                                                    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                                                    public final void eventHandledOnState(int i) {
                                                        C61320s.this.m238808c((C61320s) i);
                                                    }
                                                };
                                                break;
                                            default:
                                                switch (i) {
                                                    case SmEvents.EVENT_MEETING_LICENSE_TIME_OUT /*{ENCODED_INT: 216}*/:
                                                        r0 = new AbstractC61346l() {
                                                            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$vI81FnPDKfYtBo53XFj4hJ14Ai8 */

                                                            @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                                                            public final void eventHandledOnState(int i) {
                                                                C61320s.this.m238816e((C61320s) i);
                                                            }
                                                        };
                                                        break;
                                                    case SmEvents.EVENT_LOCAL_BUSY_FORCE_END_LAST /*{ENCODED_INT: 217}*/:
                                                        if (!this.f153640a.mo212063l()) {
                                                            r0 = new AbstractC61346l() {
                                                                /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$6USIb1ouAgo9j2Aqmcsq9zyA5R4 */

                                                                @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                                                                public final void eventHandledOnState(int i) {
                                                                    C61320s.this.m238803b((C61320s) i);
                                                                }
                                                            };
                                                            break;
                                                        }
                                                        break;
                                                    case SmEvents.EVENT_AUTO_END /*{ENCODED_INT: 218}*/:
                                                        r0 = new AbstractC61346l() {
                                                            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$I08JV1Dl53LrBVw1XtyuV9T5Tg */

                                                            @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                                                            public final void eventHandledOnState(int i) {
                                                                C61320s.this.m238797a((C61320s) i);
                                                            }
                                                        };
                                                        break;
                                                    default:
                                                        r0 = null;
                                                        break;
                                                }
                                        }
                                }
                            } else {
                                r0 = new AbstractC61346l() {
                                    /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$W4rkH10ivRDGd239hMsBmZk_oIU */

                                    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                                    public final void eventHandledOnState(int i) {
                                        C61320s.this.m238812d((C61320s) i);
                                    }
                                };
                            }
                        }
                        r0 = new AbstractC61346l(jVar) {
                            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$SiuKl6bENTz83duzwZU01PjQeg */
                            public final /* synthetic */ C61344j f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                            public final void eventHandledOnState(int i) {
                                C61320s.this.m238806b(this.f$1, i);
                            }
                        };
                    } else {
                        r0 = new AbstractC61346l() {
                            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$48nQ5f6v_t4iJKoHzzM6mqZZyv0 */

                            @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                            public final void eventHandledOnState(int i) {
                                C61320s.this.m238819g(i);
                            }
                        };
                    }
                }
                r0 = new AbstractC61346l(jVar) {
                    /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$0gDApi2U1m8qWv8BejM9ywBmb5E */
                    public final /* synthetic */ C61344j f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                    public final void eventHandledOnState(int i) {
                        C61320s.this.m238811c(this.f$1, i);
                    }
                };
            } else {
                r0 = new AbstractC61346l(jVar) {
                    /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$FwJHuV1bUBmVU_rwAgG2PC9vvns */
                    public final /* synthetic */ C61344j f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                    public final void eventHandledOnState(int i) {
                        C61320s.this.m238800a((C61320s) this.f$1, (C61344j) i);
                    }
                };
            }
            jVar.mo212333a(new AbstractC61346l(jVar.f153703a, jVar.mo212337d()) {
                /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$s$xFLncU7PSFkshn1A5UozpVNvCc */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ AbstractC61346l f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                public final void eventHandledOnState(int i) {
                    C61320s.m238801a(AbstractC61346l.this, this.f$1, this.f$2, i);
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61301i
    /* renamed from: a */
    public void mo212081a(C61344j jVar) {
        if (jVar != null) {
            m238814d(jVar);
            m238805b(jVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m238815d(C61344j jVar, int i) {
        this.f153640a.mo212044a(jVar.f153704b);
        m238817e(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m238800a(C61344j jVar, int i) {
        if (i == 2) {
            this.f153640a.mo212044a(jVar.f153704b);
        } else if (i == 5) {
            m238798a(VideoChat.UpdateVideoChatAction.CANCEL, jVar.f153704b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m238811c(C61344j jVar, int i) {
        this.f153640a.mo212044a(jVar.f153704b);
    }

    /* renamed from: a */
    private void m238798a(VideoChat.UpdateVideoChatAction updateVideoChatAction, VideoChat videoChat) {
        if (videoChat == null) {
            C60700b.m235851b("MessagePreAssembler", "[handleUploadUserAction]", "videoChat is null");
        } else if (videoChat.getId() == null) {
            C60700b.m235851b("MessagePreAssembler", "[handleUploadUserAction2]", "videoChat.getId() is null");
        } else if (videoChat.getId().isEmpty()) {
            C60700b.m235851b("MessagePreAssembler", "[handleUploadUserAction3]", "videoChat.getId() is empty");
        } else {
            if (C613211.f153641a[updateVideoChatAction.ordinal()] == 1 && this.f153640a.mo212057f() == VideoChat.Type.CALL) {
                C63759i.m250292b(videoChat);
            }
            C60700b.m235851b("MessagePreAssembler", "[handleUploadUserAction4]", "updateVideoChatAction =" + updateVideoChatAction.getNumber());
            VcBizService.updateVideoChat(this.f153640a, videoChat.getId(), updateVideoChatAction.getNumber(), null, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m238806b(C61344j jVar, int i) {
        this.f153640a.mo212044a(jVar.f153704b);
        if (i == 4 && this.f153640a.mo212057f() == VideoChat.Type.CALL) {
            m238802b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m238801a(AbstractC61346l lVar, int i, AbstractC61346l lVar2, int i2) {
        if (lVar != null) {
            C60700b.m235851b("MessagePreAssembler", "[eventHandledOnState]", "<defaultCallBack> event=" + i + ", state=" + i2);
            lVar.eventHandledOnState(i2);
        }
        if (lVar2 != null) {
            C60700b.m235851b("MessagePreAssembler", "[eventHandledOnState2]", "<externalCallback> event=" + i + ", state=" + i2);
            lVar2.eventHandledOnState(i2);
        }
    }
}
