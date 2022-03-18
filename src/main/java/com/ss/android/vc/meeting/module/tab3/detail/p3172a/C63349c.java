package com.ss.android.vc.meeting.module.tab3.detail.p3172a;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60735ab;
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
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.entity.tab.VCTabMeetingChangeInfo;
import com.ss.android.vc.entity.tab.VCTabMeetingGrootCellPayload;
import com.ss.android.vc.entity.tab.VCTabRecordInfo;
import com.ss.android.vc.entity.tab.VCTabUserChangeType;
import com.ss.android.vc.entity.tab.VCTabUserGrootCellPayload;
import com.ss.android.vc.entity.tab.VcTabDetailBasicInfo;
import com.ss.android.vc.entity.tab.VcTabDetailInfo;
import com.ss.android.vc.entity.tab.VcTabDetailResponse;
import com.ss.android.vc.meeting.module.tab3.detail.VcTabDetailEntryParam;
import com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63389b;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.vc.meeting.module.tab3.detail.a.c */
public class C63349c extends BaseModel implements C63328a.AbstractC63329a, VideoChatPush.AbstractC63568h {

    /* renamed from: a */
    public C63328a.AbstractC63332b f159921a;

    /* renamed from: b */
    public final String f159922b;

    /* renamed from: c */
    public final String f159923c;

    /* renamed from: d */
    public int f159924d = Integer.MIN_VALUE;

    /* renamed from: e */
    private final VcTabDetailEntryParam f159925e;

    /* renamed from: f */
    private VideoChatPush.AbstractC63563c f159926f;

    /* renamed from: g */
    private VideoChatPush.AbstractC63564d f159927g;

    /* renamed from: h */
    private VideoChatPush.AbstractC63564d f159928h;

    /* renamed from: i */
    private final String f159929i;

    /* renamed from: j */
    private final boolean f159930j;

    /* renamed from: k */
    private final String f159931k;

    /* renamed from: l */
    private final String f159932l;

    /* renamed from: m */
    private int f159933m = Integer.MIN_VALUE;

    /* renamed from: n */
    private int f159934n = Integer.MIN_VALUE;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a
    /* renamed from: a */
    public String mo219167a() {
        return this.f159925e.getUserId();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a
    /* renamed from: b */
    public String mo219171b() {
        return this.f159925e.getTenantId();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a
    /* renamed from: c */
    public VCTabListItem.PhoneType mo219172c() {
        return this.f159925e.getPhoneType();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a
    /* renamed from: d */
    public String mo219173d() {
        return this.f159925e.getEnterprisePhoneNumber();
    }

    /* renamed from: f */
    public void mo219254f() {
        VcBizService.grootCloseChannel(ChannelMeta.GrootChannel.VC_TAB_MEETING_CHANNEL, this.f159922b, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63349c.C633534 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VcTabDetailModel", "[closeGrootChannel2]", "VC_TAB_MEETING_CHANNEL onError:" + eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60972f fVar = (C60972f) obj;
                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[closeGrootChannel]", "VC_TAB_MEETING_CHANNEL onSuccess response=" + fVar);
                PushGrootChannelStatusEntity pushGrootChannelStatusEntity = fVar.f152686a;
            }
        });
    }

    /* renamed from: g */
    private void m248210g() {
        if (this.f159926f != null) {
            VideoChatPush.m249004a().mo219735b(this.f159926f);
            this.f159926f = null;
        }
    }

    /* renamed from: e */
    public void mo219253e() {
        if (this.f159926f == null) {
            this.f159926f = new VideoChatPush.AbstractC63563c() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$c$voTYSCRjZrHBOhXQRDw6vHOIOYs */

                @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63563c
                public final void onPushGrootCells(PushGrootCells pushGrootCells) {
                    C63349c.lambda$voTYSCRjZrHBOhXQRDw6vHOIOYs(C63349c.this, pushGrootCells);
                }
            };
            VideoChatPush.m249004a().mo219712a(this.f159926f);
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        mo219254f();
        C63389b.m248367b().mo219368d();
        C63389b.m248367b().mo219370e();
        m248210g();
        m248208c(this.f159922b);
        m248209d(this.f159923c);
        VideoChatPush.m249004a().mo219739b(this);
        super.destroy();
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a
    /* renamed from: a */
    public void mo219168a(C63328a.AbstractC63329a.AbstractC63330a<VcTabDetailInfo> aVar) {
        mo219250b(aVar);
    }

    /* renamed from: a */
    public void mo219248a(int i) {
        VcBizService.grootOpenChannel(ChannelMeta.GrootChannel.VC_TAB_MEETING_CHANNEL, this.f159922b, i, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63349c.C633523 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VcTabDetailModel", "[openGrootChannel2]", "VC_TAB_MEETING_CHANNEL onError:" + eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C63349c cVar = C63349c.this;
                cVar.mo219249a(cVar.f159922b);
                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[openGrootChannel]", "VC_TAB_MEETING_CHANNEL onSuccess, response=" + ((C60960af) obj));
            }
        });
    }

    /* renamed from: c */
    private void m248208c(String str) {
        if (!TextUtils.isEmpty(str) && this.f159927g != null) {
            VideoChatPush.m249004a().mo219753b(str, this.f159927g);
            this.f159927g = null;
        }
    }

    /* renamed from: d */
    private void m248209d(String str) {
        if (!TextUtils.isEmpty(str) && this.f159928h != null) {
            VideoChatPush.m249004a().mo219753b(str, this.f159928h);
            this.f159928h = null;
        }
    }

    @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63568h
    /* renamed from: a */
    public void mo211349a(final VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
        if (this.f159921a != null) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63349c.RunnableC633545 */

                public void run() {
                    C63349c.this.f159921a.mo219181a(vCMeetingJoinInfoEntity);
                }
            });
        }
    }

    C63349c(VcTabDetailEntryParam vcTabDetailEntryParam) {
        this.f159925e = vcTabDetailEntryParam;
        this.f159922b = vcTabDetailEntryParam.getMeetingId();
        this.f159929i = vcTabDetailEntryParam.getHistoryId();
        this.f159931k = vcTabDetailEntryParam.getUserId();
        this.f159932l = vcTabDetailEntryParam.getTenantId();
        this.f159930j = vcTabDetailEntryParam.isTryLocal().booleanValue();
        this.f159923c = VideoChatModuleDependency.m236630c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m248203a(PushGrootCells pushGrootCells) {
        if (pushGrootCells.channel_meta == null) {
            C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushGrootCells]", "channel_meta is null");
        } else if (pushGrootCells.channel_meta.grootChannel == ChannelMeta.GrootChannel.VC_TAB_USER_CHANNEL) {
            m248205b(pushGrootCells);
        } else if (pushGrootCells.channel_meta.grootChannel == ChannelMeta.GrootChannel.VC_TAB_MEETING_CHANNEL) {
            m248207c(pushGrootCells);
        }
    }

    /* renamed from: b */
    public void mo219250b(final C63328a.AbstractC63329a.AbstractC63330a<VcTabDetailInfo> aVar) {
        String id = TimeZone.getDefault().getID();
        C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[fetchDetailInfo]", "historyId is " + this.f159929i + ", timeZone is " + TimeZone.getDefault().getID() + ", isTryLocal is " + this.f159930j);
        VcBizService.getVcTabDetailInfo(this.f159929i, id, this.f159930j, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63349c.C633501 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[fetchDetailInfo4]", "onError:" + eVar);
                aVar.mo219175a(eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                VcTabDetailResponse gVar = (VcTabDetailResponse) obj;
                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[fetchDetailInfo2]", "success, response:" + gVar);
                if (gVar == null || C60742af.m236059a(gVar.mo210448a()) || gVar.mo210448a().get(0) == null || gVar.mo210448a().get(0).getMeetingBaseInfo() == null) {
                    C60700b.m235861e("VideoChatTab_VcTabDetailModel", "[fetchDetailInfo3]", "detailInfo is empty");
                    aVar.mo219174a();
                    return;
                }
                int downVersion = gVar.mo210448a().get(0).getMeetingBaseInfo().getDownVersion();
                int version = gVar.mo210448a().get(0).getMeetingUserSpecInfo().getVersion();
                C63349c.this.mo219248a(downVersion);
                C63349c cVar = C63349c.this;
                cVar.mo219252b(cVar.f159923c);
                VideoChatPush.m249004a().mo219716a(C63349c.this);
                ArrayList arrayList = new ArrayList();
                for (VcTabDetailInfo vcTabDetailInfo : gVar.mo210448a()) {
                    if (!(vcTabDetailInfo == null || vcTabDetailInfo.getMeetingUserSpecInfo() == null)) {
                        C63349c.this.f159924d = vcTabDetailInfo.getMeetingUserSpecInfo().getVersion();
                        if (!C60742af.m236059a(vcTabDetailInfo.getMeetingUserSpecInfo().getHistoryInfos())) {
                            arrayList.addAll(vcTabDetailInfo.getMeetingUserSpecInfo().getHistoryInfos());
                        }
                    }
                }
                C63389b.m248367b().mo219364b(version);
                C63349c.this.mo219253e();
                C63389b.m248367b().mo219371f();
                gVar.mo210448a().get(0).getMeetingUserSpecInfo().setHistoryInfos(arrayList);
                aVar.mo219176a(gVar.mo210448a().get(0), new VcTabDetailBasicInfo(gVar.mo210449b(), gVar.mo210450c(), gVar.mo210451d(), gVar.mo210452e()));
            }
        });
    }

    /* renamed from: c */
    private void m248207c(PushGrootCells pushGrootCells) {
        VCTabMeetingGrootCellPayload dVar;
        if (!TextUtils.equals(pushGrootCells.channel_meta.channelId, this.f159922b)) {
            C60700b.m235861e("VideoChatTab_VcTabDetailModel", "[onPushMeetingGrootCells]", "meetingId is different, channelId:" + pushGrootCells.channel_meta.channelId + ", mMeetingId:" + this.f159922b);
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
                    this.f159921a.mo219184a(cVar);
                }
                if (list != null) {
                    C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushMeetingGrootCells3]", "ParticipantChanged:" + list);
                    this.f159921a.mo219189a(list);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a
    /* renamed from: a */
    public void mo219169a(C63328a.AbstractC63329a.AbstractC63331b<Object> bVar) {
        mo219251b(bVar);
    }

    /* renamed from: b */
    public void mo219251b(final C63328a.AbstractC63329a.AbstractC63331b<Object> bVar) {
        String id = TimeZone.getDefault().getID();
        String language = VideoChatModule.getDependency().getLanguageDependency().getLanguageSetting().getLanguage();
        boolean z = !VideoChatModule.getDependency().getSettingDependency().is24Hour();
        C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onCreateVCTabMeetingStatisticsInfo]", "meetingId is " + this.f159922b + ", timeZone is " + TimeZone.getDefault().getID() + ", isTwelveHourTime is " + z + ", locale is " + language);
        VcBizService.createVcTabMeetingStatisticsInfo(this.f159922b, id, z, language, new AbstractC63598b<Object>() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63349c.C633512 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                bVar.mo219178a(obj);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VcTabDetailModel", "[createVcTabMeetingStatisticsInfo]", "onError:" + eVar);
                bVar.mo219177a(eVar);
            }
        });
    }

    /* renamed from: b */
    private void m248205b(PushGrootCells pushGrootCells) {
        if (!TextUtils.equals(pushGrootCells.channel_meta.channelId, this.f159923c)) {
            C60700b.m235861e("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells]", "uid is different, channelId:" + pushGrootCells.channel_meta.channelId + ", mMyselfUserId:" + this.f159923c);
        } else if (!CollectionUtils.isEmpty(pushGrootCells.cells)) {
            for (GrootCell grootCell : pushGrootCells.cells) {
                VCTabUserGrootCellPayload vCTabUserGrootCellPayload = grootCell.vcTabUserGrootCellPayload;
                for (VCTabDetailItemChangeEvent vCTabDetailItemChangeEvent : vCTabUserGrootCellPayload.getChangeEvents()) {
                    if (vCTabDetailItemChangeEvent.getVersion() <= this.f159933m || vCTabDetailItemChangeEvent.getVersion() <= this.f159924d) {
                        C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells2]", "version invalid: hisAndRecPushVersion " + this.f159933m + ", eventVersion " + vCTabDetailItemChangeEvent.getVersion());
                    } else {
                        this.f159933m = vCTabDetailItemChangeEvent.getVersion();
                        if (TextUtils.equals(vCTabDetailItemChangeEvent.getMeetingId(), this.f159922b)) {
                            VCTabRecordInfo recordInfo = vCTabDetailItemChangeEvent.getRecordInfo();
                            if (recordInfo != null) {
                                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells3]", "RecordChanged:" + recordInfo);
                                this.f159921a.mo219182a(recordInfo);
                            }
                            List<FollowAbbrInfo> followInfo = vCTabDetailItemChangeEvent.getFollowInfo();
                            if (!C60742af.m236059a(followInfo)) {
                                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells4]", "FollowInfo:" + followInfo);
                                this.f159921a.mo219195c(followInfo);
                            }
                            List<HistoryInfo> replaceAllHistory = vCTabDetailItemChangeEvent.getReplaceAllHistory();
                            if (!C60742af.m236059a(replaceAllHistory)) {
                                C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells5]", "ReplaceAllHistoryInfo:" + replaceAllHistory);
                                this.f159921a.mo219192b(replaceAllHistory);
                            } else {
                                HistoryInfo historyInfo = vCTabDetailItemChangeEvent.getHistoryInfo();
                                if (historyInfo != null) {
                                    C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootCells6]", "InteractionHistoryInfo:" + historyInfo);
                                    this.f159921a.mo219180a(historyInfo);
                                }
                            }
                        }
                    }
                }
                if (vCTabUserGrootCellPayload.getChangeType() != null && vCTabUserGrootCellPayload.getChangeType().getNumber() == VCTabUserChangeType.STATISTICS.getNumber() && vCTabUserGrootCellPayload.getStatisticsInfo() != null && C60733aa.m235990a(vCTabUserGrootCellPayload.getStatisticsInfo().mo210436d(), this.f159922b) && vCTabUserGrootCellPayload.getStatisticsInfo().mo210437e() != null && vCTabUserGrootCellPayload.getStatisticsInfo().mo210437e().intValue() > this.f159924d && vCTabUserGrootCellPayload.getStatisticsInfo().mo210437e().intValue() > this.f159934n) {
                    this.f159934n = vCTabUserGrootCellPayload.getStatisticsInfo().mo210437e().intValue();
                    this.f159921a.mo219185a(vCTabUserGrootCellPayload.getStatisticsInfo());
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a.AbstractC63329a
    /* renamed from: a */
    public void mo219170a(C63328a.AbstractC63332b bVar) {
        this.f159921a = bVar;
    }

    /* renamed from: a */
    public void mo219249a(String str) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235861e("VideoChatTab_VcTabDetailModel", "[registerMeetingGrootChannelStatusListener]", "failed because channelId is null.");
            return;
        }
        if (this.f159927g == null) {
            this.f159927g = new VideoChatPush.AbstractC63564d(str) {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$c$mK2ETpgGdtPWnFaBudm3TKe2Ho */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void onPushGrootChannelStatus(PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
                    C63349c.m271455lambda$mK2ETpgGdtPWnFaBudm3TKe2Ho(this.f$0, pushGrootChannelStatusEntity);
                }
            };
        }
        VideoChatPush.m249004a().mo219730a(str, this.f159927g);
    }

    /* renamed from: b */
    public void mo219252b(String str) {
        if (TextUtils.isEmpty(str)) {
            C60700b.m235843a("VideoChatTab_VcTabDetailModel", "[registerUserGrootChannelStatusListener]", "failed because channelId is null.");
            return;
        }
        if (this.f159928h == null) {
            this.f159928h = new VideoChatPush.AbstractC63564d(str) {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3172a.$$Lambda$c$QvBpyEXxQQAcwDh2bwIcQ7jcbD0 */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void onPushGrootChannelStatus(PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
                    C63349c.lambda$QvBpyEXxQQAcwDh2bwIcQ7jcbD0(this.f$0, pushGrootChannelStatusEntity);
                }
            };
        }
        VideoChatPush.m249004a().mo219730a(str, this.f159928h);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m248206b(String str, PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
        C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushMeetingGrootChannelStatus]", "channelId: " + str + ", status:" + pushGrootChannelStatusEntity.f152610b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248204a(String str, PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
        C60700b.m235851b("VideoChatTab_VcTabDetailModel", "[onPushUserGrootChannelStatus]", "channelId: " + str + ", status:" + pushGrootChannelStatusEntity.f152610b);
    }
}
