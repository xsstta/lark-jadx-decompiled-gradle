package com.ss.android.vc.lark.message.meeting.cardview.attendee;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1235b.C27136d;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.entity.AttendeeFromSource;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.C61120c;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VCTabEvent3;
import java.util.List;

/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.f */
public class C61130f implements C61116b.AbstractC61118b {

    /* renamed from: a */
    RecyclerView f153133a;

    /* renamed from: b */
    SmartRefreshLayout f153134b;

    /* renamed from: c */
    protected Activity f153135c;

    /* renamed from: d */
    protected AbstractC61133a f153136d;

    /* renamed from: e */
    protected C61116b.AbstractC61118b.AbstractC61119a f153137e;

    /* renamed from: f */
    protected CommonTitleBar f153138f;

    /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.f$a */
    public interface AbstractC61133a {
        /* renamed from: a */
        void mo211385a();

        /* renamed from: a */
        void mo211387a(String str, String str2, String str3);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f153135c = null;
    }

    /* renamed from: b */
    private void mo211423b() {
        this.f153138f.getLeftText().setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.$$Lambda$f$KX088Llpd0LJoY3Kf56s0O3lAI4 */

            public final void onClick(View view) {
                C61130f.this.m237742a((C61130f) view);
            }
        });
        this.f153134b.mo96354a(new C27136d() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.C61130f.C611311 */

            @Override // com.scwang.smartrefresh.layout.p1235b.C27136d, com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
            /* renamed from: a */
            public boolean mo96480a(View view) {
                return false;
            }

            @Override // com.scwang.smartrefresh.layout.p1235b.C27136d, com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
            /* renamed from: b */
            public boolean mo96481b(View view) {
                return false;
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        mo211422a();
        mo211423b();
        this.f153133a.setLayoutManager(new LinearLayoutManager(this.f153135c));
    }

    /* renamed from: a */
    private void mo211422a() {
        this.f153138f = (CommonTitleBar) this.f153135c.findViewById(R.id.title_container);
        this.f153133a = (RecyclerView) this.f153135c.findViewById(R.id.card_attendee_list);
        this.f153134b = (SmartRefreshLayout) this.f153135c.findViewById(R.id.card_attendee_layout);
    }

    /* renamed from: a */
    public void setViewDelegate(C61116b.AbstractC61118b.AbstractC61119a aVar) {
        this.f153137e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m237742a(View view) {
        this.f153137e.mo211413a();
    }

    public C61130f(Activity activity, AbstractC61133a aVar) {
        this.f153135c = activity;
        this.f153136d = aVar;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61118b
    /* renamed from: a */
    public void mo211412a(final String str, final String str2, List<String> list, List<ParticipantType> list2, List<Participant.DeviceType> list3, List<Boolean> list4, List<Boolean> list5, String str3, final AttendeeFromSource attendeeFromSource, boolean z, long j, String str4) {
        if (list != null && list.size() > 0) {
            this.f153138f.setTitle(UIHelper.mustacheFormat((int) R.string.View_M_ParticipantsNumberBraces, "number", String.valueOf(list.size())));
            C61120c cVar = new C61120c(this.f153135c, str, list, list2, list4, list3, list5, str3, attendeeFromSource);
            cVar.mo211418a(new C61120c.AbstractC61124b() {
                /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.C61130f.C611322 */

                @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61120c.AbstractC61124b
                /* renamed from: a */
                public void mo211420a(String str) {
                    if (attendeeFromSource == AttendeeFromSource.VC_TAB_ATTENDEE) {
                        ce.m250275h();
                        VCTabEvent3.f160816b.mo220249a("user_group_icon", "profile_main_view", str, str2);
                    }
                    C61130f.this.f153137e.mo211414a(str);
                }
            });
            this.f153133a.setAdapter(cVar);
        }
    }
}
