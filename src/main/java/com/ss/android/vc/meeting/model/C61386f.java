package com.ss.android.vc.meeting.model;

import android.text.TextUtils;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.foregroundservice.ForegroundService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.model.f */
public class C61386f {

    /* renamed from: a */
    private C61303k f153885a;

    /* renamed from: b */
    private List<AbstractC61387a> f153886b = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.vc.meeting.model.f$a */
    public interface AbstractC61387a {
        /* renamed from: a */
        void mo212586a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m239326c() {
        for (AbstractC61387a aVar : this.f153886b) {
            aVar.mo212586a();
        }
    }

    /* renamed from: a */
    private void m239324a() {
        C60700b.m235851b("MeetingUpgradeProcessor", "[meetingUpgrade]", "upgrade");
        C61303k kVar = this.f153885a;
        if (kVar == null) {
            C60700b.m235851b("MeetingUpgradeProcessor", "[meetingUpgrade2]", "meeting is null,then return");
            return;
        }
        VideoChat e = kVar.mo212056e();
        if (e != null) {
            e.setType(VideoChat.Type.MEET);
            this.f153885a.mo212151b(e);
            this.f153885a.mo212080a(VideoChat.Type.MEET);
        }
    }

    public C61386f(C61303k kVar) {
        this.f153885a = kVar;
    }

    /* renamed from: a */
    public void mo212584a(AbstractC61387a aVar) {
        if (!this.f153886b.contains(aVar)) {
            this.f153886b.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo212585b(AbstractC61387a aVar) {
        if (this.f153886b.contains(aVar)) {
            this.f153886b.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo212583a(VideoChatInMeetingInfo videoChatInMeetingInfo, VideoChatInMeetingInfo videoChatInMeetingInfo2) {
        if (videoChatInMeetingInfo != null && !TextUtils.isEmpty(videoChatInMeetingInfo.getId()) && videoChatInMeetingInfo.getType() != VideoChat.Type.MEET && videoChatInMeetingInfo2.getType() == VideoChat.Type.MEET) {
            m239324a();
            C26171w.m94675a(new Runnable() {
                /* class com.ss.android.vc.meeting.model.$$Lambda$f$r2Lzw74s6Dd0E4Z_vHaGW_kEAU */

                public final void run() {
                    C61386f.this.m239326c();
                }
            });
            ForegroundService.m241663a();
        }
    }
}
