package com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.JsonObject;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.templatedata.C27759b;
import com.ss.android.appcenter.business.tab.business.blockit.AbstractC27836c;
import com.ss.android.appcenter.business.tab.business.blockit.BlockitView;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27907c;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27909d;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27923c;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader;
import com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28037d;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28040e;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.p1299a.C28237a;
import com.ss.android.appcenter.engine.vlayout.AbstractC28280c;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.a.b */
public class C28046b extends C28080a<C27759b> {

    /* renamed from: a */
    public AbstractC28246e f70160a;

    /* renamed from: b */
    private int f70161b;

    /* renamed from: c */
    private CommonHeader.C28077b f70162c;

    /* renamed from: d */
    private ItemInfo f70163d;

    /* renamed from: e */
    private String f70164e;

    /* renamed from: f */
    private int f70165f;

    /* renamed from: g */
    private boolean f70166g;

    /* renamed from: h */
    private List<C27923c> f70167h;

    /* renamed from: i */
    private boolean f70168i;

    /* renamed from: j */
    private JsonObject f70169j;

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m102525e() {
        C27907c.m101868a(this.f70160a.mo100604j(), true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.appcenter.engine.C28249h, com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a
    public int getItemCount() {
        int i;
        int itemCount = super.getItemCount();
        if (this.f70163d != null) {
            i = 1;
        } else {
            i = 0;
        }
        return itemCount + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a
    public int getItemViewType(int i) {
        if (mo99970d(i)) {
            return LocationRequest.PRIORITY_INDOOR;
        }
        if (!TextUtils.isEmpty(this.f70164e)) {
            return this.f70160a.mo100591a(this.f70164e);
        }
        return 1;
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a
    /* renamed from: a */
    public void mo99884a(C28237a<C27759b> aVar) {
        C28184h.m103250d("BlockSubAdapter", "refresh>>> status:" + aVar.mo100620g());
        this.f70307o = aVar;
        if (aVar.mo100615b()) {
            this.f70163d = aVar.mo100619f().f69351a;
        } else {
            this.f70163d = null;
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private void m102522a(ItemInfo itemInfo, C28118a aVar) {
        String str;
        BlockitView blockitView = (BlockitView) aVar.mo100089a(R.id.blockit);
        CommonHeader commonHeader = (CommonHeader) aVar.mo100089a(R.id.blockit_template_header_outside);
        blockitView.setRoundCorner((float) this.f70165f);
        blockitView.setAutoMode(this.f70166g);
        blockitView.setForceUpdate(this.f70168i);
        blockitView.setTemplateConfig(this.f70169j);
        blockitView.setFragment(this.f70160a.mo100602h());
        if (this.f70160a.mo100599e() == null || this.f70160a.mo100599e().mo100005d() == null) {
            str = "";
        } else {
            str = this.f70160a.mo100599e().mo100005d().f69303a;
        }
        blockitView.setTemplateId(str);
        blockitView.mo99220a(itemInfo, this.f70161b, true, this.f70162c, commonHeader, this.f70167h);
        blockitView.mo99219a(this.f70160a.mo100601g().getLifecycle());
        blockitView.setMenuListener(new AbstractC27836c(itemInfo, aVar, blockitView) {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a.$$Lambda$b$tbGCItc7vKGH5HTkzCoQfTjVUXc */
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
                C28046b.lambda$tbGCItc7vKGH5HTkzCoQfTjVUXc(C28046b.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    @Override // com.ss.android.appcenter.engine.C28249h, com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a
    /* renamed from: a */
    public C28118a onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 300) {
            return mo99963a(viewGroup);
        }
        if (i == 1) {
            return new C28118a(new View(viewGroup.getContext()));
        }
        C28184h.m103250d("BlockSubAdapter", "onCreateViewHolder>>> viewtype:" + i);
        return new C28118a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workplace_block_layout, viewGroup, false));
    }

    @Override // com.ss.android.appcenter.engine.C28249h, com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a
    /* renamed from: a */
    public void onBindViewHolder(C28118a aVar, int i) {
        if (mo99970d(i)) {
            mo99964a(aVar);
            return;
        }
        ItemInfo itemInfo = this.f70163d;
        if (itemInfo == null) {
            C28184h.m103248b("BlockSubAdapter", String.format("bind widget. get(%s) itemInfo is null.", String.valueOf(i)));
        } else if (itemInfo.getBlock() != null) {
            m102522a(this.f70163d, aVar);
            C28184h.m103250d("BlockSubAdapter", "onBindViewHolder>>> bindBlockit end.");
        } else {
            C28184h.m103248b("BlockSubAdapter", "onBindViewHolder>>> bindBlockit error.");
        }
    }

    /* access modifiers changed from: public */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m102524b(ItemInfo itemInfo, C28118a aVar, BlockitView blockitView) {
        C27907c.m101864a(this.f70160a.mo100603i(), aVar);
        C27907c.m101868a(this.f70160a.mo100604j(), false);
        C27907c.m101865a(blockitView, this.f70160a.mo100602h(), itemInfo, false, false, this.f70160a.mo100603i().getHeight(), (C27909d.AbstractC27912a) new C27909d.AbstractC27912a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a.$$Lambda$b$Tr1eZqfl1nRtfB3_HUqi56lrkc */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1277a.C27909d.AbstractC27912a
            public final void onDismiss() {
                C28046b.m270222lambda$Tr1eZqfl1nRtfB3_HUqi56lrkc(C28046b.this);
            }
        }, (C27924d.AbstractC27927a) new C27924d.C27928b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.p1284a.C28046b.C280471 */

            @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.C27928b, com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.C27924d.AbstractC27927a
            /* renamed from: c */
            public void mo99557c() {
                if (C28046b.this.f70160a.mo100598d() != null) {
                    C28046b.this.f70160a.mo100598d().mo99982a();
                }
            }
        });
    }

    public C28046b(Context context, AbstractC28280c cVar, View.OnClickListener onClickListener, NodeParams nodeParams, AbstractC28246e eVar) {
        super(context, cVar, onClickListener);
        this.f70160a = eVar;
        this.f70309q = C28037d.m102475d(nodeParams);
        this.f70161b = C28040e.m102494a(nodeParams);
        this.f70162c = new CommonHeader.C28077b(C28037d.m102472a(nodeParams), C28037d.m102473b(nodeParams), C28037d.m102474c(nodeParams), this.f70309q, C28037d.m102476e(nodeParams), "block");
        if (!this.f70309q) {
            this.f70162c.f70291f = new CommonHeader.C28076a(C28209p.m103291a(16.0f), C28209p.m103291a(16.0f));
        }
        this.f70164e = nodeParams.getKey();
        int i = this.f70161b;
        if (i == -2) {
            this.f70166g = true;
            UserSP instance = UserSP.getInstance();
            int i2 = instance.getInt("block_auto_height_" + C28037d.m102477f(nodeParams));
            if (i2 > 0) {
                this.f70161b = i2;
                this.f70311s = i2;
            } else {
                this.f70161b = C28209p.m103291a(72.0f);
                this.f70311s = C28209p.m103291a(72.0f);
            }
        } else {
            this.f70311s = i;
        }
        this.f70314v = C28040e.m102497d(nodeParams);
        this.f70165f = C28040e.m102497d(nodeParams);
        this.f70167h = C28037d.m102493v(nodeParams);
        this.f70168i = C28037d.m102482k(nodeParams);
        this.f70169j = C28037d.m102485n(nodeParams);
    }
}
