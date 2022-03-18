package com.ss.android.vc.meeting.module.xiaomivoip;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.ax;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.lobby.AbsJoinLobbyIntercept;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.p3181b.ak;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.xiaomivoip.a */
public class C63460a {

    /* renamed from: a */
    private final List<String> f160314a;

    /* renamed from: b */
    private volatile String f160315b;

    /* renamed from: c */
    private boolean f160316c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.xiaomivoip.a$a */
    public static final class C63463a {

        /* renamed from: a */
        public static final C63460a f160320a = new C63460a();
    }

    /* renamed from: a */
    public static C63460a m248690a() {
        return C63463a.f160320a;
    }

    private C63460a() {
        this.f160314a = new LinkedList();
        this.f160315b = null;
        this.f160316c = true;
    }

    /* renamed from: a */
    private void m248692a(String str) {
        VideoChat.UpdateVideoChatAction updateVideoChatAction = VideoChat.UpdateVideoChatAction.REFUSE;
        VcBizSender.m249138a(updateVideoChatAction.getNumber(), str, null, false, false, null, null, updateVideoChatAction, VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis()).mo219893b(new AbstractC63598b<ax>() {
            /* class com.ss.android.vc.meeting.module.xiaomivoip.C63460a.C634622 */

            /* renamed from: a */
            public void onSuccess(ax axVar) {
                C60700b.m235851b("XiaoMiVoipManager", "[refuseVideoChat]", "success");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("XiaoMiVoipManager", "[refuseVideoChat2]", "error = " + eVar.toString());
            }
        });
    }

    /* renamed from: a */
    public void mo219566a(List<VideoChat> list) {
        if (!(list == null || list.size() == 0)) {
            for (VideoChat videoChat : list) {
                Participant b = MeetingUtil.m238370b(videoChat);
                if (b != null && this.f160314a.contains(b.getInteractiveId())) {
                    if ("accept".equals(this.f160315b)) {
                        C60700b.m235851b("XiaoMiVoipManager", "[checkXiaoMiVoipAction]", "remove accept meeting " + b.getInteractiveId());
                        ak.m249761a("accept", videoChat);
                        list.remove(videoChat);
                        return;
                    } else if ("click".equals(this.f160315b)) {
                        C60700b.m235851b("XiaoMiVoipManager", "[checkXiaoMiVoipAction2]", "click meeting " + b.getInteractiveId());
                        ak.m249761a("bar", videoChat);
                    } else if ("hangup".equals(this.f160315b)) {
                        C60700b.m235851b("XiaoMiVoipManager", "[checkXiaoMiVoipAction3]", "remove hangup meeting " + b.getInteractiveId());
                        list.remove(videoChat);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo219565a(Context context, String str, final AbstractC63598b<Boolean> bVar) {
        ParticipantSettings.EquipmentStatus equipmentStatus;
        ParticipantSettings.EquipmentStatus equipmentStatus2;
        C634611 r0 = new AbsJoinLobbyIntercept<ax>() {
            /* class com.ss.android.vc.meeting.module.xiaomivoip.C63460a.C634611 */

            /* renamed from: a */
            public void onLobbySuccess(ax axVar) {
                C60700b.m235851b("XiaoMiVoipManager", "[acceptVideoChat]", "onLobbySuccess = " + axVar.toString());
                ak.m249761a("accept", axVar.f152663a);
                VideoChatService.m249602d().asyncCheckAndInit(new XiaoMiVoipManager$1$1(this, axVar));
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(true);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("XiaoMiVoipManager", "[acceptVideoChat3]", "error = " + eVar.toString());
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            /* renamed from: b */
            public void onNoLobbySuccess(ax axVar) {
                C60700b.m235851b("XiaoMiVoipManager", "[acceptVideoChat2]", "onNoLobbySuccess = " + axVar.f152663a.toString());
                MeetingAudioManager.m239471k().mo212694b(true);
                VideoChat.ExtraInfo extraInfo = new VideoChat.ExtraInfo();
                extraInfo.ignoreFor1v1 = true;
                extraInfo.isVoiceOnly = true;
                axVar.f152663a.setExtraInfo(extraInfo);
                ak.m249761a("accept", axVar.f152663a);
                VideoChatService.m249602d().asyncCheckAndInit(new XiaoMiVoipManager$1$2(this, axVar));
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(true);
                }
            }
        };
        VideoChatService.m249602d().asyncCheckAndInit(null);
        VideoChat.UpdateVideoChatAction updateVideoChatAction = VideoChat.UpdateVideoChatAction.ACCEPT;
        if (C60788y.m236250b(context)) {
            equipmentStatus = ParticipantSettings.EquipmentStatus.NORMAL;
        } else {
            equipmentStatus = ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        if (C60788y.m236247a(context)) {
            equipmentStatus2 = ParticipantSettings.EquipmentStatus.NORMAL;
        } else {
            equipmentStatus2 = ParticipantSettings.EquipmentStatus.NO_PERMISSION;
        }
        VcBizSender.m249138a(updateVideoChatAction.getNumber(), str, null, false, true, equipmentStatus, equipmentStatus2, updateVideoChatAction, VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis()).mo219893b(r0);
    }

    /* renamed from: a */
    private void m248691a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, XiaoMiVoipLaunchActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("action", str2);
        intent.putExtra(ShareHitPoint.f121869d, str3);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public boolean mo219567a(Context context, String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            C60700b.m235851b("XiaoMiVoipManager", "[handleXiaoMiVoip]", "return false, param is empty");
            return false;
        }
        C60700b.m235851b("XiaoMiVoipManager", "[handleXiaoMiVoip2]", "meetingId = " + str + ", action = " + str2 + ", type = " + str3 + ", interactiveId = " + str4);
        this.f160315b = str2;
        this.f160314a.add(str4);
        if ("accept".equals(str2)) {
            C60700b.m235851b("XiaoMiVoipManager", "[handleXiaoMiVoip3]", "accept " + str);
            if (this.f160316c) {
                mo219565a(context, str, null);
                return false;
            }
            m248691a(context, str, str2, str3);
            return true;
        } else if ("hangup".equals(str2)) {
            C60700b.m235851b("XiaoMiVoipManager", "[handleXiaoMiVoip5]", "hangup " + str);
            m248692a(str);
            return false;
        } else {
            C60700b.m235851b("XiaoMiVoipManager", "[handleXiaoMiVoip6]", str2 + " " + str + ", type = " + str3);
            return false;
        }
    }
}
