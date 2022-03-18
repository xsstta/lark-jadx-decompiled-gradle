package com.ss.android.vc.meeting.module.tab3.list.view.p3177b;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60745ag;
import com.ss.android.vc.common.p3083e.C60754h;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.tag.ExternalTag;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.tab.VCHistoryAbbrInfo;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.entity.tab.VCTabMeetingJoinInfo;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.tab3.detail.VcTab3DetailActivity;
import com.ss.android.vc.meeting.module.tab3.detail.VcTabDetailEntryParam;
import com.ss.android.vc.meeting.module.tab3.widgets.utils.DateTimeUtils;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event2.VCTabEvent3;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.b.c */
public class C63415c extends AbstractC63411a {

    /* renamed from: a */
    public TextView f160121a;

    /* renamed from: b */
    public TextView f160122b = ((TextView) this.f160135o.findViewById(R.id.ongoing_call_count));

    /* renamed from: c */
    public ExternalTag f160123c = ((ExternalTag) this.f160135o.findViewById(R.id.ongoing_external_tag));

    /* renamed from: d */
    public TextView f160124d = ((TextView) this.f160135o.findViewById(R.id.ongoing_timer));

    /* renamed from: e */
    public TextView f160125e = ((TextView) this.f160135o.findViewById(R.id.ongoing_meeting_id));

    /* renamed from: f */
    public TextView f160126f = ((TextView) this.f160135o.findViewById(R.id.ongoing_meeting_status));

    /* renamed from: g */
    public View f160127g = this.f160135o.findViewById(R.id.bottom_divider);

    /* renamed from: h */
    public View f160128h = this.f160135o.findViewById(R.id.ongoing_divider2);

    /* renamed from: i */
    public View f160129i = this.f160135o.findViewById(R.id.minutes_icon);

    /* renamed from: j */
    public View f160130j = this.f160135o.findViewById(R.id.ccm_icon);

    /* renamed from: k */
    public IconFontView f160131k = ((IconFontView) this.f160135o.findViewById(R.id.url_icon));

    /* renamed from: l */
    public IconFontView f160132l = ((IconFontView) this.f160135o.findViewById(R.id.record_icon));

    /* renamed from: m */
    public int f160133m;

    /* renamed from: n */
    private C60745ag.C60746a f160134n;

    /* renamed from: o */
    private View f160135o;

    @Override // com.ss.android.vc.meeting.module.tab3.list.view.p3177b.AbstractC63411a
    /* renamed from: a */
    public View mo219421a() {
        return this.f160127g;
    }

    /* renamed from: b */
    private void m248479b() {
        C60700b.m235851b("HistoryViewHolder", "[resetTimer]", "vcTab endTimerTask");
        C60745ag.C60746a aVar = this.f160134n;
        if (aVar != null) {
            aVar.mo208366a(true);
            this.f160134n = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m248481c() {
        int a = C60776r.m236139a() - C60773o.m236115a(32.0d);
        ExternalTag externalTag = this.f160123c;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (!(externalTag == null || externalTag.getVisibility() != 0 || this.f160123c.getPaint() == null)) {
            f = BitmapDescriptorFactory.HUE_RED + ((float) this.f160123c.getWidth());
        }
        TextView textView = this.f160122b;
        if (!(textView == null || textView.getVisibility() != 0 || this.f160122b.getPaint() == null)) {
            f += (float) this.f160122b.getWidth();
        }
        TextView textView2 = this.f160126f;
        if (!(textView2 == null || textView2.getVisibility() != 0 || this.f160126f.getPaint() == null || this.f160126f.getText() == null)) {
            f += (float) this.f160126f.getWidth();
        }
        if (this.f160123c.getVisibility() == 8) {
            f += (float) C60773o.m236115a(8.0d);
        }
        this.f160121a.setMaxWidth(Math.min((int) (((float) a) - f), C60773o.m236115a(290.0d)));
    }

    /* renamed from: a */
    private void m248476a(final VCTabListItem vCTabListItem) {
        VcBizService.getVCMeetingJoinStatus(new AbstractC63598b<VCMeetingJoinInfoEntity>() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63415c.C634183 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("HistoryViewHolder", "[getVCMeetingJoinStatus]", "fail" + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
                if (vCMeetingJoinInfoEntity == null) {
                    boolean z = false;
                    C63415c.this.f160126f.setVisibility(0);
                    if (vCTabListItem.isLocked()) {
                        C63415c cVar = C63415c.this;
                        if (vCTabListItem.getMeetingType() != VideoChat.Type.MEET) {
                            z = true;
                        }
                        cVar.mo219427a(z);
                        return;
                    }
                    C63415c.this.mo219426a(vCTabListItem.getMeetingId(), vCTabListItem.getMeetingTopic());
                    return;
                }
                C63415c.this.mo219424a(vCTabListItem, vCMeetingJoinInfoEntity.joinInfo);
            }
        });
    }

    /* renamed from: a */
    public void mo219423a(final long j) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63415c.RunnableC634249 */

            public void run() {
                long a = (DateTimeUtils.m248532a() / 1000) - j;
                String c = DateTimeUtils.m248539c(a);
                if (c == null) {
                    c = "";
                }
                int length = c.length();
                if (!(length == C63415c.this.f160133m || C63415c.this.f160124d.getPaint() == null)) {
                    C63415c.this.f160133m = length;
                    int i = 1;
                    if (a >= 3600) {
                        i = 2;
                    }
                    C63415c.this.f160124d.setMinimumWidth((int) ((C63415c.this.f160124d.getPaint().measureText(":") * ((float) i)) + (C63415c.this.f160124d.getPaint().measureText("8") * ((float) (C63415c.this.f160133m - i))) + BitmapDescriptorFactory.HUE_RED));
                }
                C63415c.this.f160124d.setText(c);
            }
        });
    }

    /* renamed from: a */
    private void m248477a(final String str) {
        this.f160126f.setFocusable(true);
        this.f160126f.setBackground(C60773o.m236128f(R.drawable.vc_bg_green_btn_selector));
        this.f160126f.setTextColor(C60773o.m236126d(R.color.ud_G600));
        this.f160126f.setText(R.string.View_MV_JoinedAlready);
        this.f160126f.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63415c.C634205 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("HistoryViewHolder", "[onClick2]", "click go to onthecall");
                VCTabEvent3.f160816b.mo220252a("ongoing_joined", "vc_meeting_onthecall_view", (Map<String, String>) null);
                C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(str);
                if (kVar != null) {
                    ByteRTCMeetingActivity.m244042c(kVar);
                }
            }
        });
    }

    /* renamed from: b */
    private void m248480b(final long j) {
        C60700b.m235851b("HistoryViewHolder", "[startOnthecallTimer]", "startTimerTask");
        C60745ag.C60746a aVar = this.f160134n;
        if (aVar != null) {
            aVar.mo208366a(true);
        }
        this.f160134n = C60745ag.m236064a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63415c.RunnableC634238 */

            public void run() {
                C63415c.this.mo219423a(j);
            }
        }, 1000, 1000);
    }

    public C63415c(View view) {
        super(view);
        this.f160135o = view;
        this.f160121a = (TextView) view.findViewById(R.id.ongoing_title);
    }

    /* renamed from: a */
    public void mo219427a(boolean z) {
        if (z) {
            this.f160126f.setVisibility(8);
            return;
        }
        this.f160126f.setFocusable(false);
        this.f160126f.setBackground(C60773o.m236128f(R.drawable.tab_status_locked));
        this.f160126f.setTextColor(C60773o.m236126d(R.color.text_disable));
        this.f160126f.setText(R.string.Lark_View_Locked);
        this.f160126f.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63415c.C634227 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
            }
        });
    }

    /* renamed from: a */
    private void m248478a(boolean z, final String str) {
        if (z) {
            this.f160126f.setVisibility(8);
            return;
        }
        this.f160126f.setFocusable(true);
        this.f160126f.setBackground(C60773o.m236128f(R.drawable.vc_bg_green_btn_selector));
        this.f160126f.setTextColor(C60773o.m236126d(R.color.ud_G600));
        this.f160126f.setText(R.string.View_M_WaitingEllipsis);
        this.f160126f.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63415c.C634216 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("HistoryViewHolder", "[onClick3]", "click go to waiting room");
                C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(str);
                if (kVar != null) {
                    ByteRTCMeetingActivity.m244042c(kVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo219424a(VCTabListItem vCTabListItem, VCTabMeetingJoinInfo vCTabMeetingJoinInfo) {
        boolean z;
        String meetingId = vCTabListItem.getMeetingId();
        String meetingTopic = vCTabListItem.getMeetingTopic();
        if (vCTabListItem.getMeetingType() != VideoChat.Type.MEET) {
            z = true;
        } else {
            z = false;
        }
        if (vCTabMeetingJoinInfo == null || vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.UNKNOWN || !TextUtils.equals(meetingId, vCTabMeetingJoinInfo.getMeetingId())) {
            C60700b.m235851b("HistoryViewHolder", "[initMeetingStatus]", "empty info, got to join meeting");
            if (vCTabListItem.isLocked()) {
                mo219427a(z);
            } else {
                mo219426a(meetingId, meetingTopic);
            }
        } else {
            this.f160126f.setVisibility(0);
            if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.JOINED) {
                m248477a(vCTabMeetingJoinInfo.getMeetingId());
            } else if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.WAITING) {
                m248478a(z, vCTabMeetingJoinInfo.getMeetingId());
            } else if (vCTabListItem.isLocked()) {
                mo219427a(z);
            } else if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.JOINABLE) {
                mo219426a(meetingId, meetingTopic);
            } else if (vCTabMeetingJoinInfo.getJoinStatus() == VCTabMeetingJoinInfo.JoinStatus.END) {
                this.f160126f.setVisibility(8);
                m248479b();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab3.list.view.p3177b.AbstractC63411a
    /* renamed from: a */
    public void mo219422a(final VCTabListItem vCTabListItem, String str) {
        boolean z;
        int i;
        if (vCTabListItem == null) {
            C60700b.m235851b("HistoryViewHolder", "[bind]", "bind history failed. model is null.");
            return;
        }
        final VCHistoryAbbrInfo historyAbbrInfo = vCTabListItem.getHistoryAbbrInfo();
        if (historyAbbrInfo != null) {
            int i2 = 1;
            if (vCTabListItem.getMeetingType() == VideoChat.Type.MEET) {
                String meetingTopic = vCTabListItem.getMeetingTopic();
                if (!TextUtils.isEmpty(meetingTopic) && vCTabListItem.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", meetingTopic);
                    meetingTopic = UIHelper.mustacheFormat(UIHelper.getString(R.string.View_M_VideoInterviewNameBraces), hashMap);
                }
                if (historyAbbrInfo.getCallCount() > 1) {
                    this.f160122b.setText(String.format(" (%d)", Long.valueOf(historyAbbrInfo.getCallCount())));
                    this.f160122b.setVisibility(0);
                } else {
                    this.f160122b.setVisibility(8);
                }
                if (historyAbbrInfo.getCallStatus() == VCHistoryAbbrInfo.CallStatus.CANCELED && historyAbbrInfo.getHistoryType() == VCHistoryAbbrInfo.HistoryType.BE_CALLED) {
                    z = false;
                } else {
                    z = true;
                }
                TextView textView = this.f160121a;
                if (TextUtils.isEmpty(meetingTopic)) {
                    meetingTopic = C60773o.m236119a((int) R.string.View_G_ServerNoTitle);
                }
                textView.setText(meetingTopic);
                TextView textView2 = this.f160121a;
                int i3 = R.color.text_title;
                if (z) {
                    i = R.color.text_title;
                } else {
                    i = R.color.function_danger_500;
                }
                textView2.setTextColor(C60773o.m236126d(i));
                TextView textView3 = this.f160122b;
                if (!z) {
                    i3 = R.color.function_danger_500;
                }
                textView3.setTextColor(C60773o.m236126d(i3));
            } else if (vCTabListItem.getMeetingType() == VideoChat.Type.CALL) {
                UserInfoService.getChatterById(historyAbbrInfo.getInteracterUserId(), new GetUserInfoListener() {
                    /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63415c.C634161 */

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public void onGetUserInfo(VideoChatUser videoChatUser) {
                        int i;
                        String name = videoChatUser.getName();
                        boolean z = true;
                        if (historyAbbrInfo.getCallCount() > 1) {
                            C63415c.this.f160122b.setText(String.format(" (%d)", Long.valueOf(historyAbbrInfo.getCallCount())));
                            C63415c.this.f160122b.setVisibility(0);
                        } else {
                            C63415c.this.f160122b.setVisibility(8);
                        }
                        if (historyAbbrInfo.getCallStatus() == VCHistoryAbbrInfo.CallStatus.CANCELED && historyAbbrInfo.getHistoryType() == VCHistoryAbbrInfo.HistoryType.BE_CALLED) {
                            z = false;
                        }
                        C63415c.this.f160121a.setText(name);
                        TextView textView = C63415c.this.f160121a;
                        int i2 = R.color.text_title;
                        if (z) {
                            i = R.color.text_title;
                        } else {
                            i = R.color.function_danger_500;
                        }
                        textView.setTextColor(C60773o.m236126d(i));
                        TextView textView2 = C63415c.this.f160122b;
                        if (!z) {
                            i2 = R.color.function_danger_500;
                        }
                        textView2.setTextColor(C60773o.m236126d(i2));
                    }
                });
            }
            long a = (DateTimeUtils.m248532a() / 1000) - vCTabListItem.getCreateTime();
            String c = DateTimeUtils.m248539c(a);
            if (c == null) {
                c = "";
            }
            this.f160133m = c.length();
            if (this.f160124d.getPaint() != null) {
                if (a >= 3600) {
                    i2 = 2;
                }
                this.f160124d.setMinimumWidth((int) ((this.f160124d.getPaint().measureText(":") * ((float) i2)) + (this.f160124d.getPaint().measureText("8") * ((float) (this.f160133m - i2))) + BitmapDescriptorFactory.HUE_RED));
            }
            this.f160124d.setText(c);
            m248480b(vCTabListItem.getCreateTime());
            this.f160125e.setText(C60773o.m236119a((int) R.string.View_M_MeetingIDShort));
            if (!TextUtils.isEmpty(vCTabListItem.getMeetingNumber())) {
                this.f160125e.append(C60754h.m236085a(vCTabListItem.getMeetingNumber()));
            }
            String sameTenantId = vCTabListItem.getSameTenantId();
            boolean c2 = VideoChatModuleDependency.getLoginDependency().mo196421c();
            if (!VideoChatModuleDependency.m236632e() || c2) {
                this.f160123c.setVisibility(8);
            } else if (vCTabListItem.isContainsMultipleTenant() || (!TextUtils.isEmpty(sameTenantId) && !VideoChatModule.getDependency().getTenantId().equals(sameTenantId))) {
                this.f160123c.setVisibility(0);
            } else {
                this.f160123c.setVisibility(8);
            }
            if (vCTabListItem.getContentLogos() == null || vCTabListItem.getContentLogos().size() <= 0) {
                this.f160128h.setVisibility(8);
                this.f160129i.setVisibility(8);
                this.f160130j.setVisibility(8);
                this.f160131k.setVisibility(8);
                this.f160132l.setVisibility(8);
            } else {
                this.f160128h.setVisibility(0);
                if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.RECORD)) {
                    this.f160132l.setVisibility(0);
                } else {
                    this.f160132l.setVisibility(8);
                }
                if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.MS_CCM)) {
                    this.f160130j.setVisibility(0);
                } else {
                    this.f160130j.setVisibility(8);
                }
                if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.MS_URL)) {
                    this.f160131k.setVisibility(0);
                } else {
                    this.f160131k.setVisibility(8);
                }
                if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.LARK_MINUTES)) {
                    this.f160129i.setVisibility(0);
                } else {
                    this.f160129i.setVisibility(8);
                }
            }
            this.itemView.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63415c.C634172 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    VcTab3DetailActivity.m248058a(C63415c.this.itemView.getContext(), new VcTabDetailEntryParam.Builder().mo219153b(vCTabListItem.getHistoryId()).mo219150a(vCTabListItem.getMeetingId()).mo219155d(vCTabListItem.getHistoryAbbrInfo().getInteracterUserId()).mo219156e(vCTabListItem.getSameTenantId()).mo219149a(Boolean.valueOf(!vCTabListItem.isSubscribeDetailChange())).mo219152b((Boolean) false).mo219151a());
                    VCTabEvent3.f160816b.mo220247a(vCTabListItem.getMeetingId(), "ongoing", vCTabListItem.getMeetingType());
                    HashMap hashMap = new HashMap();
                    hashMap.put("conference_id", vCTabListItem.getMeetingId());
                    VCTabEvent3.f160816b.mo220252a("ongoing_meeting", "vc_tab_list_view", hashMap);
                }
            });
            this.f160135o.post(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.$$Lambda$c$DnYehGxUuhJWsZcxExHTuNEW30Q */

                public final void run() {
                    C63415c.this.m248481c();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo219426a(final String str, final String str2) {
        this.f160126f.setFocusable(true);
        this.f160126f.setText(R.string.View_G_JoinRightNow);
        this.f160126f.setBackground(C60773o.m236128f(R.drawable.vc_bg_green_btn_selector));
        this.f160126f.setTextColor(C60773o.m236126d(R.color.ud_G600));
        this.f160126f.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63415c.C634194 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C60700b.m235851b("HistoryViewHolder", "[onClick]", "click join meeting");
                VCTabEvent3.f160816b.mo220252a("ongoing_join_meeting", "vc_meeting_pre_view", (Map<String, String>) null);
                VideoChatService.m249602d().openNormalJoinMeetingPage(C63415c.this.f160126f.getContext(), "tab_meeting_detail_join", str2, str);
            }
        });
    }

    /* renamed from: a */
    public void mo219425a(VCTabListItem vCTabListItem, String str, VCTabMeetingJoinInfo vCTabMeetingJoinInfo) {
        mo219422a(vCTabListItem, str);
        if (vCTabMeetingJoinInfo == null) {
            m248476a(vCTabListItem);
        } else {
            mo219424a(vCTabListItem, vCTabMeetingJoinInfo);
        }
    }
}
