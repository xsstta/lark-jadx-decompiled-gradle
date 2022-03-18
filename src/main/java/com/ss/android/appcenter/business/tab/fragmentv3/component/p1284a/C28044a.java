package com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.tab.business.blockit.AbstractC27836c;
import com.ss.android.appcenter.business.tab.business.blockit.BlockitView;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27907c;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27909d;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28037d;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28040e;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.C28249h;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.vlayout.AbstractC28280c;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.a.a */
public class C28044a extends C28249h {

    /* renamed from: d */
    private static int f70151d;

    /* renamed from: a */
    public AbstractC28246e f70152a;

    /* renamed from: b */
    public Set<String> f70153b;

    /* renamed from: c */
    public Set<String> f70154c;

    /* renamed from: e */
    private String f70155e;

    /* renamed from: f */
    private List<ItemInfo> f70156f = Collections.emptyList();

    /* renamed from: g */
    private int f70157g;

    /* renamed from: h */
    private boolean f70158h;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.appcenter.engine.C28249h
    public int getItemCount() {
        return this.f70156f.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m102517e() {
        C27907c.m101868a(this.f70152a.mo100604j(), true);
    }

    /* renamed from: a */
    private boolean m102515a(String str) {
        Set<String> set = this.f70153b;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m102516b(String str) {
        Set<String> set = this.f70154c;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo99883a(List<ItemInfo> list) {
        C28184h.m103250d("BlockListSubAdapter", "refresh>>>" + list);
        this.f70156f = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        ItemInfo itemInfo = (ItemInfo) C28182f.m103235a(this.f70156f, i, null);
        if (itemInfo == null || itemInfo.getBlock() == null || itemInfo.getBlock().blockTypeId == null) {
            return 1;
        }
        AbstractC28246e eVar = this.f70152a;
        return eVar.mo100591a(this.f70155e + itemInfo.getBlock().blockTypeId);
    }

    @Override // com.ss.android.appcenter.engine.C28249h
    /* renamed from: a */
    public C28118a onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C28118a(new View(viewGroup.getContext()));
        }
        return new C28118a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workplace_block_wrapper, viewGroup, false));
    }

    /* renamed from: a */
    private void m102513a(ItemInfo itemInfo, C28118a aVar) {
        String str;
        BlockitView blockitView = (BlockitView) aVar.mo100089a(R.id.blockit);
        blockitView.setRoundCorner((float) this.f70157g);
        blockitView.setForceUpdate(this.f70158h);
        blockitView.setFragment(this.f70152a.mo100602h());
        if (this.f70152a.mo100599e() == null || this.f70152a.mo100599e().mo100005d() == null) {
            str = "";
        } else {
            str = this.f70152a.mo100599e().mo100005d().f69303a;
        }
        blockitView.setTemplateId(str);
        blockitView.mo99221a(itemInfo, true);
        blockitView.mo99219a(this.f70152a.mo100601g().getLifecycle());
        blockitView.setMenuListener(new AbstractC27836c(itemInfo, aVar, blockitView) {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a.$$Lambda$a$0rABQLvMdsezty545kIW2wDUOw */
            public final /* synthetic */ ItemInfo f$1;
            public final /* synthetic */ C28118a f$2;
            public final /* synthetic */ BlockitView f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.appcenter.business.tab.business.blockit.AbstractC27836c
            public final void open() {
                C28044a.m270221lambda$0rABQLvMdsezty545kIW2wDUOw(C28044a.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    @Override // com.ss.android.appcenter.engine.C28249h
    /* renamed from: a */
    public void onBindViewHolder(C28118a aVar, int i) {
        ItemInfo itemInfo = (ItemInfo) C28182f.m103235a(this.f70156f, i, null);
        if (itemInfo == null) {
            C28184h.m103248b("BlockListSubAdapter", String.format("bind widget. get(%s) itemInfo is null.", String.valueOf(i)));
        } else if (itemInfo.getBlock() != null) {
            m102513a(itemInfo, aVar);
            C28184h.m103250d("BlockListSubAdapter", "onBindViewHolder>>> bindBlockit end.");
        } else {
            C28184h.m103248b("BlockListSubAdapter", "onBindViewHolder>>> bindBlockit error.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102514a(ItemInfo itemInfo, C28118a aVar, BlockitView blockitView) {
        m102512a(itemInfo, (RecyclerView.ViewHolder) aVar, blockitView);
    }

    /* renamed from: a */
    private void m102512a(ItemInfo itemInfo, RecyclerView.ViewHolder viewHolder, BlockitView blockitView) {
        C27907c.m101864a(this.f70152a.mo100603i(), viewHolder);
        C27907c.m101868a(this.f70152a.mo100604j(), false);
        C27907c.m101865a(blockitView, this.f70152a.mo100602h(), itemInfo, m102515a(itemInfo.getItemId()), m102516b(itemInfo.getItemId()), this.f70152a.mo100603i().getHeight(), new C27909d.AbstractC27912a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a.$$Lambda$a$pYAkGruACnyUPYxKzEscWhM54Aw */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27909d.AbstractC27912a
            public final void onDismiss() {
                C28044a.lambda$pYAkGruACnyUPYxKzEscWhM54Aw(C28044a.this);
            }
        }, new C27924d.C27928b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a.C28044a.C280451 */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.C27928b, com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.AbstractC27927a
            /* renamed from: c */
            public void mo99557c() {
                if (C28044a.this.f70152a.mo100598d() != null) {
                    C28044a.this.f70152a.mo100598d().mo99982a();
                }
            }
        });
    }

    public C28044a(Context context, AbstractC28280c cVar, AbstractC28246e eVar, NodeParams nodeParams) {
        super(context, cVar, 0);
        this.f70152a = eVar;
        this.f70155e = f70151d + "-";
        f70151d = f70151d + 1;
        this.f70157g = C28040e.m102497d(nodeParams);
        this.f70158h = C28037d.m102482k(nodeParams);
    }
}
