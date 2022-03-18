package com.ss.android.vc.meeting.module.sharebox;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61293a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.meeting.module.sharebox.AbstractC63022a;
import com.ss.android.vc.statistics.event.C63766o;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.module.sharebox.o */
public class C63053o extends AbstractC63022a {

    /* renamed from: a */
    private List<AbstractC63022a.AbstractC63023a> f158907a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private AtomicBoolean f158908b = new AtomicBoolean(true);

    /* renamed from: c */
    private final AbstractC61293a f158909c;

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a
    /* renamed from: c */
    public boolean mo217757c() {
        return this.f158908b.get();
    }

    /* renamed from: g */
    private void m246961g() {
        C60700b.m235851b("ShareBoxControl@", "[showPrepareToSharePage]", "showPrepareToSharePage");
        for (AbstractC63022a.AbstractC63023a aVar : this.f158907a) {
            aVar.bZ_();
        }
    }

    /* renamed from: h */
    private void m246962h() {
        C60700b.m235851b("ShareBoxControl@", "[showStopSharePage]", "showStopSharePage");
        for (AbstractC63022a.AbstractC63023a aVar : this.f158907a) {
            aVar.mo217762r();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a
    /* renamed from: e */
    public void mo217759e() {
        if (this.mMeeting != null && this.mMeeting.aj() != null) {
            C60700b.m235851b("ShareBoxControl@", "[stopShareBox]", "stopShareBox");
            this.mMeeting.aj().mo216414d();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a
    /* renamed from: a */
    public boolean mo217754a() {
        if (this.mMeeting == null || this.mMeeting.aj() == null) {
            return false;
        }
        return this.mMeeting.aj().mo216408a();
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a
    /* renamed from: d */
    public void mo217758d() {
        if (this.mMeeting != null && this.mMeeting.aj() != null) {
            C60700b.m235851b("ShareBoxControl@", "[startShareBo]", "startShareBox");
            C63766o.m250328b(this.mMeeting.mo212056e(), this.mMeeting.mo212093K());
            this.mMeeting.aj().mo216412c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a
    /* renamed from: f */
    public void mo217760f() {
        C60700b.m235851b("ShareBoxControl@", "[updateSharePage]", "showShareBoxPage isSharing= " + mo217754a());
        if (mo217754a()) {
            m246962h();
        } else {
            m246961g();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a
    /* renamed from: b */
    public boolean mo217756b() {
        VideoChatSettings videoChatSettings;
        if (this.mMeeting == null || this.mMeeting.mo212056e() == null || (videoChatSettings = this.mMeeting.mo212056e().getVideoChatSettings()) == null || videoChatSettings.getSubType() != VideoChatSettings.SubType.SCREEN_SHARE || !videoChatSettings.isBoxSharing()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a
    /* renamed from: a */
    public void mo217753a(boolean z) {
        this.f158908b.set(z);
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a
    /* renamed from: b */
    public void mo217755b(AbstractC63022a.AbstractC63023a aVar) {
        C60700b.m235851b("ShareBoxControl@", "[removeBoxListener]", "removeBoxListener");
        this.f158907a.remove(aVar);
    }

    @Override // com.ss.android.vc.meeting.module.sharebox.AbstractC63022a
    /* renamed from: a */
    public void mo217752a(AbstractC63022a.AbstractC63023a aVar) {
        C60700b.m235851b("ShareBoxControl@", "[addBoxListener]", "addBoxListener");
        this.f158907a.add(aVar);
    }

    public C63053o(C61303k kVar) {
        super(kVar);
        C630541 r3 = new AbstractC61293a() {
            /* class com.ss.android.vc.meeting.module.sharebox.C63053o.C630541 */

            @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
            /* renamed from: b */
            public void mo211757b() {
                if (C63053o.this.mo217756b()) {
                    C63053o.this.mMeeting.ah().mo219482b();
                }
            }
        };
        this.f158909c = r3;
        this.mMeeting.mo212046a(new AbstractC61288e() {
            /* class com.ss.android.vc.meeting.module.sharebox.$$Lambda$o$7uCCx17gAYXo3PPWxVx7ol_41s */

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e
            public final void meetingStateChanged(VideoChat videoChat, StatusNode statusNode) {
                C63053o.this.m246960b(videoChat, statusNode);
            }
        });
        this.mMeeting.mo212164x().mo211751a(r3);
        this.mMeeting.mo212046a(new AbstractC61288e() {
            /* class com.ss.android.vc.meeting.module.sharebox.$$Lambda$o$Wxz3f99x511YI5cOoJmelKtgdhE */

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e
            public final void meetingStateChanged(VideoChat videoChat, StatusNode statusNode) {
                C63053o.this.m246959a(videoChat, statusNode);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246959a(VideoChat videoChat, StatusNode statusNode) {
        if (statusNode == StatusNode.Idle) {
            this.mMeeting.mo212164x().mo211761b(this.f158909c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m246960b(VideoChat videoChat, StatusNode statusNode) {
        C60700b.m235851b("ShareBoxControl@", "[onStatusChange]", "meeting status changed: " + statusNode);
        if (statusNode == StatusNode.Idle) {
            mo217753a(false);
        }
    }
}
