package com.bytedance.ee.bear.more.view2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IMoreHost;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\u00020\u00102\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u001e\u0010\u0018\u001a\u00020\u00102\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bJ\u0006\u0010\u0019\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/MoreAdapterOuter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/more/view2/MoreAdapterOuter$ViewHolderOuter;", "host", "Lcom/bytedance/ee/bear/more/moreprotocol/IMoreHost;", "(Lcom/bytedance/ee/bear/more/moreprotocol/IMoreHost;)V", "getHost", "()Lcom/bytedance/ee/bear/more/moreprotocol/IMoreHost;", "originGroupList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/more/moreprotocol/MoreItemGroup;", "Lkotlin/collections/ArrayList;", "visibleGroupList", "getItemCount", "", "notifyItemRelease", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setGroups", "updateGroups", "ViewHolderOuter", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b */
public final class MoreAdapterOuter extends RecyclerView.Adapter<ViewHolderOuter> {

    /* renamed from: a */
    private ArrayList<MoreItemGroup> f27690a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<MoreItemGroup> f27691b = new ArrayList<>();

    /* renamed from: c */
    private final IMoreHost f27692c;

    /* renamed from: c */
    public final IMoreHost mo39215c() {
        return this.f27692c;
    }

    /* renamed from: a */
    public final void mo39211a() {
        mo39213a(this.f27691b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27690a.size();
    }

    /* renamed from: b */
    public final void mo39214b() {
        C13479a.m54764b("MoreAdapterOuter", "notifyItemRelease()...");
        Iterator<MoreItemGroup> it = this.f27690a.iterator();
        while (it.hasNext()) {
            Iterator<IBaseMoreItem> it2 = it.next().mo39173c().iterator();
            while (it2.hasNext()) {
                it2.next().onRelease();
            }
        }
    }

    public MoreAdapterOuter(IMoreHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        this.f27692c = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/MoreAdapterOuter$ViewHolderOuter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/more/view2/MoreAdapterOuter;Landroid/view/View;)V", "onBindViewHolder", "", "group", "Lcom/bytedance/ee/bear/more/moreprotocol/MoreItemGroup;", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.b$a */
    public final class ViewHolderOuter extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ MoreAdapterOuter f27693a;

        /* renamed from: a */
        public final void mo39216a(MoreItemGroup cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "group");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "itemView.recycler");
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(view2.getContext()));
            MoreAdapterInner aVar = new MoreAdapterInner(this.f27693a.mo39215c());
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            RecyclerView recyclerView2 = (RecyclerView) view3.findViewById(R.id.recycler);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "itemView.recycler");
            recyclerView2.setAdapter(aVar);
            aVar.mo39197a(cVar);
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            RecyclerView recyclerView3 = (RecyclerView) view4.findViewById(R.id.recycler);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "itemView.recycler");
            int i = 0;
            recyclerView3.setNestedScrollingEnabled(false);
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            View findViewById = view5.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.divider");
            if (!cVar.mo39174d()) {
                i = 8;
            }
            findViewById.setVisibility(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolderOuter(MoreAdapterOuter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f27693a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo39213a(ArrayList<MoreItemGroup> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "originGroupList");
        this.f27691b = arrayList;
        this.f27690a.clear();
        Iterator<MoreItemGroup> it = arrayList.iterator();
        while (it.hasNext()) {
            MoreItemGroup next = it.next();
            MoreItemGroup a = new MoreItemGroup().mo39169a(next.mo39172b());
            Iterator<IBaseMoreItem> it2 = next.mo39173c().iterator();
            while (it2.hasNext()) {
                IBaseMoreItem next2 = it2.next();
                next2.setHost(this.f27692c);
                if (next2.isVisible()) {
                    a.mo39170a(next2);
                }
            }
            if (!a.mo39173c().isEmpty()) {
                this.f27690a.add(a);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public ViewHolderOuter onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.more_item_group, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolderOuter(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolderOuter aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        MoreItemGroup cVar = this.f27690a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(cVar, "visibleGroupList[position]");
        aVar.mo39216a(cVar);
    }
}
