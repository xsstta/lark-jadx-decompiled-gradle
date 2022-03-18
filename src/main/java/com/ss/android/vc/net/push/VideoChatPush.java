package com.ss.android.vc.net.push;

import com.bytedance.common.utility.Logger;
import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.pb.videochat.EnterprisePhoneNotify;
import com.ss.android.lark.pb.videoconference.v1.ByteviewHeartbeatStop;
import com.ss.android.lark.pb.videoconference.v1.FullVCLobbyParticipants;
import com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatStatusResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVcMeetingJoinStatusResponse;
import com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundResponse;
import com.ss.android.lark.pb.videoconference.v1.MeetingParticipantChange;
import com.ss.android.lark.pb.videoconference.v1.PushGrootChannelStatus;
import com.ss.android.lark.pb.videoconference.v1.PushVideoChatInteractionMessages;
import com.ss.android.lark.pb.videoconference.v1.StartByteviewHeartbeatRequest;
import com.ss.android.lark.pb.videoconference.v1.VCTabTotalMissedCallInfo;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import com.ss.android.lark.pb.videoconference.v1.VideoChatNotice;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.vc.common.p3083e.C60761j;
import com.ss.android.vc.entity.InMeetingChangedInfo;
import com.ss.android.vc.entity.InMeetingUpdateMessage;
import com.ss.android.vc.entity.ParticipantChange;
import com.ss.android.vc.entity.PushGrootCells;
import com.ss.android.vc.entity.UpdateHistoryCalls;
import com.ss.android.vc.entity.UpdateHistoryMeetings;
import com.ss.android.vc.entity.UpdateUpcomingEvents;
import com.ss.android.vc.entity.VCEnterprisePhoneNotify;
import com.ss.android.vc.entity.VCNotice;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCombinedInfo;
import com.ss.android.vc.entity.VideoChatExtraInfo;
import com.ss.android.vc.entity.VideoChatNoticeUpdate;
import com.ss.android.vc.entity.VideoChatPrompt;
import com.ss.android.vc.entity.background.C60936b;
import com.ss.android.vc.entity.p3092a.C60930c;
import com.ss.android.vc.entity.p3092a.C60932d;
import com.ss.android.vc.entity.response.C60979m;
import com.ss.android.vc.entity.response.GrootChannelEntity;
import com.ss.android.vc.entity.response.ao;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCTabTotalMissedCallInfoEntity;
import com.ss.android.vc.meeting.module.lobby.pb.C62148a;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageNotify;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import com.ss.android.vc.meeting.module.p3125i.C61927a;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.module.reaction.util.InteractionMessageUtil;
import com.ss.android.vc.net.push.PushListeners;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@XClass(isSingleton = true, runOnProcess = XProcess.VC)
public class VideoChatPush {

    /* renamed from: a */
    private Map<Command, List<PushListener>> f160554a;

    /* renamed from: b */
    private List<AbstractC63581u> f160555b;

    /* renamed from: c */
    private List<AbstractC63570j> f160556c;

    /* renamed from: d */
    private List<AbstractC63580t> f160557d;

    /* renamed from: e */
    private List<AbstractC63579s> f160558e;

    /* renamed from: f */
    private List<AbstractC63582v> f160559f;

    /* renamed from: g */
    private List<AbstractC63584x> f160560g;

    /* renamed from: h */
    private List<AbstractC63563c> f160561h;

    /* renamed from: i */
    private List<AbstractC63568h> f160562i;

    /* renamed from: j */
    private List<AbstractC63577q> f160563j;

    /* renamed from: k */
    private List<AbstractC63574n> f160564k;

    /* renamed from: l */
    private List<AbstractC63569i> f160565l;

    /* renamed from: m */
    private List<AbstractC63567g> f160566m;

    /* renamed from: n */
    private List<AbstractC63565e> f160567n;

    /* renamed from: o */
    private final Map<String, List<AbstractC63564d>> f160568o;

    /* renamed from: p */
    private final List<AbstractC63573m> f160569p;

    /* renamed from: q */
    private final List<AbstractC63572l> f160570q;

    /* renamed from: r */
    private final List<AbstractC63571k> f160571r;

    /* renamed from: s */
    private final List<AbstractC63583w> f160572s;

    /* renamed from: t */
    private final List<AbstractC63566f> f160573t;

    /* renamed from: u */
    private final List<AbstractC63575o> f160574u;

    /* renamed from: v */
    private final List<AbstractC63576p> f160575v;

    /* renamed from: w */
    private final List<AbstractC63562b> f160576w;

    /* renamed from: x */
    private final List<AbstractC63578r> f160577x;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$a */
    public static class C63561a {

        /* renamed from: a */
        public static final VideoChatPush f160579a = new VideoChatPush();
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$b */
    public interface AbstractC63562b {
        /* renamed from: a */
        void mo219781a(C62148a aVar);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$c */
    public interface AbstractC63563c {
        void onPushGrootCells(PushGrootCells pushGrootCells);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$d */
    public interface AbstractC63564d {
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$e */
    public interface AbstractC63565e {
        /* renamed from: a */
        void mo219782a(InMeetingChangedInfo inMeetingChangedInfo);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$f */
    public interface AbstractC63566f {
        /* renamed from: a */
        void mo219783a(ArrayList<InteractionMessage> arrayList);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$g */
    public interface AbstractC63567g {
        /* renamed from: a */
        void mo219784a(InMeetingUpdateMessage inMeetingUpdateMessage);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$h */
    public interface AbstractC63568h {
        /* renamed from: a */
        void mo211349a(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$i */
    public interface AbstractC63569i {
        /* renamed from: a */
        void mo219785a(ParticipantChange participantChange);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$j */
    public interface AbstractC63570j {
        /* renamed from: a */
        void mo219786a(String str, int i);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$k */
    public interface AbstractC63571k {
        /* renamed from: a */
        void mo219787a(UpdateHistoryCalls oVar);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$l */
    public interface AbstractC63572l {
        /* renamed from: a */
        void mo219788a(UpdateHistoryMeetings pVar);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$m */
    public interface AbstractC63573m {
        /* renamed from: a */
        void mo219789a(UpdateUpcomingEvents qVar);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$n */
    public interface AbstractC63574n {
        /* renamed from: a */
        void mo213484a(VCEnterprisePhoneNotify vCEnterprisePhoneNotify);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$o */
    public interface AbstractC63575o {
        /* renamed from: a */
        void mo219790a(VCManageNotify vCManageNotify);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$p */
    public interface AbstractC63576p {
        /* renamed from: a */
        void mo219791a(VCManageResult vCManageResult);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$q */
    public interface AbstractC63577q {
        /* renamed from: a */
        void mo218809a(VCTabTotalMissedCallInfoEntity vCTabTotalMissedCallInfoEntity);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$r */
    public interface AbstractC63578r {
        /* renamed from: a */
        void mo219792a(C60936b bVar);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$s */
    public interface AbstractC63579s {
        /* renamed from: a */
        void mo219793a(VideoChatCombinedInfo videoChatCombinedInfo);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$t */
    public interface AbstractC63580t {
        /* renamed from: a */
        void mo219794a(VideoChatExtraInfo videoChatExtraInfo);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$u */
    public interface AbstractC63581u {
        /* renamed from: a */
        void mo219795a(VideoChat videoChat);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$v */
    public interface AbstractC63582v {
        /* renamed from: a */
        void mo219796a(VCNotice vCNotice);

        /* renamed from: a */
        void mo219797a(VideoChatNoticeUpdate videoChatNoticeUpdate);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$w */
    public interface AbstractC63583w {
        /* renamed from: a */
        void mo219798a(VideoChatPrompt videoChatPrompt);
    }

    /* renamed from: com.ss.android.vc.net.push.VideoChatPush$x */
    public interface AbstractC63584x {
        void onPushVideoChatStatus(C60979m mVar);
    }

    @XSingleton
    /* renamed from: a */
    public static final VideoChatPush m249004a() {
        return C63561a.f160579a;
    }

    /* renamed from: a */
    public void mo219729a(PushListener aVar) {
        if (!this.f160554a.containsKey(aVar.mo219799a())) {
            this.f160554a.put(aVar.mo219799a(), new ArrayList());
        }
        this.f160554a.get(aVar.mo219799a()).add(aVar);
    }

    /* renamed from: b */
    public void mo219752b(PushListener aVar) {
        mo219729a(aVar);
        C53248k.m205912a().mo181697a(aVar.mo219799a(), new C53248k.AbstractC53250a(aVar) {
            /* class com.ss.android.vc.net.push.$$Lambda$VideoChatPush$x5eWZmwrf0wUyTjLAuoUALcy0gA */
            public final /* synthetic */ PushListener f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                VideoChatPush.this.m249005a(this.f$1, bArr, str, z, z2);
            }
        });
    }

    /* renamed from: a */
    public void mo219726a(AbstractC63581u uVar) {
        m249007a(this.f160555b, uVar);
    }

    /* renamed from: b */
    public void mo219749b(AbstractC63581u uVar) {
        m249010b(this.f160555b, uVar);
    }

    /* renamed from: a */
    public void mo219730a(String str, AbstractC63564d dVar) {
        m249008a(this.f160568o, str, dVar);
    }

    /* renamed from: b */
    public void mo219753b(String str, AbstractC63564d dVar) {
        m249011b(this.f160568o, str, dVar);
    }

    /* renamed from: a */
    public void mo219722a(AbstractC63577q qVar) {
        m249007a(this.f160563j, qVar);
    }

    /* renamed from: b */
    public void mo219745b(AbstractC63577q qVar) {
        m249010b(this.f160563j, qVar);
    }

    /* renamed from: a */
    public void mo219719a(AbstractC63574n nVar) {
        m249007a(this.f160564k, nVar);
    }

    /* renamed from: b */
    public void mo219742b(AbstractC63574n nVar) {
        m249010b(this.f160564k, nVar);
    }

    /* renamed from: a */
    public void mo219716a(AbstractC63568h hVar) {
        m249007a(this.f160562i, hVar);
    }

    /* renamed from: a */
    public void mo219718a(AbstractC63570j jVar) {
        m249007a(this.f160556c, jVar);
    }

    /* renamed from: b */
    public void mo219741b(AbstractC63570j jVar) {
        m249010b(this.f160556c, jVar);
    }

    /* renamed from: a */
    public void mo219725a(AbstractC63580t tVar) {
        m249007a(this.f160557d, tVar);
    }

    /* renamed from: b */
    public void mo219748b(AbstractC63580t tVar) {
        m249010b(this.f160557d, tVar);
    }

    /* renamed from: a */
    public void mo219724a(AbstractC63579s sVar) {
        m249007a(this.f160558e, sVar);
    }

    /* renamed from: b */
    public void mo219747b(AbstractC63579s sVar) {
        m249010b(this.f160558e, sVar);
    }

    /* renamed from: a */
    public void mo219717a(AbstractC63569i iVar) {
        m249007a(this.f160565l, iVar);
    }

    /* renamed from: a */
    public void mo219727a(AbstractC63582v vVar) {
        m249007a(this.f160559f, vVar);
    }

    /* renamed from: b */
    public void mo219750b(AbstractC63582v vVar) {
        m249010b(this.f160559f, vVar);
    }

    /* renamed from: a */
    public void mo219728a(AbstractC63583w wVar) {
        m249007a(this.f160572s, wVar);
    }

    /* renamed from: b */
    public void mo219751b(AbstractC63583w wVar) {
        m249010b(this.f160572s, wVar);
    }

    /* renamed from: a */
    public void mo219720a(AbstractC63575o oVar) {
        m249007a(this.f160574u, oVar);
    }

    /* renamed from: b */
    public void mo219743b(AbstractC63575o oVar) {
        m249010b(this.f160574u, oVar);
    }

    /* renamed from: a */
    public void mo219721a(AbstractC63576p pVar) {
        m249007a(this.f160575v, pVar);
    }

    /* renamed from: b */
    public void mo219744b(AbstractC63576p pVar) {
        m249010b(this.f160575v, pVar);
    }

    /* renamed from: a */
    public void mo219723a(AbstractC63578r rVar) {
        m249007a(this.f160577x, rVar);
    }

    /* renamed from: b */
    public void mo219746b(AbstractC63578r rVar) {
        m249010b(this.f160577x, rVar);
    }

    /* renamed from: a */
    public void mo219731a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            MeetingParticipantChange decode = MeetingParticipantChange.ADAPTER.decode(bArr);
            if (decode != null) {
                ParticipantChange a = C60930c.m236859a(decode);
                C60871a.m236609a("VideoChatPush", "onPushMeetingParticipantChange " + C60761j.m236097a(a));
                for (AbstractC63569i iVar : this.f160565l) {
                    iVar.mo219785a(a);
                }
            }
        } catch (IOException e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo219754b(byte[] bArr, String str, boolean z, boolean z2) {
        InMeetingUpdateMessage a;
        try {
            com.ss.android.lark.pb.videoconference.v1.InMeetingUpdateMessage decode = com.ss.android.lark.pb.videoconference.v1.InMeetingUpdateMessage.ADAPTER.decode(bArr);
            if (!(decode == null || (a = C60930c.m236843a(decode)) == null)) {
                C60871a.m236609a("VideoChatPush", "onPushMeetingInfo " + C60761j.m236097a(a));
                for (AbstractC63567g gVar : this.f160566m) {
                    gVar.mo219784a(a);
                }
            }
        } catch (IOException e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo219733b() {
        C53248k.m205912a().mo181700a(com.ss.android.lark.pb.improto.Command.NOTIFY_ENTERPRISE_PHONE, PushListeners.VCEnterprisePhoneListener.m248989a());
    }

    /* renamed from: c */
    public void mo219755c() {
        C53248k.m205912a().mo181699a(com.ss.android.lark.pb.improto.Command.NOTIFY_ENTERPRISE_PHONE);
    }

    private VideoChatPush() {
        this.f160554a = new ConcurrentHashMap();
        this.f160555b = new CopyOnWriteArrayList();
        this.f160556c = new CopyOnWriteArrayList();
        this.f160557d = new CopyOnWriteArrayList();
        this.f160558e = new CopyOnWriteArrayList();
        this.f160559f = new CopyOnWriteArrayList();
        this.f160560g = new CopyOnWriteArrayList();
        this.f160561h = new CopyOnWriteArrayList();
        this.f160562i = new CopyOnWriteArrayList();
        this.f160563j = new CopyOnWriteArrayList();
        this.f160564k = new CopyOnWriteArrayList();
        this.f160565l = new CopyOnWriteArrayList();
        this.f160566m = new CopyOnWriteArrayList();
        this.f160567n = new CopyOnWriteArrayList();
        this.f160568o = new HashMap();
        this.f160569p = new CopyOnWriteArrayList();
        this.f160570q = new CopyOnWriteArrayList();
        this.f160571r = new CopyOnWriteArrayList();
        this.f160572s = new CopyOnWriteArrayList();
        this.f160573t = new CopyOnWriteArrayList();
        this.f160574u = new CopyOnWriteArrayList();
        this.f160575v = new CopyOnWriteArrayList();
        this.f160576w = new CopyOnWriteArrayList();
        this.f160577x = new CopyOnWriteArrayList();
    }

    @XMethod(runOnProcess = XProcess.Main)
    public void registerPush() {
        C53248k.m205912a().mo181697a(Command.NOTIFY_VIDEO_CHAT, PushListeners.VideoChatListener.m248997a());
        C53248k.m205912a().mo181697a(Command.PUSH_VIDEO_CHAT_NOTICE, PushListeners.VideoChatNoticeListener.m248999a());
        C53248k.m205912a().mo181697a(Command.PUSH_BYTEVIEW_HEARTBEAT_STOP, PushListeners.VideoChatResetHeartbeatListener.m249002a());
        C53248k.m205912a().mo181697a(Command.NOTIFY_VIDEO_CHAT_EXTRA, PushListeners.VideoChatExtraInfoListener.m248995a());
        C53248k.m205912a().mo181697a(Command.PUSH_VIDEO_CHAT_COMBINED_INFO, PushListeners.VideoChatCombinedInfoListener.m248994a());
        C53248k.m205912a().mo181697a(Command.PUSH_MEETING_PARTICIPANT_CHANGE, PushListeners.MeetingParticipantChangeListener.m248985a());
        C53248k.m205912a().mo181697a(Command.PUSH_MEETING_INFO, PushListeners.MeetingInfoListener.m248984a());
        C53248k.m205912a().mo181697a(Command.PUSH_MEETING_CHANGED_INFO, PushListeners.MeetingChangedInfoListener.m248983a());
        C53248k.m205912a().mo181697a(Command.PUSH_VIDEO_CHAT_NOTICE_UPDATE, PushListeners.VideoChatNoticeUpdateListener.m249000a());
        C53248k.m205912a().mo181697a(Command.PUSH_ASSOCIATED_VC_STATUS, PushListeners.VideoChatStatusListener.m249003a());
        C53248k.m205912a().mo181697a(Command.PUSH_GROOT_CELLS, PushListeners.GrootCellsListener.m248981a());
        C53248k.m205912a().mo181700a(com.ss.android.lark.pb.improto.Command.NOTIFY_VC_TAB_MISSED_CALLS, PushListeners.VCTabMissedCallListener.m248990a());
        C53248k.m205912a().mo181697a(Command.PUSH_GROOT_CHANNEL_STATUS, PushListeners.GrootChannelStatusListener.m248982a());
        C53248k.m205912a().mo181697a(Command.PUSH_UPDATE_UPCOMING_EVENTS, PushListeners.UpdateUpcomingEventsListener.m248988a());
        C53248k.m205912a().mo181697a(Command.PUSH_UPDATE_HISTORY_MEETINGS, PushListeners.UpdateHistoryMeetingsListener.m248987a());
        C53248k.m205912a().mo181697a(Command.PUSH_UPDATE_HISTORY_CALL, PushListeners.UpdateCallsListener.m248986a());
        C53248k.m205912a().mo181697a(Command.PUSH_VIDEO_CHAT_PROMPT, PushListeners.VideoChatPromptListener.m249001a());
        C53248k.m205912a().mo181697a(Command.PUSH_VIDEO_CHAT_INTERACTION_MESSAGES, PushListeners.VideoChatInteractionMessagesListener.m248996a());
        C53248k.m205912a().mo181697a(Command.PUSH_VC_MEETING_JOIN_STATUS, PushListeners.VideoChatMeetingJoinStatusListener.m248998a());
        C53248k.m205912a().mo181697a(Command.PUSH_VC_MANAGE_NOTIFY, PushListeners.VcManagerNotifyListener.m248992a());
        C53248k.m205912a().mo181697a(Command.PUSH_VC_MANAGE_RESULT, PushListeners.VcManagerResultListener.m248993a());
        C53248k.m205912a().mo181697a(Command.PUSH_FULL_VC_LOBBY_PARTICIPANTS, PushListeners.FullVCLobbyParticipantsListener.m248980a());
        C53248k.m205912a().mo181697a(Command.PUSH_VC_VIRTUAL_BACKGROUND, PushListeners.VCVirtualBackgroundListener.m248991a());
    }

    @XMethod
    public void addPushVideoChatStatusListener(AbstractC63584x xVar) {
        m249007a(this.f160560g, xVar);
    }

    @XMethod
    public void removePushVideoChatStatusListener(AbstractC63584x xVar) {
        m249010b(this.f160560g, xVar);
    }

    /* renamed from: a */
    public static <T> boolean m249009a(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo219734b(AbstractC63562b bVar) {
        m249010b(this.f160576w, bVar);
    }

    /* renamed from: b */
    public void mo219735b(AbstractC63563c cVar) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("removePushGrootCellsListener, before size:");
        List<AbstractC63563c> list = this.f160561h;
        int i2 = -1;
        if (list != null) {
            i = list.size();
        } else {
            i = -1;
        }
        sb.append(i);
        Logger.m15173i("VideoChatPush", sb.toString());
        m249010b(this.f160561h, cVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("removePushGrootCellsListener, after size:");
        List<AbstractC63563c> list2 = this.f160561h;
        if (list2 != null) {
            i2 = list2.size();
        }
        sb2.append(i2);
        Logger.m15173i("VideoChatPush", sb2.toString());
    }

    /* renamed from: a */
    public void mo219711a(AbstractC63562b bVar) {
        m249007a(this.f160576w, bVar);
    }

    /* renamed from: b */
    public void mo219736b(AbstractC63565e eVar) {
        m249010b(this.f160567n, eVar);
    }

    /* renamed from: a */
    public void mo219712a(AbstractC63563c cVar) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("addPushGrootCellsListener, before size:");
        List<AbstractC63563c> list = this.f160561h;
        int i2 = -1;
        if (list != null) {
            i = list.size();
        } else {
            i = -1;
        }
        sb.append(i);
        Logger.m15173i("VideoChatPush", sb.toString());
        m249007a(this.f160561h, cVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("addPushGrootCellsListener, after size:");
        List<AbstractC63563c> list2 = this.f160561h;
        if (list2 != null) {
            i2 = list2.size();
        }
        sb2.append(i2);
        Logger.m15173i("VideoChatPush", sb2.toString());
    }

    /* renamed from: b */
    public void mo219737b(AbstractC63566f fVar) {
        m249010b(this.f160573t, fVar);
    }

    /* renamed from: a */
    public void mo219713a(AbstractC63565e eVar) {
        m249007a(this.f160567n, eVar);
    }

    /* renamed from: b */
    public void mo219738b(AbstractC63567g gVar) {
        m249010b(this.f160566m, gVar);
    }

    /* renamed from: a */
    public void mo219714a(AbstractC63566f fVar) {
        m249007a(this.f160573t, fVar);
    }

    /* renamed from: b */
    public void mo219739b(AbstractC63568h hVar) {
        m249010b(this.f160562i, hVar);
    }

    /* renamed from: a */
    public void mo219715a(AbstractC63567g gVar) {
        m249007a(this.f160566m, gVar);
    }

    /* renamed from: b */
    public void mo219740b(AbstractC63569i iVar) {
        m249010b(this.f160565l, iVar);
    }

    /* renamed from: a */
    private static <T> void m249007a(List<T> list, T t) {
        if (t != null) {
            list.add(t);
        }
    }

    /* renamed from: b */
    private static <T> void m249010b(List<T> list, T t) {
        if (t != null) {
            list.remove(t);
        }
    }

    /* renamed from: a */
    private void m249006a(String str, GrootChannelEntity grootChannelEntity) {
        if (grootChannelEntity == null) {
            C60871a.m236612c("VideoChatPush", "[sendChannelHeartBeat] channel is null");
        } else {
            VcBizSender.m249173a(str, grootChannelEntity).mo219893b(new AbstractC63598b<ao>() {
                /* class com.ss.android.vc.net.push.VideoChatPush.C635601 */

                /* renamed from: a */
                public void onSuccess(ao aoVar) {
                    C60871a.m236609a("VideoChatPush", "[sendChannelHeartBeat] success " + aoVar.toString());
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60871a.m236611b("VideoChatPush", "[sendChannelHeartBeat] onError" + eVar);
                }
            });
        }
    }

    /* renamed from: b */
    private static <K, V> void m249011b(Map<K, List<V>> map, K k, V v) {
        if (map != null && map.get(k) != null) {
            map.get(k).remove(v);
        }
    }

    /* renamed from: a */
    private static <K, V> void m249008a(Map<K, List<V>> map, K k, V v) {
        if (map != null) {
            if (map.get(k) == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                copyOnWriteArrayList.add(v);
                map.put(k, copyOnWriteArrayList);
                return;
            }
            map.get(k).add(v);
        }
    }

    /* renamed from: c */
    public void mo219756c(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            GetVcMeetingJoinStatusResponse decode = GetVcMeetingJoinStatusResponse.ADAPTER.decode(bArr);
            if (decode != null) {
                VCMeetingJoinInfoEntity a = C60930c.m236976a(decode);
                for (AbstractC63568h hVar : this.f160562i) {
                    hVar.mo211349a(a);
                }
            }
        } catch (IOException e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo219757d(byte[] bArr, String str, boolean z, boolean z2) {
        com.ss.android.lark.pb.videoconference.v1.InMeetingChangedInfo inMeetingChangedInfo;
        try {
            inMeetingChangedInfo = com.ss.android.lark.pb.videoconference.v1.InMeetingChangedInfo.ADAPTER.decode(bArr);
        } catch (Exception e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
            inMeetingChangedInfo = null;
        }
        if (inMeetingChangedInfo != null) {
            InMeetingChangedInfo a = C60930c.m236838a(inMeetingChangedInfo);
            for (AbstractC63565e eVar : this.f160567n) {
                eVar.mo219782a(a);
            }
        }
    }

    /* renamed from: f */
    public void mo219759f(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            com.ss.android.lark.pb.videoconference.v1.PushGrootCells decode = com.ss.android.lark.pb.videoconference.v1.PushGrootCells.ADAPTER.decode(bArr);
            if (decode != null) {
                PushGrootCells a = C61927a.m241915a(decode);
                for (AbstractC63563c cVar : this.f160561h) {
                    cVar.onPushGrootCells(a);
                }
            }
        } catch (IOException e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }

    /* renamed from: i */
    public void mo219762i(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            VideoChatInfo decode = VideoChatInfo.ADAPTER.decode(bArr);
            if (decode != null) {
                VideoChat a = C60932d.m237040a(decode);
                for (AbstractC63581u uVar : this.f160555b) {
                    uVar.mo219795a(a);
                }
            }
        } catch (IOException e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }

    /* renamed from: j */
    public void mo219763j(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            VideoChatNotice decode = VideoChatNotice.ADAPTER.decode(bArr);
            if (decode != null) {
                VCNotice a = C60930c.m236866a(decode);
                C60761j.m236099b("VideoChatPush", decode);
                for (AbstractC63582v vVar : this.f160559f) {
                    vVar.mo219796a(a);
                }
            }
        } catch (IOException e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }

    /* renamed from: l */
    public void mo219765l(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            com.ss.android.lark.pb.videoconference.v1.VideoChatExtraInfo decode = com.ss.android.lark.pb.videoconference.v1.VideoChatExtraInfo.ADAPTER.decode(bArr);
            if (decode != null) {
                VideoChatExtraInfo a = C60932d.m237042a(decode);
                for (AbstractC63580t tVar : this.f160557d) {
                    tVar.mo219794a(a);
                }
            }
        } catch (IOException e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }

    /* renamed from: m */
    public void mo219766m(byte[] bArr, String str, boolean z, boolean z2) {
        com.ss.android.lark.pb.videoconference.v1.VideoChatCombinedInfo videoChatCombinedInfo;
        try {
            videoChatCombinedInfo = com.ss.android.lark.pb.videoconference.v1.VideoChatCombinedInfo.ADAPTER.decode(bArr);
        } catch (Exception e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
            videoChatCombinedInfo = null;
        }
        if (videoChatCombinedInfo != null) {
            VideoChatCombinedInfo a = C60932d.m237041a(videoChatCombinedInfo);
            for (AbstractC63579s sVar : this.f160558e) {
                sVar.mo219793a(a);
            }
        }
    }

    /* renamed from: n */
    public void mo219767n(byte[] bArr, String str, boolean z, boolean z2) {
        C60871a.m236611b("VideoChatPush", "onPushVideoChatNoticeUpdate");
        try {
            VideoChatNoticeUpdate a = C60930c.m236873a(com.ss.android.lark.pb.videoconference.v1.VideoChatNoticeUpdate.ADAPTER.decode(bArr));
            if (a == null) {
                C60871a.m236611b("VideoChatPush", "onPushVideoChatNoticeUpdate invalid");
                return;
            }
            C60761j.m236098a("VideoChatPush", a);
            for (AbstractC63582v vVar : this.f160559f) {
                vVar.mo219797a(a);
            }
        } catch (IOException e) {
            C60871a.m236610a("VideoChatPush", "[onPushVideoChatNoticeUpdate] error", e);
        }
    }

    /* renamed from: o */
    public void mo219768o(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            GetAssociatedVideoChatStatusResponse decode = GetAssociatedVideoChatStatusResponse.ADAPTER.decode(bArr);
            if (decode == null) {
                C60871a.m236611b("VideoChatPush", "[onPushVideoChatStatus] GetAssociatedVideoChatStatusResponse invalid");
                return;
            }
            C60979m a = C60930c.m236954a(decode);
            for (AbstractC63584x xVar : this.f160560g) {
                xVar.onPushVideoChatStatus(a);
            }
        } catch (IOException e) {
            C60871a.m236610a("VideoChatPush", "[onPushVideoChatStatus] error", e);
        }
    }

    /* renamed from: p */
    public void mo219769p(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            UpdateUpcomingEvents a = C60930c.m236906a(com.ss.android.lark.pb.videoconference.v1.UpdateUpcomingEvents.ADAPTER.decode(bArr));
            for (AbstractC63573m mVar : this.f160569p) {
                mVar.mo219789a(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: q */
    public void mo219770q(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            UpdateHistoryMeetings a = C60930c.m236905a(com.ss.android.lark.pb.videoconference.v1.UpdateHistoryMeetings.ADAPTER.decode(bArr));
            for (AbstractC63572l lVar : this.f160570q) {
                lVar.mo219788a(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    public void mo219771r(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            UpdateHistoryCalls a = C60930c.m236904a(com.ss.android.lark.pb.videoconference.v1.UpdateHistoryCalls.ADAPTER.decode(bArr));
            for (AbstractC63571k kVar : this.f160571r) {
                kVar.mo219787a(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: s */
    public void mo219774s(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            VideoChatPrompt a = C60930c.m236875a(com.ss.android.lark.pb.videoconference.v1.VideoChatPrompt.ADAPTER.decode(bArr));
            for (AbstractC63583w wVar : this.f160572s) {
                wVar.mo219798a(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: t */
    public void mo219775t(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            ArrayList<InteractionMessage> a = InteractionMessageUtil.m245785a(PushVideoChatInteractionMessages.ADAPTER.decode(bArr));
            for (AbstractC63566f fVar : this.f160573t) {
                fVar.mo219783a(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: u */
    public void mo219776u(byte[] bArr, String str, boolean z, boolean z2) {
        VCManageNotify vCManageNotify;
        try {
            vCManageNotify = C60930c.m236996a(com.ss.android.lark.pb.videoconference.v1.VCManageNotify.ADAPTER.decode(bArr));
        } catch (IOException e) {
            e.printStackTrace();
            vCManageNotify = null;
        }
        C60871a.m236609a("VideoChatPush", C60761j.m236097a(vCManageNotify));
        if (vCManageNotify != null) {
            for (AbstractC63575o oVar : this.f160574u) {
                oVar.mo219790a(vCManageNotify);
            }
        }
    }

    /* renamed from: v */
    public void mo219777v(byte[] bArr, String str, boolean z, boolean z2) {
        VCManageResult vCManageResult;
        try {
            vCManageResult = C60930c.m236997a(com.ss.android.lark.pb.videoconference.v1.VCManageResult.ADAPTER.decode(bArr));
        } catch (IOException e) {
            e.printStackTrace();
            vCManageResult = null;
        }
        C60871a.m236609a("VideoChatPush", C60761j.m236097a(vCManageResult));
        if (vCManageResult != null) {
            for (AbstractC63576p pVar : this.f160575v) {
                pVar.mo219791a(vCManageResult);
            }
        }
    }

    /* renamed from: w */
    public void mo219778w(byte[] bArr, String str, boolean z, boolean z2) {
        C62148a aVar;
        try {
            aVar = C60930c.m236999a(FullVCLobbyParticipants.ADAPTER.decode(bArr));
        } catch (IOException e) {
            e.printStackTrace();
            aVar = null;
        }
        C60871a.m236609a("VideoChatPush", C60761j.m236097a(aVar));
        if (aVar != null) {
            for (AbstractC63562b bVar : this.f160576w) {
                bVar.mo219781a(aVar);
            }
        }
    }

    /* renamed from: x */
    public void mo219779x(byte[] bArr, String str, boolean z, boolean z2) {
        C60936b bVar;
        try {
            bVar = C60930c.m236882a(GetVcVirtualBackgroundResponse.ADAPTER.decode(bArr));
        } catch (IOException e) {
            e.printStackTrace();
            bVar = null;
        }
        C60871a.m236609a("VideoChatPush", C60761j.m236097a(bVar));
        if (bVar != null) {
            for (AbstractC63578r rVar : this.f160577x) {
                rVar.mo219792a(bVar);
            }
        }
    }

    /* renamed from: e */
    public void mo219758e(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushGrootChannelStatus decode = PushGrootChannelStatus.ADAPTER.decode(bArr);
            if (decode == null) {
                return;
            }
            if (decode.channel_meta != null) {
                if (decode.status == PushGrootChannelStatus.Status.WILL_BE_CLOSED && !m249009a(this.f160568o.get(decode.channel_meta.channel_id))) {
                    m249006a(decode.channel_meta.channel_id, GrootChannelEntity.fromValue(decode.channel_meta.channel.getValue()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public void mo219760g(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            VCTabTotalMissedCallInfo decode = VCTabTotalMissedCallInfo.ADAPTER.decode(bArr);
            if (decode != null) {
                VCTabTotalMissedCallInfoEntity vCTabTotalMissedCallInfoEntity = new VCTabTotalMissedCallInfoEntity();
                vCTabTotalMissedCallInfoEntity.mtotal_missed_calls = decode.total_missed_calls.longValue();
                vCTabTotalMissedCallInfoEntity.mconfirmed_missed_calls = decode.confirmed_missed_calls.longValue();
                for (AbstractC63577q qVar : this.f160563j) {
                    qVar.mo218809a(vCTabTotalMissedCallInfoEntity);
                }
            }
        } catch (IOException e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }

    /* renamed from: h */
    public void mo219761h(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            EnterprisePhoneNotify decode = EnterprisePhoneNotify.ADAPTER.decode(bArr);
            if (decode != null) {
                VCEnterprisePhoneNotify vCEnterprisePhoneNotify = new VCEnterprisePhoneNotify();
                vCEnterprisePhoneNotify.enterprisePhoneId = decode.menterprise_phone_id;
                vCEnterprisePhoneNotify.action = VCEnterprisePhoneNotify.Action.fromValue(decode.maction.getValue());
                if (decode.mcaller_unreached_toast_data != null) {
                    vCEnterprisePhoneNotify.callerUnreachedToastData = new VCEnterprisePhoneNotify.C60926a(decode.mcaller_unreached_toast_data.mkey);
                }
                for (AbstractC63574n nVar : this.f160564k) {
                    nVar.mo213484a(vCEnterprisePhoneNotify);
                }
            }
        } catch (IOException e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }

    /* renamed from: k */
    public void mo219764k(byte[] bArr, String str, boolean z, boolean z2) {
        C60871a.m236611b("VideoChatPush", "[onPushVideoChatResetHeatbeat]");
        try {
            ByteviewHeartbeatStop decode = ByteviewHeartbeatStop.ADAPTER.decode(bArr);
            if (decode != null) {
                C60761j.m236099b("VideoChatPush", decode);
                String str2 = decode.token;
                if (decode.service_type.getValue() != StartByteviewHeartbeatRequest.ServiceType.VOIP.getValue()) {
                    decode.service_type.getValue();
                    StartByteviewHeartbeatRequest.ServiceType.VC.getValue();
                    for (AbstractC63570j jVar : this.f160556c) {
                        jVar.mo219786a(str2, decode.reason.getValue());
                    }
                }
            }
        } catch (IOException e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m249005a(PushListener aVar, byte[] bArr, String str, boolean z, boolean z2) {
        try {
            List<PushListener> list = this.f160554a.get(aVar.mo219799a());
            for (int i = 0; i < list.size(); i++) {
                list.get(i).mo219801a(bArr, str, z, z2);
            }
        } catch (Exception e) {
            C60871a.m236612c("VideoChatPush", e.getMessage());
        }
    }
}
