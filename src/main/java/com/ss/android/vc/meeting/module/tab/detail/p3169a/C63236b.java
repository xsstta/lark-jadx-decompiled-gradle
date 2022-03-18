package com.ss.android.vc.meeting.module.tab.detail.p3169a;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ChannelMeta;
import com.ss.android.vc.entity.GrootCell;
import com.ss.android.vc.entity.PushGrootCells;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.entity.response.C60960af;
import com.ss.android.vc.entity.response.C60972f;
import com.ss.android.vc.entity.response.PushGrootChannelStatusEntity;
import com.ss.android.vc.entity.tab.FollowAbbrInfo;
import com.ss.android.vc.entity.tab.HistoryInfo;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCTabDetailItemChangeEvent;
import com.ss.android.vc.entity.tab.VCTabHistoryCommonInfo;
import com.ss.android.vc.entity.tab.VCTabMeetingChangeInfo;
import com.ss.android.vc.entity.tab.VCTabMeetingGrootCellPayload;
import com.ss.android.vc.entity.tab.VCTabRecordInfo;
import com.ss.android.vc.entity.tab.VCTabUserChangeType;
import com.ss.android.vc.entity.tab.VCTabUserGrootCellPayload;
import com.ss.android.vc.entity.tab.VcTabDetailInfo;
import com.ss.android.vc.entity.tab.VcTabDetailResponse;
import com.ss.android.vc.meeting.module.tab.detail.VcTabDetailEntryParam;
import com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a;
import com.ss.android.vc.meeting.module.tab.widgets.C63317b;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.vc.meeting.module.tab.detail.a.b */
public class C63236b extends BaseModel implements C63230a.AbstractC63231a, VideoChatPush.AbstractC63568h {

    /* renamed from: a */
    public final String f159430a;

    /* renamed from: b */
    public final String f159431b;

    /* renamed from: c */
    public int f159432c = Integer.MIN_VALUE;

    /* renamed from: d */
    private final VcTabDetailEntryParam f159433d;

    /* renamed from: e */
    private C63230a.AbstractC63234b f159434e;

    /* renamed from: f */
    private VideoChatPush.AbstractC63563c f159435f;

    /* renamed from: g */
    private VideoChatPush.AbstractC63564d f159436g;

    /* renamed from: h */
    private VideoChatPush.AbstractC63564d f159437h;

    /* renamed from: i */
    private final String f159438i;

    /* renamed from: j */
    private final boolean f159439j;

    /* renamed from: k */
    private final String f159440k;

    /* renamed from: l */
    private int f159441l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f159442m = Integer.MIN_VALUE;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63231a
    /* renamed from: a */
    public String mo218853a() {
        return this.f159433d.getUserId();
    }

    /* renamed from: c */
    public void mo218902c() {
        VcBizService.grootCloseChannel(ChannelMeta.GrootChannel.VC_TAB_MEETING_CHANNEL, this.f159430a, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63236b.C632404 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VcTabDetailModel", "[closeChannel2]", "VC_TAB_MEETING_CHANNEL onError:" + eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60972f fVar = (C60972f) obj;
                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[closeChannel]", "VC_TAB_MEETING_CHANNEL onSuccess response=" + fVar);
                PushGrootChannelStatusEntity pushGrootChannelStatusEntity = fVar.f152686a;
            }
        });
    }

    /* renamed from: d */
    private void m247688d() {
        if (this.f159435f != null) {
            VideoChatPush.m249004a().mo219735b(this.f159435f);
            this.f159435f = null;
        }
    }

    /* renamed from: b */
    public void mo218898b() {
        if (this.f159435f == null) {
            this.f159435f = new VideoChatPush.AbstractC63563c() {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.$$Lambda$b$tp9DBDs_ktE0PMLXSKcbrJIU39s */

                @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63563c
                public final void onPushGrootCells(PushGrootCells pushGrootCells) {
                    C63236b.this.m247682a((C63236b) pushGrootCells);
                }
            };
            VideoChatPush.m249004a().mo219712a(this.f159435f);
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        mo218902c();
        C63317b.m248020b().mo219107d();
        C63317b.m248020b().mo219109e();
        m247688d();
        m247687c(this.f159430a);
        m247689d(this.f159431b);
        VideoChatPush.m249004a().mo219739b(this);
        super.destroy();
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63231a
    /* renamed from: a */
    public void mo218854a(C63230a.AbstractC63231a.AbstractC63232a<VcTabDetailInfo> aVar) {
        mo218899b(aVar);
    }

    /* renamed from: a */
    public void mo218896a(int i) {
        VcBizService.grootOpenChannel(ChannelMeta.GrootChannel.VC_TAB_MEETING_CHANNEL, this.f159430a, i, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63236b.C632393 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VcTabDetailModel", "[openChannel2]", "VC_TAB_MEETING_CHANNEL onError:" + eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C63236b bVar = C63236b.this;
                bVar.mo218897a(bVar.f159430a);
                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[openChannel]", "VC_TAB_MEETING_CHANNEL onSuccess, response=" + ((C60960af) obj));
            }
        });
    }

    /* renamed from: c */
    private void m247687c(String str) {
        if (!TextUtils.isEmpty(str) && this.f159436g != null) {
            VideoChatPush.m249004a().mo219753b(str, this.f159436g);
            this.f159436g = null;
        }
    }

    @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63568h
    /* renamed from: a */
    public void mo211349a(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
        this.f159434e.mo218864a(vCMeetingJoinInfoEntity);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m247682a(PushGrootCells pushGrootCells) {
        if (pushGrootCells.channel_meta == null) {
            C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushGrootCells]", "channel_meta is null");
        } else if (pushGrootCells.channel_meta.grootChannel == ChannelMeta.GrootChannel.VC_TAB_USER_CHANNEL) {
            m247684b(pushGrootCells);
        } else if (pushGrootCells.channel_meta.grootChannel == ChannelMeta.GrootChannel.VC_TAB_MEETING_CHANNEL) {
            m247686c(pushGrootCells);
        }
    }

    /* renamed from: d */
    private void m247689d(String str) {
        if (!TextUtils.isEmpty(str) && this.f159437h != null) {
            VideoChatPush.m249004a().mo219753b(str, this.f159437h);
            this.f159437h = null;
        }
    }

    C63236b(VcTabDetailEntryParam vcTabDetailEntryParam) {
        C60700b.m235843a("VideoChatTab_VcTabDetailModel", "[VcTabDetailModel]", "parameter is " + vcTabDetailEntryParam);
        this.f159433d = vcTabDetailEntryParam;
        this.f159430a = vcTabDetailEntryParam.getMeetingId();
        this.f159438i = vcTabDetailEntryParam.getHistoryId();
        this.f159440k = vcTabDetailEntryParam.getUserId();
        this.f159439j = vcTabDetailEntryParam.isTryLocal().booleanValue();
        this.f159431b = VideoChatModuleDependency.m236630c();
    }

    /* renamed from: b */
    public void mo218899b(final C63230a.AbstractC63231a.AbstractC63232a<VcTabDetailInfo> aVar) {
        String id = TimeZone.getDefault().getID();
        C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[fetchDetailTabInfo]", ", historyId is " + this.f159438i + ", timeZone is " + TimeZone.getDefault().getID() + ", isTryLocal is " + this.f159439j);
        VcBizService.getVcTabDetailInfo(this.f159438i, id, this.f159439j, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63236b.C632371 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VcTabDetailModel", "[fetchDetailTabInfo4]", "onError:" + eVar);
                aVar.mo218858a(eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                VcTabDetailResponse gVar = (VcTabDetailResponse) obj;
                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[fetchDetailTabInfo2]", "success, response:" + gVar);
                if (gVar == null || C60742af.m236059a(gVar.mo210448a()) || gVar.mo210448a().get(0) == null || gVar.mo210448a().get(0).getMeetingBaseInfo() == null) {
                    C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[fetchDetailTabInfo3]", "VcTabDetailInfos is empty");
                    aVar.mo218857a();
                    return;
                }
                int downVersion = gVar.mo210448a().get(0).getMeetingBaseInfo().getDownVersion();
                int version = gVar.mo210448a().get(0).getMeetingUserSpecInfo().getVersion();
                C63236b.this.mo218896a(downVersion);
                C63236b bVar = C63236b.this;
                bVar.mo218901b(bVar.f159431b);
                VideoChatPush.m249004a().mo219716a(C63236b.this);
                ArrayList arrayList = new ArrayList();
                for (VcTabDetailInfo vcTabDetailInfo : gVar.mo210448a()) {
                    if (!(vcTabDetailInfo == null || vcTabDetailInfo.getMeetingUserSpecInfo() == null)) {
                        C63236b.this.f159432c = vcTabDetailInfo.getMeetingUserSpecInfo().getVersion();
                        if (!C60742af.m236059a(vcTabDetailInfo.getMeetingUserSpecInfo().getHistoryInfos())) {
                            arrayList.addAll(vcTabDetailInfo.getMeetingUserSpecInfo().getHistoryInfos());
                        }
                    }
                }
                C63317b.m248020b().mo219103b(version);
                C63236b.this.mo218898b();
                C63317b.m248020b().mo219110f();
                gVar.mo210448a().get(0).getMeetingUserSpecInfo().setHistoryInfos(arrayList);
                aVar.mo218859a(gVar.mo210448a().get(0));
            }
        });
    }

    /* renamed from: c */
    private void m247686c(PushGrootCells pushGrootCells) {
        VCTabMeetingGrootCellPayload dVar;
        if (!TextUtils.equals(pushGrootCells.channel_meta.channelId, this.f159430a)) {
            C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushMeetingGrootCells]", "meetingId is different, channelId:" + pushGrootCells.channel_meta.channelId + ", mMeetingId:" + this.f159430a);
        } else if (!CollectionUtils.isEmpty(pushGrootCells.cells)) {
            Iterator<GrootCell> it = pushGrootCells.cells.iterator();
            while (it.hasNext() && (dVar = it.next().vcTabMeetingGrootCellPayload) != null && !C60742af.m236059a(dVar.mo210428a())) {
                VCTabHistoryCommonInfo cVar = null;
                List<VCParticipantAbbrInfo> list = null;
                for (VCTabMeetingChangeInfo vCTabMeetingChangeInfo : dVar.mo210428a()) {
                    if (vCTabMeetingChangeInfo.getChangeType() == VCTabMeetingChangeInfo.ChangeType.MEETING) {
                        cVar = vCTabMeetingChangeInfo.getHistoryCommonInfo();
                    } else if (vCTabMeetingChangeInfo.getChangeType() == VCTabMeetingChangeInfo.ChangeType.PARTICIPANT) {
                        list = vCTabMeetingChangeInfo.getParticipants();
                    }
                }
                if (cVar != null) {
                    C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushMeetingGrootCells2]", "HistoryCommonInfo:" + cVar);
                    this.f159434e.mo218867a(cVar);
                }
                if (list != null) {
                    C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushMeetingGrootCells3]", "ParticipantChanged:" + list);
                    this.f159434e.mo218871a(list);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63231a
    /* renamed from: a */
    public void mo218855a(C63230a.AbstractC63231a.AbstractC63233b<Object> bVar) {
        mo218900b(bVar);
    }

    /* renamed from: b */
    public void mo218900b(final C63230a.AbstractC63231a.AbstractC63233b<Object> bVar) {
        String id = TimeZone.getDefault().getID();
        String language = VideoChatModule.getDependency().getLanguageDependency().getLanguageSetting().getLanguage();
        boolean z = !VideoChatModule.getDependency().getSettingDependency().is24Hour();
        C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[createVCTabMeetingStatisticsInfo]", "meetingId is " + this.f159430a + ", timeZone is " + TimeZone.getDefault().getID() + ", isTwelveHourTime is " + z + ", locale is " + language);
        VcBizService.createVcTabMeetingStatisticsInfo(this.f159430a, id, z, language, new AbstractC63598b<Object>() {
            /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.C63236b.C632382 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                bVar.mo218861a(obj);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VcTabDetailModel", "[createVcTabMeetingStatisticsInfo2]", "onError:" + eVar);
                bVar.mo218860a(eVar);
            }
        });
    }

    /* renamed from: b */
    private void m247684b(PushGrootCells pushGrootCells) {
        if (!TextUtils.equals(pushGrootCells.channel_meta.channelId, this.f159431b)) {
            C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells]", "uid is different, channelId:" + pushGrootCells.channel_meta.channelId + ", mMyselfUserId:" + this.f159431b);
        } else if (!CollectionUtils.isEmpty(pushGrootCells.cells)) {
            for (GrootCell grootCell : pushGrootCells.cells) {
                VCTabUserGrootCellPayload vCTabUserGrootCellPayload = grootCell.vcTabUserGrootCellPayload;
                for (VCTabDetailItemChangeEvent vCTabDetailItemChangeEvent : vCTabUserGrootCellPayload.getChangeEvents()) {
                    if (vCTabDetailItemChangeEvent.getVersion() <= this.f159441l || vCTabDetailItemChangeEvent.getVersion() <= this.f159432c) {
                        C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells2]", "version invalid: hisAndRecPushVersion " + this.f159441l + ", eventVersion " + vCTabDetailItemChangeEvent.getVersion());
                    } else {
                        this.f159441l = vCTabDetailItemChangeEvent.getVersion();
                        if (TextUtils.equals(vCTabDetailItemChangeEvent.getMeetingId(), this.f159430a)) {
                            VCTabRecordInfo recordInfo = vCTabDetailItemChangeEvent.getRecordInfo();
                            if (recordInfo != null) {
                                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells3]", "RecordChanged:" + recordInfo);
                                this.f159434e.mo218865a(recordInfo);
                            }
                            List<FollowAbbrInfo> followInfo = vCTabDetailItemChangeEvent.getFollowInfo();
                            if (!C60742af.m236059a(followInfo)) {
                                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells4]", "FollowInfo:" + followInfo);
                                this.f159434e.mo218877c(followInfo);
                            }
                            List<HistoryInfo> replaceAllHistory = vCTabDetailItemChangeEvent.getReplaceAllHistory();
                            if (!C60742af.m236059a(replaceAllHistory)) {
                                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells5]", "ReplaceAllHistoryInfo:" + replaceAllHistory);
                                this.f159434e.mo218874b(replaceAllHistory);
                            } else {
                                HistoryInfo historyInfo = vCTabDetailItemChangeEvent.getHistoryInfo();
                                if (historyInfo != null) {
                                    C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells6]", "InteractionHistoryInfo:" + historyInfo);
                                    this.f159434e.mo218863a(historyInfo);
                                }
                            }
                        }
                    }
                }
                if (vCTabUserGrootCellPayload.getChangeType() != null && vCTabUserGrootCellPayload.getChangeType().getNumber() == VCTabUserChangeType.STATISTICS.getNumber() && vCTabUserGrootCellPayload.getStatisticsInfo() != null && C60733aa.m235990a(vCTabUserGrootCellPayload.getStatisticsInfo().mo210436d(), this.f159430a) && vCTabUserGrootCellPayload.getStatisticsInfo().mo210437e() != null && vCTabUserGrootCellPayload.getStatisticsInfo().mo210437e().intValue() > this.f159432c && vCTabUserGrootCellPayload.getStatisticsInfo().mo210437e().intValue() > this.f159442m) {
                    this.f159442m = vCTabUserGrootCellPayload.getStatisticsInfo().mo210437e().intValue();
                    this.f159434e.mo218868a(vCTabUserGrootCellPayload.getStatisticsInfo());
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a.AbstractC63231a
    /* renamed from: a */
    public void mo218856a(C63230a.AbstractC63234b bVar) {
        this.f159434e = bVar;
    }

    /* renamed from: a */
    public void mo218897a(String str) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235843a("VideoChatTab_VcTabDetailModel", "[registerMeetingGrootChannelStatusListener]", "failed because channelId is null.");
            return;
        }
        if (this.f159436g == null) {
            this.f159436g = new VideoChatPush.AbstractC63564d(str) {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.$$Lambda$b$vgdmO7WBJrizbD06iaCmOuERChc */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void onPushGrootChannelStatus(PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
                    C63236b.m247685b(this.f$0, pushGrootChannelStatusEntity);
                }
            };
        }
        VideoChatPush.m249004a().mo219730a(str, this.f159436g);
    }

    /* renamed from: b */
    public void mo218901b(String str) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235843a("VideoChatTab_VcTabDetailModel", "[registerUserGrootChannelStatusListener]", "failed because channelId is null.");
            return;
        }
        if (this.f159437h == null) {
            this.f159437h = new VideoChatPush.AbstractC63564d(str) {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3169a.$$Lambda$b$7wq3LsNzuXoGlybp20Wlk9Udc */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void onPushGrootChannelStatus(PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
                    C63236b.m247683a(this.f$0, pushGrootChannelStatusEntity);
                }
            };
        }
        VideoChatPush.m249004a().mo219730a(str, this.f159437h);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m247685b(String str, PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
        C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushMeetingGrootChannelStatus]", "channelId: " + str + ", status:" + pushGrootChannelStatusEntity.f152610b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m247683a(String str, PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
        C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootChannelStatus]", "channelId: " + str + ", status:" + pushGrootChannelStatusEntity.f152610b);
    }
}
