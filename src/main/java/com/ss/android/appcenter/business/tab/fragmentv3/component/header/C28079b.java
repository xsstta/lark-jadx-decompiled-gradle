package com.ss.android.appcenter.business.tab.fragmentv3.component.header;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28037d;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.engine.C28249h;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.vlayout.AbstractC28280c;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.header.b */
public class C28079b extends C28249h {

    /* renamed from: a */
    private CommonHeader.C28077b f70293a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 201;
    }

    /* renamed from: e */
    private ViewGroup.LayoutParams m102640e() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.appcenter.engine.C28249h
    public int getItemCount() {
        return C28078a.m102636a(this.f70293a) ? 1 : 0;
    }

    /* renamed from: a */
    public void mo99953a(CommonHeader.C28076a aVar) {
        this.f70293a.f70291f = aVar;
    }

    @Override // com.ss.android.appcenter.engine.C28249h
    /* renamed from: a */
    public C28118a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C28184h.m103250d("HeaderSubAdapter", "onBindViewHolder>>> " + this.f70293a);
        CommonHeader commonHeader = new CommonHeader(viewGroup.getContext());
        commonHeader.setLayoutParams(m102640e());
        return new C28118a(commonHeader);
    }

    @Override // com.ss.android.appcenter.engine.C28249h
    /* renamed from: a */
    public void onBindViewHolder(C28118a aVar, int i) {
        super.onBindViewHolder(aVar, i);
        C28184h.m103250d("HeaderSubAdapter", "onBindViewHolder>>> " + this.f70293a);
        C28078a.m102635a((CommonHeader) aVar.itemView, this.f70293a);
    }

    public C28079b(Context context, AbstractC28280c cVar, NodeParams nodeParams, String str) {
        super(context, cVar, 1);
        this.f70293a = new CommonHeader.C28077b(C28037d.m102472a(nodeParams), C28037d.m102473b(nodeParams), C28037d.m102474c(nodeParams), false, C28037d.m102476e(nodeParams), str);
    }
}
