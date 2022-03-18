package com.bytedance.ee.bear.middleground.like;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.empty.C7690d;
import com.bytedance.ee.bear.facade.common.empty.EmptyView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.like.LikeViewModel;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9510c;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27140d;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;

public class LikeListActivity extends BaseActivity {

    /* renamed from: a */
    public static String f25518a = "doc_token";

    /* renamed from: b */
    public static String f25519b = "ref_type";

    /* renamed from: c */
    public static String f25520c = "from";

    /* renamed from: d */
    public static String f25521d = "from_lark_info";

    /* renamed from: e */
    public static String f25522e = "url";

    /* renamed from: f */
    public LikeViewModel f25523f;

    /* renamed from: g */
    public String f25524g;

    /* renamed from: h */
    public String f25525h;

    /* renamed from: i */
    private BaseTitleBar f25526i;

    /* renamed from: j */
    private RecyclerView f25527j;

    /* renamed from: k */
    private C9514d f25528k;

    /* renamed from: l */
    private SmartRefreshLayout f25529l;

    /* renamed from: m */
    private EmptyView f25530m;

    /* renamed from: n */
    private C7690d f25531n;

    /* renamed from: o */
    private int f25532o;

    /* renamed from: p */
    private boolean f25533p;

    /* renamed from: a */
    private void mo36354a() {
        this.f25524g = getIntent().getStringExtra(f25518a);
        this.f25532o = getIntent().getIntExtra(f25519b, 0);
        this.f25533p = f25521d.equals(getIntent().getStringExtra(f25520c));
        this.f25525h = getIntent().getStringExtra(f25522e);
    }

    /* renamed from: c */
    private void mo36357c() {
        int i;
        HashMap hashMap = new HashMap();
        String stringExtra = getIntent().getStringExtra(f25520c);
        if (!TextUtils.isEmpty(stringExtra)) {
            hashMap.put("praise_page_source", stringExtra);
        }
        Integer b = this.f25523f.count().mo5927b();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (b != null) {
            i = b.intValue();
        } else {
            i = 0;
        }
        sb.append(i);
        hashMap.put("praise_nums", sb.toString());
        C9536g.m39375a().mo36380a("show_praise_page", hashMap);
    }

    /* renamed from: b */
    private void mo36356b() {
        this.f25526i.setTitle(R.string.Doc_Like_LikeDetails);
        this.f25527j.setLayoutManager(new LinearLayoutManager(this));
        C9514d dVar = new C9514d(this, mo30076n());
        this.f25528k = dVar;
        dVar.mo36392a(new AbstractC9510c() {
            /* class com.bytedance.ee.bear.middleground.like.LikeListActivity.C94971 */

            @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9510c
            /* renamed from: a */
            public void mo36347a(String str) {
                C9536g.m39375a().mo36379a(str, C8275a.f22375h, LikeListActivity.this.f25524g);
            }
        });
        this.f25527j.setAdapter(this.f25528k);
        this.f25529l.mo96367b((AbstractC27125d) new LoadMoreFooter(this));
        this.f25529l.mo96413l(false);
        if (this.f25533p) {
            this.f25526i.mo45070a((BaseTitleBar.AbstractC11800a) new BaseTitleBar.C11804e(getString(R.string.Doc_Like_ViewDocument), R.color.like_list_right_btn_color) {
                /* class com.bytedance.ee.bear.middleground.like.LikeListActivity.C94982 */

                @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
                /* renamed from: a */
                public void mo16854a(View view) {
                    super.mo16854a(view);
                    LikeListActivity likeListActivity = LikeListActivity.this;
                    likeListActivity.f25525h = likeListActivity.mo36346a(likeListActivity.f25525h);
                    if (TextUtils.isEmpty(LikeListActivity.this.f25525h)) {
                        C13479a.m54764b("LikeListActivity", "url is empty");
                    } else {
                        C9536g.m39375a().mo36382b(LikeListActivity.this.f25525h);
                    }
                }
            });
        }
        this.f25530m.setConfig(new LikeEmptyConfig(getApplicationContext(), C9536g.m39375a().mo36377a()).mo36384a().invoke());
        this.f25531n = new C7690d(getApplicationContext(), this, this.f25530m, this.f25529l);
        LikeViewModel likeViewModel = (LikeViewModel) aj.m5366a(this).mo6005a(LikeViewModel.class);
        this.f25523f = likeViewModel;
        likeViewModel.attach(mo30076n(), this.f25531n.mo30157a(), this.f25524g, this.f25532o);
        this.f25523f.items().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.like.$$Lambda$LikeListActivity$2vg2N_EvPVzQ9howe2ZLqNumNpk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                LikeListActivity.this.m39293a((LikeListActivity) ((C9512c) obj));
            }
        });
        this.f25523f.loadMoreState().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.like.$$Lambda$LikeListActivity$ICb3YjkG6fgvjZATLxdzNBPhM9Y */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                LikeListActivity.this.m39292a((LikeListActivity) ((LikeViewModel.LoadingMoreState) obj));
            }
        });
        this.f25523f.count().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.like.$$Lambda$LikeListActivity$O86UhwgvuVYkOywweXpd9mxlkQ8 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                LikeListActivity.this.m39294a((LikeListActivity) ((Integer) obj));
            }
        });
        this.f25529l.mo96350a((AbstractC27140d) new AbstractC27140d() {
            /* class com.bytedance.ee.bear.middleground.like.LikeListActivity.C94993 */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27139c
            public void onRefresh(AbstractC27129h hVar) {
            }

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public void onLoadmore(AbstractC27129h hVar) {
                LikeListActivity.this.f25523f.pull();
            }
        });
        EmptyView emptyView = this.f25530m;
        LikeViewModel likeViewModel2 = this.f25523f;
        likeViewModel2.getClass();
        emptyView.setOnRetryListener(new EmptyView.AbstractC7668a() {
            /* class com.bytedance.ee.bear.middleground.like.$$Lambda$JS3CquS7xMVih8YLD2jRXuPIeog */

            @Override // com.bytedance.ee.bear.facade.common.empty.EmptyView.AbstractC7668a
            public final void onFailedRetry() {
                LikeViewModel.this.pull();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39293a(C9512c cVar) {
        if (cVar != null) {
            this.f25528k.mo36393a(cVar);
            this.f25529l.mo96416n();
            this.f25529l.mo96415m(cVar.f25548b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39292a(LikeViewModel.LoadingMoreState loadingMoreState) {
        if (loadingMoreState != null) {
            C13479a.m54764b("LikeListActivity", "initViews: update load more state");
            if (loadingMoreState.f25537a == 3 || loadingMoreState.f25537a == 2) {
                this.f25529l.mo96416n();
            }
            if (loadingMoreState.f25537a == 2 && (loadingMoreState.f25538b instanceof IOException)) {
                Toast.showFailureText(getApplication(), getString(R.string.Doc_Facade_NetworkInterrutedRetry), 0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39294a(Integer num) {
        String str;
        C13479a.m54764b("LikeListActivity", "initViews: update title count = " + num);
        if (num == null || num.intValue() == 0) {
            str = getString(R.string.Doc_Like_LikeDetails);
        } else {
            str = C10539a.m43639a(this, R.string.Doc_Like_LikeDetailsWithCount, "count", num.toString());
        }
        this.f25526i.setTitle(str);
    }

    /* renamed from: a */
    public String mo36346a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            URI uri = new URI(str);
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (Exception unused) {
            C13479a.m54758a("LikeListActivity", "getUrlWithoutParameter fail");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.like_list_activity);
        this.f25526i = (BaseTitleBar) findViewById(R.id.like_list_title_bar);
        this.f25527j = (RecyclerView) findViewById(R.id.like_list);
        this.f25529l = (SmartRefreshLayout) findViewById(R.id.like_list_refresh_layout);
        this.f25530m = (EmptyView) findViewById(R.id.like_list_empty);
        mo36354a();
        mo36356b();
        mo36357c();
    }
}
