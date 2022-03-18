package com.ss.android.lark.todo.impl.features.detail.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,-B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0012\u0010\u000e\u001a\u00020\u00002\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0012\u0010#\u001a\u00020\u00002\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0007H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010\f\u001a\u00020\u0011H\u0002J\u0014\u0010+\u001a\u00020\u00162\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002R\u0018\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/widget/FlatItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/todo/impl/features/detail/widget/FlatItemsAdapter$WrapHolder;", "()V", "adapterList", "Ljava/util/LinkedList;", "computeItemOffset", "", "targetAdapter", "getItemCount", "getItemId", "", "position", "getItemViewType", "insertHead", "adapter", "mapPositionToRealPosition", "", "maskOriginType", "adapterPos", ShareHitPoint.f121869d, "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDetachedFromRecyclerView", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "pushBack", "registerAdapterDataObserver", "observer", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "unmaskOriginType", "maskType", "validPosition", "", "wrapAndSetDataObserver", "Companion", "WrapHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.widget.a */
public final class FlatItemsAdapter extends RecyclerView.Adapter<WrapHolder> {

    /* renamed from: a */
    public static final Companion f140209a = new Companion(null);

    /* renamed from: b */
    private final LinkedList<RecyclerView.Adapter<?>> f140210b = new LinkedList<>();

    /* renamed from: a */
    private final int m220675a(int i, int i2) {
        return i << (i2 + 28);
    }

    /* renamed from: a */
    private final int[] m220677a(int i) {
        return new int[]{(i & ((int) 4026531840L)) >>> 28, i & ((int) -4026531841L)};
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/widget/FlatItemsAdapter$Companion;", "", "()V", "MASK_TYPE_OFFSET", "", "TYPE_INVALID", "TYPE_MASK", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.widget.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/widget/FlatItemsAdapter$WrapHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "containerHolder", "originAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "getContainerHolder", "()Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getOriginAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "onViewAttachedToWindow", "", "onViewDetachedFromWindow", "onViewRecycled", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.widget.a$b */
    public static final class WrapHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final RecyclerView.ViewHolder f140211a;

        /* renamed from: b */
        private final RecyclerView.Adapter<RecyclerView.ViewHolder> f140212b;

        /* renamed from: d */
        public final RecyclerView.ViewHolder mo193093d() {
            return this.f140211a;
        }

        /* renamed from: e */
        public final RecyclerView.Adapter<RecyclerView.ViewHolder> mo193094e() {
            return this.f140212b;
        }

        /* renamed from: a */
        public final void mo193090a() {
            this.f140212b.onViewDetachedFromWindow(this.f140211a);
        }

        /* renamed from: b */
        public final void mo193091b() {
            this.f140212b.onViewAttachedToWindow(this.f140211a);
        }

        /* renamed from: c */
        public final void mo193092c() {
            this.f140212b.onViewRecycled(this.f140211a);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WrapHolder(RecyclerView.ViewHolder viewHolder, RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
            super(viewHolder.itemView);
            Intrinsics.checkParameterIsNotNull(viewHolder, "containerHolder");
            Intrinsics.checkParameterIsNotNull(adapter, "originAdapter");
            this.f140211a = viewHolder;
            this.f140212b = adapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/widget/FlatItemsAdapter$wrapAndSetDataObserver$observer$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "offset", "", "onChanged", "", "onItemRangeChanged", "positionStart", "itemCount", "payload", "", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.widget.a$c */
    public static final class C56792c extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ FlatItemsAdapter f140213a;

        /* renamed from: b */
        final /* synthetic */ FlatItemsAdapter f140214b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView.Adapter f140215c;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            this.f140214b.notifyDataSetChanged();
        }

        /* renamed from: a */
        private final int m220693a() {
            return this.f140213a.mo193087b(this.f140215c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            this.f140214b.notifyItemRangeChanged(i - m220693a(), i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            this.f140214b.notifyItemRangeInserted(i - m220693a(), i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            this.f140214b.notifyItemRangeRemoved(i + m220693a(), i2);
        }

        C56792c(FlatItemsAdapter aVar, FlatItemsAdapter aVar2, RecyclerView.Adapter adapter) {
            this.f140213a = aVar;
            this.f140214b = aVar2;
            this.f140215c = adapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            this.f140214b.notifyItemMoved(i - m220693a(), i2 - m220693a());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            this.f140214b.notifyItemRangeChanged(i - m220693a(), i2, obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        Iterator<T> it = this.f140210b.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getItemCount();
        }
        return i;
    }

    /* renamed from: a */
    private final boolean m220676a(int[] iArr) {
        if (iArr[0] == -1 || iArr[1] == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final void m220679c(RecyclerView.Adapter<?> adapter) {
        adapter.registerAdapterDataObserver(new C56792c(this, this, adapter));
    }

    /* renamed from: b */
    public void onViewAttachedToWindow(WrapHolder bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        super.onViewAttachedToWindow(bVar);
        bVar.mo193091b();
    }

    /* renamed from: c */
    private final boolean m220680c(int i) {
        return m220676a(m220678b(i));
    }

    /* renamed from: b */
    public final int mo193087b(RecyclerView.Adapter<?> adapter) {
        int indexOf = this.f140210b.indexOf(adapter);
        int i = 0;
        for (int i2 = 0; i2 < indexOf; i2++) {
            RecyclerView.Adapter<?> adapter2 = this.f140210b.get(i2);
            Intrinsics.checkExpressionValueIsNotNull(adapter2, "adapterList[i]");
            i += adapter2.getItemCount();
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        int[] b = m220678b(i);
        return this.f140210b.get(b[0]).getItemId(b[1]);
    }

    /* renamed from: c */
    public void onViewRecycled(WrapHolder bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        super.onViewRecycled(bVar);
        bVar.mo193092c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (!m220680c(i)) {
            return -1;
        }
        int[] b = m220678b(i);
        int i2 = b[0];
        return m220675a(i2, this.f140210b.get(i2).getItemViewType(b[1]));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Iterator<T> it = this.f140210b.iterator();
        while (it.hasNext()) {
            it.next().onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        Iterator<T> it = this.f140210b.iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromRecyclerView(recyclerView);
        }
    }

    /* renamed from: b */
    private final int[] m220678b(int i) {
        if (i >= getItemCount() || i < 0) {
            return new int[]{-1, -1};
        }
        Iterator<T> it = this.f140210b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int itemCount = it.next().getItemCount();
            if (itemCount > i) {
                return new int[]{i2, i};
            }
            i -= itemCount;
            i2++;
        }
        return new int[]{i2, i};
    }

    /* renamed from: a */
    public final FlatItemsAdapter mo193084a(RecyclerView.Adapter<?> adapter) {
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        FlatItemsAdapter aVar = this;
        aVar.f140210b.addLast(adapter);
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        Intrinsics.checkParameterIsNotNull(adapterDataObserver, "observer");
        boolean hasStableIds = hasStableIds();
        Iterator<T> it = this.f140210b.iterator();
        while (it.hasNext()) {
            hasStableIds |= it.next().hasStableIds();
        }
        setHasStableIds(hasStableIds);
        Iterator<T> it2 = this.f140210b.iterator();
        while (it2.hasNext()) {
            m220679c((RecyclerView.Adapter<?>) it2.next());
        }
        super.registerAdapterDataObserver(adapterDataObserver);
    }

    /* renamed from: a */
    public void onViewDetachedFromWindow(WrapHolder bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        super.onViewDetachedFromWindow(bVar);
        bVar.mo193090a();
    }

    /* renamed from: a */
    public WrapHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        int[] a = m220677a(i);
        RecyclerView.Adapter<?> adapter = this.f140210b.get(a[0]);
        Intrinsics.checkExpressionValueIsNotNull(adapter, "adapterList[arr[0]]");
        RecyclerView.Adapter<?> adapter2 = adapter;
        RecyclerView.ViewHolder onCreateViewHolder = adapter2.onCreateViewHolder(viewGroup, a[1]);
        Intrinsics.checkExpressionValueIsNotNull(onCreateViewHolder, "holder");
        if (adapter2 != null) {
            return new WrapHolder(onCreateViewHolder, adapter2);
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
    }

    /* renamed from: a */
    public void onBindViewHolder(WrapHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        bVar.mo193094e().onBindViewHolder(bVar.mo193093d(), m220678b(i)[1]);
    }
}
