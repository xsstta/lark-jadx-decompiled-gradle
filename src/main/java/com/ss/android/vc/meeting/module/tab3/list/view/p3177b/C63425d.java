package com.ss.android.vc.meeting.module.tab3.list.view.p3177b;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView;
import com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63425d;
import com.ss.android.vc.meeting.module.tab3.widgets.utils.DateTimeUtils;
import com.ss.android.vc.statistics.event2.VCTabEvent3;
import java.util.HashMap;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.b.d */
public class C63425d extends AbstractC63411a {

    /* renamed from: a */
    public TextView f160154a;

    /* renamed from: b */
    public View f160155b;

    /* renamed from: c */
    public TextView f160156c;

    /* renamed from: d */
    public TextView f160157d;

    /* renamed from: e */
    public TextView f160158e;

    /* renamed from: f */
    public View f160159f;

    /* renamed from: g */
    public View f160160g;

    /* renamed from: h */
    public ConstraintLayout f160161h;

    /* renamed from: i */
    public MeetingListView.AbstractC63402a f160162i;

    /* renamed from: j */
    private C60745ag.C60746a f160163j;

    /* renamed from: k */
    private Runnable f160164k;

    @Override // com.ss.android.vc.meeting.module.tab3.list.view.p3177b.AbstractC63411a
    /* renamed from: a */
    public View mo219421a() {
        return this.f160160g;
    }

    /* renamed from: d */
    private void m248492d() {
        this.f160161h.setMaxHeight(C60773o.m236115a(88.0d));
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f160156c.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f160157d.getLayoutParams();
        layoutParams.f2826r = -1;
        layoutParams.f2827s = 0;
        layoutParams.f2819k = -1;
        layoutParams.f2818j = R.id.upcoming_meeting_id;
        layoutParams.f2834z = BitmapDescriptorFactory.HUE_RED;
        layoutParams2.f2824p = -1;
        layoutParams2.f2825q = R.id.upcoming_date_range;
        layoutParams2.f2816h = -1;
        layoutParams2.f2817i = R.id.upcoming_date_range;
        layoutParams2.f2826r = -1;
        layoutParams2.f2827s = -1;
        layoutParams2.f2818j = -1;
        layoutParams2.f2819k = 0;
        layoutParams2.f2834z = BitmapDescriptorFactory.HUE_RED;
        layoutParams2.setMargins(0, 0, 0, 0);
        this.f160156c.setLayoutParams(layoutParams);
        this.f160157d.setLayoutParams(layoutParams2);
        this.f160156c.setVisibility(0);
        this.f160159f.setVisibility(8);
        this.f160158e.setVisibility(8);
    }

    /* renamed from: b */
    private void m248490b() {
        this.f160161h.setMaxHeight(C60773o.m236115a(70.0d));
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f160156c.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f160157d.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.f160158e.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) this.f160159f.getLayoutParams();
        layoutParams3.f2825q = 0;
        layoutParams3.f2824p = -1;
        layoutParams3.f2817i = R.id.upcoming_title;
        layoutParams3.f2816h = -1;
        layoutParams4.f2824p = R.id.upcoming_countdown;
        layoutParams4.f2826r = R.id.upcoming_meeting_id;
        layoutParams4.f2816h = R.id.upcoming_countdown;
        layoutParams4.f2819k = R.id.upcoming_countdown;
        layoutParams2.f2825q = -1;
        layoutParams2.f2824p = R.id.upcoming_divider1;
        layoutParams2.f2817i = -1;
        layoutParams2.f2816h = R.id.upcoming_countdown;
        layoutParams2.f2827s = -1;
        layoutParams2.f2826r = -1;
        layoutParams2.f2818j = -1;
        layoutParams2.f2819k = R.id.upcoming_countdown;
        layoutParams2.setMargins(C60773o.m236115a(8.0d), 0, 0, 0);
        this.f160158e.setLayoutParams(layoutParams3);
        this.f160159f.setLayoutParams(layoutParams4);
        this.f160157d.setLayoutParams(layoutParams2);
        this.f160158e.setVisibility(0);
        this.f160159f.setVisibility(0);
        this.f160156c.setVisibility(8);
    }

    /* renamed from: c */
    private void m248491c() {
        this.f160161h.setMaxHeight(C60773o.m236115a(70.0d));
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f160156c.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f160159f.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.f160157d.getLayoutParams();
        layoutParams.f2827s = -1;
        layoutParams.f2826r = R.id.upcoming_divider1;
        layoutParams.f2818j = -1;
        layoutParams.f2819k = 0;
        layoutParams.f2834z = BitmapDescriptorFactory.HUE_RED;
        layoutParams2.f2824p = R.id.upcoming_date_range;
        layoutParams2.f2826r = R.id.upcoming_meeting_id;
        layoutParams2.f2816h = R.id.upcoming_date_range;
        layoutParams2.f2819k = R.id.upcoming_date_range;
        layoutParams3.f2825q = -1;
        layoutParams3.f2824p = R.id.upcoming_divider1;
        layoutParams3.f2817i = -1;
        layoutParams3.f2816h = R.id.upcoming_date_range;
        layoutParams3.f2826r = -1;
        layoutParams3.f2827s = -1;
        layoutParams3.f2817i = -1;
        layoutParams3.f2816h = R.id.upcoming_date_range;
        layoutParams3.f2818j = -1;
        layoutParams3.f2819k = R.id.upcoming_date_range;
        layoutParams3.setMargins(C60773o.m236115a(8.0d), 0, 0, 0);
        this.f160156c.setLayoutParams(layoutParams);
        this.f160159f.setLayoutParams(layoutParams2);
        this.f160157d.setLayoutParams(layoutParams3);
        this.f160156c.setVisibility(0);
        this.f160159f.setVisibility(0);
        this.f160158e.setVisibility(8);
    }

    /* renamed from: a */
    public void mo219434a(MeetingListView.AbstractC63402a aVar) {
        if (aVar != null) {
            this.f160162i = aVar;
        }
    }

    public C63425d(View view) {
        super(view);
        this.f160161h = (ConstraintLayout) view.findViewById(R.id.upcoming_content_container);
        this.f160154a = (TextView) view.findViewById(R.id.upcoming_title);
        this.f160155b = view.findViewById(R.id.upcoming_external);
        this.f160156c = (TextView) view.findViewById(R.id.upcoming_date_range);
        this.f160157d = (TextView) view.findViewById(R.id.upcoming_meeting_id);
        this.f160158e = (TextView) view.findViewById(R.id.upcoming_countdown);
        this.f160159f = view.findViewById(R.id.upcoming_divider1);
        this.f160160g = view.findViewById(R.id.bottom_divider);
    }

    @Override // com.ss.android.vc.meeting.module.tab3.list.view.p3177b.AbstractC63411a
    /* renamed from: a */
    public void mo219422a(VCTabListItem vCTabListItem, String str) {
        final float f;
        final float f2;
        String str2;
        if (vCTabListItem == null) {
            C60700b.m235851b("HistoryViewHolder", "[bind]", "bind upcoming failed. model is null.");
            return;
        }
        String meetingTopic = vCTabListItem.getMeetingTopic();
        if (!TextUtils.isEmpty(meetingTopic) && vCTabListItem.getMeetingSource() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", meetingTopic);
            meetingTopic = UIHelper.mustacheFormat(UIHelper.getString(R.string.View_M_VideoInterviewNameBraces), hashMap);
        }
        TextView textView = this.f160154a;
        if (TextUtils.isEmpty(meetingTopic)) {
            meetingTopic = C60773o.m236119a((int) R.string.View_G_ServerNoTitle);
        }
        textView.setText(meetingTopic);
        String sameTenantId = vCTabListItem.getSameTenantId();
        boolean c = VideoChatModuleDependency.getLoginDependency().mo196421c();
        if (!VideoChatModuleDependency.m236632e() || c) {
            this.f160155b.setVisibility(8);
        } else if (vCTabListItem.isContainsMultipleTenant() || (!TextUtils.isEmpty(sameTenantId) && !VideoChatModule.getDependency().getTenantId().equals(sameTenantId))) {
            this.f160155b.setVisibility(0);
        } else {
            this.f160155b.setVisibility(8);
        }
        String a = DateTimeUtils.m248534a(vCTabListItem.getMeetingTime() * 1000, vCTabListItem.getEndTime() * 1000);
        TextPaint paint = this.f160156c.getPaint();
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (paint == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = this.f160156c.getPaint().measureText(a);
        }
        this.f160156c.setText(a);
        String a2 = C60773o.m236119a((int) R.string.View_M_MeetingIDShort);
        if (!TextUtils.isEmpty(vCTabListItem.getMeetingNumber())) {
            a2 = a2 + C60754h.m236085a(vCTabListItem.getMeetingNumber());
        }
        if (this.f160157d.getPaint() == null) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f2 = this.f160157d.getPaint().measureText(a2);
        }
        this.f160157d.setText(a2);
        C60745ag.C60746a aVar = this.f160163j;
        if (aVar != null) {
            aVar.mo208366a(true);
        }
        C60735ab.m236011b(this.f160164k);
        long a3 = DateTimeUtils.m248532a();
        final long meetingTime = vCTabListItem.getMeetingTime() * 1000;
        if (a3 >= meetingTime) {
            str2 = C60773o.m236119a((int) R.string.View_G_RightNowTime);
        } else {
            long j = meetingTime - a3;
            if (j >= 900000) {
                RunnableC634283 r11 = new Runnable() {
                    /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63425d.RunnableC634283 */

                    public void run() {
                        C63425d.this.mo219432a(f, f2, meetingTime);
                    }
                };
                this.f160164k = r11;
                C60735ab.m236002a(r11, j - 900000);
                str2 = "";
            } else {
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_MV_HowManyMinutesLater, "Minutes", String.valueOf((int) ((j / 60000) + 1)));
                RunnableC634294 r12 = new Runnable() {
                    /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63425d.RunnableC634294 */

                    public void run() {
                        C63425d.this.mo219432a(f, f2, meetingTime);
                    }
                };
                this.f160164k = r12;
                C60735ab.m236002a(r12, j % 60000);
                str2 = mustacheFormat;
            }
        }
        if (this.f160158e.getPaint() != null) {
            f3 = this.f160158e.getPaint().measureText(str2);
        }
        this.f160158e.setText(str2);
        mo219431a(f, f2, f3);
    }

    /* renamed from: a */
    public void mo219433a(final VCTabListItem vCTabListItem, String str, final String str2) {
        mo219422a(vCTabListItem, str);
        if (TextUtils.isEmpty(str2)) {
            this.itemView.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63425d.C634261 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C60700b.m235861e("HistoryViewHolder", "[bind]", "empty calendarId");
                }
            });
        } else {
            this.itemView.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63425d.C634272 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("meeting_number", vCTabListItem.getMeetingNumber());
                    VCTabEvent3.f160816b.mo220252a("upcoming_meeting", "cal_event_detail_view", hashMap);
                    VideoChatModuleDependency.getDependency().getCalendarDependency().openCalendarDetailPage(ar.m236698c(), str2, vCTabListItem.getKey(), vCTabListItem.getOriginalTime(), vCTabListItem.getMeetingTime());
                    if (C63425d.this.f160162i != null) {
                        C63425d.this.f160162i.mo219303c();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo219431a(float f, float f2, float f3) {
        if (this.f160156c != null && this.f160157d != null && this.f160158e != null) {
            int a = C60776r.m236139a() - C60773o.m236115a(32.0d);
            int a2 = C60773o.m236115a(17.0d);
            if (f3 > BitmapDescriptorFactory.HUE_RED) {
                m248490b();
            } else if (f + f2 + ((float) a2) <= ((float) a)) {
                m248491c();
            } else {
                m248492d();
            }
        }
    }

    /* renamed from: a */
    public void mo219432a(final float f, final float f2, final long j) {
        if (this.f160156c != null && this.f160157d != null && this.f160158e != null) {
            C60745ag.C60746a aVar = this.f160163j;
            if (aVar != null) {
                aVar.mo208366a(true);
            }
            this.f160163j = C60745ag.m236064a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63425d.RunnableC634305 */

                public void run() {
                    String str;
                    float f;
                    long a = DateTimeUtils.m248532a();
                    long j = j;
                    if (a > j) {
                        str = C60773o.m236119a((int) R.string.View_G_RightNowTime);
                    } else if (j - a < 900000) {
                        str = UIHelper.mustacheFormat((int) R.string.View_MV_HowManyMinutesLater, "Minutes", String.valueOf((int) (((j - a) / 60000) + 1)));
                    } else {
                        str = "";
                    }
                    if (C63425d.this.f160158e.getPaint() == null) {
                        f = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f = C63425d.this.f160158e.getPaint().measureText(str);
                    }
                    C60735ab.m236001a(new Runnable(str, f, f2, f) {
                        /* class com.ss.android.vc.meeting.module.tab3.list.view.p3177b.$$Lambda$d$5$nJSgpjSMryrbZvoU0qCwTIhrMeQ */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ float f$2;
                        public final /* synthetic */ float f$3;
                        public final /* synthetic */ float f$4;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                        }

                        public final void run() {
                            C63425d.RunnableC634305.lambda$nJSgpjSMryrbZvoU0qCwTIhrMeQ(C63425d.RunnableC634305.this, this.f$1, this.f$2, this.f$3, this.f$4);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m248499a(String str, float f, float f2, float f3) {
                    C63425d.this.f160158e.setText(str);
                    C63425d.this.mo219431a(f, f2, f3);
                }
            }, 0, 60000);
        }
    }
}
