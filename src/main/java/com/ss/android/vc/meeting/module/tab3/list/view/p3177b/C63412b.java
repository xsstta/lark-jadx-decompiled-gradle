package com.ss.android.vc.meeting.module.tab3.list.view.p3177b;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.tab.VCHistoryAbbrInfo;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab3.detail.VcTab3DetailActivity;
import com.ss.android.vc.meeting.module.tab3.detail.VcTabDetailEntryParam;
import com.ss.android.vc.meeting.module.tab3.widgets.utils.DateTimeUtils;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VCTabEvent3;
import java.util.HashMap;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.b.b */
public class C63412b extends AbstractC63411a {

    /* renamed from: a */
    public View f160107a;

    /* renamed from: b */
    public TextView f160108b;

    /* renamed from: c */
    public TextView f160109c;

    /* renamed from: d */
    public TextView f160110d;

    /* renamed from: e */
    public View f160111e;

    /* renamed from: f */
    public ImageView f160112f;

    /* renamed from: g */
    public ImageView f160113g;

    /* renamed from: h */
    public IconFontView f160114h;

    /* renamed from: i */
    public IconFontView f160115i;

    /* renamed from: j */
    public View f160116j;

    @Override // com.ss.android.vc.meeting.module.tab3.list.view.p3177b.AbstractC63411a
    /* renamed from: a */
    public View mo219421a() {
        return this.f160116j;
    }

    public C63412b(View view) {
        super(view);
        this.f160108b = (TextView) view.findViewById(R.id.tab_title);
        this.f160110d = (TextView) view.findViewById(R.id.tab_timer);
        this.f160109c = (TextView) view.findViewById(R.id.call_count);
        this.f160111e = view.findViewById(R.id.tab_divider);
        this.f160107a = view.findViewById(R.id.tab_item_external);
        this.f160112f = (ImageView) view.findViewById(R.id.minutes_icon);
        this.f160113g = (ImageView) view.findViewById(R.id.ccm_icon);
        this.f160114h = (IconFontView) view.findViewById(R.id.url_icon);
        this.f160115i = (IconFontView) view.findViewById(R.id.record_icon);
        this.f160116j = view.findViewById(R.id.bottom_divider);
    }

    /* renamed from: a */
    private void m248473a(VCTabListItem vCTabListItem) {
        int i;
        int i2;
        final VCHistoryAbbrInfo historyAbbrInfo = vCTabListItem.getHistoryAbbrInfo();
        VCTabListItem.PhoneType phoneType = vCTabListItem.getPhoneType();
        VCTabListItem.PhoneType phoneType2 = VCTabListItem.PhoneType.OUTSIDE_ENTERPRISE_PHONE;
        int i3 = R.color.text_title;
        boolean z = true;
        if (phoneType == phoneType2) {
            String phoneNumber = vCTabListItem.getPhoneNumber();
            if (historyAbbrInfo.getCallCount() > 1) {
                this.f160109c.setText(String.format(" (%d)", Long.valueOf(historyAbbrInfo.getCallCount())));
                this.f160109c.setVisibility(0);
            } else {
                this.f160109c.setVisibility(8);
            }
            if (historyAbbrInfo.getCallStatus() == VCHistoryAbbrInfo.CallStatus.CANCELED && historyAbbrInfo.getHistoryType() == VCHistoryAbbrInfo.HistoryType.BE_CALLED) {
                z = false;
            }
            TextView textView = this.f160108b;
            if (TextUtils.isEmpty(phoneNumber)) {
                phoneNumber = C60773o.m236119a((int) R.string.View_G_ServerNoTitle);
            }
            textView.setText(phoneNumber);
            TextView textView2 = this.f160108b;
            if (z) {
                i2 = R.color.text_title;
            } else {
                i2 = R.color.function_danger_500;
            }
            textView2.setTextColor(C60773o.m236126d(i2));
            TextView textView3 = this.f160109c;
            if (!z) {
                i3 = R.color.function_danger_500;
            }
            textView3.setTextColor(C60773o.m236126d(i3));
        } else if (vCTabListItem.getMeetingType() == VideoChat.Type.MEET) {
            String meetingTopic = vCTabListItem.getMeetingTopic();
            if (!TextUtils.isEmpty(meetingTopic) && vCTabListItem.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                HashMap hashMap = new HashMap();
                hashMap.put("name", meetingTopic);
                meetingTopic = UIHelper.mustacheFormat(UIHelper.getString(R.string.View_M_VideoInterviewNameBraces), hashMap);
            }
            if (historyAbbrInfo.getCallCount() > 1) {
                this.f160109c.setText(String.format(" (%d)", Long.valueOf(historyAbbrInfo.getCallCount())));
                this.f160109c.setVisibility(0);
            } else {
                this.f160109c.setVisibility(8);
            }
            if (historyAbbrInfo.getCallStatus() == VCHistoryAbbrInfo.CallStatus.CANCELED && historyAbbrInfo.getHistoryType() == VCHistoryAbbrInfo.HistoryType.BE_CALLED) {
                z = false;
            }
            TextView textView4 = this.f160108b;
            if (TextUtils.isEmpty(meetingTopic)) {
                meetingTopic = C60773o.m236119a((int) R.string.View_G_ServerNoTitle);
            }
            textView4.setText(meetingTopic);
            TextView textView5 = this.f160108b;
            if (z) {
                i = R.color.text_title;
            } else {
                i = R.color.function_danger_500;
            }
            textView5.setTextColor(C60773o.m236126d(i));
            TextView textView6 = this.f160109c;
            if (!z) {
                i3 = R.color.function_danger_500;
            }
            textView6.setTextColor(C60773o.m236126d(i3));
        } else if (vCTabListItem.getMeetingType() == VideoChat.Type.CALL) {
            UserInfoService.getChatterById(historyAbbrInfo.getInteracterUserId(), new GetUserInfoListener() {
                /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63412b.C634142 */

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public void onGetUserInfo(VideoChatUser videoChatUser) {
                    int i;
                    String name = videoChatUser.getName();
                    boolean z = true;
                    if (historyAbbrInfo.getCallCount() > 1) {
                        C63412b.this.f160109c.setText(String.format(" (%d)", Long.valueOf(historyAbbrInfo.getCallCount())));
                        C63412b.this.f160109c.setVisibility(0);
                    } else {
                        C63412b.this.f160109c.setVisibility(8);
                    }
                    if (historyAbbrInfo.getCallStatus() == VCHistoryAbbrInfo.CallStatus.CANCELED && historyAbbrInfo.getHistoryType() == VCHistoryAbbrInfo.HistoryType.BE_CALLED) {
                        z = false;
                    }
                    C63412b.this.f160108b.setText(name);
                    TextView textView = C63412b.this.f160108b;
                    int i2 = R.color.text_title;
                    if (z) {
                        i = R.color.text_title;
                    } else {
                        i = R.color.function_danger_500;
                    }
                    textView.setTextColor(C60773o.m236126d(i));
                    TextView textView2 = C63412b.this.f160109c;
                    if (!z) {
                        i2 = R.color.function_danger_500;
                    }
                    textView2.setTextColor(C60773o.m236126d(i2));
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab3.list.view.p3177b.AbstractC63411a
    /* renamed from: a */
    public void mo219422a(final VCTabListItem vCTabListItem, String str) {
        if (vCTabListItem == null) {
            C60700b.m235851b("HistoryViewHolder", "[bind]", "bind history failed. model is null.");
        } else if (vCTabListItem.getHistoryAbbrInfo() != null) {
            m248473a(vCTabListItem);
            this.f160110d.setText(DateTimeUtils.m248533a(vCTabListItem.getMeetingTime() * 1000));
            String sameTenantId = vCTabListItem.getSameTenantId();
            boolean c = VideoChatModuleDependency.getLoginDependency().mo196421c();
            if (!VideoChatModuleDependency.m236632e() || c) {
                this.f160107a.setVisibility(8);
            } else if (vCTabListItem.isContainsMultipleTenant() || (!TextUtils.isEmpty(sameTenantId) && !VideoChatModule.getDependency().getTenantId().equals(sameTenantId))) {
                this.f160107a.setVisibility(0);
            } else {
                this.f160107a.setVisibility(8);
            }
            if (vCTabListItem.getContentLogos() == null || vCTabListItem.getContentLogos().size() <= 0) {
                this.f160111e.setVisibility(8);
                this.f160112f.setVisibility(8);
                this.f160113g.setVisibility(8);
                this.f160114h.setVisibility(8);
                this.f160115i.setVisibility(8);
            } else {
                this.f160111e.setVisibility(0);
                if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.RECORD)) {
                    this.f160115i.setVisibility(0);
                } else {
                    this.f160115i.setVisibility(8);
                }
                if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.MS_CCM)) {
                    this.f160113g.setVisibility(0);
                } else {
                    this.f160113g.setVisibility(8);
                }
                if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.MS_URL)) {
                    this.f160114h.setVisibility(0);
                } else {
                    this.f160114h.setVisibility(8);
                }
                if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.LARK_MINUTES)) {
                    this.f160112f.setVisibility(0);
                } else {
                    this.f160112f.setVisibility(8);
                }
            }
            this.itemView.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63412b.C634131 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    VcTab3DetailActivity.m248058a(C63412b.this.itemView.getContext(), new VcTabDetailEntryParam.Builder().mo219153b(vCTabListItem.getHistoryId()).mo219150a(vCTabListItem.getMeetingId()).mo219155d(vCTabListItem.getHistoryAbbrInfo().getInteracterUserId()).mo219156e(vCTabListItem.getSameTenantId()).mo219149a(Boolean.valueOf(!vCTabListItem.isSubscribeDetailChange())).mo219148a(vCTabListItem.getPhoneType()).mo219154c(vCTabListItem.getPhoneNumber()).mo219152b((Boolean) false).mo219151a());
                    ce.m250261a();
                    VCTabEvent3.f160816b.mo220247a(vCTabListItem.getMeetingId(), "history", vCTabListItem.getMeetingType());
                    VCTabEvent3.m249746b(vCTabListItem.getMeetingId());
                }
            });
        }
    }
}
