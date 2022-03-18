package com.ss.android.vc.meeting.module.tab.history.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.tab.VCHistoryAbbrInfo;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab.detail.VcTabDetailActivity;
import com.ss.android.vc.meeting.module.tab.detail.VcTabDetailEntryParam;
import com.ss.android.vc.meeting.module.tab.history.mvp.VcTabListDataLoader;
import com.ss.android.vc.meeting.module.tab.history.view.C63309b;
import com.ss.android.vc.meeting.module.tab.widgets.C63323c;
import com.ss.android.vc.meeting.module.tab.widgets.C63327d;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VCTabEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.vc.meeting.module.tab.history.view.b */
public class C63309b extends RecyclerView.Adapter<C63310a> {

    /* renamed from: a */
    private List<VCTabListItem> f159729a = new ArrayList();

    /* renamed from: b */
    private final VcTabListDataLoader f159730b;

    /* renamed from: c */
    private String f159731c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f159729a.size();
    }

    /* renamed from: a */
    public void mo219084a() {
        if (this.f159730b == null) {
            C60700b.m235851b("VideoChatTab_VcTabHistoryAdapter", "[update]", "failed, mDataLoader is null");
            return;
        }
        this.f159729a.clear();
        this.f159729a.addAll(this.f159730b.mo218991c());
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo219086a(String str) {
        this.f159731c = str;
    }

    public C63309b(VcTabListDataLoader vcTabListDataLoader) {
        this.f159730b = vcTabListDataLoader;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248001a(C63310a aVar) {
        C63323c.m248039a().mo219112b(aVar.itemView);
    }

    /* renamed from: com.ss.android.vc.meeting.module.tab.history.view.b$a */
    public static class C63310a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public IconFontView f159732a;

        /* renamed from: b */
        public TextView f159733b;

        /* renamed from: c */
        public View f159734c;

        /* renamed from: d */
        public TextView f159735d;

        /* renamed from: e */
        public TextView f159736e;

        /* renamed from: f */
        public TimerTextView f159737f;

        /* renamed from: g */
        public View f159738g;

        /* renamed from: h */
        public View f159739h;

        /* renamed from: i */
        public View f159740i;

        /* renamed from: j */
        public IconFontView f159741j;

        /* renamed from: k */
        public IconFontView f159742k;

        /* renamed from: l */
        public IconFontView f159743l;

        public C63310a(View view) {
            super(view);
            this.f159732a = (IconFontView) view.findViewById(R.id.tab_icon);
            this.f159735d = (TextView) view.findViewById(R.id.tab_title);
            this.f159733b = (TextView) view.findViewById(R.id.tab_onging_tag);
            this.f159737f = (TimerTextView) view.findViewById(R.id.tab_timer);
            this.f159736e = (TextView) view.findViewById(R.id.call_count);
            this.f159738g = view.findViewById(R.id.tab_divider);
            this.f159739h = view.findViewById(R.id.tab_divider1);
            this.f159734c = view.findViewById(R.id.tab_item_external);
            this.f159740i = view.findViewById(R.id.minutes_icon);
            this.f159741j = (IconFontView) view.findViewById(R.id.ccm_icon);
            this.f159742k = (IconFontView) view.findViewById(R.id.url_icon);
            this.f159743l = (IconFontView) view.findViewById(R.id.record_icon);
        }

        /* renamed from: a */
        public void mo219087a(final VCTabListItem vCTabListItem, final String str) {
            int i;
            int i2;
            if (vCTabListItem == null) {
                C60700b.m235851b("VideoChatTab_VcTabHistoryAdapter", "[bind]", "failed, model is null.");
                return;
            }
            final VCHistoryAbbrInfo historyAbbrInfo = vCTabListItem.getHistoryAbbrInfo();
            if (historyAbbrInfo != null) {
                if (vCTabListItem.getMeetingType() == VideoChat.Type.MEET) {
                    String meetingTopic = vCTabListItem.getMeetingTopic();
                    if (!TextUtils.isEmpty(meetingTopic) && vCTabListItem.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("name", meetingTopic);
                        meetingTopic = UIHelper.mustacheFormat(UIHelper.getString(R.string.View_M_VideoInterviewNameBraces), hashMap);
                    }
                    boolean z = true;
                    if (historyAbbrInfo.getCallCount() > 1) {
                        this.f159736e.setText(String.format(" (%d)", Long.valueOf(historyAbbrInfo.getCallCount())));
                        this.f159736e.setVisibility(0);
                    } else {
                        this.f159736e.setVisibility(8);
                    }
                    if (historyAbbrInfo.getCallStatus() == VCHistoryAbbrInfo.CallStatus.CANCELED && historyAbbrInfo.getHistoryType() == VCHistoryAbbrInfo.HistoryType.BE_CALLED) {
                        z = false;
                    }
                    TextView textView = this.f159735d;
                    if (TextUtils.isEmpty(meetingTopic)) {
                        meetingTopic = C60773o.m236119a((int) R.string.View_G_ServerNoTitle);
                    }
                    textView.setText(meetingTopic);
                    TextView textView2 = this.f159735d;
                    int i3 = R.color.text_title;
                    if (z) {
                        i = R.color.text_title;
                    } else {
                        i = R.color.ud_R500;
                    }
                    textView2.setTextColor(C60773o.m236126d(i));
                    TextView textView3 = this.f159736e;
                    if (z) {
                        i2 = R.color.text_title;
                    } else {
                        i2 = R.color.ud_R500;
                    }
                    textView3.setTextColor(C60773o.m236126d(i2));
                    IconFontView iconFontView = this.f159732a;
                    if (!z) {
                        i3 = R.color.ud_R500;
                    }
                    iconFontView.setTextColor(C60773o.m236126d(i3));
                } else if (vCTabListItem.getMeetingType() == VideoChat.Type.CALL) {
                    UserInfoService.getChatterById(historyAbbrInfo.getInteracterUserId(), new GetUserInfoListener() {
                        /* class com.ss.android.vc.meeting.module.tab.history.view.C63309b.C63310a.C633111 */

                        @Override // com.ss.android.vc.net.service.GetUserInfoListener
                        public void onGetUserInfo(VideoChatUser videoChatUser) {
                            int i;
                            String name = videoChatUser.getName();
                            boolean z = true;
                            if (historyAbbrInfo.getCallCount() > 1) {
                                C63310a.this.f159736e.setText(String.format(" (%d)", Long.valueOf(historyAbbrInfo.getCallCount())));
                                C63310a.this.f159736e.setVisibility(0);
                            } else {
                                C63310a.this.f159736e.setVisibility(8);
                            }
                            if (historyAbbrInfo.getCallStatus() == VCHistoryAbbrInfo.CallStatus.CANCELED && historyAbbrInfo.getHistoryType() == VCHistoryAbbrInfo.HistoryType.BE_CALLED) {
                                z = false;
                            }
                            C63310a.this.f159735d.setText(name);
                            TextView textView = C63310a.this.f159735d;
                            int i2 = R.color.text_title;
                            if (z) {
                                i = R.color.text_title;
                            } else {
                                i = R.color.ud_R500;
                            }
                            textView.setTextColor(C60773o.m236126d(i));
                            TextView textView2 = C63310a.this.f159736e;
                            if (!z) {
                                i2 = R.color.ud_R500;
                            }
                            textView2.setTextColor(C60773o.m236126d(i2));
                        }
                    });
                }
                this.f159737f.setText(C63327d.m248056d(vCTabListItem.getMeetingTime()));
                String sameTenantId = vCTabListItem.getSameTenantId();
                boolean c = VideoChatModuleDependency.getLoginDependency().mo196421c();
                if (!VideoChatModuleDependency.m236632e() || c) {
                    this.f159734c.setVisibility(8);
                } else if (vCTabListItem.isContainsMultipleTenant() || (!TextUtils.isEmpty(sameTenantId) && !VideoChatModule.getDependency().getTenantId().equals(sameTenantId))) {
                    this.f159734c.setVisibility(0);
                } else {
                    this.f159734c.setVisibility(8);
                }
                if (vCTabListItem.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_CALENDAR || vCTabListItem.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                    this.f159732a.setVisibility(0);
                } else {
                    this.f159732a.setVisibility(8);
                }
                if (vCTabListItem.getMeetingStatus() == VCTabListItem.MeetingStatus.MEETING_ON_THE_CALL) {
                    this.f159733b.setVisibility(0);
                    this.f159739h.setVisibility(0);
                } else {
                    this.f159733b.setVisibility(8);
                    this.f159739h.setVisibility(8);
                }
                if (vCTabListItem.getContentLogos() == null || vCTabListItem.getContentLogos().size() <= 0) {
                    this.f159738g.setVisibility(8);
                    this.f159740i.setVisibility(8);
                    this.f159741j.setVisibility(8);
                    this.f159742k.setVisibility(8);
                    this.f159743l.setVisibility(8);
                } else {
                    this.f159738g.setVisibility(0);
                    if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.RECORD)) {
                        this.f159743l.setVisibility(0);
                    } else {
                        this.f159743l.setVisibility(8);
                    }
                    if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.MS_CCM)) {
                        this.f159741j.setVisibility(0);
                    } else {
                        this.f159741j.setVisibility(8);
                    }
                    if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.MS_URL)) {
                        this.f159742k.setVisibility(0);
                    } else {
                        this.f159742k.setVisibility(8);
                    }
                    if (vCTabListItem.getContentLogos().contains(VideoChat.LogoType.LARK_MINUTES)) {
                        this.f159740i.setVisibility(0);
                    } else {
                        this.f159740i.setVisibility(8);
                    }
                }
                this.itemView.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.vc.meeting.module.tab.history.view.C63309b.C63310a.C633122 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        VcTabDetailActivity.m247621a(C63310a.this.itemView.getContext(), new VcTabDetailEntryParam.Builder().mo218848b(vCTabListItem.getHistoryId()).mo218845a(vCTabListItem.getMeetingId()).mo218849c(vCTabListItem.getHistoryAbbrInfo().getInteracterUserId()).mo218844a(Boolean.valueOf(!vCTabListItem.isSubscribeDetailChange())).mo218847b((Boolean) false).mo218846a());
                        ce.m250261a();
                        VCTabEvent.m249740a(str, vCTabListItem.getMeetingId());
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public C63310a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C63310a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tab_his_group_item_layout, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C63310a aVar, int i) {
        List<VCTabListItem> list = this.f159729a;
        if (list != null && i < list.size() && this.f159729a.get(i) != null) {
            VCTabListItem vCTabListItem = this.f159729a.get(i);
            Objects.requireNonNull(vCTabListItem);
            aVar.mo219087a(vCTabListItem, this.f159731c);
            if (i == 0) {
                C60735ab.m236002a(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$b$lfbqvTcaOiXAEvRPKusZRM5OVII */

                    public final void run() {
                        C63309b.m248001a(C63309b.C63310a.this);
                    }
                }, 300);
            }
        }
    }
}
