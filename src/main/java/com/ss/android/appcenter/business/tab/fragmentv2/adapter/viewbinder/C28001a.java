package com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.workplacehome.C27771a;
import com.ss.android.appcenter.business.tab.business.blockit.AbstractC27836c;
import com.ss.android.appcenter.business.tab.business.blockit.BlockitView;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.C27902a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.C27913b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27907c;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27909d;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d;
import com.ss.android.appcenter.business.tab.business.widget.C27971l;
import com.ss.android.appcenter.business.tab.business.widget.WidgetView;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C28000b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27990a;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27991b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27993d;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.adapter.groupadapter.UpdateActionType;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27541f;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.a */
public class C28001a extends AbstractC27990a implements AbstractC27991b, AbstractC27993d {

    /* renamed from: a */
    private C27971l f70063a;

    /* renamed from: b */
    private Lifecycle f70064b;

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27993d
    /* renamed from: a */
    public void mo99752a(AbstractC27994e eVar, C28118a aVar, int i, C28000b bVar, UpdateActionType updateActionType) {
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27991b
    /* renamed from: a */
    public void mo99750a(AbstractC27994e eVar, C28118a aVar, int i, int i2, C28000b bVar, UpdateActionType updateActionType) {
        ItemInfo b;
        if (bVar != null && aVar != null && updateActionType == UpdateActionType.BADGE && (b = bVar.mo99806b(i, i2)) != null) {
            m102306a(aVar, b);
        }
    }

    /* renamed from: a */
    private boolean m102307a() {
        AbstractC27541f i = C27548m.m100547m().mo98225i();
        if (i == null || !i.mo98187a("lark.appcenter.block.display")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo99822a(Lifecycle lifecycle) {
        this.f70064b = lifecycle;
    }

    /* renamed from: a */
    public void mo99823a(C27971l lVar) {
        this.f70063a = lVar;
    }

    /* renamed from: a */
    private void m102306a(C28118a aVar, ItemInfo itemInfo) {
        View a = aVar.mo100089a(R.id.widget);
        if (a instanceof WidgetView) {
            ((WidgetView) a).mo99616a(itemInfo.badgeNum());
        }
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27993d
    /* renamed from: b */
    public void mo99753b(AbstractC27994e eVar, C28118a aVar, int i, C28000b bVar) {
        ((TextView) aVar.mo100089a(R.id.name)).setText(bVar.mo99815i(i));
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27991b
    /* renamed from: a */
    public void mo99749a(AbstractC27994e eVar, C28118a aVar, int i, int i2, C28000b bVar) {
        ItemInfo b = bVar.mo99806b(i, i2);
        boolean z = true;
        if (b == null) {
            C28184h.m103248b("Workplace_Page", String.format("bind widget. get(%s, %s) itemInfo is null.", String.valueOf(i), String.valueOf(i2)));
            return;
        }
        if (b.getBlock() == null || !m102307a() || !b.isBlock()) {
            z = false;
        }
        if (z) {
            m102301a(b, eVar, aVar, i, i2, bVar);
        } else {
            m102308b(b, eVar, aVar, i, i2, bVar);
        }
    }

    /* renamed from: a */
    private void m102301a(ItemInfo itemInfo, AbstractC27994e eVar, C28118a aVar, int i, int i2, C28000b bVar) {
        View findViewById = aVar.itemView.findViewById(R.id.block_view_stub);
        if (findViewById instanceof ViewStub) {
            ((ViewStub) findViewById).inflate();
        }
        BlockitView blockitView = (BlockitView) aVar.mo100089a(R.id.blockit);
        blockitView.mo99237f();
        blockitView.setFragment(eVar.mo99760b());
        blockitView.setOldHost(true);
        blockitView.mo99221a(itemInfo, false);
        blockitView.mo99219a(this.f70064b);
        blockitView.setMenuListener(new AbstractC27836c(itemInfo, eVar, aVar, i, i2, bVar, blockitView) {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.$$Lambda$a$Cokq9fwWlpA2s9mcf0V1yDUjlQ */
            public final /* synthetic */ ItemInfo f$1;
            public final /* synthetic */ AbstractC27994e f$2;
            public final /* synthetic */ C28118a f$3;
            public final /* synthetic */ int f$4;
            public final /* synthetic */ int f$5;
            public final /* synthetic */ C28000b f$6;
            public final /* synthetic */ BlockitView f$7;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
            }

            @Override // com.ss.android.appcenter.business.tab.business.blockit.AbstractC27836c
            public final void open() {
                C28001a.this.m102309b(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
            }
        });
    }

    /* renamed from: b */
    private void m102308b(ItemInfo itemInfo, AbstractC27994e eVar, C28118a aVar, int i, int i2, C28000b bVar) {
        View findViewById = aVar.itemView.findViewById(R.id.widget);
        if (findViewById instanceof ViewStub) {
            findViewById = ((ViewStub) findViewById).inflate();
        }
        m102306a(aVar, itemInfo);
        WidgetView widgetView = (WidgetView) findViewById;
        if (widgetView == null) {
            C28184h.m103248b("Workplace_Page", String.format("bind widget. get(%s, %s) widget view null.", String.valueOf(i), String.valueOf(i2)));
        } else if (eVar.mo99760b() == null) {
            C28184h.m103248b("Workplace_Page", String.format("bind widget. get(%s, %s) fragment is null.", String.valueOf(i), String.valueOf(i2)));
        } else if (this.f70063a == null) {
            C28184h.m103248b("Workplace_Page", String.format("bind widget. get(%s, %s) viewModel is null.", String.valueOf(i), String.valueOf(i2)));
        } else {
            Context context = widgetView.getContext();
            widgetView.mo99622a(itemInfo.getItemId(), itemInfo.getName(), itemInfo.getAppId());
            widgetView.mo99621a(itemInfo.getItemUrl().getMobileCardWidgetUrl(), eVar.mo99760b().getActivity(), eVar.mo99760b(), this.f70063a);
            widgetView.setBackground(C28209p.m103296a(context, context.getResources().getDimensionPixelSize(R.dimen.workplace_block_shadow), (int) R.color.static_white, true));
            widgetView.mo99617a(itemInfo);
            widgetView.setOnWidgetLongClickListener(new WidgetView.AbstractC27949b(widgetView, itemInfo, eVar, aVar, i, i2, bVar) {
                /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.$$Lambda$a$eyPj0OkmolGyZWnT6bz23pBEQjc */
                public final /* synthetic */ WidgetView f$1;
                public final /* synthetic */ ItemInfo f$2;
                public final /* synthetic */ AbstractC27994e f$3;
                public final /* synthetic */ C28118a f$4;
                public final /* synthetic */ int f$5;
                public final /* synthetic */ int f$6;
                public final /* synthetic */ C28000b f$7;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                    this.f$6 = r7;
                    this.f$7 = r8;
                }

                @Override // com.ss.android.appcenter.business.tab.business.widget.WidgetView.AbstractC27949b
                public final void onLongClick() {
                    C28001a.this.m102304a((C28001a) this.f$1, (WidgetView) this.f$2, (ItemInfo) this.f$3, (AbstractC27994e) this.f$4, (C28118a) this.f$5, this.f$6, (int) this.f$7);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102304a(WidgetView widgetView, ItemInfo itemInfo, AbstractC27994e eVar, C28118a aVar, int i, int i2, C28000b bVar) {
        widgetView.mo99615a();
        m102302a(itemInfo, eVar, aVar, i, i2, bVar, widgetView);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m102309b(final ItemInfo itemInfo, final AbstractC27994e eVar, C28118a aVar, int i, int i2, final C28000b bVar, BlockitView blockitView) {
        boolean z;
        C27907c.m101864a(eVar.mo99766e(), aVar);
        eVar.mo99759a(false);
        String itemId = itemInfo.getItemId();
        boolean a = bVar.mo99803a(itemId);
        if (bVar.mo99820n(i)) {
            z = bVar.mo99808b(itemId);
        } else {
            z = false;
        }
        C27907c.m101865a(blockitView, eVar.mo99760b(), itemInfo, z, a, eVar.mo99766e().getHeight(), new C27909d.AbstractC27912a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.$$Lambda$a$wQkVhOunmmAwA1Z6sAblFAtTuFg */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27909d.AbstractC27912a
            public final void onDismiss() {
                AbstractC27994e.this.mo99759a((AbstractC27994e) true);
            }
        }, new C27924d.C27928b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.C28001a.C280032 */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.C27928b, com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.AbstractC27927a
            /* renamed from: b */
            public void mo99556b() {
                C27710b.m101309l(itemInfo.getAppId());
            }

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.C27928b, com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.AbstractC27927a
            /* renamed from: a */
            public void mo99555a() {
                int b = bVar.mo99805b(itemInfo, true);
                if (b != -1) {
                    eVar.mo99761b(b);
                }
                C27771a.m101486a().mo99116a(itemInfo, false);
                C27710b.m101307k(itemInfo.getAppId());
            }
        });
    }

    /* renamed from: a */
    private void m102302a(final ItemInfo itemInfo, final AbstractC27994e eVar, C28118a aVar, int i, int i2, final C28000b bVar, View view) {
        boolean z;
        boolean z2;
        eVar.mo99756a(i, i2, aVar);
        eVar.mo99759a(false);
        String itemId = itemInfo.getItemId();
        boolean a = bVar.mo99803a(itemId);
        boolean n = bVar.mo99820n(i);
        if (n) {
            z = bVar.mo99808b(itemId);
        } else {
            z = false;
        }
        C27902a b = new C27902a(eVar.mo99760b()).mo99487a(z).mo99489b(a);
        if (z || !n) {
            z2 = false;
        } else {
            z2 = true;
        }
        b.mo99490c(z2).mo99491d(false).mo99486a(itemId).mo99483a(itemInfo).mo99480a(view).mo99485a(new ItemMenuAdapter.AbstractC27933b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.C28001a.C280021 */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
            /* renamed from: d */
            public void mo99571d() {
            }

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
            /* renamed from: c */
            public void mo99570c() {
                C27710b.m101309l(itemInfo.getAppId());
            }

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
            /* renamed from: a */
            public void mo99568a() {
                int a = bVar.mo99800a(itemInfo, true);
                if (a != -1) {
                    eVar.mo99755a(a);
                }
                C27771a.m101486a().mo99116a(itemInfo, true);
                C27710b.m101305j(itemInfo.getAppId());
            }

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
            /* renamed from: b */
            public void mo99569b() {
                int b = bVar.mo99805b(itemInfo, true);
                if (b != -1) {
                    eVar.mo99761b(b);
                }
                C27771a.m101486a().mo99116a(itemInfo, false);
                C27710b.m101307k(itemInfo.getAppId());
            }
        }).mo99484a(new C27913b.AbstractC27915a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.$$Lambda$a$Q6vLmZvOn_10tdXkErpf1dZCAdg */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.C27913b.AbstractC27915a
            public final void onDismiss() {
                AbstractC27994e.this.mo99759a((AbstractC27994e) true);
            }
        }).mo99488a();
        C27710b.m101285c(itemInfo.getAppId(), n);
    }
}
