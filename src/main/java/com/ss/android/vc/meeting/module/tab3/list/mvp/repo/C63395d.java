package com.ss.android.vc.meeting.module.tab3.list.mvp.repo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.C63767p;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VCTabEvent3;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.d */
public class C63395d extends RecyclerView.Adapter {

    /* renamed from: a */
    protected List<C63398e> f160063a = Collections.emptyList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f160063a.size();
    }

    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.d$a */
    static class C63396a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        protected View f160064a;

        /* renamed from: b */
        protected TextView f160065b;

        /* renamed from: c */
        protected View f160066c;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m248403a(Boolean bool) {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m248406b(Boolean bool) {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ Boolean m248401a() {
            VideoChatModule.m235659c().mo208162e(VCAppLifeCycle.m236256c());
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ Boolean m248404b() {
            VideoChatModule.m235659c().mo208161d(VCAppLifeCycle.m236256c());
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m248409e(View view) {
            C60700b.m235851b("VCTabFunctionAreaAdapter", "[onClick]", "NewMeeting");
            VCTabEvent3.f160816b.mo220252a("new_meeting", "vc_meeting_pre_view", (Map<String, String>) null);
            C57865c.m224574a($$Lambda$d$a$kYibRfIBHSEUT2qD9QvxyXC0MI.INSTANCE, $$Lambda$d$a$nX2nFGIhUJQe2dXlXa51MeJKrI.INSTANCE);
        }

        C63396a(View view) {
            super(view);
            this.f160066c = view.findViewById(R.id.item);
            this.f160064a = view.findViewById(R.id.item_img);
            this.f160065b = (TextView) view.findViewById(R.id.item_desc);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m248402a(View view) {
            C60700b.m235851b("VCTabFunctionAreaAdapter", "[onClick5]", "NewEnterprisePhoneCall");
            C63767p.m250330a();
            C57865c.m224574a($$Lambda$d$a$BwYLJCaWfC6VFJ2BIqvP0BWRQ.INSTANCE, $$Lambda$d$a$axM465NJz27529iVqisEIEM4g0.INSTANCE);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m248405b(View view) {
            C60700b.m235851b("VCTabFunctionAreaAdapter", "[onClick4]", "[gotoSchedulePage]");
            VCTabEvent3.f160816b.mo220252a("schedule", "cal_event_full_create_view", (Map<String, String>) null);
            VideoChatModule.getDependency().getCalendarDependency().openCreateCalendarPage(ar.m236694a(), "", 0, 0, true);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ void m248407c(View view) {
            C60700b.m235851b("VCTabFunctionAreaAdapter", "[onClick3]", "gotoMeetingMinutes");
            VCTabEvent3.f160816b.mo220252a("lark_minutes", "vc_minutes_list_view", (Map<String, String>) null);
            ce.m250274g();
            VideoChatModuleDependency.getMinutesDependency().mo196439a(ar.m236694a());
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m248408d(View view) {
            C60700b.m235851b("VCTabFunctionAreaAdapter", "[onClick2]", "joinMeeting");
            VCTabEvent3.f160816b.mo220252a("join_meeting", "vc_meeting_pre_view", (Map<String, String>) null);
            VideoChatService.m249602d().openJoinMeetingPage(ar.m236694a(), "tab_top_join_room");
        }

        /* renamed from: a */
        public void mo219383a(C63398e eVar) {
            VCTabFunctionItemType a = eVar.mo219385a();
            if (a == VCTabFunctionItemType.CREATE_MEETING) {
                this.f160064a.setBackground(C60773o.m236128f(R.drawable.vc_tab_new_meeting_selector));
                this.f160065b.setText(C60773o.m236119a((int) R.string.View_T_NewMeeting));
                this.f160066c.setOnClickListener($$Lambda$d$a$NFPxHfHs6cu0bLiYoscEWwH_9xc.INSTANCE);
            } else if (a == VCTabFunctionItemType.JOIN_MEETING) {
                this.f160064a.setBackground(C60773o.m236128f(R.drawable.vc_tab_join_meeting_selector));
                this.f160065b.setText(C60773o.m236119a((int) R.string.View_MV_JoinMeetingButton));
                this.f160066c.setOnClickListener($$Lambda$d$a$IWZ2Tb68pLRONmtjuWAT0gIfOxg.INSTANCE);
            } else if (a == VCTabFunctionItemType.MEETING_MINUTES) {
                this.f160064a.setBackground(C60773o.m236128f(R.drawable.vc_tab_minutes_selector));
                this.f160065b.setText(UIHelper.mustacheFormat((int) R.string.View_G_FeishuMinutes, "appName", UIHelper.getAppName()));
                this.f160066c.setOnClickListener($$Lambda$d$a$U8BkIjdiaDwzLoF1WjJW7jOyDeg.INSTANCE);
            } else if (a == VCTabFunctionItemType.SCHEDULE_MEETING) {
                this.f160064a.setBackground(C60773o.m236128f(R.drawable.vc_tab_calendar_selector));
                this.f160065b.setText(C60773o.m236119a((int) R.string.View_MV_ScheduleMeetingButton));
                this.f160066c.setOnClickListener($$Lambda$d$a$FFGw2Q49AEjCXFkNWGJ1E6cwscQ.INSTANCE);
            } else if (a == VCTabFunctionItemType.ENTERPRISE_PHONE) {
                this.f160064a.setBackground(C60773o.m236128f(R.drawable.vc_tab_new_enterprise_phone_selector));
                this.f160065b.setText(C60773o.m236119a((int) R.string.View_MV_Phone_MeetingButton));
                this.f160066c.setOnClickListener($$Lambda$d$a$eMmnzNKvkPGz0wI2u72tEfX0O80.INSTANCE);
            } else {
                C60700b.m235851b("VCTabFunctionAreaAdapter", "[onClick6]", "nothing");
            }
            this.f160065b.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63395d.C63396a.ViewTreeObserver$OnPreDrawListenerC633971 */

                public boolean onPreDraw() {
                    C63396a.this.f160065b.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (C63396a.this.f160065b.getLineCount() == 1) {
                        C63396a.this.f160066c.setPadding(0, C60773o.m236115a(10.0d), 0, C60773o.m236115a(14.0d));
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo219382a(List<C63398e> list) {
        this.f160063a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C63398e eVar = this.f160063a.get(i);
        if (viewHolder instanceof C63396a) {
            ((C63396a) viewHolder).mo219383a(eVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C63396a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vc_tab_function_area_item_layout, viewGroup, false));
    }
}
