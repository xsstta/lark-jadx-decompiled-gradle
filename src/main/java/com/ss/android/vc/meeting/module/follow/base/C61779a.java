package com.ss.android.vc.meeting.module.follow.base;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ChannelMeta;
import com.ss.android.vc.entity.GrootCell;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.PushGrootCells;
import com.ss.android.vc.entity.follow.FollowGrootCellPayload;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.follow.FollowPatch;
import com.ss.android.vc.entity.follow.FollowState;
import com.ss.android.vc.entity.follow.FollowStrategy;
import com.ss.android.vc.entity.response.C60961ag;
import com.ss.android.vc.entity.response.C60972f;
import com.ss.android.vc.entity.response.PushGrootChannelStatusEntity;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.statistics.event.C63772u;
import com.ss.android.vc.statistics.event.C63774v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.base.a */
public class C61779a {

    /* renamed from: a */
    public List<FollowState> f155058a;

    /* renamed from: b */
    public C61303k f155059b;

    /* renamed from: c */
    private VideoChatPush.AbstractC63564d f155060c;

    /* renamed from: d */
    private VideoChatPush.AbstractC63563c f155061d;

    /* renamed from: e */
    private FollowInfo f155062e;

    /* renamed from: f */
    private String f155063f;

    /* renamed from: g */
    private List<FollowState> f155064g;

    /* renamed from: b */
    private String m241354b() {
        if (TextUtils.isEmpty(this.f155063f)) {
            this.f155063f = C57859q.m224565a("" + ParticipantType.LARK_USER.getNumber() + VideoChatUserService.getCurrentUser().getId() + VideoChatModuleDependency.m236629b());
        }
        return this.f155063f;
    }

    /* renamed from: a */
    public void mo214045a() {
        AbstractC61784b d;
        C61303k kVar = this.f155059b;
        if (kVar != null && kVar.aE().mo208293c() && (d = this.f155059b.ab().mo213877d()) != null && this.f155059b.aE().mo208292b() && this.f155064g != null) {
            C60700b.m235851b("FollowLog_FollowGrootControl", "[resumeFollowState]", "");
            d.mo214004b(this.f155064g);
            this.f155064g = null;
        }
    }

    public C61779a(C61303k kVar) {
        this.f155059b = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m241352a(PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
        C60700b.m235851b("FollowLog_FollowGrootControl", "[registerGrootChannelStatusListener]", "onPushGrootChannelStatus: " + pushGrootChannelStatusEntity);
    }

    /* renamed from: b */
    private void m241355b(String str) {
        if (!TextUtils.isEmpty(str) && this.f155061d != null) {
            VideoChatPush.m249004a().mo219735b(this.f155061d);
            this.f155061d = null;
        }
    }

    /* renamed from: c */
    private void m241356c(String str) {
        if (!TextUtils.isEmpty(str)) {
            VcBizService.grootCloseChannel(ChannelMeta.GrootChannel.FOLLOW, str, new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.follow.base.C61779a.C617834 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    PushGrootChannelStatusEntity pushGrootChannelStatusEntity = ((C60972f) obj).f152686a;
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("FollowLog_FollowGrootControl", "[closeGrootChannel]", "error: " + eVar.toString());
                }
            });
        }
    }

    /* renamed from: c */
    public void mo214049c(FollowInfo followInfo) {
        if (followInfo != null && !TextUtils.isEmpty(followInfo.getShareId())) {
            C60700b.m235851b("FollowLog_FollowGrootControl", "[destroyChannel]", String.format("destroyChannel shareId= %s", followInfo.getShareId()));
            m241353a(followInfo.getShareId());
            m241355b(followInfo.getShareId());
            m241356c(followInfo.getShareId());
            this.f155062e = null;
        }
    }

    /* renamed from: d */
    public void mo214050d(FollowInfo followInfo) {
        if (followInfo != null && !TextUtils.isEmpty(followInfo.getShareId())) {
            if (this.f155060c == null) {
                this.f155060c = $$Lambda$a$CJPe8T7WYPCNzCuYU0VoOd7yhmo.INSTANCE;
            }
            VideoChatPush.m249004a().mo219730a(followInfo.getShareId(), this.f155060c);
        }
    }

    /* renamed from: e */
    public void mo214051e(FollowInfo followInfo) {
        if (followInfo != null && !TextUtils.isEmpty(followInfo.getShareId())) {
            if (this.f155061d == null) {
                this.f155061d = new VideoChatPush.AbstractC63563c(followInfo) {
                    /* class com.ss.android.vc.meeting.module.follow.base.$$Lambda$a$YVO0CS2OK23gllowftybFw7XdIU */
                    public final /* synthetic */ FollowInfo f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63563c
                    public final void onPushGrootCells(PushGrootCells pushGrootCells) {
                        C61779a.this.m241350a((C61779a) this.f$1, (FollowInfo) pushGrootCells);
                    }
                };
            }
            VideoChatPush.m249004a().mo219712a(this.f155061d);
            C60700b.m235851b("FollowLog_FollowGrootControl", "[registerGrootCellsListener]", "success. follow shareId: " + followInfo.getShareId());
        }
    }

    /* renamed from: b */
    public void mo214048b(FollowInfo followInfo) {
        String str;
        if (followInfo != null && !TextUtils.isEmpty(followInfo.getShareId())) {
            String shareId = followInfo.getShareId();
            FollowInfo followInfo2 = this.f155062e;
            if (followInfo2 != null) {
                str = followInfo2.getShareId();
            } else {
                str = "";
            }
            C60700b.m235851b("FollowLog_FollowGrootControl", "[updateChannel]", String.format("updateChannel new_shareId= %s old_shareId= %s", shareId, str));
            if (!TextUtils.equals(shareId, str)) {
                mo214049c(this.f155062e);
                mo214046a(followInfo);
            }
        }
    }

    /* renamed from: a */
    private void m241353a(String str) {
        if (!TextUtils.isEmpty(str) && this.f155060c != null) {
            VideoChatPush.m249004a().mo219753b(str, this.f155060c);
            this.f155060c = null;
        }
    }

    /* renamed from: a */
    public void mo214046a(final FollowInfo followInfo) {
        if (followInfo != null && !TextUtils.isEmpty(followInfo.getShareId())) {
            C60700b.m235851b("FollowLog_FollowGrootControl", "[openChannel]", String.format("openChannel shareId= %s", followInfo.getShareId()));
            this.f155062e = followInfo;
            final AbstractC61784b d = this.f155059b.ab().mo213877d();
            m241351a(followInfo, this.f155059b.mo212055d(), new AbstractC63598b<Integer>() {
                /* class com.ss.android.vc.meeting.module.follow.base.C61779a.C617801 */

                /* renamed from: a */
                public void onSuccess(Integer num) {
                    AbstractC61784b bVar = d;
                    if (bVar == null || bVar.mo214040s().f155054c.get()) {
                        C60700b.m235851b("FollowLog_FollowGrootControl", "[pullAllFollowStates]", "success return");
                        return;
                    }
                    C60700b.m235851b("FollowLog_FollowGrootControl", "[pullAllFollowStates1]", "success register");
                    C61779a.this.mo214050d(followInfo);
                    C61779a.this.mo214051e(followInfo);
                    C61779a.this.mo214047a(followInfo, num.intValue());
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    if (eVar == null) {
                        C60700b.m235864f("FollowLog_FollowGrootControl", "[pullAllFollowStates2]", "is just browse sub link");
                    } else if (eVar.f160600c) {
                    } else {
                        if (C61779a.this.f155059b.ab().mo213889o()) {
                            C60738ac.m236037c((int) R.string.View_VM_CouldNotLoadTryReloading);
                        } else {
                            C60738ac.m236037c((int) R.string.View_VM_UnableToFollowPresenter);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private FollowStrategy m241349a(FollowInfo followInfo, String str) {
        if (!(followInfo == null || followInfo.getStrategies() == null || followInfo.getStrategies().size() == 0 || TextUtils.isEmpty(str))) {
            for (FollowStrategy followStrategy : followInfo.getStrategies()) {
                if (str.equals(followStrategy.getId())) {
                    return followStrategy;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241350a(FollowInfo followInfo, PushGrootCells pushGrootCells) {
        List<FollowPatch> followPatches;
        AbstractC61784b d = this.f155059b.ab().mo213877d();
        String shareId = followInfo.getShareId();
        ChannelMeta channelMeta = pushGrootCells.channel_meta;
        if (!this.f155059b.ab().mo213880f() || channelMeta == null || !TextUtils.equals(channelMeta.channelId, shareId)) {
            C60700b.m235851b("FollowLog_FollowGrootControl", "[onPushGrootCells]", "invalid, shareId= " + shareId);
        } else if (pushGrootCells.cells != null && pushGrootCells.cells.size() != 0) {
            C60700b.m235851b("FollowLog_FollowGrootControl", "[onPushGrootCells2]", "grootCells.cell size= " + pushGrootCells.cells.size());
            for (GrootCell grootCell : pushGrootCells.cells) {
                if (grootCell.action == GrootCell.Action.SERVER_SET || grootCell.action == GrootCell.Action.TRIGGER) {
                    FollowGrootCellPayload followGrootCellPayload = grootCell.followGrootCellPayload;
                    if (followGrootCellPayload == null) {
                        return;
                    }
                    if (followGrootCellPayload.getType() == FollowGrootCellPayload.Type.STATES) {
                        List<FollowState> followStates = followGrootCellPayload.getFollowStates();
                        if (followStates != null && followStates.size() > 0) {
                            FollowState followState = followStates.get(0);
                            FollowStrategy a = m241349a(followInfo, followState.getStrategyId());
                            if (a != null && !m241354b().equals(followState.getSenderId())) {
                                if ((d != null && d.mo214040s().f155056e.get()) || a.isReceivingDataWhenNotFollowing()) {
                                    C63774v.m250391c();
                                    C61303k kVar = this.f155059b;
                                    if (kVar == null || !kVar.aE().mo208293c()) {
                                        if (d != null) {
                                            d.mo214004b(followStates);
                                        }
                                    } else if (d != null && this.f155059b.aE().mo208292b()) {
                                        d.mo214004b(followStates);
                                    }
                                    C61303k kVar2 = this.f155059b;
                                    if (kVar2 != null && kVar2.aE().mo208293c()) {
                                        this.f155064g = followStates;
                                    }
                                }
                            }
                        }
                    } else if (followGrootCellPayload.getType() == FollowGrootCellPayload.Type.PATCHES && (followPatches = followGrootCellPayload.getFollowPatches()) != null && followPatches.size() > 0) {
                        FollowPatch followPatch = followPatches.get(0);
                        FollowStrategy a2 = m241349a(followInfo, followPatch.getStrategyId());
                        if (a2 != null && !m241354b().equals(followPatch.getSenderId())) {
                            if ((d != null && d.mo214040s().f155056e.get()) || a2.isReceivingDataWhenNotFollowing()) {
                                C61303k kVar3 = this.f155059b;
                                if (kVar3 != null && kVar3.aE().mo208293c()) {
                                    mo214045a();
                                }
                                if (d != null) {
                                    d.mo214006c(followPatches);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo214047a(final FollowInfo followInfo, int i) {
        if (followInfo == null) {
            C60700b.m235851b("FollowLog_FollowGrootControl", "[openGrootChannel]", "failed.");
            return;
        }
        C63774v.m250381a();
        VcBizService.openFollowGrootChannel(ChannelMeta.GrootChannel.FOLLOW, followInfo.getShareId(), this.f155059b.mo212055d(), i, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.follow.base.C61779a.C617823 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235851b("FollowLog_FollowGrootControl", "[onOpenGrootChannel2]", "success ");
                C63772u.m250377a(C61779a.this.f155059b.mo212056e(), true, followInfo.getShareId(), C61806b.m241471a(followInfo));
                C63774v.m250385a(C61779a.this.f155059b.mo212056e(), followInfo);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("FollowLog_FollowGrootControl", "[openGrootChannel3]", "error: " + eVar.toString());
                if (!eVar.f160600c) {
                    if (C61806b.m241471a(followInfo)) {
                        C60738ac.m236037c((int) R.string.View_VM_CouldNotLoadTryReloading);
                    } else {
                        C60738ac.m236037c((int) R.string.View_VM_UnableToFollowPresenter);
                    }
                }
                C63772u.m250377a(C61779a.this.f155059b.mo212056e(), false, followInfo.getShareId(), C61806b.m241471a(followInfo));
                C63774v.m250385a(C61779a.this.f155059b.mo212056e(), followInfo);
            }
        });
    }

    /* renamed from: a */
    private void m241351a(FollowInfo followInfo, String str, final AbstractC63598b<Integer> bVar) {
        if (followInfo == null || TextUtils.isEmpty(followInfo.getShareId())) {
            if (bVar != null) {
                bVar.onError(null);
            }
        } else if (followInfo.getShareType() == FollowInfo.ShareType.UNIVERSAL) {
            VcBizSender.m249261d(followInfo.getShareId(), str).mo219889a(new AbstractC63598b<C60961ag>() {
                /* class com.ss.android.vc.meeting.module.follow.base.C61779a.C617812 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("FollowLog_FollowGrootControl", "[pullAllFollowStates]", "error = " + eVar.toString());
                    AbstractC63598b bVar = bVar;
                    if (bVar != null) {
                        bVar.onError(eVar);
                    }
                }

                /* renamed from: a */
                public void onSuccess(C60961ag agVar) {
                    C60700b.m235851b("FollowLog_FollowGrootControl", "[pullAllFollowStates]", "success = " + agVar.f152642b);
                    if (agVar.f152641a != null && agVar.f152641a.size() > 0) {
                        C61779a.this.f155058a = new ArrayList();
                        for (int i = 0; i < agVar.f152641a.size(); i++) {
                            C61779a.this.f155058a.add(agVar.f152641a.get(i));
                        }
                    }
                    AbstractC63598b bVar = bVar;
                    if (bVar != null) {
                        bVar.onSuccess(Integer.valueOf(agVar.f152642b));
                    }
                }
            });
        } else if (bVar != null) {
            bVar.onSuccess(-1);
        }
    }
}
