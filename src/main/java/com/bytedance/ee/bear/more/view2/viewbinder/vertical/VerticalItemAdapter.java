package com.bytedance.ee.bear.more.view2.viewbinder.vertical;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IDeleteMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ISwitchMoreItem;
import com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder;
import com.bytedance.ee.bear.more.view2.viewbinder.delete.DeleteViewBinder;
import com.bytedance.ee.bear.more.view2.viewbinder.switch.SwitchViewBinder;
import com.bytedance.ee.bear.more.view2.viewbinder.text.TextViewBinder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u001e\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u001e\u0010\u0013\u001a\u00020\r2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/vertical/VerticalItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/BaseMoreItemViewHolder;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "()V", "moreItemList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMoreItems", "Companion", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b.f.a */
public final class VerticalItemAdapter extends RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>> {

    /* renamed from: a */
    public static final Companion f27725a = new Companion(null);

    /* renamed from: b */
    private ArrayList<IBaseMoreItem> f27726b = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/vertical/VerticalItemAdapter$Companion;", "", "()V", "ITEM_TYPE_DELETE", "", "ITEM_TYPE_SWITCH", "ITEM_TYPE_TEXT", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.b.f.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27726b.size();
    }

    /* renamed from: a */
    public final void mo39240a(ArrayList<IBaseMoreItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "moreItemList");
        this.f27726b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IBaseMoreItem iBaseMoreItem = this.f27726b.get(i);
        if (iBaseMoreItem instanceof ISwitchMoreItem) {
            return 3;
        }
        if (iBaseMoreItem instanceof IDeleteMoreItem) {
            return 4;
        }
        return 2;
    }

    /* renamed from: a */
    public void onBindViewHolder(BaseMoreItemViewHolder<IBaseMoreItem> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        IBaseMoreItem iBaseMoreItem = this.f27726b.get(i);
        Intrinsics.checkExpressionValueIsNotNull(iBaseMoreItem, "moreItemList[position]");
        aVar.mo39217a(this, iBaseMoreItem, i);
    }

    /* renamed from: a */
    public BaseMoreItemViewHolder<IBaseMoreItem> onCreateViewHolder(ViewGroup viewGroup, int i) {
        TextViewBinder.TextViewHolder aVar;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == 2) {
            aVar = new TextViewBinder().mo39235a(viewGroup);
        } else if (i == 3) {
            aVar = new SwitchViewBinder().mo39232a(viewGroup);
        } else if (i != 4) {
            aVar = new TextViewBinder().mo39235a(viewGroup);
        } else {
            aVar = new DeleteViewBinder().mo39221a(viewGroup);
        }
        if (aVar != null) {
            return (BaseMoreItemViewHolder) aVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder<com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem>");
    }
}
