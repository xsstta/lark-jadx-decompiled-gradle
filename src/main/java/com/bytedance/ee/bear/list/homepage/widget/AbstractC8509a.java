package com.bytedance.ee.bear.list.homepage.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.p380a.C7662a;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.homepage.AbstractC8472c;
import com.bytedance.ee.bear.list.homepage.AbstractC8474e;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerPresenter;
import com.bytedance.ee.bear.list.homepage.banner.BaseBannerView;
import com.bytedance.ee.bear.list.homepage.p432a.C8460a;
import com.bytedance.ee.bear.list.homepage.title.SubMenuView;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.homepage.widget.a */
public abstract class AbstractC8509a implements AbstractC8472c, AbstractC8474e.AbstractC8475a, AbstractC8651p.AbstractC8660i {

    /* renamed from: a */
    protected C7662a f23019a;

    /* renamed from: b */
    protected Context f23020b;

    /* renamed from: c */
    protected AbstractC8474e f23021c;

    /* renamed from: d */
    protected AbstractC8474e f23022d;

    /* renamed from: e */
    protected BaseBannerPresenter f23023e;

    /* renamed from: f */
    protected BaseBannerView f23024f;

    /* renamed from: g */
    protected C10917c f23025g;

    /* renamed from: h */
    protected ConnectionService.NetworkState f23026h;

    /* renamed from: i */
    protected FolderSortStrategy f23027i;

    /* renamed from: j */
    protected boolean f23028j;

    /* renamed from: k */
    private C8460a f23029k;

    /* renamed from: l */
    private View f23030l;

    /* renamed from: a */
    public abstract void mo33267a(C7667e eVar, Context context, C10917c cVar, View view);

    /* renamed from: d */
    public String mo33271d() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo33272e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo33273f();

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8472c
    /* renamed from: a */
    public void mo33133a() {
        BaseBannerPresenter dVar = this.f23023e;
        if (dVar != null) {
            dVar.mo33103d();
        }
    }

    /* renamed from: g */
    private void m35290g() {
        C5084ad.m20847d().mo20037a().mo5923a(this.f23019a, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.homepage.widget.$$Lambda$a$FvPJy4b75sFzKnMFrSfXbBplkbE */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC8509a.this.m35288c((AbstractC8509a) ((ConnectionService.NetworkState) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8472c
    /* renamed from: b */
    public void mo33134b() {
        BaseBannerPresenter dVar = this.f23023e;
        if (dVar != null) {
            dVar.destroy();
        }
        C8460a aVar = this.f23029k;
        if (aVar != null) {
            aVar.mo33075a();
        }
        C8674q.m36243f().mo33649b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo33270c() {
        if (this.f23019a.getActivity() != null) {
            ((C8786n) aj.m5366a(this.f23019a.getActivity()).mo6005a(C8786n.class)).getSortStrategyLiveData().mo5923a(this.f23019a, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.list.homepage.widget.$$Lambda$a$QKt4hAwMrZ6G8r5KR4eukJxDKg */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    AbstractC8509a.this.m35287b((AbstractC8509a) ((FolderSortStrategy) obj));
                }
            });
        }
    }

    /* renamed from: a */
    private SubMenuView.FilterState m35284a(int i) {
        if (i == FilterType.ALL.getType()) {
            return SubMenuView.FilterState.DEFAULT;
        }
        return SubMenuView.FilterState.CHECKED;
    }

    /* renamed from: c */
    private void m35289c(boolean z) {
        int i;
        AbstractC8474e eVar = this.f23022d;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        eVar.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m35287b(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(mo33271d(), folderSortStrategy.mo31545a()) && !folderSortStrategy.equals(this.f23027i)) {
            mo33268a(folderSortStrategy);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m35288c(ConnectionService.NetworkState networkState) {
        if (networkState != null) {
            mo33269b(networkState);
            C8460a aVar = this.f23029k;
            if (aVar != null) {
                aVar.mo33076a(networkState);
            }
            mo33266a(networkState);
        }
    }

    /* renamed from: a */
    private void m35285a(AppBarLayout appBarLayout) {
        AbstractC8474e eVar = (AbstractC8474e) appBarLayout.findViewById(R.id.home_sub_title_view);
        this.f23021c = eVar;
        eVar.setViewDelegate(this);
        AbstractC8474e eVar2 = (AbstractC8474e) this.f23019a.mo30111b(R.id.fixed_at_top_title_view);
        this.f23022d = eVar2;
        eVar2.setViewDelegate(this);
        mo30963a(C8292f.f22432b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33265a(View view) {
        C13479a.m54764b("BaseHomeHeader", "initNotification()...");
        this.f23029k = new C8460a(this.f23020b, view, new C8460a.AbstractC8461a() {
            /* class com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a.C85101 */

            @Override // com.bytedance.ee.bear.list.homepage.p432a.C8460a.AbstractC8461a
            /* renamed from: a */
            public String mo31037a() {
                return AbstractC8509a.this.mo33272e();
            }

            @Override // com.bytedance.ee.bear.list.homepage.p432a.C8460a.AbstractC8461a
            /* renamed from: b */
            public String mo31038b() {
                return AbstractC8509a.this.mo33273f();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33269b(ConnectionService.NetworkState networkState) {
        if (networkState.mo20041b()) {
            this.f23030l.setVisibility(8);
        } else {
            this.f23030l.setVisibility(0);
        }
        BaseBannerView eVar = this.f23024f;
        if (eVar != null) {
            eVar.mo33120a(networkState);
        }
        this.f23026h = networkState;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33266a(ConnectionService.NetworkState networkState) {
        boolean z;
        if (networkState == null || !networkState.mo20041b()) {
            z = true;
        } else {
            z = false;
        }
        AbstractC8474e eVar = this.f23021c;
        if (eVar != null) {
            eVar.setOffline(z);
        }
        AbstractC8474e eVar2 = this.f23022d;
        if (eVar2 != null) {
            eVar2.setOffline(z);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: b */
    public void mo30965b(boolean z) {
        mo30963a(z);
        C8674q.m36243f().mo33641a(C5234y.m21391b(), z, mo33273f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33268a(FolderSortStrategy folderSortStrategy) {
        this.f23027i = folderSortStrategy;
        this.f23021c.setFilterState(m35284a(folderSortStrategy.mo31554d()));
        this.f23022d.setFilterState(m35284a(folderSortStrategy.mo31554d()));
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
        this.f23021c.mo33137a(z);
        this.f23022d.mo33137a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35286a(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, int i) {
        boolean z;
        if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            z = true;
        } else {
            z = false;
        }
        m35289c(z);
    }

    public AbstractC8509a(C7662a aVar, Context context, C10917c cVar, AppBarLayout appBarLayout) {
        this(aVar, context, cVar, appBarLayout, true);
    }

    public AbstractC8509a(C7662a aVar, Context context, C10917c cVar, AppBarLayout appBarLayout, boolean z) {
        this.f23019a = aVar;
        this.f23020b = context;
        this.f23025g = cVar;
        this.f23028j = z;
        this.f23030l = appBarLayout.findViewById(R.id.no_net_container);
        mo33267a(aVar, context, cVar, appBarLayout.findViewById(R.id.header_banner_view));
        m35285a(appBarLayout);
        appBarLayout.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b(appBarLayout) {
            /* class com.bytedance.ee.bear.list.homepage.widget.$$Lambda$a$0FWGfTkhcOI9juiDbdSFUacNGYo */
            public final /* synthetic */ AppBarLayout f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                AbstractC8509a.this.m35286a(this.f$1, appBarLayout, i);
            }
        });
        mo33265a((View) appBarLayout);
        mo33270c();
        m35290g();
        C8674q.m36243f().mo33642a(this);
    }
}
