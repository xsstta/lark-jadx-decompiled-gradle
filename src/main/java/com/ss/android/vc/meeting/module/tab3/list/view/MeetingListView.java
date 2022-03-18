package com.ss.android.vc.meeting.module.tab3.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1235b.C27136d;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27139c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab3.list.p3174a.AbstractC63369a;
import com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView;
import com.ss.android.vc.meeting.module.tab3.widgets.PageEmptyView;
import com.ss.android.vc.meeting.module.tab3.widgets.PageErrorView;
import com.ss.android.vc.meeting.module.tab3.widgets.PageLoadingView;
import com.ss.android.vc.meeting.module.tab3.widgets.RefreshLayout;
import com.ss.android.vc.meeting.module.tab3.widgets.StickyRecyclerView;
import com.ss.android.vc.statistics.event2.VCTabEvent3;
import com.ss.android.vc.statistics.p3180a.C63694f;
import java.util.List;
import java.util.Map;

public class MeetingListView extends FrameLayout {

    /* renamed from: a */
    public RefreshLayout f160071a;

    /* renamed from: b */
    public boolean f160072b;

    /* renamed from: c */
    public StickyRecyclerView f160073c;

    /* renamed from: d */
    public View f160074d;

    /* renamed from: e */
    public AbstractC63369a f160075e;

    /* renamed from: f */
    private long f160076f;

    /* renamed from: g */
    private long f160077g;

    /* renamed from: h */
    private C26198f f160078h;

    /* renamed from: i */
    private C63433c f160079i;

    /* renamed from: j */
    private C63404a f160080j;

    /* renamed from: k */
    private PageLoadingView f160081k;

    /* renamed from: l */
    private PageErrorView f160082l;

    /* renamed from: m */
    private PageEmptyView f160083m;

    /* renamed from: n */
    private State f160084n = State.IDLE;

    /* renamed from: o */
    private AbstractC63402a f160085o;

    public enum State {
        IDLE,
        LOADING,
        NORMAL,
        ERROR
    }

    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView$a */
    public interface AbstractC63402a {
        /* renamed from: a */
        void mo219301a();

        /* renamed from: b */
        void mo219302b();

        /* renamed from: c */
        void mo219303c();
    }

    /* renamed from: a */
    public void mo219397a(boolean z) {
        if (z) {
            if (this.f160084n == State.IDLE || this.f160084n == State.ERROR) {
                mo219398b();
            }
        } else if (this.f160084n == State.IDLE) {
            mo219401d();
        }
    }

    /* renamed from: a */
    public void mo219396a(List<VCTabListItem> list, boolean z, boolean z2, String str) {
        this.f160084n = State.NORMAL;
        m248424c(true);
        m248426g();
        this.f160081k.mo219452a();
        this.f160082l.mo219446a();
        if (list.isEmpty()) {
            this.f160083m.mo219443a();
        } else {
            this.f160083m.mo219444b();
        }
        this.f160080j.mo219412a(list, z, str);
        this.f160073c.setVisibility(list.isEmpty() ? 8 : 0);
        m248422b(true);
        mo219393a();
        if (this.f160076f != 0) {
            C63694f.m249696a(System.currentTimeMillis() - this.f160076f);
            this.f160076f = 0;
        }
        if (this.f160077g != 0) {
            C63694f.m249700b(System.currentTimeMillis() - this.f160077g);
            this.f160077g = 0;
        }
        this.f160072b = z2;
    }

    /* renamed from: e */
    public void mo219402e() {
        this.f160071a.mo219456y();
    }

    /* renamed from: g */
    private void m248426g() {
        this.f160071a.mo96404i(true);
        this.f160071a.mo96407j(true);
    }

    private int getEntryHeight() {
        return ((CoordinatorLayout) getParent().getParent()).getChildAt(0).getMeasuredHeight();
    }

    /* renamed from: f */
    private void m248425f() {
        StickyRecyclerView stickyRecyclerView = (StickyRecyclerView) findViewById(R.id.tab_vc_rv);
        this.f160073c = stickyRecyclerView;
        stickyRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView.C634002 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (MeetingListView.this.f160075e != null) {
                    MeetingListView.this.f160075e.mo219284a(i, i2);
                }
                if (MeetingListView.this.getScrolledY() > 0) {
                    MeetingListView.this.f160074d.setVisibility(0);
                } else {
                    MeetingListView.this.f160074d.setVisibility(8);
                }
            }
        });
        C63404a aVar = new C63404a(this.f160085o);
        this.f160080j = aVar;
        aVar.setHasStableIds(true);
        this.f160073c.setAdapter(this.f160080j);
        this.f160073c.setVisibility(0);
        mo219393a();
    }

    /* renamed from: c */
    public void mo219400c() {
        this.f160084n = State.LOADING;
        m248422b(true);
        this.f160073c.setVisibility(8);
        this.f160081k.mo219453a(R.color.bg_body);
        this.f160082l.mo219446a();
        this.f160083m.mo219444b();
        m248424c(false);
        m248426g();
    }

    /* renamed from: d */
    public void mo219401d() {
        this.f160084n = State.ERROR;
        m248422b(true);
        this.f160073c.setVisibility(8);
        this.f160081k.mo219452a();
        this.f160082l.mo219447a(R.color.bg_body);
        this.f160083m.mo219444b();
        m248424c(false);
        m248426g();
    }

    public int getScrolledY() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f160073c.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int i = 0;
        if (findFirstVisibleItemPosition < 0) {
            return 0;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        int height = findViewByPosition.getHeight();
        View a = this.f160078h.mo93181a(this.f160073c, findFirstVisibleItemPosition);
        int top = (findFirstVisibleItemPosition * height) - findViewByPosition.getTop();
        if (a != null) {
            i = a.getHeight();
        }
        return top + i;
    }

    /* renamed from: b */
    public void mo219398b() {
        mo219400c();
        this.f160085o.mo219301a();
    }

    /* renamed from: a */
    public void mo219393a() {
        C26198f fVar = this.f160078h;
        if (fVar != null) {
            this.f160073c.removeItemDecoration(fVar);
        }
        C26198f fVar2 = new C26198f(this.f160080j);
        this.f160078h = fVar2;
        this.f160073c.addItemDecoration(fVar2);
        C63433c cVar = this.f160079i;
        if (cVar != null) {
            this.f160073c.removeOnItemTouchListener(cVar);
        }
        C63433c cVar2 = new C63433c(this.f160073c, this.f160078h);
        this.f160079i = cVar2;
        this.f160073c.addOnItemTouchListener(cVar2);
    }

    public void setTitleBar(AbstractC63369a aVar) {
        this.f160075e = aVar;
    }

    public MeetingListView(Context context) {
        super(context);
    }

    public void setStatisticsId(String str) {
        this.f160080j.mo219409a(str);
    }

    /* renamed from: a */
    private void m248414a(View view) {
        PageLoadingView pageLoadingView = (PageLoadingView) view.findViewById(R.id.loading_view);
        this.f160081k = pageLoadingView;
        pageLoadingView.mo219452a();
    }

    /* renamed from: b */
    private void m248419b(View view) {
        PageEmptyView pageEmptyView = (PageEmptyView) view.findViewById(R.id.empty_view);
        this.f160083m = pageEmptyView;
        pageEmptyView.mo219444b();
    }

    /* renamed from: c */
    private void m248424c(boolean z) {
        this.f160071a.mo96413l(z);
        this.f160071a.mo96415m(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m248416a(AbstractC63402a aVar) {
        this.f160077g = System.currentTimeMillis();
        aVar.mo219302b();
    }

    /* renamed from: c */
    private void m248423c(View view) {
        View findViewById = view.findViewById(R.id.scroll_to_top);
        this.f160074d = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener(view) {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.$$Lambda$MeetingListView$qaq2hqAWf_1P0ap3ew5C6YOhZCs */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                MeetingListView.this.m248415a((MeetingListView) this.f$1, view);
            }
        });
    }

    /* renamed from: b */
    private void m248422b(boolean z) {
        int i;
        View findViewById = ((CoordinatorLayout) getParent().getParent()).findViewById(R.id.entry_divider);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public MeetingListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    private void m248420b(View view, final AbstractC63402a aVar) {
        PageErrorView pageErrorView = (PageErrorView) view.findViewById(R.id.error_view);
        this.f160082l = pageErrorView;
        pageErrorView.mo219446a();
        this.f160082l.setTryReloadingClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView.C634013 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                VCTabEvent3.f160816b.mo220252a("tab_loading_failed", "vc_tab_view", (Map<String, String>) null);
                MeetingListView.this.mo219400c();
                aVar.mo219301a();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m248415a(View view, View view2) {
        this.f160074d.setVisibility(8);
        this.f160073c.smoothScrollToPosition(0);
        ((AppBarLayout.Behavior) ((CoordinatorLayout.LayoutParams) ((AppBarLayout) ((ViewGroup) view).findViewById(R.id.app_bar)).getLayoutParams()).getBehavior()).setTopAndBottomOffset(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m248421b(AbstractC63402a aVar, AbstractC27129h hVar) {
        C60700b.m235851b("VideoChatTab_MeetingListView", "[onRefresh]", "vc tab, refresh");
        this.f160076f = System.currentTimeMillis();
        aVar.mo219301a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248417a(AbstractC63402a aVar, View view) {
        VCTabEvent3.f160816b.mo220252a("history_loading_failed", "vc_tab_view", (Map<String, String>) null);
        aVar.mo219302b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m248418a(AbstractC63402a aVar, AbstractC27129h hVar) {
        C60700b.m235851b("VideoChatTab_MeetingListView", "[onLoadMore]", "vc tab, load more");
        C60735ab.m236002a(new Runnable(aVar) {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.$$Lambda$MeetingListView$JRIgQ2MwoMLHzrMM2aMlodDM1oo */
            public final /* synthetic */ MeetingListView.AbstractC63402a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MeetingListView.this.m248416a((MeetingListView) this.f$1);
            }
        }, 500);
    }

    /* renamed from: b */
    public void mo219399b(List<VCTabListItem> list, boolean z) {
        this.f160080j.mo219411a(list, z);
        mo219393a();
    }

    /* renamed from: a */
    public void mo219394a(View view, AbstractC63402a aVar) {
        LayoutInflater.from(getContext()).inflate(R.layout.vc_view_tab_meeting_list, this);
        this.f160085o = aVar;
        m248413a(getContext(), view, aVar);
        m248425f();
        m248414a(view);
        m248420b(view, aVar);
        m248419b(view);
        m248423c(view);
        mo219398b();
    }

    /* renamed from: a */
    public void mo219395a(List<VCTabListItem> list, boolean z) {
        int i;
        m248426g();
        this.f160080j.mo219410a(list);
        this.f160072b = z;
        StickyRecyclerView stickyRecyclerView = this.f160073c;
        if (this.f160080j.getItems().isEmpty()) {
            i = 8;
        } else {
            i = 0;
        }
        stickyRecyclerView.setVisibility(i);
    }

    public MeetingListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m248413a(Context context, View view, AbstractC63402a aVar) {
        RefreshLayout refreshLayout = (RefreshLayout) view.findViewById(R.id.refresh_layout);
        this.f160071a = refreshLayout;
        refreshLayout.requestFocus();
        this.f160071a.mo219455a(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.$$Lambda$MeetingListView$keyxyuw5eFFrX1VqZ8rYhNO4slQ */

            public final void onClick(View view) {
                MeetingListView.m248417a(MeetingListView.AbstractC63402a.this, view);
            }
        });
        this.f160071a.mo96413l(true);
        this.f160071a.mo96415m(true);
        this.f160071a.mo96373c(1.5f);
        this.f160071a.mo96369b(new AbstractC27139c(aVar) {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.$$Lambda$MeetingListView$9GZzfHJQYHtrFODBQ0fyc7lHmo */
            public final /* synthetic */ MeetingListView.AbstractC63402a f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
            public final void onRefresh(AbstractC27129h hVar) {
                MeetingListView.this.m248421b((MeetingListView) this.f$1, (MeetingListView.AbstractC63402a) hVar);
            }
        });
        this.f160071a.mo96368b(new AbstractC27137a(aVar) {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.$$Lambda$MeetingListView$7Kgqbgg1NTjMue5Qm4edcdwdeUg */
            public final /* synthetic */ MeetingListView.AbstractC63402a f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public final void onLoadmore(AbstractC27129h hVar) {
                MeetingListView.this.m248418a((MeetingListView) this.f$1, (MeetingListView.AbstractC63402a) hVar);
            }
        });
        this.f160071a.mo96354a(new C27136d() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView.C633991 */

            @Override // com.scwang.smartrefresh.layout.p1235b.C27136d, com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
            /* renamed from: a */
            public boolean mo96480a(View view) {
                if (MeetingListView.this.f160071a.mo96427r()) {
                    MeetingListView.this.f160071a.mo96407j(true);
                }
                if (MeetingListView.this.f160073c.getVisibility() == 0) {
                    return true;
                }
                return false;
            }

            @Override // com.scwang.smartrefresh.layout.p1235b.C27136d, com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
            /* renamed from: b */
            public boolean mo96481b(View view) {
                if (MeetingListView.this.f160073c.getVisibility() != 0 || !super.mo96481b(view) || !MeetingListView.this.f160072b) {
                    return false;
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f160081k.getLayoutParams();
            layoutParams.height = getMeasuredHeight() - getEntryHeight();
            this.f160081k.setLayoutParams(layoutParams);
            this.f160082l.setLayoutParams(layoutParams);
            this.f160083m.setLayoutParams(layoutParams);
        }
    }
}
