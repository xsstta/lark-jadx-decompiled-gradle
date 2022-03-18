package com.ss.android.vc.meeting.module.tab.history.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2048a;
import com.p078b.p079a.C2052c;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1235b.C27136d;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27139c;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.widget.LoadingLottieView;
import com.ss.android.vc.entity.tab.VCTabListHistoryListEntity;
import com.ss.android.vc.meeting.module.tab.history.mvp.VcTabListDataLoader;
import com.ss.android.vc.meeting.module.tab.history.p3171a.AbstractC63274a;
import com.ss.android.vc.statistics.p3180a.C63694f;

public class VcTabPageView extends FrameLayout {

    /* renamed from: a */
    private VcTabListDataLoader f159692a;

    /* renamed from: b */
    private C63309b f159693b;

    /* renamed from: c */
    private SmartRefreshLayout f159694c;

    /* renamed from: d */
    private C2048a f159695d;

    /* renamed from: e */
    private RecyclerView f159696e;

    /* renamed from: f */
    private LinearLayout f159697f;

    /* renamed from: g */
    private TextView f159698g;

    /* renamed from: h */
    private Context f159699h;

    /* renamed from: i */
    private ViewGroup f159700i;

    /* renamed from: j */
    private AbstractC63274a f159701j;

    /* renamed from: k */
    private long f159702k;

    /* renamed from: l */
    private long f159703l;

    /* renamed from: m */
    private String f159704m;

    /* renamed from: i */
    private boolean m247957i() {
        return UIUtils.canShowSkeleton();
    }

    /* renamed from: j */
    private void m247958j() {
        this.f159694c.setVisibility(0);
        this.f159697f.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private /* synthetic */ void m247961m() {
        this.f159703l = System.currentTimeMillis();
        this.f159692a.mo218989a(VcTabListDataLoader.LoadType.LOAD_MORE);
    }

    /* renamed from: e */
    public boolean mo219064e() {
        VcTabListDataLoader vcTabListDataLoader = this.f159692a;
        if (vcTabListDataLoader != null) {
            return vcTabListDataLoader.mo218996h();
        }
        return false;
    }

    /* renamed from: f */
    private void m247954f() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_vc_tab_pageview, (ViewGroup) this, true);
        m247955g();
        m247956h();
        m247960l();
    }

    /* renamed from: d */
    public void mo219063d() {
        C60700b.m235851b("VideoChatTab_VcTabPageView", "[destroy]", "destroy");
        VcTabListDataLoader vcTabListDataLoader = this.f159692a;
        if (vcTabListDataLoader != null) {
            vcTabListDataLoader.mo218990b();
        }
    }

    /* renamed from: l */
    private void m247960l() {
        this.f159697f = (LinearLayout) findViewById(R.id.view_empty);
        TextView textView = (TextView) findViewById(R.id.tv_empty_tip);
        this.f159698g = textView;
        textView.setText(R.string.View_G_RecentMeetingsWillShowUpHere);
        this.f159697f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VcTabPageView$Z0V7lC3AiUjzGCZOboWjFGgPM */

            public final void onClick(View view) {
                VcTabPageView.this.m247950a((VcTabPageView) view);
            }
        });
    }

    /* renamed from: b */
    public void mo219061b() {
        C2048a aVar;
        if (this.f159696e != null && (aVar = this.f159695d) != null) {
            aVar.mo10130b();
            this.f159695d = null;
            C60700b.m235851b("VideoChatTab_VcTabPageView", "hideSkeleton", "hideSkeleton");
        }
    }

    /* renamed from: c */
    public void mo219062c() {
        int i;
        this.f159693b.mo219084a();
        LinearLayout linearLayout = this.f159697f;
        int i2 = 0;
        if (this.f159692a.mo218992d()) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        RecyclerView recyclerView = this.f159696e;
        if (this.f159692a.mo218992d()) {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
    }

    /* renamed from: g */
    private void m247955g() {
        this.f159694c = (SmartRefreshLayout) this.f159700i.findViewById(R.id.smart_refresh_view);
        this.f159694c.mo96367b(new C63307a(new LoadingLottieView(this.f159699h)));
        this.f159694c.mo96363b((float) 48);
        this.f159694c.mo96413l(true);
        this.f159694c.mo96415m(true);
        this.f159694c.mo96373c(1.5f);
        this.f159694c.mo96369b(new AbstractC27139c() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VcTabPageView$fFdu9kGkVEycFteLtPZ4Grs6Dfw */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
            public final void onRefresh(AbstractC27129h hVar) {
                VcTabPageView.this.m247953b(hVar);
            }
        });
        this.f159694c.mo96368b(new AbstractC27137a() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VcTabPageView$6Dmxrq_YvJxXaIwNWimkYnQfpI */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public final void onLoadmore(AbstractC27129h hVar) {
                VcTabPageView.this.m247952a((VcTabPageView) hVar);
            }
        });
        this.f159694c.mo96354a(new C27136d() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.VcTabPageView.C633001 */

            @Override // com.scwang.smartrefresh.layout.p1235b.C27136d, com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
            /* renamed from: a */
            public boolean mo96480a(View view) {
                return true;
            }

            @Override // com.scwang.smartrefresh.layout.p1235b.C27136d, com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
            /* renamed from: b */
            public boolean mo96481b(View view) {
                if (!super.mo96481b(view) || !C60785x.m236238b() || !VcTabPageView.this.mo219064e()) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: h */
    private void m247956h() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tab_vc_rv);
        this.f159696e = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f159696e.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VcTabPageView$Y90NdMWWGPVY02MlNTFNeMqYg */

            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                VcTabPageView.this.m247951a(view, i, i2, i3, i4);
            }
        });
        C63309b bVar = new C63309b(this.f159692a);
        this.f159693b = bVar;
        bVar.setHasStableIds(true);
        if (!m247957i()) {
            this.f159696e.setAdapter(this.f159693b);
            this.f159696e.setVisibility(0);
        }
    }

    /* renamed from: k */
    private void m247959k() {
        int i;
        C60700b.m235851b("VideoChatTab_VcTabPageView", "[showNormalResultView]", "data load type= " + this.f159692a.mo218995g());
        if (this.f159692a.mo218993e()) {
            this.f159694c.mo96404i(true);
        } else {
            this.f159694c.mo96407j(true);
        }
        this.f159692a.mo218988a();
        this.f159693b.mo219084a();
        LinearLayout linearLayout = this.f159697f;
        int i2 = 0;
        if (this.f159692a.mo218992d()) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        RecyclerView recyclerView = this.f159696e;
        if (this.f159692a.mo218992d()) {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
        if (this.f159702k != 0) {
            C63694f.m249696a(System.currentTimeMillis() - this.f159702k);
            this.f159702k = 0;
        }
        if (this.f159703l != 0) {
            C63694f.m249700b(System.currentTimeMillis() - this.f159703l);
            this.f159703l = 0;
        }
    }

    /* renamed from: a */
    public void mo219057a() {
        VcTabListDataLoader vcTabListDataLoader;
        if (m247957i() && (vcTabListDataLoader = this.f159692a) != null && !vcTabListDataLoader.mo218993e() && !this.f159692a.mo218994f()) {
            C60700b.m235851b("VideoChatTab_VcTabPageView", "[showSkeleton]", "loadType= " + this.f159692a.mo218995g() + " mSkeletonScreen= " + this.f159695d);
            m247958j();
            C2048a aVar = this.f159695d;
            if (aVar == null) {
                this.f159694c.mo96413l(false);
                this.f159696e.setVisibility(0);
                this.f159695d = C2052c.m8960a(this.f159696e).mo10132a(this.f159693b).mo10133a(true).mo10138d(20).mo10136b(false).mo10135b(1000).mo10137c(R.color.vc_static_white_60).mo10139e(R.layout.tab_recyc_item_skeleton_layout).mo10134a();
                return;
            }
            aVar.mo10129a();
        }
    }

    public void setRootView(ViewGroup viewGroup) {
        this.f159700i = viewGroup;
    }

    public void setTitleBar(AbstractC63274a aVar) {
        this.f159701j = aVar;
    }

    public VcTabPageView(Context context) {
        super(context);
        this.f159699h = context;
    }

    public void setDataLoader(VcTabListDataLoader vcTabListDataLoader) {
        this.f159692a = vcTabListDataLoader;
        m247954f();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247950a(View view) {
        VcTabListDataLoader vcTabListDataLoader = this.f159692a;
        if (vcTabListDataLoader != null) {
            vcTabListDataLoader.mo218989a(VcTabListDataLoader.LoadType.REFRESH);
        }
    }

    public void setStatisticsId(String str) {
        this.f159704m = str;
        C63309b bVar = this.f159693b;
        if (bVar != null) {
            bVar.mo219086a(str);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m247953b(AbstractC27129h hVar) {
        C60700b.m235851b("VideoChatTab_VcTabPageView", "[SmartRefreshLayout]", "onRefresh");
        this.f159702k = System.currentTimeMillis();
        this.f159692a.mo218989a(VcTabListDataLoader.LoadType.REFRESH);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247952a(AbstractC27129h hVar) {
        C60700b.m235851b("VideoChatTab_VcTabPageView", "[SmartRefreshLayout2]", "onLoadMore");
        C60735ab.m236002a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VcTabPageView$O6jo52AcL07lKoGdlDTeEzjBoQA */

            public final void run() {
                VcTabPageView.this.m247961m();
            }
        }, 500);
    }

    /* renamed from: a */
    public void mo219058a(VCTabListHistoryListEntity vCTabListHistoryListEntity) {
        C60700b.m235851b("VideoChatTab_VcTabPageView", "[show]", "tab list history data: " + vCTabListHistoryListEntity.toString());
        this.f159694c.mo96413l(true);
        mo219061b();
        m247959k();
    }

    /* renamed from: a */
    public void mo219059a(VcTabListDataLoader.LoadType loadType) {
        C60700b.m235851b("VideoChatTab_VcTabPageView", "[finishLoad]", "type= " + loadType);
        if (loadType == VcTabListDataLoader.LoadType.REFRESH) {
            this.f159694c.mo96404i(true);
        } else if (loadType == VcTabListDataLoader.LoadType.LOAD_MORE) {
            this.f159694c.mo96407j(true);
        }
        this.f159702k = 0;
        this.f159703l = 0;
    }

    /* renamed from: a */
    public void mo219060a(boolean z) {
        int i;
        C60700b.m235851b("VideoChatTab_VcTabPageView", "[hideRefreshView]", "enable=" + z);
        SmartRefreshLayout smartRefreshLayout = this.f159694c;
        if (smartRefreshLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            smartRefreshLayout.setVisibility(i);
        }
        if (!z) {
            this.f159694c.mo96407j(true);
            this.f159694c.mo96404i(true);
        }
    }

    public VcTabPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159699h = context;
    }

    public VcTabPageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f159699h = context;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247951a(View view, int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        int i6 = i2 - i4;
        AbstractC63274a aVar = this.f159701j;
        if (aVar != null) {
            aVar.mo218966a(i5, i6);
        }
    }
}
