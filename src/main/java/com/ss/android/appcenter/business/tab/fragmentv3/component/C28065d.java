package com.ss.android.appcenter.business.tab.fragmentv3.component;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.engine.AbstractC28240b;
import com.ss.android.appcenter.engine.AbstractC28246e;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.p1299a.C28237a;
import com.ss.android.appcenter.engine.vlayout.AbstractC28280c;
import com.ss.android.appcenter.engine.vlayout.C28277b;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.d */
public class C28065d extends C28277b.AbstractC28278a<C28118a> {

    /* renamed from: a */
    private AbstractC28280c f70237a;

    /* renamed from: b */
    private NodeParams f70238b;

    /* renamed from: c */
    private AbstractC28246e f70239c;

    /* renamed from: a */
    public void onBindViewHolder(C28118a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.C28277b.AbstractC28278a
    /* renamed from: a */
    public AbstractC28280c mo99910a() {
        return this.f70237a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f70239c.mo100591a(this.f70238b.getKey());
    }

    /* renamed from: a */
    public C28118a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C28184h.m103250d("SingleComponentAdapter", "onCreateViewHolder>>> viewtype" + i);
        final AbstractC28240b a = this.f70239c.mo100597c().mo99876a(this.f70238b.getComponentName());
        final View a2 = a.mo99888a(viewGroup.getContext());
        a.mo99890a(a2, this.f70238b);
        this.f70239c.mo100598d().mo99988a(this.f70238b.getKey(), this.f70239c.mo100601g(), new AbstractC1178x<C28237a>() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.C28065d.C280661 */

            /* renamed from: a */
            public void onChanged(C28237a aVar) {
                C28184h.m103250d("SingleComponentAdapter", "onChanged:" + aVar);
                a.mo99889a(a2, aVar);
            }
        }, new C28237a());
        return new C28118a(a2);
    }

    public C28065d(AbstractC28246e eVar, NodeParams nodeParams, AbstractC28280c cVar) {
        this.f70239c = eVar;
        this.f70238b = nodeParams;
        this.f70237a = cVar;
    }
}
