package com.ss.android.vc.meeting.module.interpretation;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61386f;
import com.ss.android.vc.meeting.module.interpretation.SearchLanguageView;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.i */
public class View$OnClickListenerC61981i implements View.OnClickListener, AbsListView.OnScrollListener, C61386f.AbstractC61387a {

    /* renamed from: a */
    public FrameLayout f155706a;

    /* renamed from: b */
    public RelativeLayout f155707b;

    /* renamed from: c */
    public RelativeLayout f155708c;

    /* renamed from: d */
    public TextView f155709d;

    /* renamed from: e */
    public FrameLayout f155710e;

    /* renamed from: f */
    public boolean f155711f;

    /* renamed from: g */
    private Activity f155712g;

    /* renamed from: h */
    private C61303k f155713h;

    /* renamed from: i */
    private AbstractC61222a f155714i;

    /* renamed from: j */
    private C61978h f155715j;

    /* renamed from: k */
    private ListView f155716k;

    /* renamed from: l */
    private View f155717l;

    /* renamed from: m */
    private SearchLanguageView f155718m;

    /* renamed from: n */
    private C60762k f155719n;

    /* renamed from: o */
    private Boolean f155720o;

    /* renamed from: p */
    private Boolean f155721p;

    /* renamed from: q */
    private List<LanguageType> f155722q;

    @Override // com.ss.android.vc.meeting.model.C61386f.AbstractC61387a
    /* renamed from: a */
    public void mo212586a() {
    }

    public void onClick(View view) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    /* renamed from: b */
    public void mo214559b() {
        this.f155714i.dismiss();
    }

    /* renamed from: e */
    private void m242160e() {
        this.f155718m.mo214425a(new SearchLanguageView.AbstractC61933a() {
            /* class com.ss.android.vc.meeting.module.interpretation.View$OnClickListenerC61981i.C619821 */

            @Override // com.ss.android.vc.meeting.module.interpretation.SearchLanguageView.AbstractC61933a
            /* renamed from: a */
            public void mo214435a(SearchLanguageView.Status status) {
                if (status == SearchLanguageView.Status.Result) {
                    View$OnClickListenerC61981i.this.f155708c.setBackgroundColor(C60773o.m236126d(R.color.ud_N00_50));
                    View$OnClickListenerC61981i.this.f155709d.setVisibility(4);
                    View$OnClickListenerC61981i.this.f155710e.setVisibility(0);
                } else if (status == SearchLanguageView.Status.NoResult) {
                    View$OnClickListenerC61981i.this.f155708c.setBackgroundColor(C60773o.m236126d(R.color.ud_N00_50));
                    View$OnClickListenerC61981i.this.f155709d.setVisibility(0);
                    View$OnClickListenerC61981i.this.f155709d.bringToFront();
                    View$OnClickListenerC61981i.this.f155710e.setVisibility(0);
                } else if (status == SearchLanguageView.Status.Exit) {
                    View$OnClickListenerC61981i.this.f155707b.setVisibility(0);
                    View$OnClickListenerC61981i.this.f155707b.setClickable(true);
                    View$OnClickListenerC61981i.this.f155709d.setVisibility(4);
                    View$OnClickListenerC61981i.this.f155708c.setVisibility(4);
                    View$OnClickListenerC61981i.this.f155710e.setVisibility(4);
                }
            }
        });
    }

    /* renamed from: f */
    private void m242161f() {
        C60762k kVar = new C60762k(this.f155712g);
        this.f155719n = kVar;
        kVar.mo208369a(new C60762k.AbstractC60764a() {
            /* class com.ss.android.vc.meeting.module.interpretation.$$Lambda$i$Y1lD_FPmT9qcfwrSSby4bB5N_MA */

            @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
            public final void onKeyboardStateChanged(boolean z, int i) {
                View$OnClickListenerC61981i.this.m242157a(z, i);
            }
        });
    }

    /* renamed from: d */
    private void m242159d() {
        m242161f();
        this.f155707b.setVisibility(0);
        this.f155707b.setClickable(true);
        this.f155707b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.$$Lambda$i$PSln3LzODA4K0s1EXZqLUdzA4E */

            public final void onClick(View view) {
                View$OnClickListenerC61981i.this.m242158b((View$OnClickListenerC61981i) view);
            }
        });
        this.f155708c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.$$Lambda$i$pz7Iq9yM5gAS79486ucMqxkcUM */

            public final void onClick(View view) {
                View$OnClickListenerC61981i.this.m242156a((View$OnClickListenerC61981i) view);
            }
        });
    }

    /* renamed from: c */
    public boolean mo214561c() {
        ListView listView = this.f155716k;
        if (listView == null || listView.getCount() <= 0 || this.f155716k.getFirstVisiblePosition() != 0 || this.f155716k.getChildAt(0).getTop() < 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242156a(View view) {
        this.f155718m.mo214424a();
    }

    /* renamed from: b */
    public void mo214560b(Boolean bool) {
        C61978h hVar = new C61978h(this.f155712g, this.f155713h, this.f155714i, this.f155720o, this.f155721p, this.f155722q);
        this.f155715j = hVar;
        this.f155716k.setAdapter((ListAdapter) hVar);
        this.f155716k.setOnScrollListener(this);
        this.f155715j.mo214551a();
        mo214558a(this.f155716k, this.f155715j, this.f155706a, bool);
        m242159d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m242158b(View view) {
        this.f155707b.setClickable(false);
        this.f155709d.setVisibility(4);
        this.f155707b.setVisibility(4);
        this.f155708c.setVisibility(0);
        this.f155708c.setBackgroundColor(C60773o.m236126d(R.color.ud_N00_50));
        this.f155710e.setVisibility(0);
        this.f155718m = new SearchLanguageView(this.f155712g, this.f155713h, this.f155714i, this.f155720o.booleanValue(), this.f155710e, this.f155721p, this.f155722q);
        m242160e();
    }

    /* renamed from: a */
    public View mo214557a(Boolean bool) {
        View inflate = LayoutInflater.from(this.f155712g).inflate(R.layout.dialog_language_search, (ViewGroup) null);
        this.f155716k = (ListView) inflate.findViewById(R.id.language_list);
        this.f155706a = (FrameLayout) inflate.findViewById(R.id.language_outer_container);
        this.f155707b = (RelativeLayout) inflate.findViewById(R.id.search_bar_normal);
        this.f155708c = (RelativeLayout) inflate.findViewById(R.id.search_mask);
        this.f155709d = (TextView) inflate.findViewById(R.id.no_result_textview);
        this.f155710e = (FrameLayout) inflate.findViewById(R.id.search_list_layout);
        this.f155717l = inflate.findViewById(R.id.search_mask_keyboard_padding);
        mo214560b(bool);
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242157a(boolean z, int i) {
        this.f155711f = z;
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f155717l.getLayoutParams();
            layoutParams.height = i;
            this.f155717l.setLayoutParams(layoutParams);
            return;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f155717l.getLayoutParams();
        layoutParams2.height = 0;
        this.f155717l.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public void mo214558a(ListView listView, C61978h hVar, ViewGroup viewGroup, Boolean bool) {
        int i;
        if (hVar != null) {
            if (bool.booleanValue()) {
                i = C60776r.m236139a();
            } else {
                i = C60776r.m236144b();
            }
            int i2 = (int) (((double) i) * 0.8d);
            int i3 = 0;
            if (hVar.getCount() > 0) {
                View view = hVar.getView(0, null, listView);
                view.measure(0, 0);
                i3 = 0 + (view.getMeasuredHeight() * hVar.getCount());
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = Math.min(i2 - ((C60773o.m236115a(52.0d) + C60773o.m236115a(31.0d)) + C60773o.m236115a(16.0d)), i3);
            viewGroup.setLayoutParams(layoutParams);
            this.f155715j.notifyDataSetChanged();
        }
    }

    public View$OnClickListenerC61981i(Activity activity, C61303k kVar, AbstractC61222a aVar, Boolean bool, Boolean bool2, List<LanguageType> list) {
        this.f155712g = activity;
        this.f155713h = kVar;
        this.f155714i = aVar;
        this.f155720o = bool;
        this.f155721p = bool2;
        this.f155722q = list;
    }
}
