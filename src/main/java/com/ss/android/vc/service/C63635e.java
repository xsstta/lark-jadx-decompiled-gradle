package com.ss.android.vc.service;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.widget.DialogC60856d;
import com.ss.android.vc.common.widget.globaldialog.C60862a;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.C60939i;
import com.ss.android.vc.entity.InMeetingChangedInfo;
import com.ss.android.vc.entity.InMeetingUpdateMessage;
import com.ss.android.vc.entity.ParticipantChange;
import com.ss.android.vc.entity.VCNotice;
import com.ss.android.vc.entity.VcAlert;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCombinedInfo;
import com.ss.android.vc.entity.VideoChatExtraInfo;
import com.ss.android.vc.entity.VideoChatNoticeUpdate;
import com.ss.android.vc.entity.VideoChatPrompt;
import com.ss.android.vc.entity.background.C60936b;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.p3106a.C61270a;
import com.ss.android.vc.meeting.framework.manager.p3106a.C61271b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.lobby.pb.C62148a;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageNotify;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.prompt.VCPromptManager;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.C63603f;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.C63761k;
import com.ss.android.vc.statistics.event.C63777y;
import com.ss.android.vc.statistics.event.ao;
import com.ss.android.vc.statistics.monitor.C63780b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.service.e */
public class C63635e {

    /* renamed from: a */
    final VideoChatPush.AbstractC63579s f160623a;

    /* renamed from: b */
    final VideoChatPush.AbstractC63569i f160624b;

    /* renamed from: c */
    final VideoChatPush.AbstractC63567g f160625c;

    /* renamed from: d */
    final VideoChatPush.AbstractC63565e f160626d;

    /* renamed from: e */
    final VideoChatPush.AbstractC63582v f160627e;

    /* renamed from: f */
    final VideoChatPush.AbstractC63580t f160628f;

    /* renamed from: g */
    final VideoChatPush.AbstractC63583w f160629g;

    /* renamed from: h */
    final VideoChatPush.AbstractC63566f f160630h;

    /* renamed from: i */
    final VideoChatPush.AbstractC63581u f160631i;

    /* renamed from: j */
    final VideoChatPush.AbstractC63570j f160632j;

    /* renamed from: k */
    final VideoChatPush.AbstractC63575o f160633k;

    /* renamed from: l */
    final VideoChatPush.AbstractC63576p f160634l;

    /* renamed from: m */
    final VideoChatPush.AbstractC63562b f160635m;

    /* renamed from: n */
    final VideoChatPush.AbstractC63578r f160636n;

    /* renamed from: o */
    private AtomicBoolean f160637o;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.service.e$a */
    public static class C63645a {

        /* renamed from: a */
        public static final C63635e f160663a = new C63635e();
    }

    /* renamed from: a */
    public static final C63635e m249513a() {
        return C63645a.f160663a;
    }

    /* renamed from: a */
    public void mo220149a(String str, int i) {
        VideoChat videoChat;
        C60700b.m235851b("VideoConferencePushService", "[onPushResetHeartbeat]", "onPushResetHeartbeat");
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(str);
        if (kVar == null) {
            videoChat = null;
        } else {
            videoChat = kVar.mo212056e();
        }
        VideoChatService.m249602d().checkAndInit();
        C60700b.m235851b("VideoConferencePushService", "[onPushResetHeartbeat2]", "VideoConferenceService inited");
        if (i == 0) {
            C60700b.m235841a(videoChat, "Rust", "Rust", "onPushHeartbeat EVENT_HBRESET", "VideoConferencePushService", ": [onPushResetHeartbeat] EVENT_HBRESET");
            VideoChatManager.m249444a().mo220109a(C61344j.m239002a().mo212329a(SmEvents.EVENT_HBRESET).mo212330a(videoChat));
            m249515a(kVar);
        } else if (i == 1) {
            C60700b.m235841a(videoChat, "Rust", "Rust", "onPushHeartbeat EVENT_HB_NOTICE_DISCONNECT", "VideoConferencePushService", ": [onPushResetHeartbeat] EVENT_HB_NOTICE_DISCONNECT");
            VideoChatManager.m249444a().mo220109a(C61344j.m239002a().mo212329a(SmEvents.EVENT_HB_NOTICE_DISCONNECT).mo212330a(videoChat));
            m249515a(kVar);
        } else if (i == 2) {
            C60700b.m235841a(videoChat, "Rust", "Rust", "onPushHeartbeat EVENT_HEARTBEAT_INVALID", "VideoConferencePushService", ": [onPushResetHeartbeat] EVENT_HEARTBEAT_INVALID");
            VideoChatManager.m249444a().mo220109a(C61344j.m239002a().mo212329a(SmEvents.EVENT_HEARTBEAT_INVALID).mo212330a(videoChat));
            m249515a(kVar);
        }
    }

    /* renamed from: a */
    public void mo220147a(VideoChatExtraInfo videoChatExtraInfo) {
        if (videoChatExtraInfo != null) {
            C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(C61271b.m238392a(videoChatExtraInfo));
            if (kVar != null) {
                kVar.mo212056e();
            }
            VideoChatManager.m249444a().mo220101a(ar.m236694a(), videoChatExtraInfo);
        }
    }

    /* renamed from: a */
    public void mo220146a(VideoChatCombinedInfo videoChatCombinedInfo) {
        if (videoChatCombinedInfo != null) {
            C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(C61270a.m238391a(videoChatCombinedInfo));
            if (kVar != null) {
                kVar.mo212056e();
            }
            VideoChatManager.m249444a().mo220106a(videoChatCombinedInfo);
        }
    }

    /* renamed from: a */
    public void mo220150a(ArrayList<InteractionMessage> arrayList) {
        if (!CollectionUtils.isEmpty(arrayList)) {
            VideoChatManager.m249444a().mo220114a(arrayList);
        }
    }

    /* renamed from: a */
    public void mo220148a(VideoChatNoticeUpdate videoChatNoticeUpdate) {
        if (videoChatNoticeUpdate != null && !TextUtils.isEmpty(videoChatNoticeUpdate.meetingId)) {
            C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(videoChatNoticeUpdate.meetingId);
            if (kVar == null || videoChatNoticeUpdate.type != 2 || !TextUtils.equals(videoChatNoticeUpdate.key, "View_M_RecordingConsentTitle")) {
                C63603f.m249426a(videoChatNoticeUpdate);
            } else {
                C60735ab.m236001a(new Runnable() {
                    /* class com.ss.android.vc.service.$$Lambda$e$2KDOleIh3YRjMi8GnRm_wFIg0 */

                    public final void run() {
                        C63635e.m271504lambda$2KDOleIh3YRjMi8GnRm_wFIg0(C61303k.this);
                    }
                });
            }
        }
    }

    private C63635e() {
        this.f160637o = new AtomicBoolean(false);
        this.f160623a = new VideoChatPush.AbstractC63579s() {
            /* class com.ss.android.vc.service.C63635e.C636361 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63579s
            /* renamed from: a */
            public void mo219793a(VideoChatCombinedInfo videoChatCombinedInfo) {
                C63635e.this.mo220146a(videoChatCombinedInfo);
            }
        };
        this.f160624b = new VideoChatPush.AbstractC63569i() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass12 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63569i
            /* renamed from: a */
            public void mo219785a(ParticipantChange participantChange) {
                C63635e.this.mo220143a(participantChange);
            }
        };
        this.f160625c = new VideoChatPush.AbstractC63567g() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass14 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63567g
            /* renamed from: a */
            public void mo219784a(InMeetingUpdateMessage inMeetingUpdateMessage) {
                C63635e.this.mo220142a(inMeetingUpdateMessage);
            }
        };
        this.f160626d = new VideoChatPush.AbstractC63565e() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass15 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63565e
            /* renamed from: a */
            public void mo219782a(InMeetingChangedInfo inMeetingChangedInfo) {
                C63635e.this.mo220141a(inMeetingChangedInfo);
            }
        };
        this.f160627e = new VideoChatPush.AbstractC63582v() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass16 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63582v
            /* renamed from: a */
            public void mo219796a(VCNotice vCNotice) {
                C63635e.this.mo220144a(vCNotice);
            }

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63582v
            /* renamed from: a */
            public void mo219797a(VideoChatNoticeUpdate videoChatNoticeUpdate) {
                C63635e.this.mo220148a(videoChatNoticeUpdate);
            }
        };
        this.f160628f = new VideoChatPush.AbstractC63580t() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass17 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63580t
            /* renamed from: a */
            public void mo219794a(VideoChatExtraInfo videoChatExtraInfo) {
                C63635e.this.mo220147a(videoChatExtraInfo);
            }
        };
        this.f160629g = new VideoChatPush.AbstractC63583w() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass18 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63583w
            /* renamed from: a */
            public void mo219798a(VideoChatPrompt videoChatPrompt) {
                VCPromptManager.m245671a().receivePrompt(videoChatPrompt);
            }
        };
        this.f160630h = new VideoChatPush.AbstractC63566f() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass19 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63566f
            /* renamed from: a */
            public void mo219783a(ArrayList<InteractionMessage> arrayList) {
                C63635e.this.mo220150a(arrayList);
            }
        };
        this.f160631i = new VideoChatPush.AbstractC63581u() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass20 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63581u
            /* renamed from: a */
            public void mo219795a(VideoChat videoChat) {
                C63635e.this.mo220145a(videoChat);
            }
        };
        this.f160632j = new VideoChatPush.AbstractC63570j() {
            /* class com.ss.android.vc.service.C63635e.C636372 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63570j
            /* renamed from: a */
            public void mo219786a(String str, int i) {
                C63635e.this.mo220149a(str, i);
            }
        };
        this.f160633k = new VideoChatPush.AbstractC63575o() {
            /* class com.ss.android.vc.service.C63635e.C636383 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63575o
            /* renamed from: a */
            public void mo219790a(VCManageNotify vCManageNotify) {
                VideoChatManager.m249444a().mo220110a(vCManageNotify);
            }
        };
        this.f160634l = new VideoChatPush.AbstractC63576p() {
            /* class com.ss.android.vc.service.C63635e.C636394 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63576p
            /* renamed from: a */
            public void mo219791a(VCManageResult vCManageResult) {
                VideoChatManager.m249444a().mo220111a(vCManageResult);
            }
        };
        this.f160635m = new VideoChatPush.AbstractC63562b() {
            /* class com.ss.android.vc.service.C63635e.C636405 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63562b
            /* renamed from: a */
            public void mo219781a(C62148a aVar) {
                VideoChatManager.m249444a().mo220112a(aVar);
            }
        };
        this.f160636n = new VideoChatPush.AbstractC63578r() {
            /* class com.ss.android.vc.service.C63635e.C636416 */

            @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63578r
            /* renamed from: a */
            public void mo219792a(C60936b bVar) {
                VideoChatManager.m249444a().mo220107a(bVar);
            }
        };
    }

    /* renamed from: c */
    public void mo220152c() {
        VideoChatPush.m249004a().mo219749b(this.f160631i);
        VideoChatPush.m249004a().mo219741b(this.f160632j);
        VideoChatPush.m249004a().mo219748b(this.f160628f);
        VideoChatPush.m249004a().mo219747b(this.f160623a);
        VideoChatPush.m249004a().mo219740b(this.f160624b);
        VideoChatPush.m249004a().mo219738b(this.f160625c);
        VideoChatPush.m249004a().mo219736b(this.f160626d);
        VideoChatPush.m249004a().mo219750b(this.f160627e);
        VideoChatPush.m249004a().mo219751b(this.f160629g);
        VideoChatPush.m249004a().mo219737b(this.f160630h);
        VideoChatPush.m249004a().mo219743b(this.f160633k);
        VideoChatPush.m249004a().mo219744b(this.f160634l);
        VideoChatPush.m249004a().mo219734b(this.f160635m);
        VideoChatPush.m249004a().mo219746b(this.f160636n);
    }

    /* renamed from: b */
    public void mo220151b() {
        if (this.f160637o.compareAndSet(false, true)) {
            VideoChatPush.m249004a().mo219726a(this.f160631i);
            VideoChatPush.m249004a().mo219718a(this.f160632j);
            VideoChatPush.m249004a().mo219725a(this.f160628f);
            VideoChatPush.m249004a().mo219724a(this.f160623a);
            VideoChatPush.m249004a().mo219717a(this.f160624b);
            VideoChatPush.m249004a().mo219715a(this.f160625c);
            VideoChatPush.m249004a().mo219713a(this.f160626d);
            VideoChatPush.m249004a().mo219727a(this.f160627e);
            VideoChatPush.m249004a().mo219728a(this.f160629g);
            VideoChatPush.m249004a().mo219714a(this.f160630h);
            VideoChatPush.m249004a().mo219720a(this.f160633k);
            VideoChatPush.m249004a().mo219721a(this.f160634l);
            VideoChatPush.m249004a().mo219711a(this.f160635m);
            VideoChatPush.m249004a().mo219723a(this.f160636n);
        }
    }

    /* renamed from: a */
    public void mo220141a(InMeetingChangedInfo inMeetingChangedInfo) {
        VideoChatManager.m249444a().mo220102a(inMeetingChangedInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249519b(C61303k kVar) {
        kVar.mo212109a((VCNotice) null);
        Activity c = VCAppLifeCycle.m236256c();
        if (c != null && (c instanceof MeetingActivity)) {
            ((MeetingActivity) c).mo212793t();
        }
    }

    /* renamed from: b */
    private C60862a m249517b(VCNotice vCNotice) {
        final C60862a a = C60862a.m236567a();
        VcBizSender.m249235b(vCNotice.title_i18n_key.key, vCNotice.title_i18n_key.params).mo219889a(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass10 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                a.mo208685a(str);
            }
        });
        VcBizSender.m249235b(vCNotice.msg_i18n_key.key, vCNotice.msg_i18n_key.params).mo219889a(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass11 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                a.mo208687b(str);
            }
        });
        return a;
    }

    /* renamed from: a */
    private void m249515a(C61303k kVar) {
        if (kVar != null && kVar.mo212056e() != null) {
            if (kVar.mo212056e().getType() == VideoChat.Type.CALL) {
                C63761k.m250298a(kVar.mo212056e(), 2, "heartbeat_fail");
            } else {
                ao.m250026a(kVar.mo212056e(), "heartbeat_fail");
            }
            C63780b.m250409a("timeout", kVar.mo212056e());
        }
    }

    /* renamed from: b */
    private boolean m249520b(VideoChat videoChat) {
        boolean z;
        boolean z2;
        boolean z3;
        VideoChat.Type type = videoChat.getType();
        String sdkType = videoChat.getSdkType();
        if (type == VideoChat.Type.CALL) {
            z = true;
        } else {
            z = false;
        }
        if (type != VideoChat.Type.MEET || TextUtils.isEmpty(sdkType) || !sdkType.equalsIgnoreCase("zoom")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (type != VideoChat.Type.MEET || TextUtils.isEmpty(sdkType) || (!sdkType.equalsIgnoreCase("byteRTC") && !sdkType.equalsIgnoreCase("larkRTC") && !sdkType.equalsIgnoreCase("larkpreRTC"))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z || z2 || z3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo220142a(InMeetingUpdateMessage inMeetingUpdateMessage) {
        VideoChatManager.m249444a().mo220103a(inMeetingUpdateMessage);
    }

    /* renamed from: a */
    public void mo220143a(ParticipantChange participantChange) {
        VideoChatManager.m249444a().mo220104a(participantChange);
    }

    /* renamed from: a */
    public void mo220144a(final VCNotice vCNotice) {
        VideoChat videoChat;
        if (vCNotice != null) {
            C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(vCNotice.meetingId);
            if (kVar == null) {
                videoChat = null;
            } else {
                videoChat = kVar.mo212056e();
            }
            C60700b.m235841a(videoChat, "Rust", "UI", "onPushVideoChatNotice " + vCNotice.type, "VideoConferencePushService", "onPushVideoChatNotice " + vCNotice.type);
            Context a = ar.m236694a();
            if (vCNotice.type == 1 && vCNotice.msg_i18n_key != null) {
                DialogC60856d.m236548a();
                if (vCNotice.toastDuration < 0) {
                    C60700b.m235861e("VideoConferencePushService", "[onPushVideoChatNotice]", "toast duration < 0");
                } else {
                    VcBizSender.m249235b(vCNotice.msg_i18n_key.key, vCNotice.msg_i18n_key.params).mo219893b(new AbstractC63598b<String>() {
                        /* class com.ss.android.vc.service.C63635e.C636427 */

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                        }

                        /* renamed from: a */
                        public void onSuccess(String str) {
                            C60738ac.m236029a(str);
                        }
                    });
                }
            } else if (vCNotice.type == 2) {
                if (vCNotice.popupType == 1) {
                    final Activity c = VCAppLifeCycle.m236256c();
                    if (c != null) {
                        if (c.getClass().getSimpleName().equalsIgnoreCase("MainActivity") || c.getClass().getSimpleName().equalsIgnoreCase("ChatWindowActivity") || (c instanceof ByteRTCMeetingActivity)) {
                            DialogC60856d.m236548a();
                            if (vCNotice.msg_i18n_key == null || vCNotice.title_i18n_key == null) {
                                C60700b.m235861e("VideoConferencePushService", "[onPushVideoChatNotice]", ": [VCNotice i18n is null]");
                            } else {
                                m249517b(vCNotice).mo208684a(new C60862a.AbstractC60863a() {
                                    /* class com.ss.android.vc.service.C63635e.C636438 */

                                    @Override // com.ss.android.vc.common.widget.globaldialog.C60862a.AbstractC60863a
                                    /* renamed from: b */
                                    public void mo208694b() {
                                        C63635e.this.mo220140a(0, vCNotice.noticeId);
                                    }

                                    @Override // com.ss.android.vc.common.widget.globaldialog.C60862a.AbstractC60863a
                                    /* renamed from: a */
                                    public void mo208693a() {
                                        Activity activity = c;
                                        DialogC60856d.m236549a(activity, activity.getResources().getString(R.string.View_M_Joining));
                                        C63635e.this.mo220140a(1, vCNotice.noticeId);
                                        C63777y.m250402a(false);
                                    }
                                }).mo208686a(a);
                            }
                        }
                    }
                } else if (vCNotice.popupType == 4) {
                    C60735ab.m236001a(new Runnable(kVar) {
                        /* class com.ss.android.vc.service.$$Lambda$e$EzptaRc5I_6DD1zVEwklOTd6Tlw */
                        public final /* synthetic */ C61303k f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C63635e.lambda$EzptaRc5I_6DD1zVEwklOTd6Tlw(VCNotice.this, this.f$1);
                        }
                    });
                } else if (vCNotice.popupType == 5) {
                    C60735ab.m236001a(new Runnable(kVar) {
                        /* class com.ss.android.vc.service.$$Lambda$e$DmKBSlgM3LqfP1KvggS1tkzlPio */
                        public final /* synthetic */ C61303k f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C63635e.lambda$DmKBSlgM3LqfP1KvggS1tkzlPio(VCNotice.this, this.f$1);
                        }
                    });
                } else if (vCNotice.popupType == 6) {
                    C60735ab.m236001a(new Runnable(kVar) {
                        /* class com.ss.android.vc.service.$$Lambda$e$nuBxQYAUNSIDH4gUo5NWXapihw */
                        public final /* synthetic */ C61303k f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C63635e.m271506lambda$nuBxQYAUNSIDH4gUo5NWXapihw(VCNotice.this, this.f$1);
                        }
                    });
                } else if (vCNotice.popupType == 7) {
                    String str = vCNotice.meetingId;
                    vCNotice.meetingEndReceiveTime = System.currentTimeMillis() / 1000;
                    if (TextUtils.isEmpty(str) || kVar == null) {
                        C60700b.m235864f("VideoConferencePushService", "[onPushVideoChatNotice7]", "notice belongs to no meeting.");
                    } else if (kVar.mo212057f() == VideoChat.Type.MEET) {
                        C60735ab.m236001a(new Runnable(vCNotice) {
                            /* class com.ss.android.vc.service.$$Lambda$e$OfXdhFpa1TXQuwtzEMwj3PmTJUc */
                            public final /* synthetic */ VCNotice f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C63635e.lambda$OfXdhFpa1TXQuwtzEMwj3PmTJUc(C61303k.this, this.f$1);
                            }
                        });
                    }
                }
            } else if (vCNotice.type == 5) {
                C60700b.m235851b("VideoConferencePushService", "[onPushVideoChatNotice6]", "receive tip:" + vCNotice);
                final VcMsgInfo vcMsgInfo = new VcMsgInfo();
                vcMsgInfo.is_show = true;
                vcMsgInfo.type = VcMsgInfo.Type.TIPS;
                vcMsgInfo.msg_i18n_key = vCNotice.msg_i18n_key;
                vcMsgInfo.timeout = vCNotice.timeOut;
                vcMsgInfo.cmd = vCNotice.cmd;
                vcMsgInfo.extra = vCNotice.extra;
                vcMsgInfo.message = vCNotice.message;
                vcMsgInfo.meetingId = vCNotice.meetingId;
                VcBizSender.m249235b(vcMsgInfo.msg_i18n_key.newKey, vcMsgInfo.msg_i18n_key.params).mo219889a(new AbstractC63598b<String>() {
                    /* class com.ss.android.vc.service.C63635e.C636449 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        C60700b.m235864f("VideoConferencePushService", "[onPushVideoChatNotice8]", "getViewI18nTemplate error");
                        vcMsgInfo.isUiShown = false;
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        C60700b.m235851b("VideoConferencePushService", "[onPushVideoChatNotice7]", "getViewI18nTemplate onSuccess");
                        if (!TextUtils.isEmpty(str)) {
                            vcMsgInfo.message = str;
                            C63603f.m249424a(vcMsgInfo);
                        }
                    }
                });
            } else if (vCNotice.type == 6) {
                VcMsgInfo vcMsgInfo2 = new VcMsgInfo();
                vcMsgInfo2.is_show = true;
                vcMsgInfo2.type = VcMsgInfo.Type.BROADCAST;
                vcMsgInfo2.msg_i18n_key = vCNotice.msg_i18n_key;
                vcMsgInfo2.message = vCNotice.message;
                vcMsgInfo2.meetingId = vCNotice.meetingId;
                if (!TextUtils.isEmpty(vCNotice.message)) {
                    C60735ab.m236001a(new Runnable(kVar) {
                        /* class com.ss.android.vc.service.$$Lambda$e$3RXQb8hCjsE4LJxb5X3mMyvd3Q */
                        public final /* synthetic */ C61303k f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C63635e.m271505lambda$3RXQb8hCjsE4LJxb5X3mMyvd3Q(VCNotice.this, this.f$1);
                        }
                    });
                }
            } else if (vCNotice.type == 3) {
                C60700b.m235851b("VideoConferencePushService", "[onPushVideoChatNotice9]", "vcNotice alert:" + vCNotice);
                VcMsgInfo vcMsgInfo3 = new VcMsgInfo();
                vcMsgInfo3.alert = new VcAlert();
                vcMsgInfo3.alert.title = new VcAlert.Text(vCNotice.title_i18n_key.newKey);
                vcMsgInfo3.alert.body = new VcAlert.Text(vCNotice.msg_i18n_key.newKey);
                vcMsgInfo3.alert.footer = new VcAlert.C60927Button(new VcAlert.Text(vCNotice.btn_i18n_key.newKey), 0);
                if (kVar != null) {
                    kVar.aD().mo212756b(vcMsgInfo3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo220145a(VideoChat videoChat) {
        C60700b.m235851b("VideoConferencePushService", "[onPushVideoChat]", "onPushVideoChat");
        if (videoChat != null) {
            if (m249520b(videoChat)) {
                VideoChatManager.m249444a().mo220105a(videoChat);
            } else {
                C60700b.m235864f("VideoConferencePushService", "[onPushVideoChat2]", "Feature Gating Closed");
            }
        }
    }

    /* renamed from: a */
    public void mo220140a(int i, String str) {
        VcBizSender.m249136a(i, str).mo219893b(new AbstractC63598b<C60939i>() {
            /* class com.ss.android.vc.service.C63635e.AnonymousClass13 */

            /* renamed from: a */
            public void onSuccess(C60939i iVar) {
                C60700b.m235843a("VideoConferencePushService", "[onPopupClick]", iVar.toString());
                DialogC60856d.m236548a();
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoConferencePushService", "[onPopupClick2]", eVar.toString());
                DialogC60856d.m236548a();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m249516a(C61303k kVar, VCNotice vCNotice) {
        kVar.mo212156c(vCNotice);
        Activity c = VCAppLifeCycle.m236256c();
        if (c instanceof MeetingActivity) {
            ((MeetingActivity) c).mo212795v();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m249514a(VCNotice vCNotice, C61303k kVar) {
        Activity c = VCAppLifeCycle.m236256c();
        if (c != null) {
            if (c instanceof MeetingActivity) {
                ((MeetingActivity) c).mo212778b(vCNotice.message);
                return;
            }
            if (kVar == null) {
                kVar = (C61303k) MeetingManager.m238341a().mo211906j();
            }
            if (kVar != null) {
                kVar.al().mo213176d(vCNotice.message);
                kVar.al().mo213168a(!TextUtils.isEmpty(vCNotice.message));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m249521c(VCNotice vCNotice, C61303k kVar) {
        if (TextUtils.isEmpty(vCNotice.meetingId) || kVar == null) {
            C60700b.m235864f("VideoConferencePushService", "[onPushVideoChatNotice3]", "notice belongs to no meeting.");
            return;
        }
        kVar.mo212150b(vCNotice);
        Activity c = VCAppLifeCycle.m236256c();
        if (c != null && (c instanceof MeetingActivity)) {
            ((MeetingActivity) c).mo212794u();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m249522d(VCNotice vCNotice, C61303k kVar) {
        if (TextUtils.isEmpty(vCNotice.meetingId) || kVar == null) {
            C60700b.m235864f("VideoConferencePushService", "[onPushVideoChatNotice2]", "notice belongs to no meeting.");
            return;
        }
        kVar.mo212109a(vCNotice);
        Activity c = VCAppLifeCycle.m236256c();
        if (c != null && (c instanceof MeetingActivity)) {
            ((MeetingActivity) c).mo212792s();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249518b(VCNotice vCNotice, C61303k kVar) {
        String str;
        if (TextUtils.isEmpty(vCNotice.meetingId) || kVar == null) {
            C60700b.m235864f("VideoConferencePushService", "[onPushVideoChatNotice4]", "notice belongs to no meeting.");
            return;
        }
        Activity c = VCAppLifeCycle.m236256c();
        if (c != null && (c instanceof MeetingActivity)) {
            String str2 = "";
            if (!CollectionUtils.isEmpty(vCNotice.extra)) {
                if (vCNotice.extra.containsKey(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) {
                    str = vCNotice.extra.get(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                } else {
                    str = str2;
                }
                if (vCNotice.extra.containsKey("share_id")) {
                    str2 = vCNotice.extra.get("share_id");
                }
            } else {
                str = str2;
            }
            C60700b.m235851b("VideoConferencePushService", "[onPushVideoChatNotice5]", "vcNotice extra share id= " + str2 + " display= " + str);
            ((MeetingActivity) c).mo212773a(str2, str);
        }
    }
}
