package com.bytedance.ee.bear.bitable.card.view;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.performance.OpenCardPerformanceTracker;
import com.bytedance.ee.bear.bitable.card.view.BitableCardStackLayout;
import com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardStackChangedObserver;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.bear.bitable.common.BitableAnalytic;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.AbstractC7719m;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.slideback.SlideFrameLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.b */
public class C4561b extends C7667e implements BitableCardStackChangedObserver {

    /* renamed from: a */
    protected C4771b f13439a;

    /* renamed from: b */
    protected AbstractC4712d f13440b;

    /* renamed from: c */
    protected List<AbstractC7666d> f13441c = new ArrayList();

    /* renamed from: d */
    private BitableCardStackLayout f13442d;

    /* renamed from: e */
    private BitableCardStackLayout.Adapter f13443e;

    /* renamed from: f */
    private BitableAnalytic f13444f;

    /* renamed from: g */
    private DocViewModel f13445g;

    /* renamed from: h */
    private List<AbstractC7720n> f13446h = new ArrayList();

    /* renamed from: i */
    private AbstractC7719m f13447i;

    /* renamed from: j */
    private AbstractC7720n f13448j;

    /* renamed from: a */
    private boolean m18942a() {
        C4535b showingTable = this.f13439a.getShowingTable();
        if (showingTable != null) {
            return showingTable.mo17789n();
        }
        return false;
    }

    /* renamed from: b */
    private void m18944b() {
        this.f13447i = (AbstractC7719m) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7719m.class);
        $$Lambda$b$sYIF0kZLFtUqz9qLOz2sY5U_SM r0 = new AbstractC7720n() {
            /* class com.bytedance.ee.bear.bitable.card.view.$$Lambda$b$sYIF0kZLFtUqz9qLOz2sY5U_SM */

            @Override // com.bytedance.ee.bear.facade.common.AbstractC7720n
            public final boolean onTouchStartIntercept(MotionEvent motionEvent) {
                return C4561b.this.m18943a(motionEvent);
            }
        };
        this.f13448j = r0;
        AbstractC7719m mVar = this.f13447i;
        if (mVar != null) {
            mVar.mo30100a(r0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m18946d() {
        OpenCardPerformanceTracker.f13271a.mo17446a().mo17445f(System.currentTimeMillis());
        OpenCardPerformanceTracker.f13271a.mo17446a().mo17437a(C5234y.m21391b());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        mo17947a(true);
        C4771b bVar = this.f13439a;
        if (bVar != null) {
            bVar.unregisterTableChangedObserver(this);
        }
        AbstractC7719m mVar = this.f13447i;
        if (mVar != null) {
            mVar.mo30101b(this.f13448j);
        }
    }

    /* renamed from: c */
    private void m18945c() {
        C4535b showingTable = this.f13439a.getShowingTable();
        if (showingTable != null) {
            this.f13444f.mo18675a(showingTable.mo17757a(), showingTable.mo17767b(), showingTable.mo17775e().mo17793b(), showingTable.mo17775e().mo17794c(), showingTable.mo17773d());
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        for (int size = this.f13441c.size() - 1; size >= 0; size--) {
            if (this.f13441c.get(size).onBackPressed()) {
                C13479a.m54764b("BitableCardFragment", "onBackPressed intercept");
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        C1177w<Boolean> landscape = this.f13439a.getLandscape();
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        landscape.mo5929b(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m18943a(MotionEvent motionEvent) {
        for (int size = this.f13446h.size() - 1; size >= 0; size--) {
            if (this.f13446h.get(size).onTouchStartIntercept(motionEvent)) {
                C13479a.m54764b("BitableCardFragment", "onTouchStartIntercept");
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        C4771b bVar = (C4771b) C4950k.m20474a(this, C4771b.class);
        this.f13439a = bVar;
        C1177w<Boolean> landscape = bVar.getLandscape();
        if (getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        landscape.mo5929b(Boolean.valueOf(z));
        this.f13439a.registerTableChangedObserver(this);
        this.f13445g = (DocViewModel) C4950k.m20474a(this, DocViewModel.class);
        BitableAnalytic bitableAnalytic = new BitableAnalytic(C5234y.m21391b(), this.f13445g.getBearUrl());
        this.f13444f = bitableAnalytic;
        this.f13440b = new C4539a(this, this.f13445g, this.f13439a, bitableAnalytic, this.f13441c, this.f13446h);
        m18944b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17947a(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View findViewById = activity.findViewById(16908290);
            if (findViewById.getParent() instanceof SlideFrameLayout) {
                ((SlideFrameLayout) findViewById.getParent()).setSlideable(z);
            }
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardStackChangedObserver
    /* renamed from: a */
    public void mo17946a(int i, C4535b bVar) {
        C13479a.m54764b("BitableCardFragment", "onTableContentUpdated()..., tableIndex = " + i);
        BitableCardStackLayout.Adapter aVar = this.f13443e;
        if (aVar != null) {
            aVar.mo17849a(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f13442d = (BitableCardStackLayout) view.findViewById(R.id.stack_layout);
        C4562c cVar = new C4562c(this.f13439a, this.f13440b);
        this.f13443e = cVar;
        this.f13442d.setAdapter(cVar);
        mo17945a(0, this.f13439a.getTableStack().size(), this.f13439a.getTableStack());
        view.post($$Lambda$b$y1XdM9who_iK1bknCKNBcILDX2k.INSTANCE);
        mo17947a(!m18942a());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bitable_card_fragment, viewGroup, false);
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardStackChangedObserver
    /* renamed from: a */
    public void mo17945a(int i, int i2, Stack<C4535b> stack) {
        C13479a.m54764b("BitableCardFragment", "onTableCountChanged()..., oldCount = " + i + ", newCount = " + i2);
        BitableCardStackLayout.Adapter aVar = this.f13443e;
        if (aVar != null) {
            aVar.mo17855a(stack, i, i2);
        }
        m18945c();
    }
}
