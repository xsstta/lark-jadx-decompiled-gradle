package com.ss.android.vc.meeting.model;

import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.entity.InMeetingChangedInfo;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.p3108b.C61377b;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.model.b */
public class C61373b {

    /* renamed from: a */
    private C61303k f153802a;

    /* renamed from: b */
    private List<AbstractC61374a> f153803b = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.vc.meeting.model.b$a */
    public interface AbstractC61374a {

        /* renamed from: com.ss.android.vc.meeting.model.b$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$b(AbstractC61374a aVar, boolean z) {
            }

            public static void $default$bC_(AbstractC61374a aVar) {
            }

            public static void $default$bF_(AbstractC61374a aVar) {
            }

            public static void $default$bX_(AbstractC61374a aVar) {
            }

            public static void $default$c(AbstractC61374a aVar, boolean z) {
            }

            public static void $default$c_(AbstractC61374a aVar, String str, String str2) {
            }

            public static void $default$d(AbstractC61374a aVar, boolean z) {
            }

            public static void $default$i_(AbstractC61374a aVar, boolean z) {
            }

            public static void $default$onOnlyPresenterCanAnnotateChanged(AbstractC61374a aVar, boolean z) {
            }
        }

        /* renamed from: b */
        void mo212445b(boolean z);

        void bC_();

        void bF_();

        void bX_();

        /* renamed from: c */
        void mo212449c(boolean z);

        void c_(String str, String str2);

        /* renamed from: d */
        void mo212451d(boolean z);

        void i_(boolean z);

        void onOnlyPresenterCanAnnotateChanged(boolean z);
    }

    /* renamed from: a */
    public void mo212441a() {
        this.f153803b.clear();
    }

    public C61373b(C61303k kVar) {
        this.f153802a = kVar;
    }

    /* renamed from: b */
    public void mo212444b(AbstractC61374a aVar) {
        if (this.f153803b.contains(aVar)) {
            this.f153803b.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo212443a(AbstractC61374a aVar) {
        if (!this.f153803b.contains(aVar)) {
            C61377b.m239188a(aVar, this.f153803b);
            this.f153803b.add(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m239169a(InMeetingData inMeetingData) {
        InMeetingData.SubtitleStatusData subtitleStatusData = inMeetingData.getSubtitleStatusData();
        if (subtitleStatusData != null) {
            C60700b.m235851b("InMeetingDataChangeProcessor", "[onPushInMeetingChangedInfo2]", "subtitleStatus: " + subtitleStatusData.f152438a);
            this.f153802a.mo212107Y().mo218625a(subtitleStatusData);
        }
    }

    /* renamed from: a */
    private void m239170a(VideoChatSettings videoChatSettings) {
        boolean z;
        if (videoChatSettings == null) {
            C60700b.m235851b("InMeetingDataChangeProcessor", "[dealSettingsChanged]", "settings is null");
            return;
        }
        C60700b.m235851b("InMeetingDataChangeProcessor", "[dealSettingsChanged2]", "muteOnEntry = " + videoChatSettings.isMuteOnEntry() + ", onlyHostCanShare = " + videoChatSettings.getOnlyHostCanShare() + ", onlyHostCanReplaceShare = " + videoChatSettings.getOnlyHostCanReplaceShare());
        this.f153802a.ao().mo218457a(videoChatSettings);
        if (this.f153802a.f153550c == VideoChat.Type.MEET) {
            z = true;
        } else {
            z = false;
        }
        for (AbstractC61374a aVar : this.f153803b) {
            aVar.i_(videoChatSettings.isMuteOnEntry());
            aVar.mo212445b(videoChatSettings.getOnlyHostCanShare());
            aVar.mo212449c(videoChatSettings.getOnlyHostCanReplaceShare());
            aVar.onOnlyPresenterCanAnnotateChanged(videoChatSettings.getOnlyPresenterCanAnnotate());
            if (videoChatSettings.getManageCapability() != null) {
                aVar.mo212451d(videoChatSettings.getManageCapability().mOnlyPresenterCanAnnotate);
            }
            if (z) {
                aVar.c_(this.f153802a.mo212055d(), videoChatSettings.getTopic());
            }
        }
    }

    /* renamed from: a */
    public void mo212442a(InMeetingChangedInfo inMeetingChangedInfo) {
        C61303k kVar;
        C61303k kVar2;
        C61303k kVar3;
        InMeetingData.AllMicrophoneMutedData allMicrophoneMutedData;
        Participant j;
        C61303k kVar4;
        if (!(!this.f153802a.mo212091I().mo212499f() || inMeetingChangedInfo == null || C60742af.m236059a(inMeetingChangedInfo.getChanges()))) {
            C60700b.m235851b("InMeetingDataChangeProcessor", "[onPushInMeetingChangedInfo]", "meetingChangedInfo = " + inMeetingChangedInfo.toString());
            for (InMeetingData inMeetingData : inMeetingChangedInfo.getChanges()) {
                InMeetingData.Type type = inMeetingData.getType();
                if (type == InMeetingData.Type.PARTICIPANTS_CHANGED) {
                    this.f153802a.mo212057f();
                    VideoChat.Type type2 = VideoChat.Type.MEET;
                } else if (type == InMeetingData.Type.HOST_TRANSFERRED) {
                    InMeetingData.HostTransferredData hostTransferredData = inMeetingData.getHostTransferredData();
                    VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
                    if (!(hostTransferredData == null || hostTransferredData.getHostDeviceId() == null || currentUser == null)) {
                        if (ParticipantUtil.m248722a(hostTransferredData.getHostId(), hostTransferredData.getHostType(), hostTransferredData.getHostDeviceId()) && (((j = this.f153802a.mo212091I().mo212494b().mo212605j()) == null || j.getParticipantRole() != ParticipantRole.INTERVIEWEE) && !GuestJoinMeetingUtil.m245480b() && (kVar4 = this.f153802a) != null && !kVar4.mo212098P())) {
                            C60738ac.m236037c((int) R.string.View_M_YouBecameHost);
                        }
                        for (AbstractC61374a aVar : this.f153803b) {
                            aVar.bF_();
                        }
                    }
                } else if (type == InMeetingData.Type.ALL_MICROPHONE_MUTED) {
                    if (this.f153802a.mo212057f() == VideoChat.Type.MEET && (allMicrophoneMutedData = inMeetingData.getAllMicrophoneMutedData()) != null) {
                        if (allMicrophoneMutedData.getOperationUser() == null || !ParticipantUtil.m248722a(allMicrophoneMutedData.getOperationUser().getUserId(), allMicrophoneMutedData.getOperationUser().getParticipantType(), allMicrophoneMutedData.getOperationUser().getDeviceId())) {
                            if (allMicrophoneMutedData.isMuted()) {
                                C60738ac.m236037c((int) R.string.View_M_HostMutedAll);
                            } else if (!allMicrophoneMutedData.isMuted() && this.f153802a.mo212092J().mo212505B()) {
                                for (AbstractC61374a aVar2 : this.f153803b) {
                                    aVar2.bC_();
                                }
                            }
                        }
                    }
                } else if (type == InMeetingData.Type.UNMUTE_CAMERA_CONFIRMED) {
                    boolean F = this.f153802a.mo212092J().mo212509F();
                    C60700b.m235851b("InMeetingDataChangeProcessor", "[onPushInMeetingChangedInfo2]", "onHostOpenCamera pending: " + F);
                    if (!F) {
                        for (AbstractC61374a aVar3 : this.f153803b) {
                            aVar3.bX_();
                        }
                    }
                } else if (type == InMeetingData.Type.UNMUTE_MICROPHONE_CONFIRMED) {
                    for (AbstractC61374a aVar4 : this.f153803b) {
                        aVar4.bC_();
                    }
                } else if (type == InMeetingData.Type.SETTINGS_CHANGED) {
                    m239170a(inMeetingData.getSettingsChangedData().getVideoChatSettings());
                } else if (type == InMeetingData.Type.RECORD_MEETING) {
                    InMeetingData.RecordMeetingData recordMeetingData = inMeetingData.getRecordMeetingData();
                    if (!(recordMeetingData == null || (kVar3 = this.f153802a) == null)) {
                        kVar3.mo212106X().mo217357a(recordMeetingData);
                    }
                } else if (type == InMeetingData.Type.REQUEST_FOLLOW_TOKEN) {
                    this.f153802a.ab().mo213851a();
                } else if (type == InMeetingData.Type.SUBTITLE_STATUS_CONFIRMED || type == InMeetingData.Type.SUBTITLE_STATUS_CHANGE) {
                    C60735ab.m236001a(new Runnable(inMeetingData) {
                        /* class com.ss.android.vc.meeting.model.$$Lambda$b$god0c6pmcRoBd5ugannbm00VsE */
                        public final /* synthetic */ InMeetingData f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C61373b.m271199lambda$god0c6pmcRoBd5ugannbm00VsE(C61373b.this, this.f$1);
                        }
                    });
                } else if (type == InMeetingData.Type.LIVE_MEETING) {
                    C60700b.m235851b("InMeetingDataChangeProcessor", "[dealLiveStreamExtraInfo]", "type == InMeetingData.Type.LIVE_MEETING");
                    InMeetingData.LiveMeetingData liveMeetingData = inMeetingData.getLiveMeetingData();
                    if (!(liveMeetingData == null || (kVar2 = this.f153802a) == null)) {
                        kVar2.am().mo214790a(liveMeetingData);
                    }
                } else if (type == InMeetingData.Type.HOST_MUTE_MIC) {
                    C60738ac.m236037c((int) R.string.View_M_HostMutedYourMic);
                } else if (type == InMeetingData.Type.HOST_MUTE_CAMERA) {
                    C60738ac.m236037c((int) R.string.View_M_HostTurnedOffyourCamera);
                } else if (!(type != InMeetingData.Type.UPGRADE_MEETING || inMeetingData.getMeetingOwner() == null || (kVar = this.f153802a) == null || kVar.mo212056e() == null)) {
                    this.f153802a.mo212056e().setMeetingOwner(inMeetingData.getMeetingOwner());
                }
            }
        }
    }
}
