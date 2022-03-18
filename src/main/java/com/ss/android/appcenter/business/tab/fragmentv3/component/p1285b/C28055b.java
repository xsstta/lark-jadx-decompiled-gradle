package com.ss.android.appcenter.business.tab.fragmentv3.component.p1285b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appaddv2.AddAppActivity;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.p1265a.C27575d;
import com.ss.android.appcenter.business.p1265a.C27577f;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.C27902a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.C27913b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27907c;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27919d;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.AddAppItem;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.base.AbstractView$OnClickListenerC28143a;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.C28249h;
import com.ss.android.appcenter.engine.vlayout.AbstractC28280c;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.b.b */
public class C28055b extends C28249h {

    /* renamed from: a */
    public String f70193a;

    /* renamed from: b */
    public Set<String> f70194b;

    /* renamed from: c */
    public Set<String> f70195c;

    /* renamed from: d */
    public AbstractC28246e f70196d;

    /* renamed from: e */
    private List<ItemInfo> f70197e = Collections.emptyList();

    /* renamed from: f */
    private AbstractView$OnClickListenerC28143a f70198f = new AbstractView$OnClickListenerC28143a() {
        /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1285b.C28055b.C280561 */

        /* access modifiers changed from: protected */
        @Override // com.ss.android.appcenter.common.base.AbstractView$OnClickListenerC28143a
        /* renamed from: a */
        public void mo98319a(View view) {
            AddAppActivity.m100674a(view.getContext());
            C27710b.m101323w(C28055b.this.f70193a);
        }
    };

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 101;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.engine.C28249h
    /* renamed from: b */
    public void mo99897b() {
        C27710b.m101248A(this.f70193a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.appcenter.engine.C28249h
    public int getItemCount() {
        return this.f70197e.size();
    }

    /* renamed from: a */
    private boolean m102540a(String str) {
        Set<String> set = this.f70194b;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m102542b(String str) {
        Set<String> set = this.f70195c;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo99896a(List<ItemInfo> list) {
        C28184h.m103250d("IconSubAdapter", "refresh>>>" + list);
        this.f70197e = list;
        notifyDataSetChanged();
    }

    @Override // com.ss.android.appcenter.engine.C28249h
    /* renamed from: a */
    public C28118a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C28184h.m103250d("IconSubAdapter", "onCreateViewHolder>>>");
        return new C28118a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workplace_template_component_vertical_app_view, viewGroup, false));
    }

    @Override // com.ss.android.appcenter.engine.C28249h
    /* renamed from: a */
    public void onBindViewHolder(C28118a aVar, int i) {
        ItemInfo itemInfo = (ItemInfo) C28182f.m103235a(this.f70197e, i, null);
        if (itemInfo == null) {
            C27700a.m101238b("IconSubAdapter#onBindViewHolder#itemInfo null");
            aVar.itemView.setVisibility(8);
            return;
        }
        C28184h.m103246a("IconSubAdapter", "onBindViewHolder>>> posiiton:" + i + " itemInfo:" + itemInfo);
        int i2 = 0;
        aVar.itemView.setVisibility(0);
        boolean z = itemInfo instanceof AddAppItem;
        TextView textView = (TextView) aVar.mo100089a(R.id.name);
        SquircleImageView squircleImageView = (SquircleImageView) aVar.mo100089a(R.id.icon);
        if (!z) {
            i2 = (int) mo100635c().getResources().getDimension(R.dimen.workplace_common_icon_border_width);
        }
        squircleImageView.setBorderWidth(i2);
        if (z) {
            textView.setText(R.string.OpenPlatform_AppCenter_AddAppBttn);
            squircleImageView.setImageResource(R.drawable.workplace_addapp_icon_squircle);
        } else {
            textView.setText(itemInfo.getName());
            C27688a.m101209a(mo100635c(), itemInfo.getIconKey(), squircleImageView);
        }
        if (z) {
            aVar.itemView.setOnClickListener(this.f70198f);
            return;
        }
        aVar.itemView.setOnClickListener(new View.OnClickListener(itemInfo, aVar) {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1285b.$$Lambda$b$pLkGsbgDcAkjA37KzHWmFZ3I2Kw */
            public final /* synthetic */ ItemInfo f$1;
            public final /* synthetic */ C28118a f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C28055b.this.m102541b(this.f$1, this.f$2, view);
            }
        });
        aVar.itemView.setOnLongClickListener(new View.OnLongClickListener(itemInfo, aVar) {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1285b.$$Lambda$b$6tCjee343posUWPavetZmJytwc */
            public final /* synthetic */ ItemInfo f$1;
            public final /* synthetic */ C28118a f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return C28055b.this.m102539a((C28055b) this.f$1, (ItemInfo) this.f$2, (C28118a) view);
            }
        });
        mo100636d();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m102541b(ItemInfo itemInfo, C28118a aVar, View view) {
        C28184h.m103250d("Workplace_Template_Page", "click app: " + itemInfo);
        C27577f.m100655a(aVar.itemView.getContext(), itemInfo);
        C27710b.m101276b(this.f70193a, itemInfo.getAppId(), itemInfo.getName(), itemInfo.bizAppScene, C27575d.m100643a(itemInfo));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m102539a(ItemInfo itemInfo, C28118a aVar, View view) {
        C28184h.m103250d("Workplace_Template_Page", "click long app: " + itemInfo);
        C27907c.m101864a(this.f70196d.mo100603i(), aVar);
        C27907c.m101868a(this.f70196d.mo100604j(), false);
        String itemId = itemInfo.getItemId();
        boolean a = m102540a(itemInfo.getItemId());
        C27902a aVar2 = new C27902a(this.f70196d.mo100602h());
        aVar2.mo99487a(a).mo99489b(m102542b(itemInfo.getItemId())).mo99490c(!a).mo99491d(C27577f.m100658b(itemInfo)).mo99486a(itemId).mo99483a(itemInfo).mo99481a(aVar.mo100089a(R.id.icon), this.f70196d.mo100596b().getResources().getDimension(R.dimen.workplace_common_icon_radius)).mo99482a(aVar.mo100089a(R.id.bot_icon), new C27919d((float) C28209p.m103293a(this.f70196d.mo100596b(), 40.0f))).mo99485a(new ItemMenuAdapter.AbstractC27933b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1285b.C28055b.C280583 */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
            /* renamed from: a */
            public void mo99568a() {
            }

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
            /* renamed from: b */
            public void mo99569b() {
                C27710b.m101326z("remove");
            }

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
            /* renamed from: c */
            public void mo99570c() {
                C27710b.m101326z("sort");
            }

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
            /* renamed from: d */
            public void mo99571d() {
                if (C28055b.this.f70196d.mo100598d() != null) {
                    C28055b.this.f70196d.mo100598d().mo99982a();
                }
            }
        }).mo99484a(new C27913b.AbstractC27915a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1285b.C28055b.C280572 */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.C27913b.AbstractC27915a
            public void onDismiss() {
                C27907c.m101868a(C28055b.this.f70196d.mo100604j(), true);
            }
        });
        aVar2.mo99488a();
        C27710b.m101290d(itemInfo.getName(), itemInfo.getAppId());
        return true;
    }

    public C28055b(Context context, AbstractC28280c cVar, String str, AbstractC28246e eVar) {
        super(context, cVar, 0);
        this.f70193a = str;
        this.f70196d = eVar;
    }
}
