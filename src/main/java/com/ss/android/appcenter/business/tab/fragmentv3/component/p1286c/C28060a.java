package com.ss.android.appcenter.business.tab.fragmentv3.component.p1286c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.dto.C27693a;
import com.ss.android.appcenter.business.dto.C27695c;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.C28078a;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader;
import com.ss.android.appcenter.business.tab.fragmentv3.component.p1287d.C28067a;
import com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28037d;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28040e;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.p1299a.C28237a;
import com.ss.android.appcenter.engine.vlayout.AbstractC28280c;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.c.a */
public class C28060a extends C28080a<C27695c> {

    /* renamed from: x */
    private static final int f70202x = C28209p.m103291a(4.0f);

    /* renamed from: A */
    private int f70203A;

    /* renamed from: B */
    private int f70204B;

    /* renamed from: C */
    private int f70205C;

    /* renamed from: D */
    private C28062b f70206D;

    /* renamed from: E */
    private String f70207E;

    /* renamed from: F */
    private int f70208F;

    /* renamed from: G */
    private int f70209G;

    /* renamed from: H */
    private int f70210H;

    /* renamed from: I */
    private int f70211I;

    /* renamed from: J */
    private int f70212J;

    /* renamed from: K */
    private int f70213K;

    /* renamed from: a */
    public boolean f70214a = true;

    /* renamed from: b */
    public int f70215b;

    /* renamed from: c */
    public int f70216c;

    /* renamed from: d */
    public int f70217d;

    /* renamed from: e */
    public int f70218e;

    /* renamed from: f */
    public int f70219f;

    /* renamed from: g */
    public int f70220g;

    /* renamed from: h */
    public int f70221h;

    /* renamed from: i */
    public int f70222i;

    /* renamed from: j */
    public int f70223j;

    /* renamed from: k */
    public int f70224k;

    /* renamed from: l */
    public int f70225l;

    /* renamed from: m */
    public int f70226m;

    /* renamed from: n */
    public boolean f70227n;

    /* renamed from: y */
    private CommonHeader.C28077b f70228y;

    /* renamed from: z */
    private int f70229z;

    @Override // com.ss.android.appcenter.engine.C28249h, com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a
    /* renamed from: a */
    public C28118a onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == this.f70205C) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workplace_template_feedlist_header_view, viewGroup, false);
            inflate.findViewById(R.id.tab).setVisibility(8);
            return new C28118a(inflate);
        } else if (i == 300) {
            return mo99963a(viewGroup);
        } else {
            if (i == 103) {
                return new C28118a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workplace_template_component_feed_list_item_view, viewGroup, false));
            }
            return new C28118a(new View(viewGroup.getContext()));
        }
    }

    @Override // com.ss.android.appcenter.engine.C28249h, com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a
    /* renamed from: a */
    public void onBindViewHolder(C28118a aVar, int i) {
        C28184h.m103246a("FeedListSubAdapter", "onBindViewHolder>>>: position" + i);
        if (mo99970d(i)) {
            C28184h.m103250d("FeedListSubAdapter", "onBindViewHolder>>>: isLast");
            mo99964a(aVar);
        } else if (mo99969c(i)) {
            C28184h.m103250d("FeedListSubAdapter", "bind header");
            CommonHeader commonHeader = (CommonHeader) aVar.mo100089a(R.id.header);
            if (C28078a.m102638b(this.f70228y)) {
                C28078a.m102635a(commonHeader, this.f70228y);
                commonHeader.setVisibility(0);
            } else {
                commonHeader.setVisibility(8);
            }
            if (!m102565h() || !this.f70307o.mo100615b()) {
                aVar.mo100089a(R.id.tab).setVisibility(8);
            } else {
                aVar.mo100089a(R.id.tab).setVisibility(0);
                TabLayout tabLayout = (TabLayout) aVar.mo100089a(R.id.tabLayout);
                $$Lambda$a$HFylYZvSxksX1XTJ_nLH7ZsAn3U r3 = new C28067a.AbstractC28069a() {
                    /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1286c.$$Lambda$a$HFylYZvSxksX1XTJ_nLH7ZsAn3U */

                    @Override // com.ss.android.appcenter.business.tab.fragmentv3.component.p1287d.C28067a.AbstractC28069a
                    public final void onSelected(int i, String str) {
                        C28060a.lambda$HFylYZvSxksX1XTJ_nLH7ZsAn3U(C28060a.this, i, str);
                    }
                };
                if (m102558a(tabLayout, this.f70206D.mo99918b(), this.f70206D.mo99920c())) {
                    C28067a.m102587a(tabLayout, aVar.mo100089a(R.id.category_wrapper), this.f70206D, this.f70207E, this.f70208F, this.f70209G, this.f70210H, this.f70211I, this.f70212J, this.f70213K, this.f70227n, r3, "feed");
                } else {
                    C28067a.m102583a(aVar.mo100089a(R.id.category_wrapper), r3, this.f70206D, "feed");
                }
                if (tabLayout.getSelectedTabPosition() != this.f70206D.mo99920c()) {
                    C28067a.m102586a(tabLayout, this.f70206D.mo99920c());
                }
            }
            View a = aVar.mo100089a(R.id.header_margin);
            if (C28078a.m102638b(this.f70228y) || m102565h() || !this.f70307o.mo100615b()) {
                C28209p.m103299a(a, 0);
                a.setVisibility(8);
                return;
            }
            C28209p.m103299a(a, this.f70312t);
            a.setVisibility(0);
        } else {
            final TextView textView = (TextView) aVar.mo100089a(R.id.feed_title);
            m102555a(textView, this.f70218e, this.f70219f);
            TextView textView2 = (TextView) aVar.mo100089a(R.id.feed_desc);
            m102555a(textView2, this.f70220g, this.f70221h);
            C28209p.m103301a(textView2, 0, this.f70226m, 0, 0);
            TextView textView3 = (TextView) aVar.mo100089a(R.id.feed_date);
            m102555a(textView3, this.f70222i, this.f70223j);
            if (!this.f70214a || this.f70222i != 0) {
                C28209p.m103301a(textView, 0, 0, 0, 0);
            } else {
                C28209p.m103301a(textView, 0, C28209p.m103291a(4.0f), 0, 0);
            }
            View view = aVar.itemView;
            int i2 = this.f70203A;
            int i3 = this.f70229z;
            view.setPadding(i2, i3, this.f70204B, i3);
            LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) aVar.mo100089a(R.id.feed_image);
            if (this.f70214a) {
                lKUIRoundedImageView2.setRadius((float) this.f70217d);
                C28209p.m103300a(lKUIRoundedImageView2, this.f70216c, this.f70215b);
                lKUIRoundedImageView2.setVisibility(0);
                C28209p.m103301a(lKUIRoundedImageView2, 0, 0, this.f70225l, 0);
            } else {
                lKUIRoundedImageView2.setVisibility(8);
            }
            if (m102562e()) {
                textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1286c.C28060a.ViewTreeObserver$OnPreDrawListenerC280611 */

                    public boolean onPreDraw() {
                        textView.getViewTreeObserver().removeOnPreDrawListener(this);
                        int lineCount = textView.getLineCount();
                        textView.setLines(lineCount);
                        TextView textView = textView;
                        C28060a aVar = C28060a.this;
                        C28209p.m103299a(textView, aVar.mo99901a(aVar.f70219f, lineCount));
                        return false;
                    }
                });
            }
            C27693a a2 = mo99902a(i - 1);
            if (a2 != null) {
                textView.setText(a2.f69182b);
                textView2.setText(a2.f69184d);
                textView3.setText(a2.f69185e);
                C27688a.m101214a(a2.f69181a, lKUIRoundedImageView2, this.f70216c, this.f70215b);
                aVar.itemView.setVisibility(0);
                aVar.itemView.setOnClickListener(new View.OnClickListener(a2) {
                    /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1286c.$$Lambda$a$0i20tnp0oalbve2bKMVEyFh127U */
                    public final /* synthetic */ C27693a f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        C28060a.lambda$0i20tnp0oalbve2bKMVEyFh127U(C28060a.this, this.f$1, view);
                    }
                });
            } else {
                aVar.itemView.setVisibility(8);
            }
            mo100636d();
        }
    }

    /* renamed from: a */
    public void mo99905a(boolean z, NodeParams nodeParams) {
        if (z) {
            this.f70203A = C28209p.m103291a(16.0f);
            this.f70204B = C28209p.m103291a(16.0f);
            if (this.f70214a) {
                this.f70229z = C28209p.m103291a(12.0f);
            } else {
                this.f70229z = C28209p.m103291a(8.0f);
            }
        } else {
            this.f70229z = C28209p.m103291a(8.0f);
            this.f70203A = C28209p.m103291a(16.0f);
            this.f70204B = C28209p.m103291a(16.0f);
        }
    }

    /* renamed from: a */
    public int mo99901a(int i, int i2) {
        int a;
        if (i == C28209p.m103291a(16.0f)) {
            a = C28209p.m103291a(24.0f);
        } else if (i == C28209p.m103291a(14.0f)) {
            a = C28209p.m103291a(22.0f);
        } else if (i != C28209p.m103291a(12.0f)) {
            return i * i2;
        } else {
            a = C28209p.m103291a(20.0f);
        }
        return a * i2;
    }

    /* renamed from: h */
    private boolean m102565h() {
        return this.f70206D.mo99922e();
    }

    /* renamed from: e */
    private boolean m102562e() {
        if (this.f70218e < 2 || this.f70220g < 1) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.appcenter.engine.C28249h, com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a
    public int getItemCount() {
        if (this.f70307o.mo100615b()) {
            return this.f70224k + 2;
        }
        return 2;
    }

    /* renamed from: f */
    private int m102563f() {
        int i;
        int i2;
        if (this.f70214a) {
            i2 = this.f70215b;
            i = this.f70229z;
        } else {
            i2 = m102564g();
            i = this.f70229z;
        }
        return (i2 + (i * 2)) * this.f70224k;
    }

    /* renamed from: g */
    private int m102564g() {
        return mo99901a(this.f70219f, this.f70218e) + mo99901a(this.f70221h, this.f70220g) + mo99901a(this.f70223j, this.f70222i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.engine.C28249h
    /* renamed from: b */
    public void mo99897b() {
        int i = 1;
        int c = this.f70206D.mo99920c() + 1;
        if (this.f70206D.mo99915a() != 0) {
            i = this.f70206D.mo99915a();
        }
        C27710b.m101272b(c, i);
    }

    /* renamed from: a */
    public void mo99904a(CommonHeader.C28077b bVar) {
        this.f70228y = bVar;
    }

    /* renamed from: a */
    public C27693a mo99902a(int i) {
        return (C27693a) C28182f.m103235a(this.f70206D.mo99921d(), i, null);
    }

    /* renamed from: a */
    public void mo99903a(C28062b bVar) {
        C28062b bVar2 = this.f70206D;
        if (!(bVar2 == null || bVar2.mo99920c() == 0)) {
            bVar.mo99919b(this.f70206D.mo99920c());
        }
        this.f70206D = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a
    public int getItemViewType(int i) {
        if (mo99970d(i)) {
            return LocationRequest.PRIORITY_INDOOR;
        }
        if (mo99969c(i)) {
            return this.f70205C;
        }
        if (this.f70307o.mo100615b()) {
            return 103;
        }
        return 1;
    }

    /* renamed from: e */
    private void m102561e(int i) {
        if (i <= C28209p.m103291a(40.0f)) {
            this.f70225l = C28209p.m103291a(12.0f);
            this.f70226m = C28209p.m103291a((float) BitmapDescriptorFactory.HUE_RED);
            return;
        }
        this.f70225l = C28209p.m103291a(16.0f);
        this.f70226m = C28209p.m103291a(4.0f);
    }

    /* renamed from: b */
    private void m102559b(NodeParams nodeParams) {
        int i;
        int i2;
        if (this.f70227n) {
            if (C28078a.m102638b(this.f70228y)) {
                i2 = C28209p.m103291a(8.0f);
            } else {
                i2 = C28209p.m103291a(16.0f);
            }
            this.f70208F = i2;
            this.f70210H = C28209p.m103291a(16.0f);
            this.f70211I = C28209p.m103291a(16.0f);
            this.f70213K = C28209p.m103291a(64.0f);
        } else {
            if (C28037d.m102476e(nodeParams)) {
                i = C28209p.m103291a(8.0f);
            } else {
                i = 0;
            }
            this.f70208F = i;
            this.f70210H = C28209p.m103291a(16.0f);
            this.f70211I = C28209p.m103291a(16.0f);
            this.f70213K = C28209p.m103291a(32.0f);
        }
        this.f70209G = C28209p.m103291a(4.0f);
        this.f70212J = 0;
    }

    /* renamed from: a */
    private int m102553a(Context context) {
        int i;
        float f;
        if (C28078a.m102638b(this.f70228y)) {
            i = CommonHeader.m102627a(true);
            C28184h.m103250d("FeedListSubAdapter", "getCalculateHeight>>>headerInside:" + CommonHeader.m102627a(true));
        } else {
            i = 0;
        }
        if (m102565h()) {
            if (C28078a.m102638b(this.f70228y)) {
                f = 40.0f;
            } else {
                f = 48.0f;
            }
            int a = C28209p.m103291a(f);
            C28184h.m103250d("FeedListSubAdapter", "getCalculateHeight>>>tabHeight:" + a);
            i += a;
        }
        if (!C28078a.m102638b(this.f70228y) && !m102565h() && this.f70227n) {
            int i2 = f70202x;
            i += i2;
            C28184h.m103250d("FeedListSubAdapter", "getCalculateHeight>>>headerMargin:" + i2);
        }
        int f2 = m102563f();
        C28184h.m103250d("FeedListSubAdapter", "getCalculateHeight>>>appHeight:" + f2);
        int i3 = i + f2;
        if (this.f70227n) {
            return i3 + f70202x;
        }
        return i3;
    }

    /* renamed from: c */
    private void m102560c(NodeParams nodeParams) {
        int i;
        int i2;
        int i3;
        C28184h.m103250d("FeedListSubAdapter", "calculateHeight>>>");
        int a = C28040e.m102494a(nodeParams);
        int i4 = 0;
        if (C28078a.m102637a(this.f70309q, C28037d.m102476e(nodeParams))) {
            a -= CommonHeader.m102627a(false);
        }
        C28184h.m103250d("FeedListSubAdapter", "calculateHeight>>>styleHeight:" + a);
        int a2 = m102553a(mo100635c());
        C28184h.m103250d("FeedListSubAdapter", "calculateHeight>>>contentHeight:" + a2);
        if (a > a2) {
            this.f70310r = a;
            int i5 = a - a2;
            if (this.f70227n) {
                i3 = f70202x;
            } else {
                i3 = 0;
            }
            this.f70313u = i5 + i3;
        } else {
            this.f70310r = a2;
            if (this.f70227n) {
                i = f70202x;
            } else {
                i = 0;
            }
            this.f70312t = i;
            if (this.f70227n) {
                i2 = f70202x;
            } else {
                i2 = 0;
            }
            this.f70313u = i2;
        }
        int i6 = this.f70310r;
        if (C28078a.m102638b(this.f70228y)) {
            i4 = CommonHeader.m102627a(true);
        }
        this.f70311s = i6 - i4;
        C28184h.m103250d("FeedListSubAdapter", "calculateHeight>>>mStatusViewHeight:" + this.f70311s + " mProtectHeaderHeight:" + this.f70312t + " mProtectFooterHeight:" + this.f70313u);
    }

    /* renamed from: a */
    private void m102557a(NodeParams nodeParams) {
        this.f70217d = C28040e.m102496c(nodeParams);
        this.f70215b = C28037d.m102491t(nodeParams);
        this.f70216c = C28037d.m102492u(nodeParams);
        this.f70214a = C28037d.m102480i(nodeParams);
        this.f70207E = C28037d.m102484m(nodeParams);
        this.f70227n = C28037d.m102479h(nodeParams);
        this.f70309q = C28037d.m102475d(nodeParams);
        this.f70228y = new CommonHeader.C28077b();
        this.f70218e = C28037d.m102486o(nodeParams);
        this.f70224k = C28037d.m102490s(nodeParams);
        this.f70219f = C28040e.m102499f(nodeParams);
        this.f70220g = C28037d.m102487p(nodeParams);
        this.f70221h = C28040e.m102500g(nodeParams);
        this.f70222i = C28037d.m102488q(nodeParams);
        this.f70223j = C28040e.m102501h(nodeParams);
        this.f70228y = new CommonHeader.C28077b(C28037d.m102472a(nodeParams), C28037d.m102473b(nodeParams), C28037d.m102474c(nodeParams), this.f70309q, C28037d.m102476e(nodeParams), "feed");
        m102561e(this.f70215b);
        mo99905a(this.f70227n, nodeParams);
        m102559b(nodeParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102554a(int i, String str) {
        C28184h.m103250d("FeedListSubAdapter", "onTabSelected>>> position:" + i);
        if (this.f70206D.mo99920c() != i) {
            C28184h.m103250d("FeedListSubAdapter", "onTabSelected>>> changeTab.");
            this.f70206D.mo99916a(i);
            mo99897b();
            notifyDataSetChanged();
            C27710b.m101257a("feed", i + 1, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102556a(C27693a aVar, View view) {
        C27548m.m100547m().mo98222f().mo98206c(mo100635c(), aVar.f69183c);
        int i = 1;
        int c = this.f70206D.mo99920c() + 1;
        if (this.f70206D.mo99915a() != 0) {
            i = this.f70206D.mo99915a();
        }
        C27710b.m101254a(c, i);
    }

    /* renamed from: a */
    private void m102555a(TextView textView, int i, int i2) {
        if (i == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setTextSize(0, (float) i2);
        textView.setMaxLines(i);
        if (Build.VERSION.SDK_INT < 28) {
            textView.setLineSpacing((float) C28209p.m103291a(2.0f), 1.0f);
            if (i2 == C28209p.m103291a(16.0f)) {
                C28209p.m103299a(textView, i * C28209p.m103291a(24.0f));
            } else if (i2 == C28209p.m103291a(14.0f)) {
                C28209p.m103299a(textView, i * C28209p.m103291a(22.0f));
            } else if (i2 == C28209p.m103291a(12.0f)) {
                C28209p.m103299a(textView, i * C28209p.m103291a(20.0f));
            }
        } else if (i2 == C28209p.m103291a(16.0f)) {
            C28209p.m103299a(textView, i * C28209p.m103291a(24.0f));
            textView.setLineHeight(C28209p.m103291a(24.0f));
        } else if (i2 == C28209p.m103291a(14.0f)) {
            C28209p.m103299a(textView, i * C28209p.m103291a(22.0f));
            textView.setLineHeight(C28209p.m103291a(22.0f));
        } else if (i2 == C28209p.m103291a(12.0f)) {
            C28209p.m103299a(textView, i * C28209p.m103291a(20.0f));
            textView.setLineHeight(C28209p.m103291a(20.0f));
        }
    }

    /* renamed from: a */
    private boolean m102558a(TabLayout tabLayout, List<String> list, int i) {
        int tabCount = tabLayout.getTabCount();
        if (tabCount == 0 || tabCount != list.size()) {
            return true;
        }
        for (int i2 = 0; i2 < tabCount; i2++) {
            TextView textView = (TextView) tabLayout.mo78227a(i2).mo78310a().findViewById(R.id.tab_name);
            if (!(textView == null || TextUtils.equals(textView.getText(), list.get(i2)))) {
                return true;
            }
        }
        return false;
    }

    public C28060a(Context context, AbstractC28280c cVar, C28237a<C27695c> aVar, View.OnClickListener onClickListener, AbstractC28246e eVar, NodeParams nodeParams) {
        super(context, cVar, onClickListener);
        this.f70307o = aVar;
        int i = f70202x;
        this.f70312t = i;
        this.f70313u = i;
        this.f70205C = eVar.mo100591a(nodeParams.getKey());
        this.f70206D = new C28062b();
        m102557a(nodeParams);
        m102560c(nodeParams);
    }
}
