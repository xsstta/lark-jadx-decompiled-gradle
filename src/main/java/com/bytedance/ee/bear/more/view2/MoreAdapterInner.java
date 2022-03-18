package com.bytedance.ee.bear.more.view2;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ICustomMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IMoreHost;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder;
import com.bytedance.ee.bear.more.view2.viewbinder.custom.CustomViewBinder;
import com.bytedance.ee.bear.more.view2.viewbinder.grid.GridViewBinder;
import com.bytedance.ee.bear.more.view2.viewbinder.vertical.VerticalViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u001e\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/MoreAdapterInner;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/BaseMoreItemViewHolder;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "host", "Lcom/bytedance/ee/bear/more/moreprotocol/IMoreHost;", "(Lcom/bytedance/ee/bear/more/moreprotocol/IMoreHost;)V", "count", "", "getHost", "()Lcom/bytedance/ee/bear/more/moreprotocol/IMoreHost;", "moreItemGroup", "Lcom/bytedance/ee/bear/more/moreprotocol/MoreItemGroup;", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setGroup", "Companion", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.a */
public final class MoreAdapterInner extends RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>> {

    /* renamed from: a */
    public static final Companion f27673a = new Companion(null);

    /* renamed from: b */
    private MoreItemGroup f27674b = new MoreItemGroup();

    /* renamed from: c */
    private int f27675c;

    /* renamed from: d */
    private final IMoreHost f27676d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/MoreAdapterInner$Companion;", "", "()V", "ITEM_TYPE_CUSTOM", "", "ITEM_TYPE_GRID", "ITEM_TYPE_VERTICAL", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27675c;
    }

    public MoreAdapterInner(IMoreHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        this.f27676d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IBaseMoreItem iBaseMoreItem = this.f27674b.mo39173c().get(i);
        if (iBaseMoreItem instanceof IGridMoreItem) {
            return 1;
        }
        if (iBaseMoreItem instanceof ICustomMoreItem) {
            return 3;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo39197a(MoreItemGroup cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "moreItemGroup");
        this.f27674b = cVar;
        if (cVar.mo39172b() == 1) {
            this.f27675c = 1;
            notifyDataSetChanged();
            return;
        }
        ArrayList<IBaseMoreItem> c = cVar.mo39173c();
        boolean z = false;
        this.f27675c = 0;
        Iterator<IBaseMoreItem> it = c.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            IBaseMoreItem next = it.next();
            if (z && z2) {
                break;
            } else if (next instanceof IGridMoreItem) {
                z = true;
            } else {
                z2 = true;
            }
        }
        if (z) {
            this.f27675c++;
        }
        if (z2) {
            this.f27675c++;
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void onBindViewHolder(BaseMoreItemViewHolder<IBaseMoreItem> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        IBaseMoreItem iBaseMoreItem = this.f27674b.mo39173c().get(i);
        Intrinsics.checkExpressionValueIsNotNull(iBaseMoreItem, "moreItemGroup.getMoreItemList()[position]");
        aVar.mo39217a(this, iBaseMoreItem, i);
    }

    /* renamed from: a */
    public BaseMoreItemViewHolder<IBaseMoreItem> onCreateViewHolder(ViewGroup viewGroup, int i) {
        GridViewBinder.GridMoreItemViewHolder aVar;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == 3) {
            IBaseMoreItem iBaseMoreItem = this.f27674b.mo39173c().get(0);
            if (iBaseMoreItem != null) {
                CustomViewBinder.CustomViewHolder a = new CustomViewBinder((ICustomMoreItem) iBaseMoreItem).mo39219a(viewGroup);
                if (a != null) {
                    return a;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder<com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem>");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.more.moreprotocol.ICustomMoreItem");
        }
        if (i != 1) {
            aVar = new VerticalViewBinder(this.f27674b.mo39173c()).mo39241a(viewGroup);
        } else {
            aVar = new GridViewBinder(this.f27674b.mo39173c()).mo39230a(viewGroup);
        }
        if (aVar != null) {
            return (BaseMoreItemViewHolder) aVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder<com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem>");
    }
}
