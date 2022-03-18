package com.ss.android.vc.meeting.module.tab3.list.mvp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63395d;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.C63398e;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.VCTabFunctionItemType;
import com.ss.android.vc.meeting.module.tab3.list.p3174a.AbstractC63369a;
import com.ss.android.vc.meeting.module.tab3.list.p3174a.C63371c;
import com.ss.android.vc.meeting.module.tab3.list.p3174a.C63372d;
import com.ss.android.vc.meeting.module.tab3.list.view.BootRelativeLayout;
import com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event2.VCTabEvent3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.b */
public class C63375b {

    /* renamed from: a */
    protected RecyclerView f160003a;

    /* renamed from: b */
    protected C63395d f160004b;

    /* renamed from: c */
    protected List<C63398e> f160005c = new ArrayList();

    /* renamed from: d */
    private final BootRelativeLayout f160006d;

    /* renamed from: e */
    private C63372d f160007e;

    /* renamed from: f */
    private LinearLayout f160008f;

    /* renamed from: g */
    private MeetingListView f160009g;

    /* renamed from: a */
    public MeetingListView mo219304a() {
        return this.f160009g;
    }

    /* renamed from: f */
    public View mo219315f() {
        return this.f160006d;
    }

    /* renamed from: g */
    public ITitleInfo mo219316g() {
        return this.f160007e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C63395d mo219310b() {
        return new C63395d();
    }

    /* renamed from: d */
    public void mo219313d() {
        this.f160009g.mo219401d();
    }

    /* renamed from: c */
    public void mo219312c() {
        mo219305a(this.f160006d);
        this.f160009g.mo219398b();
        VCTabEvent3.f160816b.mo220245a();
    }

    /* renamed from: e */
    public void mo219314e() {
        C60700b.m235851b("VideoChatTab_VCTabListView", "[onLoadMoreError]", "start");
        MeetingListView meetingListView = this.f160009g;
        if (meetingListView != null) {
            meetingListView.mo219402e();
        }
    }

    /* renamed from: a */
    private AbstractC63369a m248314a(ITitleController iTitleController) {
        iTitleController.mo99192a(false);
        C63372d dVar = new C63372d();
        this.f160007e = dVar;
        dVar.mo219292a(true);
        C63371c cVar = new C63371c(this.f160006d.getContext(), iTitleController, this.f160007e);
        cVar.mo219283a();
        cVar.mo219285a(UIHelper.getString(R.string.View_MV_MeetingsTab));
        View findViewById = this.f160006d.findViewById(R.id.stub_title_bar);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.height = iTitleController.mo99189a();
        findViewById.setLayoutParams(marginLayoutParams);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo219305a(View view) {
        boolean z;
        if (this.f160003a == null || this.f160004b == null) {
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tab_recycler);
            this.f160003a = recyclerView;
            recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 4));
            C63395d b = mo219310b();
            this.f160004b = b;
            this.f160003a.setAdapter(b);
        }
        this.f160005c.clear();
        this.f160005c.add(new C63398e(VCTabFunctionItemType.CREATE_MEETING));
        this.f160005c.add(new C63398e(VCTabFunctionItemType.JOIN_MEETING));
        this.f160005c.add(new C63398e(VCTabFunctionItemType.SCHEDULE_MEETING));
        if (C63634c.m249496b("byteview.callmeeting.android.lm_tab")) {
            this.f160005c.add(new C63398e(VCTabFunctionItemType.MEETING_MINUTES));
        }
        if (!C63634c.m249496b("byteview.pstn.android.businessphone_mobile") || !VideoChatService.m249602d().mo220083c()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f160005c.add(new C63398e(VCTabFunctionItemType.ENTERPRISE_PHONE));
        }
        this.f160004b.mo219382a(this.f160005c);
    }

    /* renamed from: a */
    public void mo219309a(boolean z) {
        int i;
        LinearLayout linearLayout = this.f160008f;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        this.f160009g.mo219397a(z);
    }

    public C63375b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f160006d = (BootRelativeLayout) layoutInflater.inflate(R.layout.vc_fragment_tab3, viewGroup, false);
    }

    /* renamed from: b */
    public void mo219311b(List<VCTabListItem> list, boolean z) {
        C60700b.m235851b("VideoChatTab_VCTabListView", "onUpcomingData", "isUpcomingHasMore = " + z);
        MeetingListView meetingListView = this.f160009g;
        if (meetingListView != null) {
            meetingListView.mo219399b(list, z);
        }
    }

    /* renamed from: a */
    private void m248316a(View view, Boolean bool) {
        int i;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.no_connection_layout);
        this.f160008f = linearLayout;
        if (bool.booleanValue()) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    /* renamed from: a */
    public void mo219306a(ITitleController iTitleController, MeetingListView.AbstractC63402a aVar) {
        C60700b.m235851b("VideoChatTab_VCTabListView", "[init]", "start");
        AbstractC63369a a = m248314a(iTitleController);
        mo219305a(this.f160006d);
        m248316a(this.f160006d, Boolean.valueOf(C60785x.m236238b()));
        m248315a(this.f160006d, a, aVar);
        VCTabEvent3.f160816b.mo220245a();
    }

    /* renamed from: a */
    public void mo219307a(List<VCTabListItem> list, boolean z) {
        C60700b.m235851b("VideoChatTab_VCTabListView", "onMoreHistoryData", "start");
        MeetingListView meetingListView = this.f160009g;
        if (meetingListView != null) {
            meetingListView.mo219395a(list, z);
        }
    }

    /* renamed from: a */
    private void m248315a(View view, AbstractC63369a aVar, MeetingListView.AbstractC63402a aVar2) {
        MeetingListView meetingListView = (MeetingListView) view.findViewById(R.id.meeting_list_view);
        this.f160009g = meetingListView;
        meetingListView.setTitleBar(aVar);
        this.f160009g.mo219394a(view, aVar2);
    }

    /* renamed from: a */
    public void mo219308a(List<VCTabListItem> list, boolean z, boolean z2, String str) {
        C60700b.m235851b("VideoChatTab_VCTabListView", "onData", "transfer data");
        this.f160009g.mo219396a(list, z, z2, str);
    }
}
