package com.ss.android.lark.todo.impl.features.detail.at.view.adapter;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0002\u001f B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean;", "Lcom/larksuite/framework/ui/stickyheader/StickyRecyclerHeadersAdapter;", "mListener", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$OnItemSelectListener;", "(Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$OnItemSelectListener;)V", "binderProvider", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$BinderProvider;", "mLabelMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtLabelBean;", "Lkotlin/collections/HashMap;", "getHeaderId", "", "position", "getItemId", "getItemViewType", "initBinderMap", "", "initLabelData", "onBindHeaderViewHolder", "holder", "onBindViewHolder", "onCreateHeaderViewHolder", "parent", "Landroid/view/ViewGroup;", "onCreateViewHolder", "viewType", "BinderProvider", "OnItemSelectListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.e */
public final class AtSelectAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, AtBean> implements AbstractC26197e<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final HashMap<Integer, AtLabelBean> f139690a = new HashMap<>();

    /* renamed from: b */
    private final BinderProvider f139691b = new BinderProvider();

    /* renamed from: c */
    private final OnItemSelectListener f139692c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$OnItemSelectListener;", "", "onItemSelected", "", "bean", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtDataBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.e$b */
    public interface OnItemSelectListener {
        /* renamed from: a */
        void mo192268a(AtDataBean aVar);
    }

    /* renamed from: b */
    private final void m220096b() {
        this.f139691b.mo192298a(0, new AtLabelBinder(this.f139692c));
        this.f139691b.mo192298a(1, new AtDataBinder(this.f139692c));
    }

    /* renamed from: a */
    private final void m220095a() {
        this.f139690a.put(0, new AtLabelBean(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Mention), 0));
        this.f139690a.put(1, new AtLabelBean(ResUtil.f139261a.mo191781c(R.string.Todo_Task_ChatMembers), 1));
        this.f139690a.put(2, new AtLabelBean(ResUtil.f139261a.mo191781c(R.string.Todo_Task_ChatMembers), 2));
        this.f139690a.put(3, new AtLabelBean("", 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return Long.parseLong(((AtBean) getItem(i)).mo192272a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((AtBean) getItem(i)).mo192273b();
    }

    public AtSelectAdapter(OnItemSelectListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mListener");
        this.f139692c = bVar;
        m220096b();
        m220095a();
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public long mo93176a(int i) {
        IAtBinder a = this.f139691b.mo192297a(getItemViewType(i));
        Object item = getItem(i);
        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
        return a.mo192281a((AtBean) item);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n0\u0005\"\b\b\u0000\u0010\t*\u00020\u0006\"\b\b\u0001\u0010\n*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J6\u0010\r\u001a\u00020\u000e\"\b\b\u0000\u0010\t*\u00020\u0006\"\b\b\u0001\u0010\n*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n0\u0005R$\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\u0006\b\u0001\u0012\u00020\u00070\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtSelectAdapter$BinderProvider;", "", "()V", "map", "Landroid/util/SparseArray;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/IAtBinder;", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "get", "D", "VH", "key", "", "put", "", "value", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.view.adapter.e$a */
    public static final class BinderProvider {

        /* renamed from: a */
        private final SparseArray<IAtBinder<? extends AtBean, ? extends RecyclerView.ViewHolder>> f139693a = new SparseArray<>();

        /* renamed from: a */
        public final <D extends AtBean, VH extends RecyclerView.ViewHolder> IAtBinder<D, VH> mo192297a(int i) {
            Object obj = this.f139693a.get(i);
            if (!(obj instanceof IAtBinder)) {
                obj = null;
            }
            IAtBinder<D, VH> fVar = (IAtBinder) obj;
            if (fVar != null) {
                return fVar;
            }
            throw new IllegalArgumentException("No accessor found for " + i);
        }

        /* renamed from: a */
        public final <D extends AtBean, VH extends RecyclerView.ViewHolder> void mo192298a(int i, IAtBinder<D, VH> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "value");
            this.f139693a.put(i, fVar);
        }
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo93177a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return this.f139691b.mo192297a(0).mo192287b(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return this.f139691b.mo192297a(i).mo192287b(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        IAtBinder a = this.f139691b.mo192297a(getItemViewType(i));
        AtBean atBean = (AtBean) getItem(i);
        Intrinsics.checkExpressionValueIsNotNull(atBean, "item");
        a.mo192285a(viewHolder, atBean, i);
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public void mo93178a(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        int c = ((AtBean) getItem(i)).mo192274c();
        IAtBinder a = this.f139691b.mo192297a(0);
        AtLabelBean cVar = this.f139690a.get(Integer.valueOf(c));
        if (cVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(cVar, "it");
            a.mo192285a(viewHolder, cVar, i);
        }
    }
}
