package com.bytedance.ee.bear.sheet.searchbar;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.search.View$OnClickListenerC6104a;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.common.C11090b;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.searchbar.a */
public class C11301a extends View$OnClickListenerC6104a {

    /* renamed from: g */
    private C11088a f30395g;

    /* renamed from: h */
    private int f30396h;

    /* renamed from: i */
    private LinearLayout f30397i;

    /* renamed from: j */
    private LinearLayout f30398j;

    /* renamed from: k */
    private LinearLayout f30399k;

    /* renamed from: l */
    private View f30400l;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.search.View$OnClickListenerC6104a
    /* renamed from: a */
    public Class<C11302b> mo24629a() {
        return C11302b.class;
    }

    /* renamed from: a */
    private View m46960a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (this.f30396h != i) {
            m46961a(i);
            this.f30396h = i;
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.document.search.View$OnClickListenerC6104a, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30395g = new C11088a();
        this.f30395g.mo42260a(((DocViewModel) C4950k.m20474a(this, DocViewModel.class)).getBearUrl());
    }

    @Override // com.bytedance.ee.bear.document.search.View$OnClickListenerC6104a
    public void onClick(View view) {
        if (view.getId() == R.id.search_pre) {
            this.f30395g.mo42264a(true);
        } else if (view.getId() == R.id.search_next) {
            this.f30395g.mo42264a(false);
        } else if (view.getId() == R.id.search_done) {
            C11090b.m46144a("finish");
        }
        super.onClick(view);
    }

    /* renamed from: a */
    private void m46961a(int i) {
        getResources().getConfiguration();
        if (i == 2) {
            this.f16990a.setVisibility(8);
            this.f30397i.removeView(this.f30398j);
            this.f30397i.removeView(this.f16992c);
            this.f30399k.setPadding(C13749l.m55738a(4), 0, C13749l.m55738a(4), 0);
            this.f30399k.removeView(this.f30400l);
            this.f30399k.addView(m46960a(this.f30398j), 0);
            this.f30399k.addView(m46960a(this.f16992c));
            ((LinearLayout.LayoutParams) this.f16994e.getLayoutParams()).setMargins(C13749l.m55738a(24), 0, C13749l.m55738a(16), 0);
            return;
        }
        getResources().getConfiguration();
        if (i == 1) {
            this.f16990a.setVisibility(0);
            this.f30399k.setPadding(0, 0, 0, 0);
            this.f30399k.removeView(this.f30398j);
            this.f30399k.removeView(this.f16992c);
            this.f30399k.addView(m46960a(this.f30400l), 0);
            this.f30397i.addView(m46960a(this.f30398j));
            this.f30397i.addView(m46960a(this.f16992c));
            ((LinearLayout.LayoutParams) this.f16994e.getLayoutParams()).setMargins(C13749l.m55738a(32), 0, C13749l.m55738a(12), 0);
        }
    }

    @Override // com.bytedance.ee.bear.document.search.View$OnClickListenerC6104a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f30397i = (LinearLayout) view.findViewById(R.id.doc_search_titlebar);
        this.f30398j = (LinearLayout) view.findViewById(R.id.doc_search_box);
        this.f30399k = (LinearLayout) view.findViewById(R.id.doc_search_toolbar);
        this.f30400l = view.findViewById(R.id.place_holder);
        int i = getResources().getConfiguration().orientation;
        this.f30396h = i;
        if (i == 2) {
            m46961a(i);
        }
    }
}
