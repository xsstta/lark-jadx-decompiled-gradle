package com.ss.android.lark.feed.app.view.title;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.view.FeedListAdapter;

/* renamed from: com.ss.android.lark.feed.app.view.title.a */
public class C38024a implements ITitleScrollHelper {

    /* renamed from: a */
    RecyclerView f97656a;

    /* renamed from: b */
    FeedListAdapter f97657b;

    /* renamed from: c */
    int f97658c;

    /* renamed from: d */
    boolean f97659d = true;

    /* renamed from: e */
    FeedCard.FeedType f97660e;

    /* renamed from: f */
    AbstractC38026b f97661f;

    /* renamed from: g */
    AbstractC38027d f97662g;

    /* renamed from: h */
    private RecyclerView.OnScrollListener f97663h;

    @Override // com.ss.android.lark.feed.app.view.title.ITitleScrollHelper
    /* renamed from: a */
    public void mo139134a() {
        mo139148a(this.f97658c, this.f97659d);
    }

    @Override // com.ss.android.lark.feed.app.view.title.ITitleScrollHelper
    /* renamed from: d */
    public void mo139138d() {
        this.f97656a.removeOnScrollListener(this.f97663h);
    }

    @Override // com.ss.android.lark.feed.app.view.title.ITitleScrollHelper
    /* renamed from: c */
    public void mo139137c() {
        mo139148a(this.f97661f.getOriginSearchLayoutHeight(), true);
    }

    /* renamed from: f */
    private void m149522f() {
        if (this.f97656a != null && this.f97657b != null) {
            C380251 r0 = new RecyclerView.OnScrollListener() {
                /* class com.ss.android.lark.feed.app.view.title.C38024a.C380251 */

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        C38024a.this.f97657b.mo138943m();
                    } else if (i == 1 || i == 2) {
                        C38024a.this.f97657b.mo138942l();
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    if (i2 != 0) {
                        int e = C38024a.this.mo139149e();
                        boolean z = true;
                        if (i2 >= 0 && e > C38024a.this.f97661f.mo139094a(C38024a.this.f97660e) && C38024a.this.f97658c == 0) {
                            z = false;
                        }
                        int i3 = C38024a.this.f97658c;
                        if (C38024a.this.f97661f.getAlpha() == 1.0f) {
                            i3 -= i2;
                        }
                        if (i2 < 0 && e < C38024a.this.f97661f.getOriginSearchLayoutHeight() && C38024a.this.f97661f.getOriginSearchLayoutHeight() - e > i3) {
                            i3 = C38024a.this.f97661f.getOriginSearchLayoutHeight() - e;
                        }
                        C38024a.this.mo139148a(i3, z);
                    }
                }
            };
            this.f97663h = r0;
            this.f97656a.addOnScrollListener(r0);
        }
    }

    @Override // com.ss.android.lark.feed.app.view.title.ITitleScrollHelper
    /* renamed from: b */
    public void mo139136b() {
        int e = mo139149e();
        boolean z = this.f97659d;
        if (e <= this.f97661f.mo139094a(this.f97660e)) {
            z = true;
        }
        int i = this.f97658c;
        if (e < this.f97661f.getOriginSearchLayoutHeight()) {
            i = this.f97661f.getOriginSearchLayoutHeight() - e;
        }
        mo139148a(i, z);
    }

    /* renamed from: e */
    public int mo139149e() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f97656a.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int a = this.f97661f.mo139094a(this.f97660e) + 1;
        if (findFirstVisibleItemPosition == 0) {
            return Math.abs(linearLayoutManager.findViewByPosition(0).getTop());
        }
        return a;
    }

    /* renamed from: a */
    public void mo139148a(int i, boolean z) {
        if (this.f97662g != null) {
            if (i < 0) {
                i = 0;
            } else if (i > this.f97661f.getOriginSearchLayoutHeight()) {
                i = this.f97661f.getOriginSearchLayoutHeight();
            }
            this.f97658c = i;
            this.f97659d = z;
            this.f97662g.mo137044a(z, i, this.f97660e);
        }
    }

    public C38024a(FeedCard.FeedType feedType, AbstractC38026b bVar, AbstractC38027d dVar, RecyclerView recyclerView, FeedListAdapter feedListAdapter) {
        this.f97656a = recyclerView;
        this.f97657b = feedListAdapter;
        this.f97661f = bVar;
        this.f97662g = dVar;
        this.f97660e = feedType;
        this.f97658c = bVar.getOriginSearchLayoutHeight();
        m149522f();
    }
}
